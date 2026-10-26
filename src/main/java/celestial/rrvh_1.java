/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rrZA;
import celestial.rrZH;
import celestial.rrZL;
import celestial.rrZi_1;
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

public class rrvh_1
extends rrtN_2
implements rrZA {
    private static int[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_native;
    public static Object[] id_class;
    public Object[] id_break;
    private static float[] id_volatile;
    private static String[] id_final;
    private static short[] id_package;
    private static double[] id_int;

    @Override
    public String id_byte() {
        this.id_continue();
        return ((rrZi_1)this.id_break[id_package[15]]).id_private().id_final();
    }

    public rrvh_1(rrZi_1 rrZi_12, Supplier<Float> supplier, Supplier<Float> supplier2) {
        super(supplier, supplier2, () -> Float.valueOf(id_volatile[40]), () -> Float.valueOf(id_volatile[39]));
        this.id_continue();
        AnimValue animValue = new AnimValue(id_volatile[0], id_native[0]).id_throws();
        this.id_break[rrvh_1.id_package[0]] = animValue;
        rrZi_1 rrZi_13 = rrZi_12;
        this.id_break[rrvh_1.id_package[1]] = rrZi_13;
        rrZH rrZH2 = new rrZH(id_volatile[1]);
        this.id_break[rrvh_1.id_package[2]] = rrZH2;
        rrZl_1 rrZl_12 = new rrZl_1(this, (rrZH)this.id_break[id_package[3]]);
        this.id_break[rrvh_1.id_package[4]] = rrZl_12;
        this.id_else();
        this.id_switch();
    }

    static {
        rrvh_1.ntfClinit();
    }

    private static void B() {
        id_final = new String[]{new String("ModuleSettingPopUp")};
    }

    private static void S() {
        id_protected = new byte[]{5, -1, -1, 4};
    }

    private static void id_this() {
        boolean[] blArray = new boolean[30];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
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
        id_native = blArray;
    }

    @Override
    public void id_class(int n, int n2, int n3) {
        this.id_continue();
        super.id_class(n, n2, n3);
        ((rrZl_1)this.id_break[id_package[13]]).id_break(n, n2, n3);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl, boolean bl2) {
        this.id_continue();
        boolean bl3 = ((rrZH)this.id_break[id_package[11]]).id_class(this.id_break(rrtu_32, n, n2), d, id_int[0]);
        return super.id_class(rrtu_32, n, n2, d, bl, bl2) || bl3 ? id_native[13] : id_native[14];
    }

    @Override
    public float id_class() {
        return id_volatile[8];
    }

    @Override
    public float id_class(boolean bl) {
        float f = id_volatile[9];
        List<rrtm_3> list = this.id_strictfp();
        for (rrtm_3 rrtm_32 : list) {
            f += bl ? rrtm_32.id_class(rrtm_32) : rrtm_32.id_continue();
        }
        return f;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-127, 46, -26, -32, -74, 33, -3, -20}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA81E73B3;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl, boolean bl2) {
        this.id_continue();
        ((rrZl_1)this.id_break[id_package[12]]).id_class(rrtu_32, n, n2, n3, id_native[15]);
        return super.id_class(rrtu_32, n, n2, n3, bl, bl2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4F5EFA994E95E049L;
    }

    private float id_class(float f) {
        this.id_continue();
        byte by = id_protected[0];
        float f2 = f + ((float)by - ((AnimValue)this.id_break[id_package[10]]).id_byte() * (float)by);
        return f2;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_continue();
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        float f = this.id_default();
        float f2 = this.id_abstract();
        if (!bl) {
            ((rrZH)this.id_break[id_package[7]]).id_class(this.id_class(id_native[3]) - id_volatile[2], (float)((int)this.ao_()) - id_volatile[3]);
        }
        this.id_interface().id_class(ml_1, () -> {
            if (!bl) {
                rrfD_2.id_class(ml_1, rrZL.id_break, f + id_volatile[35], f2 + id_volatile[36], id_volatile[37], id_volatile[38], id_byte[0]);
            }
        }, rrtu_32, n, n2, id_native[4], bl);
    }

    @Override
    public void id_break(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_continue();
        if (bl) {
            return;
        }
        float f = this.id_default();
        float f2 = this.id_abstract();
        float f3 = this.id_implements();
        float f4 = this.ao_();
        if (this.ah_()) {
            this.id_interface().id_class(ml_1, () -> rrfD_2.id_class(ml_1, f, f2 + id_volatile[29], f3, f4 - id_volatile[30], id_volatile[31], id_volatile[32], id_volatile[33], id_volatile[34], (int)id_protected[2]), id_native[5], id_native[6]);
        }
        for (int i = this.id_strictfp().size() - id_native[7]; i >= 0; --i) {
            rrtm_3 rrtm_32 = this.id_strictfp().get(i);
            if (rrtm_32.id_private().ap_()) {
                rrtm_32.id_this().id_class().id_class(rrtm_32.id_finally().id_private());
            }
            rrtm_32.id_class(((rrZH)this.id_break[id_package[8]]).id_case());
            if (rrtm_3.id_class(rrtm_32, this)) continue;
            rrtm_32.id_class(ml_1, rrtu_32, n, n2);
        }
        if (this.ah_()) {
            this.id_interface().id_class(ml_1, rrfi_3::id_class, id_native[8], id_native[9]);
        }
        float f5 = this.id_class(id_native[10]);
        ((AnimValue)this.id_break[id_package[9]]).id_class(f5 > id_volatile[4] ? id_native[11] : id_native[12]);
        this.id_interface().id_class(ml_1, () -> {
            this.id_continue();
            this.id_interface().id_class(ml_1, () -> rrfD_2.id_class(ml_1, f, f2, f3, f4 + id_volatile[24], id_volatile[25], id_volatile[26], id_volatile[27], id_volatile[28], (int)id_protected[1]), id_native[23], id_native[24]);
            rrvJ.id_class(ml_1, (rrZH)this.id_break[id_package[18]], f, f2 + id_volatile[14], f2 + f4 - id_volatile[15], f3, id_volatile[16]);
            this.id_interface().id_class(ml_1, rrfi_3::id_class, id_native[25], id_native[26]);
            if (((AnimValue)this.id_break[id_package[19]]).id_case()) {
                float f6 = this.id_class(f3);
                ((rrZl_1)this.id_break[id_package[20]]).id_class(ml_1, rrtu_32, f + f6 - id_volatile[17], f2 + id_volatile[18], n, n2, id_volatile[19], f5 - id_volatile[20], f4 - id_volatile[21] - id_volatile[22], id_native[27], id_volatile[23] * ((AnimValue)this.id_break[id_package[21]]).id_byte());
            }
        });
    }

    private static /* synthetic */ void ntfClinit() {
        rrvh_1.id_this();
        rrvh_1.B();
        rrvh_1.id_super();
        rrvh_1.id_throw();
        rrvh_1.id_package();
        rrvh_1.S();
        rrvh_1.id_while();
        rrvh_1.id_try();
    }

    public float id_finally() {
        float f = id_volatile[10];
        List<rrtm_3> list = this.id_strictfp();
        for (rrtm_3 rrtm_32 : list) {
            f += rrtm_32.id_class(rrtm_32);
        }
        return Math.min(f - id_volatile[11], id_volatile[12]) + id_volatile[13];
    }

    @Override
    public String id_catch() {
        return id_final[0];
    }

    private void id_continue() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[3]];
        }
    }

    private void id_else() {
        this.id_continue();
        if ((rrZi_1)this.id_break[id_package[5]] == null) {
            return;
        }
        for (Setting<?> setting : ((rrZi_1)this.id_break[id_package[6]]).id_private().b()) {
            if (setting == null) continue;
            Setting[] settingArray = new Setting[id_native[1]];
            settingArray[rrvh_1.id_native[2]] = setting;
            this.id_class(settingArray);
        }
    }

    @Override
    public float id_implements() {
        this.id_continue();
        return super.id_implements() + (rrZA.super.ah_() ? id_volatile[6] * ((AnimValue)this.id_break[id_package[16]]).id_byte() : id_volatile[7]);
    }

    private static void id_package() {
        id_int = new double[]{25.0};
    }

    private static void id_super() {
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
        id_volatile = fArray;
    }

    private static void id_throw() {
        short[] sArray = new short[23];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 3;
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
        id_package = sArray;
    }

    private static void id_try() {
        Object[] objectArray = new Object[]{192};
        id_class = objectArray;
    }

    private static void id_while() {
        id_byte = new int[]{-657931};
    }

    @Override
    public boolean id_protected() {
        return id_native[16];
    }

    @Override
    public void id_private() {
        this.id_continue();
        super.id_private();
        ((rrZl_1)this.id_break[id_package[14]]).id_private();
    }

    @Override
    public boolean ap_() {
        return id_native[18];
    }

    @Override
    public float ao_() {
        if (this.id_class(id_native[17]) > id_volatile[5]) {
            return this.id_finally();
        }
        return super.ao_();
    }

    @Override
    public boolean ah_() {
        this.id_continue();
        boolean bl = ((AnimValue)this.id_break[id_package[17]]).id_case() && this.id_interface().id_class().P() ? id_native[19] : id_native[20];
        return rrZA.super.ah_() || bl ? id_native[21] : id_native[22];
    }
}

