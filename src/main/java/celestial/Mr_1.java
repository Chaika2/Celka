/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Mr_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static double[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[8];
        blArray[5] = true;
        id_byte = blArray;
    }

    public Mr_1() {
        this.id_break();
        this.id_class();
    }

    static {
        Mr_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-99, -65, -121, -51, 60, -29, -12, -90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class() {
        Integer n = id_byte[0];
        this.id_class[Mr_1.id_break[0]] = n;
        Integer n2 = id_byte[1];
        this.id_class[Mr_1.id_break[1]] = n2;
        Integer n3 = id_byte[2];
        this.id_class[Mr_1.id_break[2]] = n3;
        Double d = id_throws[0];
        this.id_class[Mr_1.id_break[3]] = d;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAEFE5E84137721B9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3BE6EFAA;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[Mr_1.id_byte[3]] = id_byte[4];
            objectArray[Mr_1.id_byte[5]] = id_byte[6];
            objectArray[Mr_1.id_protected[1]] = id_byte[7];
            objectArray[Mr_1.id_protected[2]] = id_throws[1];
        }
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Mr_1.id_byte();
        Mr_1.id_throws();
        Mr_1.id_case();
        Mr_1.id_protected();
    }

    private static void id_case() {
        double[] dArray = new double[2];
        dArray[0] = 1000000.0;
        id_throws = dArray;
    }

    private static void id_protected() {
        id_protected = new byte[]{4, 2, 3};
    }
}

