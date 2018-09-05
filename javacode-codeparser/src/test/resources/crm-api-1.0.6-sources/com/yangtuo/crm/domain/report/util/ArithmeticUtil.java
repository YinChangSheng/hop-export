package com.yangtuo.crm.domain.report.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Objects;

/**
 * 由于Java的简单类型不能够精确的对浮点数进行运算，这个工具类提供精
 * 确的浮点数运算，包括加减乘除和四舍五入。
 * Created by jlf on 16/7/14.
 */
public class ArithmeticUtil {

    //默认除法运算精度
    public static final int DEF_DIV_SCALE = 10;

    public static final int SECOND_OF_ONE_DAY = 86400;

    //这个类不能实例化
    private ArithmeticUtil() {
    }

    /**
     * 提供精确的加法运算。
     * 0+0 = 0
     * 0.222222222+0.22222222222222222222 = 0.4444444442222222
     *
     * @param v1 被加数
     * @param v2 加数
     * @return 两个参数的和
     */
    public static double add(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2).doubleValue();
    }

    /**
     * 提供精确的减法运算。
     * 0-0 = 0
     * 0.22222222222222222222 - 0.222222222= 2.222222E-10
     *
     * @param v1 被减数
     * @param v2 减数
     * @return 两个参数的差
     */
    public static double sub(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.subtract(b2).doubleValue();
    }

    /**
     * 提供精确的乘法运算。
     * 0+0 = 0
     * 0.22222222222222222222 * 0.222222222 = 0.04938271599999999
     *
     * @param v1 被乘数
     * @param v2 乘数
     * @return 两个参数的积
     */
    public static double mul(double v1, double v2) {
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.multiply(b2).doubleValue();
    }

    /**
     * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到
     * 小数点以后10位，以后的数字四舍五入。
     * 0/1 = 0
     * 0.22222222222222222222 / 0.222222222 = 1.000000001
     * v2 不能为0
     *
     * @param v1 被除数
     * @param v2 除数
     * @return 两个参数的商
     */
    public static double div(double v1, double v2) {
        return div(v1, v2, DEF_DIV_SCALE);
    }

    /**
     * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指
     * 定精度，以后的数字四舍五入。
     * 3.43439809480994024343094 / 0.222222222d 2位  = 15.45
     * 3.43439809480994024343094 / 0.222222222d 4位  = 15.4548
     * 0.22222222222222222222 / 0.222222222 4位 = 1
     *
     * @param v1    被除数
     * @param v2    除数
     * @param scale 表示表示需要精确到小数点以后几位。
     * @return 两个参数的商
     */
    public static double div(double v1, double v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(Double.toString(v1));
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /**
     * 提供精确的小数位四舍五入处理。
     * 3.43439809480994024343094 0位 = 3
     * 3.43439809480994024343094 4位 = 3.4344
     * 0 4位 = 0
     *
     * @param v     需要四舍五入的数字
     * @param scale 小数点后保留几位
     * @return 四舍五入后的结果
     */
    public static double round(double v, int scale) {

        if (scale < 0) {
            throw new IllegalArgumentException("The scale must be a positive integer or zero");
        }
        try {
            BigDecimal b = new BigDecimal(Double.toString(v));
            BigDecimal one = new BigDecimal("1");
            return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
        }catch (Exception e){
            throw e;
        }

    }

    /**
     * 若为空,直接返回空
     * 处理单位为元的金额,保留2位小数,四舍五入
     * 3.43539809480994024343094d = 3.44
     * 0 = 0.00
     *
     * @param price
     * @return
     */
    public static String getMoney(Double price) {
        if (null == price) {
            return null;
        }
        return String.format("%.2f", round(price, 2));
    }

    /**
     * 若为空,直接返回空
     * 处理单位为元的金额,保留0位小数,四舍五入,从个位数计每过3位加','
     * 3.43539809480994024343094d = 3
     * 0 = 0
     * 5000 = 5,000
     * 11111111111 = 11,111,111,111
     * 11111111111.66 = 11,111,111,112
     *
     * @param price
     * @return
     */
    public static String getMoneyByAccountPattern(Double price) {
        if (null == price) {
            return null;
        }
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(round(price, 0));
    }

    /**
     * 若为空,直接返回空
     * 转换为百分比,直接在后面加%
     *
     * @param price
     * @return
     */
    public static String getPercent(Integer price) {
        if (null == price) {
            return null;
        }
        return price + "%";
    }

    /**
     * 获取比例
     *
     * @param c 分子
     * @param m 分母
     * @return
     */
    public static String getPercent(Integer c, Integer m) {
        if(null == c || null == m){
            return "";
        }
        if(0 == m){
            return "";
        }
        if (c == 0) {
            return "0.00%";
        }
        double d = BigDecimal.valueOf(c).doubleValue() / BigDecimal.valueOf(m).doubleValue();
        return getPercent(d);
    }

    /**
     * 获取比例
     *
     * @param c 分子
     * @param m 分母
     * @return
     */
    public static String getPercent(Long c, Long m) {
        if(null == c || null == m){
            return "";
        }
        if(0L == m){
            return "";
        }
        if (c == 0L) {
            return "0.00%";
        }
        double d = BigDecimal.valueOf(c).doubleValue() / BigDecimal.valueOf(m).doubleValue();
        return getPercent(d);
    }

    /**
     * 获取比例
     *
     * @param c 分子
     * @param m 分母
     * @return
     */
    public static String getPercent(Double c, Double m) {
        if(null == c || null == m){
            return "";
        }
        if(0d == m){
            return "";
        }
        if (c == 0) {
            return "0.00%";
        }
        double d = BigDecimal.valueOf(c).doubleValue() / BigDecimal.valueOf(m).doubleValue();
        return getPercent(d);
    }

    /**
     * null->0
     * 0->0
     * 1->1
     * @param price
     * @return
     */
    public static double getPrice(Double price){
        if(null == price){
            return 0d;
        }
        return price.doubleValue();
    }


    /**
     * 若为空,直接返回空
     * 将小数转换为百分比,会*100,然后保留两位小数并四舍五入
     * 3.43539809480994024343094 = 343.54%
     *
     * @param d
     * @return
     */
    public static String getPercent(Double d) {
        if (null == d || Double.isNaN(d)) {
            return "0%";
        }
        return String.format("%.0f", round(d * 100, 0)) + "%";
    }

    /**
     * 单位是秒,转换为XX天XX小时,最小粒度为小时,四舍五入
     * 11323232323L = 131055天22小时
     * 1100L = 0天0小时
     * 4100L = 0天1小时
     * 1800L = 0天0小时
     *
     * @param cost
     * @return
     */
    public static String getCost(Long cost) {
        if (null == cost) {
            return null;
        }
        long hours = cost / 3600;
        if (cost % 3600 >= 1800) {
            hours++;
        }
        long day = hours / 24;
        long hour = hours % 24;
        return day + "天" + hour + "小时";
    }

    /**
     * 入参单位是秒,转换为XX.xx,四舍五入,单位为天
     * 11323232323L = 131055.93
     * 10L = 0.0
     * 43200L = 0.5
     * 4100L = 0.05
     * 1800L = 0.02
     *
     * @param cost 单位是秒
     * @return 单位为天
     */
    public static Double getCostByDay(Long cost) {
        if (null == cost) {
            return null;
        }
        double day = Double.valueOf(cost) / SECOND_OF_ONE_DAY;

        return round(day, 2);
    }

    /**
     * 判断数字是否为负
     *
     * @param
     * @return
     */
    public static boolean isNegative(Long d) {
        if (null == d) {
            return false;
        }
        return BigDecimal.valueOf(d).compareTo(BigDecimal.ZERO) < 0;
    }

    /**
     * Long型加法
     */
    public static Long add(Long... values){
       Long result  = 0L;
       for(int i = 0; i <  values.length; i++){
          if(Objects.nonNull(values[i])){
              result += values[i];
          }
       }
       return result;

    }

}
