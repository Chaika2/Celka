/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_throws;
import celestial.JC;
import celestial.Jj_1;
import celestial.PP;
import celestial.PX;
import celestial.Ph_1;
import celestial.Ps_1;
import celestial.Pu_1;
import celestial.Px_1;
import celestial.an_3;
import celestial.cb_3;
import celestial.gm_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjB_2;
import celestial.rjC_2;
import celestial.rjG_2;
import celestial.rjK_2;
import celestial.rjM_2;
import celestial.rjS_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rjw_3;
import celestial.rpB_2;
import celestial.rrTA;
import celestial.rrTR;
import celestial.rrTj_1;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Optional;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PJ {
    private static short[] id_break;
    private static float[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    private static double[] id_throws;
    private static byte[] id_case;

    public static int id_byte(an_3 an_32, double d, double d2) {
        double d3 = id_throws[16];
        double d4 = d - an_32.rx();
        double d5 = d2 - an_32.BO();
        if (d5 > id_throws[17] && d4 > id_throws[18]) {
            d3 = Math.toDegrees(-Math.atan(d4 / d5));
        } else if (d5 > id_throws[19] && d4 < id_throws[20]) {
            d3 = Math.toDegrees(-Math.atan(d4 / d5));
        } else if (d5 < id_throws[21] && d4 > id_throws[22]) {
            d3 = id_throws[23] + Math.toDegrees(Math.atan(d5 / d4));
        } else if (d5 < id_throws[24] && d4 < id_throws[25]) {
            d3 = id_throws[26] + Math.toDegrees(Math.atan(d5 / d4));
        }
        int n = (int)(Math.abs(d3 - (double)((Float)an_32.id_throws[id_break[27]]).floatValue()) % id_throws[27]);
        return n > id_break[28] ? id_break[29] - n : n;
    }

    private static void id_byte() {
        float[] fArray = new float[20];
        fArray[0] = (float)Math.PI / 180;
        fArray[1] = (float)Math.PI;
        fArray[2] = (float)Math.PI / 180;
        fArray[3] = (float)Math.PI;
        fArray[4] = (float)Math.PI / 180;
        fArray[5] = (float)Math.PI / 180;
        fArray[6] = (float)Math.PI / 180;
        fArray[7] = (float)Math.PI;
        fArray[8] = (float)Math.PI / 180;
        fArray[9] = (float)Math.PI;
        fArray[10] = (float)Math.PI / 180;
        fArray[11] = (float)Math.PI / 180;
        fArray[12] = 1.0f;
        fArray[13] = 1.0f;
        fArray[15] = 1.0E-4f;
        fArray[16] = 1.0f;
        fArray[17] = 1.0f;
        fArray[18] = 2.0f;
        id_byte = fArray;
    }

    private PJ() {
    }

    static {
        PJ.ntfClinit();
    }

    public static float id_class(float f, double d, double d2, double d3, double d4) {
        double d5 = d3 - d;
        double d6 = d4 - d2;
        float f2 = (float)(Math.atan2(d6, d5) * id_throws[13] / id_throws[14] - id_throws[15]);
        return f + rfU_2.id_catch(f2 - f);
    }

    public static PX id_class(rfH_2 rfH_22) {
        double d = (double)rfH_22.b_() + id_throws[7] - ((cb_3)PP.b_.id_class[id_break[10]]).rx();
        double d2 = (double)rfH_22.c_() + id_throws[8] - ((cb_3)PP.b_.id_class[id_break[11]]).rH();
        double d3 = (double)rfH_22.d_() + id_throws[9] - ((cb_3)PP.b_.id_class[id_break[12]]).BO();
        return PJ.id_class(d, d2, d3);
    }

    public static PX id_class(rfH_2 rfH_22, rfH_2 rfH_23) {
        return PJ.id_class(new rjU_2(rfH_22), new rjU_2(rfH_23));
    }

    @Deprecated
    public static Optional<PX> id_class(an_3 an_32, rfH_2 rfH_22, double d, boolean bl) {
        return PJ.id_class(an_32, rfH_22, Pu_1.id_class((rYB)an_32.id_throws[id_break[9]], rfH_22), d, bl);
    }

    public static Optional<Px_1> id_class(Ps_1 ps_1, rfH_2 rfH_22, double d) {
        return PJ.id_break(ps_1, rfH_22, d, id_protected[8]);
    }

    public static Optional<Px_1> id_class(Ps_1 ps_1, rfH_2 rfH_22, boolean bl, Predicate<xc_3> predicate) {
        return PJ.id_break(ps_1, rfH_22, ps_1.id_native().id_case(), bl, predicate);
    }

    public static Optional<Px_1> id_class(Ps_1 ps_1, rfH_2 rfH_22, Predicate<xc_3> predicate) {
        return PJ.id_class(ps_1, rfH_22, id_protected[7], predicate);
    }

    public static rjG_2 id_class(PX pX, rjU_2 rjU_22, double d, boolean bl) {
        rjU_2 rjU_23 = ((cb_3)PP.b_.id_class[id_break[1]]).id_class(rjU_22, id_byte[13]);
        return PJ.id_class(pX, d, bl, rjU_23);
    }

    public static Optional<Px_1> id_class(Ps_1 ps_1, rfH_2 rfH_22, double d, boolean bl, Predicate<xc_3> predicate) {
        return PJ.id_class(ps_1, rfH_22, Pu_1.id_class(ps_1.id_case(), rfH_22), d, bl, predicate);
    }

    private static rjG_2 id_class(PX pX, double d, boolean bl, rjU_2 rjU_22) {
        return PJ.id_class(pX, d, bl, rjU_22, null);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-55, 27, 7, -10, -6, -72, 77, -17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static PX id_class(rrTj_1 rrTj_12) {
        if (rrTj_12 instanceof rrTR) {
            rrTR rrTR2 = (rrTR)rrTj_12;
            if (rrTR2 instanceof an_3) {
                an_3 an_32 = (an_3)rrTR2;
                return PJ.id_class(an_32);
            }
            return PJ.id_class(rrTR2.rr().id_private());
        }
        return ((cb_3)PP.b_.id_class[id_break[19]]).id_goto();
    }

    public static Optional<Px_1> id_class(Ps_1 ps_1, rfH_2 rfH_22, rjU_2 rjU_22, double d, boolean bl) {
        return PJ.id_class(ps_1, rfH_22, rjU_22, d, bl, xc_32 -> id_protected[18]);
    }

    public static PX id_class(rrTA rrTA2) {
        rjU_2 rjU_22 = rrTA2.rr();
        double d = rjU_22.id_class() - ((cb_3)PP.b_.id_class[id_break[20]]).rx();
        double d2 = rjU_22.id_break() - ((cb_3)PP.b_.id_class[id_break[21]]).rH();
        double d3 = rjU_22.id_byte() - ((cb_3)PP.b_.id_class[id_break[22]]).BO();
        return PJ.id_class(d, d2, d3);
    }

    public static rjU_2 id_class(rjK_2 rjK_22) {
        float f = rfU_2.id_break(-rjK_22.id_byte * id_byte[6] - id_byte[7]);
        float f2 = rfU_2.id_class(-rjK_22.id_byte * id_byte[8] - id_byte[9]);
        float f3 = -rfU_2.id_break(-rjK_22.id_protected * id_byte[10]);
        float f4 = rfU_2.id_class(-rjK_22.id_protected * id_byte[11]);
        return new rjU_2(f2 * f3, f4, f * f3);
    }

    public static PX id_class(rjU_2 rjU_22, rjU_2 rjU_23) {
        double[] dArray = new double[id_case[0]];
        dArray[PJ.id_protected[0]] = rjU_22.id_break - rjU_23.id_break;
        dArray[PJ.id_protected[1]] = rjU_22.id_byte - rjU_23.id_byte;
        dArray[PJ.id_case[1]] = rjU_22.id_protected - rjU_23.id_protected;
        double[] dArray2 = dArray;
        double d = rfU_2.id_protected(dArray2[id_protected[2]], -dArray2[id_case[2]]);
        double d2 = Math.sqrt(dArray2[id_protected[3]] * dArray2[id_protected[4]] + dArray2[id_case[3]] * dArray2[id_case[4]]);
        double d3 = rfU_2.id_protected(dArray2[id_protected[5]], d2);
        return new PX((float)(d * id_throws[0]), (float)(d3 * id_throws[1]));
    }

    @Deprecated
    public static Optional<Px_1> id_class(cb_3 cb_32, rfH_2 rfH_22, double d) {
        return PJ.id_class(cb_32, rfH_22, d, id_protected[11]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB414F329;
    }

    public static rjU_2 id_class(PX pX) {
        float f = rfU_2.id_break(-pX.id_throws() * id_byte[0] - id_byte[1]);
        float f2 = rfU_2.id_class(-pX.id_throws() * id_byte[2] - id_byte[3]);
        float f3 = -rfU_2.id_break(-pX.id_protected() * id_byte[4]);
        float f4 = rfU_2.id_class(-pX.id_protected() * id_byte[5]);
        return new rjU_2(f2 * f3, f4, f * f3);
    }

    @Deprecated
    public static Optional<PX> id_class(an_3 an_32, rfH_2 rfH_22, rjU_2 rjU_22, double d, boolean bl) {
        rjU_2 rjU_23 = bl ? Ph_1.id_class(an_32) : an_32.id_new(id_byte[17]);
        PX pX = PJ.id_class(rjU_23, rjU_22, new PX(((Float)an_32.id_throws[id_break[6]]).floatValue(), ((Float)an_32.id_throws[id_break[7]]).floatValue()));
        rjG_2 rjG_22 = Ph_1.id_class(an_32, pX, d, bl);
        if (rjG_22 != null && rjG_22.id_byte() == rjM_2.BLOCK) {
            if (((rff_3)rjG_22).id_class().equals(rfH_22)) {
                return Optional.of(pX);
            }
            if (((rYB)an_32.id_throws[id_break[8]]).id_byte(rfH_22).id_break() instanceof Jj_1 && ((rff_3)rjG_22).id_class().equals(rfH_22.id_break())) {
                return Optional.of(pX);
            }
        }
        return Optional.empty();
    }

    public static PX id_class(rjU_2 rjU_22) {
        double d = rjU_22.id_class() - ((cb_3)PP.b_.id_class[id_break[16]]).rx();
        double d2 = rjU_22.id_break() - ((cb_3)PP.b_.id_class[id_break[17]]).rH();
        double d3 = rjU_22.id_byte() - ((cb_3)PP.b_.id_class[id_break[18]]).BO();
        return PJ.id_class(d, d2, d3);
    }

    public static PX id_class(an_3 an_32) {
        double d = an_32.rx() - ((cb_3)PP.b_.id_class[id_break[13]]).rx();
        double d2 = an_32.re() + (double)(an_32.Bx() / id_byte[18]) - ((cb_3)PP.b_.id_class[id_break[14]]).rH();
        double d3 = an_32.BO() - ((cb_3)PP.b_.id_class[id_break[15]]).BO();
        return PJ.id_class(d, d2, d3);
    }

    public static Optional<Px_1> id_class(Ps_1 ps_1, rfH_2 rfH_22, boolean bl) {
        return PJ.id_break(ps_1, rfH_22, ps_1.id_native().id_case(), bl);
    }

    private static void id_class() {
        Object[] objectArray = new Object[4];
        objectArray[0] = new PX(-40.048595f, 18.149609f);
        objectArray[1] = Math.PI / 180;
        objectArray[2] = 57.29577951308232;
        rjU_2[] rjU_2Array = new rjU_2[]{new rjU_2(0.5, 0.0, 0.5), new rjU_2(0.5, 1.0, 0.5), new rjU_2(0.5, 0.5, 0.0), new rjU_2(0.5, 0.5, 1.0), new rjU_2(0.0, 0.5, 0.5), new rjU_2(1.0, 0.5, 0.5)};
        objectArray[3] = rjU_2Array;
        id_class = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x31F144EA3128E9E2L;
    }

    public static Optional<Px_1> id_class(Ps_1 ps_1, rfH_2 rfH_22) {
        return PJ.id_class(ps_1, rfH_22, id_protected[6]);
    }

    public static Optional<Px_1> id_class(Ps_1 ps_1, rfH_2 rfH_22, double d, boolean bl) {
        return PJ.id_class(ps_1, rfH_22, Pu_1.id_class(ps_1.id_case(), rfH_22), d, bl);
    }

    public static boolean id_class(rhd_3 rhd_32, rhd_3 rhd_33) {
        return rhd_32.m().id_break(rhd_33.m()) >= id_throws[6] ? id_protected[12] : id_protected[13];
    }

    public static rjG_2 id_class(PX pX, double d, boolean bl) {
        return PJ.id_class(pX, d, bl, null);
    }

    public static double id_class(an_3 an_32, double d, double d2) {
        double d3 = id_throws[39];
        double d4 = d - an_32.rx();
        double d5 = d2 - an_32.BO();
        if (d5 > id_throws[40] && d4 > id_throws[41]) {
            d3 = Math.toDegrees(-Math.atan(d4 / d5));
        } else if (d5 > id_throws[42] && d4 < id_throws[43]) {
            d3 = Math.toDegrees(-Math.atan(d4 / d5));
        } else if (d5 < id_throws[44] && d4 > id_throws[45]) {
            d3 = id_throws[46] + Math.toDegrees(Math.atan(d5 / d4));
        } else if (d5 < id_throws[47] && d4 < id_throws[48]) {
            d3 = id_throws[49] + Math.toDegrees(Math.atan(d5 / d4));
        }
        double d6 = Math.abs(d3 - (double)((Float)an_32.id_throws[id_break[32]]).floatValue()) % id_throws[50];
        return d6 > id_throws[51] ? id_throws[52] - d6 : d6;
    }

    public static PX id_class(float f) {
        return new PX(-rfU_2.id_class(f * rfU_2.id_throws), rfU_2.id_break(f * rfU_2.id_throws));
    }

    public static double id_class(double d) {
        if ((d %= id_throws[34]) >= id_throws[35]) {
            d -= id_throws[36];
        }
        if (d < id_throws[37]) {
            d += id_throws[38];
        }
        return d;
    }

    public static PX id_class(double d, double d2, double d3) {
        float f = (float)(rfU_2.id_protected(d3, d) * id_throws[10] - id_throws[11]);
        float f2 = (float)(-(rfU_2.id_protected(d2, (double)rfU_2.id_class(d * d + d3 * d3)) * id_throws[12]));
        float f3 = rfU_2.id_catch(f);
        return new PX(f3, f2);
    }

    public static PX id_class(rjU_2 rjU_22, rjU_2 rjU_23, PX pX) {
        return PJ.id_break(pX, PJ.id_class(rjU_22, rjU_23));
    }

    public static double id_class(float f, float f2) {
        return Math.abs(f - f2);
    }

    public static rjG_2 id_class(PX pX, double d, boolean bl, Predicate<xc_3> predicate) {
        rjU_2 rjU_22 = ((cb_3)PP.b_.id_class[id_break[0]]).id_new(id_byte[12]);
        return PJ.id_class(pX, d, bl, rjU_22, predicate);
    }

    public static int id_class(an_3 an_32, double d, double d2, double d3) {
        double d4 = d - an_32.rx();
        double d5 = d2 - id_throws[28] - an_32.re();
        double d6 = d3 - an_32.BO();
        double d7 = Math.sqrt(d4 * d4 + d6 * d6);
        float f = (float)(-(Math.atan2(d5, d7) * id_throws[29] / id_throws[30]));
        return (int)Math.abs((double)f - (double)((Float)an_32.id_throws[id_break[30]]).floatValue());
    }

    private static rjG_2 id_class(PX pX, double d, boolean bl, rjU_2 rjU_22, Predicate<xc_3> predicate) {
        rjU_2 rjU_23 = PJ.id_class(pX);
        rjU_2 rjU_24 = rjU_22.id_break(rjU_23.id_break * d, rjU_23.id_byte * d, rjU_23.id_protected * d);
        rjB_2 rjB_22 = new rjB_2(rjU_22, rjU_24, rjS_2.OUTLINE, bl ? rjs_3.ANY : rjs_3.NONE, (cb_3)PP.b_.id_class[id_break[2]]);
        rjB_22.id_class(predicate);
        return ((gm_3)PP.b_.id_class[id_break[3]]).id_class(rjB_22);
    }

    public static double id_class(PX pX, PX pX2) {
        double d = Math.abs(pX.id_throws() - pX2.id_throws());
        double d2 = Math.abs(pX.id_protected() - pX2.id_protected());
        return Math.sqrt(d * d + d2 * d2);
    }

    public static Optional<Px_1> id_class(Ps_1 ps_1, rfH_2 rfH_22, rjU_2 rjU_22, double d, boolean bl, Predicate<xc_3> predicate) {
        rjU_2 rjU_23 = bl ? Ph_1.id_class(ps_1.id_catch()) : ps_1.id_catch().id_new(id_byte[16]);
        PX pX = PJ.id_class(rjU_23, rjU_22, ps_1.id_protected());
        PX pX2 = C_throws.id_class().id_class(ps_1.id_catch()).id_catch().id_class().id_class(pX);
        rjG_2 rjG_22 = Ph_1.id_class((an_3)ps_1.id_catch(), pX2, d, bl, predicate);
        if (rjG_22 != null && rjG_22.id_byte() == rjM_2.BLOCK) {
            if (((rff_3)rjG_22).id_class().equals(rfH_22)) {
                return Optional.of(new Px_1(pX, rjG_22));
            }
            if (ps_1.id_case().id_byte(rfH_22).id_break() instanceof Jj_1 && ((rff_3)rjG_22).id_class().equals(rfH_22.id_break())) {
                return Optional.of(new Px_1(pX, rjG_22));
            }
        }
        return Optional.empty();
    }

    @Deprecated
    public static Optional<Px_1> id_class(cb_3 cb_32, rfH_2 rfH_22, double d, boolean bl) {
        C_case c_case = C_throws.id_class().id_class(cb_32);
        Ps_1 ps_1 = c_case.id_throw();
        return PJ.id_break(ps_1, rfH_22, d, bl);
    }

    public static double id_break(float f, float f2) {
        double d = Math.abs(f - f2);
        return Math.min(d, id_throws[2] - d);
    }

    public static boolean id_break(an_3 an_32, double d, double d2, double d3) {
        double d4 = d - an_32.rx();
        double d5 = d2 - id_throws[31] - an_32.re();
        double d6 = d3 - an_32.BO();
        double d7 = Math.sqrt(d4 * d4 + d6 * d6);
        float f = (float)(-(Math.atan2(d5, d7) * id_throws[32] / id_throws[33]));
        return (float)PJ.id_class((double)(((Float)an_32.id_throws[id_break[31]]).floatValue() - f)) < id_byte[19] ? id_protected[14] : id_protected[15];
    }

    public static PX id_break(PX pX, PX pX2) {
        if (pX.id_break(pX2)) {
            return new PX(pX.id_throws(), pX2.id_protected());
        }
        return pX2.id_byte(pX).id_break().id_protected(pX);
    }

    public static float id_break(an_3 an_32) {
        return PJ.id_class(((Float)((cb_3)PP.b_.id_class[PJ.id_break[23]]).id_throws[id_break[24]]).floatValue(), ((cb_3)PP.b_.id_class[id_break[25]]).rx(), ((cb_3)PP.b_.id_class[id_break[26]]).BO(), an_32.rx(), an_32.BO());
    }

    public static Optional<Px_1> id_break(Ps_1 ps_1, rfH_2 rfH_22, double d, boolean bl) {
        return PJ.id_break(ps_1, rfH_22, d, bl, xc_32 -> id_protected[19]);
    }

    public static boolean id_break(an_3 an_32, double d, double d2) {
        double d3 = id_throws[53];
        double d4 = d - an_32.rx();
        double d5 = d2 - an_32.BO();
        if (d5 > id_throws[54] && d4 > id_throws[55]) {
            d3 = Math.toDegrees(-Math.atan(d4 / d5));
        } else if (d5 > id_throws[56] && d4 < id_throws[57]) {
            d3 = Math.toDegrees(-Math.atan(d4 / d5));
        } else if (d5 < id_throws[58] && d4 > id_throws[59]) {
            d3 = id_throws[60] + Math.toDegrees(Math.atan(d5 / d4));
        } else if (d5 < id_throws[61] && d4 < id_throws[62]) {
            d3 = id_throws[63] + Math.toDegrees(Math.atan(d5 / d4));
        }
        int n = (int)PJ.id_class((d3 - (double)((Float)an_32.id_throws[id_break[33]]).floatValue()) % id_throws[64]);
        return n < 0 ? id_protected[16] : id_protected[17];
    }

    private static void id_break() {
        short[] sArray = new short[34];
        sArray[0] = 57;
        sArray[1] = 57;
        sArray[2] = 57;
        sArray[3] = 56;
        sArray[5] = 3;
        sArray[6] = 15;
        sArray[7] = 16;
        sArray[8] = 7;
        sArray[9] = 7;
        sArray[10] = 57;
        sArray[11] = 57;
        sArray[12] = 57;
        sArray[13] = 57;
        sArray[14] = 57;
        sArray[15] = 57;
        sArray[16] = 57;
        sArray[17] = 57;
        sArray[18] = 57;
        sArray[19] = 57;
        sArray[20] = 57;
        sArray[21] = 57;
        sArray[22] = 57;
        sArray[23] = 57;
        sArray[24] = 15;
        sArray[25] = 57;
        sArray[26] = 57;
        sArray[27] = 15;
        sArray[28] = 180;
        sArray[29] = 360;
        sArray[30] = 16;
        sArray[31] = 16;
        sArray[32] = 15;
        sArray[33] = 15;
        id_break = sArray;
    }

    public static Optional<Px_1> id_break(Ps_1 ps_1, rfH_2 rfH_22, double d, boolean bl, Predicate<xc_3> predicate) {
        Object object;
        Optional<Px_1> optional;
        if (((Boolean)C_class.id_instanceof().N.id_class[id_break[4]]).booleanValue() && ps_1.id_class(rfH_22)) {
            optional = ps_1.id_protected().id_protected(new PX(id_byte[14], id_byte[15]));
            object = Ph_1.id_class((an_3)ps_1.id_catch(), (PX)((Object)optional), d, id_protected[9], predicate);
            if (bl) {
                if (object != null && ((rjG_2)object).id_byte() == rjM_2.BLOCK && ((rff_3)object).id_class().equals(rfH_22)) {
                    return Optional.of(new Px_1((PX)((Object)optional), (rjG_2)object));
                }
            } else {
                return Optional.of(new Px_1((PX)((Object)optional), (rjG_2)object));
            }
        }
        if ((optional = PJ.id_class(ps_1, rfH_22, d, bl, predicate)).isPresent()) {
            return optional;
        }
        object = ps_1.id_case().id_byte(rfH_22);
        rjC_2 rjC_22 = ((JC)object).id_finally(ps_1.id_case(), rfH_22);
        if (rjC_22.id_break()) {
            rjC_22 = rjw_3.id_break();
        }
        rjU_2[] rjU_2Array = (rjU_2[])id_class[id_break[5]];
        int n = rjU_2Array.length;
        for (int i = id_protected[10]; i < n; ++i) {
            rjU_2 rjU_22 = rjU_2Array[i];
            double d2 = rjC_22.id_break(rpB_2.X) * rjU_22.id_break + rjC_22.id_byte(rpB_2.X) * (id_throws[3] - rjU_22.id_break);
            double d3 = rjC_22.id_break(rpB_2.Y) * rjU_22.id_byte + rjC_22.id_byte(rpB_2.Y) * (id_throws[4] - rjU_22.id_byte);
            double d4 = rjC_22.id_break(rpB_2.Z) * rjU_22.id_protected + rjC_22.id_byte(rpB_2.Z) * (id_throws[5] - rjU_22.id_protected);
            optional = PJ.id_class(ps_1, rfH_22, new rjU_2(rfH_22.b_(), rfH_22.c_(), rfH_22.d_()).id_break(d2, d3, d4), d, bl, predicate);
            if (!optional.isPresent()) continue;
            return optional;
        }
        return Optional.empty();
    }

    private static void id_throws() {
        id_case = new byte[]{3, 2, 2, 2, 2, 6, 2, 3, 4, 5, 3, 4, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        PJ.id_case();
        PJ.id_protected();
        PJ.id_byte();
        PJ.id_break();
        PJ.id_throws();
        PJ.id_class();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[25];
        blArray[1] = true;
        blArray[5] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[19] = true;
        blArray[23] = true;
        blArray[24] = true;
        id_protected = blArray;
    }

    private static void id_protected() {
        double[] dArray = new double[85];
        dArray[0] = 57.29577951308232;
        dArray[1] = 57.29577951308232;
        dArray[2] = 360.0;
        dArray[3] = 1.0;
        dArray[4] = 1.0;
        dArray[5] = 1.0;
        dArray[7] = 0.5;
        dArray[8] = 0.5;
        dArray[9] = 0.5;
        dArray[10] = 57.29577951308232;
        dArray[11] = 90.0;
        dArray[12] = 57.29577951308232;
        dArray[13] = 180.0;
        dArray[14] = Math.PI;
        dArray[15] = 90.0;
        dArray[23] = -90.0;
        dArray[26] = 90.0;
        dArray[27] = 360.0;
        dArray[28] = 0.7;
        dArray[29] = 180.0;
        dArray[30] = Math.PI;
        dArray[31] = 0.7;
        dArray[32] = 180.0;
        dArray[33] = Math.PI;
        dArray[34] = 360.0;
        dArray[35] = 180.0;
        dArray[36] = 360.0;
        dArray[37] = -180.0;
        dArray[38] = 360.0;
        dArray[46] = -90.0;
        dArray[49] = 90.0;
        dArray[50] = 360.0;
        dArray[51] = 180.0;
        dArray[52] = 360.0;
        dArray[60] = -90.0;
        dArray[63] = 90.0;
        dArray[64] = 360.0;
        dArray[65] = 0.5;
        dArray[67] = 0.5;
        dArray[68] = 0.5;
        dArray[69] = 1.0;
        dArray[70] = 0.5;
        dArray[71] = 0.5;
        dArray[72] = 0.5;
        dArray[74] = 0.5;
        dArray[75] = 0.5;
        dArray[76] = 1.0;
        dArray[78] = 0.5;
        dArray[79] = 0.5;
        dArray[80] = 1.0;
        dArray[81] = 0.5;
        dArray[82] = 0.5;
        dArray[83] = Math.PI / 180;
        dArray[84] = 57.29577951308232;
        id_throws = dArray;
    }
}

