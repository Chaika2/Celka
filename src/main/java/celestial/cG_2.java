/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.Aw_1;
import celestial.QY;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.fY_2;
import celestial.fd_3;
import celestial.ff_3;
import celestial.gm_3;
import celestial.iQ_2;
import celestial.jH_2;
import celestial.rRl_1;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rqO_2;
import celestial.rql_3;
import celestial.rrZW;
import celestial.rrbb_3;
import celestial.rrce_3;
import celestial.rruO;
import celestial.rxQ_2;
import com.google.common.hash.Hashing;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class cG_2
extends rhd_3
implements rrce_3 {
    private static boolean[] id_break;
    private static double[] id_finally;
    private static short[] id_extends;
    private static String[] id_native;
    private static float[] id_volatile;
    private static byte[] id_final;
    public Object[] id_class;

    private static void id_boolean() {
        id_finally = new double[]{1.0, 2.0};
    }

    @Override
    public void id_byte() {
        if (this.id_catch()) {
            this.id_class(this);
        }
        super.id_byte();
    }

    public rqO_2 id_int() {
        this.id_long();
        return (rqO_2)this.id_class[id_extends[21]];
    }

    private void id_long() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_final[0]];
            objectArray[cG_2.id_final[1]] = Float.valueOf(id_volatile[10]);
            objectArray[cG_2.id_final[2]] = Float.valueOf(id_volatile[11]);
            objectArray[cG_2.id_final[3]] = Float.valueOf(id_volatile[12]);
            objectArray[cG_2.id_final[4]] = id_break[19];
            objectArray[cG_2.id_final[5]] = Float.valueOf(id_volatile[13]);
            objectArray[cG_2.id_final[6]] = Float.valueOf(id_volatile[14]);
            objectArray[cG_2.id_final[7]] = Float.valueOf(id_volatile[15]);
        }
    }

    private static void id_float() {
        float[] fArray = new float[16];
        fArray[0] = 1.0f;
        fArray[1] = 1.1f;
        fArray[3] = 1.0f;
        fArray[4] = 20.0f;
        fArray[5] = 1.0f;
        fArray[6] = 1.0f;
        fArray[7] = 1.0f;
        fArray[8] = 0.15f;
        fArray[9] = 1.0f;
        id_volatile = fArray;
    }

    public cG_2(gm_3 gm_32, GameProfile gameProfile) {
        super(gm_32, gm_32.id_this(), gm_32.id_else(), gameProfile);
        this.id_long();
        Object var7_3 = null;
        this.id_class[cG_2.id_extends[0]] = var7_3;
        Boolean bl = id_break[0];
        this.id_class[cG_2.id_extends[1]] = bl;
        gm_3 gm_33 = gm_32;
        this.id_class[cG_2.id_extends[2]] = gm_33;
        String string = gameProfile.getName();
        this.id_class[cG_2.id_extends[3]] = string;
        if ((String)this.id_class[id_extends[4]] != null && !((String)this.id_class[id_extends[5]]).isEmpty()) {
            String string2 = rql_3.id_class((String)this.id_class[id_extends[6]]);
            this.id_class[cG_2.id_extends[7]] = string2;
        }
    }

    static {
        cG_2.ntfClinit();
    }

    public static fd_3 id_class(rqO_2 rqO_22, String string) {
        fY_2 fY_22 = QY.id_instanceof().A();
        ff_3 ff_32 = fY_22.id_break(rqO_22);
        if (ff_32 == null) {
            Object[] objectArray = new Object[id_break[11]];
            objectArray[cG_2.id_break[12]] = rql_3.id_class(string);
            ff_32 = new fd_3(null, String.format(id_native[0], objectArray), jH_2.id_class(cG_2.id_extends(string)), id_break[13], null);
            fY_22.id_class(rqO_22, ff_32);
        }
        return (fd_3)ff_32;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x116F96C7;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x70DC3F8E1B88E1CBL;
    }

    @Override
    public void id_class(rruO rruO2) {
        this.id_long();
        rruO rruO3 = rruO2;
        this.id_class[cG_2.id_extends[29]] = rruO3;
    }

    public static rqO_2 id_class(String string) {
        return new rqO_2("skins/" + Hashing.sha1().hashUnencodedChars((CharSequence)rql_3.id_class(string)));
    }

    public void id_class(boolean bl) {
        this.id_long();
        Boolean bl2 = bl;
        this.id_class[cG_2.id_extends[25]] = bl2;
    }

    public void id_class(rqO_2 rqO_22) {
        this.id_long();
        rqO_2 rqO_23 = rqO_22;
        this.id_class[cG_2.id_extends[22]] = rqO_23;
    }

    private static void id_short() {
        boolean[] blArray = new boolean[20];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[16] = true;
        blArray[17] = true;
        id_break = blArray;
    }

    public String id_break() {
        Aw_1 aw_1 = this.id_continue();
        return aw_1 == null ? jH_2.id_break(this.ro()) : aw_1.id_throws();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{85, -78, -125, 96, 13, 77, -76, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rruO id_throws() {
        this.id_long();
        return (rruO)this.id_class[id_extends[28]];
    }

    private static /* synthetic */ void ntfClinit() {
        cG_2.id_short();
        cG_2.id_public();
        cG_2.id_else();
        cG_2.id_float();
        cG_2.id_boolean();
        cG_2.id_static();
    }

    public boolean id_finally() {
        Aw_1 aw_1 = this.id_continue();
        return aw_1 != null && aw_1.id_protected() ? id_break[7] : id_break[8];
    }

    public boolean id_catch() {
        return this.id_case() == (rqO_2)rhd_3.id_protected[id_extends[27]] ? id_break[17] : id_break[18];
    }

    @Override
    public String id_extends() {
        this.id_long();
        return (String)this.id_class[id_extends[20]];
    }

    public rqO_2 id_case() {
        this.id_long();
        if (!rrbb_3.e()) {
            return null;
        }
        if (this == (cb_3)QY.id_instanceof().id_class[id_extends[11]] || ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_extends[12]]).id_class(this)) {
            return (rqO_2)rhd_3.id_protected[id_extends[13]];
        }
        if ((rqO_2)this.id_class[id_extends[14]] != null) {
            return (rqO_2)this.id_class[id_extends[15]];
        }
        Aw_1 aw_1 = this.id_continue();
        return aw_1 == null ? null : aw_1.id_catch();
    }

    public Aw_1 id_continue() {
        this.id_long();
        if ((Aw_1)this.id_class[id_extends[8]] == null) {
            Aw_1 aw_1 = QY.id_instanceof().id_void().id_class(this.ro());
            this.id_class[cG_2.id_extends[9]] = aw_1;
        }
        return (Aw_1)this.id_class[id_extends[10]];
    }

    private static void id_else() {
        short[] sArray = new short[30];
        sArray[0] = 6;
        sArray[1] = 7;
        sArray[2] = 5;
        sArray[3] = 8;
        sArray[4] = 8;
        sArray[5] = 8;
        sArray[6] = 8;
        sArray[7] = 8;
        sArray[8] = 1;
        sArray[9] = 1;
        sArray[10] = 1;
        sArray[11] = 57;
        sArray[13] = 8;
        sArray[14] = 6;
        sArray[15] = 6;
        sArray[16] = 18;
        sArray[17] = 18;
        sArray[18] = 18;
        sArray[19] = 20;
        sArray[20] = 8;
        sArray[21] = 6;
        sArray[22] = 6;
        sArray[23] = 6;
        sArray[24] = 7;
        sArray[25] = 7;
        sArray[26] = 7;
        sArray[27] = 8;
        id_extends = sArray;
    }

    @Override
    public boolean id_implements() {
        Aw_1 aw_1 = QY.id_instanceof().id_void().id_class(this.sv().getId());
        return aw_1 != null && aw_1.id_break() == rRl_1.CREATIVE ? id_break[3] : id_break[4];
    }

    public float id_new() {
        float f = id_volatile[0];
        if (((rhx_3)this.id_implements[cG_2.id_extends[16]]).id_break) {
            f *= id_volatile[1];
        }
        f = (float)((double)f * ((this.id_class(iQ_2.id_protected) / (double)((rhx_3)this.id_implements[id_extends[17]]).id_break() + id_finally[0]) / id_finally[1]));
        if (((rhx_3)this.id_implements[id_extends[18]]).id_break() == id_volatile[2] || Float.isNaN(f) || Float.isInfinite(f)) {
            f = id_volatile[3];
        }
        if (this.id_return() && this.sX().id_break() instanceof rxQ_2) {
            int n = this.SU();
            float f2 = (float)n / id_volatile[4];
            f2 = f2 > id_volatile[5] ? id_volatile[6] : (f2 *= f2);
            f *= id_volatile[7] - f2 * id_volatile[8];
        }
        return rfU_2.id_catch(((Qw_1)QY.id_instanceof().id_class[cG_2.id_extends[19]]).e, id_volatile[9], f);
    }

    public boolean id_package() {
        this.id_long();
        rqO_2 rqO_22 = this.id_case();
        if (this.id_catch()) {
            return id_break[14];
        }
        if (rqO_22 == null) {
            return id_break[15];
        }
        return rqO_22 == (rqO_2)this.id_class[id_extends[23]] ? (Boolean)this.id_class[id_extends[24]] : id_break[16];
    }

    public boolean id_super() {
        return this.id_continue() != null ? id_break[5] : id_break[6];
    }

    private static void id_static() {
        id_final = new byte[]{14, 2, 3, 4, 7, 11, 12, 13};
    }

    private static void id_public() {
        id_native = new String[]{new String("http://skins.minecraft.net/MinecraftSkins/%s.png")};
    }

    public boolean id_protected() {
        return this.id_continue() != null ? id_break[9] : id_break[10];
    }

    public boolean id_private() {
        this.id_long();
        return (Boolean)this.id_class[id_extends[26]];
    }

    public rqO_2 id_final() {
        Aw_1 aw_1 = this.id_continue();
        return aw_1 == null ? jH_2.id_class(this.ro()) : aw_1.id_case();
    }

    public rqO_2 id_volatile() {
        Aw_1 aw_1 = this.id_continue();
        return aw_1 == null ? null : aw_1.id_private();
    }

    @Override
    public boolean id_native() {
        Aw_1 aw_1 = QY.id_instanceof().id_void().id_class(this.sv().getId());
        return aw_1 != null && aw_1.id_break() == rRl_1.SPECTATOR ? id_break[1] : id_break[2];
    }
}

