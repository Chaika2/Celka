/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlU_2 {
    private static float[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_protected;
    private static double[] id_throws;
    private static byte[] id_case;
    private static short[] id_catch;

    public double id_byte() {
        return (Double)this.id_class[id_catch[7]];
    }

    public rrlU_2(double d, double d2, double d3, float f, float f2, boolean bl) {
        this.id_finally();
        Double d4 = d;
        this.id_class[rrlU_2.id_catch[0]] = d4;
        Double d5 = d2;
        this.id_class[rrlU_2.id_catch[1]] = d5;
        Double d6 = d3;
        this.id_class[rrlU_2.id_catch[2]] = d6;
        Float f3 = Float.valueOf(f);
        this.id_class[rrlU_2.id_catch[3]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrlU_2.id_catch[4]] = f4;
        Boolean bl2 = bl;
        this.id_class[rrlU_2.id_catch[5]] = bl2;
    }

    public rrlU_2() {
        this.id_finally();
    }

    static {
        rrlU_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7C0837B48368AEC3L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{117, 71, -17, 46, 125, -28, 118, 117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF4ACE40F;
    }

    public double id_class() {
        return (Double)this.id_class[id_catch[8]];
    }

    public double id_break() {
        return (Double)this.id_class[id_catch[6]];
    }

    public float id_throws() {
        return ((Float)this.id_class[id_catch[9]]).floatValue();
    }

    private static /* synthetic */ void ntfClinit() {
        rrlU_2.id_catch();
        rrlU_2.id_implements();
        rrlU_2.id_extends();
        rrlU_2.id_native();
        rrlU_2.id_private();
        rrlU_2.id_volatile();
    }

    private void id_finally() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[0] = 0.0;
            this.id_class[1] = 0.0;
            this.id_class[2] = 0.0;
            this.id_class[3] = Float.valueOf(0.0f);
            this.id_class[4] = Float.valueOf(0.0f);
            this.id_class[5] = false;
        }
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[5];
        blArray[2] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    private static void id_extends() {
        id_throws = new double[3];
    }

    public float id_case() {
        return ((Float)this.id_class[id_catch[10]]).floatValue();
    }

    private static void id_implements() {
        short[] sArray = new short[12];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[5] = 5;
        sArray[7] = 1;
        sArray[8] = 2;
        sArray[9] = 3;
        sArray[10] = 4;
        sArray[11] = 5;
        id_catch = sArray;
    }

    public boolean id_protected() {
        return (Boolean)this.id_class[id_catch[11]];
    }

    private static void id_private() {
        id_case = new byte[]{6, 2, 3, 4, 5};
    }

    private static void id_volatile() {
        Object[] objectArray = new Object[]{new rrlU_2()};
        id_break = objectArray;
    }

    private static void id_native() {
        id_byte = new float[2];
    }
}

