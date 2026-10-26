/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rfU_2;
import celestial.rrZH;
import celestial.rrZI;
import celestial.rrZN;
import celestial.rrfD_2;
import celestial.rrtN_2;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZl_1
extends rrZN {
    private static int[] id_protected;
    private static float[] id_throws;
    public Object[] id_break;
    private static byte[] id_case;
    public static Object[] id_byte;
    private static short[] id_catch;
    private static double[] id_private;
    private static boolean[] id_implements;

    public boolean id_int() {
        this.id_return();
        return (Boolean)this.id_break[id_catch[50]];
    }

    public rrZl_1(rrtN_2 rrtN_22, rrZH rrZH2) {
        this.id_return();
        Float f = Float.valueOf(id_throws[2]);
        this.id_break[rrZl_1.id_catch[3]] = f;
        AnimValue animValue = new AnimValue(id_throws[3], id_implements[1]);
        this.id_break[rrZl_1.id_catch[4]] = animValue;
        rrZH rrZH3 = rrZH2;
        this.id_break[rrZl_1.id_catch[5]] = rrZH3;
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_break[rrZl_1.id_catch[6]] = rrtN_23;
    }

    public rrZl_1(rrZH rrZH2) {
        this.id_return();
        Float f = Float.valueOf(id_throws[0]);
        this.id_break[rrZl_1.id_catch[0]] = f;
        AnimValue animValue = new AnimValue(id_throws[1], id_implements[0]);
        this.id_break[rrZl_1.id_catch[1]] = animValue;
        rrZH rrZH3 = rrZH2;
        this.id_break[rrZl_1.id_catch[2]] = rrZH3;
    }

    static {
        rrZl_1.ntfClinit();
    }

    private static void id_this() {
        Object[] objectArray = new Object[]{15};
        id_byte = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2287CCE6AC4ED58EL;
    }

    private void id_class(float f, float f2, float f3, float f4) {
        this.id_return();
        Float f5 = Float.valueOf(f);
        this.id_break[rrZl_1.id_catch[42]] = f5;
        Float f6 = Float.valueOf(f2);
        this.id_break[rrZl_1.id_catch[43]] = f6;
        Float f7 = Float.valueOf(f3);
        this.id_break[rrZl_1.id_catch[44]] = f7;
        Float f8 = Float.valueOf(f4);
        this.id_break[rrZl_1.id_catch[45]] = f8;
    }

    @Override
    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        return id_implements[12];
    }

    private boolean id_class(rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_return();
        if (bl && rrtu_3.id_class(rrtu_32, n, n2)) {
            return id_implements[16];
        }
        if ((rrtN_2)this.id_break[id_catch[36]] != null && rrtu_32.id_class((rrtN_2)this.id_break[id_catch[37]], n, n2)) {
            return id_implements[17];
        }
        return this.id_final().id_break(n, n2);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_return();
        if (!super.id_class(rrtu_32, n, n2, n3, bl)) {
            return id_implements[7];
        }
        boolean bl2 = this.id_class(rrtu_32, n, n2, bl);
        if (n3 == 0 && bl2) {
            Float f = Float.valueOf(n2);
            this.id_break[rrZl_1.id_catch[28]] = f;
            Boolean bl3 = id_implements[8];
            this.id_break[rrZl_1.id_catch[29]] = bl3;
            Boolean bl4 = id_implements[9];
            this.id_break[rrZl_1.id_catch[30]] = bl4;
            return id_implements[10];
        }
        boolean bl5 = id_implements[11];
        Boolean bl6 = bl5;
        this.id_break[rrZl_1.id_catch[31]] = bl6;
        return bl5;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2F2FC002;
    }

    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, int n, int n2, float f3, float f4, float f5, boolean bl, float f6) {
        float f7;
        float f8;
        boolean bl2;
        this.id_return();
        if (!((Boolean)this.id_break[id_catch[7]]).booleanValue()) {
            bl2 = f4 > f5 ? id_implements[2] : id_implements[3];
            ((AnimValue)this.id_break[id_catch[8]]).id_class(bl2);
            if (!((AnimValue)this.id_break[id_catch[9]]).id_case()) {
                return;
            }
            if (bl2) {
                Float f9 = Float.valueOf(f4);
                this.id_break[rrZl_1.id_catch[10]] = f9;
            }
            f8 = ((AnimValue)this.id_break[id_catch[11]]).id_byte();
            f6 *= f8;
            if (!((AnimValue)this.id_break[id_catch[12]]).id_case()) {
                return;
            }
        } else {
            Float f10 = Float.valueOf(f4);
            this.id_break[rrZl_1.id_catch[13]] = f10;
        }
        this.id_class(f, f2, f3, f5);
        bl2 = (Boolean)this.id_break[id_catch[14]] != false || this.id_class(rrtu_32, n, n2, bl) ? id_implements[4] : id_implements[5];
        f8 = ((Float)this.id_break[id_catch[15]]).floatValue() / f5;
        float f11 = Math.max(f5 / f8, id_throws[4]);
        float f12 = ((rrZH)this.id_break[id_catch[16]]).id_break();
        if (((Float)this.id_break[id_catch[17]]).floatValue() != id_throws[5]) {
            f7 = ((Float)this.id_break[id_catch[18]]).floatValue() - (float)n2;
            Float f13 = Float.valueOf(n2);
            this.id_break[rrZl_1.id_catch[19]] = f13;
            f12 += f7 * f8;
        }
        f7 = f12 / (-((Float)this.id_break[id_catch[20]]).floatValue() + f5);
        float f14 = rfU_2.id_class(f7, id_throws[6], id_throws[7]);
        float f15 = (f5 - f11) * f14;
        if (((Boolean)this.id_break[id_catch[21]]).booleanValue()) {
            ((rrZH)this.id_break[id_catch[22]]).id_byte(-(((Float)this.id_break[id_catch[23]]).floatValue() - f5) * f14);
        }
        if (((Boolean)this.id_break[id_catch[24]]).booleanValue()) {
            this.id_class(n2, f2, ((Float)this.id_break[id_catch[25]]).floatValue(), f5, f15, f11);
            Boolean bl3 = id_implements[6];
            this.id_break[rrZl_1.id_catch[26]] = bl3;
        }
        rrZl_1.id_class(ml_1, f, f2, id_throws[8], f3, f5, ColorHelper.id_break((int)((Integer)rrZI.id_break[id_catch[27]]), (int)f6));
        int n3 = (int)Math.min(bl2 ? (double)f6 : (double)f6 / id_private[0], id_private[1]);
        rrZl_1.id_class(ml_1, f, f2, f15, f3, f11, ColorHelper.id_break(id_protected[0], n3));
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl) {
        return id_implements[15];
    }

    private static void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, int n) {
        rrfD_2.id_class(ml_1, f + id_throws[12], f2 + id_throws[13] + f3, f4 - id_throws[14], f5 - id_throws[15], id_throws[16], id_throws[17], id_throws[18], id_throws[19], n);
    }

    private void id_class(int n, float f, float f2, float f3, float f4, float f5) {
        this.id_return();
        int n2 = (int)((float)n - f);
        if ((float)n2 >= f4 && (float)n2 < f4 + f5) {
            return;
        }
        if (n2 < 0 || (float)n2 >= f3) {
            return;
        }
        float f6 = (float)n2 / f3;
        float f7 = -(f2 - f3) * f6;
        ((rrZH)this.id_break[id_catch[47]]).id_byte(f7);
    }

    @Override
    public void id_break(int n, int n2, int n3) {
        this.id_return();
        if (n3 == 0) {
            Float f = Float.valueOf(id_throws[9]);
            this.id_break[rrZl_1.id_catch[32]] = f;
            Boolean bl = id_implements[13];
            this.id_break[rrZl_1.id_catch[33]] = bl;
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-96, -23, -124, 46, -79, -77, 124, -108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrZl_1.id_super();
        rrZl_1.id_new();
        rrZl_1.id_synchronized();
        rrZl_1.id_else();
        rrZl_1.id_continue();
        rrZl_1.id_public();
        rrZl_1.id_this();
    }

    public boolean id_finally() {
        this.id_return();
        return (Boolean)this.id_break[id_catch[46]];
    }

    public rrZH id_extends() {
        this.id_return();
        return (rrZH)this.id_break[id_catch[48]];
    }

    private static void id_continue() {
        id_case = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 15};
    }

    private static void id_else() {
        id_private = new double[]{1.2, 255.0};
    }

    private static void id_new() {
        float[] fArray = new float[26];
        fArray[0] = -1.0f;
        fArray[1] = 0.4f;
        fArray[2] = -1.0f;
        fArray[3] = 0.4f;
        fArray[4] = 15.0f;
        fArray[5] = -1.0f;
        fArray[7] = 1.0f;
        fArray[9] = -1.0f;
        fArray[10] = -1.0f;
        fArray[12] = 1.0f;
        fArray[13] = 1.0f;
        fArray[14] = 2.0f;
        fArray[15] = 2.0f;
        fArray[16] = 1.0f;
        fArray[17] = 1.0f;
        fArray[18] = 1.0f;
        fArray[19] = 1.0f;
        id_throws = fArray;
    }

    public AnimValue id_package() {
        this.id_return();
        return (AnimValue)this.id_break[id_catch[49]];
    }

    private void id_return() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[0]];
            objectArray[rrZl_1.id_implements[19]] = Float.valueOf(id_throws[20]);
            objectArray[rrZl_1.id_case[1]] = Float.valueOf(id_throws[21]);
            objectArray[rrZl_1.id_case[2]] = Float.valueOf(id_throws[22]);
            objectArray[rrZl_1.id_case[3]] = Float.valueOf(id_throws[23]);
            objectArray[rrZl_1.id_case[4]] = Float.valueOf(id_throws[24]);
            objectArray[rrZl_1.id_case[5]] = id_implements[20];
            objectArray[rrZl_1.id_case[6]] = Float.valueOf(id_throws[25]);
            objectArray[rrZl_1.id_case[7]] = id_implements[21];
            objectArray[rrZl_1.id_case[8]] = id_implements[22];
        }
    }

    private static void id_super() {
        boolean[] blArray = new boolean[25];
        blArray[2] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[23] = true;
        id_implements = blArray;
    }

    private static void id_public() {
        id_protected = new int[]{6781311};
    }

    @Override
    public void id_private() {
        this.id_return();
        super.id_private();
        Float f = Float.valueOf(id_throws[10]);
        this.id_break[rrZl_1.id_catch[34]] = f;
        Boolean bl = id_implements[14];
        this.id_break[rrZl_1.id_catch[35]] = bl;
    }

    public rruv_1 id_final() {
        this.id_return();
        return new rruv_1(((Float)this.id_break[id_catch[38]]).floatValue(), ((Float)this.id_break[id_catch[39]]).floatValue(), ((Float)this.id_break[id_catch[40]]).floatValue(), ((Float)this.id_break[id_catch[41]]).floatValue());
    }

    public void id_volatile() {
        rrZH rrZH2 = this.id_extends();
        rrZH2.id_byte(id_throws[11]);
    }

    private static void id_synchronized() {
        short[] sArray = new short[52];
        sArray[0] = 7;
        sArray[1] = 10;
        sArray[3] = 7;
        sArray[4] = 10;
        sArray[6] = 11;
        sArray[7] = 9;
        sArray[8] = 10;
        sArray[9] = 10;
        sArray[10] = 5;
        sArray[11] = 10;
        sArray[12] = 10;
        sArray[13] = 5;
        sArray[14] = 6;
        sArray[15] = 5;
        sArray[17] = 7;
        sArray[18] = 7;
        sArray[19] = 7;
        sArray[20] = 5;
        sArray[21] = 6;
        sArray[23] = 5;
        sArray[24] = 8;
        sArray[25] = 5;
        sArray[26] = 8;
        sArray[27] = 4;
        sArray[28] = 7;
        sArray[29] = 8;
        sArray[30] = 6;
        sArray[31] = 6;
        sArray[32] = 7;
        sArray[33] = 6;
        sArray[34] = 7;
        sArray[35] = 6;
        sArray[36] = 11;
        sArray[37] = 11;
        sArray[38] = 1;
        sArray[39] = 2;
        sArray[40] = 3;
        sArray[41] = 4;
        sArray[42] = 1;
        sArray[43] = 2;
        sArray[44] = 3;
        sArray[45] = 4;
        sArray[46] = 6;
        sArray[49] = 10;
        sArray[50] = 9;
        sArray[51] = 9;
        id_catch = sArray;
    }

    public rrZl_1 id_native() {
        this.id_return();
        Boolean bl = id_implements[18];
        this.id_break[rrZl_1.id_catch[51]] = bl;
        return this;
    }
}

