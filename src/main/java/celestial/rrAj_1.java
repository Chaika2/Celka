/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAj_1 {
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;
    private static double[] id_case;
    public static Object[] id_class;
    public Object[] id_break;
    private static float[] id_catch;

    public double id_byte() {
        return (Double)this.id_break[id_throws[27]];
    }

    private void id_int() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
            objectArray[rrAj_1.id_byte[1]] = id_case[0];
            objectArray[rrAj_1.id_byte[2]] = id_case[1];
            objectArray[rrAj_1.id_protected[1]] = id_case[2];
            objectArray[rrAj_1.id_protected[2]] = id_case[3];
            objectArray[rrAj_1.id_protected[3]] = id_case[4];
            objectArray[rrAj_1.id_protected[4]] = id_case[5];
            objectArray[rrAj_1.id_protected[5]] = Float.valueOf(id_catch[0]);
            objectArray[rrAj_1.id_protected[6]] = Float.valueOf(id_catch[1]);
            objectArray[rrAj_1.id_protected[7]] = Float.valueOf(id_catch[2]);
            objectArray[rrAj_1.id_protected[8]] = Float.valueOf(id_catch[3]);
            objectArray[rrAj_1.id_protected[9]] = id_byte[3];
            objectArray[rrAj_1.id_protected[10]] = id_byte[4];
            objectArray[rrAj_1.id_protected[11]] = id_byte[5];
        }
    }

    public rrAj_1() {
        this.id_int();
    }

    static {
        rrAj_1.ntfClinit();
    }

    private static void id_this() {
        short[] sArray = new short[40];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[9] = 4;
        sArray[11] = 5;
        sArray[13] = 6;
        sArray[15] = 7;
        sArray[17] = 8;
        sArray[19] = 9;
        sArray[21] = 10;
        sArray[23] = 11;
        sArray[25] = 12;
        sArray[28] = 1;
        sArray[29] = 2;
        sArray[30] = 3;
        sArray[31] = 4;
        sArray[32] = 5;
        sArray[33] = 6;
        sArray[34] = 7;
        sArray[35] = 8;
        sArray[36] = 9;
        sArray[37] = 10;
        sArray[38] = 11;
        sArray[39] = 12;
        id_throws = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{78, -107, -127, -83, -94, -93, -113, 76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEAE43580632F6BADL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9DA4620D;
    }

    public static rrAj_1 id_class(double d, double d2, double d3, double d4, double d5, double d6, float f, float f2, float f3, float f4, boolean bl, boolean bl2, boolean bl3) {
        Double d7 = d;
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[0]]).id_break[rrAj_1.id_throws[1]] = d7;
        Double d8 = d2;
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[2]]).id_break[rrAj_1.id_throws[3]] = d8;
        Double d9 = d3;
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[4]]).id_break[rrAj_1.id_throws[5]] = d9;
        Double d10 = d4;
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[6]]).id_break[rrAj_1.id_throws[7]] = d10;
        Double d11 = d5;
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[8]]).id_break[rrAj_1.id_throws[9]] = d11;
        Double d12 = d6;
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[10]]).id_break[rrAj_1.id_throws[11]] = d12;
        Float f5 = Float.valueOf(f);
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[12]]).id_break[rrAj_1.id_throws[13]] = f5;
        Float f6 = Float.valueOf(f2);
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[14]]).id_break[rrAj_1.id_throws[15]] = f6;
        Float f7 = Float.valueOf(f3);
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[16]]).id_break[rrAj_1.id_throws[17]] = f7;
        Float f8 = Float.valueOf(f4);
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[18]]).id_break[rrAj_1.id_throws[19]] = f8;
        Boolean bl4 = bl;
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[20]]).id_break[rrAj_1.id_throws[21]] = bl4;
        Boolean bl5 = bl2;
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[22]]).id_break[rrAj_1.id_throws[23]] = bl5;
        Boolean bl6 = bl3;
        ((rrAj_1)rrAj_1.id_class[rrAj_1.id_throws[24]]).id_break[rrAj_1.id_throws[25]] = bl6;
        return (rrAj_1)id_class[id_throws[26]];
    }

    public double id_class() {
        return (Double)this.id_break[id_throws[31]];
    }

    public double id_break() {
        return (Double)this.id_break[id_throws[28]];
    }

    public boolean id_throws() {
        return (Boolean)this.id_break[id_throws[39]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAj_1.id_final();
        rrAj_1.id_this();
        rrAj_1.id_new();
        rrAj_1.id_super();
        rrAj_1.id_continue();
        rrAj_1.id_package();
    }

    public double id_finally() {
        return (Double)this.id_break[id_throws[30]];
    }

    public double id_catch() {
        return (Double)this.id_break[id_throws[32]];
    }

    public float id_extends() {
        return ((Float)this.id_break[id_throws[36]]).floatValue();
    }

    public float id_case() {
        return ((Float)this.id_break[id_throws[33]]).floatValue();
    }

    private static void id_continue() {
        id_protected = new byte[]{13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    }

    public double id_implements() {
        return (Double)this.id_break[id_throws[29]];
    }

    private static void id_new() {
        id_case = new double[6];
    }

    private static void id_package() {
        Object[] objectArray = new Object[]{new rrAj_1()};
        id_class = objectArray;
    }

    private static void id_super() {
        id_catch = new float[4];
    }

    public float id_protected() {
        return ((Float)this.id_break[id_throws[35]]).floatValue();
    }

    public float id_private() {
        return ((Float)this.id_break[id_throws[34]]).floatValue();
    }

    private static void id_final() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    public boolean id_volatile() {
        return (Boolean)this.id_break[id_throws[38]];
    }

    public boolean id_native() {
        return (Boolean)this.id_break[id_throws[37]];
    }
}

