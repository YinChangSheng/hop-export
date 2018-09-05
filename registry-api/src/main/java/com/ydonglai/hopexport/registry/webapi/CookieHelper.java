package com.ydonglai.hopexport.registry.webapi;

import lombok.extern.slf4j.Slf4j;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.BasicClientCookie;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
@Slf4j
public class CookieHelper {

	private String filePath;
	private String fileName;

	/**
	 * Constructs a new CookieHelper instance containing the specified path for<br>
	 * file where cookies will be stored permanently
	 *
	 * @param filePath
	 *            Container folder path
	 * @param fileName
	 *            Name of file where cookies will be save
	 */
	public CookieHelper(String filePath, String fileName) {
		this.filePath = filePath;
		this.fileName = fileName;
	}

	public void saveCookies(BasicCookieStore store) {
		List<Cookie> cookies = store.getCookies();
		if (!cookies.isEmpty() ) {
			for (Cookie c : cookies) {
				writeCookie(c);
			}
		} else {
			log.debug("No cookies");
		}
	}

	/**
	 * <h3>writeCookieTofile(Cookie cookie)</h3> Write cookie to specified file <br>
	 * You should already had to specify file and path in the constructor
	 *
	 * @param cookie
	 *            Cookie to store
	 */
	public void writeCookie(Cookie cookie) {
		/*
		 * All blank entries will be replaced with the * character. In addition,
		 * each line of the file is separated by the # character Optionally you
		 * can encrypt the cookie value to increase security
		 */
		if ( log.isDebugEnabled() ) {
			log.debug("write cookie to file....");
		}
		String SEPARATOR = "#";
		String name = cookie.getName();
		String value = "*";
		if (cookie.getValue() != null && !cookie.getValue().contentEquals(""))
			value = cookie.getValue();

		try {
		} catch (Exception e1) {
			e1.printStackTrace();
		}

		String domain = "*";
		if (cookie.getDomain() != null)
			domain = cookie.getDomain();
		String path = "*";
		if (cookie.getPath() != null)
			path = cookie.getPath();
		int version = cookie.getVersion();
		String ver = String.valueOf(version);
		String expired = "*";
		if (cookie.getExpiryDate() != null
				&& !cookie.getExpiryDate().toString().contentEquals(""))
			expired = cookie.getExpiryDate().toString();

		File dirPath = new File(filePath);
		File nameFile = new File(fileName);
		File file = new File(dirPath + File.separator + nameFile);
		try {

			BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
			writer.write(name);
			writer.write(SEPARATOR);
			writer.write(value);
			writer.write(SEPARATOR);
			writer.write(domain);
			writer.write(SEPARATOR);
			writer.write(path);
			writer.write(SEPARATOR);
			writer.write(ver);
			writer.write(SEPARATOR);
			if (expired != null)
				writer.write(expired);
			if (expired != null)
				writer.write(SEPARATOR);
			writer.newLine();
			writer.flush();
			writer.close();
			if ( log.isDebugEnabled() ) {
				log.debug("name:{}, value:{}, domain:{}, path:{}, version:{}, expired:{}", name, value, domain, path, version, expired);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * <h3>retrieveCookie(BasicCookieStore store)</h3> Retrieve all cookies from
	 * file and store those to specified cookiestore
	 *
	 * @param store
	 *            The cookiestore you want to fill with the cookies
	 */
	public void retrieveCookie(BasicCookieStore store) {
		if ( log.isDebugEnabled() ) {
			log.debug("Retrieving cookies.....");
		}
		int i = 0;
		String line;
		BasicClientCookie cookies;
		String name = null;
		String value = null;
		String domain = null;
		String path = null;
		String expired = null;
		String version = null;
		File dirPath = new File(filePath);
		File nameFile = new File(fileName);
		File file = new File(dirPath + File.separator + nameFile);

		try ( InputStreamReader inReader = new InputStreamReader(new FileInputStream(file)) ) {

			BufferedReader buffReader = new BufferedReader(inReader);

			while ((line = buffReader.readLine()) != null) {

				StringTokenizer tokens = new StringTokenizer(line, "#");

				i++;

				while (tokens.hasMoreTokens()) {
					switch (i = tokens.countTokens()) {
						case 6:
							name = tokens.nextToken();
							break;
						case 5:
							value = tokens.nextToken();
							break;
						case 4:
							domain = tokens.nextToken();
							break;
						case 3:
							path = tokens.nextToken();
							break;
						case 2:
							version = tokens.nextToken();
							break;
						case 1:
							expired = tokens.nextToken();
							break;
					}
				}

				cookies = new BasicClientCookie(Objects.requireNonNull(name), value);

				if (Objects.requireNonNull(value).contentEquals("*"))
					cookies.setValue(null);

				cookies.setDomain(domain);
				cookies.setPath(path);
				cookies.setVersion(Integer.valueOf(Objects.requireNonNull(version)));
				cookies.setExpiryDate(getDate(expired));
				if ( log.isDebugEnabled() ) {
					log.debug("name:{}, value:{}, domain:{}, path:{}, version:{}, expired:{}", name, value, domain, path, version, expired);
				}
				store.addCookie(cookies);
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public Date getDate(String date) {
		Date dateExpired = null;
		SimpleDateFormat DATE_FORMATTER = new SimpleDateFormat("EEE, dd-MMM-yyyy HH:mm:ss zzz", Locale.CHINA);
		try {
			if (!date.equals("*")) {
				dateExpired = DATE_FORMATTER.parse(date.replaceAll("\\p{Cntrl}", ""));
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return dateExpired;
	}

	public void deleteFile(){
		File dirPath = new File(filePath);
		File nameFile = new File(fileName);
		File file = new File(dirPath + File.separator + nameFile);
		if(file.exists()){
			file.delete();
		}
	}

}
