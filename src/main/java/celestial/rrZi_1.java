/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.Module;
import celestial.rfU_2;
import celestial.rjK_2;
import celestial.rrZF;
import celestial.rrZI;
import celestial.rrZL;
import celestial.rrZN;
import celestial.rrfD_2;
import celestial.rrnv_3;
import celestial.rrtu_3;
import celestial.rruF;
import celestial.rruL;
import celestial.rrun_1;
import celestial.rruu_1;
import celestial.rruv_1;
import celestial.rrvO;
import celestial.rrvh_1;
import celestial.setting.Setting;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.ui.clickgui.GuiComponent;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZi_1
extends GuiComponent {
    private static float[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    private static short[] id_throws;

    private static void id_int() {
        short[] sArray = new short[55];
        sArray[0] = 4;
        sArray[1] = 5;
        sArray[3] = 1;
        sArray[4] = 6;
        sArray[5] = 7;
        sArray[6] = 10;
        sArray[7] = 11;
        sArray[8] = 2;
        sArray[9] = 3;
        sArray[11] = 1;
        sArray[12] = 5;
        sArray[13] = 2;
        sArray[14] = 5;
        sArray[15] = 3;
        sArray[16] = 4;
        sArray[18] = 1;
        sArray[20] = 4;
        sArray[21] = 1;
        sArray[22] = 1;
        sArray[25] = 1;
        sArray[27] = 1;
        sArray[28] = 5;
        sArray[29] = 5;
        sArray[30] = 1;
        sArray[31] = 4;
        sArray[33] = 270;
        sArray[34] = 180;
        sArray[36] = 1;
        sArray[38] = 6;
        sArray[39] = 8;
        sArray[40] = 7;
        sArray[41] = 9;
        sArray[42] = 10;
        sArray[43] = 11;
        sArray[44] = 8;
        sArray[45] = 9;
        sArray[46] = 1;
        sArray[47] = 3;
        sArray[48] = 3;
        sArray[49] = 3;
        sArray[50] = 3;
        sArray[51] = 2;
        sArray[52] = 2;
        sArray[53] = 2;
        sArray[54] = 2;
        id_throws = sArray;
    }

    public rrZi_1(rrZI rrZI2, rrtu_3 rrtu_32, ClickGuiScreen clickGuiScreen, Module module, Supplier<Float> supplier, Supplier<Float> supplier2, int n, int n2) {
        Supplier<Float> supplier3;
        Supplier<Float> supplier4;
        this.id_else();
        AnimValue animValue = new AnimValue(id_break[0], id_protected[0]);
        this.id_class[rrZi_1.id_throws[0]] = animValue;
        rruL rruL2 = new rruL();
        this.id_class[rrZi_1.id_throws[1]] = rruL2;
        rrZI rrZI3 = rrZI2;
        this.id_class[rrZi_1.id_throws[2]] = rrZI3;
        Module module2 = module;
        this.id_class[rrZi_1.id_throws[3]] = module2;
        this.id_class[rrZi_1.id_throws[4]] = supplier4 = supplier;
        this.id_class[rrZi_1.id_throws[5]] = supplier3 = supplier2;
        Integer n3 = n;
        this.id_class[rrZi_1.id_throws[6]] = n3;
        Integer n4 = n2;
        this.id_class[rrZi_1.id_throws[7]] = n4;
        rrvh_1 rrvh_12 = new rrvh_1(this, this::id_extends, this::id_case);
        this.id_class[rrZi_1.id_throws[8]] = rrvh_12;
        rrvO rrvO2 = new rrvO(this, this::id_extends, this::id_case);
        this.id_class[rrZi_1.id_throws[9]] = rrvO2;
        float f = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[10]]).id_catch().id_break(((Module)this.id_class[id_throws[11]]).id_final());
        Runnable runnable = () -> {
            this.id_else();
            float f = rfU_2.id_class((float)clickGuiScreen.id_abstract() - ((rrvh_1)this.id_class[id_throws[51]]).id_implements() - id_break[30], id_break[31], id_const.id_volatile() - id_break[32]);
            float f2 = rfU_2.id_class((float)clickGuiScreen.id_finally(), id_break[33], (float)id_const.id_native() - ((rrvh_1)this.id_class[id_throws[52]]).id_double() - id_break[34]);
            rrtu_32.id_class(((rrvh_1)this.id_class[id_throws[53]]).id_class(f, f2), () -> {
                this.id_else();
                ((rrvh_1)this.id_class[id_throws[54]]).id_class(rrtu_32);
            });
        };
        Runnable runnable2 = () -> {
            this.id_else();
            float f = rfU_2.id_class((float)clickGuiScreen.id_abstract() - ((rrvO)this.id_class[id_throws[47]]).id_implements() - id_break[25], id_break[26], id_const.id_volatile() - id_break[27]);
            float f2 = rfU_2.id_class((float)clickGuiScreen.id_finally(), id_break[28], (float)id_const.id_native() - ((rrvO)this.id_class[id_throws[48]]).id_double() - id_break[29]);
            rrtu_32.id_class(((rrvO)this.id_class[id_throws[49]]).id_class(f, f2), () -> {
                this.id_else();
                ((rrvO)this.id_class[id_throws[50]]).id_class(rrtu_32);
            });
        };
        Supplier<Boolean> supplier5 = () -> {
            this.id_else();
            return ((Module)this.id_class[id_throws[46]]).b().stream().anyMatch(Setting::id_private);
        };
        rruF[] rruFArray = new rruF[id_protected[1]];
        rruFArray[rrZi_1.id_protected[2]] = new rruF((rruu_1)((rruu_1)new rrun_1(() -> rrZL.id_int, () -> new rjK_2(this.id_extends() + f + id_break[23], this.id_case() + id_break[24]), () -> new rjK_2(id_break[21], id_break[22]), () -> rrZF.d_).id_class(this::id_continue)).id_class(id_break[1])).id_break(supplier5).id_class(((rrvh_1)this.id_class[id_throws[13]])::id_static).id_class(runnable);
        ((rruL)this.id_class[id_throws[12]]).id_class(rruFArray);
        if (!(module instanceof rrnv_3)) {
            rruF[] rruFArray2 = new rruF[id_protected[3]];
            rruFArray2[rrZi_1.id_protected[4]] = new rruF((rruu_1)((rruu_1)new rrun_1(() -> rrZL.id_protected, () -> {
                byte by = (Boolean)supplier5.get() != false ? id_byte[7] : id_byte[8];
                return new rjK_2(this.id_extends() + f + (float)by, this.id_case() + id_break[20]);
            }, () -> new rjK_2(id_break[18], id_break[19]), () -> rrZF.d_).id_class(this::id_continue)).id_class(id_break[2])).id_class(((rrvO)this.id_class[id_throws[15]])::id_static).id_class(runnable2);
            ((rruL)this.id_class[id_throws[14]]).id_class(rruFArray2);
        }
    }

    static {
        rrZi_1.ntfClinit();
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, rruv_1 rruv_12, boolean bl, boolean bl2) {
        this.id_else();
        super.id_class(ml_1, rrtu_32, n, n2, rruv_12, bl, bl2);
        float f = this.id_extends();
        float f2 = this.id_case();
        int n3 = this.id_catch();
        int n4 = this.id_break();
        AnimValue animValue = (AnimValue)this.id_class[id_throws[16]];
        if (!((rrZI)this.id_class[id_throws[17]]).id_native().id_volatile().id_long()) {
            animValue.id_class(((Module)this.id_class[id_throws[18]]).aJ_());
        }
        float f3 = ((rrZI)this.id_class[id_throws[19]]).id_implements().id_class().id_byte();
        int n5 = (int)(id_break[3] * f3);
        int n6 = ColorHelper.id_break((int)((Integer)rrZI.id_break[id_throws[20]]), n5);
        if (!((Module)this.id_class[id_throws[21]]).aJ_()) {
            rrfD_2.id_break(ml_1, f, f2, n3, n4, id_break[4], n6, n6, n6, n6);
        }
        if (animValue.id_case()) {
            this.id_class(ml_1, f, f2, n3, n4, f3);
        }
        if (!((Module)this.id_class[id_throws[22]]).aJ_() || !((rrZI)this.id_class[id_throws[23]]).id_native().id_volatile().id_long()) {
            int n7 = ColorHelper.id_break(rrZF.d_, n5);
            ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[24]]).id_catch().id_protected(ml_1, ((Module)this.id_class[id_throws[25]]).id_final(), f + id_break[5], f2 + id_break[6], n7, id_protected[5]);
            ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[26]]).id_private().id_class(ml_1, ((Module)this.id_class[id_throws[27]]).ay_(), (double)(f + id_break[7]), (double)(f2 + id_break[8]), n7, id_protected[6], id_protected[7]);
        }
        ((rruL)this.id_class[id_throws[28]]).id_class(ml_1, rrtu_32, n, n2, bl, bl2);
    }

    @Override
    public rrZN id_class() {
        this.id_else();
        return (rrZI)this.id_class[id_throws[35]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-20, -93, -51, 17, 42, -7, 18, -12}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_class(Ml_1 ml_1, float f, float f2, int n, int n2, float f3) {
        this.id_else();
        int n3 = (int)(id_break[9] * ((AnimValue)this.id_class[id_throws[31]]).id_byte() * f3);
        int n4 = ((rrZI)this.id_class[id_throws[32]]).id_finally().indexOf(this) * id_byte[0];
        int n5 = ColorHelper.id_class((float)n4, n3);
        int n6 = ColorHelper.id_class((float)(id_byte[1] + n4), n3);
        int n7 = ColorHelper.id_class((float)(id_throws[33] + n4), n3);
        int n8 = ColorHelper.id_class((float)(id_throws[34] + n4), n3);
        if (ClickGuiTheme.id_class()) {
            rrfD_2.id_class(ml_1, f, f2 - id_break[10], (float)n, (float)(n2 + id_byte[2]), id_break[11], id_byte[3], id_byte[4], n5, n6, n7, n8, n3);
        }
        rrfD_2.id_break(ml_1, f + id_break[12], f2 + id_break[13], n - id_byte[5], n2 - id_byte[6], id_break[14], id_break[15], id_break[16], id_break[17], n5, n6, n7, n8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC6522A50;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_else();
        if (n3 == 0 && super.id_class(rrtu_32, n, n2, n3, bl)) {
            if (((rruL)this.id_class[id_throws[29]]).id_class(rrtu_32, n, n2, n3, bl)) {
                return id_protected[8];
            }
            ((Module)this.id_class[id_throws[30]]).aw_();
            return id_protected[9];
        }
        return id_protected[10];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x61F15F3E40D58C40L;
    }

    public void id_class(float f, float f2) {
        this.id_else();
        Float f3 = Float.valueOf(f);
        this.id_class[rrZi_1.id_throws[44]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrZi_1.id_throws[45]] = f4;
    }

    public int id_break() {
        this.id_else();
        return (Integer)this.id_class[id_throws[43]];
    }

    private static /* synthetic */ void ntfClinit() {
        rrZi_1.id_return();
        rrZi_1.id_new();
        rrZi_1.id_int();
        rrZi_1.id_package();
    }

    public int id_catch() {
        this.id_else();
        return (Integer)this.id_class[id_throws[42]];
    }

    public float id_extends() {
        this.id_else();
        return ((Float)((Supplier)this.id_class[id_throws[38]]).get()).floatValue() + ((Float)this.id_class[id_throws[39]]).floatValue();
    }

    public float id_case() {
        this.id_else();
        return ((Float)((Supplier)this.id_class[id_throws[40]]).get()).floatValue() + ((Float)this.id_class[id_throws[41]]).floatValue();
    }

    private float id_continue() {
        this.id_else();
        return ((rrZI)this.id_class[id_throws[37]]).id_implements().id_class().id_byte();
    }

    private void id_else() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[9]];
            objectArray[rrZi_1.id_byte[10]] = Float.valueOf(id_break[35]);
            objectArray[rrZi_1.id_byte[11]] = Float.valueOf(id_break[36]);
            objectArray[rrZi_1.id_byte[12]] = id_protected[11];
            objectArray[rrZi_1.id_byte[13]] = id_protected[12];
        }
    }

    private static void id_new() {
        float[] fArray = new float[37];
        fArray[0] = 0.3f;
        fArray[1] = 0.2f;
        fArray[2] = 0.2f;
        fArray[3] = 255.0f;
        fArray[4] = 4.0f;
        fArray[5] = 5.0f;
        fArray[6] = 5.0f;
        fArray[7] = 5.0f;
        fArray[8] = 16.0f;
        fArray[9] = 255.0f;
        fArray[10] = 2.0f;
        fArray[11] = 0.5f;
        fArray[12] = 1.0f;
        fArray[13] = 1.0f;
        fArray[14] = 4.0f;
        fArray[15] = 4.0f;
        fArray[16] = 4.0f;
        fArray[17] = 4.0f;
        fArray[18] = 8.0f;
        fArray[19] = 8.0f;
        fArray[20] = 3.5f;
        fArray[21] = 8.0f;
        fArray[22] = 8.0f;
        fArray[23] = 7.0f;
        fArray[24] = 3.5f;
        fArray[25] = 10.0f;
        fArray[26] = 5.0f;
        fArray[27] = 5.0f;
        fArray[28] = 5.0f;
        fArray[29] = 5.0f;
        fArray[30] = 10.0f;
        fArray[31] = 5.0f;
        fArray[32] = 5.0f;
        fArray[33] = 5.0f;
        fArray[34] = 5.0f;
        id_break = fArray;
    }

    private static void id_package() {
        id_byte = new byte[]{100, 90, 4, 4, 9, 2, 2, 17, 7, 12, 8, 9, 10, 11};
    }

    private static void id_return() {
        boolean[] blArray = new boolean[13];
        blArray[1] = true;
        blArray[3] = true;
        blArray[8] = true;
        blArray[9] = true;
        id_protected = blArray;
    }

    @Override
    public rruv_1 id_protected() {
        return new rruv_1(this.id_extends(), this.id_case(), this.id_catch(), this.id_break());
    }

    public Module id_private() {
        this.id_else();
        return (Module)this.id_class[id_throws[36]];
    }
}

