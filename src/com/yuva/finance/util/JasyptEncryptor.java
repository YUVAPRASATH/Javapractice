package com.yuva.finance.util;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.iv.RandomIvGenerator;

public class JasyptEncryptor {
    public static void main(String args[]){
        // Encryption
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword("secretkey"); // could be got from web, env variable...
        encryptor.setAlgorithm("PBEWithHMACSHA512AndAES_256");
        encryptor.setIvGenerator(new RandomIvGenerator());
        System.out.println(new RandomIvGenerator());
        String encryptedPassword = encryptor.encrypt("password");
        System.out.println("Encrypted Password:"+encryptedPassword);

        // Decryption
        String decryptedPassword = encryptor.decrypt(encryptedPassword);
        System.out.println("Decrypted Password:"+decryptedPassword);
    }
}
