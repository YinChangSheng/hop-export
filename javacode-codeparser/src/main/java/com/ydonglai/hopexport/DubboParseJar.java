package com.ydonglai.hopexport;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.NodeList;
import com.github.javaparser.ast.body.AnnotationDeclaration;
import com.github.javaparser.ast.body.AnnotationMemberDeclaration;
import com.github.javaparser.ast.body.ClassOrInterfaceDeclaration;
import com.github.javaparser.ast.body.MethodDeclaration;
import com.github.javaparser.ast.expr.AnnotationExpr;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.metamodel.PropertyMetaModel;
import com.github.javaparser.resolution.MethodUsage;
import com.github.javaparser.resolution.declarations.ResolvedMethodDeclaration;
import com.github.javaparser.resolution.declarations.ResolvedReferenceTypeDeclaration;
import com.github.javaparser.symbolsolver.javaparsermodel.JavaParserFacade;
import com.github.javaparser.symbolsolver.resolution.typesolvers.CombinedTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JarTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.JavaParserTypeSolver;
import com.github.javaparser.symbolsolver.resolution.typesolvers.ReflectionTypeSolver;
import org.zeroturnaround.zip.ZipUtil;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

/**
 * 作者: 账户组-东来
 * 邮箱: changsheng.yin@hipac.cn
 * 创建于: 2018/8/11
 * 微信: yin80871901
 */
public class DubboParseJar {

	static class MyVisitorAdapter extends VoidVisitorAdapter<JavaParserFacade> {

		@Override
		public void visit(AnnotationDeclaration anti, JavaParserFacade facade) {
			super.visit(anti, facade);
			anti.resolve().asReferenceType();
		}

		@Override
		public void visit(AnnotationMemberDeclaration antim, JavaParserFacade facade) {
			super.visit(antim, facade);
		}

		@Override
		public void visit(ClassOrInterfaceDeclaration classDec, JavaParserFacade parserFacade) {
			super.visit(classDec, parserFacade);
			if ( classDec.isInterface() ) {
				NodeList<AnnotationExpr> annotationExprs = classDec.getAnnotations();
				ResolvedReferenceTypeDeclaration referenceTypeDeclaration = parserFacade.getTypeDeclaration(classDec);
				// System.out.println(referenceTypeDeclaration.asReferenceType().getQualifiedName());
				System.out.println(referenceTypeDeclaration.getQualifiedName());
				for (AnnotationExpr annotationExpr : annotationExprs) {
//					annotationExpr.accept(new VoidVisitorAdapter<JavaParserFacade>() {
//						@Override
//						public void visit(AnnotationMemberDeclaration n, JavaParserFacade arg) {
//							super.visit(n, arg);
//							System.out.println(n.getName().asString() + ", defaultValue = " + n.getDefaultValue());
//						}
//					}, parserFacade);
					List<PropertyMetaModel> metaModels = annotationExpr.getMetaModel().getAllPropertyMetaModels();
					annotationExpr.getMetaModel().getConstructorParameters().forEach(s -> {
						System.out.println(s.getNodeReference());
					});
					// System.out.print(annotationExpr.getName() + " ");
					for (PropertyMetaModel meta : metaModels ) {
						// System.out.print(meta.getName() + " = " + meta.getValue(annotationExpr) + ", ");
					}
				}
				System.out.println();

				classDec.accept(new VoidVisitorAdapter<JavaParserFacade>() {
					@Override
					public void visit(MethodDeclaration n, JavaParserFacade arg) {
						super.visit(n, arg);
						NodeList<AnnotationExpr> annotationExprs1 = n.getAnnotations();
						for (AnnotationExpr annotationExpr : annotationExprs1) {
							List<PropertyMetaModel> metaModels = annotationExpr.getMetaModel().getAllPropertyMetaModels();
							System.out.print(annotationExpr.getName() + " ");
							for (PropertyMetaModel meta : metaModels ) {
								System.out.print(meta.getName() + " = " + meta.getValue(annotationExpr) + ", ");
							}
						}
						System.out.println();
					}
				}, parserFacade);

				Set<MethodUsage> methods2 = referenceTypeDeclaration.getAllMethods();
				for (MethodUsage method : methods2) {
					// method.getDeclaration()
					// System.out.println(method);
				}
				Set<ResolvedMethodDeclaration> methods = referenceTypeDeclaration.getDeclaredMethods();
				for ( ResolvedMethodDeclaration method : methods ) {
					// System.out.println(method.getQualifiedSignature());
//					List<ResolvedType> params = method.getParamTypes();
//					for ( ResolvedType param : params ) {
//						System.out.println(param.asReferenceType().describe());
//					}
					// System.out.println(method.getName() + "() : " + method.returnType().asReferenceType().describe());
					// System.out.println(method.returnType().asReferenceType().getQualifiedName());
				}
				System.out.println("===============");
			}
		}
	}

	public static void parse(File sourceDir, String file) throws IOException {

		CombinedTypeSolver typeSolver = new CombinedTypeSolver();
		typeSolver.add(new ReflectionTypeSolver());
		typeSolver.add(new JavaParserTypeSolver(sourceDir));
		typeSolver.add(new JarTypeSolver(Thread.currentThread().getContextClassLoader().getResourceAsStream("fastjson-1.2.31.jar")));

		JavaParserFacade parserFacade = JavaParserFacade.get(typeSolver);

		CompilationUnit cu = JavaParser.parse(new FileInputStream(new File(file)));

		try {
			cu.accept(new MyVisitorAdapter(), parserFacade);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		URL url = Thread
				.currentThread()
				.getContextClassLoader()
				.getResource("crm-api-1.1.3-SNAPSHOT-sources.jar");

		File file = new File(url.getFile());

		File sourceDir = new File(file.getParent() + "/crm-api-1.1.3-SNAPSHOT");

		ZipUtil.unpack(file, sourceDir); // 解压到指定目录

		try (Stream<Path> paths = Files.walk(sourceDir.toPath())) {
			paths
					.filter(Files::isRegularFile)
					.forEach(p -> {
							if (p.getFileName().toString().endsWith(".java")) {
								try {
									parse(sourceDir, p.toAbsolutePath().toString());
								} catch (FileNotFoundException e) {
									e.printStackTrace();
								} catch (IOException e) {
									e.printStackTrace();
								}
							}
					});
		}


	}

}
