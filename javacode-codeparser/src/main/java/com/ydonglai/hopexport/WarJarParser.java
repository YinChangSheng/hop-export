package com.ydonglai.hopexport;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.AnnotationDeclaration;
import com.github.javaparser.ast.body.AnnotationMemberDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.symbolsolver.javaparsermodel.JavaParserFacade;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JarTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;
import com.ydonglai.hopexport.util.FileUtils;
import org.zeroturnaround.zip.ZipUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/23
 */
public class WarJarParser {

	public static void main(String[] args) throws IOException {

		String path = FileUtils.getFilePath("crm-web.war");

		File file = new File(path);

		File sourceDir = new File(file.getParent() + "/crm-web-1.0.0");

		File aoSourceDir = new File(file.getParent() + "/crm-ao-1.0.0");

		ZipUtil.unpack(file, sourceDir); // 解压到指定目录

		CombinedTypeSolver typeSolver = new CombinedTypeSolver();
		typeSolver.add(new ReflectionTypeSolver());

		typeSolver.add(new JavaParserTypeSolver(sourceDir));

		try (Stream<Path> paths = Files.walk(sourceDir.toPath())) {
			paths
					.filter(Files::isRegularFile)
					.forEach(p -> {
						if (p.getFileName().toString().endsWith(".jar")) {
							if ( "crm-ao-1.0.0.jar".equals(p.getFileName().toString()) ) {
								ZipUtil.unpack(p.toFile(), aoSourceDir); // 解压到指定目录
								System.out.println(aoSourceDir);
								typeSolver.add(new JavaParserTypeSolver(aoSourceDir));
							} else {
								try {
									InputStream ins = new FileInputStream(p.toString());
									typeSolver.add(new JarTypeSolver(ins));
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
						}
					});
		}

		JavaParserFacade parserFacade = JavaParserFacade.get(typeSolver);

		try (Stream<Path> paths = Files.walk(aoSourceDir.toPath())) {
			paths
					.filter(Files::isRegularFile)
					.forEach(p -> {
						if (p.getFileName().toString().endsWith(".class")) {
							try {
								System.out.println("1111");
								parse(p.toAbsolutePath().toString(), parserFacade);
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
					});
		}

	}

	private static void parse(String file, JavaParserFacade parserFacade) throws IOException {
		CompilationUnit cu = JavaParser.parse(new FileInputStream(new File(file)));
		cu.accept(new MyVisitorAdapter(), parserFacade);
	}

	static class MyVisitorAdapter extends VoidVisitorAdapter<JavaParserFacade> {
		@Override
		public void visit(AnnotationDeclaration anti, JavaParserFacade arg) {
			super.visit(anti, arg);
			System.out.println(anti.resolve().getClassName());
		}

		@Override
		public void visit(AnnotationMemberDeclaration antim, JavaParserFacade arg) {
			super.visit(antim, arg);
			System.out.println("2222");
		}
	}

}
