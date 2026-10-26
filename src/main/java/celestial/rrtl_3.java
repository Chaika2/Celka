/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrIk_1;
import celestial.rrZF;
import celestial.rrZO;
import celestial.rrtF_2;
import celestial.rrtN_2;
import celestial.rrtm_3;
import celestial.rrtu_3;
import celestial.rrtv_3;
import celestial.rruv_1;
import celestial.rrvk_1;
import celestial.setting.Setting;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtl_3
extends rrtm_3 {
    private static float[] id_protected;
    private static boolean[] id_throws;
    private static short[] id_native;
    private static int[] id_volatile;
    public Object[] id_byte;
    private static byte[] id_final;

    public rrtl_3(rrtN_2 rrtN_22, rrIk_1 rrIk_12, float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
        this.id_goto();
        rrtv_3 rrtv_32 = new rrtv_3(id_protected[0], id_throws[0]);
        this.id_byte[rrtl_3.id_native[0]] = rrtv_32;
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_byte[rrtl_3.id_native[1]] = rrtN_23;
        rrIk_1 rrIk_13 = rrIk_12;
        this.id_byte[rrtl_3.id_native[2]] = rrIk_13;
    }

    static {
        rrtl_3.ntfClinit();
    }

    public static void id_class(Ml_1 ml_1, rrtm_3 rrtm_32, rrtv_3 rrtv_32, Setting<?> setting, rrZO rrZO2, float f, float f2, float f3, boolean bl) {
        int n = bl ? ColorHelper.id_class(id_protected[1]) : id_volatile[0];
        int n2 = bl ? ColorHelper.id_class(id_protected[2]) : id_volatile[1];
        int n3 = bl ? ColorHelper.id_class(id_protected[3]) : id_volatile[2];
        int n4 = bl ? ColorHelper.id_class(id_protected[4]) : id_volatile[3];
        byte by = bl ? id_final[0] : id_final[1];
        rrtv_32.id_class().id_break(by);
        float f4 = rrtv_32.id_class().id_byte();
        rrtF_2.id_class(ml_1, rrtm_32, rrZO2, setting.id_throws(), f, f2 + id_protected[5], rrZF.k_, (int)id_native[9]);
        if (ClickGuiTheme.id_class()) {
            rrtF_2.id_class(ml_1, f + f3 - id_protected[6], f2, id_protected[7], id_protected[8], (int)id_final[2], n, rrtm_32.id_class(id_native[10]));
        }
        rrtF_2.id_class(ml_1, f + f3 - id_protected[9], f2, id_protected[10], id_protected[11], id_protected[12], n, n2, n3, n4, rrtm_32.id_class(id_native[11]));
        rrtF_2.id_class(ml_1, rrtm_32, f - id_protected[13] + f3 - f4 - id_protected[14], f2 + id_protected[15], id_protected[16], rrZF.d_, (int)id_native[12], rrtm_32.id_private().id_long() * rrvk_1.id_class());
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_goto();
        if (n3 == 0 && super.id_class(rrtu_32, n, n2, n3, bl)) {
            ((rrIk_1)this.id_byte[id_native[13]]).id_class(((rrIk_1)this.id_byte[id_native[14]]).id_class() == false ? id_throws[1] : id_throws[2], id_throws[3], id_throws[4]);
            return id_throws[5];
        }
        return id_throws[6];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE15854E8822ED095L;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        this.id_goto();
        super.id_class(ml_1, rrtu_32, n, n2);
        float f = this.id_package();
        float f2 = this.id_final();
        float f3 = this.id_new();
        boolean bl = ((rrIk_1)this.id_byte[id_native[3]]).id_class();
        this.id_private().id_interface().id_class(ml_1, () -> this.id_break(ml_1, f, f2, f3, bl));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-103, 96, 50, -44, 22, -47, 75, -72}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3B2BB5A5;
    }

    private void id_break(Ml_1 ml_1, float f, float f2, float f3, boolean bl) {
        this.id_goto();
        rrZO rrZO2 = ((rrIk_1)this.id_byte[id_native[4]]).id_break() == null ? ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_native[5]]).id_finally() : ((rrIk_1)this.id_byte[id_native[6]]).id_break();
        rrtl_3.id_class(ml_1, this, (rrtv_3)this.id_byte[id_native[7]], (rrIk_1)this.id_byte[id_native[8]], rrZO2, f, f2, f3, bl);
    }

    private static /* synthetic */ void ntfClinit() {
        rrtl_3.id_public();
        rrtl_3.id_synchronized();
        rrtl_3.id_while();
        rrtl_3.id_return();
        rrtl_3.id_try();
    }

    public Setting<Boolean> id_finally() {
        this.id_goto();
        return (rrIk_1)this.id_byte[id_native[16]];
    }

    private void id_goto() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_final[3]];
        }
    }

    private static void id_return() {
        id_final = new byte[]{-1, 8, 6, 3};
    }

    private static void id_try() {
        id_volatile = new int[]{6781311, 6781311, 6781311, 6781311};
    }

    private static void id_while() {
        short[] sArray = new short[17];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 255;
        sArray[10] = 255;
        sArray[11] = 255;
        sArray[12] = 255;
        sArray[13] = 1;
        sArray[14] = 1;
        sArray[16] = 1;
        id_native = sArray;
    }

    private static void id_public() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_throws = blArray;
    }

    @Override
    public rrtN_2 id_private() {
        this.id_goto();
        return (rrtN_2)this.id_byte[id_native[15]];
    }

    @Override
    public rruv_1 id_volatile() {
        return new rruv_1(this.id_package() + this.id_new() - id_protected[17], this.id_final() - id_protected[18], id_protected[19], id_protected[20]);
    }

    private static void id_synchronized() {
        float[] fArray = new float[21];
        fArray[0] = 0.6f;
        fArray[2] = 90.0f;
        fArray[3] = 270.0f;
        fArray[4] = 180.0f;
        fArray[5] = 2.5f;
        fArray[6] = 17.0f;
        fArray[7] = 17.0f;
        fArray[8] = 8.0f;
        fArray[9] = 17.0f;
        fArray[10] = 17.0f;
        fArray[11] = 8.0f;
        fArray[12] = 3.5f;
        fArray[13] = 3.0f;
        fArray[14] = 2.0f;
        fArray[15] = 4.0f;
        fArray[16] = 7.5f;
        fArray[17] = 18.0f;
        fArray[18] = 4.0f;
        fArray[19] = 19.0f;
        fArray[20] = 12.0f;
        id_protected = fArray;
    }
}

