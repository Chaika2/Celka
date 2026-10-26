/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrNd_1;
import celestial.rrZA;
import celestial.rrZH;
import celestial.rrZL;
import celestial.rrZY;
import celestial.rrZl_1;
import celestial.rrfD_2;
import celestial.rrfi_3;
import celestial.rrtN_2;
import celestial.rrtm_3;
import celestial.rrtu_3;
import celestial.rrvJ;
import celestial.setting.Setting;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvM
extends rrtN_2
implements rrZA {
    private static short[] id_byte;
    private static float[] id_protected;
    private static double[] id_native;
    public Object[] id_class;
    public static Object[] id_break;
    private static int[] id_volatile;
    private static boolean[] id_final;
    private static byte[] id_package;
    private static String[] id_int;

    @Override
    public String id_byte() {
        this.id_throw();
        return ((rrZY)this.id_class[id_byte[15]]).id_break().id_case();
    }

    public rrvM(rrZY rrZY2, Supplier<Float> supplier, Supplier<Float> supplier2) {
        super(supplier, supplier2, () -> Float.valueOf(id_protected[40]), () -> Float.valueOf(id_protected[39]));
        this.id_throw();
        AnimValue animValue = new AnimValue(id_protected[0], id_final[0]).id_throws();
        this.id_class[rrvM.id_byte[0]] = animValue;
        rrZY rrZY3 = rrZY2;
        this.id_class[rrvM.id_byte[1]] = rrZY3;
        rrZH rrZH2 = new rrZH(id_protected[1]);
        this.id_class[rrvM.id_byte[2]] = rrZH2;
        rrZl_1 rrZl_12 = new rrZl_1(this, (rrZH)this.id_class[id_byte[3]]);
        this.id_class[rrvM.id_byte[4]] = rrZl_12;
        this.id_else();
        this.id_switch();
    }

    static {
        rrvM.ntfClinit();
    }

    private static void B() {
        id_package = new byte[]{5, -1, -1, 4};
    }

    private static void id_this() {
        float[] fArray = new float[41];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 14.0f;
        fArray[3] = 28.0f;
        fArray[4] = 192.0f;
        fArray[5] = 192.0f;
        fArray[6] = 10.0f;
        fArray[8] = 192.0f;
        fArray[11] = 2.0f;
        fArray[12] = 192.0f;
        fArray[13] = 10.0f;
        fArray[14] = 14.0f;
        fArray[15] = 21.0f;
        fArray[16] = 25.0f;
        fArray[17] = 9.0f;
        fArray[18] = 20.0f;
        fArray[19] = 5.0f;
        fArray[20] = 10.0f;
        fArray[21] = 14.0f;
        fArray[22] = 9.0f;
        fArray[23] = 255.0f;
        fArray[24] = 2.0f;
        fArray[25] = 10.0f;
        fArray[26] = 10.0f;
        fArray[27] = 10.0f;
        fArray[28] = 10.0f;
        fArray[29] = 15.0f;
        fArray[30] = 13.0f;
        fArray[31] = 10.0f;
        fArray[32] = 10.0f;
        fArray[33] = 10.0f;
        fArray[34] = 10.0f;
        fArray[35] = 1.5f;
        fArray[36] = 1.5f;
        fArray[37] = 10.5f;
        fArray[38] = 10.0f;
        fArray[39] = 14.0f;
        fArray[40] = 140.0f;
        id_protected = fArray;
    }

    private static void s() {
        boolean[] blArray = new boolean[30];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[25] = true;
        blArray[28] = true;
        id_final = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{1, 51, -100, 79, -102, -108, 30, -34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl, boolean bl2) {
        this.id_throw();
        ((rrZl_1)this.id_class[id_byte[12]]).id_class(rrtu_32, n, n2, n3, id_final[15]);
        return super.id_class(rrtu_32, n, n2, n3, bl, bl2);
    }

    private float id_class(float f) {
        this.id_throw();
        byte by = id_package[0];
        float f2 = f + ((float)by - ((AnimValue)this.id_class[id_byte[10]]).id_byte() * (float)by);
        return f2;
    }

    @Override
    public float id_class() {
        return id_protected[8];
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_throw();
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        float f = this.id_default();
        float f2 = this.id_abstract();
        if (!bl) {
            ((rrZH)this.id_class[id_byte[7]]).id_class(this.id_class(id_final[3]) - id_protected[2], (float)((int)this.ao_()) - id_protected[3]);
        }
        this.id_interface().id_class(ml_1, () -> {
            if (!bl) {
                rrfD_2.id_class(ml_1, rrZL.id_break, f + id_protected[35], f2 + id_protected[36], id_protected[37], id_protected[38], id_volatile[0]);
            }
        }, rrtu_32, n, n2, id_final[4], bl);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x68B3CB93601CD908L;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl, boolean bl2) {
        this.id_throw();
        boolean bl3 = ((rrZH)this.id_class[id_byte[11]]).id_class(this.id_break(rrtu_32, n, n2), d, id_native[0]);
        return super.id_class(rrtu_32, n, n2, d, bl, bl2) || bl3 ? id_final[13] : id_final[14];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAFC4A3BC;
    }

    @Override
    public void id_class(int n, int n2, int n3) {
        this.id_throw();
        super.id_class(n, n2, n3);
        ((rrZl_1)this.id_class[id_byte[13]]).id_break(n, n2, n3);
    }

    @Override
    public float id_class(boolean bl) {
        float f = id_protected[9];
        List<rrtm_3> list = this.id_strictfp();
        for (rrtm_3 rrtm_32 : list) {
            f += bl ? rrtm_32.id_class(rrtm_32) : rrtm_32.id_continue();
        }
        return f;
    }

    @Override
    public void id_break(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_throw();
        if (bl) {
            return;
        }
        float f = this.id_class(id_final[5]);
        ((AnimValue)this.id_class[id_byte[8]]).id_class(f > id_protected[4] ? id_final[6] : id_final[7]);
        float f2 = this.id_default();
        float f3 = this.id_abstract();
        float f4 = this.id_implements();
        float f5 = this.ao_();
        if (this.ah_()) {
            this.id_interface().id_class(ml_1, () -> rrfD_2.id_class(ml_1, f2, f3 + id_protected[29], f4, f5 - id_protected[30], id_protected[31], id_protected[32], id_protected[33], id_protected[34], (int)id_package[2]), id_final[8], id_final[9]);
        }
        for (int i = this.id_strictfp().size() - id_final[10]; i >= 0; --i) {
            rrtm_3 rrtm_32 = this.id_strictfp().get(i);
            if (rrtm_32.id_private().ap_()) {
                rrtm_32.id_this().id_class().id_class(rrtm_32.id_finally().id_private());
            }
            rrtm_32.id_class(((rrZH)this.id_class[id_byte[9]]).id_case());
            if (rrtm_3.id_class(rrtm_32, this)) continue;
            rrtm_32.id_class(ml_1, rrtu_32, n, n2);
        }
        if (this.ah_()) {
            this.id_interface().id_class(ml_1, rrfi_3::id_class, id_final[11], id_final[12]);
        }
        this.id_interface().id_class(ml_1, () -> {
            this.id_throw();
            this.id_interface().id_class(ml_1, () -> rrfD_2.id_class(ml_1, f2, f3, f4, f5 + id_protected[24], id_protected[25], id_protected[26], id_protected[27], id_protected[28], (int)id_package[1]), id_final[23], id_final[24]);
            rrvJ.id_class(ml_1, (rrZH)this.id_class[id_byte[18]], f2, f3 + id_protected[14], f3 + f5 - id_protected[15], f4, id_protected[16]);
            this.id_interface().id_class(ml_1, rrfi_3::id_class, id_final[25], id_final[26]);
            if (((AnimValue)this.id_class[id_byte[19]]).id_case()) {
                float f6 = this.id_class(f4);
                ((rrZl_1)this.id_class[id_byte[20]]).id_class(ml_1, rrtu_32, f2 + f6 - id_protected[17], f3 + id_protected[18], n, n2, id_protected[19], f - id_protected[20], f5 - id_protected[21] - id_protected[22], id_final[27], id_protected[23] * ((AnimValue)this.id_class[id_byte[21]]).id_byte());
            }
        });
    }

    private static /* synthetic */ void ntfClinit() {
        rrvM.s();
        rrvM.id_continue();
        rrvM.id_this();
        rrvM.id_return();
        rrvM.id_super();
        rrvM.B();
        rrvM.id_while();
        rrvM.id_try();
    }

    public float id_finally() {
        float f = id_protected[10];
        List<rrtm_3> list = this.id_strictfp();
        for (rrtm_3 rrtm_32 : list) {
            f += rrtm_32.id_class(rrtm_32);
        }
        return Math.min(f - id_protected[11], id_protected[12]) + id_protected[13];
    }

    @Override
    public String id_catch() {
        return id_int[0];
    }

    private static void id_continue() {
        id_int = new String[]{new String("AutoBuySettingPopUp")};
    }

    private void id_else() {
        this.id_throw();
        if ((rrZY)this.id_class[id_byte[5]] == null) {
            return;
        }
        rrNd_1 rrNd_12 = ((rrZY)this.id_class[id_byte[6]]).id_break();
        for (Setting<?> setting : rrNd_12.b()) {
            if (setting == null) continue;
            Setting[] settingArray = new Setting[id_final[1]];
            settingArray[rrvM.id_final[2]] = setting;
            this.id_class(settingArray);
        }
    }

    @Override
    public float id_implements() {
        this.id_throw();
        return super.id_implements() + (rrZA.super.ah_() ? id_protected[6] * ((AnimValue)this.id_class[id_byte[16]]).id_byte() : id_protected[7]);
    }

    private static void id_return() {
        short[] sArray = new short[23];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[7] = 1;
        sArray[8] = 3;
        sArray[9] = 1;
        sArray[10] = 3;
        sArray[11] = 1;
        sArray[12] = 2;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[16] = 3;
        sArray[17] = 3;
        sArray[18] = 1;
        sArray[19] = 3;
        sArray[20] = 2;
        sArray[21] = 3;
        sArray[22] = 192;
        id_byte = sArray;
    }

    private static void id_super() {
        id_native = new double[]{25.0};
    }

    private void id_throw() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_package[3]];
        }
    }

    private static void id_try() {
        Object[] objectArray = new Object[]{192};
        id_break = objectArray;
    }

    private static void id_while() {
        id_volatile = new int[]{-657931};
    }

    @Override
    public boolean id_protected() {
        return id_final[16];
    }

    @Override
    public void id_private() {
        this.id_throw();
        super.id_private();
        ((rrZl_1)this.id_class[id_byte[14]]).id_private();
    }

    @Override
    public boolean ap_() {
        return id_final[18];
    }

    @Override
    public float ao_() {
        if (this.id_class(id_final[17]) > id_protected[5]) {
            return this.id_finally();
        }
        return super.ao_();
    }

    @Override
    public boolean ah_() {
        this.id_throw();
        boolean bl = ((AnimValue)this.id_class[id_byte[17]]).id_case() && this.id_interface().id_class().P() ? id_final[19] : id_final[20];
        return rrZA.super.ah_() || bl ? id_final[21] : id_final[22];
    }
}

