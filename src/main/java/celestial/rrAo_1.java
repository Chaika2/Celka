/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import celestial.PX;
import celestial.rfU_2;
import celestial.rrQX;
import celestial.rrfN_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAo_1
extends Om_1 {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;
    private static double[] id_case;
    private static float[] id_catch;
    public static Object[] id_class;
    public Object[] id_break;

    public void id_byte(boolean bl) {
        this.id_throw();
        Boolean bl2 = bl;
        this.id_break[rrAo_1.id_throws[81]] = bl2;
    }

    public void id_byte(double d) {
        this.id_throw();
        Double d2 = d;
        this.id_break[rrAo_1.id_throws[69]] = d2;
    }

    public void id_byte(float f) {
        this.id_throw();
        Float f2 = Float.valueOf(f);
        this.id_break[rrAo_1.id_throws[76]] = f2;
    }

    public float id_int() {
        this.id_throw();
        return ((Float)this.id_break[id_throws[65]]).floatValue();
    }

    public rrAo_1() {
        this.id_throw();
    }

    static {
        rrAo_1.ntfClinit();
    }

    public float id_this() {
        this.id_throw();
        return Math.abs(((Float)this.id_break[id_throws[52]]).floatValue() - ((Float)this.id_break[id_throws[53]]).floatValue());
    }

    public void id_class(PX pX) {
        this.id_throw();
        if (((Boolean)id_class[id_throws[30]]).booleanValue()) {
            return;
        }
        Float f = Float.valueOf(pX.id_throws());
        this.id_break[rrAo_1.id_throws[31]] = f;
        Float f2 = Float.valueOf(pX.id_protected());
        this.id_break[rrAo_1.id_throws[32]] = f2;
        Boolean bl = id_protected[2];
        rrAo_1.id_class[rrAo_1.id_throws[33]] = bl;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-66, -5, -36, 10, -61, 31, -58, 8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public double id_class() {
        this.id_throw();
        return (Double)this.id_break[id_throws[59]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD969F718FA4F8CA8L;
    }

    public static rrAo_1 id_class(double d, double d2, double d3, double d4, double d5, double d6, float f, float f2, float f3, float f4, boolean bl, boolean bl2, boolean bl3) {
        rrAo_1 rrAo_12 = rrAo_1.id_break(d, d2, d3, d4, d5, d6, f, f2, f3, f4, bl, bl2, bl3);
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[29]]).id_finally().id_class(rrAo_12);
        return rrAo_12;
    }

    public void id_class(float f) {
        this.id_throw();
        Float f2 = Float.valueOf(f);
        this.id_break[rrAo_1.id_throws[75]] = f2;
    }

    public void id_class(double d) {
        this.id_throw();
        Double d2 = d;
        this.id_break[rrAo_1.id_throws[74]] = d2;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x67865AFB;
    }

    public void id_break(boolean bl) {
        this.id_throw();
        Boolean bl2 = bl;
        this.id_break[rrAo_1.id_throws[79]] = bl2;
    }

    public void id_break(float f) {
        this.id_throw();
        Float f2 = Float.valueOf(f);
        this.id_break[rrAo_1.id_throws[77]] = f2;
    }

    public double id_break() {
        this.id_throw();
        return (Double)this.id_break[id_throws[58]];
    }

    public void id_break(double d) {
        this.id_throw();
        Double d2 = d;
        this.id_break[rrAo_1.id_throws[71]] = d2;
    }

    private static rrAo_1 id_break(double d, double d2, double d3, double d4, double d5, double d6, float f, float f2, float f3, float f4, boolean bl, boolean bl2, boolean bl3) {
        Double d7 = d;
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[0]]).id_break[rrAo_1.id_throws[1]] = d7;
        Double d8 = d2;
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[2]]).id_break[rrAo_1.id_throws[3]] = d8;
        Double d9 = d3;
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[4]]).id_break[rrAo_1.id_throws[5]] = d9;
        Double d10 = d4;
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[6]]).id_break[rrAo_1.id_throws[7]] = d10;
        Double d11 = d5;
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[8]]).id_break[rrAo_1.id_throws[9]] = d11;
        Double d12 = d6;
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[10]]).id_break[rrAo_1.id_throws[11]] = d12;
        Float f5 = Float.valueOf(f);
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[12]]).id_break[rrAo_1.id_throws[13]] = f5;
        Float f6 = Float.valueOf(f2);
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[14]]).id_break[rrAo_1.id_throws[15]] = f6;
        Float f7 = Float.valueOf(f3);
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[16]]).id_break[rrAo_1.id_throws[17]] = f7;
        Float f8 = Float.valueOf(f4);
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[18]]).id_break[rrAo_1.id_throws[19]] = f8;
        Boolean bl4 = bl;
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[20]]).id_break[rrAo_1.id_throws[21]] = bl4;
        Boolean bl5 = bl2;
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[22]]).id_break[rrAo_1.id_throws[23]] = bl5;
        Boolean bl6 = bl3;
        ((rrAo_1)rrAo_1.id_class[rrAo_1.id_throws[24]]).id_break[rrAo_1.id_throws[25]] = bl6;
        ((rrAo_1)id_class[id_throws[26]]).id_class(id_protected[0]);
        Boolean bl7 = id_protected[1];
        rrAo_1.id_class[rrAo_1.id_throws[27]] = bl7;
        return (rrAo_1)id_class[id_throws[28]];
    }

    public void id_throws(double d) {
        this.id_throw();
        Double d2 = d;
        this.id_break[rrAo_1.id_throws[73]] = d2;
    }

    public float id_throws() {
        this.id_throw();
        return Math.abs(((Float)this.id_break[id_throws[54]]).floatValue() - ((Float)this.id_break[id_throws[55]]).floatValue());
    }

    private static /* synthetic */ void ntfClinit() {
        rrAo_1.id_instanceof();
        rrAo_1.id_return();
        rrAo_1.id_public();
        rrAo_1.id_goto();
        rrAo_1.id_while();
        rrAo_1.id_try();
    }

    public PX id_finally() {
        this.id_throw();
        return new PX(((Float)this.id_break[id_throws[40]]).floatValue(), ((Float)this.id_break[id_throws[41]]).floatValue());
    }

    public double id_catch() {
        this.id_throw();
        return (Double)this.id_break[id_throws[57]];
    }

    public boolean id_extends() {
        this.id_throw();
        return (Boolean)this.id_break[id_throws[66]];
    }

    private static void id_goto() {
        id_case = new double[6];
    }

    public void id_case(double d) {
        this.id_throw();
        Double d2 = d;
        this.id_break[rrAo_1.id_throws[72]] = d2;
    }

    public double id_case() {
        this.id_throw();
        return Math.abs((Double)this.id_break[id_throws[50]] - (Double)this.id_break[id_throws[51]]);
    }

    public float id_continue() {
        this.id_throw();
        return ((Float)this.id_break[id_throws[63]]).floatValue();
    }

    public double id_else() {
        this.id_throw();
        return Math.abs((Double)this.id_break[id_throws[48]] - (Double)this.id_break[id_throws[49]]);
    }

    public boolean id_implements() {
        this.id_throw();
        return ((Float)this.id_break[id_throws[42]]).floatValue() != ((Float)this.id_break[id_throws[43]]).floatValue() || ((Float)this.id_break[id_throws[44]]).floatValue() != ((Float)this.id_break[id_throws[45]]).floatValue() ? id_protected[3] : id_protected[4];
    }

    private static void id_instanceof() {
        boolean[] blArray = new boolean[14];
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[12] = true;
        id_protected = blArray;
    }

    public double id_new() {
        this.id_throw();
        return Math.abs((Double)this.id_break[id_throws[46]] - (Double)this.id_break[id_throws[47]]);
    }

    public double id_package() {
        this.id_throw();
        return (Double)this.id_break[id_throws[56]];
    }

    private static void id_return() {
        short[] sArray = new short[82];
        sArray[0] = 2;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 2;
        sArray[6] = 2;
        sArray[7] = 3;
        sArray[8] = 2;
        sArray[9] = 4;
        sArray[10] = 2;
        sArray[11] = 5;
        sArray[12] = 2;
        sArray[13] = 6;
        sArray[14] = 2;
        sArray[15] = 7;
        sArray[16] = 2;
        sArray[17] = 8;
        sArray[18] = 2;
        sArray[19] = 9;
        sArray[20] = 2;
        sArray[21] = 10;
        sArray[22] = 2;
        sArray[23] = 11;
        sArray[24] = 2;
        sArray[25] = 12;
        sArray[26] = 2;
        sArray[28] = 2;
        sArray[30] = 1;
        sArray[31] = 6;
        sArray[32] = 7;
        sArray[34] = 6;
        sArray[35] = 6;
        sArray[36] = 7;
        sArray[37] = 7;
        sArray[38] = 7;
        sArray[39] = 7;
        sArray[40] = 6;
        sArray[41] = 7;
        sArray[42] = 6;
        sArray[43] = 8;
        sArray[44] = 7;
        sArray[45] = 9;
        sArray[47] = 3;
        sArray[48] = 1;
        sArray[49] = 4;
        sArray[50] = 2;
        sArray[51] = 5;
        sArray[52] = 6;
        sArray[53] = 8;
        sArray[54] = 7;
        sArray[55] = 9;
        sArray[57] = 1;
        sArray[58] = 2;
        sArray[59] = 3;
        sArray[60] = 4;
        sArray[61] = 5;
        sArray[62] = 6;
        sArray[63] = 7;
        sArray[64] = 8;
        sArray[65] = 9;
        sArray[66] = 10;
        sArray[67] = 11;
        sArray[68] = 12;
        sArray[70] = 1;
        sArray[71] = 2;
        sArray[72] = 3;
        sArray[73] = 4;
        sArray[74] = 5;
        sArray[75] = 6;
        sArray[76] = 7;
        sArray[77] = 8;
        sArray[78] = 9;
        sArray[79] = 10;
        sArray[80] = 11;
        sArray[81] = 12;
        id_throws = sArray;
    }

    public double id_super() {
        this.id_throw();
        return (Double)this.id_break[id_throws[61]];
    }

    private void id_throw() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[1]];
            objectArray[rrAo_1.id_protected[5]] = id_case[0];
            objectArray[rrAo_1.id_protected[6]] = id_case[1];
            objectArray[rrAo_1.id_byte[2]] = id_case[2];
            objectArray[rrAo_1.id_byte[3]] = id_case[3];
            objectArray[rrAo_1.id_byte[4]] = id_case[4];
            objectArray[rrAo_1.id_byte[5]] = id_case[5];
            objectArray[rrAo_1.id_byte[6]] = Float.valueOf(id_catch[2]);
            objectArray[rrAo_1.id_byte[7]] = Float.valueOf(id_catch[3]);
            objectArray[rrAo_1.id_byte[8]] = Float.valueOf(id_catch[4]);
            objectArray[rrAo_1.id_byte[9]] = Float.valueOf(id_catch[5]);
            objectArray[rrAo_1.id_byte[10]] = id_protected[7];
            objectArray[rrAo_1.id_byte[11]] = id_protected[8];
            objectArray[rrAo_1.id_byte[12]] = id_protected[9];
        }
    }

    private static void id_try() {
        Object[] objectArray = new Object[]{false, false, new rrAo_1()};
        id_class = objectArray;
    }

    private static void id_while() {
        id_byte = new byte[]{2, 13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 3};
    }

    private static void id_public() {
        float[] fArray = new float[6];
        fArray[0] = -90.0f;
        fArray[1] = 90.0f;
        id_catch = fArray;
    }

    public boolean id_protected() {
        this.id_throw();
        return (Boolean)this.id_break[id_throws[67]];
    }

    public void id_protected(double d) {
        this.id_throw();
        Double d2 = d;
        this.id_break[rrAo_1.id_throws[70]] = d2;
    }

    public void id_protected(boolean bl) {
        this.id_throw();
        Boolean bl2 = bl;
        this.id_break[rrAo_1.id_throws[80]] = bl2;
    }

    public void id_protected(float f) {
        this.id_throw();
        Float f2 = Float.valueOf(f);
        this.id_break[rrAo_1.id_throws[78]] = f2;
    }

    public boolean id_private() {
        this.id_throw();
        return (Boolean)this.id_break[id_throws[68]];
    }

    public double id_final() {
        this.id_throw();
        return (Double)this.id_break[id_throws[60]];
    }

    public float id_volatile() {
        this.id_throw();
        return ((Float)this.id_break[id_throws[64]]).floatValue();
    }

    public float id_synchronized() {
        this.id_throw();
        return ((Float)this.id_break[id_throws[62]]).floatValue();
    }

    public void id_native() {
        this.id_throw();
        Float f = Float.valueOf(rrfN_2.id_class(((Float)this.id_break[id_throws[34]]).floatValue()));
        this.id_break[rrAo_1.id_throws[35]] = f;
        Float f2 = Float.valueOf(rrfN_2.id_class(((Float)this.id_break[id_throws[36]]).floatValue()));
        this.id_break[rrAo_1.id_throws[37]] = f2;
        Float f3 = Float.valueOf(rfU_2.id_class(((Float)this.id_break[id_throws[38]]).floatValue(), id_catch[0], id_catch[1]));
        this.id_break[rrAo_1.id_throws[39]] = f3;
    }
}

