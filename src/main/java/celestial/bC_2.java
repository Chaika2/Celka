/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ps_1;
import celestial.bF_2;
import celestial.bL_2;
import celestial.bZ_2;
import celestial.bv_3;
import celestial.rU_2;
import celestial.rY_2;
import celestial.rfl_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bC_2
implements bZ_2 {
    private static boolean[] id_class;
    private static short[] id_break;
    private static double[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_byte = new double[]{0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5};
    }

    static {
        bC_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x20F9968D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9CDC735DF9073255L;
    }

    private static void id_class() {
        id_protected = new byte[]{2, 2};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-70, -62, 80, -102, -11, -68, -116, -32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public bv_3[] id_class(Ps_1 ps_1, rY_2 rY_22) {
        int n;
        if (rY_22 == null) {
            return null;
        }
        rU_2 rU_22 = ps_1.id_volatile();
        rU_2 rU_23 = rY_22.id_class();
        rU_2 rU_24 = rY_22.id_protected();
        int n2 = (Integer)rU_24.id_break[id_break[0]] - (Integer)rU_23.id_break[id_break[1]] + id_class[0];
        boolean bl = n2 >= (n = (Integer)rU_24.id_break[id_break[2]] - (Integer)rU_23.id_break[id_break[3]] + id_class[1]) ? id_class[2] : id_class[3];
        int n3 = bl ? n : n2;
        int n4 = bl ? n2 : n;
        int n5 = (Integer)rU_23.id_break[id_break[4]];
        int n6 = bl ? (Integer)rU_23.id_break[id_break[5]] + n2 / id_protected[0] : (Integer)rU_23.id_break[id_break[6]];
        int n7 = bl ? (Integer)rU_23.id_break[id_break[7]] : (Integer)rU_23.id_break[id_break[8]] + n / id_protected[1];
        int n8 = bl ? n6 : (Integer)rU_23.id_break[id_break[9]] + n2 - id_class[4];
        int n9 = bl ? (Integer)rU_23.id_break[id_break[10]] + n - id_class[5] : n7;
        double d = rU_22.id_protected(n6, n5, n7);
        double d2 = rU_22.id_protected(n8, n5, n9);
        boolean bl2 = d2 < d ? id_class[6] : id_class[7];
        bv_3[] bv_3Array = new bv_3[n3];
        bL_2[] bL_2Array = new bL_2[n4];
        for (int i = id_class[8]; i < n3; ++i) {
            int n10;
            int n11;
            int n12;
            int n13 = n12 = bl2 ? n3 - id_class[9] - i : i;
            if (bl) {
                n11 = (Integer)rU_23.id_break[id_break[11]] + n12;
                for (n10 = id_class[10]; n10 < n4; ++n10) {
                    bL_2Array[n10] = new bL_2((Integer)rU_23.id_break[id_break[12]] + n10, n5, n11);
                }
                bv_3Array[i] = new bF_2(new rfl_3(((Integer)rU_23.id_break[id_break[13]]).intValue(), n5, n11, ((Integer)rU_24.id_break[id_break[14]]).intValue(), n5, n11).id_class(id_byte[0]).id_protected(id_byte[1], id_byte[2], id_byte[3]), (bL_2[])bL_2Array.clone(), i);
                continue;
            }
            n11 = (Integer)rU_23.id_break[id_break[15]] + n12;
            for (n10 = id_class[11]; n10 < n4; ++n10) {
                bL_2Array[n10] = new bL_2(n11, n5, (Integer)rU_23.id_break[id_break[16]] + n10);
            }
            bv_3Array[i] = new bF_2(new rfl_3(n11, n5, ((Integer)rU_23.id_break[id_break[17]]).intValue(), n11, n5, ((Integer)rU_24.id_break[id_break[18]]).intValue()).id_class(id_byte[4]).id_protected(id_byte[5], id_byte[6], id_byte[7]), (bL_2[])bL_2Array.clone(), i);
        }
        return bv_3Array;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[12];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[9] = true;
        id_class = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bC_2.id_break();
        bC_2.id_protected();
        bC_2.id_byte();
        bC_2.id_class();
    }

    private static void id_protected() {
        short[] sArray = new short[19];
        sArray[2] = 2;
        sArray[3] = 2;
        sArray[4] = 1;
        sArray[7] = 2;
        sArray[8] = 2;
        sArray[10] = 2;
        sArray[11] = 2;
        sArray[16] = 2;
        sArray[17] = 2;
        sArray[18] = 2;
        id_break = sArray;
    }
}

