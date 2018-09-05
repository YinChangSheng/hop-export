package com.ydonglai.hopexport;

import org.eclipse.jgit.api.*;
import org.eclipse.jgit.api.errors.GitAPIException;
import org.eclipse.jgit.dircache.DirCache;
import org.eclipse.jgit.lib.ObjectId;
import org.eclipse.jgit.lib.Ref;
import org.eclipse.jgit.lib.Repository;
import org.eclipse.jgit.revwalk.RevCommit;
import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
import org.eclipse.jgit.transport.RemoteConfig;
import org.eclipse.jgit.transport.URIish;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Hello world!
 */
public class App {

	public static void main(String[] args) throws IOException, GitAPIException, URISyntaxException {

		FileRepositoryBuilder builder = new FileRepositoryBuilder();

		Repository repository = builder
				.setGitDir(new File("/Users/yinchangsheng/jwork/hopexport/.git"))
				.build();

		Git git = new Git(repository);

		AddCommand command = git.add();

		DirCache dirCache = command.addFilepattern(".").call();

		CommitCommand commit = git.commit();

		RevCommit thatCommit = commit
				.setAuthor("donglai", "changsheng.yin@hipac.cn")
				.setMessage("初始化仓库")
				.call();

		URIish urIish = new URIish("https://github.com/YinChangSheng/hop-export.git");

		RemoteAddCommand remoteAdd = git.remoteAdd().setName("origin").setUri(urIish);

		RemoteConfig config = remoteAdd.call();

//		Iterable<RevCommit> log = git.log().call();
//
//		for (RevCommit commit : log) {
//			System.out.println(commit);
//		}

//		ListBranchCommand listBranch = git.branchList();
//
//		List<Ref> refList = listBranch
//				.setListMode(ListBranchCommand.ListMode.ALL)
//				.call();
//
//		for (Ref ref : refList) {
//			System.out.println(ref.getName());
//		}
//
//		CheckoutCommand checkout = git.checkout();
//
//		Ref ref = checkout.setName("refs/heads/dev-donglai").call();

	}
}
