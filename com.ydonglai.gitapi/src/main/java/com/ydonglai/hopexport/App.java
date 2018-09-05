package com.ydonglai.hopexport;

import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) throws IOException {

        FileRepositoryBuilder builder = new FileRepositoryBuilder();

        Repository repository = builder.setGitDir(new File("/Users/yinchangsheng/jwork/hopexport"))
            .readEnvironment() // scan environment GIT_* variables
            .findGitDir() // scan up the file system tree
            .build();

    }
}
