package com.ydonglai.hopexport.registry.webapi.sso.impl;

import com.ydonglai.hopexport.registry.webapi.sso.CertRSAUtil;
import org.apache.commons.codec.binary.Hex;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;

/**
 * @author 账户组-东来
 * @mail changsheng.yin@hipac.cn
 * @createAt 2018/9/3
 */
public class SSOSignUtil {

	public static PublicKey makePublicKey(String modulus, String exponent) {
		try {
			RSAPublicKeySpec spec = new RSAPublicKeySpec(new BigInteger(modulus, 16), new BigInteger(exponent, 16));
			KeyFactory factory = KeyFactory.getInstance("RSA");
			return factory.generatePublic(spec);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (InvalidKeySpecException e) {
			e.printStackTrace();
			return null;
		}
		return null;
	}

	public static String encrypt(PublicKey publicKey, String data) {
			byte[] binaryData = CertRSAUtil.encrypt(publicKey, data.getBytes());
			return new String(Hex.encodeHex(binaryData));
	}

}
