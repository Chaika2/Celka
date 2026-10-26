/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cb_3;
import celestial.module.movement.Strafe;
import celestial.rYB;
import celestial.rfw_3;
import celestial.rhd_3;
import celestial.rqr_3;
import celestial.rrAo_1;
import celestial.rrLW;
import celestial.rrLz_1;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlX_2
implements MinecraftAccessor {
    private static double[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    private static short[] id_throws;
    public Object[] id_class;
    private static float[] id_case;

    public double id_byte() {
        return (Double)this.id_class[id_throws[37]];
    }

    public rrlX_2(Strafe strafe) {
        this.id_finally();
        Strafe strafe2 = strafe;
        this.id_class[rrlX_2.id_throws[0]] = strafe2;
    }

    static {
        rrlX_2.ntfClinit();
    }

    public void id_class(int n) {
        Integer n2 = n;
        this.id_class[rrlX_2.id_throws[43]] = n2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x693951406657F28CL;
    }

    public float id_class(rrLz_1 rrLz_12) {
        float f;
        boolean bl = ((cb_3)rrlX_2.id_import.id_class[id_throws[7]]).BL();
        boolean bl2 = rrLz_12.id_throws();
        boolean bl3 = rrLz_12.id_catch().id_byte > id_break[0] ? id_byte[3] : id_byte[4];
        float f2 = this.id_class((cb_3)rrlX_2.id_import.id_class[id_throws[8]]);
        float f3 = this.id_class((cb_3)rrlX_2.id_import.id_class[id_throws[9]], rrLz_12);
        float f4 = id_case[0];
        if (bl) {
            f4 = f3;
        }
        float f5 = id_case[1] / (f4 * f4 * f4);
        if (bl) {
            f = f2 * f5;
            if (bl3) {
                f += id_case[2];
            }
        } else {
            f = rrLz_12.id_throws() ? id_case[3] : id_case[4];
        }
        boolean bl4 = id_byte[5];
        float f6 = (float)((Double)this.id_class[id_throws[10]] + (double)f);
        if (((cb_3)rrlX_2.id_import.id_class[id_throws[11]]).id_return() && !bl3) {
            double d = (double)f * id_break[1] + id_break[2];
            double d2 = rrLz_12.id_catch().id_byte;
            if (d2 != id_break[3] && Math.abs(d2) < id_break[4]) {
                d += id_break[5];
            }
            if ((double)f6 > Math.max(id_break[6], d)) {
                bl4 = id_byte[6];
                rrlX_2 rrlX_22 = this;
                Integer n = (Integer)rrlX_22.id_class[id_throws[12]] + id_byte[7];
                rrlX_22.id_class[rrlX_2.id_throws[13]] = n;
            } else {
                Integer n = Math.max((Integer)this.id_class[id_throws[14]] - id_byte[8], id_byte[9]);
                this.id_class[rrlX_2.id_throws[15]] = n;
            }
        } else {
            Integer n = id_byte[10];
            this.id_class[rrlX_2.id_throws[16]] = n;
        }
        if (((cb_3)rrlX_2.id_import.id_class[id_throws[17]]).id_return() && !((rqr_3)((cb_3)rrlX_2.id_import.id_class[rrlX_2.id_throws[18]]).id_break[rrlX_2.id_throws[19]]).id_private && bl) {
            float f7 = (id_case[5] - ((cb_3)rrlX_2.id_import.id_class[id_throws[20]]).sB()) * id_case[6];
            f7 += id_case[7];
            if (((Float)((cb_3)rrlX_2.id_import.id_class[rrlX_2.id_throws[21]]).id_private[id_throws[22]]).floatValue() != id_case[8] || ((rqr_3)((cb_3)rrlX_2.id_import.id_class[rrlX_2.id_throws[23]]).id_break[rrlX_2.id_throws[24]]).id_throws) {
                f7 *= id_case[9];
            }
            f6 *= f7;
        }
        if ((Integer)this.id_class[id_throws[25]] > id_protected[0]) {
            f6 -= id_case[10];
        } else if (!((Boolean)((cb_3)rrlX_2.id_import.id_class[rrlX_2.id_throws[26]]).id_throws[id_throws[27]]).booleanValue()) {
            rrlX_2 rrlX_23 = this;
            int n = (Integer)rrlX_23.id_class[id_throws[28]];
            Integer n2 = n + id_byte[11];
            rrlX_23.id_class[rrlX_2.id_throws[29]] = n2;
            f6 = Math.max(bl4 ? id_case[11] : id_case[12], f6) - (n % id_protected[1] == 0 ? id_case[13] : id_case[14]);
        }
        Double d = f4;
        this.id_class[rrlX_2.id_throws[30]] = d;
        if (!bl2 && !bl) {
            Boolean bl5 = id_byte[12];
            this.id_class[rrlX_2.id_throws[31]] = bl5;
            ((Strafe)this.id_class[id_throws[32]]).id_case((Boolean)((cb_3)rrlX_2.id_import.id_class[rrlX_2.id_throws[33]]).id_break[id_throws[34]] == false ? id_byte[13] : id_byte[14]);
        }
        if (bl2 && bl) {
            ((Strafe)this.id_class[id_throws[35]]).id_case(id_byte[15]);
        }
        return f6;
    }

    public void id_class(double d) {
        Double d2 = d;
        this.id_class[rrlX_2.id_throws[39]] = d2;
    }

    public void id_class(rrAo_1 rrAo_12) {
        if (((Boolean)this.id_class[id_throws[3]]).booleanValue()) {
            rrAo_12.id_protected((Boolean)((cb_3)rrlX_2.id_import.id_class[rrlX_2.id_throws[4]]).id_break[id_throws[5]] == false ? id_byte[0] : id_byte[1]);
            Boolean bl = id_byte[2];
            this.id_class[rrlX_2.id_throws[6]] = bl;
        }
    }

    public void id_class(rrLW rrLW2) {
        Double d = rrLW2.id_class() * (Double)this.id_class[id_throws[1]];
        this.id_class[rrlX_2.id_throws[2]] = d;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-2, -119, -25, 54, 99, -64, -28, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(boolean bl) {
        Boolean bl2 = bl;
        this.id_class[rrlX_2.id_throws[42]] = bl2;
    }

    private float id_class(rhd_3 rhd_32) {
        boolean bl = rhd_32.PF();
        rhd_32.c_(id_byte[16]);
        float f = rhd_32.sB() * id_case[15];
        rhd_32.c_(bl);
        return f;
    }

    public int id_class() {
        return (Integer)this.id_class[id_throws[44]];
    }

    private float id_class(rhd_3 rhd_32, rrLz_1 rrLz_12) {
        rfw_3 rfw_32 = new rfw_3(rrLz_12.id_break().id_break, rrLz_12.id_implements().id_break - id_break[7], rrLz_12.id_break().id_byte);
        return ((rYB)rhd_32.id_throws[id_throws[36]]).id_byte(rfw_32).id_break().id_final() * id_case[16];
    }

    public void id_break(double d) {
        Double d2 = d;
        this.id_class[rrlX_2.id_throws[40]] = d2;
    }

    public boolean id_break() {
        return (Boolean)this.id_class[id_throws[41]];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAE40B64;
    }

    private static void id_throws() {
        double[] dArray = new double[10];
        dArray[1] = 0.5;
        dArray[2] = 0.005f;
        dArray[4] = 0.08;
        dArray[5] = 0.055;
        dArray[6] = 0.043;
        dArray[7] = 1.0;
        id_break = dArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlX_2.id_private();
        rrlX_2.id_implements();
        rrlX_2.id_throws();
        rrlX_2.id_case();
        rrlX_2.id_catch();
    }

    private void id_finally() {
        if (this.id_class == null) {
            this.id_class = new Object[6];
            this.id_class[1] = 0.0;
            this.id_class[2] = 0.0;
            this.id_class[3] = false;
            this.id_class[4] = 0;
            this.id_class[5] = 0;
        }
    }

    private static void id_catch() {
        id_protected = new byte[]{3, 2, 6, 2, 3, 4, 5};
    }

    private static void id_case() {
        float[] fArray = new float[17];
        fArray[0] = 0.91f;
        fArray[1] = 0.16277136f;
        fArray[2] = 0.2f;
        fArray[3] = 0.0269f;
        fArray[4] = 0.0255f;
        fArray[5] = 1.0f;
        fArray[6] = 0.9f;
        fArray[7] = 0.02f;
        fArray[9] = 0.9f;
        fArray[10] = 0.019f;
        fArray[12] = 0.05f;
        fArray[13] = 0.001f;
        fArray[14] = 0.002f;
        fArray[15] = 1.3f;
        fArray[16] = 0.91f;
        id_case = fArray;
    }

    private static void id_implements() {
        short[] sArray = new short[45];
        sArray[1] = 2;
        sArray[2] = 1;
        sArray[3] = 3;
        sArray[4] = 57;
        sArray[5] = 13;
        sArray[6] = 3;
        sArray[7] = 57;
        sArray[8] = 57;
        sArray[9] = 57;
        sArray[10] = 1;
        sArray[11] = 57;
        sArray[12] = 5;
        sArray[13] = 5;
        sArray[14] = 5;
        sArray[15] = 5;
        sArray[16] = 5;
        sArray[17] = 57;
        sArray[18] = 57;
        sArray[19] = 17;
        sArray[20] = 57;
        sArray[21] = 57;
        sArray[22] = 42;
        sArray[23] = 57;
        sArray[24] = 17;
        sArray[25] = 5;
        sArray[26] = 57;
        sArray[27] = 23;
        sArray[28] = 4;
        sArray[29] = 4;
        sArray[30] = 2;
        sArray[31] = 3;
        sArray[33] = 57;
        sArray[34] = 13;
        sArray[36] = 7;
        sArray[37] = 1;
        sArray[38] = 2;
        sArray[39] = 1;
        sArray[40] = 2;
        sArray[41] = 3;
        sArray[42] = 3;
        sArray[43] = 4;
        sArray[44] = 5;
        id_throws = sArray;
    }

    public double id_protected() {
        return (Double)this.id_class[id_throws[38]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[21];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[17] = true;
        id_byte = blArray;
    }
}

