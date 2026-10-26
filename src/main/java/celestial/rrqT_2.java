/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.render.JumpCircles;
import celestial.rrIm_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqT_2 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;
    private static float[] id_protected;
    private static double[] id_throws;
    private static byte[] id_case;

    private static void id_byte() {
        double[] dArray = new double[4];
        dArray[0] = 0.05;
        id_throws = dArray;
    }

    public rrqT_2(JumpCircles jumpCircles, double d, double d2, double d3) {
        this.id_protected();
        JumpCircles jumpCircles2 = jumpCircles;
        this.id_class[rrqT_2.id_byte[0]] = jumpCircles2;
        Float f = Float.valueOf(id_protected[0]);
        this.id_class[rrqT_2.id_byte[1]] = f;
        Double d4 = d;
        this.id_class[rrqT_2.id_byte[2]] = d4;
        Double d5 = d2;
        this.id_class[rrqT_2.id_byte[3]] = d5;
        Double d6 = d3;
        this.id_class[rrqT_2.id_byte[4]] = d6;
    }

    static {
        rrqT_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5AD03B99;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{47, -29, -70, 83, 122, 103, 86, -18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_class() {
        return (double)((Float)this.id_class[id_byte[5]]).floatValue() > (double)((Float)((rrIm_1)((JumpCircles)this.id_class[rrqT_2.id_byte[6]]).id_break[id_byte[7]]).id_byte()).floatValue() - id_throws[0] ? id_break[0] : id_break[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6B87F58CE0EFE3C2L;
    }

    private static void id_break() {
        id_protected = new float[2];
    }

    private static void id_throws() {
        id_case = new byte[]{5, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrqT_2.id_case();
        rrqT_2.id_catch();
        rrqT_2.id_break();
        rrqT_2.id_byte();
        rrqT_2.id_throws();
    }

    private static void id_catch() {
        short[] sArray = new short[8];
        sArray[0] = 4;
        sArray[1] = 3;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[6] = 4;
        id_byte = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[5];
            this.id_class[0] = 0.0;
            this.id_class[1] = 0.0;
            this.id_class[2] = 0.0;
            this.id_class[3] = Float.valueOf(0.0f);
        }
    }
}

