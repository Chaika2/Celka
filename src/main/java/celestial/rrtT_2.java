/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrIF;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrfC_2;
import celestial.rrtF_2;
import celestial.rrtN_2;
import celestial.rrtm_3;
import celestial.rrtu_3;
import celestial.rrtw_3;
import celestial.rruv_1;
import celestial.rrvd_1;
import celestial.rrvs_1;
import celestial.setting.KeyBind;
import celestial.setting.Setting;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtT_2
extends rrtm_3
implements rrvs_1 {
    private static float[] id_throws;
    public static Object[] id_byte;
    private static byte[] id_native;
    private static String[] id_volatile;
    public Object[] id_protected;
    private static boolean[] id_final;
    private static short[] id_package;

    @Override
    public void id_byte(int n, int n2, int n3) {
        this.id_return();
        super.id_byte(n, n2, n3);
        if (!(((rrIF)this.id_protected[id_package[24]]).id_volatile() || n != id_package[25] && n != id_package[26])) {
            return;
        }
        Boolean bl = id_final[6];
        this.id_protected[rrtT_2.id_package[27]] = bl;
    }

    public rrtT_2(rrtN_2 rrtN_22, rrIF rrIF2, float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
        this.id_return();
        AnimValue animValue = new AnimValue(id_throws[0], id_final[0]);
        this.id_protected[rrtT_2.id_package[0]] = animValue;
        AnimValue animValue2 = new AnimValue(id_throws[1], id_final[1]);
        this.id_protected[rrtT_2.id_package[1]] = animValue2;
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_protected[rrtT_2.id_package[2]] = rrtN_23;
        rrIF rrIF3 = rrIF2;
        this.id_protected[rrtT_2.id_package[3]] = rrIF3;
        ((AnimValue)this.id_protected[id_package[4]]).id_class(this.id_class(this.id_instanceof(), this.id_class(((rrIF)this.id_protected[id_package[5]]).id_finally())));
        ((AnimValue)this.id_protected[id_package[6]]).id_class();
        ((rrvd_1)((Object)rrvd_1.staticFieldsf24d96aa22ff35f08b8eb2172b2f28e7[id_package[7]])).id_break(this);
    }

    static {
        rrtT_2.ntfClinit();
    }

    private static void id_interface() {
        id_volatile = new String[]{new String("?")};
    }

    @Override
    public void id_class(int n, int n2, int n3) {
        this.id_return();
        super.id_class(n, n2, n3);
        if (((Boolean)this.id_protected[id_package[20]]).booleanValue()) {
            switch (n) {
                case 256: 
                case 261: {
                    ((rrIF)this.id_protected[id_package[21]]).id_class((KeyBind)KeyBind.staticFields7d889755b225350f87e436adc34ba83e[id_package[22]], id_final[2], id_final[3]);
                    break;
                }
                default: {
                    ((rrIF)this.id_protected[id_package[23]]).id_class(rrfC_2.id_class(n), id_final[4], id_final[5]);
                }
            }
        }
    }

    public float id_class(rrZO rrZO2, String string) {
        return rrZO2.id_break(string) + id_throws[8];
    }

    private void id_class(Ml_1 ml_1, rrZO rrZO2, rrZO rrZO3, float f, float f2, float f3, String string) {
        this.id_return();
        rrtF_2.id_class(ml_1, (rrtm_3)this, rrZO2, ((rrIF)this.id_protected[id_package[9]]).id_throws(), f, f2 + id_throws[2], rrZF.k_, (int)id_package[10]);
        ((AnimValue)this.id_protected[id_package[11]]).id_break(this.id_class(rrZO3, string));
        Float f4 = Float.valueOf(((AnimValue)this.id_protected[id_package[12]]).id_byte());
        this.id_protected[rrtT_2.id_package[13]] = f4;
        boolean bl = ((AnimValue)this.id_protected[id_package[14]]).id_protected();
        ((AnimValue)this.id_protected[id_package[15]]).id_class(bl);
        rrtw_3.id_class(ml_1, this, f + f3 - ((Float)this.id_protected[id_package[16]]).floatValue(), f2, ((Float)this.id_protected[id_package[17]]).floatValue(), id_throws[3]);
        if (bl) {
            rrtF_2.id_protected(ml_1, this, this.id_instanceof(), string, f + f3 - ((Float)this.id_protected[id_package[18]]).floatValue() + id_throws[4], f2 + id_throws[5], rrZF.d_, (int)(((AnimValue)this.id_protected[id_package[19]]).id_byte() * id_throws[6]));
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        this.id_return();
        super.id_class(ml_1, rrtu_32, n, n2);
        rrZO rrZO2 = this.id_throw();
        rrZO rrZO3 = this.id_instanceof();
        float f = this.id_package();
        float f2 = this.id_final();
        float f3 = this.id_new();
        KeyBind keyBind = ((rrIF)this.id_protected[id_package[8]]).id_finally();
        this.id_private().id_interface().id_class(ml_1, () -> this.id_class(ml_1, rrZO2, rrZO3, f, f2, f3, this.id_class(keyBind)));
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3) {
        this.id_return();
        super.id_class(rrtu_32, n, n2, n3);
        if (((Boolean)this.id_protected[id_package[29]]).booleanValue()) {
            ((rrIF)this.id_protected[id_package[30]]).id_class(rrfC_2.id_class(n3), id_final[10], id_final[11]);
            Boolean bl = id_final[12];
            this.id_protected[rrtT_2.id_package[31]] = bl;
        }
        return id_final[13];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2CAA1270BEFD493BL;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_return();
        if (n3 == 0 && super.id_class(rrtu_32, n, n2, n3, bl)) {
            Boolean bl2 = id_final[7];
            this.id_protected[rrtT_2.id_package[28]] = bl2;
            return id_final[8];
        }
        return id_final[9];
    }

    private String id_class(KeyBind keyBind) {
        this.id_return();
        return (Boolean)this.id_protected[id_package[38]] != false ? id_volatile[0] : keyBind.id_break();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{40, -27, -67, 16, -71, 108, -21, 70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7713B1C4;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtT_2.id_synchronized();
        rrtT_2.id_interface();
        rrtT_2.id_try();
        rrtT_2.id_goto();
        rrtT_2.id_while();
        rrtT_2.id_public();
    }

    @Override
    public Setting<?> id_finally() {
        this.id_return();
        return (rrIF)this.id_protected[id_package[37]];
    }

    private static void id_goto() {
        short[] sArray = new short[42];
        sArray[0] = 4;
        sArray[1] = 5;
        sArray[3] = 1;
        sArray[4] = 4;
        sArray[5] = 1;
        sArray[6] = 5;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 255;
        sArray[11] = 4;
        sArray[12] = 4;
        sArray[13] = 3;
        sArray[14] = 4;
        sArray[15] = 5;
        sArray[16] = 3;
        sArray[17] = 3;
        sArray[18] = 3;
        sArray[19] = 5;
        sArray[20] = 2;
        sArray[21] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[25] = 261;
        sArray[26] = 256;
        sArray[27] = 2;
        sArray[28] = 2;
        sArray[29] = 2;
        sArray[30] = 1;
        sArray[31] = 2;
        sArray[32] = 2;
        sArray[33] = 2;
        sArray[35] = 3;
        sArray[36] = 3;
        sArray[37] = 1;
        sArray[38] = 2;
        sArray[39] = 1;
        sArray[40] = 1;
        sArray[41] = 2;
        id_package = sArray;
    }

    @Override
    public void id_case() {
        this.id_return();
        super.id_case();
        Boolean bl = id_final[15];
        this.id_protected[rrtT_2.id_package[33]] = bl;
    }

    private rrZO id_instanceof() {
        this.id_return();
        return ((rrIF)this.id_protected[id_package[40]]).id_native();
    }

    private void id_return() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_native[0]];
            objectArray[rrtT_2.id_native[1]] = id_final[16];
            objectArray[rrtT_2.id_native[2]] = Float.valueOf(id_throws[9]);
        }
    }

    private rrZO id_throw() {
        this.id_return();
        return ((rrIF)this.id_protected[id_package[39]]).id_extends();
    }

    private static void id_try() {
        float[] fArray = new float[10];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 3.0f;
        fArray[3] = 10.0f;
        fArray[4] = 2.0f;
        fArray[5] = 3.0f;
        fArray[6] = 255.0f;
        fArray[7] = 10.0f;
        fArray[8] = 4.0f;
        id_throws = fArray;
    }

    private static void id_while() {
        id_native = new byte[]{6, 2, 3, 10};
    }

    private static void id_public() {
        Object[] objectArray = new Object[]{10};
        id_byte = objectArray;
    }

    @Override
    public rrtN_2 id_private() {
        this.id_return();
        return (rrtN_2)this.id_protected[id_package[34]];
    }

    @Override
    public rruv_1 id_volatile() {
        this.id_return();
        return new rruv_1(this.id_package() + this.id_new() - ((Float)this.id_protected[id_package[35]]).floatValue(), this.id_final(), ((Float)this.id_protected[id_package[36]]).floatValue(), id_throws[7]);
    }

    private static void id_synchronized() {
        boolean[] blArray = new boolean[19];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[17] = true;
        id_final = blArray;
    }

    @Override
    public boolean aO_() {
        this.id_return();
        return (Boolean)this.id_protected[id_package[41]];
    }

    @Override
    public void aP_() {
        this.id_return();
        super.aP_();
        Boolean bl = id_final[14];
        this.id_protected[rrtT_2.id_package[32]] = bl;
    }
}

