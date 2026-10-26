/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.tuple.Pair
 */
package celestial;

import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rdn_3;
import celestial.rgF_2;
import celestial.rql_3;
import celestial.rrNF;
import celestial.rrNL;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrZF;
import celestial.rrZI;
import celestial.rrZN;
import celestial.rrZO;
import celestial.rrZj_1;
import celestial.rrfD_2;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.ui.clickgui.GuiComponent;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import celestial.util.SyntheticSwitch;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrZg_1
extends GuiComponent {
    private static byte[] id_byte;
    public static Object[] id_class;
    private static float[] id_protected;
    private static String[] id_throws;
    private static short[] id_case;
    private static int[] id_catch;
    private static boolean[] id_private;
    public Object[] id_break;
    private static long[] id_implements;

    @Override
    public rdn_3 id_byte() {
        this.id_extends();
        return (rdn_3)this.id_break[id_case[54]];
    }

    private static void id_int() {
        id_catch = new int[]{6781311};
    }

    public rrZg_1(rrZj_1 rrZj_12, rrNF rrNF2, Supplier<Float> supplier, Supplier<Float> supplier2, float f, float f2) {
        Supplier<Float> supplier3;
        Supplier<Float> supplier4;
        ArrayList arrayList;
        this.id_extends();
        AnimValue animValue = new AnimValue(id_protected[0], id_private[0]);
        this.id_break[rrZg_1.id_case[0]] = animValue;
        this.id_break[rrZg_1.id_case[1]] = arrayList = new ArrayList();
        rrZj_1 rrZj_13 = rrZj_12;
        this.id_break[rrZg_1.id_case[2]] = rrZj_13;
        this.id_break[rrZg_1.id_case[3]] = supplier4 = supplier;
        this.id_break[rrZg_1.id_case[4]] = supplier3 = supplier2;
        Float f3 = Float.valueOf(f);
        this.id_break[rrZg_1.id_case[5]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_break[rrZg_1.id_case[6]] = f4;
        rrNF rrNF3 = rrNF2;
        this.id_break[rrZg_1.id_case[7]] = rrNF3;
        rrNd_1 rrNd_12 = ((rrNF)this.id_break[id_case[8]]).id_break();
        rrNw_1 rrNw_12 = rrNd_12.id_break();
        rrNL rrNL2 = ((rrNF)this.id_break[id_case[9]]).id_class();
        if (rrNw_12 == null) {
            return;
        }
        rdn_3 rdn_32 = rrNw_12.id_protected();
        int n = rdn_32.id_char();
        rdn_3 rdn_33 = rrNd_12.id_package() == null ? rrNd_12.id_catch().id_continue() : rrNd_12.id_package();
        this.id_break[rrZg_1.id_case[10]] = rdn_33;
        String string = rrNd_12.id_case() + (String)(n > id_private[1] ? rgF_2.RED + " x" + n : id_throws[0]);
        this.id_break[rrZg_1.id_case[11]] = string;
        this.id_class(rrNd_12, rrNw_12, n, rrNL2);
        int n2 = ((List)this.id_break[id_case[12]]).size() + ((Boolean)this.id_break[id_case[13]] != false ? id_private[2] : id_private[3]);
        int n3 = Math.max(id_private[4], n2 - id_private[5]);
        Float f5 = Float.valueOf(f2 + (float)n3 * id_protected[1]);
        this.id_break[rrZg_1.id_case[14]] = f5;
    }

    static {
        rrZg_1.ntfClinit();
    }

    private static void id_this() {
        short[] sArray = new short[66];
        sArray[0] = 8;
        sArray[1] = 12;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 6;
        sArray[6] = 7;
        sArray[7] = 1;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 10;
        sArray[11] = 11;
        sArray[12] = 12;
        sArray[13] = 14;
        sArray[14] = 7;
        sArray[16] = 12;
        sArray[17] = 12;
        sArray[18] = 2;
        sArray[19] = 1;
        sArray[20] = 3;
        sArray[21] = 13;
        sArray[22] = 14;
        sArray[23] = 12;
        sArray[24] = 12;
        sArray[25] = 12;
        sArray[26] = 13;
        sArray[27] = 14;
        sArray[28] = 12;
        sArray[29] = 12;
        sArray[30] = 12;
        sArray[31] = 1;
        sArray[32] = 2;
        sArray[33] = 10;
        sArray[34] = 11;
        sArray[35] = 12;
        sArray[39] = 8;
        sArray[40] = 4;
        sArray[41] = 10;
        sArray[42] = 8;
        sArray[43] = 11;
        sArray[44] = 12;
        sArray[45] = 14;
        sArray[46] = 13;
        sArray[48] = 10;
        sArray[49] = 9;
        sArray[50] = 9;
        sArray[54] = 9;
        sArray[55] = 13;
        sArray[56] = 2;
        sArray[57] = 4;
        sArray[58] = 3;
        sArray[59] = 5;
        sArray[60] = 6;
        sArray[61] = 7;
        sArray[62] = 4;
        sArray[63] = 5;
        sArray[64] = 8;
        sArray[65] = 1;
        id_case = sArray;
    }

    @Override
    public rrZN id_class() {
        this.id_extends();
        return (rrZj_1)this.id_break[id_case[51]];
    }

    private static String id_class(String string, String string2) {
        return (String)id_class[id_case[31]] + string + ": " + (String)id_class[id_case[32]] + string2;
    }

    public void id_class(float f) {
        this.id_extends();
        Float f2 = Float.valueOf(f);
        this.id_break[rrZg_1.id_case[63]] = f2;
    }

    private static String id_class(Number number) {
        return "$" + rql_3.id_class(number, (char)id_byte[0]);
    }

    private static String id_class(long l) {
        long l2 = Math.max(id_implements[0], System.currentTimeMillis() - l);
        long l3 = l2 / id_implements[1];
        if (l3 < id_implements[2]) {
            return l3 + " \u0441\u0435\u043a. \u043d\u0430\u0437\u0430\u0434";
        }
        long l4 = l3 / id_implements[3];
        if (l4 < id_implements[4]) {
            return l4 + " \u043c\u0438\u043d. \u043d\u0430\u0437\u0430\u0434";
        }
        long l5 = l4 / id_implements[5];
        if (l5 < id_implements[6]) {
            return l5 + " \u0447. \u043d\u0430\u0437\u0430\u0434";
        }
        return l5 / id_implements[7] + " \u0434\u043d. \u043d\u0430\u0437\u0430\u0434";
    }

    private void id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12, int n, rrNL rrNL2) {
        this.id_extends();
        int n2 = rrNw_12.id_case();
        int n3 = rrNd_12.id_else();
        switch (((int[])SyntheticSwitch.id_class[id_case[15]])[rrNL2.ordinal()]) {
            case 1: {
                int n4;
                Object object = rrZg_1.id_class((Number)n2);
                if (n > id_private[6]) {
                    object = (String)object + " (" + rrZg_1.id_class(Float.valueOf((float)n2 / (float)n)) + " \u0448\u0442.)";
                }
                ((List)this.id_break[id_case[16]]).add(rrZg_1.id_class(id_throws[1], (String)object));
                if (n3 > 0 && (n4 = n3 * n) > n2) {
                    int n5 = n4 - n2;
                    float f = (float)n5 / (float)n4 * id_protected[2];
                    ((List)this.id_break[id_case[17]]).add(rrZg_1.id_class(id_throws[2], (String)id_class[id_case[18]] + rrZg_1.id_class((Number)n4) + (String)id_class[id_case[19]] + ", \u0432\u044b\u0433\u043e\u0434\u0430 " + rgF_2.GREEN + rrZg_1.id_class((Number)n5) + " (" + ((DecimalFormat)id_class[id_case[20]]).format(f) + "%)"));
                }
                Long l = System.currentTimeMillis();
                this.id_break[rrZg_1.id_case[21]] = l;
                Boolean bl = id_private[7];
                this.id_break[rrZg_1.id_case[22]] = bl;
                break;
            }
            case 2: {
                ((List)this.id_break[id_case[23]]).add(rgF_2.RED + "\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043a\u0443\u043f\u0438\u0442\u044c");
                ((List)this.id_break[id_case[24]]).add(rrZg_1.id_class(id_throws[3], rrZg_1.id_class((Number)n2)));
                if (n3 > 0) {
                    ((List)this.id_break[id_case[25]]).add(rrZg_1.id_class(id_throws[4], rrZg_1.id_class((Number)n3)));
                }
                Long l = System.currentTimeMillis();
                this.id_break[rrZg_1.id_case[26]] = l;
                Boolean bl = id_private[8];
                this.id_break[rrZg_1.id_case[27]] = bl;
                break;
            }
            case 3: {
                ((List)this.id_break[id_case[28]]).add(rgF_2.YELLOW + "\u0412 \u043e\u0436\u0438\u0434\u0430\u043d\u0438\u0438");
                if (n3 > 0) {
                    ((List)this.id_break[id_case[29]]).add(rrZg_1.id_class(id_throws[5], rrZg_1.id_class((Number)n3)));
                }
                if (n <= id_private[9]) break;
                ((List)this.id_break[id_case[30]]).add(rrZg_1.id_class(id_throws[6], String.valueOf(n)));
            }
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, rruv_1 rruv_12, boolean bl, boolean bl2) {
        this.id_extends();
        super.id_class(ml_1, rrtu_32, n, n2, rruv_12, bl, bl2);
        if ((rdn_3)this.id_break[id_case[33]] == null || (String)this.id_break[id_case[34]] == null || ((List)this.id_break[id_case[35]]).isEmpty()) {
            return;
        }
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_case[36]]).id_finally();
        rrZO rrZO3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_case[37]]).id_class();
        float f = rruv_12.id_break();
        float f2 = rruv_12.id_protected();
        int n3 = (int)rruv_12.id_byte();
        int n4 = (int)rruv_12.id_class();
        float f3 = ((rrZj_1)this.id_break[id_case[38]]).id_implements().id_class().id_byte();
        int n5 = (int)(id_protected[3] * ((AnimValue)this.id_break[id_case[39]]).id_byte() * f3);
        int n6 = ColorHelper.id_break((int)((Integer)rrZI.id_break[id_case[40]]), n5);
        int n7 = ColorHelper.id_break(rrZF.d_, n5);
        int n8 = ColorHelper.id_break(id_catch[0], n5);
        rrfD_2.id_break(ml_1, f, f2, n3, n4, id_protected[4], n6, n6, n6, n6);
        id_short.id_class(ml_1, (rdn_3)this.id_break[id_case[41]], f + id_protected[5], f2 + id_protected[6], ((AnimValue)this.id_break[id_case[42]]).id_byte() * f3);
        rrZO2.id_protected(ml_1, (String)this.id_break[id_case[43]], f + id_protected[7], f2 + id_protected[8], n7, id_private[10]);
        float f4 = f2 + id_protected[9];
        for (String string : (List)this.id_break[id_case[44]]) {
            rrZO3.id_protected(ml_1, string, f + id_protected[10], f4, n8, id_private[11]);
            f4 += id_protected[11];
        }
        if (((Boolean)this.id_break[id_case[45]]).booleanValue()) {
            rrZO3.id_protected(ml_1, rrZg_1.id_class(id_throws[7], rrZg_1.id_class((Long)this.id_break[id_case[46]])), f + id_protected[12], f4, n8, id_private[12]);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-6, 121, 11, 60, -59, -14, 12, -2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC1D36C4;
    }

    public void id_break(float f) {
        this.id_extends();
        Float f2 = Float.valueOf(f);
        this.id_break[rrZg_1.id_case[62]] = f2;
    }

    public float id_break() {
        this.id_extends();
        return ((Float)this.id_break[id_case[60]]).floatValue();
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0x31D99F27B614D125L;
    }

    @Override
    public void id_break(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, rruv_1 rruv_12, boolean bl, boolean bl2) {
        this.id_extends();
        super.id_break(ml_1, rrtu_32, n, n2, rruv_12, bl, bl2);
        if (rruv_12.id_break(n, n2) && ((rrZj_1)this.id_break[id_case[47]]).id_class(n, n2) && !rrtu_3.id_class(rrtu_32, n, n2)) {
            rdn_3 rdn_32 = (rdn_3)this.id_break[id_case[48]];
            this.id_break[rrZg_1.id_case[49]] = rdn_32;
        } else {
            Object var13_9 = null;
            this.id_break[rrZg_1.id_case[50]] = var13_9;
        }
    }

    public float id_throws() {
        this.id_extends();
        return ((Float)((Supplier)this.id_break[id_case[58]]).get()).floatValue() + ((Float)this.id_break[id_case[59]]).floatValue();
    }

    private static /* synthetic */ void ntfClinit() {
        rrZg_1.id_new();
        rrZg_1.id_package();
        rrZg_1.id_native();
        rrZg_1.id_continue();
        rrZg_1.id_this();
        rrZg_1.id_super();
        rrZg_1.id_int();
        rrZg_1.id_volatile();
    }

    public float id_finally() {
        this.id_extends();
        return ((Float)((Supplier)this.id_break[id_case[56]]).get()).floatValue() + ((Float)this.id_break[id_case[57]]).floatValue();
    }

    public AnimValue id_catch() {
        this.id_extends();
        return (AnimValue)this.id_break[id_case[64]];
    }

    private void id_extends() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[3]];
            objectArray[rrZg_1.id_byte[4]] = Float.valueOf(id_protected[14]);
            objectArray[rrZg_1.id_byte[5]] = Float.valueOf(id_protected[15]);
            objectArray[rrZg_1.id_byte[6]] = Float.valueOf(id_protected[16]);
            objectArray[rrZg_1.id_byte[7]] = Float.valueOf(id_protected[17]);
            objectArray[rrZg_1.id_byte[8]] = id_implements[8];
            objectArray[rrZg_1.id_byte[9]] = id_private[14];
        }
    }

    public rrNF id_case() {
        this.id_extends();
        return (rrNF)this.id_break[id_case[65]];
    }

    private static void id_continue() {
        float[] fArray = new float[19];
        fArray[0] = 0.5f;
        fArray[1] = 9.0f;
        fArray[2] = 100.0f;
        fArray[3] = 255.0f;
        fArray[4] = 4.0f;
        fArray[5] = 3.0f;
        fArray[6] = 5.0f;
        fArray[7] = 22.0f;
        fArray[8] = 7.0f;
        fArray[9] = 16.0f;
        fArray[10] = 22.0f;
        fArray[11] = 9.0f;
        fArray[12] = 22.0f;
        fArray[13] = 8.0f;
        fArray[18] = 9.0f;
        id_protected = fArray;
    }

    public long id_implements() {
        this.id_extends();
        return (Long)this.id_break[id_case[55]];
    }

    private static void id_new() {
        boolean[] blArray = new boolean[16];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[13] = true;
        id_private = blArray;
    }

    private static void id_package() {
        id_throws = new String[]{new String(""), new String("\u041a\u0443\u043f\u043b\u0435\u043d\u043e \u0437\u0430"), new String("\u041b\u0438\u043c\u0438\u0442"), new String("\u0426\u0435\u043d\u0430"), new String("\u041b\u0438\u043c\u0438\u0442"), new String("\u041b\u0438\u043c\u0438\u0442"), new String("\u041a\u043e\u043b-\u0432\u043e"), new String("\u0412\u0440\u0435\u043c\u044f"), new String("#.#")};
    }

    private static void id_super() {
        id_byte = new byte[]{32, 2, 3, 15, 4, 5, 6, 7, 13, 14, 4};
    }

    @Override
    public rruv_1 id_protected() {
        this.id_extends();
        float f = this.id_break();
        Pair<Float, Boolean> pair = ((rrZj_1)this.id_break[id_case[52]]).id_implements().id_class(((rrZj_1)this.id_break[id_case[53]]).id_case());
        float f2 = id_protected[13] * ((Float)pair.getLeft()).floatValue();
        if (((Boolean)pair.getRight()).booleanValue()) {
            f -= f2;
        }
        return new rruv_1(this.id_finally(), this.id_throws(), f, this.id_private());
    }

    public float id_private() {
        this.id_extends();
        return ((Float)this.id_break[id_case[61]]).floatValue();
    }

    private static void id_volatile() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), new String("\u00a77"), new String("\u00a7f"), new DecimalFormat(id_throws[8], DecimalFormatSymbols.getInstance(Locale.US))};
        id_class = objectArray;
    }

    private static void id_native() {
        long[] lArray = new long[9];
        lArray[1] = 1000L;
        lArray[2] = 60L;
        lArray[3] = 60L;
        lArray[4] = 60L;
        lArray[5] = 60L;
        lArray[6] = 24L;
        lArray[7] = 24L;
        id_implements = lArray;
    }
}

