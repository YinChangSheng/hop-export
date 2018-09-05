package com.ydonglai.hopexport.registry.webapi.sso;

import sun.misc.BASE64Encoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/8/28
 */
public class CertRSAUtil {

	private static final String ALGORITHM = "RSA";

	public static PublicKey generatePublicKey(byte[] keyData) {
		try {
			X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyData);
			KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
			return keyFactory.generatePublic(keySpec);
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 加密方法
	 * @param string
	 * @param publicKeyStr
	 * @return
	 * @throws Exception
	 */
	public static String encryptWithBase64(String string,String publicKeyStr) {
		byte[] binaryData = encrypt(generatePublicKey(Base64.base64ToByteArray(publicKeyStr)), string.getBytes());
		String base64String = new BASE64Encoder().encodeBuffer(binaryData) /* org.apache.commons.codec.binary.Base64.encodeBase64(binaryData) */;
		return base64String;
	}

	/**
	 * 加密过程
	 *
	 * @param publicKey     公钥
	 * @param plainTextData 明文数据
	 * @return
	 * @throws Exception 加密过程中的异常信息
	 */
	public static byte[] encrypt(PublicKey publicKey, byte[] plainTextData) {
		if (publicKey == null) {
			throw new IllegalArgumentException("加密公钥为空, 请设置");
		}
		try {
			Cipher cipher = Cipher.getInstance("RSA");//, new BouncyCastleProvider());
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			return cipher.doFinal(plainTextData);
		} catch (NoSuchAlgorithmException e) {
			throw new IllegalArgumentException("无此加密算法");
		} catch (NoSuchPaddingException e) {
			e.printStackTrace();
			return null;
		} catch (InvalidKeyException e) {
			throw new IllegalArgumentException("加密公钥非法,请检查");
		} catch (IllegalBlockSizeException e) {
			throw new IllegalArgumentException("明文长度非法");
		} catch (BadPaddingException e) {
			throw new IllegalArgumentException("明文数据已损坏");
		}
	}

}
