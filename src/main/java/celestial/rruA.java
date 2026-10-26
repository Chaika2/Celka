/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.rjK_2;
import celestial.rrZF;
import celestial.rrfD_2;
import celestial.rrtu_3;
import celestial.rruu_1;
import celestial.rruv_1;
import celestial.rrvk_1;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruA
extends rruu_1 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    private static int[] id_throws;
    private static byte[] id_case;
    private static float[] id_catch;
    public Object[] id_break;

    private int id_byte(boolean bl) {
        return bl ? id_case[1] : id_case[2];
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{76, -109, -64, -79, -18, -62, -32, 46}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public Supplier<Float> id_int() {
        this.id_synchronized();
        return (Supplier)this.id_break[id_byte[16]];
    }

    public rruA(Supplier<Boolean> supplier, Supplier<rjK_2> supplier2, Supplier<rjK_2> supplier3) {
        Supplier<rjK_2> supplier4;
        Supplier<rjK_2> supplier5;
        Supplier<Boolean> supplier6;
        Supplier<Float> supplier7;
        this.id_synchronized();
        AnimValue animValue = new AnimValue(id_catch[0], id_protected[0]);
        this.id_break[rruA.id_byte[0]] = animValue;
        this.id_break[rruA.id_byte[1]] = supplier7 = () -> Float.valueOf(id_catch[15]);
        this.id_break[rruA.id_byte[2]] = supplier6 = supplier;
        this.id_break[rruA.id_byte[3]] = supplier5 = supplier2;
        this.id_break[rruA.id_byte[4]] = supplier4 = supplier3;
        ((AnimValue)this.id_break[id_byte[5]]).id_class(this.id_byte((Boolean)((Supplier)this.id_break[id_byte[6]]).get()));
    }

    static {
        rruA.ntfClinit();
    }

    private static void id_this() {
        float[] fArray = new float[16];
        fArray[0] = 0.6f;
        fArray[1] = 255.0f;
        fArray[3] = 90.0f;
        fArray[4] = 270.0f;
        fArray[5] = 180.0f;
        fArray[6] = 3.5f;
        fArray[7] = 3.5f;
        fArray[8] = 3.5f;
        fArray[9] = 3.5f;
        fArray[10] = 5.0f;
        fArray[11] = 2.0f;
        fArray[12] = 7.5f;
        fArray[13] = 1.5f;
        fArray[14] = 1.5f;
        fArray[15] = 1.0f;
        id_catch = fArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x876D384C;
    }

    @Override
    public Supplier<rjK_2> id_class() {
        this.id_synchronized();
        return (Supplier)this.id_break[id_byte[12]];
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2, boolean bl) {
        this.id_synchronized();
        super.id_class(ml_1, rrtu_32, n, n2, bl);
        rruv_1 rruv_12 = this.id_catch();
        float f = rruv_12.id_break();
        float f2 = rruv_12.id_protected();
        float f3 = rruv_12.id_byte();
        float f4 = rruv_12.id_class();
        boolean bl2 = (Boolean)((Supplier)this.id_break[id_byte[8]]).get();
        int n3 = (int)(id_catch[1] * ((Float)((Supplier)this.id_break[id_byte[9]]).get()).floatValue());
        int n4 = ColorHelper.id_break(id_throws[0], n3);
        int n5 = bl2 ? ColorHelper.id_break(ColorHelper.id_class(id_catch[2]), n3) : n4;
        int n6 = bl2 ? ColorHelper.id_break(ColorHelper.id_class(id_catch[3]), n3) : n4;
        int n7 = bl2 ? ColorHelper.id_break(ColorHelper.id_class(id_catch[4]), n3) : n4;
        int n8 = bl2 ? ColorHelper.id_break(ColorHelper.id_class(id_catch[5]), n3) : n4;
        int n9 = this.id_byte(bl2);
        ((AnimValue)this.id_break[id_byte[10]]).id_break(n9);
        float f5 = ((AnimValue)this.id_break[id_byte[11]]).id_byte();
        if (ClickGuiTheme.id_class()) {
            rrfD_2.id_class(ml_1, f, f2, f3, f4, (int)id_case[0], n5);
        }
        rrfD_2.id_break(ml_1, f, f2, f3, f4, id_catch[6], id_catch[7], id_catch[8], id_catch[9], n5, n6, n7, n8);
        rrfD_2.id_class(ml_1, (double)(f + f3 - id_catch[10] - f5), (double)(f2 + f4 / id_catch[11]), id_catch[12], ColorHelper.id_break(rrZF.d_, n3), rrvk_1.id_class());
    }

    public rruA id_class(Supplier<Float> supplier) {
        Supplier<Float> supplier2;
        this.id_synchronized();
        this.id_break[rruA.id_byte[7]] = supplier2 = supplier;
        return this;
    }

    @Override
    public rruv_1 id_break() {
        return super.id_break().id_class(id_catch[13], id_catch[14]);
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4F13DDBA28B84202L;
    }

    private static /* synthetic */ void ntfClinit() {
        rruA.id_public();
        rruA.id_this();
        rruA.id_super();
        rruA.id_else();
        rruA.id_continue();
    }

    @Override
    public Supplier<rjK_2> id_extends() {
        this.id_synchronized();
        return (Supplier)this.id_break[id_byte[13]];
    }

    private static void id_continue() {
        id_throws = new int[]{6781311};
    }

    private static void id_else() {
        id_case = new byte[]{6, -1, 8, 5};
    }

    public AnimValue id_new() {
        this.id_synchronized();
        return (AnimValue)this.id_break[id_byte[15]];
    }

    public Supplier<Boolean> id_package() {
        this.id_synchronized();
        return (Supplier)this.id_break[id_byte[14]];
    }

    private static void id_super() {
        short[] sArray = new short[17];
        sArray[0] = 3;
        sArray[1] = 4;
        sArray[3] = 1;
        sArray[4] = 2;
        sArray[5] = 3;
        sArray[7] = 4;
        sArray[9] = 4;
        sArray[10] = 3;
        sArray[11] = 3;
        sArray[12] = 1;
        sArray[13] = 2;
        sArray[15] = 3;
        sArray[16] = 4;
        id_byte = sArray;
    }

    private static void id_public() {
        id_protected = new boolean[1];
    }

    private void id_synchronized() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[3]];
        }
    }
}

