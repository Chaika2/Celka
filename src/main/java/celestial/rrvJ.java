/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rjK_2;
import celestial.rqR_2;
import celestial.rrFK;
import celestial.rrZC;
import celestial.rrZF;
import celestial.rrZH;
import celestial.rrZL;
import celestial.rrZN;
import celestial.rrZm_1;
import celestial.rrZt_1;
import celestial.rrZy_1;
import celestial.rrfD_2;
import celestial.rrfi_3;
import celestial.rrtu_3;
import celestial.rruF;
import celestial.rruL;
import celestial.rrul_1;
import celestial.rrun_1;
import celestial.rruu_1;
import celestial.rrvk_1;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.ColorHelper;
import celestial.vm_3;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvJ
extends rrZN
implements rrZF,
rrZL {
    private static String[] id_super;
    public Object[] id_new;
    public static Object[] id_continue;
    private static short[] id_this;
    private static float[] id_else;
    private static byte[] id_synchronized;
    private static boolean[] id_return;

    private static void id_char() {
        Object[] objectArray = new Object[1];
        id_continue = objectArray;
    }

    @Override
    public void id_byte(int n, int n2, int n3) {
        this.id_interface();
        super.id_byte(n, n2, n3);
        ((rrZt_1)this.id_new[id_this[46]]).id_byte(n, n2, n3);
        this.id_native().id_byte(n, n2, n3);
        ((rrZy_1)this.id_new[id_this[47]]).id_byte(n, n2, n3);
    }

    private void id_byte(ClickGuiScreen clickGuiScreen, rrtu_3 rrtu_32) {
        this.id_interface();
        Runnable runnable = () -> ((vm_3)rrvJ.id_import.id_class[id_this[79]]).id_goto();
        Runnable runnable2 = () -> rqR_2.id_implements().id_class(new File(((File)rrvJ.id_import.id_class[id_this[78]]).getAbsoluteFile() + "/celestial/"));
        Runnable runnable3 = () -> {
            float f = rfU_2.id_class((float)clickGuiScreen.id_abstract() - ((ClickGuiTheme)id_continue[id_this[74]]).id_implements() - id_else[64], id_else[65], id_const.id_volatile() - id_else[66]);
            float f2 = rfU_2.id_class((float)clickGuiScreen.id_finally(), id_else[67], (float)id_const.id_native() - ((ClickGuiTheme)id_continue[id_this[75]]).id_double() - id_else[68]);
            ((ClickGuiTheme)id_continue[id_this[76]]).id_class(f, f2);
            ((ClickGuiTheme)id_continue[id_this[77]]).id_class(rrtu_32);
        };
        rruF[] rruFArray = new rruF[id_synchronized[2]];
        rruFArray[rrvJ.id_return[0]] = new rruF((rruu_1)((rruu_1)new rrZC(() -> id_super[2], ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_this[7]]).id_throws(), () -> d_, () -> new rjK_2(id_else[62], id_else[63]), () -> id_implements, () -> new rjK_2((float)clickGuiScreen.id_abstract() + id_else[60], (float)(clickGuiScreen.id_finally() + id_this[73]) - id_else[61]), () -> new rjK_2(id_else[58], id_else[59]), () -> d_).id_class((rrul_1)((Object)rrul_1.staticFields9897caebb88b3588975198b6a548d1f7[id_this[8]]))).id_class(id_else[0])).id_class(runnable);
        rruFArray[rrvJ.id_return[1]] = new rruF((rruu_1)((rruu_1)new rrun_1(() -> id_package, () -> new rjK_2((float)(clickGuiScreen.id_abstract() + id_this[72]) - id_else[56], (float)clickGuiScreen.id_finally() + id_else[57]), () -> new rjK_2(id_else[54], id_else[55]), () -> d_).id_class((rrul_1)((Object)rrul_1.staticFields9897caebb88b3588975198b6a548d1f7[id_this[9]]))).id_class(id_else[1])).id_class(runnable2);
        rruFArray[rrvJ.id_synchronized[3]] = new rruF((rruu_1)((rruu_1)new rrun_1(() -> id_final, () -> new rjK_2((float)(clickGuiScreen.id_abstract() + id_this[71]) - id_else[52], (float)clickGuiScreen.id_finally() + id_else[53]), () -> new rjK_2(id_else[50], id_else[51]), () -> d_).id_class((rrul_1)((Object)rrul_1.staticFields9897caebb88b3588975198b6a548d1f7[id_this[10]]))).id_class(id_else[2])).id_class(() -> !((ClickGuiTheme)id_continue[id_this[70]]).aq_() ? id_return[14] : id_return[15]).id_class(runnable3);
        ((rruL)this.id_new[id_this[6]]).id_class(rruFArray);
    }

    private void id_byte(Ml_1 ml_1, float f, float f2, int n, int n2) {
        float f3 = id_else[32];
        rrfD_2.id_protected(ml_1, f + id_else[33], f2 - id_else[34], id_else[35], n2 + id_synchronized[4], i_);
        rrfD_2.id_protected(ml_1, f + id_else[36], f2 + id_else[37] + id_else[38], n - id_synchronized[5] + id_return[10], id_else[39], i_);
    }

    public rrvJ(ClickGuiScreen clickGuiScreen, rrtu_3 rrtu_32) {
        this.id_interface();
        rruL rruL2 = new rruL();
        this.id_new[rrvJ.id_this[0]] = rruL2;
        ClickGuiScreen clickGuiScreen2 = clickGuiScreen;
        this.id_new[rrvJ.id_this[1]] = clickGuiScreen2;
        rrZt_1 rrZt_12 = new rrZt_1(this, id_synchronized[0]);
        this.id_new[rrvJ.id_this[2]] = rrZt_12;
        rrZy_1 rrZy_12 = new rrZy_1(this);
        this.id_new[rrvJ.id_this[3]] = rrZy_12;
        this.id_class(clickGuiScreen, rrtu_32);
        rrZm_1 rrZm_12 = new rrZm_1(this, rrtu_32, id_synchronized[1]);
        this.id_new[rrvJ.id_this[4]] = rrZm_12;
        this.id_byte(clickGuiScreen, rrtu_32);
    }

    static {
        rrvJ.ntfClinit();
    }

    private void id_interface() {
        if (this.id_new == null) {
            Object[] objectArray = this.id_new = new Object[id_synchronized[10]];
        }
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_interface();
        super.id_class(rrFK2);
        ((rrZt_1)this.id_new[id_this[57]]).id_class(rrFK2);
        ((rrZy_1)this.id_new[id_this[58]]).id_class(rrFK2);
        this.id_extends().id_break().forEach(rrZN2 -> rrZN2.id_class(rrFK2));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x16CCE73766505D03L;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl) {
        this.id_interface();
        ((rrZt_1)this.id_new[id_this[31]]).id_class(rrtu_32, (int)((Integer)rrvk_1.id_class[id_this[32]]), (int)((Integer)rrvk_1.id_class[id_this[33]]), d, bl);
        return this.id_native().id_class(rrtu_32, (int)((Integer)rrvk_1.id_class[id_this[34]]), (int)((Integer)rrvk_1.id_class[id_this[35]]), d, bl);
    }

    public static void id_class(Ml_1 ml_1, float f, float f2, int n, int n2) {
        rrfi_3.id_break();
        rrfD_2.id_protected(ml_1, f, f2 + id_else[44] + id_else[45], n, n2 - id_synchronized[6] - id_synchronized[7], id_synchronized[8]);
        rrfi_3.id_class(id_return[13]);
    }

    private void id_class(Ml_1 ml_1, float f, float f2, int n, int n2, int n3, int n4) {
        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_this[59]]).id_byte().id_byte(ml_1, id_super[1], f + id_else[13], f2 + id_else[14], d_);
        if (ClickGuiTheme.id_class()) {
            rrfD_2.id_byte(ml_1, f + id_else[15], f2 + id_else[16], id_else[17], id_else[18], id_else[19], n, n2, n3, n4);
        }
        rrfD_2.id_break(ml_1, f + id_else[20], f2 + id_else[21], id_else[22], id_else[23], id_else[24], id_else[25], id_else[26], id_else[27], n, n2, n3, n4);
        rrfD_2.id_class(ml_1, id_volatile, f + id_else[28], f2 + id_else[29], id_else[30], id_else[31], d_);
    }

    @Override
    public void id_class(Category category, Category category2) {
        this.id_interface();
        super.id_class(category, category2);
        ((ClickGuiScreen)this.id_new[id_this[52]]).id_float();
        this.id_extends().id_break().forEach(rrZN2 -> rrZN2.id_class(category, category2));
        ((rrZy_1)this.id_new[id_this[53]]).id_class(category, category2);
        ((rrZy_1)this.id_new[id_this[54]]).id_extends().id_byte(id_super[0]);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_interface();
        return ((rrZt_1)this.id_new[id_this[44]]).id_class(n, n2, n3) || this.id_native().id_class(n, n2, n3) || ((rrZy_1)this.id_new[id_this[45]]).id_class(n, n2, n3) ? id_return[8] : id_return[9];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC5F6B64;
    }

    public rrZN id_class(Category category) {
        return this.id_extends().id_class(category);
    }

    public static void id_class(Ml_1 ml_1, rrZH rrZH2, float f, float f2, float f3, float f4, float f5) {
        byte by = id_synchronized[9];
        int n = (int)(id_else[46] * Math.min(rrZH2.id_case() / (float)(-by), id_else[47]));
        int n2 = (int)(id_else[48] * Math.min((rrZH2.id_throws() - rrZH2.id_case()) / (float)(-by), id_else[49]));
        rrfD_2.id_byte(ml_1, f, f2, f4, f5, q_, ColorHelper.id_break(n_, n));
        rrfD_2.id_byte(ml_1, f, f3, f4, f5, ColorHelper.id_break(n_, n2), q_);
    }

    @Override
    public boolean id_class(char c, int n) {
        this.id_interface();
        return ((rrZy_1)this.id_new[id_this[30]]).id_class(c, n) || this.id_native().id_class(c, n) ? id_return[6] : id_return[7];
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_interface();
        ((rrZy_1)this.id_new[id_this[19]]).id_class(rrtu_32, (int)((Integer)rrvk_1.id_class[id_this[20]]), (int)((Integer)rrvk_1.id_class[id_this[21]]), n3, bl);
        ((rrZt_1)this.id_new[id_this[22]]).id_class(rrtu_32, (int)((Integer)rrvk_1.id_class[id_this[23]]), (int)((Integer)rrvk_1.id_class[id_this[24]]), n3, bl);
        ((rruL)this.id_new[id_this[25]]).id_class(rrtu_32, (Integer)rrvk_1.id_class[id_this[26]], (Integer)rrvk_1.id_class[id_this[27]], n3, id_return[4]);
        rrZN rrZN2 = this.id_native();
        if (!rrZN2.id_class(rrtu_32, (int)((Integer)rrvk_1.id_class[id_this[28]]), (int)((Integer)rrvk_1.id_class[id_this[29]]), n3, bl)) {
            for (rrZN rrZN3 : this.id_extends().id_break()) {
                if (rrZN3 == rrZN2) continue;
                rrZN3.id_throws();
            }
        }
        return id_return[5];
    }

    private void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, boolean bl) {
        this.id_interface();
        ((rrZy_1)this.id_new[id_this[60]]).id_class(ml_1, rrtu_32, f + id_else[40] + id_else[41], f2, id_else[42], id_else[43], (Integer)rrvk_1.id_class[id_this[61]], (Integer)rrvk_1.id_class[id_this[62]], bl);
        ((rruL)this.id_new[id_this[63]]).id_class(ml_1, rrtu_32, (Integer)rrvk_1.id_class[id_this[64]], (Integer)rrvk_1.id_class[id_this[65]], id_return[11], id_return[12]);
    }

    private void id_class(ClickGuiScreen clickGuiScreen, rrtu_3 rrtu_32) {
        ClickGuiTheme clickGuiTheme = new ClickGuiTheme(clickGuiScreen, () -> Float.valueOf(rfU_2.id_class((float)clickGuiScreen.id_abstract() - ((ClickGuiTheme)id_continue[id_this[80]]).id_implements() - id_else[69], id_else[70], id_const.id_volatile() - id_else[71])), () -> Float.valueOf(clickGuiScreen.id_finally()));
        rrvJ.id_continue[rrvJ.id_this[5]] = clickGuiTheme;
        rrtu_32.id_break(clickGuiTheme);
    }

    @Override
    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        this.id_interface();
        short s = id_this[11];
        short s2 = id_this[12];
        int n3 = ColorHelper.id_class(id_else[3]);
        int n4 = ColorHelper.id_class(id_else[4]);
        int n5 = ColorHelper.id_class(id_else[5]);
        int n6 = ColorHelper.id_class(id_else[6]);
        this.id_break(ml_1, f, f2, s, s2);
        if (((ClickGuiScreen)this.id_new[id_this[13]]).id_long()) {
            return id_return[2];
        }
        this.id_class(ml_1, f, f2, n3, n4, n5, n6);
        ((rrZt_1)this.id_new[id_this[14]]).id_class(ml_1, rrtu_32, f, f2, id_else[7], s2, (Integer)rrvk_1.id_class[id_this[15]], (Integer)rrvk_1.id_class[id_this[16]], bl);
        this.id_class(ml_1, rrtu_32, f, f2 + id_else[8], bl);
        this.id_native().id_class(ml_1, rrtu_32, f, f2, s, s2, (Integer)rrvk_1.id_class[id_this[17]], (Integer)rrvk_1.id_class[id_this[18]], bl);
        this.id_byte(ml_1, f, f2, s, s2);
        return id_return[3];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{81, 66, 75, 40, -128, 86, 39, 112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(int n, int n2, int n3) {
        this.id_interface();
        ((rrZt_1)this.id_new[id_this[36]]).id_break((Integer)rrvk_1.id_class[id_this[37]], (Integer)rrvk_1.id_class[id_this[38]], n3);
        this.id_native().id_break((Integer)rrvk_1.id_class[id_this[39]], (Integer)rrvk_1.id_class[id_this[40]], n3);
        ((rrZy_1)this.id_new[id_this[41]]).id_break((Integer)rrvk_1.id_class[id_this[42]], (Integer)rrvk_1.id_class[id_this[43]], n3);
    }

    private void id_break(Ml_1 ml_1, float f, float f2, int n, int n2) {
        rrfD_2.id_class(ml_1, f, f2, (float)n, (float)n2, id_else[9], id_else[10], id_else[11], id_else[12], n_);
    }

    private static /* synthetic */ void ntfClinit() {
        rrvJ.id_public();
        rrvJ.id_package();
        rrvJ.id_new();
        rrvJ.id_try();
        rrvJ.id_synchronized();
        rrvJ.id_char();
    }

    public rrZy_1 id_finally() {
        this.id_interface();
        return (rrZy_1)this.id_new[id_this[69]];
    }

    @Override
    public void id_catch() {
        this.id_interface();
        super.id_catch();
        ((rrZt_1)this.id_new[id_this[48]]).id_catch();
        ((rrZy_1)this.id_new[id_this[49]]).id_catch();
        this.id_extends().id_break().forEach(rrZN::id_catch);
    }

    public rrZm_1 id_extends() {
        this.id_interface();
        return (rrZm_1)this.id_new[id_this[68]];
    }

    private static void id_new() {
        short[] sArray = new short[81];
        sArray[0] = 1;
        sArray[2] = 3;
        sArray[3] = 4;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 363;
        sArray[12] = 300;
        sArray[14] = 3;
        sArray[16] = 1;
        sArray[18] = 1;
        sArray[19] = 4;
        sArray[21] = 1;
        sArray[22] = 3;
        sArray[24] = 1;
        sArray[25] = 1;
        sArray[27] = 1;
        sArray[29] = 1;
        sArray[30] = 4;
        sArray[31] = 3;
        sArray[33] = 1;
        sArray[35] = 1;
        sArray[36] = 3;
        sArray[38] = 1;
        sArray[40] = 1;
        sArray[41] = 4;
        sArray[43] = 1;
        sArray[44] = 3;
        sArray[45] = 4;
        sArray[46] = 3;
        sArray[47] = 4;
        sArray[48] = 3;
        sArray[49] = 4;
        sArray[50] = 3;
        sArray[51] = 4;
        sArray[53] = 4;
        sArray[54] = 4;
        sArray[55] = 3;
        sArray[56] = 4;
        sArray[57] = 3;
        sArray[58] = 4;
        sArray[60] = 4;
        sArray[62] = 1;
        sArray[63] = 1;
        sArray[65] = 1;
        sArray[66] = 5;
        sArray[68] = 2;
        sArray[69] = 4;
        sArray[71] = 363;
        sArray[72] = 363;
        sArray[73] = 300;
        sArray[78] = 24;
        sArray[79] = 73;
        id_this = sArray;
    }

    private static void id_package() {
        id_super = new String[]{new String(""), new String("Celestial"), new String("\u0412\u044b\u0439\u0442\u0438")};
    }

    private static void id_try() {
        float[] fArray = new float[72];
        fArray[0] = 0.2f;
        fArray[1] = 0.2f;
        fArray[2] = 0.2f;
        fArray[4] = 90.0f;
        fArray[5] = 270.0f;
        fArray[6] = 180.0f;
        fArray[7] = 100.0f;
        fArray[8] = 9.0f;
        fArray[9] = 8.0f;
        fArray[10] = 8.0f;
        fArray[11] = 8.0f;
        fArray[12] = 8.0f;
        fArray[13] = 35.0f;
        fArray[14] = 12.0f;
        fArray[15] = 5.0f;
        fArray[16] = 4.0f;
        fArray[17] = 25.0f;
        fArray[18] = 25.0f;
        fArray[19] = 4.0f;
        fArray[20] = 5.0f;
        fArray[21] = 4.0f;
        fArray[22] = 25.0f;
        fArray[23] = 25.0f;
        fArray[24] = 4.0f;
        fArray[25] = 4.0f;
        fArray[26] = 4.0f;
        fArray[27] = 4.0f;
        fArray[28] = 5.5f;
        fArray[29] = 4.5f;
        fArray[30] = 24.0f;
        fArray[31] = 24.0f;
        fArray[32] = 0.5f;
        fArray[33] = 100.0f;
        fArray[34] = 1.0f;
        fArray[35] = 0.5f;
        fArray[36] = 100.0f;
        fArray[37] = 30.0f;
        fArray[38] = 4.0f;
        fArray[39] = 0.5f;
        fArray[40] = 100.0f;
        fArray[41] = 7.0f;
        fArray[42] = 215.0f;
        fArray[43] = 15.0f;
        fArray[44] = 30.0f;
        fArray[45] = 5.0f;
        fArray[46] = 255.0f;
        fArray[47] = 1.0f;
        fArray[48] = 255.0f;
        fArray[49] = 1.0f;
        fArray[50] = 12.0f;
        fArray[51] = 12.0f;
        fArray[52] = 19.0f;
        fArray[53] = 9.5f;
        fArray[54] = 12.0f;
        fArray[55] = 12.0f;
        fArray[56] = 35.0f;
        fArray[57] = 10.5f;
        fArray[58] = 16.0f;
        fArray[59] = 16.0f;
        fArray[60] = 5.0f;
        fArray[61] = 20.0f;
        fArray[62] = 18.0f;
        fArray[63] = 6.0f;
        fArray[64] = 10.0f;
        fArray[65] = 5.0f;
        fArray[66] = 5.0f;
        fArray[67] = 5.0f;
        fArray[68] = 5.0f;
        fArray[69] = 10.0f;
        fArray[70] = 5.0f;
        fArray[71] = 5.0f;
        id_else = fArray;
    }

    private static void id_public() {
        boolean[] blArray = new boolean[17];
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        id_return = blArray;
    }

    @Override
    public void id_protected() {
        this.id_interface();
        super.id_protected();
        ((rrZt_1)this.id_new[id_this[55]]).id_protected();
        ((rrZy_1)this.id_new[id_this[56]]).id_protected();
        this.id_extends().id_break().forEach(rrZN::id_protected);
    }

    @Override
    public void id_private() {
        this.id_interface();
        super.id_private();
        ((rrZt_1)this.id_new[id_this[50]]).id_private();
        ((rrZy_1)this.id_new[id_this[51]]).id_private();
        this.id_extends().id_break().forEach(rrZN::id_private);
    }

    public static void id_final() {
        rrfi_3.id_class();
    }

    public ClickGuiScreen id_volatile() {
        this.id_interface();
        return (ClickGuiScreen)this.id_new[id_this[67]];
    }

    private static void id_synchronized() {
        id_synchronized = new byte[]{100, 100, 3, 2, 2, 100, 30, 5, -1, 10, 5};
    }

    public rrZN id_native() {
        return this.id_class((Category)((Object)rrZt_1.id_byte[id_this[66]]));
    }

    @Override
    public rdn_3 ag_() {
        return this.id_native().ag_();
    }
}

