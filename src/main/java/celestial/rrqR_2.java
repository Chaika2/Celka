/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rqR_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqR_2 {
    public Object[] id_class;
    private static double[] id_break;
    private static byte[] id_byte;
    private static short[] id_protected;
    private static boolean[] id_throws;
    private static long[] id_case;
    private static float[] id_catch;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[5];
            this.id_class[0] = 0.0;
            this.id_class[1] = 0.0;
            this.id_class[2] = 0.0;
            this.id_class[3] = Float.valueOf(0.0f);
            this.id_class[4] = 0L;
        }
    }

    public rrqR_2(double d, double d2, double d3) {
        this.id_byte();
        Double d4 = d;
        this.id_class[rrqR_2.id_protected[0]] = d4;
        Double d5 = d2;
        this.id_class[rrqR_2.id_protected[1]] = d5;
        Double d6 = d3;
        this.id_class[rrqR_2.id_protected[2]] = d6;
        Long l = rqR_2.id_break();
        this.id_class[rrqR_2.id_protected[3]] = l;
    }

    static {
        rrqR_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x13AEFDB35A8FCF9CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x22A38976;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, -35, 30, -69, -42, -122, -94, 41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_break = new double[3];
    }

    private static void id_break() {
        id_byte = new byte[]{5, 2, 3, 4};
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 4;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqR_2.id_catch();
        rrqR_2.id_protected();
        rrqR_2.id_throws();
        rrqR_2.id_class();
        rrqR_2.id_case();
        rrqR_2.id_break();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private static void id_case() {
        id_catch = new float[1];
    }

    private static void id_protected() {
        id_case = new long[1];
    }
}

