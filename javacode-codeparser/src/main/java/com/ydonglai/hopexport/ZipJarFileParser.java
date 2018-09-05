package com.ydonglai.hopexport;

import com.ydonglai.hopexport.codeParser.JarFileParser;
import com.ydonglai.hopexport.codeParser.ParseException;
import com.ydonglai.hopexport.util.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.zeroturnaround.zip.ZipUtil;

import java.io.File;
import java.io.IOException;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/12
 * 微信: yin80871901
 */
public class ZipJarFileParser implements JarFileParser {

	private static final Logger log = LoggerFactory.getLogger(ZipJarFileParser.class);

	private String extraPath;

	public static final String exceptExtension = ".jar";

	public ZipJarFileParser() {
		this(System.getProperty("java.io.tmpdir"));
	}

	public ZipJarFileParser(String extraPath) {
		if ( ! extraPath.endsWith(File.separator) ) {
			throw new ParseException("path " + extraPath + ", extra path must end with " + File.separator);
		}
		this.extraPath = extraPath;
	}

	private boolean isZipFile(File zipFile) throws IOException {
		if ( ! zipFile.exists() ) {
			throw new ParseException(zipFile.getName() + " file not exists");
		}
		if ( ! zipFile.isFile() ) {
			throw new ParseException(zipFile.getName() + " is not a file");
		}
		try {
			new ZipFile(zipFile);
			return true;
		} catch (ZipException e) {
			// ZipException if a ZIP format error has occurred
			return false;
		}
	}

	/**
	 * 解压zip文件
	 * @param unpackFile 解压的文件
	 * @return 解压后的路径
	 */
	private String unpack(File unpackFile) {
		String ext = "." + FileUtils.getExtension(unpackFile.getName());
		if ( !exceptExtension.equals(ext) && log.isWarnEnabled() ) {
			log.warn("file extension except " + exceptExtension + " but get " + ext);
		}
		String destPath = extraPath + unpackFile.getName();
		ZipUtil.unpack(unpackFile, new File(destPath));
		return destPath;
	}

	@Override
	public void parse(File jarFile) throws ParseException {
		try {
			if ( !isZipFile(jarFile) ) {
				throw new ParseException("parse file format only support zip, but file " + jarFile.getPath() + " is not zip format.");
			}
		} catch (IOException e) {
			throw new ParseException("read " + jarFile.getName() + " failure!", e);
		}
		String destPath = unpack(jarFile);
		// scan java file
		// read interface and parse
	}

}
