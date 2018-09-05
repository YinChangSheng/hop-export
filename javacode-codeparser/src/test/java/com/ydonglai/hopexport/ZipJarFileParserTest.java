package com.ydonglai.hopexport;

import com.ydonglai.hopexport.codeParser.JarFileParser;
import com.ydonglai.hopexport.util.FileUtils;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/13
 * 微信: yin80871901
 */
public class ZipJarFileParserTest {

	@Test
	public void parseTest() {
		JarFileParser parser = new ZipJarFileParser();
		String filePath = FileUtils.getFilePath("crm-api-1.0.6-sources.jar");
		parser.parse(new File(filePath));
	}

	@Test
	public void scanTest() throws IOException {
			JavaFileScanner scanner = new JavaFileScanner();
			URL path = Thread
					.currentThread()
					.getContextClassLoader()
					.getResource("crm-api-1.0.6-sources");
			List<String> files = scanner.scan(path.getPath());
		files.forEach(System.out::println);
	}

}
