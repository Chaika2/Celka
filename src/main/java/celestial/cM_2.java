/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package celestial;

import celestial.QY;
import celestial.cG_2;
import celestial.cb_3;
import celestial.cq_3;
import celestial.gm_3;
import celestial.iB_2;
import celestial.rfU_2;
import celestial.rgP_2;
import celestial.rjU_2;
import celestial.rrQX;
import celestial.rrnk_3;
import celestial.rye_3;
import com.mojang.authlib.GameProfile;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class cM_2
extends cG_2 {
    private static boolean[] id_finally;
    public Object[] id_break;
    private static byte[] id_extends;
    private static float[] id_native;
    private static short[] id_volatile;
    private static double[] id_final;

    private static void id_boolean() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[10] = true;
        id_finally = blArray;
    }

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{53, 118, 119, -94, 48, -85, 15, -14}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rjU_2 id_long() {
        this.r();
        if (this.Pm() || this.id_for()) {
            return this.Ps();
        }
        rjU_2 rjU_22 = ((cb_3)QY.id_instanceof().id_class[id_volatile[62]]).Ps();
        rjU_2 rjU_23 = new rjU_2((Double)this.id_break[id_volatile[63]], (Double)this.id_break[id_volatile[64]], (Double)this.id_break[id_volatile[65]]);
        rjU_2 rjU_24 = new rjU_2((Double)this.id_break[id_volatile[66]], (Double)this.id_break[id_volatile[67]], (Double)this.id_break[id_volatile[68]]);
        return rjU_22.id_case(rjU_23) > rjU_22.id_case(rjU_24) ? rjU_24 : rjU_23;
    }

    private static void id_float() {
        short[] sArray = new short[72];
        sArray[0] = 37;
        sArray[1] = 38;
        sArray[2] = 3;
        sArray[3] = 6;
        sArray[4] = 4;
        sArray[5] = 7;
        sArray[6] = 5;
        sArray[7] = 8;
        sArray[8] = 3;
        sArray[9] = 4;
        sArray[10] = 5;
        sArray[11] = 24;
        sArray[13] = 24;
        sArray[14] = 24;
        sArray[15] = 45;
        sArray[16] = 46;
        sArray[17] = 45;
        sArray[18] = 47;
        sArray[19] = 45;
        sArray[20] = 48;
        sArray[21] = 45;
        sArray[22] = 15;
        sArray[23] = 49;
        sArray[24] = 15;
        sArray[25] = 45;
        sArray[26] = 15;
        sArray[27] = 16;
        sArray[28] = 50;
        sArray[29] = 16;
        sArray[30] = 45;
        sArray[31] = 16;
        sArray[32] = 45;
        sArray[33] = 45;
        sArray[34] = 15;
        sArray[35] = 16;
        sArray[36] = 52;
        sArray[37] = 25;
        sArray[38] = 51;
        sArray[39] = 25;
        sArray[40] = 52;
        sArray[41] = 25;
        sArray[42] = 52;
        sArray[43] = 52;
        sArray[44] = 8;
        sArray[45] = 7;
        sArray[46] = 20;
        sArray[47] = 8;
        sArray[48] = 8;
        sArray[49] = 8;
        sArray[50] = 9;
        sArray[51] = 10;
        sArray[52] = 11;
        sArray[53] = 19;
        sArray[55] = 1;
        sArray[56] = 2;
        sArray[57] = 1;
        sArray[59] = 1;
        sArray[60] = 2;
        sArray[61] = 1;
        sArray[62] = 57;
        sArray[63] = 6;
        sArray[64] = 7;
        sArray[65] = 8;
        sArray[66] = 3;
        sArray[67] = 4;
        sArray[68] = 5;
        sArray[69] = 3;
        sArray[70] = 4;
        sArray[71] = 5;
        id_volatile = sArray;
    }

    private static void id_double() {
        float[] fArray = new float[6];
        fArray[0] = 1.0f;
        fArray[1] = -1.0f;
        fArray[2] = -1.0f;
        fArray[3] = 0.1f;
        fArray[5] = 0.4f;
        id_native = fArray;
    }

    public cM_2(gm_3 gm_32, GameProfile gameProfile) {
        super(gm_32, gameProfile);
        this.r();
        Float f = Float.valueOf(id_native[0]);
        this.id_throws[cM_2.id_volatile[0]] = f;
        Boolean bl = id_finally[0];
        this.id_throws[cM_2.id_volatile[1]] = bl;
    }

    static {
        cM_2.ntfClinit();
    }

    @Override
    public void id_this() {
        super.id_this();
        this.id_class((iB_2)this, id_finally[4]);
        Float f = Float.valueOf(id_native[1]);
        this.id_implements[cM_2.id_volatile[11]] = f;
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_volatile[12]]).id_finally().id_class(rrnk_3.id_class(this));
    }

    @Override
    public boolean id_class(double d) {
        double d2 = this.rN().id_class() * id_final[0];
        if (Double.isNaN(d2)) {
            d2 = id_final[1];
        }
        return d < (d2 = d2 * id_final[2] * cM_2.Br()) * d2 ? id_finally[1] : id_finally[2];
    }

    @Override
    public void id_class(double d, double d2, double d3, float f, float f2, int n, boolean bl) {
        this.r();
        Double d4 = (double)((Double)this.id_break[id_volatile[2]]);
        this.id_break[cM_2.id_volatile[3]] = d4;
        Double d5 = (double)((Double)this.id_break[id_volatile[4]]);
        this.id_break[cM_2.id_volatile[5]] = d5;
        Double d6 = (double)((Double)this.id_break[id_volatile[6]]);
        this.id_break[cM_2.id_volatile[7]] = d6;
        Double d7 = d;
        this.id_break[cM_2.id_volatile[8]] = d7;
        Double d8 = d2;
        this.id_break[cM_2.id_volatile[9]] = d8;
        Double d9 = d3;
        this.id_break[cM_2.id_volatile[10]] = d9;
        super.id_class(d, d2, d3, f, f2, n, bl);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE0EDC5E7;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB518385F2A8F97D1L;
    }

    @Override
    public void id_class(rgP_2 rgP_22, UUID uUID) {
        QY qY = QY.id_instanceof();
        if (!qY.id_class(uUID)) {
            ((cq_3)qY.id_class[id_volatile[53]]).id_throws().id_class(rgP_22);
        }
    }

    @Override
    public void id_default() {
        this.r();
        if ((Integer)this.id_private[id_volatile[15]] > 0) {
            double d = this.rx() + ((Double)this.id_private[id_volatile[16]] - this.rx()) / (double)((Integer)this.id_private[id_volatile[17]]).intValue();
            double d2 = this.re() + ((Double)this.id_private[id_volatile[18]] - this.re()) / (double)((Integer)this.id_private[id_volatile[19]]).intValue();
            double d3 = this.BO() + ((Double)this.id_private[id_volatile[20]] - this.BO()) / (double)((Integer)this.id_private[id_volatile[21]]).intValue();
            Float f = Float.valueOf((float)((double)((Float)this.id_throws[id_volatile[22]]).floatValue() + rfU_2.id_case((Double)this.id_private[id_volatile[23]] - (double)((Float)this.id_throws[id_volatile[24]]).floatValue()) / (double)((Integer)this.id_private[id_volatile[25]]).intValue()));
            this.id_throws[cM_2.id_volatile[26]] = f;
            Float f2 = Float.valueOf((float)((double)((Float)this.id_throws[id_volatile[27]]).floatValue() + ((Double)this.id_private[id_volatile[28]] - (double)((Float)this.id_throws[id_volatile[29]]).floatValue()) / (double)((Integer)this.id_private[id_volatile[30]]).intValue()));
            this.id_throws[cM_2.id_volatile[31]] = f2;
            cM_2 cM_22 = this;
            Integer n = (Integer)cM_22.id_private[id_volatile[32]] - id_finally[5];
            cM_22.id_private[cM_2.id_volatile[33]] = n;
            this.id_new(d, d2, d3);
            this.id_case(((Float)this.id_throws[id_volatile[34]]).floatValue(), ((Float)this.id_throws[id_volatile[35]]).floatValue());
        }
        if ((Integer)this.id_private[id_volatile[36]] > 0) {
            Float f = Float.valueOf((float)((double)((Float)this.id_private[id_volatile[37]]).floatValue() + rfU_2.id_case((Double)this.id_private[id_volatile[38]] - (double)((Float)this.id_private[id_volatile[39]]).floatValue()) / (double)((Integer)this.id_private[id_volatile[40]]).intValue()));
            this.id_private[cM_2.id_volatile[41]] = f;
            cM_2 cM_23 = this;
            Integer n = (Integer)cM_23.id_private[id_volatile[42]] - id_finally[6];
            cM_23.id_private[cM_2.id_volatile[43]] = n;
        }
        Float f = Float.valueOf(((Float)this.id_implements[id_volatile[44]]).floatValue());
        this.id_implements[cM_2.id_volatile[45]] = f;
        this.Sg();
        float f3 = (Boolean)this.id_throws[id_volatile[46]] != false && !this.Sl() ? Math.min(id_native[3], rfU_2.id_class(cM_2.id_case(this.rv()))) : id_native[4];
        cM_2 cM_24 = this;
        Float f4 = Float.valueOf(((Float)cM_24.id_implements[id_volatile[47]]).floatValue() + (f3 - ((Float)this.id_implements[id_volatile[48]]).floatValue()) * id_native[5]);
        cM_24.id_implements[cM_2.id_volatile[49]] = f4;
        this.SS();
        rjU_2 rjU_22 = this.id_long();
        Double d = rjU_22.id_break;
        this.id_break[cM_2.id_volatile[50]] = d;
        Double d4 = rjU_22.id_byte;
        this.id_break[cM_2.id_volatile[51]] = d4;
        Double d5 = rjU_22.id_protected;
        this.id_break[cM_2.id_volatile[52]] = d5;
    }

    private static void id_short() {
        double[] dArray = new double[20];
        dArray[0] = 10.0;
        dArray[1] = 1.0;
        dArray[2] = 64.0;
        dArray[3] = -999.0;
        dArray[4] = -999.0;
        id_final = dArray;
    }

    private void r() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_extends[0]];
            objectArray[cM_2.id_finally[9]] = id_final[8];
            objectArray[cM_2.id_finally[10]] = id_final[9];
            objectArray[cM_2.id_extends[1]] = id_final[10];
            objectArray[cM_2.id_extends[2]] = id_final[11];
            objectArray[cM_2.id_extends[3]] = id_final[12];
            objectArray[cM_2.id_extends[4]] = id_final[13];
            objectArray[cM_2.id_extends[5]] = id_final[14];
            objectArray[cM_2.id_extends[6]] = id_final[15];
            objectArray[cM_2.id_extends[7]] = id_final[16];
            objectArray[cM_2.id_extends[8]] = id_final[17];
            objectArray[cM_2.id_extends[9]] = id_final[18];
            objectArray[cM_2.id_extends[10]] = id_final[19];
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        return id_finally[3];
    }

    private static /* synthetic */ void ntfClinit() {
        cM_2.id_boolean();
        cM_2.id_double();
        cM_2.id_float();
        cM_2.id_short();
        cM_2.id_static();
    }

    public void id_else() {
        this.r();
        if (this.Pm() || this.id_for()) {
            return;
        }
        Double d = this.rx();
        this.id_break[cM_2.id_volatile[54]] = d;
        Double d2 = this.re();
        this.id_break[cM_2.id_volatile[55]] = d2;
        Double d3 = this.BO();
        this.id_break[cM_2.id_volatile[56]] = d3;
        rjU_2 rjU_22 = this.id_long();
        this.id_new(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    private boolean id_for() {
        this.r();
        return (Double)this.id_break[id_volatile[69]] == id_final[5] && (Double)this.id_break[id_volatile[70]] == id_final[6] && (Double)this.id_break[id_volatile[71]] == id_final[7] ? id_finally[7] : id_finally[8];
    }

    private static void id_static() {
        id_extends = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public void id_public() {
        this.r();
        if ((Double)this.id_break[id_volatile[57]] != id_final[3] && !this.id_for()) {
            this.id_new((Double)this.id_break[id_volatile[58]], (Double)this.id_break[id_volatile[59]], (Double)this.id_break[id_volatile[60]]);
            Double d = id_final[4];
            this.id_break[cM_2.id_volatile[61]] = d;
        }
    }

    @Override
    public float u_() {
        if (((Float)this.id_implements[id_volatile[13]]).floatValue() == id_native[2]) {
            return super.u_();
        }
        return ((Float)this.id_implements[id_volatile[14]]).floatValue();
    }

    @Override
    public void t_() {
    }
}

