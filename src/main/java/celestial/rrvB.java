/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.manager.ThemeManager;
import celestial.rrZF;
import celestial.rrZN;
import celestial.rrZf_1;
import celestial.rrfD_2;
import celestial.rrtu_3;
import celestial.rruv_1;
import celestial.rrvP;
import celestial.ui.clickgui.GuiComponent;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvB
extends GuiComponent {
    private static byte[] id_break;
    private static float[] id_byte;
    private static boolean[] id_protected;
    private static short[] id_throws;
    public Object[] id_class;

    private static void id_int() {
        float[] fArray = new float[27];
        fArray[0] = 0.3f;
        fArray[1] = 255.0f;
        fArray[2] = 5.0f;
        fArray[3] = 5.0f;
        fArray[4] = 2.5f;
        fArray[5] = 2.5f;
        fArray[6] = 8.0f;
        fArray[7] = 1.0f;
        fArray[8] = 1.0f;
        fArray[9] = 6.0f;
        fArray[10] = 6.0f;
        fArray[11] = 6.0f;
        fArray[12] = 6.0f;
        fArray[13] = 14.0f;
        fArray[14] = 13.0f;
        fArray[15] = 11.0f;
        fArray[16] = 10.0f;
        fArray[17] = 3.0f;
        fArray[18] = 3.0f;
        fArray[19] = 3.0f;
        fArray[20] = 3.0f;
        fArray[21] = 5.5f;
        fArray[22] = 9.0f;
        fArray[23] = 5.0f;
        fArray[24] = 18.0f;
        id_byte = fArray;
    }

    public rrvB(rrZf_1 rrZf_12, rrvP rrvP2, Supplier<Float> supplier, Supplier<Float> supplier2, int n, int n2) {
        Supplier<Float> supplier3;
        Supplier<Float> supplier4;
        this.id_volatile();
        AnimValue animValue = new AnimValue(id_byte[0], id_protected[0]);
        this.id_class[rrvB.id_throws[0]] = animValue;
        rrZf_1 rrZf_13 = rrZf_12;
        this.id_class[rrvB.id_throws[1]] = rrZf_13;
        rrvP rrvP3 = rrvP2;
        this.id_class[rrvB.id_throws[2]] = rrvP3;
        this.id_class[rrvB.id_throws[3]] = supplier4 = supplier;
        this.id_class[rrvB.id_throws[4]] = supplier3 = supplier2;
        Integer n3 = n;
        this.id_class[rrvB.id_throws[5]] = n3;
        Integer n4 = n2;
        this.id_class[rrvB.id_throws[6]] = n4;
    }

    static {
        rrvB.ntfClinit();
    }

    private void id_class(Ml_1 ml_1, float f, float f2, int n) {
        this.id_volatile();
        String string = "#" + Integer.toHexString(((rrvP)((Object)this.id_class[id_throws[23]])).id_class());
        String string2 = "#" + Integer.toHexString(((rrvP)((Object)this.id_class[id_throws[24]])).id_break());
        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[25]]).id_implements().id_class(ml_1, string + "\n" + string2, (double)(f + id_byte[23]), (double)(f2 + id_byte[24]), ColorHelper.id_break(rrZF.d_, n), id_protected[6], id_protected[7]);
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_volatile();
        if (n3 == 0 && super.id_class(rrtu_32, n, n2, n3, bl)) {
            ((ThemeManager)((Object)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[id_throws[14]])).id_class((rrvP)((Object)this.id_class[id_throws[15]]));
            return id_protected[2];
        }
        return id_protected[3];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-55, 59, -22, -78, 39, 24, 108, 121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC7BBED61B69969C2L;
    }

    private void id_class(Ml_1 ml_1, float f, float f2, int n, int n2, int n3) {
        this.id_volatile();
        float f3 = f + (float)n - id_byte[13];
        float f4 = f2 + (float)n2 - id_byte[14];
        rrfD_2.id_class(ml_1, f3, f4, id_byte[15], id_byte[16], id_byte[17], id_byte[18], id_byte[19], id_byte[20], ColorHelper.id_break(rrZF.d_, n3));
        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[21]]).id_native().id_byte(ml_1, String.valueOf(((rrvP)((Object)this.id_class[id_throws[22]])).ordinal() + id_protected[4]), f3 + id_byte[21], f2 + (float)n2 - id_byte[22], ColorHelper.id_break(rrZF.n_, n3), id_protected[5]);
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, rruv_1 rruv_12, boolean bl, boolean bl2) {
        this.id_volatile();
        super.id_class(ml_1, rrtu_32, n, n2, rruv_12, bl, bl2);
        float f = this.id_private();
        float f2 = this.id_catch();
        int n3 = this.id_case();
        int n4 = this.id_extends();
        if (!((rrZf_1)this.id_class[id_throws[7]]).id_extends().id_volatile().id_long()) {
            ((AnimValue)this.id_class[id_throws[8]]).id_class(((rrvP)((Object)this.id_class[id_throws[9]])).equals((Object)((ThemeManager)((Object)ThemeManager.staticFieldsc3c8b26240a53959b0b3ce0fbbe0f311[id_throws[10]])).id_break()));
        }
        int n5 = (int)(id_byte[1] * ((rrZf_1)this.id_class[id_throws[11]]).id_implements().id_class().id_byte());
        this.id_break(ml_1, f, f2, n3, n4, n5);
        ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[12]]).id_native().id_protected(ml_1, ((rrvP)((Object)this.id_class[id_throws[13]])).id_byte(), f + id_byte[2], f2 + id_byte[3], ColorHelper.id_break(rrZF.d_, n5), id_protected[1]);
    }

    @Override
    public rrZN id_class() {
        this.id_volatile();
        return (rrZf_1)this.id_class[id_throws[26]];
    }

    public void id_class(float f, float f2) {
        this.id_volatile();
        Float f3 = Float.valueOf(f);
        this.id_class[rrvB.id_throws[34]] = f3;
        Float f4 = Float.valueOf(f2);
        this.id_class[rrvB.id_throws[35]] = f4;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9B73D9E5;
    }

    public rrvP id_break() {
        this.id_volatile();
        return (rrvP)((Object)this.id_class[id_throws[27]]);
    }

    private void id_break(Ml_1 ml_1, float f, float f2, int n, int n2, int n3) {
        this.id_volatile();
        MT.id_throws();
        MT.id_package();
        int n4 = ((rrvP)((Object)this.id_class[id_throws[16]])).id_class();
        int n5 = ((rrvP)((Object)this.id_class[id_throws[17]])).id_class();
        int n6 = ((rrvP)((Object)this.id_class[id_throws[18]])).id_break();
        int n7 = ((rrvP)((Object)this.id_class[id_throws[19]])).id_break();
        int n8 = (int)((float)n3 * ((AnimValue)this.id_class[id_throws[20]]).id_byte());
        if (n8 > 0) {
            int n9 = ColorHelper.id_break(n4, n8);
            int n10 = ColorHelper.id_break(n5, n8);
            int n11 = ColorHelper.id_break(n6, n8);
            int n12 = ColorHelper.id_break(n7, n8);
            rrfD_2.id_class(ml_1, f - id_byte[4], f2 - id_byte[5], (float)(n + id_break[0]), (float)(n2 + id_break[1]), id_byte[6], id_byte[7], id_byte[8], n9, n10, n11, n12);
        }
        rrfD_2.id_break(ml_1, f, f2, n, n2, id_byte[9], id_byte[10], id_byte[11], id_byte[12], ColorHelper.id_break(n4, n3), ColorHelper.id_break(n6, n3), ColorHelper.id_break(n5, n3), ColorHelper.id_break(n7, n3));
        this.id_class(ml_1, f, f2, n3);
        this.id_class(ml_1, f, f2, n, n2, n3);
        MT.id_final();
        MT.id_protected();
    }

    private static /* synthetic */ void ntfClinit() {
        rrvB.id_package();
        rrvB.id_int();
        rrvB.id_new();
        rrvB.id_native();
    }

    public float id_catch() {
        this.id_volatile();
        return ((Float)((Supplier)this.id_class[id_throws[30]]).get()).floatValue() + ((Float)this.id_class[id_throws[31]]).floatValue();
    }

    public int id_extends() {
        this.id_volatile();
        return (Integer)this.id_class[id_throws[33]];
    }

    public int id_case() {
        this.id_volatile();
        return (Integer)this.id_class[id_throws[32]];
    }

    private static void id_new() {
        short[] sArray = new short[36];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[3] = 3;
        sArray[4] = 4;
        sArray[5] = 7;
        sArray[6] = 8;
        sArray[8] = 2;
        sArray[9] = 1;
        sArray[13] = 1;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[17] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 2;
        sArray[22] = 1;
        sArray[23] = 1;
        sArray[24] = 1;
        sArray[27] = 1;
        sArray[28] = 3;
        sArray[29] = 5;
        sArray[30] = 4;
        sArray[31] = 6;
        sArray[32] = 7;
        sArray[33] = 8;
        sArray[34] = 5;
        sArray[35] = 6;
        id_throws = sArray;
    }

    private static void id_package() {
        boolean[] blArray = new boolean[10];
        blArray[2] = true;
        blArray[4] = true;
        id_protected = blArray;
    }

    @Override
    public rruv_1 id_protected() {
        return new rruv_1(this.id_private(), this.id_catch(), this.id_case(), this.id_extends());
    }

    public float id_private() {
        this.id_volatile();
        return ((Float)((Supplier)this.id_class[id_throws[28]]).get()).floatValue() + ((Float)this.id_class[id_throws[29]]).floatValue();
    }

    private void id_volatile() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[2]];
            objectArray[rrvB.id_break[3]] = Float.valueOf(id_byte[25]);
            objectArray[rrvB.id_break[4]] = Float.valueOf(id_byte[26]);
            objectArray[rrvB.id_break[5]] = id_protected[8];
            objectArray[rrvB.id_break[6]] = id_protected[9];
        }
    }

    private static void id_native() {
        id_break = new byte[]{5, 5, 9, 5, 6, 7, 8};
    }
}

