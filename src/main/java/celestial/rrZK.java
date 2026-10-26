/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.module.Category;
import celestial.rdn_3;
import celestial.rrNd_1;
import celestial.rrNh_1;
import celestial.rrZH;
import celestial.rrZN;
import celestial.rrZT;
import celestial.rrZY;
import celestial.rrZl_1;
import celestial.rrZq_1;
import celestial.rrfq_3;
import celestial.rrtY_2;
import celestial.rrtu_3;
import celestial.rruL;
import celestial.rruv_1;
import celestial.rrvJ;
import celestial.rrvk_1;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.ui.clickgui.GuiComponent;
import celestial.util.AnimValue;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZK
extends rrZN
implements rrZT,
rrZq_1<GuiComponent> {
    private static double[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_break;
    private static short[] id_case;
    private static float[] id_catch;
    public static Object[] id_byte;
    private static byte[] id_private;

    @Override
    public void id_byte(int n, int n2, int n3) {
        super.id_byte(n, n2, n3);
        this.id_byte().forEach(guiComponent -> guiComponent.id_break(n, n2, n3));
    }

    @Override
    public List<GuiComponent> id_byte() {
        this.id_package();
        rrtY_2 rrtY_22 = ((rrvJ)this.id_break[id_case[17]]).id_finally().id_extends();
        rrfq_3 rrfq_32 = ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_case[18]])).id_byte();
        Predicate<GuiComponent> predicate = guiComponent -> {
            if (guiComponent instanceof rrZY) {
                rrZY rrZY2 = (rrZY)guiComponent;
                rrNd_1 rrNd_12 = rrZY2.id_break();
                if (rrfq_32 != null && rrNd_12.id_finally() != null && rrNd_12.id_finally() != rrfq_32) {
                    return id_throws[10];
                }
                if (rrtY_22.id_new()) {
                    return id_throws[11];
                }
                String string = rrNd_12.id_case();
                String string2 = rrtY_22.id_final();
                return string.toLowerCase().contains(string2.toLowerCase());
            }
            return id_throws[12];
        };
        return ((List)this.id_break[id_case[19]]).stream().filter(predicate).toList();
    }

    private static void id_int() {
        Object[] objectArray = new Object[]{15, 26, 32};
        id_byte = objectArray;
    }

    public rrZK(rrvJ rrvJ2, rrtu_3 rrtu_32, float f, float f2) {
        ArrayList arrayList;
        this.id_package();
        this.id_break[rrZK.id_case[0]] = arrayList = new ArrayList();
        rruL rruL2 = new rruL();
        this.id_break[rrZK.id_case[1]] = rruL2;
        rrvJ rrvJ3 = rrvJ2;
        this.id_break[rrZK.id_case[2]] = rrvJ3;
        Float f3 = Float.valueOf(f);
        this.id_break[rrZK.id_case[3]] = f3;
        rrZl_1 rrZl_12 = new rrZl_1(new rrZH(id_catch[0]));
        this.id_break[rrZK.id_case[4]] = rrZl_12;
        ClickGuiScreen clickGuiScreen = rrvJ2.id_volatile();
        Supplier<Float> supplier = () -> Float.valueOf((float)clickGuiScreen.id_abstract() + f);
        Supplier<Float> supplier2 = () -> Float.valueOf((float)clickGuiScreen.id_finally() + f2);
        float f4 = id_catch[1] - f - id_catch[2];
        float f5 = id_catch[3];
        for (rrNd_1 rrNd_12 : ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_case[5]])).id_extends()) {
            ((List)this.id_break[id_case[6]]).add(new rrZY(this, rrNd_12, rrtu_32, clickGuiScreen, supplier, supplier2, f4, f5));
        }
    }

    static {
        rrZK.ntfClinit();
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl) {
        this.id_package();
        ClickGuiScreen clickGuiScreen = ((rrvJ)this.id_break[id_case[11]]).id_volatile();
        int n3 = rrZK.id_volatile();
        int n4 = rrZK.id_class(n3);
        boolean bl2 = this.id_class((Integer)rrvk_1.id_class[id_case[12]], (Integer)rrvk_1.id_class[id_case[13]], (float)clickGuiScreen.id_abstract() + ((Float)this.id_break[id_case[14]]).floatValue(), clickGuiScreen.id_finally() + n3, id_catch[15] - ((Float)this.id_break[id_case[15]]).floatValue() - id_catch[16], n4);
        ((rrZl_1)this.id_break[id_case[16]]).id_extends().id_class(bl2 && super.id_class(rrtu_32, n, n2, d, bl) ? id_throws[6] : id_throws[7], d, id_protected[0]);
        this.id_byte().forEach(guiComponent -> guiComponent.id_class(rrtu_32, n, n2, d, bl2, bl));
        return id_throws[8];
    }

    @Override
    public void id_class(Category category, Category category2) {
        this.id_package();
        super.id_class(category, category2);
        ((List)this.id_break[id_case[21]]).forEach(guiComponent -> guiComponent.id_class(category, category2));
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        super.id_class(n, n2, n3);
        return this.id_byte().stream().anyMatch(guiComponent -> guiComponent.id_class(n, n2, n3));
    }

    @Override
    public boolean id_class(Ml_1 ml_1, rrtu_3 rrtu_32, float f, float f2, float f3, float f4, int n, int n2, boolean bl) {
        this.id_package();
        rrZH rrZH2 = ((rrZl_1)this.id_break[id_case[7]]).id_extends();
        int n3 = this.id_break();
        int n4 = rrZK.id_volatile();
        int n5 = rrZK.id_class(n4);
        this.id_implements().id_class(() -> {
            this.id_package();
            List<GuiComponent> list = this.id_byte();
            AnimValue animValue = this.id_implements().id_class();
            float f4 = id_catch[20];
            animValue.id_class(!this.ai_() ? id_throws[13] : id_throws[14]);
            rrZH2.id_class(n3, n5 + id_private[6]);
            float f5 = animValue.id_byte();
            float f6 = (id_catch[21] - f5) * id_catch[22];
            for (int i = id_throws[15]; i < list.size(); ++i) {
                Object object;
                GuiComponent guiComponent = list.get(i);
                if (guiComponent instanceof rrZY) {
                    Object object2;
                    GuiComponent guiComponent2;
                    object = (rrZY)guiComponent;
                    ((rrZY)object).id_class(id_throws[16]);
                    if (i == 0 || (guiComponent2 = list.get(i - id_throws[17])) instanceof rrZY && ((rrZY)(object2 = (rrZY)guiComponent2)).id_break().id_continue() != ((rrZY)object).id_break().id_continue()) {
                        ((rrZY)object).id_class(id_throws[18]);
                    }
                    f4 += (float)n4;
                    if (((rrZY)object).id_volatile()) {
                        f4 += id_catch[23];
                    }
                    ((rrZY)object).id_break(f4 + rrZH2.id_case() + f6);
                    object2 = ((rrZY)object).id_private();
                    ((AnimValue)object2).id_class(!((rrZY)object).id_private().id_new() ? id_throws[19] : id_throws[20]);
                }
                object = guiComponent.id_protected();
                guiComponent.id_break(ml_1, rrtu_32, n, n2, (rruv_1)object, bl, id_throws[21]);
                if (((rruv_1)object).id_protected() < f2 || ((rruv_1)object).id_protected() > f2 + (float)n5 + (float)n4 + id_catch[24]) continue;
                guiComponent.id_class(ml_1, rrtu_32, n, n2, (rruv_1)object, bl, id_throws[22]);
            }
            this.id_implements().id_class(ml_1, (rrZl_1)this.id_break[id_case[29]], rrtu_32, f + f3 - id_catch[25], f2 + id_catch[26] + (float)n4, n, n2, id_catch[27], n5 - id_private[7], n3 - id_private[8], id_case[30], bl);
        }, ml_1, f + id_catch[4] + id_catch[5], f2, id_catch[6], id_catch[7]);
        rrvJ.id_class(ml_1, rrZH2, f + id_catch[8] + id_catch[9], f2 + id_catch[10] + id_catch[11], f2 + (float)n5 + (float)n4 - id_catch[12], id_catch[13], id_catch[14]);
        ((rruL)this.id_break[id_case[8]]).id_class(ml_1, rrtu_32, n, n2, bl, id_throws[0]);
        return id_throws[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x36E4CC9C8EDFB6CL;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_package();
        if (((rruL)this.id_break[id_case[9]]).id_class(rrtu_32, n, n2, n3, bl)) {
            this.id_throws();
        }
        if (!this.id_class(n, n2)) {
            this.id_throws();
            return id_throws[2];
        }
        if (!super.id_class(rrtu_32, n, n2, n3, bl)) {
            return id_throws[3];
        }
        ((rrZl_1)this.id_break[id_case[10]]).id_class(rrtu_32, n, n2, n3, bl);
        List<GuiComponent> list = this.id_byte();
        for (int i = list.size() - id_throws[4]; i >= 0; --i) {
            GuiComponent guiComponent = list.get(i);
            guiComponent.id_class(rrtu_32, n, n2, n3, bl);
        }
        return id_throws[5];
    }

    public boolean id_class(int n, int n2) {
        this.id_package();
        ClickGuiScreen clickGuiScreen = ((rrvJ)this.id_break[id_case[27]]).id_volatile();
        int n3 = clickGuiScreen.id_abstract();
        int n4 = clickGuiScreen.id_finally();
        return this.id_class(n, n2, n3 + id_private[1], n4 + id_private[2] + id_private[3], id_catch[18], id_catch[19]);
    }

    private static int id_class(int n) {
        return id_case[28] - n - id_private[5];
    }

    @Override
    public boolean id_class(char c, int n) {
        super.id_class(c, n);
        return this.id_byte().stream().anyMatch(guiComponent -> guiComponent.id_class(c, n));
    }

    @Override
    public int id_break() {
        List<GuiComponent> list = this.id_byte();
        int n = id_throws[9];
        for (GuiComponent guiComponent : list) {
            if (!(guiComponent instanceof rrZY)) continue;
            rrZY rrZY2 = (rrZY)guiComponent;
            if (rrZY2.id_volatile()) {
                n += 15;
            }
            n += (int)(guiComponent.id_protected().id_class() + id_catch[17]);
        }
        return n + id_private[0];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{45, -12, 104, -2, -74, 10, 104, -118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_break(int n, int n2, int n3) {
        this.id_package();
        super.id_break(n, n2, n3);
        ((rrZl_1)this.id_break[id_case[20]]).id_break(n, n2, n3);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x91269820;
    }

    @Override
    public void id_throws() {
        super.id_throws();
        this.id_byte().forEach(GuiComponent::an_);
    }

    private static /* synthetic */ void ntfClinit() {
        rrZK.id_native();
        rrZK.id_extends();
        rrZK.id_final();
        rrZK.id_finally();
        rrZK.id_new();
        rrZK.id_int();
    }

    private static void id_finally() {
        id_protected = new double[]{25.0};
    }

    @Override
    public void id_catch() {
        this.id_package();
        super.id_catch();
        ((List)this.id_break[id_case[22]]).forEach(GuiComponent::am_);
    }

    private static void id_extends() {
        short[] sArray = new short[31];
        sArray[0] = 2;
        sArray[1] = 3;
        sArray[2] = 1;
        sArray[4] = 4;
        sArray[6] = 2;
        sArray[7] = 4;
        sArray[8] = 3;
        sArray[9] = 3;
        sArray[10] = 4;
        sArray[11] = 1;
        sArray[13] = 1;
        sArray[16] = 4;
        sArray[17] = 1;
        sArray[19] = 2;
        sArray[20] = 4;
        sArray[21] = 2;
        sArray[22] = 2;
        sArray[23] = 4;
        sArray[24] = 2;
        sArray[25] = 2;
        sArray[26] = 4;
        sArray[27] = 1;
        sArray[28] = 300;
        sArray[29] = 4;
        sArray[30] = 255;
        id_case = sArray;
    }

    @Override
    public rrZl_1 id_case() {
        this.id_package();
        return (rrZl_1)this.id_break[id_case[26]];
    }

    private static void id_new() {
        id_private = new byte[]{6, 100, 30, 4, 32, 10, 5, 7, 12, 5, 3, 15, 26, 2, 32};
    }

    private void id_package() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_private[9]];
            objectArray[rrZK.id_throws[23]] = Float.valueOf(id_catch[28]);
        }
    }

    @Override
    public void id_protected() {
        this.id_package();
        super.id_protected();
        ((List)this.id_break[id_case[25]]).forEach(GuiComponent::al_);
    }

    @Override
    public void id_private() {
        this.id_package();
        super.id_private();
        ((rrZl_1)this.id_break[id_case[23]]).id_private();
        ((List)this.id_break[id_case[24]]).forEach(GuiComponent::id_final);
    }

    private static void id_final() {
        float[] fArray = new float[29];
        fArray[0] = 0.5f;
        fArray[1] = 363.0f;
        fArray[2] = 7.0f;
        fArray[3] = 26.0f;
        fArray[4] = 100.0f;
        fArray[5] = 1.0f;
        fArray[6] = 262.0f;
        fArray[7] = 299.0f;
        fArray[8] = 100.0f;
        fArray[9] = 1.0f;
        fArray[10] = 30.0f;
        fArray[11] = 4.0f;
        fArray[12] = 10.0f;
        fArray[13] = 253.0f;
        fArray[14] = 20.0f;
        fArray[15] = 363.0f;
        fArray[16] = 5.0f;
        fArray[17] = 6.0f;
        fArray[18] = 263.0f;
        fArray[19] = 266.0f;
        fArray[21] = 1.0f;
        fArray[22] = 5.0f;
        fArray[23] = 15.0f;
        fArray[24] = 10.0f;
        fArray[25] = 9.0f;
        fArray[26] = 10.0f;
        fArray[27] = 5.0f;
        id_catch = fArray;
    }

    private static int id_volatile() {
        return id_private[4];
    }

    private static void id_native() {
        boolean[] blArray = new boolean[26];
        blArray[1] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[17] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[25] = true;
        id_throws = blArray;
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

