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
import celestial.rfU_2;
import celestial.rjK_2;
import celestial.rql_3;
import celestial.rrIv_1;
import celestial.rrNd_1;
import celestial.rrZF;
import celestial.rrZI;
import celestial.rrZK;
import celestial.rrZL;
import celestial.rrZN;
import celestial.rrZO;
import celestial.rrfD_2;
import celestial.rrtF_2;
import celestial.rrtK_2;
import celestial.rrtQ_2;
import celestial.rrtY_2;
import celestial.rrte_3;
import celestial.rrth_3;
import celestial.rrtu_3;
import celestial.rruA;
import celestial.rruF;
import celestial.rruL;
import celestial.rrun_1;
import celestial.rruu_1;
import celestial.rruv_1;
import celestial.rrvM;
import celestial.ui.clickgui.ClickGuiScreen;
import celestial.ui.clickgui.GuiComponent;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.tuple.Pair;

public class rrZY
extends GuiComponent {
    public Object[] id_class;
    public static Object[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    private static String[] id_throws;
    private static int[] id_case;
    private static short[] id_catch;
    private static float[] id_private;

    private float id_char() {
        this.id_try();
        return ((AnimValue)this.id_class[id_catch[71]]).id_byte() * ((rrZK)this.id_class[id_catch[72]]).id_implements().id_class().id_byte();
    }

    @Override
    public rdn_3 id_byte() {
        this.id_try();
        return (rdn_3)this.id_class[id_catch[57]];
    }

    private void id_int() {
        this.id_try();
        if (!((rrtY_2)this.id_class[id_catch[45]]).aO_()) {
            return;
        }
        ((rrtY_2)this.id_class[id_catch[46]]).id_throws();
        String string = ((rrtY_2)this.id_class[id_catch[47]]).id_final();
        if (string.isEmpty()) {
            ((rrtY_2)this.id_class[id_catch[48]]).id_byte(String.valueOf(((rrNd_1)this.id_class[id_catch[49]]).id_else()));
            return;
        }
        if (((String)this.id_class[id_catch[50]]).equals(string)) {
            return;
        }
        try {
            int n = Integer.parseInt(string);
            ((rrNd_1)this.id_class[id_catch[51]]).id_break(n);
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[52]]).id_class(new rrtQ_2(id_throws[1], id_throws[2], (int)id_catch[53]));
        }
        catch (NumberFormatException numberFormatException) {
            ((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_catch[54]]).id_class(new rrtQ_2(id_throws[3], id_throws[4], (int)id_catch[55]));
        }
    }

    public rrZY(rrZK rrZK2, rrNd_1 rrNd_12, rrtu_3 rrtu_32, ClickGuiScreen clickGuiScreen, Supplier<Float> supplier, Supplier<Float> supplier2, float f, float f2) {
        Supplier<Float> supplier3;
        Supplier<Float> supplier4;
        this.id_try();
        rruL rruL2 = new rruL();
        this.id_class[rrZY.id_catch[0]] = rruL2;
        AnimValue animValue = new AnimValue(id_private[0], id_protected[0]);
        this.id_class[rrZY.id_catch[1]] = animValue;
        rrZK rrZK3 = rrZK2;
        this.id_class[rrZY.id_catch[2]] = rrZK3;
        this.id_class[rrZY.id_catch[3]] = supplier4 = supplier;
        this.id_class[rrZY.id_catch[4]] = supplier3 = supplier2;
        Float f3 = Float.valueOf(f);
        this.id_class[rrZY.id_catch[5]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrZY.id_catch[6]] = f4;
        rrNd_1 rrNd_13 = rrNd_12;
        this.id_class[rrZY.id_catch[7]] = rrNd_13;
        rrvM rrvM2 = new rrvM(this, this::id_extends, this::id_case);
        this.id_class[rrZY.id_catch[8]] = rrvM2;
        rrtY_2 rrtY_23 = new rrtY_2(new rrIv_1(String.valueOf(rrNd_12.id_else()), (rrte_3)id_break[id_catch[9]]).id_class((Object)String.valueOf(rrNd_12.id_else())), (rrtK_2)((Object)rrtK_2.staticFieldsc4d05dcb6ab834399a1b48042de01686[id_catch[10]])).id_class((rrtY_2 rrtY_22) -> this.an_()).id_class(() -> Float.valueOf(f / id_private[36])).id_break(this::id_char).id_class(((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[11]]).id_class()).id_class((String string) -> "$" + rql_3.id_class(string, (char)id_byte[1])).id_break(rrtY_22 -> {
            this.id_try();
            String string = String.valueOf(rrNd_12.id_else());
            this.id_class[rrZY.id_catch[84]] = string;
        });
        this.id_class[rrZY.id_catch[12]] = rrtY_23;
        this.id_class(rrtu_32, clickGuiScreen);
    }

    static {
        rrZY.ntfClinit();
    }

    @Override
    public boolean id_class(char c, int n) {
        this.id_try();
        return ((rrtY_2)this.id_class[id_catch[41]]).id_class(c, n);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7A744F31BC561BCDL;
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, double d, boolean bl, boolean bl2) {
        this.id_int();
        return super.id_class(rrtu_32, n, n2, d, bl, bl2);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_try();
        this.an_();
        if (this.id_protected().id_break(n, n2)) {
            boolean bl2;
            boolean bl3 = ((rruL)this.id_class[id_catch[37]]).id_class(rrtu_32, n, n2, n3, bl);
            boolean bl4 = bl2 = ((rrtY_2)this.id_class[id_catch[38]]).id_class(rrtu_32, n, n2, n3, bl) || bl3 ? id_protected[9] : id_protected[10];
            if (n3 == 0 && bl2) {
                return id_protected[11];
            }
        }
        return id_protected[12];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-39, 33, 47, -15, 90, 91, 113, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        this.id_try();
        return ((rrtY_2)this.id_class[id_catch[39]]).id_class(n, n2, n3);
    }

    public void id_class(boolean bl) {
        this.id_try();
        Boolean bl2 = bl;
        this.id_class[rrZY.id_catch[75]] = bl2;
    }

    public void id_class(float f) {
        this.id_try();
        Float f2 = Float.valueOf(f);
        this.id_class[rrZY.id_catch[68]] = f2;
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, rruv_1 rruv_12, boolean bl, boolean bl2) {
        this.id_try();
        super.id_class(ml_1, rrtu_32, n, n2, rruv_12, bl, bl2);
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[17]]).id_finally();
        rrZO rrZO3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[18]]).id_class();
        float f = rruv_12.id_break();
        float f2 = rruv_12.id_protected();
        int n3 = (int)rruv_12.id_byte();
        int n4 = (int)rruv_12.id_class();
        float f3 = ((rrZK)this.id_class[id_catch[19]]).id_implements().id_class().id_byte();
        int n5 = (int)(id_private[2] * ((AnimValue)this.id_class[id_catch[20]]).id_byte() * f3);
        int n6 = ColorHelper.id_break((int)((Integer)rrZI.id_break[id_catch[21]]), n5);
        int n7 = ColorHelper.id_break(rrZF.d_, n5);
        int n8 = ColorHelper.id_break(id_case[0], n5);
        rrfD_2.id_break(ml_1, f, f2, n3, n4, id_private[3], n6, n6, n6, n6);
        String string = ((rrNd_1)this.id_class[id_catch[22]]).id_case();
        String string2 = String.valueOf(((rrNd_1)this.id_class[id_catch[23]]).id_else());
        String string3 = id_throws[0];
        float f4 = rrZO3.id_break(string3);
        rdn_3 rdn_32 = ((rrNd_1)this.id_class[id_catch[24]]).id_package() == null ? ((rrNd_1)this.id_class[id_catch[25]]).id_catch().id_continue() : ((rrNd_1)this.id_class[id_catch[26]]).id_package();
        id_short.id_class(ml_1, rdn_32, f + id_private[4], f2 + id_private[5], this.id_char());
        rrZO2.id_protected(ml_1, string, f + id_private[6], f2 + id_private[7], n7, id_protected[6]);
        rrZO3.id_protected(ml_1, string3, f + id_private[8], f2 + id_private[9], n8, id_protected[7]);
        ((rrtY_2)this.id_class[id_catch[27]]).id_class(ml_1, rrtu_32, f + f4 + id_private[10], f2 + id_private[11], rrZO3.id_break(string2) + id_private[12], id_private[13], n, n2, bl);
        ((rruL)this.id_class[id_catch[28]]).id_class(ml_1, rrtu_32, n, n2, bl, bl2);
        if (this.id_volatile()) {
            float f5 = f;
            float f6 = f2 - id_private[14];
            String string4 = ((rrNd_1)this.id_class[id_catch[29]]).id_continue().id_class();
            float f7 = rrZO2.id_break(string4);
            rrtF_2.id_class(ml_1, f5, f6, (float)n3, id_private[15], (int)((Integer)rrZI.id_break[id_catch[30]]), n5);
            rrtF_2.id_class(ml_1, f5 + id_private[16], f6 - id_private[17], f7 + id_private[18], (float)rrZO2.id_class(), rrZF.n_, n5);
            rrZO2.id_class(ml_1, string4, (double)(f5 + id_private[19]), (double)(f6 - id_private[20]), (int)id_byte[0], n5, id_protected[8]);
        }
    }

    public void id_class(rrtu_3 rrtu_32, ClickGuiScreen clickGuiScreen) {
        this.id_try();
        Runnable runnable = () -> {
            this.id_try();
            ((rrNd_1)this.id_class[id_catch[82]]).id_break(!((rrNd_1)this.id_class[id_catch[83]]).id_while() ? id_protected[13] : id_protected[14]);
        };
        rruF[] rruFArray = new rruF[id_protected[1]];
        rruFArray[rrZY.id_protected[2]] = new rruF(new rruA(() -> {
            this.id_try();
            return ((rrNd_1)this.id_class[id_catch[81]]).id_while();
        }, () -> {
            rruv_1 rruv_12 = this.id_protected();
            return new rjK_2(rruv_12.id_break() + this.id_catch() - id_private[34], rruv_12.id_protected() + id_private[35]);
        }, () -> new rjK_2(id_private[32], id_private[33])).id_class(this::id_char)).id_class(runnable);
        ((rruL)this.id_class[id_catch[13]]).id_class(rruFArray);
        float f = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_catch[14]]).id_finally().id_break(((rrNd_1)this.id_class[id_catch[15]]).id_case());
        Runnable runnable2 = () -> {
            this.id_try();
            float f = rfU_2.id_class((float)clickGuiScreen.id_abstract() - ((rrvM)this.id_class[id_catch[77]]).id_implements() - id_private[27], id_private[28], id_const.id_volatile() - id_private[29]);
            float f2 = rfU_2.id_class((float)clickGuiScreen.id_finally(), id_private[30], (float)id_const.id_native() - ((rrvM)this.id_class[id_catch[78]]).id_double() - id_private[31]);
            rrtu_32.id_class(((rrvM)this.id_class[id_catch[79]]).id_class(f, f2), () -> {
                this.id_try();
                ((rrvM)this.id_class[id_catch[80]]).id_class(rrtu_32);
            });
        };
        rruF[] rruFArray2 = new rruF[id_protected[3]];
        rruFArray2[rrZY.id_protected[4]] = new rruF((rruu_1)((rruu_1)new rrun_1(() -> rrZL.id_int, () -> new rjK_2(this.id_extends() + f + id_private[25], this.id_case() + id_private[26]), () -> new rjK_2(id_private[23], id_private[24]), () -> rrZF.d_).id_class(this::id_char)).id_class(id_private[1])).id_class(() -> {
            this.id_try();
            return ((rrvM)this.id_class[id_catch[76]]).id_static();
        }).id_class(runnable2).id_class(id_protected[5]);
        ((rruL)this.id_class[id_catch[16]]).id_class(rruFArray2);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD22D1343;
    }

    @Override
    public rrZN id_class() {
        this.id_try();
        return (rrZK)this.id_class[id_catch[56]];
    }

    public rrNd_1 id_break() {
        this.id_try();
        return (rrNd_1)this.id_class[id_catch[73]];
    }

    public void id_break(float f) {
        this.id_try();
        Float f2 = Float.valueOf(f);
        this.id_class[rrZY.id_catch[69]] = f2;
    }

    @Override
    public void id_break(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, rruv_1 rruv_12, boolean bl, boolean bl2) {
        this.id_try();
        super.id_break(ml_1, rrtu_32, n, n2, rruv_12, bl, bl2);
        if (rruv_12.id_break(n, n2) && ((rrZK)this.id_class[id_catch[31]]).id_class(n, n2) && !rrtu_3.id_class(rrtu_32, n, n2)) {
            rdn_3 rdn_32 = ((rrNd_1)this.id_class[id_catch[32]]).id_package() == null ? ((rrNd_1)this.id_class[id_catch[33]]).id_catch().id_continue() : ((rrNd_1)this.id_class[id_catch[34]]).id_package();
            this.id_class[rrZY.id_catch[35]] = rdn_32;
        } else {
            Object var13_9 = null;
            this.id_class[rrZY.id_catch[36]] = var13_9;
        }
    }

    @Override
    public void id_break(int n, int n2, int n3) {
        this.id_try();
        super.id_break(n, n2, n3);
        ((rrtY_2)this.id_class[id_catch[40]]).id_byte(n, n2, n3);
    }

    private static /* synthetic */ void ntfClinit() {
        rrZY.id_abstract();
        rrZY.id_public();
        rrZY.id_while();
        rrZY.id_instanceof();
        rrZY.id_return();
        rrZY.id_super();
        rrZY.id_continue();
    }

    public float id_catch() {
        this.id_try();
        return ((Float)this.id_class[id_catch[66]]).floatValue();
    }

    public float id_extends() {
        this.id_try();
        return ((Float)((Supplier)this.id_class[id_catch[62]]).get()).floatValue() + ((Float)this.id_class[id_catch[63]]).floatValue();
    }

    public float id_case() {
        this.id_try();
        return ((Float)((Supplier)this.id_class[id_catch[64]]).get()).floatValue() + ((Float)this.id_class[id_catch[65]]).floatValue();
    }

    private static void id_continue() {
        Object[] objectArray = new Object[]{rrte_3.id_class(Pattern.compile("[0-9]+", 0))};
        id_break = objectArray;
    }

    private static void id_instanceof() {
        float[] fArray = new float[41];
        fArray[0] = 0.5f;
        fArray[1] = 0.2f;
        fArray[2] = 255.0f;
        fArray[3] = 4.0f;
        fArray[4] = 3.0f;
        fArray[5] = 5.0f;
        fArray[6] = 22.0f;
        fArray[7] = 7.0f;
        fArray[8] = 22.0f;
        fArray[9] = 16.0f;
        fArray[10] = 24.0f;
        fArray[11] = 16.0f;
        fArray[12] = 8.0f;
        fArray[13] = 4.0f;
        fArray[14] = 11.5f;
        fArray[15] = 0.5f;
        fArray[16] = 12.0f;
        fArray[17] = 2.0f;
        fArray[18] = 6.0f;
        fArray[19] = 15.0f;
        fArray[20] = 1.5f;
        fArray[21] = 8.0f;
        fArray[23] = 6.0f;
        fArray[24] = 6.0f;
        fArray[25] = 23.5f;
        fArray[26] = 5.5f;
        fArray[27] = 10.0f;
        fArray[28] = 5.0f;
        fArray[29] = 5.0f;
        fArray[30] = 5.0f;
        fArray[31] = 5.0f;
        fArray[32] = 17.0f;
        fArray[33] = 8.0f;
        fArray[34] = 23.0f;
        fArray[35] = 9.0f;
        fArray[36] = 1.7f;
        id_private = fArray;
    }

    private static void id_return() {
        id_byte = new byte[]{15, 32, 15, 5, 9, 10, 11, 12};
    }

    private static void id_super() {
        id_case = new int[]{6781311};
    }

    private void id_try() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
            objectArray[rrZY.id_byte[3]] = id_protected[19];
            objectArray[rrZY.id_byte[4]] = Float.valueOf(id_private[37]);
            objectArray[rrZY.id_byte[5]] = Float.valueOf(id_private[38]);
            objectArray[rrZY.id_byte[6]] = Float.valueOf(id_private[39]);
            objectArray[rrZY.id_byte[7]] = Float.valueOf(id_private[40]);
        }
    }

    private static void id_while() {
        short[] sArray = new short[85];
        sArray[1] = 6;
        sArray[2] = 1;
        sArray[3] = 7;
        sArray[4] = 8;
        sArray[5] = 11;
        sArray[6] = 12;
        sArray[7] = 3;
        sArray[8] = 4;
        sArray[10] = 1;
        sArray[12] = 2;
        sArray[15] = 3;
        sArray[19] = 1;
        sArray[20] = 6;
        sArray[21] = 4;
        sArray[22] = 3;
        sArray[23] = 3;
        sArray[24] = 3;
        sArray[25] = 3;
        sArray[26] = 3;
        sArray[27] = 2;
        sArray[29] = 3;
        sArray[30] = 4;
        sArray[31] = 1;
        sArray[32] = 3;
        sArray[33] = 3;
        sArray[34] = 3;
        sArray[35] = 14;
        sArray[36] = 14;
        sArray[38] = 2;
        sArray[39] = 2;
        sArray[40] = 2;
        sArray[41] = 2;
        sArray[42] = 2;
        sArray[43] = 2;
        sArray[44] = 3;
        sArray[45] = 2;
        sArray[46] = 2;
        sArray[47] = 2;
        sArray[48] = 2;
        sArray[49] = 3;
        sArray[50] = 13;
        sArray[51] = 3;
        sArray[53] = 1500;
        sArray[55] = 1500;
        sArray[56] = 1;
        sArray[57] = 14;
        sArray[58] = 1;
        sArray[59] = 1;
        sArray[62] = 7;
        sArray[63] = 9;
        sArray[64] = 8;
        sArray[65] = 10;
        sArray[66] = 11;
        sArray[67] = 12;
        sArray[68] = 9;
        sArray[69] = 10;
        sArray[70] = 6;
        sArray[71] = 6;
        sArray[72] = 1;
        sArray[73] = 3;
        sArray[74] = 5;
        sArray[75] = 5;
        sArray[76] = 4;
        sArray[77] = 4;
        sArray[78] = 4;
        sArray[79] = 4;
        sArray[80] = 4;
        sArray[81] = 3;
        sArray[82] = 3;
        sArray[83] = 3;
        sArray[84] = 13;
        id_catch = sArray;
    }

    private static void id_public() {
        id_throws = new String[]{new String("\u0426\u0435\u043d\u0430 \u0437\u0430 \u0448\u0442\u0443\u043a\u0443:"), new String("Auto Buy"), new String("\u0426\u0435\u043d\u0430 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u0430 \u0443\u0441\u043f\u0435\u0448\u043d\u0430 \u0438\u0437\u043c\u0435\u043d\u0435\u043d\u0430"), new String("Auto Buy"), new String("\u0421\u043b\u0438\u0448\u043a\u043e\u043c \u0431\u043e\u043b\u044c\u0448\u0430\u044f \u0446\u0435\u043d\u0430")};
    }

    @Override
    public rruv_1 id_protected() {
        this.id_try();
        float f = this.id_catch();
        Pair<Float, Boolean> pair = ((rrZK)this.id_class[id_catch[58]]).id_implements().id_class(((rrZK)this.id_class[id_catch[59]]).id_case());
        float f2 = id_private[21] * ((Float)pair.getLeft()).floatValue();
        if (((Boolean)pair.getRight()).booleanValue()) {
            f -= f2;
            ((rruL)this.id_class[id_catch[60]]).id_break(-f2);
        } else {
            ((rruL)this.id_class[id_catch[61]]).id_break(id_private[22]);
        }
        return new rruv_1(this.id_extends(), this.id_case(), f, this.id_native());
    }

    public AnimValue id_private() {
        this.id_try();
        return (AnimValue)this.id_class[id_catch[70]];
    }

    private static void id_abstract() {
        boolean[] blArray = new boolean[21];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[16] = true;
        blArray[20] = true;
        id_protected = blArray;
    }

    public boolean id_volatile() {
        this.id_try();
        return (Boolean)this.id_class[id_catch[74]];
    }

    public float id_native() {
        this.id_try();
        return ((Float)this.id_class[id_catch[67]]).floatValue();
    }

    @Override
    public void am_() {
        this.id_try();
        super.am_();
        ((rrtY_2)this.id_class[id_catch[43]]).id_byte(String.valueOf(((rrNd_1)this.id_class[id_catch[44]]).id_else()));
    }

    @Override
    public void an_() {
        super.an_();
        this.id_int();
    }

    @Override
    public void al_() {
        this.id_try();
        super.al_();
        ((rrtY_2)this.id_class[id_catch[42]]).id_protected();
    }
}

