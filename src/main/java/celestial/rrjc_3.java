/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JI;
import celestial.Wp_1;
import celestial.an_3;
import celestial.cb_3;
import celestial.dj_3;
import celestial.gm_3;
import celestial.rCt_1;
import celestial.rHu_1;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpr_3;
import celestial.rrju_3;
import celestial.ryO_2;
import celestial.ryr_3;
import celestial.util.MinecraftAccessor;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xt_3;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjc_3
implements MinecraftAccessor {
    private static short[] id_class;
    private static boolean[] id_break;
    private static double[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    public static boolean id_byte(rfH_2 rfH_22) {
        xd_3 xd_32 = rrjc_3.id_protected(rfH_22);
        return xd_32 == xu_3.Jd || xd_32 == xu_3.rg ? id_break[3] : id_break[4];
    }

    static {
        rrjc_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-105, -75, -51, 85, -65, -122, -53, -16}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static Stream<rfH_2> id_class(Predicate<rfH_2> predicate, rrju_3 rrju_32, float f) {
        Stream<rfH_2> stream = ((gm_3)rrjc_3.id_import.id_class[id_class[14]]).id_break((an_3)((cb_3)rrjc_3.id_import.id_class[id_class[15]]), ((cb_3)rrjc_3.id_import.id_class[id_class[16]]).rN().id_class(f), (xc_32, rfH_22) -> predicate.test((rfH_2)rfH_22)).map(rjC_22 -> new rfH_2(rjC_22.id_class()));
        if (rrju_32 == (rrju_3)((Object)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[id_class[17]])) {
            return stream;
        }
        return stream.sorted((rfH_22, rfH_23) -> {
            double d = ((cb_3)rrjc_3.id_import.id_class[id_class[22]]).id_byte((rfH_2)rfH_22);
            double d2 = ((cb_3)rrjc_3.id_import.id_class[id_class[23]]).id_byte((rfH_2)rfH_23);
            if (rrju_32 == (rrju_3)((Object)((Object)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[id_class[24]]))) {
                return Double.compare(d, d2);
            }
            if (rrju_32 == (rrju_3)((Object)((Object)rrju_3.staticFieldsaad619fe5d0133909138b6cd23b7fdf1[id_class[25]]))) {
                return Double.compare(d2, d);
            }
            return id_break[5];
        });
    }

    private static void id_class() {
        short[] sArray = new short[26];
        sArray[0] = 56;
        sArray[1] = 56;
        sArray[2] = 56;
        sArray[3] = 57;
        sArray[4] = 56;
        sArray[5] = 57;
        sArray[6] = 57;
        sArray[7] = 57;
        sArray[8] = 57;
        sArray[9] = 57;
        sArray[10] = 56;
        sArray[11] = 57;
        sArray[12] = 56;
        sArray[13] = 56;
        sArray[14] = 56;
        sArray[15] = 57;
        sArray[16] = 57;
        sArray[17] = 2;
        sArray[18] = 56;
        sArray[19] = 56;
        sArray[20] = 56;
        sArray[21] = 56;
        sArray[22] = 57;
        sArray[23] = 57;
        sArray[25] = 1;
        id_class = sArray;
    }

    public static rfl_3 id_class(xc_3 xc_32, rfH_2 rfH_22) {
        return xc_32.id_break().id_class(xc_32, (rRq_1)((gm_3)rrjc_3.id_import.id_class[id_class[12]]), rfH_22, rjm_3.id_break()).id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x68310765570F6F8EL;
    }

    public static xd_3 id_class(int n, int n2, int n3) {
        return ((gm_3)rrjc_3.id_import.id_class[id_class[1]]).id_byte(new rfH_2(n, n2, n3)).id_break();
    }

    public static boolean id_class(float f) {
        if (((cb_3)rrjc_3.id_import.id_class[id_class[8]]).re() < id_byte[0]) {
            return id_break[2];
        }
        rfl_3 rfl_32 = ((cb_3)rrjc_3.id_import.id_class[id_class[9]]).rN().id_protected(id_byte[1], -f, id_byte[2]);
        return ((gm_3)rrjc_3.id_import.id_class[id_class[10]]).a_((cb_3)rrjc_3.id_import.id_class[id_class[11]], rfl_32);
    }

    public static rjC_2 id_class(ryO_2 ryO_22, rfH_2 rfH_22, xc_3 xc_32, float f) {
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 instanceof Wp_1 && ryO_22 instanceof ryr_3) {
            ryr_3 ryr_32 = (ryr_3)ryO_22;
            return rjw_3.id_class(ryr_32.id_class(xc_32, f));
        }
        if (xd_32 instanceof JI) {
            JI jI = (JI)xd_32;
            if (ryO_22 instanceof rHu_1) {
                rCt_1 rCt_12 = xc_32.id_byte(xt_3.id_package);
                rpr_3 rpr_32 = xc_32.id_byte(xt_3.id_final);
                rjC_2 rjC_22 = jI.id_class(xc_32, (rRq_1)((gm_3)rrjc_3.id_import.id_class[id_class[18]]), rfH_22, rjm_3.id_break());
                if (rCt_12 == rCt_1.SINGLE) {
                    return rjC_22;
                }
                rpr_3 rpr_33 = rCt_12 == rCt_1.LEFT ? rpr_32.id_catch() : rpr_32.id_private();
                rfH_2 rfH_23 = rfH_22.id_break(rpr_33);
                xc_3 xc_33 = ((gm_3)rrjc_3.id_import.id_class[id_class[19]]).id_byte(rfH_23);
                xd_3 xd_33 = xc_33.id_break();
                if (!(xd_33 instanceof JI)) {
                    return rjC_22;
                }
                rCt_1 rCt_13 = xc_33.id_byte(xt_3.id_package);
                rpr_3 rpr_34 = xc_33.id_byte(xt_3.id_final);
                if (rCt_13 == rCt_12 || rpr_34 != rpr_32) {
                    return rjC_22;
                }
                rjC_2 rjC_23 = xd_33.id_class(xc_33, (rRq_1)((gm_3)rrjc_3.id_import.id_class[id_class[20]]), rfH_23, rjm_3.id_break());
                return rjw_3.id_class(rjC_22, rjC_23.id_class(rpr_33.id_implements(), (double)rpr_33.id_finally(), (double)rpr_33.id_extends()));
            }
        }
        return xd_32.id_class(xc_32, (rRq_1)((gm_3)rrjc_3.id_import.id_class[id_class[21]]), rfH_22, rjm_3.id_break());
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9E9F51AF;
    }

    public static boolean id_class(rfH_2 rfH_22) {
        return ((gm_3)rrjc_3.id_import.id_class[id_class[13]]).id_byte(rfH_22).id_byte().id_throws();
    }

    public static boolean id_class(xd_3 xd_32) {
        return !xd_32.id_class(xd_32.id_continue(), (rRq_1)((gm_3)rrjc_3.id_import.id_class[id_class[2]]), ((cb_3)rrjc_3.id_import.id_class[id_class[3]]).Bs(), rLT.LAND) ? id_break[0] : id_break[1];
    }

    public static boolean id_break(float f) {
        return ((gm_3)rrjc_3.id_import.id_class[id_class[4]]).id_byte(new rfH_2(((cb_3)rrjc_3.id_import.id_class[id_class[5]]).rx(), ((cb_3)rrjc_3.id_import.id_class[id_class[6]]).re() - (double)f, ((cb_3)rrjc_3.id_import.id_class[id_class[7]]).BO())).id_break() instanceof dj_3;
    }

    private static void id_break() {
        id_byte = new double[3];
    }

    public static rfl_3 id_break(rfH_2 rfH_22) {
        return rrjc_3.id_class(rrjc_3.id_protected(rfH_22).id_continue(), rfH_22);
    }

    private static /* synthetic */ void ntfClinit() {
        rrjc_3.id_byte();
        rrjc_3.id_class();
        rrjc_3.id_break();
    }

    public static xd_3 id_protected(rfH_2 rfH_22) {
        return ((gm_3)rrjc_3.id_import.id_class[id_class[0]]).id_byte(rfH_22).id_break();
    }
}

