/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rjK_2;
import celestial.rji_3;
import celestial.rrZF;
import celestial.rrZL;
import celestial.rrZO;
import celestial.rrtF_2;
import celestial.rrtN_2;
import celestial.rrtQ_2;
import celestial.rrth_3;
import celestial.rrtm_3;
import celestial.rrtu_3;
import celestial.rruF;
import celestial.rruH;
import celestial.rruL;
import celestial.rruu_1;
import celestial.rruv_1;
import celestial.setting.ButtonSetting;
import celestial.setting.Setting;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrty_3
extends rrtm_3 {
    private static String[] id_protected;
    private static short[] id_throws;
    private static float[] id_native;
    private static byte[] id_volatile;
    public Object[] id_byte;
    private static boolean[] id_final;

    private static void id_long() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        id_final = blArray;
    }

    private static void id_float() {
        float[] fArray = new float[16];
        fArray[0] = 0.2f;
        fArray[1] = 5.0f;
        fArray[2] = 12.0f;
        fArray[3] = 16.5f;
        fArray[4] = 4.5f;
        fArray[5] = 40.5f;
        fArray[6] = 12.0f;
        fArray[7] = 90.0f;
        fArray[8] = 8.0f;
        fArray[9] = 8.0f;
        fArray[10] = 4.0f;
        fArray[11] = 2.0f;
        fArray[13] = 90.0f;
        fArray[14] = 270.0f;
        fArray[15] = 180.0f;
        id_native = fArray;
    }

    public rrty_3(rrtN_2 rrtN_22, ButtonSetting buttonSetting, float f, float f2, float f3, float f4) {
        super(f, f2, f3, f4);
        this.id_while();
        rruL rruL2 = new rruL();
        this.id_byte[rrty_3.id_throws[0]] = rruL2;
        rrtN_2 rrtN_23 = rrtN_22;
        this.id_byte[rrty_3.id_throws[1]] = rrtN_23;
        ButtonSetting buttonSetting2 = buttonSetting;
        this.id_byte[rrty_3.id_throws[2]] = buttonSetting2;
        Supplier<rji_3> supplier = () -> new rji_3(ColorHelper.id_class(id_native[12]), ColorHelper.id_class(id_native[13]), ColorHelper.id_class(id_native[14]), ColorHelper.id_class(id_native[15]));
        rruF[] rruFArray = new rruF[id_final[0]];
        rruFArray[rrty_3.id_final[1]] = new rruF(rrtN_22, (rruu_1)((rruu_1)new rruH(() -> rrZL.id_extends, () -> new rjK_2(id_native[10], id_native[11]), () -> new rjK_2(id_native[8], id_native[9]), () -> rrZF.d_, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[4]]).id_finally(), () -> id_protected[0], () -> {
            rruv_1 rruv_12 = this.id_volatile();
            return new rjK_2(rruv_12.id_break() + id_native[7], rruv_12.id_protected());
        }, () -> new rjK_2(id_native[5], id_native[6]), () -> new rjK_2(id_native[3], id_native[4]), () -> rrZF.d_, supplier).id_break(ClickGuiTheme::id_class)).id_class(id_native[0])).id_class(() -> {
            this.id_while();
            ((ButtonSetting)this.id_byte[id_throws[13]]).id_break().run();
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[14]]).id_class(new rrtQ_2(((ButtonSetting)this.id_byte[id_throws[15]]).id_class().id_final(), "\u041a\u043e\u043d\u0444\u0438\u0433 '" + ((ButtonSetting)this.id_byte[id_throws[16]]).id_throws() + "' \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d", (int)id_throws[17]));
        });
        ((rruL)this.id_byte[id_throws[3]]).id_class(rruFArray);
    }

    static {
        rrty_3.ntfClinit();
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_while();
        if (super.id_class(rrtu_32, n, n2, n3, bl)) {
            return ((rruL)this.id_byte[id_throws[9]]).id_class(rrtu_32, n, n2, n3, id_final[4]);
        }
        return id_final[5];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3D44E8C6D6209102L;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        super.id_class(ml_1, rrtu_32, n, n2);
        float f = this.id_package();
        float f2 = this.id_final();
        this.id_private().id_interface().id_class(ml_1, () -> this.id_break(ml_1, rrtu_32, f, f2, n, n2));
    }

    private void id_break(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, int n, int n2) {
        this.id_while();
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[5]]).id_finally();
        rrtF_2.id_protected(ml_1, this, rrZO2, ((ButtonSetting)this.id_byte[id_throws[6]]).id_throws(), f, f2, rrZF.k_, id_throws[7]);
        ((rruL)this.id_byte[id_throws[8]]).id_class(ml_1, rrtu_32, n, n2, id_final[2], id_final[3]);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2382711E;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{52, -51, -83, 109, 73, 115, -50, 113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrty_3.id_long();
        rrty_3.id_throw();
        rrty_3.id_instanceof();
        rrty_3.id_float();
        rrty_3.id_synchronized();
    }

    public Setting<Runnable> id_finally() {
        this.id_while();
        return (ButtonSetting)this.id_byte[id_throws[11]];
    }

    private static void id_instanceof() {
        short[] sArray = new short[18];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[6] = 1;
        sArray[7] = 255;
        sArray[8] = 2;
        sArray[9] = 2;
        sArray[11] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1500;
        id_throws = sArray;
    }

    private static void id_throw() {
        id_protected = new String[]{new String("Load")};
    }

    private void id_while() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_volatile[0]];
        }
    }

    @Override
    public rrtN_2 id_private() {
        this.id_while();
        return (rrtN_2)this.id_byte[id_throws[10]];
    }

    @Override
    public rruv_1 id_volatile() {
        this.id_while();
        return new rruv_1(this.id_package(), this.id_final() - id_native[1], ((rrtN_2)this.id_byte[id_throws[12]]).id_implements(), id_native[2]);
    }

    private static void id_synchronized() {
        id_volatile = new byte[]{3};
    }
}

