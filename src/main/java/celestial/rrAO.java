/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.Om_1;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAO
extends Om_1 {
    private static double[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    private static byte[] id_throws;
    private static short[] id_case;
    private static float[] id_catch;
    public Object[] id_break;

    public void id_byte(boolean bl) {
        this.id_package();
        Boolean bl2 = bl;
        this.id_break[rrAO.id_case[38]] = bl2;
    }

    private static void id_int() {
        id_byte = new double[1];
    }

    public rrAO() {
        this.id_package();
    }

    static {
        rrAO.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8053FF3;
    }

    public void id_class(float f) {
        this.id_package();
        Float f2 = Float.valueOf(f);
        this.id_break[rrAO.id_case[42]] = f2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBD4D7CA6FEDB2C10L;
    }

    public boolean id_class() {
        this.id_package();
        return (Boolean)this.id_break[id_case[29]];
    }

    public static rrAO id_class(boolean bl, boolean bl2, boolean bl3, boolean bl4, float f, float f2, boolean bl5, boolean bl6, double d) {
        rrAO rrAO2 = rrAO.id_break(bl, bl2, bl3, bl4, f, f2, bl5, bl6, d);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_case[20]]).id_class(rrAO2);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_case[21]]).id_finally().id_class(rrAO2);
        return rrAO2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{32, -5, -110, 119, -80, -10, -54, 67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(double d) {
        this.id_package();
        Double d2 = d;
        this.id_break[rrAO.id_case[45]] = d2;
    }

    public void id_break(float f) {
        this.id_package();
        Float f2 = Float.valueOf(f);
        this.id_break[rrAO.id_case[41]] = f2;
    }

    private static rrAO id_break(boolean bl, boolean bl2, boolean bl3, boolean bl4, float f, float f2, boolean bl5, boolean bl6, double d) {
        Boolean bl7 = bl;
        ((rrAO)rrAO.id_class[rrAO.id_case[0]]).id_break[rrAO.id_case[1]] = bl7;
        Boolean bl8 = bl2;
        ((rrAO)rrAO.id_class[rrAO.id_case[2]]).id_break[rrAO.id_case[3]] = bl8;
        Boolean bl9 = bl3;
        ((rrAO)rrAO.id_class[rrAO.id_case[4]]).id_break[rrAO.id_case[5]] = bl9;
        Boolean bl10 = bl4;
        ((rrAO)rrAO.id_class[rrAO.id_case[6]]).id_break[rrAO.id_case[7]] = bl10;
        Float f3 = Float.valueOf(f);
        ((rrAO)rrAO.id_class[rrAO.id_case[8]]).id_break[rrAO.id_case[9]] = f3;
        Float f4 = Float.valueOf(f2);
        ((rrAO)rrAO.id_class[rrAO.id_case[10]]).id_break[rrAO.id_case[11]] = f4;
        Boolean bl11 = bl5;
        ((rrAO)rrAO.id_class[rrAO.id_case[12]]).id_break[rrAO.id_case[13]] = bl11;
        Boolean bl12 = bl6;
        ((rrAO)rrAO.id_class[rrAO.id_case[14]]).id_break[rrAO.id_case[15]] = bl12;
        Double d2 = d;
        ((rrAO)rrAO.id_class[rrAO.id_case[16]]).id_break[rrAO.id_case[17]] = d2;
        ((rrAO)id_class[id_case[18]]).id_class(id_protected[0]);
        return (rrAO)id_class[id_case[19]];
    }

    public boolean id_break() {
        this.id_package();
        return (Boolean)this.id_break[id_case[34]];
    }

    public void id_break(boolean bl) {
        this.id_package();
        Boolean bl2 = bl;
        this.id_break[rrAO.id_case[43]] = bl2;
    }

    public float id_throws() {
        this.id_package();
        return ((Float)this.id_break[id_case[33]]).floatValue();
    }

    public void id_throws(boolean bl) {
        this.id_package();
        Boolean bl2 = bl;
        this.id_break[rrAO.id_case[40]] = bl2;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAO.id_final();
        rrAO.id_continue();
        rrAO.id_volatile();
        rrAO.id_int();
        rrAO.id_new();
        rrAO.id_native();
    }

    public boolean id_finally() {
        this.id_package();
        return (Boolean)this.id_break[id_case[31]];
    }

    public void id_catch(boolean bl) {
        this.id_package();
        Boolean bl2 = bl;
        this.id_break[rrAO.id_case[44]] = bl2;
    }

    public float id_catch() {
        this.id_package();
        return ((Float)this.id_break[id_case[32]]).floatValue();
    }

    public boolean id_extends() {
        this.id_package();
        return (Boolean)this.id_break[id_case[28]];
    }

    public double id_case() {
        this.id_package();
        return (Double)this.id_break[id_case[36]];
    }

    public void id_case(boolean bl) {
        this.id_package();
        Boolean bl2 = bl;
        this.id_break[rrAO.id_case[39]] = bl2;
    }

    private static void id_continue() {
        short[] sArray = new short[46];
        sArray[3] = 1;
        sArray[5] = 2;
        sArray[7] = 3;
        sArray[9] = 4;
        sArray[11] = 5;
        sArray[13] = 6;
        sArray[15] = 7;
        sArray[17] = 8;
        sArray[23] = 1;
        sArray[24] = 2;
        sArray[25] = 3;
        sArray[26] = 6;
        sArray[27] = 7;
        sArray[29] = 1;
        sArray[30] = 2;
        sArray[31] = 3;
        sArray[32] = 4;
        sArray[33] = 5;
        sArray[34] = 6;
        sArray[35] = 7;
        sArray[36] = 8;
        sArray[38] = 1;
        sArray[39] = 2;
        sArray[40] = 3;
        sArray[41] = 4;
        sArray[42] = 5;
        sArray[43] = 6;
        sArray[44] = 7;
        sArray[45] = 8;
        id_case = sArray;
    }

    public boolean id_implements() {
        this.id_package();
        return (Boolean)this.id_break[id_case[35]];
    }

    private static void id_new() {
        id_throws = new byte[]{9, 2, 3, 4, 5, 6, 7, 8};
    }

    private void id_package() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrAO.id_protected[4]] = id_protected[5];
            objectArray[rrAO.id_protected[6]] = id_protected[7];
            objectArray[rrAO.id_throws[1]] = id_protected[8];
            objectArray[rrAO.id_throws[2]] = id_protected[9];
            objectArray[rrAO.id_throws[3]] = Float.valueOf(id_catch[0]);
            objectArray[rrAO.id_throws[4]] = Float.valueOf(id_catch[1]);
            objectArray[rrAO.id_throws[5]] = id_protected[10];
            objectArray[rrAO.id_throws[6]] = id_protected[11];
            objectArray[rrAO.id_throws[7]] = id_byte[0];
        }
    }

    public void id_protected(boolean bl) {
        this.id_package();
        Boolean bl2 = bl;
        this.id_break[rrAO.id_case[37]] = bl2;
    }

    public boolean id_protected() {
        this.id_package();
        return (Boolean)this.id_break[id_case[30]];
    }

    public boolean id_private() {
        this.id_package();
        return (Boolean)this.id_break[id_case[22]] != false || (Boolean)this.id_break[id_case[23]] != false || (Boolean)this.id_break[id_case[24]] != false || (Boolean)this.id_break[id_case[25]] != false || (Boolean)this.id_break[id_case[26]] != false || (Boolean)this.id_break[id_case[27]] != false ? id_protected[1] : id_protected[2];
    }

    private static void id_final() {
        boolean[] blArray = new boolean[13];
        blArray[1] = true;
        blArray[6] = true;
        blArray[12] = true;
        id_protected = blArray;
    }

    private static void id_volatile() {
        id_catch = new float[2];
    }

    private static void id_native() {
        Object[] objectArray = new Object[]{new rrAO()};
        id_class = objectArray;
    }
}

