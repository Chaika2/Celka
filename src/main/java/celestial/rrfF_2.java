/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfF_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    public static Object[] id_class;
    private static String[] id_throws;

    private static void id_byte() {
        id_break = new short[2];
    }

    static {
        rrfF_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF96E543009BEF759L;
    }

    public String id_class(String string, String string2) {
        try {
            this.id_break(string2);
            Cipher cipher = Cipher.getInstance(id_throws[2]);
            cipher.init(id_byte[0], (SecretKeySpec)id_class[id_break[1]]);
            return Base64.getEncoder().encodeToString(cipher.doFinal(string.getBytes(StandardCharsets.UTF_8)));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD535D581;
    }

    private static void id_class() {
        id_throws = new String[]{new String("SHA-1"), new String("AES"), new String("AES"), new String("AES")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{106, 86, -109, 96, -56, 99, 74, 7}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new boolean[]{true, true};
    }

    public void id_break(String string) {
        try {
            byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
            MessageDigest messageDigest = MessageDigest.getInstance(id_throws[0]);
            byArray = messageDigest.digest(byArray);
            byArray = Arrays.copyOf(byArray, (int)id_protected[0]);
            SecretKeySpec secretKeySpec = new SecretKeySpec(byArray, id_throws[1]);
            rrfF_2.id_class[rrfF_2.id_break[0]] = secretKeySpec;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            // empty catch block
        }
    }

    private static void id_throws() {
        Object[] objectArray = new Object[2];
        objectArray[1] = id_throws[3];
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfF_2.id_break();
        rrfF_2.id_class();
        rrfF_2.id_byte();
        rrfF_2.id_protected();
        rrfF_2.id_throws();
    }

    private static void id_protected() {
        id_protected = new byte[]{16, 2};
    }
}

