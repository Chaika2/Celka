/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.gm_3;
import celestial.manager.FontManager;
import celestial.module.render.Hud;
import celestial.rVi_1;
import celestial.rqA_2;
import celestial.rqR_2;
import celestial.rqn_3;
import celestial.rrNM;
import celestial.rrQK;
import celestial.rrQX;
import celestial.rrZO;
import celestial.rrtX_2;
import celestial.rrth_3;
import celestial.util.AnimValue;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtO_2
implements MinecraftAccessor {
    private static byte[] id_byte;
    public Object[] id_class;
    private static boolean[] id_protected;
    private static short[] id_throws;
    public static Object[] id_break;
    private static long[] id_case;
    private static float[] id_catch;

    public boolean id_byte() {
        return !this.id_synchronized() && !((rrNM)this.id_class[id_throws[17]]).id_case() ? id_protected[2] : id_protected[3];
    }

    public long id_int() {
        return (Long)this.id_class[id_throws[34]];
    }

    public rrtO_2(rrtX_2 rrtX_22, rVi_1 rVi_12, rVi_1 rVi_13, int n) {
        this.id_public();
        rrNM rrNM2 = new rrNM((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[0]]), id_catch[0]);
        this.id_class[rrtO_2.id_throws[1]] = rrNM2;
        AnimValue animValue = new AnimValue((rrQK)((Object)rrQK.staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[id_throws[2]]), id_catch[1], id_protected[0]);
        this.id_class[rrtO_2.id_throws[3]] = animValue;
        rrZO rrZO2 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[4]]).id_case();
        this.id_class[rrtO_2.id_throws[5]] = rrZO2;
        rrZO rrZO3 = ((FontManager)FontManager.staticFields71d6c26f697c30cf88e2ba2ddc0b4971[id_throws[6]]).id_class();
        this.id_class[rrtO_2.id_throws[7]] = rrZO3;
        Boolean bl = id_protected[1];
        this.id_class[rrtO_2.id_throws[8]] = bl;
        rrtX_2 rrtX_23 = rrtX_22;
        this.id_class[rrtO_2.id_throws[9]] = rrtX_23;
        rVi_1 rVi_14 = rVi_12;
        this.id_class[rrtO_2.id_throws[10]] = rVi_14;
        rVi_1 rVi_15 = rVi_13;
        this.id_class[rrtO_2.id_throws[11]] = rVi_15;
        Integer n2 = n;
        this.id_class[rrtO_2.id_throws[12]] = n2;
        Long l = rqR_2.id_break();
        this.id_class[rrtO_2.id_throws[13]] = l;
    }

    static {
        rrtO_2.ntfClinit();
    }

    private static void id_this() {
        id_byte = new byte[]{5, 16, 10, 7, 8, 9};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7B62F3D8F3AEC494L;
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrtO_2.id_throws[37]] = bl2;
    }

    public void id_class(Ml_1 ml_1, float f, float f2, float f3, float f4) {
        ((rrNM)this.id_class[id_throws[14]]).id_class(this.id_synchronized());
        ((AnimValue)this.id_class[id_throws[15]]).id_break(((rrth_3)rrth_3.staticFields39e3fc1d50923a0b997a92f976964031[id_throws[16]]).id_break().indexOf(this));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB6C4522;
    }

    public boolean id_class() {
        return (Boolean)this.id_class[id_throws[36]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-6, 73, 85, -48, 114, 38, 126, 111}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_break() {
    }

    public rqA_2 id_throws() {
        return rqn_3.zJ;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtO_2.id_try();
        rrtO_2.id_instanceof();
        rrtO_2.id_else();
        rrtO_2.id_while();
        rrtO_2.id_this();
        rrtO_2.id_goto();
    }

    public float id_finally() {
        return id_catch[4];
    }

    public rrZO id_catch() {
        return (rrZO)this.id_class[id_throws[32]];
    }

    public float id_extends() {
        float f = id_const.id_volatile();
        float f2 = this.id_native();
        float f3 = this.id_package();
        return f + -(f2 + id_catch[2]) * f3;
    }

    private static void id_goto() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f)};
        id_break = objectArray;
    }

    public int id_case() {
        return (int)(Math.min(this.id_package(), id_catch[6]) * id_catch[7]);
    }

    public AnimValue id_continue() {
        return (AnimValue)this.id_class[id_throws[28]];
    }

    private static void id_else() {
        short[] sArray = new short[38];
        sArray[0] = 2;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[5] = 5;
        sArray[7] = 6;
        sArray[8] = 9;
        sArray[9] = 2;
        sArray[10] = 3;
        sArray[11] = 4;
        sArray[12] = 8;
        sArray[13] = 7;
        sArray[15] = 1;
        sArray[18] = 7;
        sArray[19] = 8;
        sArray[20] = 1;
        sArray[21] = 56;
        sArray[23] = 5;
        sArray[24] = 3;
        sArray[25] = 6;
        sArray[26] = 4;
        sArray[28] = 1;
        sArray[29] = 2;
        sArray[30] = 3;
        sArray[31] = 4;
        sArray[32] = 5;
        sArray[33] = 6;
        sArray[34] = 7;
        sArray[35] = 8;
        sArray[36] = 9;
        sArray[37] = 9;
        id_throws = sArray;
    }

    public rrZO id_implements() {
        return (rrZO)this.id_class[id_throws[33]];
    }

    private static void id_instanceof() {
        id_case = new long[1];
    }

    public rVi_1 id_new() {
        return (rVi_1)this.id_class[id_throws[31]];
    }

    public float id_package() {
        return this.id_protected().id_byte();
    }

    private float id_return() {
        byte by = id_byte[0];
        if ((gm_3)rrtO_2.id_import.id_class[id_throws[21]] == null) {
            return by;
        }
        Hud hud = ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_throws[22]]).id_private().w();
        return hud.id_new() + hud.id_while() + (float)by;
    }

    public float id_super() {
        float f = id_const.id_final() - this.id_finally();
        float f2 = this.id_finally() + id_catch[3];
        float f3 = ((AnimValue)this.id_class[id_throws[20]]).id_byte();
        return f - this.id_return() - f2 * f3;
    }

    private static void id_try() {
        boolean[] blArray = new boolean[10];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[8] = true;
        id_protected = blArray;
    }

    private static void id_while() {
        id_catch = new float[]{0.3f, 0.3f, 5.0f, 7.0f, 25.0f, 10.0f, 1.0f, 255.0f, 7.0f};
    }

    private void id_public() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[2]];
            objectArray[rrtO_2.id_byte[3]] = id_case[0];
            objectArray[rrtO_2.id_byte[4]] = id_protected[6];
            objectArray[rrtO_2.id_byte[5]] = id_protected[7];
        }
    }

    public rrNM id_protected() {
        return (rrNM)this.id_class[id_throws[27]];
    }

    public int id_private() {
        return (Integer)this.id_class[id_throws[35]];
    }

    public rrtX_2 id_final() {
        return (rrtX_2)((Object)this.id_class[id_throws[29]]);
    }

    public rVi_1 id_volatile() {
        return (rVi_1)this.id_class[id_throws[30]];
    }

    private boolean id_synchronized() {
        return rqR_2.id_break() - (Long)this.id_class[id_throws[18]] < (long)((Integer)this.id_class[id_throws[19]]).intValue() ? id_protected[4] : id_protected[5];
    }

    public float id_native() {
        byte by = id_byte[1];
        return id_catch[5] + Math.max(((rrZO)this.id_class[id_throws[23]]).id_break(((rVi_1)this.id_class[id_throws[24]]).id_byte()) + (float)by, ((rrZO)this.id_class[id_throws[25]]).id_break(((rVi_1)this.id_class[id_throws[26]]).id_byte()));
    }
}

