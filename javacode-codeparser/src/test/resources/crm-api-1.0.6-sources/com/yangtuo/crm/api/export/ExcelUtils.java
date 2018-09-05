package com.yangtuo.crm.api.export;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.ObjectMetadata;
import com.yangtuo.crm.domain.ResultData;
import com.yangtuo.crm.domain.export.result.AbstractResult;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author qiyu
 * @date 2018/5/16
 */
public class ExcelUtils {

    private static final Logger log = LoggerFactory.getLogger(ExcelUtils.class);

    public static <S> ResultData<String> export(S s, AbstractExportService exportService, OSSClient ossClient,
                                                String bucketName, String key) {
        return export("sheet1", s, exportService, ossClient, bucketName, key);
    }

    public static <S> ResultData<String> export(String sheetName, S s, AbstractExportService exportService,
                                                OSSClient ossClient, String bucketName, String key) {

        SXSSFWorkbook wb = new SXSSFWorkbook(100);
        Sheet sheet = wb.createSheet(sheetName);

        ResultData<List<ExcelData>> fieldResultData = excelData(exportService.getV());
        if (!fieldResultData.isSuccess()) {
            return new ResultData().setCode(ResultData.FAIL).setMessage(fieldResultData.getMessage());
        }
        List<ExcelData> list = fieldResultData.getDefaultModel();

        addTitle(sheet, list);

        ResultData addDataResult = addData(sheet, list, exportService, s);
        if (!addDataResult.isSuccess()) {
            return addDataResult;
        }

        return putToOSS(wb, ossClient, bucketName, key);
    }

    public static <V> ResultData<List<ExcelData>> excelData(Class<V> clazz) {
        List<ExcelData> list = new ArrayList<>();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            Annotation annotation = field.getAnnotation(Excel.class);
            if (annotation == null) {
                continue;
            }
            ExcelData data = new ExcelData();
            list.add(data);
            data.setTitle(((Excel) annotation).value());
            data.setFieldName(field.getName());
        }
        if (CollectionUtils.isEmpty(list)) {
            log.error("excel export title empty class;{}", clazz.getName());
            return new ResultData().setCode(ResultData.FAIL).setMessage("标题为空");
        }
        ResultData<List<ExcelData>> resultData = new ResultData<>();
        resultData.setCode(ResultData.SUCCESS_CODE).setDefaultModel(list);
        return resultData;
    }

    public static void addTitle(Sheet sheet, List<ExcelData> list) {
        Row titleRow = sheet.createRow(0);
        int i = 0;
        for (ExcelData excelData : list) {
            Cell cell = titleRow.createCell(i++);
            cell.setCellValue(excelData.getTitle());
        }
    }

    public static <S, V extends AbstractResult> ResultData addData(Sheet sheet, List<ExcelData> excelDataList,
                                                                   AbstractExportService<S, V> exportService, S s) {
        return exportService.handleAll(s, list -> {
            int lastRowNum = sheet.getLastRowNum() + 1;
            for (V v : list) {
                Row row = sheet.createRow(lastRowNum++);
                ExcelData excelData = null;
                try {
                    int size = excelDataList.size();
                    for (int i = 0; i < size; i++) {
                        excelData = excelDataList.get(i);
                        Field field = v.getClass().getDeclaredField(excelData.getFieldName());
                        field.setAccessible(true);
                        Cell cell = row.createCell(i);
                        Object object=field.get(v);
                        if (int.class.equals(field.getType()) || long.class.equals(field.getType())
                                || float.class.equals(field.getType()) || double.class.equals(field.getType())){
                            cell.setCellValue((double) object);
                        }else if (Integer.class.equals(field.getType())){
                            cell.setCellValue(object == null ? 0 : (Integer) object);
                        }else if (Long.class.equals(field.getType())){
                            cell.setCellValue(object == null ? 0 : (Long) object);
                        }else if (Float.class.equals(field.getType())){
                            cell.setCellValue(object == null ? 0 : (Float) object);
                        }else if (Double.class.equals(field.getType())){
                            cell.setCellValue(object == null ? 0 : (Double) object);
                        }else {
                            cell.setCellValue(object == null ? "" : String.valueOf(object));
                        }
                    }
                } catch (NoSuchFieldException e) {
                    log.error("excel export field error:", e);
                    return new ResultData().setCode(ResultData.FAIL).setMessage(
                            "no such field ");
                } catch (IllegalAccessException e) {
                    log.error("excel export class:{} illegal access", v.getClass().getName(), e);
                    return new ResultData().setCode(ResultData.FAIL).setMessage(
                            "illegal access " + v.getClass().getName());
                }
            }
            return new ResultData<>().setCode(ResultData.SUCCESS_CODE);
        });
    }

    public static ResultData<String> putToOSS(SXSSFWorkbook wb, OSSClient ossClient, String bucketName, String key) {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            wb.write(os);
            wb.dispose();
        } catch (IOException e) {
            log.error("excel export write error", e);
            return new ResultData().setCode(ResultData.FAIL).setMessage("excel error");
        }
        byte[] content = os.toByteArray();
        InputStream is = new ByteArrayInputStream(content);
        ObjectMetadata objectMetadata = new ObjectMetadata();
        objectMetadata.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        ossClient.putObject(bucketName, key, is, objectMetadata);
        return ResultData.writeForSuccess(null);
    }

}
