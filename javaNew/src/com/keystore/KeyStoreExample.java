package com.keystore;

import java.io.FileInputStream;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;

public class KeyStoreExample {

	public static void main(String[] args) {

		 try {
	            String keystoreFile = "C:/Users/SSLTP11229/Desktop/uatssl.jks";
	            char[] keystorePassword = "abcd1234".toCharArray();
	            char[] keyPassword = "abcd1234".toCharArray();
	            String alias = "qlik";

	            FileInputStream fis = new FileInputStream(keystoreFile);
	            KeyStore keystore = KeyStore.getInstance("JKS");
	            keystore.load(fis, keystorePassword);

	            // Get the PrivateKey and Certificate using the alias and key password
	            PrivateKey privateKey = (PrivateKey) keystore.getKey(alias, keyPassword);
	            X509Certificate certificate = (X509Certificate) keystore.getCertificate(alias);

	            // Use the privateKey and certificate for cryptographic operations
	            // For example: SSLContext, Signing, etc.

	            fis.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 System.out.println("successfull");
	}

}
