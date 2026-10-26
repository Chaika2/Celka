/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.rjK_2;
import celestial.rji_3;
import celestial.rrIX;
import celestial.rrQX;
import celestial.rrZD;
import celestial.rrZF;
import celestial.rrZH;
import celestial.rrZL;
import celestial.rrZN;
import celestial.rrZT;
import celestial.rrZU;
import celestial.rrZa_1;
import celestial.rrZl_1;
import celestial.rrZp_1;
import celestial.rrZq_1;
import celestial.rrtY_2;
import celestial.rrtu_3;
import celestial.rruF;
import celestial.rruH;
import celestial.rruL;
import celestial.rrup_1;
import celestial.rruu_1;
import celestial.rruv_1;
import celestial.rrvJ;
import celestial.rrvk_1;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.ui.clickgui.GuiComponent;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZw_1
extends rrZN
implements rrZT,
rrZq_1<rrZa_1> {
    private static short[] id_protected;
    private static String[] id_throws;
    public Object[] id_break;
    private static double[] id_case;
    private static float[] id_catch;
    public static Object[] id_byte;
    private static boolean[] id_private;
    private static byte[] id_implements;

    private static void id_char() {
        short[] sArray = new short[48];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[2] = 4;
        sArray[4] = 5;
        sArray[5] = 3;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[11] = 300;
        sArray[12] = 3;
        sArray[14] = 4;
        sArray[15] = 2;
        sArray[17] = 2;
        sArray[18] = 3;
        sArray[21] = 1;
        sArray[22] = 5;
        sArray[23] = 5;
        sArray[24] = 3;
        sArray[25] = 1;
        sArray[26] = 1;
        sArray[27] = 3;
        sArray[28] = 4;
        sArray[29] = 1;
        sArray[30] = 1;
        sArray[31] = 3;
        sArray[32] = 1;
        sArray[33] = 3;
        sArray[34] = 1;
        sArray[35] = 1;
        sArray[36] = 1;
        sArray[37] = 1;
        sArray[38] = 1;
        sArray[39] = 1;
        sArray[40] = 1;
        sArray[42] = 3;
        sArray[43] = 255;
        sArray[45] = 4;
        id_protected = sArray;
    }

    @Override
    public List<rrZa_1> id_byte() {
        this.id_volatile();
        Predicate<rrZa_1> predicate = rrZa_12 -> {
            this.id_volatile();
            rrIX rrIX2 = rrZa_12.id_extends();
            rrtY_2 rrtY_22 = ((rrvJ)this.id_break[id_protected[41]]).id_finally().id_extends();
            String string = rrtY_22.id_final();
            String string2 = rrIX2.id_class();
            String string3 = rrIX2.id_protected();
            if (rrtY_22.id_new()) {
                return id_private[16];
            }
            String string4 = string.trim().toLowerCase();
            return string2.toLowerCase().contains(string4) || string3.toLowerCase().contains(string4) ? id_private[17] : id_private[18];
        };
        return ((List)this.id_break[id_protected[26]]).stream().filter(predicate).toList();
    }

    @Override
    public void id_byte(int n, int n2, int n3) {
        super.id_byte(n, n2, n3);
        this.id_byte().forEach(rrZa_12 -> rrZa_12.id_break(n, n2, n3));
    }

    public rrZa_1 id_byte(String string) {
        this.id_volatile();
        return ((List)this.id_break[id_protected[39]]).stream().filter(rrZa_12 -> rrZa_12.id_extends().id_class().equals(string)).findFirst().orElse(null);
    }

    public rrZw_1(rrvJ rrvJ2, float f, float f2) {
        ArrayList arrayList;
        this.id_volatile();
        this.id_break[rrZw_1.id_protected[0]] = arrayList = new ArrayList();
        rruL rruL2 = new rruL();
        this.id_break[rrZw_1.id_protected[1]] = rruL2;
        AnimValue animValue = new AnimValue(id_catch[0], id_private[0]);
        this.id_break[rrZw_1.id_protected[2]] = animValue;
        rrvJ rrvJ3 = rrvJ2;
        this.id_break[rrZw_1.id_protected[3]] = rrvJ3;
        Float f3 = Float.valueOf(f);
        this.id_break[rrZw_1.id_protected[4]] = f3;
        rrZl_1 rrZl_12 = new rrZl_1(new rrZH(id_catch[1]));
        this.id_break[rrZw_1.id_protected[5]] = rrZl_12;
        Supplier<Float> supplier = () -> Float.valueOf((float)rrvJ2.id_volatile().id_abstract() + f);
        Supplier<Float> supplier2 = () -> Float.valueOf((float)rrvJ2.id_volatile().id_finally() + f2);
        float f4 = id_catch[2] - f - id_catch[3];
        float f5 = id_catch[4];
        rrZp_1[] rrZp_1Array = new rrZp_1[id_implements[0]];
        rrZp_1Array[rrZw_1.id_private[1]] = new rrZD(this, supplier, supplier2, f4, f5);
        rrZp_1Array[rrZw_1.id_private[2]] = new rrZU();
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[6]]).id_catch().id_class(rrZp_1Array);
        for (rrIX rrIX2 : ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[7]]).id_catch().id_break()) {
            rrZa_1 rrZa_12 = new rrZa_1(this, rrIX2, supplier, supplier2, f4, f5);
            rrZa_12.id_private();
            ((List)this.id_break[id_protected[8]]).add(rrZa_12);
        }
        this.id_class(supplier, supplier2, f4);
    }

    static {
        rrZw_1.ntfClinit();
    }

    private static void id_this() {
        id_throws = new String[]{new String("Create")};
    }

    @Override
    public void id_class(Category category, Category category2) {
        this.id_volatile();
        super.id_class(category, category2);
        ((AnimValue)this.id_break[id_protected[28]]).id_extends();
        ((List)this.id_break[id_protected[29]]).forEach(rrZa_12 -> rrZa_12.id_class(category, category2));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBD12F64A4892D8FAL;
    }

    @Override
    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        this.id_volatile();
        rrZH rrZH2 = ((rrZl_1)this.id_break[id_protected[12]]).id_extends();
        int n3 = this.id_break();
        int n4 = rrZw_1.id_try();
        int n5 = rrZw_1.id_class(n4);
        this.id_implements().id_class(() -> {
            Object object;
            this.id_volatile();
            List<rrZa_1> list = this.id_byte();
            AnimValue animValue = this.id_implements().id_class();
            float f4 = id_catch[21];
            animValue.id_class(!this.ai_() ? id_private[19] : id_private[20]);
            rrZH2.id_class(n3, n5 + id_implements[7]);
            float f5 = (id_catch[22] - animValue.id_byte()) * id_catch[23];
            for (rrZa_1 rrZa_12 : list) {
                ((AnimValue)object).id_class(!((AnimValue)(object = rrZa_12.id_volatile())).id_new() ? id_private[21] : id_private[22]);
                rrZa_12.id_class((f4 += (float)n4 * ((AnimValue)object).id_byte()) + rrZH2.id_case() + f5);
                AnimValue animValue2 = rrZa_12.id_package();
                animValue2.id_class(!rrZa_12.id_package().id_new() ? id_private[23] : id_private[24]);
            }
            for (int i = list.size() - id_private[25]; i >= 0; --i) {
                rrZa_1 rrZa_12;
                rrZa_12 = list.get(i);
                object = rrZa_12.id_protected();
                if (((rruv_1)object).id_protected() < f2 || ((rruv_1)object).id_protected() > f2 + (float)n5 + (float)n4 + id_catch[24]) continue;
                rrZa_12.id_class(ml_1, rrtu_32, n, n2, (rruv_1)object, bl, id_private[26]);
            }
            this.id_implements().id_class(ml_1, (rrZl_1)this.id_break[id_protected[42]], rrtu_32, f + f3 - id_catch[25], f2 + id_catch[26] + (float)n4, n, n2, id_catch[27], n5 - id_implements[8], n3 - id_implements[9], id_protected[43], bl);
        }, ml_1, f + id_catch[5] + id_catch[6], f2, id_catch[7], id_catch[8]);
        rrvJ.id_class(ml_1, rrZH2, f + id_catch[9] + id_catch[10], f2 + id_catch[11] + id_catch[12], f2 + (float)n5 + (float)n4 - id_catch[13], id_catch[14], id_catch[15]);
        AnimValue animValue = ((rrvJ)this.id_break[id_protected[13]]).id_finally().id_finally();
        ((AnimValue)this.id_break[id_protected[14]]).id_class(animValue.id_protected());
        ((rruL)this.id_break[id_protected[15]]).id_class(ml_1, rrtu_32, n, n2, bl, id_private[5]);
        return id_private[6];
    }

    private void id_class(Supplier<Float> supplier, Supplier<Float> supplier2, float f) {
        this.id_volatile();
        Runnable runnable = () -> {
            int n = id_private[27];
            String string = "NewConfig" + n;
            while (((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[46]]).id_catch().id_byte(string)) {
                string = "NewConfig" + ++n;
            }
            ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_protected[47]]).id_catch().id_byte(string, id_private[28]);
        };
        Supplier<rji_3> supplier3 = () -> new rji_3(ColorHelper.id_class(id_catch[37]), ColorHelper.id_class(id_catch[38]), ColorHelper.id_class(id_catch[39]), ColorHelper.id_class(id_catch[40]));
        rruF[] rruFArray = new rruF[id_private[3]];
        rruFArray[rrZw_1.id_private[4]] = new rruF((rruu_1)((rrup_1)new rruH(() -> rrZL.id_case, () -> new rjK_2(id_catch[35], id_catch[36]), () -> new rjK_2(id_catch[33], id_catch[34]), () -> rrZF.d_, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_protected[10]]).id_finally(), () -> id_throws[0], () -> new rjK_2(((Float)supplier.get()).floatValue() + f - id_catch[32], ((Float)supplier2.get()).floatValue()), () -> new rjK_2(id_catch[30], id_catch[31]), () -> new rjK_2(id_catch[28], id_catch[29]), () -> rrZF.d_, supplier3).id_break(ClickGuiTheme::id_class)).id_class(() -> {
            this.id_volatile();
            return Float.valueOf(((AnimValue)this.id_break[id_protected[45]]).id_byte() * this.id_implements().id_class().id_byte());
        })).id_class(() -> {
            this.id_volatile();
            ((rrvJ)this.id_break[id_protected[44]]).id_finally().id_extends().id_int();
            runnable.run();
        });
        ((rruL)this.id_break[id_protected[9]]).id_class(rruFArray);
    }

    @Override
    public boolean id_class(char c, int n) {
        return this.id_byte().stream().anyMatch(rrZa_12 -> rrZa_12.id_class(c, n));
    }

    public void id_class(int n, rrZa_1 rrZa_12) {
        this.id_volatile();
        ((List)this.id_break[id_protected[36]]).add(n, rrZa_12);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_volatile();
        ClickGuiScreen clickGuiScreen = ((rrvJ)this.id_break[id_protected[16]]).id_volatile();
        int n4 = clickGuiScreen.id_abstract();
        int n5 = clickGuiScreen.id_finally();
        ((rruL)this.id_break[id_protected[17]]).id_class(rrtu_32, n, n2, n3, bl);
        if (!this.id_class(n, n2, n4 + id_implements[3], n5 + id_implements[4] + id_implements[5], id_catch[16], id_catch[17])) {
            this.id_throws();
            return id_private[7];
        }
        if (!super.id_class(rrtu_32, n, n2, n3, bl)) {
            return id_private[8];
        }
        ((rrZl_1)this.id_break[id_protected[18]]).id_class(rrtu_32, n, n2, n3, bl);
        List<rrZa_1> list = this.id_byte();
        for (int i = list.size() - id_private[9]; i >= 0; --i) {
            rrZa_1 rrZa_12 = list.get(i);
            rrZa_12.id_class(rrtu_32, n, n2, n3, bl);
        }
        return id_private[10];
    }

    private static int id_class(int n) {
        return id_protected[11] - n - id_implements[2];
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl) {
        this.id_volatile();
        ClickGuiScreen clickGuiScreen = ((rrvJ)this.id_break[id_protected[19]]).id_volatile();
        int n3 = rrZw_1.id_try();
        int n4 = rrZw_1.id_class(n3);
        boolean bl2 = this.id_class((Integer)rrvk_1.id_class[id_protected[20]], (Integer)rrvk_1.id_class[id_protected[21]], (float)clickGuiScreen.id_abstract() + ((Float)this.id_break[id_protected[22]]).floatValue(), clickGuiScreen.id_finally() + n3, id_catch[18] - ((Float)this.id_break[id_protected[23]]).floatValue() - id_catch[19], n4);
        ((rrZl_1)this.id_break[id_protected[24]]).id_extends().id_class(bl2 && super.id_class(rrtu_32, n, n2, d, bl) ? id_private[11] : id_private[12], d, id_case[0]);
        this.id_byte().forEach(rrZa_12 -> rrZa_12.id_class(rrtu_32, n, n2, d, bl2, bl));
        return id_private[13];
    }

    public void id_class(rrZa_1 rrZa_12) {
        this.id_volatile();
        ((List)this.id_break[id_protected[35]]).add(rrZa_12);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        return this.id_byte().stream().anyMatch(rrZa_12 -> rrZa_12.id_class(n, n2, n3));
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9B419E81;
    }

    public void id_break(rrZa_1 rrZa_12) {
        this.id_volatile();
        ((List)this.id_break[id_protected[37]]).remove(rrZa_12);
    }

    @Override
    public int id_break() {
        List<rrZa_1> list = this.id_byte();
        return list.stream().mapToInt(rrZa_12 -> (int)(rrZa_12.id_catch() + id_catch[20])).sum() + id_implements[6];
    }

    @Override
    public void id_break(int n, int n2, int n3) {
        this.id_volatile();
        ((rrZl_1)this.id_break[id_protected[27]]).id_break(n, n2, n3);
    }

    public void id_break(String string) {
        this.id_volatile();
        ((List)this.id_break[id_protected[38]]).remove(this.id_byte(string));
    }

    @Override
    public void id_throws() {
        this.id_byte().forEach(rrZa_1::an_);
    }

    private static /* synthetic */ void ntfClinit() {
        rrZw_1.id_return();
        rrZw_1.id_this();
        rrZw_1.id_char();
        rrZw_1.id_synchronized();
        rrZw_1.id_goto();
        rrZw_1.id_instanceof();
        rrZw_1.id_public();
    }

    public List<rrZa_1> id_finally() {
        this.id_volatile();
        return (List)this.id_break[id_protected[40]];
    }

    @Override
    public void id_catch() {
        this.id_volatile();
        super.id_catch();
        ((List)this.id_break[id_protected[30]]).forEach(rrZa_1::am_);
    }

    public List<rrZa_1> id_extends() {
        this.id_volatile();
        return ((List)this.id_break[id_protected[34]]).stream().filter(rrZa_12 -> !rrZa_12.id_package().id_new() ? id_private[14] : id_private[15]).toList();
    }

    private static void id_goto() {
        id_case = new double[]{25.0};
    }

    @Override
    public rrZl_1 id_case() {
        this.id_volatile();
        return (rrZl_1)this.id_break[id_protected[33]];
    }

    private static void id_instanceof() {
        id_implements = new byte[]{2, 32, 10, 100, 30, 4, 6, 5, 7, 12, 6, 5, 2, 26, 32};
    }

    private static void id_return() {
        boolean[] blArray = new boolean[31];
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[30] = true;
        id_private = blArray;
    }

    private static int id_try() {
        return id_implements[1];
    }

    private static void id_public() {
        Object[] objectArray = new Object[]{26, 32};
        id_byte = objectArray;
    }

    @Override
    public void id_protected() {
        this.id_volatile();
        super.id_protected();
        ((List)this.id_break[id_protected[25]]).forEach(rrZa_1::al_);
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{103, -62, -97, -52, 93, -61, 127, -77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_private() {
        this.id_volatile();
        super.id_private();
        ((rrZl_1)this.id_break[id_protected[31]]).id_private();
        ((List)this.id_break[id_protected[32]]).forEach(GuiComponent::id_final);
    }

    private void id_volatile() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_implements[10]];
            objectArray[rrZw_1.id_implements[11]] = Float.valueOf(id_catch[41]);
        }
    }

    private static void id_synchronized() {
        float[] fArray = new float[42];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 363.0f;
        fArray[3] = 7.0f;
        fArray[4] = 26.0f;
        fArray[5] = 100.0f;
        fArray[6] = 1.0f;
        fArray[7] = 262.0f;
        fArray[8] = 299.0f;
        fArray[9] = 100.0f;
        fArray[10] = 1.0f;
        fArray[11] = 30.0f;
        fArray[12] = 4.0f;
        fArray[13] = 10.0f;
        fArray[14] = 253.0f;
        fArray[15] = 20.0f;
        fArray[16] = 263.0f;
        fArray[17] = 266.0f;
        fArray[18] = 363.0f;
        fArray[19] = 5.0f;
        fArray[20] = 6.0f;
        fArray[22] = 1.0f;
        fArray[23] = 5.0f;
        fArray[24] = 10.0f;
        fArray[25] = 9.0f;
        fArray[26] = 10.0f;
        fArray[27] = 5.0f;
        fArray[28] = 16.5f;
        fArray[29] = 4.5f;
        fArray[30] = 47.0f;
        fArray[31] = 12.0f;
        fArray[32] = 81.0f;
        fArray[33] = 8.0f;
        fArray[34] = 8.0f;
        fArray[35] = 4.0f;
        fArray[36] = 2.0f;
        fArray[38] = 90.0f;
        fArray[39] = 270.0f;
        fArray[40] = 180.0f;
        id_catch = fArray;
    }
}

