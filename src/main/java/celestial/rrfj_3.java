/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.cb_3;
import celestial.rLD;
import celestial.rXQ;
import celestial.rdn_3;
import celestial.rfU_2;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rqr_3;
import celestial.rqw_3;
import celestial.rrAO;
import celestial.rrLz_1;
import celestial.rrfQ_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfj_3
implements MinecraftAccessor {
    private static byte[] id_class;
    private static double[] id_break;
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static short[] id_throws;

    public static double id_byte() {
        float f = ((Float)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[41]]).id_break[id_throws[42]]).floatValue();
        float f2 = id_protected[17];
        if (((Float)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[43]]).id_private[id_throws[44]]).floatValue() < id_protected[18]) {
            f += id_protected[19];
        }
        if (((Float)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[45]]).id_private[id_throws[46]]).floatValue() < id_protected[20]) {
            f2 = id_protected[21];
        } else if (((Float)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[47]]).id_private[id_throws[48]]).floatValue() > id_protected[22]) {
            f2 = id_protected[23];
        }
        if (((Float)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[49]]).id_private[id_throws[50]]).floatValue() > id_protected[24]) {
            f -= id_protected[25] * f2;
        }
        if (((Float)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[51]]).id_private[id_throws[52]]).floatValue() < id_protected[26]) {
            f += id_protected[27] * f2;
        }
        return Math.toRadians(f);
    }

    static {
        rrfj_3.ntfClinit();
    }

    public static void id_class(rrAO rrAO2, rjU_2 rjU_22, float f) {
        double d = rjU_22.id_break - ((cb_3)rrfj_3.id_import.id_class[id_throws[53]]).rx();
        double d2 = rjU_22.id_protected - ((cb_3)rrfj_3.id_import.id_class[id_throws[54]]).BO();
        double d3 = Math.toDegrees(Math.atan2(d2, d)) - id_break[11];
        rrfj_3.id_class(rrAO2, d3, f);
    }

    public static void id_class(rrAO rrAO2, an_3 an_32, boolean bl, float f, float f2) {
        rjU_2 rjU_22 = an_32.Ps();
        double d = rjU_22.id_break - ((cb_3)rrfj_3.id_import.id_class[id_throws[55]]).rx();
        double d2 = rjU_22.id_protected - ((cb_3)rrfj_3.id_import.id_class[id_throws[56]]).BO();
        double d3 = Math.sqrt(d * d + d2 * d2);
        double d4 = Math.toDegrees(Math.atan2(d2, d)) - id_break[12];
        if (bl && d3 < (double)f) {
            d4 = ((Float)an_32.id_throws[id_throws[57]]).floatValue() + id_protected[47];
        }
        rrfj_3.id_class(rrAO2, d4, f2);
    }

    public static float id_class(AtomicReference<Float> atomicReference) {
        rdn_3 rdn_32 = ((cb_3)rrfj_3.id_import.id_class[id_throws[30]]).Sn();
        rdn_32.id_class(rXQ.OFFHAND).forEach((iJ_22, ix_32) -> atomicReference.updateAndGet(f -> Float.valueOf(f.floatValue() * (float)(id_break[13] + ix_32.id_protected()))));
        return atomicReference.get().floatValue();
    }

    public static void id_class(rrAO rrAO2, float f, float f2) {
        float f3 = rrAO2.id_catch();
        float f4 = rrAO2.id_throws();
        double d = rfU_2.id_case(Math.toDegrees(rrfj_3.id_class(f2, (double)f3, (double)f4)));
        if (f3 == id_protected[34] && f4 == id_protected[35]) {
            return;
        }
        float f5 = id_protected[36];
        float f6 = id_protected[37];
        float f7 = id_protected[38];
        for (float f8 = id_protected[39]; f8 <= id_protected[40]; f8 += id_protected[46]) {
            for (float f9 = id_protected[41]; f9 <= id_protected[42]; f9 += id_protected[45]) {
                double d2;
                if (f9 == id_protected[43] && f8 == id_protected[44] || !((d2 = Math.abs(d - rfU_2.id_case(Math.toDegrees(rrfj_3.id_class(f, (double)f8, (double)f9))))) < (double)f7)) continue;
                f7 = (float)d2;
                f5 = f8;
                f6 = f9;
            }
        }
        rrAO2.id_break(f5);
        rrAO2.id_class(f6);
    }

    public static void id_class(float f, boolean bl) {
        ((cb_3)rrfj_3.id_import.id_class[id_throws[10]]).id_byte(((cb_3)rrfj_3.id_import.id_class[id_throws[11]]).rv().id_throws(f, bl ? (double)f : id_break[3], f));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x40EF7D04355F90E1L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2D3172B9;
    }

    public static void id_class(rrLz_1 rrLz_12, float f) {
        if (!rrfj_3.id_catch()) {
            return;
        }
        rjU_2 rjU_22 = rrLz_12.id_catch();
        float f2 = (float)rrfj_3.id_byte();
        rjU_22.id_break = -Math.sin(f2) * (double)f;
        rjU_22.id_protected = Math.cos(f2) * (double)f;
    }

    private static void id_class(rrAO rrAO2, double d, float f) {
        d = rfU_2.id_case(d);
        float f2 = id_protected[48];
        float f3 = id_protected[49];
        float f4 = id_protected[50];
        for (float f5 = id_protected[51]; f5 <= id_protected[52]; f5 += id_protected[58]) {
            for (float f6 = id_protected[53]; f6 <= id_protected[54]; f6 += id_protected[57]) {
                double d2;
                double d3;
                if (f5 == id_protected[55] && f6 == id_protected[56] || !((d3 = Math.abs(d - rfU_2.id_case(d2 = Math.toDegrees(rrfj_3.id_class(f, (double)f5, (double)f6))))) < (double)f4)) continue;
                f4 = (float)d3;
                f2 = f5;
                f3 = f6;
            }
        }
        rrAO2.id_break(f2);
        rrAO2.id_class(f3);
    }

    public static float id_class() {
        return ((rqr_3)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[26]]).id_break[rrfj_3.id_throws[27]]).id_private ? id_protected[13] : (((rqr_3)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[28]]).id_break[rrfj_3.id_throws[29]]).id_implements ? id_protected[14] : id_protected[15]);
    }

    public static void id_class(boolean bl) {
        ((cb_3)rrfj_3.id_import.id_class[id_throws[8]]).id_catch(id_break[0], bl ? id_break[1] : ((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[9]]).rv().id_byte, id_break[2]);
    }

    public static void id_class(float f) {
        float f2 = ((cb_3)rrfj_3.id_import.id_class[id_throws[0]]).sO();
        float f3 = ((rqr_3)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[1]]).id_break[rrfj_3.id_throws[2]]).id_byte;
        float f4 = ((rqr_3)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[3]]).id_break[rrfj_3.id_throws[4]]).id_break;
        if (f3 != id_protected[0]) {
            if (f4 > id_protected[1]) {
                f2 += (float)(f3 > id_protected[2] ? id_class[0] : id_class[1]);
            } else if (f4 < id_protected[3]) {
                f2 += (float)(f3 > id_protected[4] ? id_class[2] : id_class[3]);
            }
            f4 = id_protected[5];
            if (f3 > id_protected[6]) {
                f3 = id_protected[7];
            } else if (f3 < id_protected[8]) {
                f3 = id_protected[9];
            }
        }
        double d = rfU_2.id_break(rrfQ_2.id_class(f2 + id_protected[10]));
        double d2 = rfU_2.id_class(rrfQ_2.id_class(f2 + id_protected[11]));
        ((cb_3)rrfj_3.id_import.id_class[id_throws[5]]).id_catch((double)(f3 * f) * d + (double)(f4 * f) * d2, ((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[6]]).rv().id_byte, (double)(f3 * f) * d2 - (double)(f4 * f) * d);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{119, 65, -85, 13, 78, -78, 58, -39}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static double id_class(float f, double d, double d2) {
        if (d < id_break[6]) {
            f += id_protected[28];
        }
        float f2 = id_protected[29];
        if (d < id_break[7]) {
            f2 = id_protected[30];
        } else if (d > id_break[8]) {
            f2 = id_protected[31];
        }
        if (d2 > id_break[9]) {
            f -= id_protected[32] * f2;
        } else if (d2 < id_break[10]) {
            f += id_protected[33] * f2;
        }
        return Math.toRadians(f);
    }

    public static boolean id_break(boolean bl) {
        return ((rqr_3)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[12]]).id_break[id_throws[13]]).id_protected() || bl && ((rqr_3)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[14]]).id_break[rrfj_3.id_throws[15]]).id_private ? id_byte[1] : id_byte[2];
    }

    public static float id_break() {
        rjU_2 rjU_22 = ((cb_3)rrfj_3.id_import.id_class[id_throws[7]]).rv();
        return rfU_2.id_class(rjU_22.id_break * rjU_22.id_break + rjU_22.id_protected * rjU_22.id_protected);
    }

    public static boolean id_throws() {
        return !((rqr_3)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[38]]).id_break[rrfj_3.id_throws[39]]).id_private && ((cb_3)rrfj_3.id_import.id_class[id_throws[40]]).BL() ? id_byte[5] : id_byte[6];
    }

    private static /* synthetic */ void ntfClinit() {
        rrfj_3.id_implements();
        rrfj_3.id_private();
        rrfj_3.id_extends();
        rrfj_3.id_native();
        rrfj_3.id_finally();
    }

    private static void id_finally() {
        id_class = new byte[]{-45, 45, 45, -45, 6};
    }

    public static boolean id_catch() {
        return rrfj_3.id_break(id_byte[0]);
    }

    private static void id_extends() {
        float[] fArray = new float[59];
        fArray[7] = 1.0f;
        fArray[9] = -1.0f;
        fArray[10] = 90.0f;
        fArray[11] = 90.0f;
        fArray[12] = 0.8f;
        fArray[13] = 1.0f;
        fArray[14] = -1.0f;
        fArray[16] = 100.0f;
        fArray[17] = 1.0f;
        fArray[19] = 180.0f;
        fArray[21] = -0.5f;
        fArray[23] = 0.5f;
        fArray[25] = 90.0f;
        fArray[27] = 90.0f;
        fArray[28] = 180.0f;
        fArray[29] = 1.0f;
        fArray[30] = -0.5f;
        fArray[31] = 0.5f;
        fArray[32] = 90.0f;
        fArray[33] = 90.0f;
        fArray[38] = Float.MAX_VALUE;
        fArray[39] = -1.0f;
        fArray[40] = 1.0f;
        fArray[41] = -1.0f;
        fArray[42] = 1.0f;
        fArray[45] = 1.0f;
        fArray[46] = 1.0f;
        fArray[47] = 180.0f;
        fArray[50] = Float.MAX_VALUE;
        fArray[51] = -1.0f;
        fArray[52] = 1.0f;
        fArray[53] = -1.0f;
        fArray[54] = 1.0f;
        fArray[57] = 1.0f;
        fArray[58] = 1.0f;
        id_protected = fArray;
    }

    public static float id_case() {
        return (float)Math.round(Math.hypot(((cb_3)rrfj_3.id_import.id_class[id_throws[31]]).rx() - (Double)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[32]]).id_throws[id_throws[33]], ((cb_3)rrfj_3.id_import.id_class[id_throws[34]]).BO() - (Double)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[35]]).id_throws[id_throws[36]]) * (double)((rqw_3)rrfj_3.id_import.id_class[id_throws[37]]).id_class() * id_break[4] * id_break[5]) / id_protected[16];
    }

    private static void id_implements() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    public static boolean id_protected() {
        return ((Float)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[16]]).id_private[id_throws[17]]).floatValue() >= id_protected[12] && (Boolean)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[18]]).id_throws[id_throws[19]] == false && (((cb_3)rrfj_3.id_import.id_class[id_throws[20]]).sk().id_class() > id_class[4] || ((rhx_3)((cb_3)rrfj_3.id_import.id_class[rrfj_3.id_throws[21]]).id_implements[rrfj_3.id_throws[22]]).id_byte) && !((cb_3)rrfj_3.id_import.id_class[id_throws[23]]).id_break(rLD.id_package) && !((cb_3)rrfj_3.id_import.id_class[id_throws[24]]).sL() && !((cb_3)rrfj_3.id_import.id_class[id_throws[25]]).h() ? id_byte[3] : id_byte[4];
    }

    private static void id_private() {
        id_throws = new short[]{57, 57, 17, 57, 17, 57, 57, 57, 57, 57, 57, 57, 57, 17, 57, 17, 57, 44, 57, 23, 57, 57, 18, 57, 57, 57, 57, 17, 57, 17, 57, 57, 57, 8, 57, 57, 10, 6, 57, 17, 57, 57, 45, 57, 44, 57, 44, 57, 44, 57, 42, 57, 42, 57, 57, 57, 57, 15};
    }

    private static void id_native() {
        double[] dArray = new double[14];
        dArray[3] = 1.0;
        dArray[4] = 20.0;
        dArray[5] = 100.0;
        dArray[11] = 90.0;
        dArray[12] = 90.0;
        dArray[13] = 1.0;
        id_break = dArray;
    }
}

