/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.PX;
import celestial.rfl_3;
import celestial.rfo_3;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAz_1 {
    private static byte[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;
    private static float[] id_throws;
    private static double[] id_case;
    private static short[] id_catch;
    public Object[] id_break;

    public boolean id_byte() {
        return (Boolean)this.id_break[id_catch[26]];
    }

    private static void id_int() {
        id_case = new double[2];
    }

    public rrAz_1() {
        this.id_package();
    }

    static {
        rrAz_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE5A345549BBD3C97L;
    }

    public static void id_class(rrAz_1 rrAz_12) {
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_catch[17]]).id_finally().id_class(rrAz_12);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_catch[18]]).id_class(rrAz_12);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x97C4F58F;
    }

    public void id_class(rfl_3 rfl_32) {
        rfl_3 rfl_33 = rfl_32;
        this.id_break[rrAz_1.id_catch[31]] = rfl_33;
    }

    public static rrAz_1 id_class(rjG_2 rjG_22, double d, double d2, rjU_2 rjU_22, rfl_3 rfl_32, PX pX, boolean bl, float f) {
        rjG_2 rjG_23 = rjG_22;
        ((rrAz_1)rrAz_1.id_class[rrAz_1.id_catch[0]]).id_break[rrAz_1.id_catch[1]] = rjG_23;
        Double d3 = d;
        ((rrAz_1)rrAz_1.id_class[rrAz_1.id_catch[2]]).id_break[rrAz_1.id_catch[3]] = d3;
        Double d4 = d2;
        ((rrAz_1)rrAz_1.id_class[rrAz_1.id_catch[4]]).id_break[rrAz_1.id_catch[5]] = d4;
        rjU_2 rjU_23 = rjU_22;
        ((rrAz_1)rrAz_1.id_class[rrAz_1.id_catch[6]]).id_break[rrAz_1.id_catch[7]] = rjU_23;
        rfl_3 rfl_33 = rfl_32;
        ((rrAz_1)rrAz_1.id_class[rrAz_1.id_catch[8]]).id_break[rrAz_1.id_catch[9]] = rfl_33;
        PX pX2 = pX;
        ((rrAz_1)rrAz_1.id_class[rrAz_1.id_catch[10]]).id_break[rrAz_1.id_catch[11]] = pX2;
        Boolean bl2 = bl;
        ((rrAz_1)rrAz_1.id_class[rrAz_1.id_catch[12]]).id_break[rrAz_1.id_catch[13]] = bl2;
        Float f2 = Float.valueOf(f);
        ((rrAz_1)rrAz_1.id_class[rrAz_1.id_catch[14]]).id_break[rrAz_1.id_catch[15]] = f2;
        return (rrAz_1)id_class[id_catch[16]];
    }

    public void id_class(rjG_2 rjG_22) {
        rjG_2 rjG_23 = rjG_22;
        this.id_break[rrAz_1.id_catch[28]] = rjG_23;
    }

    public void id_class(rjU_2 rjU_22) {
        rjU_2 rjU_23 = rjU_22;
        this.id_break[rrAz_1.id_catch[30]] = rjU_23;
    }

    public void id_class(PX pX) {
        PX pX2 = pX;
        this.id_break[rrAz_1.id_catch[36]] = pX2;
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_break[rrAz_1.id_catch[34]] = bl2;
    }

    public void id_class(rfo_3 rfo_32) {
        rfo_3 rfo_33 = rfo_32;
        this.id_break[rrAz_1.id_catch[29]] = rfo_33;
    }

    public void id_class(float f) {
        Float f2 = Float.valueOf(f);
        this.id_break[rrAz_1.id_catch[35]] = f2;
    }

    public rfo_3 id_class() {
        return (rfo_3)this.id_break[id_catch[20]];
    }

    public void id_class(double d) {
        Double d2 = d;
        this.id_break[rrAz_1.id_catch[33]] = d2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-68, -46, -38, -120, 82, 37, -37, -83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break(double d) {
        Double d2 = d;
        this.id_break[rrAz_1.id_catch[32]] = d2;
    }

    public rjG_2 id_break() {
        return (rjG_2)this.id_break[id_catch[19]];
    }

    public rjU_2 id_throws() {
        return (rjU_2)this.id_break[id_catch[21]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrAz_1.id_final();
        rrAz_1.id_finally();
        rrAz_1.id_int();
        rrAz_1.id_volatile();
        rrAz_1.id_extends();
        rrAz_1.id_native();
    }

    private static void id_finally() {
        short[] sArray = new short[37];
        sArray[3] = 5;
        sArray[5] = 6;
        sArray[7] = 2;
        sArray[9] = 3;
        sArray[11] = 4;
        sArray[13] = 7;
        sArray[15] = 8;
        sArray[20] = 1;
        sArray[21] = 2;
        sArray[22] = 3;
        sArray[23] = 4;
        sArray[24] = 5;
        sArray[25] = 6;
        sArray[26] = 7;
        sArray[27] = 8;
        sArray[29] = 1;
        sArray[30] = 2;
        sArray[31] = 3;
        sArray[32] = 5;
        sArray[33] = 6;
        sArray[34] = 7;
        sArray[35] = 8;
        sArray[36] = 4;
        id_catch = sArray;
    }

    public PX id_catch() {
        return (PX)this.id_break[id_catch[23]];
    }

    private static void id_extends() {
        id_byte = new byte[]{9, 5, 6, 7, 8};
    }

    public float id_case() {
        return ((Float)this.id_break[id_catch[27]]).floatValue();
    }

    public rfl_3 id_implements() {
        return (rfl_3)this.id_break[id_catch[22]];
    }

    private void id_package() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
            objectArray[rrAz_1.id_byte[1]] = id_case[0];
            objectArray[rrAz_1.id_byte[2]] = id_case[1];
            objectArray[rrAz_1.id_byte[3]] = id_protected[1];
            objectArray[rrAz_1.id_byte[4]] = Float.valueOf(id_throws[0]);
        }
    }

    public double id_protected() {
        return (Double)this.id_break[id_catch[25]];
    }

    public double id_private() {
        return (Double)this.id_break[id_catch[24]];
    }

    private static void id_final() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_protected = blArray;
    }

    private static void id_volatile() {
        id_throws = new float[1];
    }

    private static void id_native() {
        Object[] objectArray = new Object[]{new rrAz_1()};
        id_class = objectArray;
    }
}

