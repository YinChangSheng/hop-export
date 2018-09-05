package com.ydonglai.hopexport;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/13
 * 微信: yin80871901
 */
public class JavaFileScanner implements CodeScanner {

	private <T> List<T> scanDir(String scanPath, String extWithDot, Function<Path, T> getProperty) throws IOException {
		File scanPath2 = new File(scanPath);
		try (Stream<Path> paths = Files.walk(scanPath2.toPath())) {
			return paths
					.filter(Files::isRegularFile)
					.filter(f -> f.getFileName().toString().endsWith(extWithDot))
					.map(getProperty)
					.collect(Collectors.toList());
		}
	}

	public List<String> scan(String scanPath) throws IOException {
		return scanDir(scanPath, ".java", p -> p.toAbsolutePath().toString());
	}

}
