/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rfU_2;
import celestial.rrIm_1;
import celestial.rrQK;
import celestial.rrZF;
import celestial.rrfQ_2;
import celestial.rrtF_2;
import celestial.rrtN_2;
import celestial.rrtm_3;
import celestial.rrtu_3;
import celestial.rrtv_3;
import celestial.rruv_1;
import celestial.rrvk_1;
import celestial.setting.Setting;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtp_3
extends rrtm_3 {
    private static byte[] id_protected;
    private static short[] id_throws;
    private static String[] id_native;
    private static boolean[] id_volatile;
    private static float[] id_final;
    public Object[] id_byte;
    private static int[] id_package;

    public rrtp_3(rrtN_2 rrtN_22, rrIm_1 rrIm_12, float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
        this.id_goto();
        rrtv_3 rrtv_32 = new rrtv_3((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[0]]), id_final[0], id_volatile[0]);
        this.id_byte[rrtp_3.id_throws[1]] = rrtv_32;
        AnimValue animValue = new AnimValue(id_final[1], id_volatile[1]);
        this.id_byte[rrtp_3.id_throws[2]] = animValue;
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_byte[rrtp_3.id_throws[3]] = rrtN_23;
        rrIm_1 rrIm_13 = rrIm_12;
        this.id_byte[rrtp_3.id_throws[4]] = rrIm_13;
    }

    static {
        rrtp_3.ntfClinit();
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_goto();
        if (super.id_class(rrtu_32, n, n2, n3, bl)) {
            if (n3 == 0) {
                Boolean bl2 = id_volatile[5];
                this.id_byte[rrtp_3.id_throws[33]] = bl2;
            } else if (n3 == id_protected[4]) {
                ((rrIm_1)this.id_byte[id_throws[34]]).id_class(Float.valueOf(((rrIm_1)this.id_byte[id_throws[35]]).id_extends()), id_volatile[6], id_volatile[7]);
            }
            return id_volatile[8];
        }
        return id_volatile[9];
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        this.id_goto();
        super.id_class(ml_1, rrtu_32, n, n2);
        float f = this.id_package();
        float f2 = this.id_final();
        float f3 = this.id_new();
        float f4 = ((rrIm_1)this.id_byte[id_throws[5]]).id_class();
        float f5 = ((rrIm_1)this.id_byte[id_throws[6]]).id_native();
        float f6 = ((Float)((rrIm_1)this.id_byte[id_throws[7]]).id_byte()).floatValue();
        float f7 = ((rrIm_1)this.id_byte[id_throws[8]]).id_volatile();
        this.id_class(f, f3, f4, f5, f7, n);
        this.id_private().id_interface().id_class(ml_1, () -> this.id_class(ml_1, f, f2, f3, f4, f5, f6));
    }

    private void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4, float f5, float f6) {
        this.id_goto();
        int n = ColorHelper.id_class(id_final[2]);
        int n2 = ColorHelper.id_class(id_final[3]);
        String string = String.valueOf(f4);
        String string2 = String.valueOf(f5);
        ((AnimValue)this.id_byte[id_throws[9]]).id_break(f6);
        boolean bl = ((rrIm_1)this.id_byte[id_throws[10]]).id_final();
        byte by = bl ? id_protected[0] : id_protected[1];
        float f7 = (float)((int)(((AnimValue)this.id_byte[id_throws[11]]).id_byte() * (float)by)) / (float)by;
        Object object = "" + f7;
        if (bl && ((String)object).endsWith(id_native[0]) && ((String)object).length() > id_protected[2]) {
            object = ((String)object).substring(id_volatile[2], ((String)object).length() - id_protected[3]);
        }
        float f8 = (((Float)((rrIm_1)this.id_byte[id_throws[12]]).id_byte()).floatValue() - f4) / (f5 - f4);
        ((rrtv_3)this.id_byte[id_throws[13]]).id_class().id_break(f8);
        float f9 = ((rrtv_3)this.id_byte[id_throws[14]]).id_class().id_byte();
        string2 = this.id_class(((rrIm_1)this.id_byte[id_throws[15]]).id_package(), f7, string2);
        object = this.id_class(((rrIm_1)this.id_byte[id_throws[16]]).id_break(), f7, (String)object);
        rrtF_2.id_protected(ml_1, this, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[17]]).id_finally(), ((rrIm_1)this.id_byte[id_throws[18]]).id_throws(), f, f2, rrZF.k_, id_throws[19]);
        rrtF_2.id_protected(ml_1, this, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[20]]).id_native(), string, f, f2 + id_final[4], rrZF.k_, id_throws[21]);
        rrtF_2.id_protected(ml_1, this, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[22]]).id_native(), string2, f + f3 + id_final[5] - ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[23]]).id_native().id_break(string2), f2 + id_final[6], rrZF.k_, id_throws[24]);
        rrtF_2.id_break(ml_1, (rrtm_3)this, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[25]]).id_native(), (String)object, f + f3 / id_final[7], f2 + id_final[8], rrZF.k_, (int)id_throws[26]);
        rrtF_2.id_class(ml_1, f + id_final[9], f2 + id_final[10], f3 - id_final[11], id_final[12], id_final[13], id_package[0], this.id_class(id_throws[27]));
        rrtF_2.id_class(ml_1, f + id_final[14], f2 + id_final[15], (f3 - id_final[16]) * f9, id_final[17], id_final[18], n, n, n2, n2, this.id_class(id_throws[28]));
        float f10 = rfU_2.id_class(f + f3 * f9, f + id_final[19], f + f3 - id_final[20]);
        rrtF_2.id_class(ml_1, (rrtm_3)this, f10, f2 + id_final[21], id_final[22], rrZF.d_, (int)id_throws[29], this.id_private().id_long() * rrvk_1.id_class());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3F5593B6EB774434L;
    }

    private String id_class(BiFunction<rrIm_1, Float, String> biFunction, float f, String string) {
        String string2;
        this.id_goto();
        if (biFunction != null && (string2 = biFunction.apply((rrIm_1)this.id_byte[id_throws[32]], Float.valueOf(f))) != null) {
            string = string2;
        }
        return string;
    }

    private void id_class(float f, float f2, float f3, float f4, float f5, int n) {
        this.id_goto();
        if (!((Boolean)this.id_byte[id_throws[30]]).booleanValue()) {
            return;
        }
        float f6 = rrfQ_2.id_class(((float)n - f) * (f4 - f3) / f2 + f3, f5);
        ((rrIm_1)this.id_byte[id_throws[31]]).id_class(Float.valueOf(rfU_2.id_class(f6, f3, f4)), id_volatile[3], id_volatile[4]);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        this.id_goto();
        if (super.id_break(n, n2, n3)) {
            Boolean bl = id_volatile[10];
            this.id_byte[rrtp_3.id_throws[36]] = bl;
            return id_volatile[11];
        }
        return id_volatile[12];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4546189F;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-82, -121, -41, -76, 63, 53, -99, 75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrtp_3.id_while();
        rrtp_3.id_synchronized();
        rrtp_3.id_return();
        rrtp_3.id_public();
        rrtp_3.id_try();
        rrtp_3.id_instanceof();
    }

    @Override
    public Setting<?> id_finally() {
        this.id_goto();
        return (rrIm_1)this.id_byte[id_throws[39]];
    }

    private void id_goto() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[5]];
            objectArray[rrtp_3.id_protected[6]] = id_volatile[14];
        }
    }

    @Override
    public void id_case() {
        this.id_goto();
        super.id_case();
        Boolean bl = id_volatile[13];
        this.id_byte[rrtp_3.id_throws[37]] = bl;
    }

    private static void id_instanceof() {
        id_package = new int[]{6781311};
    }

    private static void id_return() {
        short[] sArray = new short[40];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[2] = 3;
        sArray[3] = 1;
        sArray[9] = 3;
        sArray[11] = 3;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[19] = 255;
        sArray[21] = 255;
        sArray[24] = 255;
        sArray[26] = 255;
        sArray[27] = 255;
        sArray[28] = 255;
        sArray[29] = 255;
        sArray[30] = 4;
        sArray[33] = 4;
        sArray[36] = 4;
        sArray[37] = 4;
        sArray[38] = 1;
        id_throws = sArray;
    }

    private static void id_try() {
        id_protected = new byte[]{100, 10, 3, 2, 2, 5, 4};
    }

    private static void id_while() {
        boolean[] blArray = new boolean[15];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[11] = true;
        id_volatile = blArray;
    }

    private static void id_public() {
        float[] fArray = new float[26];
        fArray[0] = 0.4f;
        fArray[1] = 0.3f;
        fArray[3] = 180.0f;
        fArray[4] = 19.0f;
        fArray[5] = 1.0f;
        fArray[6] = 19.0f;
        fArray[7] = 2.0f;
        fArray[8] = 19.0f;
        fArray[9] = 1.0f;
        fArray[10] = 10.0f;
        fArray[11] = 1.0f;
        fArray[12] = 2.0f;
        fArray[13] = 1.0f;
        fArray[14] = 1.0f;
        fArray[15] = 10.0f;
        fArray[16] = 1.0f;
        fArray[17] = 2.0f;
        fArray[18] = 1.0f;
        fArray[19] = 3.0f;
        fArray[20] = 2.0f;
        fArray[21] = 11.0f;
        fArray[22] = 8.0f;
        fArray[23] = 8.0f;
        fArray[24] = 1.0f;
        fArray[25] = 6.0f;
        id_final = fArray;
    }

    @Override
    public rrtN_2 id_private() {
        this.id_goto();
        return (rrtN_2)this.id_byte[id_throws[38]];
    }

    @Override
    public rruv_1 id_volatile() {
        return new rruv_1(this.id_package(), this.id_final() + id_final[23], this.id_new() + id_final[24], id_final[25]);
    }

    private static void id_synchronized() {
        id_native = new String[]{new String(".0")};
    }
}

