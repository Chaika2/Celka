/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdy_3;
import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcA_2;
import celestial.rrcL_2;
import celestial.rrcT_2;
import celestial.rrcn_3;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcF_2
implements rrcT_2<Boolean> {
    public static Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static int[] id_protected;
    private static short[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[54];
        blArray[2] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[15] = true;
        blArray[17] = true;
        blArray[19] = true;
        blArray[21] = true;
        blArray[23] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[41] = true;
        blArray[43] = true;
        blArray[45] = true;
        blArray[47] = true;
        blArray[49] = true;
        blArray[51] = true;
        blArray[53] = true;
        id_byte = blArray;
    }

    static {
        rrcF_2.ntfClinit();
    }

    @Override
    public rrfI_2<Boolean> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcL_2(this, rrNw_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFDA4EADB89044AC5L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-15, 34, -28, 123, 114, 41, -107, 28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = new Object[25];
        rrcn_3[] rrcn_3Array = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000)};
        objectArray2[0] = new rrcA_2(rdy_3.JT, rrcn_3Array);
        rrcn_3[] rrcn_3Array2 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)};
        objectArray2[1] = new rrcA_2(rdy_3.hF, rrcn_3Array2);
        rrcn_3[] rrcn_3Array3 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(25000)};
        objectArray2[2] = new rrcA_2(rdy_3.xe, rrcn_3Array3);
        rrcn_3[] rrcn_3Array4 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)};
        objectArray2[3] = new rrcA_2(rdy_3.OY, rrcn_3Array4);
        rrcn_3[] rrcn_3Array5 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(300000), new rrcn_3(400000), new rrcn_3(450000), new rrcn_3(500000)};
        objectArray2[4] = new rrcA_2(rdy_3.OJ, rrcn_3Array5);
        rrcn_3[] rrcn_3Array6 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)};
        objectArray2[5] = new rrcA_2(rdy_3.Og, rrcn_3Array6);
        rrcn_3[] rrcn_3Array7 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000)};
        objectArray2[6] = new rrcA_2(rdy_3.Pz, rrcn_3Array7);
        rrcn_3[] rrcn_3Array8 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000)};
        objectArray2[7] = new rrcA_2(rdy_3.hr, rrcn_3Array8);
        rrcn_3[] rrcn_3Array9 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(1000000), new rrcn_3(2500000)};
        objectArray2[8] = new rrcA_2(rdy_3.Sv, rrcn_3Array9);
        rrcn_3[] rrcn_3Array10 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000)};
        objectArray2[9] = new rrcA_2(rdy_3.Wl, rrcn_3Array10);
        rrcn_3[] rrcn_3Array11 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000)};
        objectArray2[10] = new rrcA_2(rdy_3.kc, rrcn_3Array11);
        rrcn_3[] rrcn_3Array12 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000)};
        objectArray2[11] = new rrcA_2(rdy_3.xI, rrcn_3Array12);
        rrcn_3[] rrcn_3Array13 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000)};
        objectArray2[12] = new rrcA_2(rdy_3.dk, rrcn_3Array13);
        rrcn_3[] rrcn_3Array14 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(280000), new rrcn_3(300000), new rrcn_3(350000)};
        objectArray2[13] = new rrcA_2(rdy_3.Ok, rrcn_3Array14);
        rrcn_3[] rrcn_3Array15 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)};
        objectArray2[14] = new rrcA_2(rdy_3.hv, rrcn_3Array15);
        rrcn_3[] rrcn_3Array16 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)};
        objectArray2[15] = new rrcA_2(rdy_3.hA, rrcn_3Array16);
        rrcn_3[] rrcn_3Array17 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(1000000), new rrcn_3(5000000)};
        objectArray2[16] = new rrcA_2(rdy_3.Pn, rrcn_3Array17);
        rrcn_3[] rrcn_3Array18 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000)};
        objectArray2[17] = new rrcA_2(rdy_3.kn, rrcn_3Array18);
        rrcn_3[] rrcn_3Array19 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000)};
        objectArray2[18] = new rrcA_2(rdy_3.ko, rrcn_3Array19);
        rrcn_3[] rrcn_3Array20 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(1000000)};
        objectArray2[19] = new rrcA_2(rdy_3.kk, rrcn_3Array20);
        rrcn_3[] rrcn_3Array21 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000)};
        objectArray2[20] = new rrcA_2(rdy_3.hp, rrcn_3Array21);
        rrcn_3[] rrcn_3Array22 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000), new rrcn_3(500000), new rrcn_3(1000000)};
        objectArray2[21] = new rrcA_2(rdy_3.hL, rrcn_3Array22);
        rrcn_3[] rrcn_3Array23 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000), new rrcn_3(100000), new rrcn_3(250000)};
        objectArray2[22] = new rrcA_2(rdy_3.xD, rrcn_3Array23);
        rrcn_3[] rrcn_3Array24 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(100000), new rrcn_3(250000)};
        objectArray2[23] = new rrcA_2(rdy_3.OW, rrcn_3Array24);
        rrcn_3[] rrcn_3Array25 = new rrcn_3[]{new rrcn_3(10), new rrcn_3(100), new rrcn_3(1000), new rrcn_3(10000)};
        objectArray2[24] = new rrcA_2(rdy_3.hy, rrcn_3Array25);
        objectArray[0] = Set.of(objectArray2);
        id_class = objectArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9CD66380;
    }

    private static void id_break() {
        id_break = new byte[]{25, 8, 10, 100, 2, 3, 4, 5, 6, 7, 8, 10, 100, 2, 3, 4, 5, 6, 7, 2, 8, 10, 100, 2, 3, 4, 5, 6, 7, 3, 8, 10, 100, 2, 3, 4, 5, 6, 7, 4, 8, 10, 100, 2, 3, 4, 5, 6, 7, 5, 8, 10, 100, 2, 3, 4, 5, 6, 7, 6, 9, 10, 100, 2, 3, 4, 5, 6, 7, 8, 7, 4, 10, 100, 2, 3, 8, 5, 10, 100, 2, 3, 4, 9, 7, 10, 100, 2, 3, 4, 5, 6, 10, 5, 10, 100, 2, 3, 4, 11, 4, 10, 100, 2, 3, 12, 9, 10, 100, 2, 3, 4, 5, 6, 7, 8, 13, 5, 10, 100, 2, 3, 4, 14, 4, 10, 100, 2, 3, 15, 7, 10, 100, 2, 3, 4, 5, 6, 16, 5, 10, 100, 2, 3, 4, 17, 3, 10, 100, 2, 18, 6, 10, 100, 2, 3, 4, 5, 19, 6, 10, 100, 2, 3, 4, 5, 20, 5, 10, 100, 2, 3, 4, 21, 4, 10, 100, 2, 3, 22, 6, 10, 100, 2, 3, 4, 5, 23, 6, 10, 100, 2, 3, 4, 5, 24, 6, 10, 100, 2, 3, 4, 5};
    }

    private static void id_throws() {
        id_throws = new short[]{1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 1000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 25000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 1000, 10000, 1000, 10000, 1000, 10000};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcF_2.id_byte();
        rrcF_2.id_throws();
        rrcF_2.id_break();
        rrcF_2.id_protected();
        rrcF_2.id_class();
    }

    private static void id_protected() {
        id_protected = new int[]{100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 280000, 300000, 350000, 100000, 100000, 250000, 100000, 250000, 500000, 100000, 100000, 300000, 400000, 450000, 500000, 100000, 100000, 250000, 1000000, 2500000, 100000, 250000, 100000, 1000000, 5000000, 100000, 250000, 500000, 100000, 250000, 100000, 100000, 250000, 100000, 250000, 100000, 1000000};
    }
}

