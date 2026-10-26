/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.C_int;
import celestial.PX;
import celestial.Pr_1;
import celestial.Ps_1;
import celestial.Qw_1;
import celestial.rD_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rK_2
implements C_int {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;
    private static double[] id_protected;
    private static float[] id_throws;
    private static short[] id_case;

    public abstract PX id_byte();

    public rK_2(rK_2 rK_22) {
        this.id_implements();
        Ps_1 ps_1 = (Ps_1)rK_22.id_class[id_case[2]];
        this.id_class[rK_2.id_case[3]] = ps_1;
        Pr_1 pr_1 = ((Pr_1)rK_22.id_class[id_case[4]]).id_class();
        this.id_class[rK_2.id_case[5]] = pr_1;
        Double d = (double)((Double)rK_22.id_class[id_case[6]]);
        this.id_class[rK_2.id_case[7]] = d;
        Double d2 = (double)((Double)rK_22.id_class[id_case[8]]);
        this.id_class[rK_2.id_case[9]] = d2;
    }

    public rK_2(Ps_1 ps_1) {
        this.id_implements();
        Ps_1 ps_12 = ps_1;
        this.id_class[rK_2.id_case[0]] = ps_12;
        Pr_1 pr_1 = new Pr_1();
        this.id_class[rK_2.id_case[1]] = pr_1;
    }

    static {
        rK_2.ntfClinit();
    }

    private float id_class(float f, float f2) {
        float f3 = f2 - f;
        double d = this.id_break(f3);
        return f + this.id_class(d);
    }

    @Override
    public void id_class(int n) {
        for (int i = id_break[0]; i < n; ++i) {
            this.id_break();
        }
    }

    @Override
    public C_int id_class() {
        return new rD_2(this, this);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2CE467FEA3967D60L;
    }

    private float id_class(float f) {
        if (f < id_throws[0]) {
            return f + id_throws[1];
        }
        if (f > id_throws[2]) {
            return f - id_throws[3];
        }
        return f;
    }

    @Override
    public PX id_class(PX pX) {
        PX pX2 = this.id_byte();
        float f = pX.id_throws();
        float f2 = pX.id_protected();
        if (f2 == pX2.id_protected()) {
            f2 = this.id_class(f2);
        }
        return new PX(this.id_class(pX2.id_throws(), f += (float)((Double)this.id_class[id_case[10]]).doubleValue()), this.id_class(pX2.id_protected(), f2 += (float)((Double)this.id_class[id_case[11]]).doubleValue())).id_class();
    }

    private float id_class(double d) {
        double d2 = ((Qw_1)((Ps_1)this.id_class[rK_2.id_case[17]]).id_throws().id_class[rK_2.id_case[18]]).id_class * id_protected[3] + id_protected[4];
        return (float)(d * d2 * d2 * d2 * id_protected[5]) * id_throws[4];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-38, -61, -55, 51, -14, -24, 102, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x30062603;
    }

    @Override
    public PX id_break(PX pX) {
        PX pX2 = this.id_class(pX);
        this.id_break();
        return pX2;
    }

    @Override
    public void id_break() {
        double d = (Double)C_class.id_instanceof().t.id_class[id_case[12]];
        Double d2 = (((Pr_1)this.id_class[id_case[13]]).id_byte() - id_protected[0]) * d;
        this.id_class[rK_2.id_case[14]] = d2;
        Double d3 = (((Pr_1)this.id_class[id_case[15]]).id_byte() - id_protected[1]) * d;
        this.id_class[rK_2.id_case[16]] = d3;
    }

    private double id_break(float f) {
        float f2 = this.id_class(id_protected[2]);
        return Math.round(f / f2);
    }

    private static void id_throws() {
        double[] dArray = new double[8];
        dArray[0] = 0.5;
        dArray[1] = 0.5;
        dArray[2] = 1.0;
        dArray[3] = 0.6f;
        dArray[4] = 0.2f;
        dArray[5] = 8.0;
        id_protected = dArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rK_2.id_catch();
        rK_2.id_case();
        rK_2.id_throws();
        rK_2.id_protected();
        rK_2.id_private();
    }

    private static void id_catch() {
        id_break = new boolean[1];
    }

    private static void id_case() {
        short[] sArray = new short[19];
        sArray[1] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 2;
        sArray[7] = 2;
        sArray[8] = 3;
        sArray[9] = 3;
        sArray[10] = 2;
        sArray[11] = 3;
        sArray[13] = 1;
        sArray[14] = 2;
        sArray[15] = 1;
        sArray[16] = 3;
        sArray[18] = 20;
        id_case = sArray;
    }

    private void id_implements() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rK_2.id_byte[1]] = id_protected[6];
            objectArray[rK_2.id_byte[2]] = id_protected[7];
        }
    }

    private static void id_protected() {
        id_throws = new float[]{-20.0f, 1.0f, 10.0f, 1.0f, 0.15f};
    }

    private static void id_private() {
        id_byte = new byte[]{4, 2, 3};
    }
}

