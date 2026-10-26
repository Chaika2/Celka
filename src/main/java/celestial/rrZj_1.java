/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.module.Category;
import celestial.rdn_3;
import celestial.rql_3;
import celestial.rqy_3;
import celestial.rrFK;
import celestial.rrNF;
import celestial.rrNL;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrZH;
import celestial.rrZN;
import celestial.rrZO;
import celestial.rrZT;
import celestial.rrZV;
import celestial.rrZg_1;
import celestial.rrZl_1;
import celestial.rrZq_1;
import celestial.rrtY_2;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.rrvJ;
import celestial.rrvk_1;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.ui.clickgui.GuiComponent;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZj_1
extends rrZN
implements rrZT,
rrZq_1<GuiComponent> {
    private static byte[] id_protected;
    private static double[] id_throws;
    private static float[] id_case;
    public static Object[] id_break;
    private static long[] id_catch;
    private static boolean[] id_private;
    public Object[] id_byte;
    private static short[] id_implements;
    private static String[] id_finally;

    @Override
    public List<GuiComponent> id_byte() {
        this.id_native();
        rrtY_2 rrtY_22 = ((rrvJ)this.id_byte[id_implements[24]]).id_finally().id_extends();
        Predicate<GuiComponent> predicate = guiComponent -> {
            if (guiComponent instanceof rrZg_1) {
                rrZg_1 rrZg_12 = (rrZg_1)guiComponent;
                if (rrtY_22.id_new()) {
                    return id_private[26];
                }
                String string = rrZg_12.id_case().id_break().id_case();
                String string2 = rrtY_22.id_final();
                return string.toLowerCase().contains(string2.toLowerCase());
            }
            return id_private[27];
        };
        return ((List)this.id_byte[id_implements[25]]).stream().filter(predicate).toList();
    }

    @Override
    public void id_byte(int n, int n2, int n3) {
        super.id_byte(n, n2, n3);
        this.id_byte().forEach(guiComponent -> guiComponent.id_break(n, n2, n3));
    }

    private static void id_int() {
        id_finally = new String[]{new String("\u0412\u0441\u0435\u0433\u043e \u043f\u043e\u043a\u0443\u043f\u043e\u043a"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043a\u0443\u043f\u0438\u0442\u044c"), new String("\u0421\u0430\u043c\u044b\u0439 \u0447\u0430\u0441\u0442\u044b\u0439"), new String("\u041c\u0435\u0436\u0434\u0443 \u043f\u043e\u043a\u0443\u043f\u043a\u0430\u043c\u0438"), new String("\u041f\u043e\u0442\u0440\u0430\u0447\u0435\u043d\u043e")};
    }

    public rrZj_1(rrvJ rrvJ2, rrtu_3 rrtu_32, float f, float f2) {
        ArrayList arrayList;
        this.id_native();
        this.id_byte[rrZj_1.id_implements[0]] = arrayList = new ArrayList();
        AnimValue animValue = new AnimValue(id_case[0], id_private[0]);
        this.id_byte[rrZj_1.id_implements[1]] = animValue;
        rrvJ rrvJ3 = rrvJ2;
        this.id_byte[rrZj_1.id_implements[2]] = rrvJ3;
        rrtu_3 rrtu_33 = rrtu_32;
        this.id_byte[rrZj_1.id_implements[3]] = rrtu_33;
        Float f3 = Float.valueOf(f);
        this.id_byte[rrZj_1.id_implements[4]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_byte[rrZj_1.id_implements[5]] = f4;
        rrZl_1 rrZl_12 = new rrZl_1(new rrZH(id_case[1]));
        this.id_byte[rrZj_1.id_implements[6]] = rrZl_12;
    }

    static {
        rrZj_1.ntfClinit();
    }

    private static void id_this() {
        Object[] objectArray = new Object[]{26, 20, 10, 12, Float.valueOf(0.0f), new String("\u00a77"), new String("\u00a7f"), new String("\u00a77 \u00b7 ")};
        id_break = objectArray;
    }

    private static List<String> id_class(List<String> list, float f, rrZO rrZO2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : list) {
            String string2;
            String string3 = string2 = stringBuilder.isEmpty() ? string : stringBuilder + (String)id_break[id_implements[55]] + string;
            if (rrZO2.id_break(string2) <= f) {
                stringBuilder.setLength(id_private[19]);
                stringBuilder.append(string2);
                continue;
            }
            if (!stringBuilder.isEmpty()) {
                arrayList.add(stringBuilder.toString());
                stringBuilder.setLength(id_private[20]);
            }
            stringBuilder.append(string);
        }
        if (!stringBuilder.isEmpty()) {
            arrayList.add(stringBuilder.toString());
        }
        return arrayList;
    }

    @Override
    public void id_class(Category category, Category category2) {
        this.id_native();
        super.id_class(category, category2);
        ((AnimValue)this.id_byte[id_implements[27]]).id_extends();
        ((List)this.id_byte[id_implements[28]]).forEach(guiComponent -> guiComponent.id_class(category, category2));
    }

    private static String id_class(long l) {
        return "$" + rql_3.id_class((Number)l, (char)id_protected[13]);
    }

    @Override
    public boolean id_class(char c, int n) {
        super.id_class(c, n);
        return this.id_byte().stream().anyMatch(guiComponent -> guiComponent.id_class(c, n));
    }

    public boolean id_class(int n, int n2) {
        this.id_native();
        ClickGuiScreen clickGuiScreen = ((rrvJ)this.id_byte[id_implements[39]]).id_volatile();
        int n3 = clickGuiScreen.id_abstract();
        int n4 = clickGuiScreen.id_finally();
        return this.id_class(n, n2, n3 + id_protected[5], n4 + id_protected[6] + id_protected[7], id_case[31], id_case[32]);
    }

    private static int id_class(int n) {
        return id_implements[40] - n - id_protected[11];
    }

    public void id_class(rrNF rrNF2) {
        this.id_native();
        rrNL rrNL2 = rrNF2.id_class();
        if (rrNL2 == (rrNL)((Object)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[id_implements[7]])) {
            rrZj_1 rrZj_12 = this;
            Integer n = (Integer)rrZj_12.id_byte[id_implements[8]] + id_private[1];
            rrZj_12.id_byte[rrZj_1.id_implements[9]] = n;
            return;
        }
        if (rrNL2 != (rrNL)((Object)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[id_implements[10]])) {
            return;
        }
        ClickGuiScreen clickGuiScreen = ((rrvJ)this.id_byte[id_implements[11]]).id_volatile();
        Supplier<Float> supplier = () -> {
            this.id_native();
            return Float.valueOf((float)clickGuiScreen.id_abstract() + ((Float)this.id_byte[id_implements[76]]).floatValue());
        };
        Supplier<Float> supplier2 = () -> {
            this.id_native();
            return Float.valueOf((float)clickGuiScreen.id_finally() + ((Float)this.id_byte[id_implements[75]]).floatValue());
        };
        float f = id_case[2] - ((Float)this.id_byte[id_implements[12]]).floatValue() - id_case[3];
        float f2 = id_case[4];
        ((List)this.id_byte[id_implements[13]]).add(id_private[2], new rrZg_1(this, rrNF2, supplier, supplier2, f, f2));
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl) {
        this.id_native();
        ClickGuiScreen clickGuiScreen = ((rrvJ)this.id_byte[id_implements[18]]).id_volatile();
        int n3 = this.id_package();
        int n4 = rrZj_1.id_class(n3);
        boolean bl2 = this.id_class((Integer)rrvk_1.id_class[id_implements[19]], (Integer)rrvk_1.id_class[id_implements[20]], (float)clickGuiScreen.id_abstract() + ((Float)this.id_byte[id_implements[21]]).floatValue(), clickGuiScreen.id_finally() + n3, id_case[28] - ((Float)this.id_byte[id_implements[22]]).floatValue() - id_case[29], n4);
        ((rrZl_1)this.id_byte[id_implements[23]]).id_extends().id_class(bl2 && super.id_class(rrtu_32, n, n2, d, bl) ? id_private[10] : id_private[11], d, id_throws[0]);
        this.id_byte().forEach(guiComponent -> guiComponent.id_class(rrtu_32, n, n2, d, bl2, bl));
        return id_private[12];
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_native();
        if (!this.id_class(n, n2)) {
            this.id_throws();
            return id_private[6];
        }
        if (!super.id_class(rrtu_32, n, n2, n3, bl)) {
            return id_private[7];
        }
        ((rrZl_1)this.id_byte[id_implements[17]]).id_class(rrtu_32, n, n2, n3, bl);
        List<GuiComponent> list = this.id_byte();
        for (int i = list.size() - id_private[8]; i >= 0; --i) {
            GuiComponent guiComponent = list.get(i);
            guiComponent.id_class(rrtu_32, n, n2, n3, bl);
        }
        return id_private[9];
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        super.id_class(n, n2, n3);
        return this.id_byte().stream().anyMatch(guiComponent -> guiComponent.id_class(n, n2, n3));
    }

    @Override
    public void id_class(rrFK rrFK2) {
        this.id_native();
        super.id_class(rrFK2);
        ((AnimValue)this.id_byte[id_implements[35]]).id_extends();
        ((List)this.id_byte[id_implements[36]]).clear();
        Integer n = id_private[14];
        this.id_byte[rrZj_1.id_implements[37]] = n;
    }

    @Override
    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        this.id_native();
        rrZH rrZH2 = ((rrZl_1)this.id_byte[id_implements[14]]).id_extends();
        int n3 = this.id_break();
        int n4 = this.id_package();
        int n5 = rrZj_1.id_class(n4);
        int n6 = this.id_else().isEmpty() ? id_private[3] : Math.max(id_private[4], (int)((Float)this.id_byte[id_implements[15]]).floatValue() + n4 - id_protected[0] - id_protected[1]);
        this.id_implements().id_class(() -> {
            this.id_native();
            List<GuiComponent> list = this.id_byte();
            AnimValue animValue = this.id_implements().id_class();
            float f4 = id_case[45];
            animValue.id_class(!this.ai_() ? id_private[28] : id_private[29]);
            rrZH2.id_class(n3, n5 + id_protected[14]);
            float f5 = animValue.id_byte();
            float f6 = (id_case[46] - f5) * id_case[47];
            float f7 = n4;
            for (GuiComponent guiComponent : list) {
                rruv_1 rruv_12 = guiComponent.id_protected();
                if (guiComponent instanceof rrZg_1) {
                    rrZg_1 rrZg_12 = (rrZg_1)guiComponent;
                    f7 = rrZg_12.id_private() + id_case[48];
                    rrZg_12.id_class((f4 += f7) + rrZH2.id_case() + f6);
                    AnimValue animValue2 = rrZg_12.id_catch();
                    animValue2.id_class(!rrZg_12.id_catch().id_new() ? id_private[30] : id_private[31]);
                }
                guiComponent.id_break(ml_1, rrtu_32, n, n2, rruv_12, bl, id_private[32]);
                if (rruv_12.id_protected() < f2 || rruv_12.id_protected() > f2 + (float)n5 + (float)n4 + id_case[49]) continue;
                guiComponent.id_class(ml_1, rrtu_32, n, n2, rruv_12, bl, id_private[33]);
            }
            this.id_implements().id_class(ml_1, (rrZl_1)this.id_byte[id_implements[73]], rrtu_32, f + f3 - id_case[50], f2 + id_case[51] + (float)n4, n, n2, id_case[52], n5 - id_protected[15], n3 - id_protected[16], id_implements[74], bl);
        }, ml_1, f + id_case[5] + id_case[6], f2 + (float)n6, id_case[7], id_implements[16] - n6);
        List<String> list = this.id_else();
        float f5 = list.isEmpty() ? f2 + id_case[8] + id_case[9] : f2 + id_case[10] + id_case[11] + (float)(list.size() * id_protected[2]) - id_case[12];
        rrvJ.id_class(ml_1, rrZH2, f + id_case[13] + id_case[14], f5, f2 + (float)n5 + (float)n4 - id_case[15], id_case[16], id_case[17]);
        if (!list.isEmpty()) {
            float f6 = f2 + id_case[18] - id_case[19];
            float f7 = f2 + id_case[20] + id_case[21] + (float)(list.size() * id_protected[3]) + id_case[22];
            float f8 = f6 - id_case[23] - id_case[24];
            float f9 = f7 - f8;
            this.id_implements().id_class(() -> this.id_break(ml_1, f + id_case[43] + id_case[44], f2), ml_1, f + id_case[25] + id_case[26], f8, id_case[27], f9);
        }
        return id_private[5];
    }

    private static String id_class(String string, String string2) {
        return (String)id_break[id_implements[71]] + string + ": " + (String)id_break[id_implements[72]] + string2;
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4240BDD;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-16, -10, -77, -39, 64, -24, -55, -102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break(Ml_1 ml_1, float f, float f2) {
        this.id_native();
        List<String> list = this.id_else();
        ((AnimValue)this.id_byte[id_implements[56]]).id_class(!list.isEmpty() ? id_private[21] : id_private[22]);
        float f3 = ((AnimValue)this.id_byte[id_implements[57]]).id_byte();
        if (f3 <= id_case[34] || list.isEmpty()) {
            return;
        }
        float f4 = this.id_implements().id_class().id_byte();
        float f5 = f3 * f4;
        if (f5 <= id_case[35]) {
            return;
        }
        int n = (int)(id_case[36] * f5);
        int n2 = ColorHelper.id_break((int)id_protected[12], n);
        float f6 = (id_case[37] - f4) * id_case[38];
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_implements[58]]).id_class();
        float f7 = f2 + id_case[39] + id_case[40] + f6;
        for (String string : list) {
            rrZO2.id_protected(ml_1, string, f + id_case[41], f7, n2, id_private[23]);
            f7 += id_case[42];
        }
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE3C65C7B39A67A8CL;
    }

    @Override
    public void id_break(int n, int n2, int n3) {
        this.id_native();
        super.id_break(n, n2, n3);
        ((rrZl_1)this.id_byte[id_implements[26]]).id_break(n, n2, n3);
    }

    @Override
    public int id_break() {
        List<GuiComponent> list = this.id_byte();
        int n = id_private[13];
        for (GuiComponent guiComponent : list) {
            if (!(guiComponent instanceof rrZg_1)) continue;
            n += (int)(guiComponent.id_protected().id_class() + id_case[30]);
        }
        return n + id_protected[4];
    }

    @Override
    public void id_throws() {
        super.id_throws();
        this.id_byte().forEach(GuiComponent::an_);
    }

    private static /* synthetic */ void ntfClinit() {
        rrZj_1.id_new();
        rrZj_1.id_int();
        rrZj_1.id_super();
        rrZj_1.id_extends();
        rrZj_1.id_finally();
        rrZj_1.id_continue();
        rrZj_1.id_synchronized();
        rrZj_1.id_this();
    }

    private static void id_finally() {
        float[] fArray = new float[56];
        fArray[0] = 0.5f;
        fArray[1] = 0.5f;
        fArray[2] = 363.0f;
        fArray[3] = 7.0f;
        fArray[4] = 26.0f;
        fArray[5] = 100.0f;
        fArray[6] = 1.0f;
        fArray[7] = 262.0f;
        fArray[8] = 30.0f;
        fArray[9] = 4.0f;
        fArray[10] = 30.0f;
        fArray[11] = 12.0f;
        fArray[12] = 4.0f;
        fArray[13] = 100.0f;
        fArray[14] = 1.0f;
        fArray[15] = 10.0f;
        fArray[16] = 253.0f;
        fArray[17] = 20.0f;
        fArray[18] = 30.0f;
        fArray[19] = 8.0f;
        fArray[20] = 30.0f;
        fArray[21] = 12.0f;
        fArray[22] = 16.0f;
        fArray[23] = 30.0f;
        fArray[24] = 5.0f;
        fArray[25] = 100.0f;
        fArray[26] = 1.0f;
        fArray[27] = 254.0f;
        fArray[28] = 363.0f;
        fArray[29] = 5.0f;
        fArray[30] = 6.0f;
        fArray[31] = 263.0f;
        fArray[32] = 266.0f;
        fArray[33] = 239.0f;
        fArray[36] = 255.0f;
        fArray[37] = 1.0f;
        fArray[38] = 5.0f;
        fArray[39] = 30.0f;
        fArray[40] = 12.0f;
        fArray[41] = 6.0f;
        fArray[42] = 10.0f;
        fArray[43] = 100.0f;
        fArray[44] = 1.0f;
        fArray[46] = 1.0f;
        fArray[47] = 5.0f;
        fArray[48] = 6.0f;
        fArray[49] = 10.0f;
        fArray[50] = 9.0f;
        fArray[51] = 10.0f;
        fArray[52] = 5.0f;
        fArray[55] = 239.0f;
        id_case = fArray;
    }

    @Override
    public void id_catch() {
        this.id_native();
        super.id_catch();
        ((AnimValue)this.id_byte[id_implements[29]]).id_extends();
        ((List)this.id_byte[id_implements[30]]).forEach(GuiComponent::am_);
    }

    private static void id_extends() {
        short[] sArray = new short[77];
        sArray[0] = 3;
        sArray[1] = 6;
        sArray[2] = 2;
        sArray[3] = 4;
        sArray[5] = 1;
        sArray[6] = 5;
        sArray[7] = 2;
        sArray[8] = 7;
        sArray[9] = 7;
        sArray[10] = 1;
        sArray[11] = 2;
        sArray[13] = 3;
        sArray[14] = 5;
        sArray[15] = 1;
        sArray[16] = 299;
        sArray[17] = 5;
        sArray[18] = 2;
        sArray[20] = 1;
        sArray[23] = 5;
        sArray[24] = 2;
        sArray[25] = 3;
        sArray[26] = 5;
        sArray[27] = 6;
        sArray[28] = 3;
        sArray[29] = 6;
        sArray[30] = 3;
        sArray[31] = 6;
        sArray[32] = 5;
        sArray[33] = 3;
        sArray[34] = 3;
        sArray[35] = 6;
        sArray[36] = 3;
        sArray[37] = 7;
        sArray[38] = 5;
        sArray[39] = 2;
        sArray[40] = 300;
        sArray[43] = 2;
        sArray[44] = 2;
        sArray[46] = 5;
        sArray[47] = 6;
        sArray[48] = 7;
        sArray[49] = 7;
        sArray[50] = 4;
        sArray[51] = 5;
        sArray[52] = 4;
        sArray[54] = 1;
        sArray[55] = 7;
        sArray[56] = 6;
        sArray[57] = 6;
        sArray[59] = 3;
        sArray[60] = 1;
        sArray[63] = 1;
        sArray[64] = 1;
        sArray[65] = 3;
        sArray[66] = 5;
        sArray[67] = 5;
        sArray[68] = 4;
        sArray[69] = 2;
        sArray[70] = 2;
        sArray[71] = 5;
        sArray[72] = 6;
        sArray[73] = 5;
        sArray[74] = 255;
        sArray[75] = 1;
        id_implements = sArray;
    }

    @Override
    public rrZl_1 id_case() {
        this.id_native();
        return (rrZl_1)this.id_byte[id_implements[38]];
    }

    private static void id_continue() {
        id_throws = new double[]{25.0};
    }

    private List<String> id_else() {
        List<String> list = this.id_final();
        if (list.isEmpty()) {
            return List.of();
        }
        return rrZj_1.id_class(list, id_case[33], ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_implements[41]]).id_class());
    }

    private static void id_new() {
        boolean[] blArray = new boolean[39];
        blArray[0] = true;
        blArray[1] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[16] = true;
        blArray[17] = true;
        blArray[21] = true;
        blArray[24] = true;
        blArray[25] = true;
        blArray[26] = true;
        blArray[27] = true;
        blArray[28] = true;
        blArray[30] = true;
        blArray[35] = true;
        blArray[38] = true;
        id_private = blArray;
    }

    private int id_package() {
        int n = this.id_else().size();
        if (n == 0) {
            return id_protected[8];
        }
        return id_protected[9] + n * id_protected[10];
    }

    private static void id_super() {
        long[] lArray = new long[5];
        lArray[0] = Long.MAX_VALUE;
        lArray[3] = 1000L;
        id_catch = lArray;
    }

    @Override
    public void id_protected() {
        this.id_native();
        super.id_protected();
        ((List)this.id_byte[id_implements[34]]).forEach(GuiComponent::al_);
    }

    @Override
    public void id_private() {
        this.id_native();
        super.id_private();
        ((AnimValue)this.id_byte[id_implements[31]]).id_extends();
        ((rrZl_1)this.id_byte[id_implements[32]]).id_private();
        ((List)this.id_byte[id_implements[33]]).forEach(GuiComponent::id_final);
    }

    private List<String> id_final() {
        this.id_native();
        rrZV rrZV2 = this.id_volatile();
        ArrayList<String> arrayList = new ArrayList<String>();
        if ((Integer)rrZV2.id_class[id_implements[42]] == 0) {
            return arrayList;
        }
        long l = (Long)rrZV2.id_class[id_implements[43]] == id_catch[0] ? id_catch[1] : System.currentTimeMillis() - (Long)rrZV2.id_class[id_implements[44]];
        Object object = String.valueOf((Integer)rrZV2.id_class[id_implements[45]]);
        if (l > id_catch[2]) {
            object = (String)object + (String)id_break[id_implements[46]] + " \u0437\u0430 " + (String)id_break[id_implements[47]] + rql_3.id_class(Duration.ofMillis(l), new rqy_3[id_private[15]]);
        }
        arrayList.add(rrZj_1.id_class(id_finally[0], (String)object));
        if ((Integer)this.id_byte[id_implements[48]] > 0) {
            arrayList.add(rrZj_1.id_class(id_finally[1], String.valueOf((Integer)this.id_byte[id_implements[49]])));
        }
        if ((String)rrZV2.id_class[id_implements[50]] != null && (Integer)rrZV2.id_class[id_implements[51]] > id_private[16]) {
            arrayList.add(rrZj_1.id_class(id_finally[2], (String)rrZV2.id_class[id_implements[52]]));
        }
        if (l >= id_catch[3]) {
            long l2 = l / (long)Math.max(id_private[17], (Integer)rrZV2.id_class[id_implements[53]]);
            arrayList.add(rrZj_1.id_class(id_finally[3], "~" + rql_3.id_class(Duration.ofMillis(l2), new rqy_3[id_private[18]])));
        }
        arrayList.add(rrZj_1.id_class(id_finally[4], rrZj_1.id_class((Long)rrZV2.id_class[id_implements[54]])));
        return arrayList;
    }

    private rrZV id_volatile() {
        this.id_native();
        rrZV rrZV2 = new rrZV();
        for (GuiComponent guiComponent : (List)this.id_byte[id_implements[59]]) {
            long l;
            int n;
            rrNd_1 rrNd_12;
            rrNw_1 rrNw_12;
            rrZg_1 rrZg_12;
            rrNF rrNF2;
            if (!(guiComponent instanceof rrZg_1) || (rrNF2 = (rrZg_12 = (rrZg_1)guiComponent).id_case()).id_class() != (rrNL)((Object)rrNL.staticFields3858487aa6f43a4fb3e2f43fe4958927[id_implements[60]]) || (rrNw_12 = (rrNd_12 = rrNF2.id_break()).id_break()) == null) continue;
            rrZV rrZV3 = rrZV2;
            Integer n2 = (Integer)rrZV3.id_class[id_implements[61]] + id_private[24];
            rrZV3.id_class[rrZj_1.id_implements[62]] = n2;
            rrZV rrZV4 = rrZV2;
            Long l2 = (Long)rrZV4.id_class[id_implements[63]] + (long)rrNw_12.id_case();
            rrZV4.id_class[rrZj_1.id_implements[64]] = l2;
            String string = rrNd_12.id_case();
            if (string != null && !string.isEmpty() && (n = ((Map)rrZV2.id_class[id_implements[65]]).merge(string, id_private[25], Integer::sum).intValue()) > (Integer)rrZV2.id_class[id_implements[66]]) {
                Integer n3 = n;
                rrZV2.id_class[rrZj_1.id_implements[67]] = n3;
                String string2 = string;
                rrZV2.id_class[rrZj_1.id_implements[68]] = string2;
            }
            if ((l = rrZg_12.id_implements()) <= id_catch[4] || l >= (Long)rrZV2.id_class[id_implements[69]]) continue;
            Long l3 = l;
            rrZV2.id_class[rrZj_1.id_implements[70]] = l3;
        }
        return rrZV2;
    }

    private static void id_synchronized() {
        id_protected = new byte[]{30, 5, 10, 10, 6, 100, 30, 4, 20, 32, 10, 10, -1, 32, 5, 7, 12, 5, 6, 5, 7, 8, 7, 8, 26, 20, 2, 10, 3, 12, 4};
    }

    private void id_native() {
        if (this.id_byte == null) {
            Object[] objectArray = this.id_byte = new Object[id_protected[21]];
            objectArray[rrZj_1.id_private[34]] = Float.valueOf(id_case[53]);
            objectArray[rrZj_1.id_private[35]] = Float.valueOf(id_case[54]);
            objectArray[rrZj_1.id_protected[22]] = id_private[36];
        }
    }

    @Override
    public rdn_3 ag_() {
        for (GuiComponent guiComponent : this.id_byte()) {
            rdn_3 rdn_32 = guiComponent.id_byte();
            if (rdn_32 == null) continue;
            return rdn_32;
        }
        return null;
    }
}

