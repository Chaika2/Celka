/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;
import celestial.Ml_1;
import celestial.manager.FontManager;
import celestial.rrZF;
import celestial.rrfD_2;
import celestial.rrfi_3;
import celestial.rrtF_2;
import celestial.rrtI_2;
import celestial.rrtL_2;
import celestial.rrtN_2;
import celestial.rrtf_3;
import celestial.rrtm_3;
import celestial.rrtt_3;
import celestial.rrtu_3;
import celestial.rrtv_3;
import celestial.rruv_1;
import celestial.ui.clickgui.ClickGuiTheme;
import celestial.util.AnimValue;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrtw_3
extends rrtt_3
implements rrtL_2 {
    private static byte[] id_throws;
    private static short[] id_native;
    private static boolean[] id_volatile;
    private static float[] id_final;
    public Object[] id_protected;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{37, 53, -116, 106, 32, -114, -12, -38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrtw_3(rrtN_2 rrtN_22, rrtf_3<?> rrtf_32, float f, float f2, float f3, float f4) {
        super(rrtN_22, rrtf_32, f, f2, f3, f4);
        this.id_instanceof();
        rrtv_3 rrtv_32 = new rrtv_3(id_final[0], id_volatile[0]);
        this.id_protected[rrtw_3.id_native[0]] = rrtv_32;
        rrtI_2 rrtI_22 = new rrtI_2(this);
        this.id_protected[rrtw_3.id_native[1]] = rrtI_22;
    }

    static {
        rrtw_3.ntfClinit();
    }

    private static void id_interface() {
        float[] fArray = new float[15];
        fArray[0] = 0.5f;
        fArray[1] = 2.5f;
        fArray[4] = 90.0f;
        fArray[5] = 270.0f;
        fArray[6] = 180.0f;
        fArray[7] = 2.0f;
        fArray[8] = 2.0f;
        fArray[9] = 4.0f;
        fArray[10] = 4.0f;
        fArray[11] = 2.0f;
        fArray[12] = 1.0f;
        fArray[13] = 1.0f;
        fArray[14] = 10.0f;
        id_final = fArray;
    }

    @Override
    public boolean id_class() {
        this.id_instanceof();
        return (Boolean)this.id_protected[id_native[16]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2612C07D2FC8885BL;
    }

    public static void id_class(Ml_1 ml_1, rrtm_3 rrtm_32, float f, float f2, float f3, float f4) {
        int n = rrtm_32.id_class(id_native[8]);
        int n2 = ColorHelper.id_class(id_final[3]);
        int n3 = ColorHelper.id_class(id_final[4]);
        int n4 = ColorHelper.id_class(id_final[5]);
        int n5 = ColorHelper.id_class(id_final[6]);
        if (ClickGuiTheme.id_class()) {
            rrtF_2.id_class(ml_1, f - id_final[7], f2 - id_final[8], f3 + id_final[9], f4 + id_final[10], (int)id_throws[0], n3, Math.min(n, id_throws[1]));
        }
        rrtF_2.id_class(ml_1, f, f2, f3, f4, id_final[11], n2, n3, n4, n5, n);
    }

    @Override
    public void id_class(Ml_1 ml_1, rrtu_3 rrtu_32, int n, int n2) {
        super.id_class(ml_1, rrtu_32, n, n2);
        this.id_return().id_class(this.id_class());
        float f = this.id_package();
        float f2 = this.id_final();
        rruv_1 rruv_12 = this.id_volatile();
        this.id_class(rruv_12.id_break(), rruv_12.id_protected(), rruv_12.id_byte(), rruv_12.id_class(), n, n2);
        this.id_private().id_interface().id_class(ml_1, () -> this.id_class(ml_1, f, f2, n, n2));
    }

    public float id_class(float f, float f2) {
        AnimValue animValue = this.id_return();
        int n = this.id_synchronized().id_class().size();
        float f3 = animValue.id_case() ? (float)n * f - f2 : id_final[2];
        return f3 * animValue.id_byte();
    }

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3) {
        this.id_instanceof();
        super.id_class(rrtu_32, n, n2, n3);
        this.id_class(id_volatile[1]);
        return ((rrtI_2)this.id_protected[id_native[2]]).id_class(rrtu_32, n, n2, n3);
    }

    private void id_class(Ml_1 ml_1, float f, float f2, int n, int n2) {
        this.id_instanceof();
        rrtF_2.id_protected(ml_1, this, ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_native[3]]).id_finally(), this.id_synchronized().id_break().id_throws(), f, f2 + id_final[1], rrZF.k_, id_native[4]);
        ((rrtI_2)this.id_protected[id_native[5]]).id_class(ml_1, n, n2);
    }

    public abstract void id_class(Ml_1 var1, rrtI_2 var2, int var3, int var4);

    public void id_class(Ml_1 ml_1) {
        rrfi_3.id_class();
        ml_1.id_break();
    }

    @Override
    public void id_class(boolean bl) {
        this.id_instanceof();
        Boolean bl2 = bl;
        this.id_protected[rrtw_3.id_native[17]] = bl2;
    }

    public boolean id_class(float f, float f2, float f3, float f4, int n, int n2) {
        this.id_instanceof();
        boolean bl = (float)n >= f && (float)n <= f + f3 && (float)n2 >= f2 && (float)n2 <= f2 + f4 ? id_volatile[3] : id_volatile[4];
        Boolean bl2 = bl;
        this.id_protected[rrtw_3.id_native[7]] = bl2;
        return bl;
    }

    public void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4) {
        MT.id_transient();
        rrfi_3.id_break();
        rrfD_2.id_protected(ml_1, f, f2, f3, f4, id_throws[2]);
        rrfi_3.id_class(id_volatile[5]);
    }

    public abstract boolean id_class(rrtu_3 var1, rrtI_2 var2, float var3, float var4, int var5, int var6, int var7);

    @Override
    public boolean id_class(rrtu_3 rrtu_32, int n, int n2, int n3, boolean bl) {
        this.id_instanceof();
        if (!super.id_class(rrtu_32, n, n2, n3, bl)) {
            return id_volatile[2];
        }
        rruv_1 rruv_12 = this.id_volatile();
        return ((rrtI_2)this.id_protected[id_native[6]]).id_class(rrtu_32, rruv_12.id_break(), rruv_12.id_protected(), n, n2, n3);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB970A449;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtw_3.id_try();
        rrtw_3.id_interface();
        rrtw_3.id_while();
        rrtw_3.id_throw();
    }

    public rrtI_2 id_goto() {
        this.id_instanceof();
        return (rrtI_2)this.id_protected[id_native[14]];
    }

    @Override
    public boolean id_implements() {
        this.id_instanceof();
        return (Boolean)this.id_protected[id_native[12]];
    }

    private void id_instanceof() {
        if (this.id_protected == null) {
            Object[] objectArray = this.id_protected = new Object[id_throws[3]];
            objectArray[rrtw_3.id_throws[4]] = id_volatile[6];
            objectArray[rrtw_3.id_throws[5]] = id_volatile[7];
        }
    }

    public AnimValue id_return() {
        this.id_instanceof();
        return ((rrtv_3)this.id_protected[id_native[15]]).id_class();
    }

    @Override
    public float id_super() {
        this.id_instanceof();
        return ((rrtI_2)this.id_protected[id_native[13]]).id_class() - id_final[14];
    }

    private static void id_throw() {
        id_throws = new byte[]{6, 100, -1, 4, 2, 3};
    }

    private static void id_try() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[5] = true;
        id_volatile = blArray;
    }

    private static void id_while() {
        short[] sArray = new short[18];
        sArray[0] = 1;
        sArray[4] = 255;
        sArray[7] = 2;
        sArray[8] = 255;
        sArray[12] = 2;
        sArray[15] = 1;
        sArray[16] = 3;
        sArray[17] = 3;
        id_native = sArray;
    }

    public abstract float id_public();

    @Override
    public rruv_1 id_volatile() {
        this.id_instanceof();
        return new rruv_1(((rrtI_2)this.id_protected[id_native[9]]).id_break(), this.id_final(), ((rrtI_2)this.id_protected[id_native[10]]).id_throws(), ((rrtI_2)this.id_protected[id_native[11]]).id_class()).id_class(id_final[12], id_final[13]);
    }
}

