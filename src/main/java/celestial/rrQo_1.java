/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrQK;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQo_1 {
    private static float[] id_break;
    private static double[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;
    public static Object[] id_class;

    private static void id_byte() {
        id_throws = new short[1];
    }

    static {
        rrQo_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{75, 102, 110, -85, -56, -110, 16, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9C0DF43E;
    }

    public static float id_class(rrQK rrQK2, double d, double d2, double d3) {
        return (float)(d + (d2 - d) * rrQK2.id_class(d3 * (Double)id_class[id_throws[0]] * id_byte[1]));
    }

    private static void id_class() {
        id_break = new float[]{1.0f, 2.0f, 2.0f};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9F0C407E1410ADD2L;
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5) {
        float f6 = id_break[0] - f5;
        ml_1.id_class((double)(f6 * (f + f3 / id_break[1])), (double)(f6 * (f2 + f4 / id_break[2])), id_byte[0]);
        ml_1.id_class(f5, f5, f5);
    }

    private static void id_break() {
        double[] dArray = new double[3];
        dArray[1] = 0.01;
        id_byte = dArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{0.0};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQo_1.id_protected();
        rrQo_1.id_class();
        rrQo_1.id_break();
        rrQo_1.id_byte();
        rrQo_1.id_throws();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }
}

