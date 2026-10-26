/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrIz_1;
import celestial.rrZF;
import celestial.rrtF_2;
import celestial.rrtN_2;
import celestial.rrtm_3;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.rrvX;
import celestial.setting.Setting;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.ColorHelper;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtH_2
extends rrtm_3 {
    private static byte[] id_protected;
    private static float[] id_throws;
    private static short[] id_native;
    public Object[] id_byte;
    private static boolean[] id_volatile;

    public rrtH_2(rrtN_2 rrtN_22, rrIz_1 rrIz_12, float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
        this.id_while();
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_byte[rrtH_2.id_native[0]] = rrtN_23;
        rrIz_1 rrIz_13 = rrIz_12;
        this.id_byte[rrtH_2.id_native[1]] = rrIz_13;
        rrvX rrvX2 = new rrvX(this, () -> Float.valueOf(f), () -> Float.valueOf(f2));
        this.id_byte[rrtH_2.id_native[2]] = rrvX2;
    }

    static {
        rrtH_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x93295B9E3D38B5D1L;
    }

    private void id_class(Ml_1 ml_1, float f, float f2, float f3, int n) {
        this.id_while();
        rruv_1 rruv_12 = this.id_volatile();
        rrtF_2.id_class(ml_1, (rrtm_3)this, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_native[4]]).id_finally(), ((rrIz_1)this.id_byte[id_native[5]]).id_throws(), f, f2 + id_throws[0], rrZF.k_, (int)id_native[6]);
        RenderSystem.enableAlphaTest();
        if (ClickGuiTheme.id_class()) {
            rrtF_2.id_class(ml_1, f + f3 - id_throws[1], f2 + id_throws[2], id_throws[3], id_throws[4], (int)id_protected[0], n, this.id_class((int)(((rrvX)this.id_byte[id_native[7]]).id_break() * id_throws[5])));
        }
        rrtF_2.id_class(ml_1, f + f3 - id_throws[6], f2 + id_throws[7], id_throws[8], id_throws[9], id_throws[10], n, n, ColorHelper.id_class(n, id_throws[11]), ColorHelper.id_class(n, id_throws[12]), this.id_class((int)(((rrvX)this.id_byte[id_native[8]]).id_break() * id_throws[13])));
        RenderSystem.disableAlphaTest();
        ((rrvX)this.id_byte[id_native[9]]).id_class(rruv_12.id_break() + id_throws[14]);
        ((rrvX)this.id_byte[id_native[10]]).id_break(rruv_12.id_protected() + id_throws[15]);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_while();
        if (n3 == id_volatile[0] && super.id_class(rrtu_32, n, n2, n3, bl)) {
            if (!((rrvX)this.id_byte[id_native[11]]).id_interface().id_byte()) {
                float f = this.id_package() + this.id_private().id_implements() + id_throws[16];
                float f2 = this.id_final();
                if (f > id_const.id_volatile() - ((rrvX)this.id_byte[id_native[12]]).id_implements()) {
                    f = this.id_package();
                }
                if (f2 + ((rrvX)this.id_byte[id_native[13]]).id_double() > id_const.id_final()) {
                    f2 = this.id_final() - ((rrvX)this.id_byte[id_native[14]]).id_double();
                }
                rrtu_32.id_class(((rrvX)this.id_byte[id_native[15]]).id_class(f, f2), () -> {
                    this.id_while();
                    ((rrvX)this.id_byte[id_native[19]]).id_class(rrtu_32);
                });
            }
            return id_volatile[1];
        }
        return id_volatile[2];
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        this.id_while();
        super.id_class(ml_1, rrtu_32, n, n2);
        float f = this.id_package();
        float f2 = this.id_final();
        float f3 = this.id_new();
        int n3 = (Integer)((rrIz_1)this.id_byte[id_native[3]]).id_byte();
        this.id_private().id_interface().id_class(ml_1, () -> this.id_class(ml_1, f, f2, f3, n3));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{44, -69, 46, -34, 125, -84, -11, 78}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBC1FAF8;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtH_2.id_return();
        rrtH_2.id_try();
        rrtH_2.id_goto();
        rrtH_2.id_public();
    }

    public Setting<Integer> id_finally() {
        this.id_while();
        return (rrIz_1)this.id_byte[id_native[17]];
    }

    private static void id_goto() {
        id_throws = new float[]{2.5f, 11.0f, 0.5f, 12.0f, 7.0f, 150.0f, 10.0f, 1.5f, 10.0f, 5.0f, 1.0f, 0.5f, 0.5f, 255.0f, 5.0f, 3.0f, 5.0f, 11.0f, 12.0f, 8.0f};
    }

    private static void id_return() {
        boolean[] blArray = new boolean[3];
        blArray[0] = true;
        blArray[1] = true;
        id_volatile = blArray;
    }

    private static void id_try() {
        short[] sArray = new short[20];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[5] = 1;
        sArray[6] = 255;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[12] = 2;
        sArray[13] = 2;
        sArray[14] = 2;
        sArray[15] = 2;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 2;
        id_native = sArray;
    }

    private void id_while() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[1]];
        }
    }

    private static void id_public() {
        id_protected = new byte[]{6, 3};
    }

    @Override
    public rrtN_2 id_private() {
        this.id_while();
        return (rrtN_2)this.id_byte[id_native[16]];
    }

    @Override
    public rruv_1 id_volatile() {
        return new rruv_1(this.id_package() + this.id_new() - id_throws[17], this.id_final(), id_throws[18], id_throws[19]);
    }

    public rrIz_1 id_synchronized() {
        this.id_while();
        return (rrIz_1)this.id_byte[id_native[18]];
    }
}

