/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jj_1;
import celestial.an_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rpB_2;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pu_1 {
    private static double[] id_class;

    private Pu_1() {
    }

    static {
        Pu_1.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7ED3C62AC5C064A0L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-14, -43, -120, -69, 64, 117, 117, 70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        double[] dArray = new double[11];
        dArray[0] = 2.0;
        dArray[1] = 2.0;
        dArray[2] = 2.0;
        dArray[4] = 0.5;
        dArray[5] = 0.5;
        dArray[6] = 0.5;
        dArray[7] = 0.5;
        dArray[8] = 0.5;
        dArray[9] = 0.5;
        dArray[10] = 0.5;
        id_class = dArray;
    }

    public static double id_class(an_3 an_32, rfH_2 rfH_22) {
        return Pu_1.id_class(rfH_22, an_32.Ps().id_break, an_32.Ps().id_byte, an_32.Ps().id_protected);
    }

    public static double id_class(rfH_2 rfH_22, double d, double d2, double d3) {
        double d4 = (double)rfH_22.b_() + id_class[7] - d;
        double d5 = (double)rfH_22.c_() + id_class[8] - d2;
        double d6 = (double)rfH_22.d_() + id_class[9] - d3;
        return Math.sqrt(d4 * d4 + d5 * d5 + d6 * d6);
    }

    public static rjU_2 id_class(rfH_2 rfH_22) {
        return new rjU_2((double)rfH_22.b_() + id_class[4], (double)rfH_22.c_() + id_class[5], (double)rfH_22.d_() + id_class[6]);
    }

    public static rjU_2 id_class(rYB rYB2, rfH_2 rfH_22) {
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        rjC_2 rjC_22 = xc_32.id_extends(rYB2, rfH_22);
        if (rjC_22.id_break()) {
            return Pu_1.id_class(rfH_22);
        }
        double d = (rjC_22.id_break(rpB_2.X) + rjC_22.id_byte(rpB_2.X)) / id_class[0];
        double d2 = (rjC_22.id_break(rpB_2.Y) + rjC_22.id_byte(rpB_2.Y)) / id_class[1];
        double d3 = (rjC_22.id_break(rpB_2.Z) + rjC_22.id_byte(rpB_2.Z)) / id_class[2];
        if (Double.isNaN(d) || Double.isNaN(d2) || Double.isNaN(d3)) {
            throw new IllegalStateException(xc_32 + " " + rfH_22 + " " + rjC_22);
        }
        if (xc_32.id_break() instanceof Jj_1) {
            d2 = id_class[3];
        }
        return new rjU_2((double)rfH_22.b_() + d, (double)rfH_22.c_() + d2, (double)rfH_22.d_() + d3);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6A4E608F;
    }

    public static double id_break(an_3 an_32, rfH_2 rfH_22) {
        return Pu_1.id_class(rfH_22, an_32.Ps().id_break, (double)rfH_22.c_() + id_class[10], an_32.Ps().id_protected);
    }
}

