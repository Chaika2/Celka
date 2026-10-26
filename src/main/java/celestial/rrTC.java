/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_int;
import celestial.PX;
import celestial.Pr_1;
import celestial.Qw_1;
import celestial.cb_3;
import celestial.rfU_2;
import celestial.rrTf_1;
import celestial.rrTl_1;
import celestial.rrnF_2;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class rrTC
implements C_int,
MinecraftAccessor {
    private static boolean[] id_byte;
    public static Object[] id_class;
    private static short[] id_protected;
    public Object[] id_break;
    private static byte[] id_throws;
    private static double[] id_case;
    private static float[] id_catch;

    public double id_byte() {
        return ((Qw_1)rrTC.id_import.id_class[rrTC.id_protected[15]]).id_class;
    }

    public rrTC(rrnF_2 rrnF_22) {
        this.id_implements();
        Pr_1 pr_1 = new Pr_1();
        this.id_break[rrTC.id_protected[0]] = pr_1;
        rrnF_2 rrnF_23 = rrnF_22;
        this.id_break[rrTC.id_protected[1]] = rrnF_23;
    }

    public rrTC(rrTC rrTC2) {
        this.id_implements();
        Pr_1 pr_1 = ((Pr_1)rrTC2.id_break[id_protected[2]]).id_class();
        this.id_break[rrTC.id_protected[3]] = pr_1;
        rrnF_2 rrnF_22 = (rrnF_2)rrTC2.id_break[id_protected[4]];
        this.id_break[rrTC.id_protected[5]] = rrnF_22;
    }

    static {
        rrTC.ntfClinit();
    }

    private float id_class(float f, float f2) {
        float f3 = f2 - f;
        double d = this.id_class(f3);
        return f + this.id_class(d);
    }

    @Override
    public void id_class(int n) {
        for (int i = id_byte[0]; i < n; ++i) {
            this.id_break();
        }
    }

    private float id_class(double d) {
        double d2 = this.id_byte() * id_case[1] + id_case[2];
        return (float)(d * d2 * d2 * d2 * id_case[3]) * id_catch[2];
    }

    @Override
    public C_int id_class() {
        return new rrTl_1(this, this);
    }

    @Override
    public PX id_class(PX pX) {
        rrTf_1 rrTf_12 = ((rrnF_2)this.id_break[id_protected[6]]).aL_();
        PX pX2 = this.id_throws();
        float f = pX2.id_throws();
        float f2 = pX2.id_protected();
        float f3 = pX.id_throws();
        float f4 = pX.id_protected();
        float f5 = ((rrnF_2)this.id_break[id_protected[7]]).id_break();
        float f6 = ((rrnF_2)this.id_break[id_protected[8]]).id_private();
        if (f5 != id_catch[0]) {
            f3 = ((rrnF_2)this.id_break[id_protected[9]]).aA_().process(f, f3, f5);
        }
        if (f6 != id_catch[1]) {
            f4 = ((rrnF_2)this.id_break[id_protected[10]]).aE_().process(f2, f4, f6);
        }
        if (rrTf_12 != null) {
            PX pX3 = rrTf_12.processRandom(pX2, new PX(f3, f4));
            f3 = pX3.id_throws();
            f4 = pX3.id_protected();
        }
        f3 = ((Float)((cb_3)rrTC.id_import.id_class[rrTC.id_protected[11]]).id_throws[id_protected[12]]).floatValue() + rfU_2.id_catch(f3 - ((Float)((cb_3)rrTC.id_import.id_class[rrTC.id_protected[13]]).id_throws[id_protected[14]]).floatValue());
        float f7 = this.id_class(f, f + rfU_2.id_catch(f3 - f));
        float f8 = this.id_class(f2, f4);
        return new PX(f7, f8).id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE5000240B5A3C675L;
    }

    private double id_class(float f) {
        float f2 = this.id_class(id_case[0]);
        return Math.round(f / f2);
    }

    @Override
    public void id_break() {
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x414A5085;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-42, 94, 41, 9, -50, 23, -113, -90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public PX id_break(PX pX) {
        PX pX2 = this.id_class(pX);
        this.id_break();
        return pX2;
    }

    public abstract PX id_throws();

    private static /* synthetic */ void ntfClinit() {
        rrTC.id_private();
        rrTC.id_catch();
        rrTC.id_native();
        rrTC.id_extends();
        rrTC.id_case();
        rrTC.id_finally();
    }

    private static void id_finally() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f)};
        id_class = objectArray;
    }

    private static void id_catch() {
        short[] sArray = new short[17];
        sArray[0] = 1;
        sArray[2] = 1;
        sArray[3] = 1;
        sArray[11] = 57;
        sArray[12] = 15;
        sArray[13] = 57;
        sArray[14] = 15;
        sArray[15] = 20;
        sArray[16] = 1;
        id_protected = sArray;
    }

    private static void id_extends() {
        id_case = new double[]{1.0, 0.6f, 0.2f, 8.0};
    }

    private static void id_case() {
        id_throws = new byte[]{2};
    }

    private void id_implements() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
        }
    }

    public Pr_1 id_protected() {
        return (Pr_1)this.id_break[id_protected[16]];
    }

    private static void id_private() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static void id_native() {
        id_catch = new float[]{-1.0f, -1.0f, 0.15f, -1.0f};
    }
}

