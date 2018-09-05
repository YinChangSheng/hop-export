package com.ydonglai.hopexport.registry.webapi.hopapi;

import com.ydonglai.hopexport.registry.webapi.sso.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

/**
 * 封装RSA加解密的常用方法
 *
 * @author Seer
 * @version CertRSAUtil.java, v 0.1 2015年8月27日 下午3:42:34 Seer Exp.
 */
public class CertRSAUtil {
	private static final String ALGORITHM = "RSA";
	private static final Logger logger = LoggerFactory.getLogger("certRSAUtil");

	private static PublicKey generatePublicKey(byte[] keyData) {
		try {
			X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyData);
			KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
			return keyFactory.generatePublic(keySpec);
		} catch (InvalidKeySpecException e) {
			logger.error(e.getMessage(), e);
		} catch (NoSuchAlgorithmException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}


	private static PrivateKey generatePrivateKey(byte[] keyData) {
		try {
			PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyData);
			KeyFactory keyFactory = KeyFactory.getInstance(ALGORITHM);
			return keyFactory.generatePrivate(keySpec);
		} catch (InvalidKeySpecException e) {
			logger.error(e.getMessage(), e);
		} catch (NoSuchAlgorithmException e) {
			logger.error(e.getMessage(), e);
		}
		return null;
	}

	public static String decryptWithBase64(String base64String,String privateKey) throws Exception {
		PrivateKey privateKeyObj = generatePrivateKey(Base64.base64ToByteArray(privateKey));
		byte[] binaryData = decrypt(privateKeyObj, new BASE64Decoder().decodeBuffer(base64String) /*org.apache.commons.codec.binary.Base64.decodeBase64(base46String.getBytes())*/);
		String string = new String(binaryData);
		return string;
	}

	/**
	 * 加密方法
	 * @param string
	 * @param publicKeyStr
	 * @return
	 * @throws Exception
	 */
	public static String encryptWithBase64(String string,String publicKeyStr) throws Exception {
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
	private static byte[] encrypt(PublicKey publicKey, byte[] plainTextData) throws Exception {
		if (publicKey == null) {
			throw new Exception("加密公钥为空, 请设置");
		}
		Cipher cipher = null;
		try {
			cipher = Cipher.getInstance("RSA");//, new BouncyCastleProvider());
			cipher.init(Cipher.ENCRYPT_MODE, publicKey);
			byte[] output = cipher.doFinal(plainTextData);
			return output;
		} catch (NoSuchAlgorithmException e) {
			throw new Exception("无此加密算法");
		} catch (NoSuchPaddingException e) {
			logger.error(e.getMessage(), e);
			return null;
		} catch (InvalidKeyException e) {
			throw new Exception("加密公钥非法,请检查");
		} catch (IllegalBlockSizeException e) {
			throw new Exception("明文长度非法");
		} catch (BadPaddingException e) {
			throw new Exception("明文数据已损坏");
		}
	}

	/**
	 * 解密过程
	 *
	 * @param privateKey 私钥
	 * @param cipherData 密文数据
	 * @return 明文
	 * @throws Exception 解密过程中的异常信息
	 */
	private static byte[] decrypt(PrivateKey privateKey, byte[] cipherData) throws Exception {
		if (privateKey == null) {
			throw new Exception("解密私钥为空, 请设置");
		}
		Cipher cipher = null;
		try {
			cipher = Cipher.getInstance("RSA");//, new BouncyCastleProvider());
			cipher.init(Cipher.DECRYPT_MODE, privateKey);
			byte[] output = cipher.doFinal(cipherData);
			return output;
		} catch (NoSuchAlgorithmException e) {
			throw new Exception("无此解密算法");
		} catch (NoSuchPaddingException e) {
			logger.error(e.getMessage(), e);
			return null;
		} catch (InvalidKeyException e) {
			throw new Exception("解密私钥非法,请检查");
		} catch (IllegalBlockSizeException e) {
			throw new Exception("密文长度非法");
		} catch (BadPaddingException e) {
			throw new Exception("密文数据已损坏");
		}
	}

	public static void main(String[] args) throws Exception {
		String pass = "这是一段将要使用'.der'文件加密的字符串!";
		String skey= "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDvA8oLd2Vcta4BuoZTQr+AkipG" +
				"01hyDrgl1shzk0T0nV7Jy/LtaTnjid2tlSa2uHtC0ZSnqYwZIvYEWndIAx+kKElS" +
				"bhgGQI4/eDbLXtx6IZDaSCLuugPz2XPqivu2b4iY0o3hkBWPcMeywtkt1stPaqEm" +
				"N9RYxaekmCfiROI6CwIDAQAB";
		String enc = encryptWithBase64(pass,skey);
		System.out.println(enc);
		String pkey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAO8Dygt3ZVy1rgG6" +
				"hlNCv4CSKkbTWHIOuCXWyHOTRPSdXsnL8u1pOeOJ3a2VJra4e0LRlKepjBki9gRa" +
				"d0gDH6QoSVJuGAZAjj94Nste3HohkNpIIu66A/PZc+qK+7ZviJjSjeGQFY9wx7LC" +
				"2S3Wy09qoSY31FjFp6SYJ+JE4joLAgMBAAECgYB4KIyDdTO1BvUCk3YCF5VUmqa8" +
				"UnWtaW70PuUpDUlmPFMx2eE3r2XV2TJjmI8M3vPApMI6A8eVv3i0uZIr1r4pfPEL" +
				"DM22UOyzhkd0YzZt3s9it6nrG1AwKaI2ciU6Zz+Uqbnvi/QhYgGjM5/fOmdZnw39" +
				"voDsW7WFGXOUMzwlIQJBAP7Hi+tEJnA3foGeMTbjSk6sNjUU5Pvpbwq35P/WBEZI" +
				"0u3wheERBNVhjpn2Hlzn7tQlmIh0kRG8bmyB1S5ltPECQQDwKOjNLl8FLNSxC+eU" +
				"Xfi3end/S2ZkE9M3cNiDZy1904dxVV/NepbaAI3OnyS/lr+yqunbfMF1YucsLfO8" +
				"T+67AkEAh/K+bGlPAW37KPraU+lwSw6FVkmx7eGfiN6baRAv87kEJEbFiVTleV63" +
				"EtxLU1PHEpiFDbr1dbtQSMH2mO1YYQJAGfaCPHRP53JSSBWeYobKNaOyuXtARX9z" +
				"LSIw9fu4ikrM8K6nHcKr/kNjETxZL7EvZjRd9dGF5JfdoAQTvn7xswJAH4erInHd" +
				"AQjpK8dWbyt7yZBa9Qm3c+hiNMDOnmliqPz0jnrWdjAPxFcGatw37y3FKvF+8ZzP" +
				"00kIdVb2lPg8Ww==";
		try {
			String result = CertRSAUtil.decryptWithBase64(enc,pkey);
			//String result = decryptWithBase64(enc,pkey);
			System.out.println(result);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
	}
}
