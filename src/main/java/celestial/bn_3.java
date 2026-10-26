/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ps_1;
import celestial.bA_2;
import celestial.bF_2;
import celestial.bL_2;
import celestial.bZ_2;
import celestial.bv_3;
import celestial.rU_2;
import celestial.rY_2;
import celestial.rfl_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bn_3
implements bZ_2 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static float[] id_protected;
    public static Object[] id_class;
    private static byte[] id_throws;

    private static void id_byte() {
        id_protected = new float[]{0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f, 0.5f};
    }

    static {
        bn_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{99, 48, 10, -16, -66, -99, 41, -55}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x276B4140;
    }

    private bF_2 id_class(int n, int n2, int n3, int n4, int n5) {
        int n6 = n2 - n + id_byte[18];
        bL_2[] bL_2Array = new bL_2[n6];
        for (int i = id_byte[19]; i < n6; ++i) {
            bL_2Array[i] = new bL_2(n + i, n3, n4);
        }
        rfl_3 rfl_32 = new rfl_3((float)n - id_protected[2] + id_protected[3], (float)n3 - id_protected[4] + id_protected[5], (float)n4 - id_protected[6] + id_protected[7], (float)n2 + id_protected[8] + id_protected[9], (float)n3 + id_protected[10] + id_protected[11], (float)n4 + id_protected[12] + id_protected[13]);
        return new bF_2(rfl_32, bL_2Array, n5);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE6B0B5775027445L;
    }

    @Override
    public bv_3[] id_class(Ps_1 ps_1, rY_2 rY_22) {
        byte by;
        int n;
        int n2;
        if (rY_22 == null) {
            return null;
        }
        rU_2 rU_22 = ps_1.id_volatile();
        rU_2 rU_23 = rY_22.id_class();
        rU_2 rU_24 = rY_22.id_protected();
        int n3 = (Integer)rU_23.id_break[id_break[0]];
        int n4 = (Integer)rU_23.id_break[id_break[1]];
        int n5 = (Integer)rU_23.id_break[id_break[2]];
        int n6 = (Integer)rU_24.id_break[id_break[3]];
        int n7 = (Integer)rU_24.id_break[id_break[4]];
        int n8 = n6 - n3 + id_byte[0];
        int n9 = n7 - n5 + id_byte[1];
        int n10 = (n8 + id_throws[0] - id_byte[2]) / id_throws[1];
        bv_3[] bv_3Array = new bv_3[n10];
        byte by2 = id_throws[2];
        int n11 = n9 >> id_byte[3];
        int n12 = n3 + by2;
        int n13 = n3 + (n10 - id_byte[4]) * id_throws[3] + by2;
        int n14 = n5 + n11;
        boolean bl = rU_22.id_protected(n13, n4, n14) < rU_22.id_protected(n12, n4, n14) ? id_byte[5] : id_byte[6];
        int n15 = (n9 + id_throws[4] - id_byte[7]) / id_throws[5];
        float f = id_protected[0];
        float f2 = id_protected[1];
        float f3 = (float)n4 - f + f2;
        float f4 = (float)n4 + f + f2;
        float f5 = (float)n5 - f + f2;
        float f6 = (float)n7 + f + f2;
        if (bl) {
            n2 = n10 - id_byte[8];
            n = id_throws[6];
            by = id_throws[7];
        } else {
            n2 = id_byte[9];
            n = n10;
            by = id_byte[10];
        }
        int n16 = n2;
        int n17 = id_byte[11];
        while (n16 != n) {
            int n18 = n3 + n16 * id_throws[8];
            int n19 = Math.min(n18 + id_throws[9] - id_byte[12], n6);
            int n20 = n19 - n18 + id_byte[13];
            int n21 = (n20 + id_throws[10] - id_byte[14]) / id_throws[11];
            float f7 = (float)n18 - f + f2;
            float f8 = (float)n19 + f + f2;
            bL_2[] bL_2Array = new bL_2[n21 * n15];
            int n22 = id_byte[15];
            int n23 = n5;
            for (int i = id_byte[16]; i < n15; ++i) {
                if (n23 <= n7) {
                    int n24 = n18;
                    for (int j = id_byte[17]; j < n21; ++j) {
                        if (n24 <= n19) {
                            bL_2Array[n22++] = new bL_2(n24, n4, n23);
                        }
                        n24 += 3;
                    }
                }
                n23 += 3;
            }
            if (n22 < bL_2Array.length) {
                bL_2Array = Arrays.copyOf(bL_2Array, n22);
            }
            rfl_3 rfl_32 = new rfl_3(f7, f3, f5, f8, f4, f6);
            bF_2 bF_22 = this.id_class(n18, n19, n4, n5, n17);
            bF_2 bF_23 = this.id_class(n18, n19, n4, n7, n17);
            bv_3Array[n16] = new bA_2(rfl_32, bL_2Array, n17, bF_22, bF_23);
            n16 += by;
            ++n17;
        }
        return bv_3Array;
    }

    private static void id_class() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 2;
        id_break = sArray;
    }

    private static void id_break() {
        id_throws = new byte[]{6, 6, 3, 6, 3, 3, -1, -1, 6, 6, 3, 3, 3, 6, 3, 2, 3};
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{6, 3, 3};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bn_3.id_protected();
        bn_3.id_class();
        bn_3.id_byte();
        bn_3.id_break();
        bn_3.id_throws();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[22];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[18] = true;
        blArray[21] = true;
        id_byte = blArray;
    }
}

