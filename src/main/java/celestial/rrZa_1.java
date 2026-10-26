/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.rjK_2;
import celestial.rji_3;
import celestial.rrIX;
import celestial.rrIv_1;
import celestial.rrQX;
import celestial.rrZF;
import celestial.rrZI;
import celestial.rrZL;
import celestial.rrZN;
import celestial.rrZO;
import celestial.rrZw_1;
import celestial.rrfD_2;
import celestial.rrtK_2;
import celestial.rrtQ_2;
import celestial.rrtR_2;
import celestial.rrtY_2;
import celestial.rrte_3;
import celestial.rrth_3;
import celestial.rrtu_3;
import celestial.rrtx_3;
import celestial.rruF;
import celestial.rruH;
import celestial.rruL;
import celestial.rrun_1;
import celestial.rrup_1;
import celestial.rruu_1;
import celestial.rruv_1;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.ui.clickgui.GuiComponent;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Map;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrZa_1
extends GuiComponent {
    private static short[] id_break;
    private static String[] id_byte;
    public Object[] id_class;
    private static float[] id_protected;
    private static boolean[] id_throws;
    private static byte[] id_case;
    private static int[] id_catch;

    private static void id_boolean() {
        short[] sArray = new short[79];
        sArray[0] = 4;
        sArray[1] = 5;
        sArray[2] = 6;
        sArray[3] = 3;
        sArray[4] = 2;
        sArray[6] = 1;
        sArray[7] = 9;
        sArray[8] = 10;
        sArray[9] = 6;
        sArray[10] = 1;
        sArray[11] = 7;
        sArray[12] = 4;
        sArray[15] = 2;
        sArray[16] = 7;
        sArray[18] = 3;
        sArray[19] = 5;
        sArray[20] = 4;
        sArray[21] = 2;
        sArray[22] = 2;
        sArray[23] = 2;
        sArray[24] = 7;
        sArray[25] = 4;
        sArray[26] = 4;
        sArray[27] = 7;
        sArray[28] = 7;
        sArray[29] = 7;
        sArray[30] = 7;
        sArray[31] = 7;
        sArray[32] = 7;
        sArray[33] = 7;
        sArray[34] = 7;
        sArray[35] = 8;
        sArray[38] = 1500;
        sArray[39] = 7;
        sArray[40] = 2;
        sArray[41] = 2;
        sArray[42] = 2;
        sArray[43] = 2;
        sArray[45] = 1500;
        sArray[46] = 3;
        sArray[47] = 3;
        sArray[48] = 4;
        sArray[49] = 4;
        sArray[50] = 3;
        sArray[51] = 5;
        sArray[52] = 5;
        sArray[53] = 5;
        sArray[55] = 6;
        sArray[56] = 2;
        sArray[58] = 1;
        sArray[59] = 11;
        sArray[60] = 9;
        sArray[61] = 10;
        sArray[62] = 11;
        sArray[63] = 5;
        sArray[64] = 6;
        sArray[65] = 6;
        sArray[66] = 6;
        sArray[67] = 5;
        sArray[68] = 3;
        sArray[69] = 3;
        sArray[70] = 270;
        sArray[71] = 180;
        sArray[73] = 2;
        sArray[75] = 2;
        sArray[76] = 5;
        sArray[77] = 6;
        sArray[78] = 8;
        id_break = sArray;
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{99, -126, -82, 82, -59, -51, 11, -126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public boolean id_int() {
        this.id_new();
        return ((AnimValue)this.id_class[id_break[55]]).id_catch();
    }

    private float id_long() {
        this.id_new();
        return ((AnimValue)this.id_class[id_break[67]]).id_byte() * ((rrZw_1)this.id_class[id_break[68]]).id_implements().id_class().id_byte();
    }

    public rrZa_1(rrZw_1 rrZw_12, rrIX rrIX2, Supplier<Float> supplier, Supplier<Float> supplier2, float f, float f2) {
        Supplier<Float> supplier3;
        Supplier<Float> supplier4;
        this.id_new();
        rruL rruL2 = new rruL();
        this.id_class[rrZa_1.id_break[0]] = rruL2;
        AnimValue animValue = new AnimValue(id_protected[0], id_throws[0]);
        this.id_class[rrZa_1.id_break[1]] = animValue;
        AnimValue animValue2 = new AnimValue(id_protected[1], id_throws[1]);
        this.id_class[rrZa_1.id_break[2]] = animValue2;
        rrZw_1 rrZw_13 = rrZw_12;
        this.id_class[rrZa_1.id_break[3]] = rrZw_13;
        rrIX rrIX3 = rrIX2;
        this.id_class[rrZa_1.id_break[4]] = rrIX3;
        this.id_class[rrZa_1.id_break[5]] = supplier4 = supplier;
        this.id_class[rrZa_1.id_break[6]] = supplier3 = supplier2;
        Float f3 = Float.valueOf(f);
        this.id_class[rrZa_1.id_break[7]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrZa_1.id_break[8]] = f4;
        rrtY_2 rrtY_23 = new rrtY_2(new rrIv_1(rrIX2.id_class(), rrte_3.id_class((Pattern)rrtR_2.id_class[id_break[9]])).id_class((Object)rrIX2.id_class()), (rrtK_2)((Object)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[id_break[10]])).id_class((rrtY_2 rrtY_22) -> this.an_()).id_class(() -> Float.valueOf(f / id_protected[43])).id_break(this::id_long).id_break(rrtY_22 -> {
            this.id_new();
            String string = rrIX2.id_class();
            this.id_class[rrZa_1.id_break[78]] = string;
        });
        this.id_class[rrZa_1.id_break[11]] = rrtY_23;
        this.id_throw();
    }

    static {
        rrZa_1.ntfClinit();
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, rruv_1 rruv_12, boolean bl, boolean bl2) {
        this.id_new();
        super.id_class(ml_1, rrtu_32, n, n2, rruv_12, bl, bl2);
        if (this.id_int()) {
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[14]]).id_catch().id_break((rrIX)this.id_class[id_break[15]], id_throws[4]);
            ((rrtY_2)this.id_class[id_break[16]]).id_throws();
            return;
        }
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[17]]).id_class();
        float f = rruv_12.id_break();
        float f2 = rruv_12.id_protected();
        int n3 = (int)rruv_12.id_byte();
        int n4 = (int)rruv_12.id_class();
        float f3 = ((rrZw_1)this.id_class[id_break[18]]).id_implements().id_class().id_byte();
        int n5 = (int)(id_protected[5] * ((AnimValue)this.id_class[id_break[19]]).id_byte() * f3);
        int n6 = ColorHelper.id_break((int)((Integer)rrZI.id_break[id_break[20]]), n5);
        rrfD_2.id_class(ml_1, f, f2, (float)n3, (float)n4, id_protected[6], id_protected[7], id_protected[8], id_protected[9], rrZF.n_);
        rrfD_2.id_break(ml_1, f, f2, n3, n4, id_protected[10], n6, n6, n6, n6);
        String string = ((rrIX)this.id_class[id_break[21]]).id_class();
        String string2 = ((rrIX)this.id_class[id_break[22]]).id_protected();
        String string3 = ((rrIX)this.id_class[id_break[23]]).id_break();
        String string4 = id_byte[0];
        String string5 = id_byte[1];
        float f4 = rrZO2.id_break(string4);
        float f5 = rrZO2.id_break(string3) + id_protected[11];
        float f6 = rrZO2.id_break(string5);
        ((rrtY_2)this.id_class[id_break[24]]).id_class(ml_1, rrtu_32, f + id_protected[12], f2 + id_protected[13], rrZO2.id_break(string) + id_protected[14], id_protected[15], n, n2, bl);
        int n7 = ColorHelper.id_break(id_catch[0], n5);
        rrZO2.id_break(ml_1, string4, f + id_protected[16], f2 + id_protected[17], n7, id_throws[5], id_throws[6]);
        rrZO2.id_class(ml_1, string3, (double)(f + f4 + id_protected[18]), (double)(f2 + id_protected[19]), (int)id_case[2], n5, id_throws[7]);
        rrZO2.id_break(ml_1, string5, f + f4 + f5, f2 + id_protected[20], n7, id_throws[8], id_throws[9]);
        rrZO2.id_class(ml_1, string2, (double)(f + f4 + f5 + f6 + id_protected[21]), (double)(f2 + id_protected[22]), (int)id_case[3], n5, id_throws[10]);
        ((rruL)this.id_class[id_break[25]]).id_class(ml_1, rrtu_32, n, n2, bl, bl2);
    }

    @Override
    public rrZN id_class() {
        this.id_new();
        return (rrZw_1)this.id_class[id_break[50]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB695AE271524457L;
    }

    @Override
    public boolean id_class(char c, int n) {
        this.id_new();
        return ((rrtY_2)this.id_class[id_break[30]]).id_class(c, n);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl, boolean bl2) {
        this.id_abstract();
        return super.id_class(rrtu_32, n, n2, d, bl, bl2);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_new();
        if (this.id_protected().id_break(n, n2)) {
            boolean bl2;
            boolean bl3 = ((rruL)this.id_class[id_break[26]]).id_class(rrtu_32, n, n2, n3, bl);
            boolean bl4 = bl2 = ((rrtY_2)this.id_class[id_break[27]]).id_class(rrtu_32, n, n2, n3, bl) || bl3 ? id_throws[11] : id_throws[12];
            if (n3 == 0 && bl2) {
                return id_throws[13];
            }
        }
        this.an_();
        return id_throws[14];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x76117674;
    }

    public String id_class(String string) {
        if (string.isEmpty()) {
            return id_byte[5];
        }
        if (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[54]]).id_catch().id_byte(string)) {
            return id_byte[6];
        }
        return null;
    }

    @Override
    public void id_class(Category category, Category category2) {
        this.id_new();
        super.id_class(category, category2);
        if (category2 == (Category)((Object)Category.staticFieldse67813cd60183787b1de54ac6b91c916[id_break[51]])) {
            ((AnimValue)this.id_class[id_break[52]]).id_extends();
        }
    }

    public void id_class(float f) {
        this.id_new();
        Float f2 = Float.valueOf(f);
        this.id_class[rrZa_1.id_break[62]] = f2;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_new();
        return ((rrtY_2)this.id_class[id_break[28]]).id_class(n, n2, n3);
    }

    public float id_break() {
        this.id_new();
        return ((Float)((Supplier)this.id_class[id_break[58]]).get()).floatValue() + ((Float)this.id_class[id_break[59]]).floatValue();
    }

    @Override
    public void id_break(int n, int n2, int n3) {
        this.id_new();
        super.id_break(n, n2, n3);
        ((rrtY_2)this.id_class[id_break[29]]).id_byte(n, n2, n3);
    }

    private static /* synthetic */ void ntfClinit() {
        rrZa_1.id_super();
        rrZa_1.id_synchronized();
        rrZa_1.id_boolean();
        rrZa_1.id_switch();
        rrZa_1.id_import();
        rrZa_1.id_try();
    }

    public float id_catch() {
        this.id_new();
        return ((Float)this.id_class[id_break[61]]).floatValue();
    }

    public rrIX id_extends() {
        this.id_new();
        return (rrIX)this.id_class[id_break[56]];
    }

    public float id_case() {
        this.id_new();
        return ((Float)((Supplier)this.id_class[id_break[57]]).get()).floatValue();
    }

    private static void id_import() {
        id_case = new byte[]{3, 2, 15, 15, 100, 90, 12, 9, 10, 11};
    }

    private void id_new() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[6]];
            objectArray[rrZa_1.id_case[7]] = Float.valueOf(id_protected[44]);
            objectArray[rrZa_1.id_case[8]] = Float.valueOf(id_protected[45]);
            objectArray[rrZa_1.id_case[9]] = Float.valueOf(id_protected[46]);
        }
    }

    public AnimValue id_package() {
        this.id_new();
        return (AnimValue)this.id_class[id_break[63]];
    }

    private static void id_super() {
        boolean[] blArray = new boolean[20];
        blArray[3] = true;
        blArray[4] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[17] = true;
        id_throws = blArray;
    }

    private static void id_switch() {
        float[] fArray = new float[47];
        fArray[0] = 0.45f;
        fArray[1] = 0.45f;
        fArray[2] = 0.2f;
        fArray[3] = 0.2f;
        fArray[4] = 0.2f;
        fArray[5] = 255.0f;
        fArray[6] = 8.0f;
        fArray[7] = 8.0f;
        fArray[8] = 8.0f;
        fArray[9] = 8.0f;
        fArray[10] = 4.0f;
        fArray[11] = 10.0f;
        fArray[12] = 5.0f;
        fArray[13] = 6.0f;
        fArray[14] = 5.0f;
        fArray[15] = 4.0f;
        fArray[16] = 5.0f;
        fArray[17] = 16.0f;
        fArray[18] = 7.0f;
        fArray[19] = 16.0f;
        fArray[20] = 16.0f;
        fArray[21] = 2.0f;
        fArray[22] = 16.0f;
        fArray[23] = 8.0f;
        fArray[25] = 16.5f;
        fArray[26] = 4.5f;
        fArray[27] = 40.5f;
        fArray[28] = 12.0f;
        fArray[29] = 46.0f;
        fArray[30] = 7.0f;
        fArray[31] = 8.0f;
        fArray[32] = 8.0f;
        fArray[33] = 4.0f;
        fArray[34] = 2.0f;
        fArray[35] = 10.0f;
        fArray[36] = 10.0f;
        fArray[37] = 60.0f;
        fArray[38] = 8.0f;
        fArray[39] = 10.0f;
        fArray[40] = 10.0f;
        fArray[41] = 74.0f;
        fArray[42] = 8.0f;
        fArray[43] = 1.7f;
        id_protected = fArray;
    }

    private void id_throw() {
        this.id_new();
        Runnable runnable = () -> {
            this.id_new();
            ((AnimValue)this.id_class[id_break[76]]).id_class(id_throws[18]);
            ((AnimValue)this.id_class[id_break[77]]).id_class(id_throws[19]);
        };
        Runnable runnable2 = () -> {
            this.id_new();
            this.id_abstract();
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[74]]).id_catch().id_class((rrIX)this.id_class[id_break[75]], id_throws[17]);
        };
        Runnable runnable3 = () -> {
            this.id_new();
            this.id_abstract();
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[72]]).id_catch().id_byte((rrIX)this.id_class[id_break[73]], id_throws[16]);
        };
        Supplier<rji_3> supplier = () -> {
            this.id_new();
            int n = ((rrZw_1)this.id_class[id_break[69]]).id_extends().indexOf(this) * id_case[4];
            return new rji_3(ColorHelper.id_class((float)n), ColorHelper.id_class((float)(n + id_case[5])), ColorHelper.id_class((float)(n + id_break[70])), ColorHelper.id_class((float)(n + id_break[71])));
        };
        rruF[] rruFArray = new rruF[id_case[0]];
        rruFArray[rrZa_1.id_throws[2]] = new rruF((rruu_1)((rruu_1)new rrun_1(() -> rrZL.m_, () -> {
            rruv_1 rruv_12 = this.id_protected();
            return new rjK_2(rruv_12.id_break() + this.id_native() - id_protected[41], rruv_12.id_protected() + id_protected[42]);
        }, () -> new rjK_2(id_protected[39], id_protected[40]), () -> rrZF.d_).id_class(this::id_long)).id_class(id_protected[2])).id_class(runnable);
        rruFArray[rrZa_1.id_throws[3]] = new rruF((rruu_1)((rruu_1)new rrun_1(() -> rrZL.id_private, () -> {
            rruv_1 rruv_12 = this.id_protected();
            return new rjK_2(rruv_12.id_break() + this.id_native() - id_protected[37], rruv_12.id_protected() + id_protected[38]);
        }, () -> new rjK_2(id_protected[35], id_protected[36]), () -> rrZF.d_).id_class(this::id_long)).id_class(id_protected[3])).id_class(runnable3);
        rruFArray[rrZa_1.id_case[1]] = new rruF((rruu_1)((rruu_1)((rrup_1)new rruH(() -> rrZL.id_extends, () -> new rjK_2(id_protected[33], id_protected[34]), () -> new rjK_2(id_protected[31], id_protected[32]), () -> rrZF.d_, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_break[13]]).id_finally(), () -> id_byte[7], () -> {
            rruv_1 rruv_12 = this.id_protected();
            return new rjK_2(rruv_12.id_break() + this.id_native() - id_protected[29], rruv_12.id_protected() + id_protected[30]);
        }, () -> new rjK_2(id_protected[27], id_protected[28]), () -> new rjK_2(id_protected[25], id_protected[26]), () -> rrZF.d_, supplier).id_break(ClickGuiTheme::id_class)).id_class(this::id_long)).id_class(id_protected[4])).id_class(runnable2);
        ((rruL)this.id_class[id_break[12]]).id_class(rruFArray);
    }

    private static void id_try() {
        id_catch = new int[]{6781311};
    }

    @Override
    public rruv_1 id_protected() {
        this.id_new();
        float f = this.id_native();
        Pair<Float, Boolean> pair = ((rrZw_1)this.id_class[id_break[46]]).id_implements().id_class(((rrZw_1)this.id_class[id_break[47]]).id_case());
        float f2 = id_protected[23] * ((Float)pair.getLeft()).floatValue();
        if (((Boolean)pair.getRight()).booleanValue()) {
            f -= f2;
            ((rruL)this.id_class[id_break[48]]).id_break(-f2);
        } else {
            ((rruL)this.id_class[id_break[49]]).id_break(id_protected[24]);
        }
        return new rruv_1(this.id_case(), this.id_break(), f, this.id_catch());
    }

    public void id_private() {
        this.id_new();
        ((AnimValue)this.id_class[id_break[65]]).id_class(id_throws[15]);
        ((AnimValue)this.id_class[id_break[66]]).id_class();
    }

    private void id_abstract() {
        this.id_new();
        if (!((rrtY_2)this.id_class[id_break[32]]).aO_()) {
            return;
        }
        ((rrtY_2)this.id_class[id_break[33]]).id_throws();
        String string = ((rrtY_2)this.id_class[id_break[34]]).id_final();
        if (((String)this.id_class[id_break[35]]).equals(string)) {
            return;
        }
        Map<String, rrIX> map = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[36]]).id_catch().id_throws();
        String string2 = this.id_class(string);
        if (string2 != null) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[37]]).id_class(new rrtx_3(id_byte[2], string2, (int)id_break[38]));
            ((rrtY_2)this.id_class[id_break[39]]).id_byte(((rrIX)this.id_class[id_break[40]]).id_class());
            return;
        }
        map.remove(((rrIX)this.id_class[id_break[41]]).id_class());
        ((rrIX)this.id_class[id_break[42]]).id_protected(string);
        map.put(string, (rrIX)this.id_class[id_break[43]]);
        ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_break[44]]).id_class(new rrtQ_2(id_byte[3], id_byte[4], (int)id_break[45]));
    }

    public AnimValue id_volatile() {
        this.id_new();
        return (AnimValue)this.id_class[id_break[64]];
    }

    private static void id_synchronized() {
        id_byte = new String[]{new String("\u0421\u043e\u0437\u0434\u0430\u043d:"), new String("\u0410\u0432\u0442\u043e\u0440:"), new String("Configs"), new String("Configs"), new String("\u0418\u043c\u044f \u043a\u043e\u043d\u0444\u0438\u0433\u0430 \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u043e"), new String("\u0418\u043c\u044f \u043a\u043e\u043d\u0444\u0438\u0433\u0430 \u043d\u0435 \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u043f\u0443\u0441\u0442\u044b\u043c"), new String("\u0422\u0430\u043a\u043e\u0439 \u043a\u043e\u043d\u0444\u0438\u0433 \u0443\u0436\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442"), new String("Load")};
    }

    public float id_native() {
        this.id_new();
        return ((Float)this.id_class[id_break[60]]).floatValue();
    }

    @Override
    public void am_() {
        this.id_new();
        super.am_();
        ((AnimValue)this.id_class[id_break[53]]).id_extends();
    }

    @Override
    public void an_() {
        super.an_();
        this.id_abstract();
    }

    @Override
    public void al_() {
        this.id_new();
        super.al_();
        ((rrtY_2)this.id_class[id_break[31]]).id_protected();
    }
}

