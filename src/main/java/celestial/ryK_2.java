/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ryo_3;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class ryK_2 {
    private static byte[] id_class(int n, Key key, byte[] byArray) throws ryo_3 {
        try {
            return ryK_2.id_class(n, key.getAlgorithm(), key).doFinal(byArray);
        }
        catch (Exception exception) {
            throw new ryo_3(exception);
        }
    }

    public static byte[] id_class(Key key, byte[] byArray) throws ryo_3 {
        return ryK_2.id_class(1, key, byArray);
    }

    public static SecretKey id_class(PrivateKey privateKey, byte[] byArray) throws ryo_3 {
        byte[] byArray2 = ryK_2.id_break(privateKey, byArray);
        try {
            return new SecretKeySpec(byArray2, "AES");
        }
        catch (Exception exception) {
            throw new ryo_3(exception);
        }
    }

    private static Cipher id_class(int n, String string, Key key) throws Exception {
        Cipher cipher = Cipher.getInstance(string);
        cipher.init(n, key);
        return cipher;
    }

    public static Cipher id_class(int n, Key key) throws ryo_3 {
        try {
            Cipher cipher = Cipher.getInstance("AES/CFB8/NoPadding");
            cipher.init(n, key, new IvParameterSpec(key.getEncoded()));
            return cipher;
        }
        catch (Exception exception) {
            throw new ryo_3(exception);
        }
    }

    public static SecretKey id_class() throws ryo_3 {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128);
            return keyGenerator.generateKey();
        }
        catch (Exception exception) {
            throw new ryo_3(exception);
        }
    }

    public static byte[] id_class(String string, PublicKey publicKey, SecretKey secretKey) throws ryo_3 {
        try {
            return ryK_2.id_class(string.getBytes("ISO_8859_1"), secretKey.getEncoded(), publicKey.getEncoded());
        }
        catch (Exception exception) {
            throw new ryo_3(exception);
        }
    }

    public static PublicKey id_class(byte[] byArray) throws ryo_3 {
        try {
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(byArray);
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            return keyFactory.generatePublic(x509EncodedKeySpec);
        }
        catch (Exception exception) {
            throw new ryo_3(exception);
        }
    }

    private static byte[] id_class(byte[] ... byArray) throws Exception {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        for (byte[] byArray2 : byArray) {
            messageDigest.update(byArray2);
        }
        return messageDigest.digest();
    }

    public static byte[] id_break(Key key, byte[] byArray) throws ryo_3 {
        return ryK_2.id_class(2, key, byArray);
    }

    public static KeyPair id_break() throws ryo_3 {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.generateKeyPair();
        }
        catch (Exception exception) {
            throw new ryo_3(exception);
        }
    }
}

