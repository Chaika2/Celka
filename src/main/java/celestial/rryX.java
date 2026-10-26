/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.Ax_1;
import celestial.PJ;
import celestial.Qw_1;
import celestial.Y;
import celestial.cb_3;
import celestial.event.EventTarget;
import celestial.gm_3;
import celestial.module.util.AntiAfk;
import celestial.q_1;
import celestial.rff_3;
import celestial.rjG_2;
import celestial.rmq_3;
import celestial.rpm_3;
import celestial.rrAO;
import celestial.rrTF;
import celestial.rrfQ_2;
import celestial.rrfZ_2;
import celestial.rrfj_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfw_3;
import celestial.ryZ_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryX
extends rrTF<AntiAfk> {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;
    private static float[] id_protected;
    private static double[] id_case;
    private static byte[] id_catch;

    private static void id_byte() {
        float[] fArray = new float[11];
        fArray[0] = Float.NaN;
        fArray[1] = 0.5f;
        fArray[2] = -0.5f;
        fArray[3] = 1.0f;
        fArray[4] = -0.3f;
        fArray[5] = 0.3f;
        fArray[6] = 0.2f;
        fArray[7] = 15000.0f;
        fArray[8] = 1000.0f;
        fArray[9] = 5000.0f;
        id_protected = fArray;
    }

    public rryX(AntiAfk antiAfk) {
        super(antiAfk);
        this.id_implements();
        rrfw_3 rrfw_32 = new rrfw_3();
        this.id_class[rryX.id_break[0]] = rrfw_32;
        Float f = Float.valueOf(id_protected[0]);
        this.id_class[rryX.id_break[1]] = f;
        Boolean bl = id_byte[0];
        this.id_class[rryX.id_break[2]] = bl;
    }

    static {
        rryX.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x98CCEE98D0DBF658L;
    }

    public float id_class() {
        float f;
        this.id_implements();
        while (Math.abs((f = id_protected[3] + rrfQ_2.id_byte(id_protected[4], id_protected[5])) - ((Float)this.id_class[id_break[44]]).floatValue()) < id_protected[6]) {
        }
        Float f2 = Float.valueOf(f);
        this.id_class[rryX.id_break[45]] = f2;
        return f;
    }

    @EventTarget
    public void id_class(rrAO rrAO2) {
        this.id_implements();
        rryX rryX2 = this;
        int n = (Integer)rryX2.id_class[id_break[37]] - id_byte[8];
        Integer n2 = n;
        rryX2.id_class[rryX.id_break[38]] = n2;
        if (n > 0) {
            rrAO2.id_break((Boolean)this.id_class[id_break[39]] != false ? id_protected[1] : id_protected[2]);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-28, -51, 56, 0, 96, -58, 28, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @EventTarget
    public void id_class(q_1 q_12) {
        this.id_implements();
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[3]])) {
            if ((rrfq_3)((Object)rrfp_3.id_class[id_break[4]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[5]]) && (rrfq_3)((Object)rrfp_3.id_class[id_break[6]]) != (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[7]]) || this.id_break()) {
                ((rrfw_3)this.id_class[id_break[8]]).id_class();
                Integer n = id_byte[1];
                this.id_class[rryX.id_break[9]] = n;
                Boolean bl = id_byte[2];
                this.id_class[rryX.id_break[10]] = bl;
                return;
            }
            if (rrfj_3.id_catch()) {
                ((rrfw_3)this.id_class[id_break[11]]).id_class();
                return;
            }
            if (rrfZ_2.id_byte()) {
                ((rrfw_3)this.id_class[id_break[12]]).id_class();
                Integer n = id_byte[3];
                this.id_class[rryX.id_break[13]] = n;
                Boolean bl = id_byte[4];
                this.id_class[rryX.id_break[14]] = bl;
                return;
            }
            if ((Double)this.id_class[id_break[15]] == id_case[0]) {
                Double d = this.id_private();
                this.id_class[rryX.id_break[16]] = d;
            }
            if (((rrfw_3)this.id_class[id_break[17]]).id_class((Double)this.id_class[id_break[18]])) {
                if ((rrfq_3)((Object)rrfp_3.id_class[id_break[19]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[20]])) {
                    Integer n = id_catch[0];
                    this.id_class[rryX.id_break[21]] = n;
                    Boolean bl = (Boolean)this.id_class[id_break[22]] == false ? id_byte[5] : id_byte[6];
                    this.id_class[rryX.id_break[23]] = bl;
                } else {
                    rff_3 rff_32;
                    ryZ_2 ryZ_22;
                    float f = this.id_class();
                    float f2 = ((Random)rrfQ_2.id_class[id_break[24]]).nextBoolean() ? f : -f;
                    cb_3 cb_32 = (cb_3)rryX.id_import.id_class[id_break[25]];
                    Float f3 = Float.valueOf(((Float)cb_32.id_throws[id_break[26]]).floatValue() + f2);
                    cb_32.id_throws[rryX.id_break[27]] = f3;
                    rjG_2 rjG_22 = PJ.id_class(((cb_3)rryX.id_import.id_class[id_break[28]]).z(), (double)((Ax_1)rryX.id_import.id_class[id_break[29]]).id_byte(), id_byte[7]);
                    if (rjG_22 instanceof rff_3 && (ryZ_22 = ((Ax_1)rryX.id_import.id_class[id_break[30]]).id_break((cb_3)rryX.id_import.id_class[id_break[31]], (gm_3)rryX.id_import.id_class[id_break[32]], rpm_3.OFF_HAND, rff_32 = (rff_3)rjG_22)) == ryZ_2.SUCCESS) {
                        ((Aq_1)((cb_3)rryX.id_import.id_class[rryX.id_break[33]]).id_break[id_break[34]]).id_class(new rmq_3(rpm_3.OFF_HAND));
                    }
                }
                Double d = this.id_private();
                this.id_class[rryX.id_break[35]] = d;
                ((rrfw_3)this.id_class[id_break[36]]).id_class();
            }
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7B91C7B2;
    }

    private boolean id_break() {
        return ((Qw_1)rryX.id_import.id_class[rryX.id_break[46]]).h.id_protected() || ((Qw_1)rryX.id_import.id_class[rryX.id_break[47]]).J.id_protected() || ((Qw_1)rryX.id_import.id_class[rryX.id_break[48]]).X.id_protected() || ((Qw_1)rryX.id_import.id_class[rryX.id_break[49]]).x.id_protected() ? id_byte[11] : id_byte[12];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[16];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[13] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryX.id_throws();
        rryX.id_finally();
        rryX.id_byte();
        rryX.id_protected();
        rryX.id_case();
    }

    private static void id_finally() {
        short[] sArray = new short[50];
        sArray[1] = 2;
        sArray[2] = 4;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 1;
        sArray[7] = 4;
        sArray[9] = 3;
        sArray[10] = 4;
        sArray[13] = 3;
        sArray[14] = 4;
        sArray[15] = 1;
        sArray[16] = 1;
        sArray[18] = 1;
        sArray[19] = 1;
        sArray[20] = 4;
        sArray[21] = 3;
        sArray[22] = 4;
        sArray[23] = 4;
        sArray[25] = 57;
        sArray[26] = 15;
        sArray[27] = 15;
        sArray[28] = 57;
        sArray[29] = 55;
        sArray[30] = 55;
        sArray[31] = 57;
        sArray[32] = 56;
        sArray[33] = 57;
        sArray[35] = 1;
        sArray[37] = 3;
        sArray[38] = 3;
        sArray[39] = 4;
        sArray[41] = 1;
        sArray[42] = 3;
        sArray[43] = 4;
        sArray[44] = 2;
        sArray[45] = 2;
        sArray[46] = 20;
        sArray[47] = 20;
        sArray[48] = 20;
        sArray[49] = 20;
        id_break = sArray;
    }

    private static void id_case() {
        id_catch = new byte[]{30, 5, 2, 3, 4};
    }

    private void id_implements() {
        if (this.id_class == null) {
            this.id_class = new Object[5];
            this.id_class[1] = 0.0;
            this.id_class[2] = Float.valueOf(0.0f);
            this.id_class[3] = 0;
            this.id_class[4] = false;
        }
    }

    private static void id_protected() {
        id_case = new double[3];
    }

    private float id_private() {
        return id_protected[7] + rrfQ_2.id_byte(id_protected[8], id_protected[9]);
    }

    @Override
    public boolean aI_() {
        this.id_implements();
        ((rrfw_3)this.id_class[id_break[40]]).id_class();
        Double d = id_case[1];
        this.id_class[rryX.id_break[41]] = d;
        Integer n = id_byte[9];
        this.id_class[rryX.id_break[42]] = n;
        Boolean bl = id_byte[10];
        this.id_class[rryX.id_break[43]] = bl;
        return super.aI_();
    }
}

