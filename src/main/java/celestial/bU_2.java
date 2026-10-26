/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.cb_3;
import celestial.eA_2;
import celestial.eY_2;
import celestial.rLD;
import celestial.rdn_3;
import celestial.rhz_3;
import celestial.rkW_2;
import celestial.rkx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bU_2 {
    private static float[] id_break;
    private static short[] id_byte;
    public Object[] id_class;
    private static double[] id_protected;
    private static byte[] id_throws;
    private static boolean[] id_case;
    private static int[] id_catch;

    private static void id_byte() {
        id_throws = new byte[]{-1, 9, 3};
    }

    public bU_2(cb_3 cb_32) {
        HashMap hashMap;
        this.id_case();
        this.id_class[bU_2.id_byte[0]] = hashMap = new HashMap();
        cb_3 cb_33 = cb_32;
        this.id_class[bU_2.id_byte[1]] = cb_33;
        if (((Boolean)C_class.id_instanceof().ry.id_class[id_byte[2]]).booleanValue()) {
            Function<xd_3, Double> function;
            double d = this.id_break();
            Function<Double, Double> function2 = d2 -> d * d2;
            this.id_class[bU_2.id_byte[3]] = function = function2.compose(this::id_break);
        } else {
            Function<xd_3, Double> function;
            this.id_class[bU_2.id_byte[4]] = function = this::id_break;
        }
    }

    static {
        bU_2.ntfClinit();
    }

    public double id_class(xc_3 xc_32) {
        return (Double)((Map)this.id_class[id_byte[5]]).computeIfAbsent(xc_32.id_break(), (Function)this.id_class[id_byte[6]]);
    }

    public static double id_class(rdn_3 rdn_32, xc_3 xc_32) {
        int n;
        float f;
        try {
            f = xc_32.id_private(null, null);
        }
        catch (NullPointerException nullPointerException) {
            return id_protected[2];
        }
        if (f < id_break[0]) {
            return id_protected[3];
        }
        float f2 = rdn_32.id_class(xc_32);
        if (f2 > id_break[1] && (n = eA_2.id_class(eY_2.id_this, rdn_32)) > 0 && !rdn_32.id_class()) {
            f2 += (float)(n * n + id_case[9]);
        }
        f2 /= f;
        if (!xc_32.id_new() || !rdn_32.id_class() && rdn_32.id_break(xc_32)) {
            return f2 / id_break[2];
        }
        return f2 / id_break[3];
    }

    public int id_class(xd_3 xd_32, boolean bl, boolean bl2) {
        if (!C_class.id_instanceof().id_protected() && bl2) {
            return ((rhz_3)((cb_3)this.id_class[bU_2.id_byte[7]]).id_implements[bU_2.id_byte[8]]).id_protected;
        }
        int n = id_case[3];
        double d = id_protected[0];
        int n2 = id_catch[0];
        boolean bl3 = id_case[4];
        xc_3 xc_32 = xd_32.id_continue();
        for (int i = id_case[5]; i < id_throws[1]; ++i) {
            int n3;
            rdn_3 rdn_32 = ((rhz_3)((cb_3)this.id_class[bU_2.id_byte[9]]).id_implements[id_byte[10]]).id_extends(i);
            if (!((Boolean)C_class.id_instanceof().rS.id_class[id_byte[11]]).booleanValue() && rdn_32.id_break() instanceof rkx_3 || ((Boolean)C_class.id_instanceof().Br.id_class[id_byte[12]]).booleanValue() && rdn_32.id_catch() + (Integer)C_class.id_instanceof().V.id_class[id_byte[13]] >= rdn_32.id_private() && rdn_32.id_private() > id_case[6]) continue;
            double d2 = bU_2.id_class(rdn_32, xc_32);
            boolean bl4 = this.id_class(rdn_32);
            if (d2 > d) {
                d = d2;
                n = i;
                n2 = this.id_break(rdn_32);
                bl3 = bl4;
                continue;
            }
            if (d2 != d || ((n3 = this.id_break(rdn_32)) >= n2 || !bl4 && bl3) && (!bl || bl3 || !bl4)) continue;
            d = d2;
            n = i;
            n2 = n3;
            bl3 = bl4;
        }
        return n;
    }

    public boolean id_class(rdn_3 rdn_32) {
        return eA_2.id_class(eY_2.id_else, rdn_32) > 0 ? id_case[0] : id_case[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5191CDB60D43B79AL;
    }

    private static void id_class() {
        short[] sArray = new short[22];
        sArray[1] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[8] = 1;
        sArray[9] = 2;
        sArray[10] = 1;
        sArray[14] = 2;
        sArray[15] = 1;
        sArray[18] = 2;
        sArray[19] = 2;
        sArray[20] = 2;
        sArray[21] = 2;
        id_byte = sArray;
    }

    public int id_class(xd_3 xd_32, boolean bl) {
        return this.id_class(xd_32, bl, id_case[2]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{0, 93, -125, 33, -4, -94, 49, -75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD6FA95D3;
    }

    private double id_class(xd_3 xd_32) {
        return ((List)C_class.id_instanceof().p.id_class[id_byte[16]]).contains(xd_32) ? (Double)C_class.id_instanceof().rG.id_class[id_byte[17]] : id_protected[1];
    }

    private int id_break(rdn_3 rdn_32) {
        if (rdn_32.id_break() instanceof rkW_2) {
            rkW_2 rkW_22 = (rkW_2)rdn_32.id_break();
            return rkW_22.id_private().id_protected();
        }
        return id_throws[0];
    }

    private double id_break(xd_3 xd_32) {
        rdn_3 rdn_32 = ((rhz_3)((cb_3)this.id_class[bU_2.id_byte[14]]).id_implements[id_byte[15]]).id_extends(this.id_class(xd_32, id_case[7], id_case[8]));
        return bU_2.id_class(rdn_32, xd_32.id_continue()) * this.id_class(xd_32);
    }

    private double id_break() {
        double d = id_protected[4];
        if (((cb_3)this.id_class[id_byte[18]]).id_break(rLD.id_byte)) {
            d *= id_protected[5] + (double)(((cb_3)this.id_class[id_byte[19]]).id_byte(rLD.id_byte).id_byte() + id_case[10]) * id_protected[6];
        }
        if (((cb_3)this.id_class[id_byte[20]]).id_break(rLD.id_protected)) {
            switch (((cb_3)this.id_class[id_byte[21]]).id_byte(rLD.id_protected).id_byte()) {
                case 0: {
                    d *= id_protected[7];
                    break;
                }
                case 1: {
                    d *= id_protected[8];
                    break;
                }
                case 2: {
                    d *= id_protected[9];
                    break;
                }
                default: {
                    d *= id_protected[10];
                }
            }
        }
        return d;
    }

    private static void id_throws() {
        id_catch = new int[]{Integer.MIN_VALUE};
    }

    private static /* synthetic */ void ntfClinit() {
        bU_2.id_private();
        bU_2.id_class();
        bU_2.id_catch();
        bU_2.id_protected();
        bU_2.id_byte();
        bU_2.id_throws();
    }

    private static void id_catch() {
        id_protected = new double[]{Double.NEGATIVE_INFINITY, 1.0, -1.0, -1.0, 1.0, 1.0, 0.2, 0.3, 0.09, 0.0027, 8.1E-4};
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_throws[2]];
        }
    }

    private static void id_protected() {
        float[] fArray = new float[4];
        fArray[1] = 1.0f;
        fArray[2] = 30.0f;
        fArray[3] = 100.0f;
        id_break = fArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[10] = true;
        id_case = blArray;
    }
}

