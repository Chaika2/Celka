/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PJ;
import celestial.PX;
import celestial.an_3;
import celestial.cb_3;
import celestial.gm_3;
import celestial.iM_2;
import celestial.rYB;
import celestial.rfl_3;
import celestial.rfo_3;
import celestial.rhj_3;
import celestial.rjB_2;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ph_1
implements MinecraftAccessor {
    private static double[] id_class;
    private static float[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[3] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    private Ph_1() {
    }

    static {
        Ph_1.ntfClinit();
    }

    public static an_3 id_class(PX pX, float f, boolean bl, Predicate<an_3> predicate) {
        return Ph_1.id_class(((cb_3)Ph_1.id_import.id_class[id_protected[6]]).id_new(id_break[1]), ((cb_3)Ph_1.id_import.id_class[id_protected[7]]).id_byte(pX.id_protected(), pX.id_throws()), pX, f, bl, predicate);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDDADA92B9607984DL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-19, 108, 103, -110, 35, -22, 70, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x58A348;
    }

    public static an_3 id_class(an_3 an_32, rjU_2 rjU_22, PX pX, float f, boolean bl) {
        return Ph_1.id_class(an_32, rjU_22, pX, f, bl, null);
    }

    public static rjU_2 id_class(an_3 an_32) {
        return new rjU_2(an_32.rx(), an_32.re() + (double)an_32.id_byte(iM_2.CROUCHING), an_32.BO());
    }

    public static rjG_2 id_class(rjU_2 rjU_22, rjU_2 rjU_23, rjS_2 rjS_22, boolean bl) {
        return ((gm_3)Ph_1.id_import.id_class[id_protected[1]]).id_class(new rjB_2(rjU_22, rjU_23, rjS_22, rjs_3.NONE, (cb_3)Ph_1.id_import.id_class[id_protected[2]]), bl);
    }

    private static void id_class() {
        id_break = new float[]{1.0f, 1.0f};
    }

    public static rjG_2 id_class(an_3 an_32, PX pX, double d, boolean bl, Predicate<xc_3> predicate) {
        rjU_2 rjU_22 = bl ? Ph_1.id_class(an_32) : an_32.id_new(id_break[0]);
        rjU_2 rjU_23 = PJ.id_class(pX);
        rjU_2 rjU_24 = rjU_22.id_break(rjU_23.id_break * d, rjU_23.id_byte * d, rjU_23.id_protected * d);
        rjB_2 rjB_22 = new rjB_2(rjU_22, rjU_24, rjS_2.OUTLINE, rjs_3.NONE, an_32);
        rjB_22.id_class(predicate);
        return ((rYB)an_32.id_throws[id_protected[0]]).id_class(rjB_22);
    }

    public static an_3 id_class(an_3 an_32, rjU_2 rjU_22, PX pX, float f, boolean bl, Predicate<xc_3> predicate) {
        if (an_32 == null) {
            return null;
        }
        rjG_2 rjG_22 = bl ? null : PJ.id_class(pX, (double)f, id_byte[1], predicate);
        double d = f * f;
        if (rjG_22 != null) {
            d = rjG_22.id_case().id_case(rjU_22);
        }
        rjU_2 rjU_23 = PJ.id_class(pX);
        rjU_2 rjU_24 = rjU_22.id_break(rjU_23.id_break * (double)f, rjU_23.id_byte * (double)f, rjU_23.id_protected * (double)f);
        rfo_3 rfo_32 = rhj_3.id_class((cb_3)Ph_1.id_import.id_class[id_protected[3]], an_32, rjU_22, rjU_24, d);
        if (rfo_32 == null) {
            return null;
        }
        an_3 an_33 = rfo_32.id_class();
        rjU_2 rjU_25 = rfo_32.id_case();
        double d2 = rjU_22.id_case(rjU_25);
        if (d2 < d || rjG_22 == null) {
            rjG_22 = rfo_32;
        }
        return rjG_22.id_byte() == rjM_2.ENTITY ? an_33 : null;
    }

    public static rjG_2 id_class(an_3 an_32, PX pX, double d) {
        return Ph_1.id_class(an_32, pX, d, id_byte[0]);
    }

    public static rjG_2 id_class(an_3 an_32, PX pX, double d, boolean bl) {
        return Ph_1.id_class(an_32, pX, d, bl, xc_32 -> id_byte[5]);
    }

    public static an_3 id_class(rjU_2 rjU_22, rjU_2 rjU_23, PX pX, float f, boolean bl, Predicate<an_3> predicate) {
        rfl_3 rfl_32;
        rjU_2 rjU_24;
        rfo_3 rfo_32;
        rjG_2 rjG_22 = bl ? null : PJ.id_class(pX, (double)f, id_byte[2]);
        double d = f * f;
        if (rjG_22 != null) {
            d = rjG_22.id_case().id_implements(rjU_22);
        }
        if ((rfo_32 = rhj_3.id_class((cb_3)Ph_1.id_import.id_class[id_protected[5]], rjU_22, rjU_24 = rjU_22.id_break(rjU_23.id_break * d, rjU_23.id_byte * d, rjU_23.id_protected * d), rfl_32 = ((cb_3)Ph_1.id_import.id_class[id_protected[4]]).rN().id_break(rjU_23.id_class(d)).id_class(id_class[0]), an_32 -> !an_32.id_native() && an_32.rY() && (predicate == null || predicate.test((an_3)an_32)) ? id_byte[3] : id_byte[4], d)) == null) {
            return null;
        }
        return rfo_32.id_class();
    }

    private static void id_break() {
        id_class = new double[]{1.0};
    }

    private static /* synthetic */ void ntfClinit() {
        Ph_1.id_byte();
        Ph_1.id_class();
        Ph_1.id_protected();
        Ph_1.id_break();
    }

    private static void id_protected() {
        id_protected = new short[]{7, 56, 57, 57, 57, 57, 57, 57};
    }
}

