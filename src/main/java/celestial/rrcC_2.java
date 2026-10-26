/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdy_3;
import celestial.rrNd_1;
import celestial.rrNt_1;
import celestial.rrNw_1;
import celestial.rrcH_2;
import celestial.rrcT_2;
import celestial.rrcl_3;
import celestial.rrcy_3;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcC_2
implements rrcT_2<Boolean> {
    private static int[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public static Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[58];
        blArray[4] = true;
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
        blArray[55] = true;
        blArray[57] = true;
        id_throws = blArray;
    }

    static {
        rrcC_2.ntfClinit();
    }

    public static String id_class(List<rrNt_1> list, rrNt_1 rrNt_12) {
        return null;
    }

    public static boolean id_class(String string, String string2) {
        int n = string.length() / id_protected[1];
        String string3 = string.substring(id_throws[1], n);
        String string4 = string.substring(n);
        return (string4 + string3).equals(string2);
    }

    @Override
    public rrfI_2<Boolean> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcl_3(this, rrNw_12, rrNd_12);
    }

    public static boolean id_class(String string) {
        int n = string.length() / id_protected[0];
        String string2 = string.substring(id_throws[0], n);
        String string3 = string.substring(n);
        return string3.equals(string2);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x82ED0C83192B3L;
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        Object[] objectArray2 = new Object[26];
        rrcy_3[] rrcy_3Array = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000)};
        objectArray2[0] = new rrcH_2(rdy_3.Wl, rrcy_3Array);
        rrcy_3[] rrcy_3Array2 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(1000000), new rrcy_3(2500000)};
        objectArray2[1] = new rrcH_2(rdy_3.Sv, rrcy_3Array2);
        rrcy_3[] rrcy_3Array3 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000)};
        objectArray2[2] = new rrcH_2(rdy_3.hr, rrcy_3Array3);
        rrcy_3[] rrcy_3Array4 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)};
        objectArray2[3] = new rrcH_2(rdy_3.hv, rrcy_3Array4);
        rrcy_3[] rrcy_3Array5 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000)};
        objectArray2[4] = new rrcH_2(rdy_3.xI, rrcy_3Array5);
        rrcy_3[] rrcy_3Array6 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000)};
        objectArray2[5] = new rrcH_2(rdy_3.dk, rrcy_3Array6);
        rrcy_3[] rrcy_3Array7 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000)};
        objectArray2[6] = new rrcH_2(rdy_3.xD, rrcy_3Array7);
        rrcy_3[] rrcy_3Array8 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)};
        objectArray2[7] = new rrcH_2(rdy_3.hL, rrcy_3Array8);
        rrcy_3[] rrcy_3Array9 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)};
        objectArray2[8] = new rrcH_2(rdy_3.hA, rrcy_3Array9);
        rrcy_3[] rrcy_3Array10 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(300000), new rrcy_3(400000), new rrcy_3(450000), new rrcy_3(500000)};
        objectArray2[9] = new rrcH_2(rdy_3.OJ, rrcy_3Array10);
        rrcy_3[] rrcy_3Array11 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000)};
        objectArray2[10] = new rrcH_2(rdy_3.JT, rrcy_3Array11);
        rrcy_3[] rrcy_3Array12 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000)};
        objectArray2[11] = new rrcH_2(rdy_3.hp, rrcy_3Array12);
        rrcy_3[] rrcy_3Array13 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000)};
        objectArray2[12] = new rrcH_2(rdy_3.kn, rrcy_3Array13);
        rrcy_3[] rrcy_3Array14 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)};
        objectArray2[13] = new rrcH_2(rdy_3.Og, rrcy_3Array14);
        rrcy_3[] rrcy_3Array15 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000)};
        objectArray2[14] = new rrcH_2(rdy_3.Pz, rrcy_3Array15);
        rrcy_3[] rrcy_3Array16 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(250000)};
        objectArray2[15] = new rrcH_2(rdy_3.OW, rrcy_3Array16);
        rrcy_3[] rrcy_3Array17 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)};
        objectArray2[16] = new rrcH_2(rdy_3.hF, rrcy_3Array17);
        rrcy_3[] rrcy_3Array18 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000)};
        objectArray2[17] = new rrcH_2(rdy_3.kc, rrcy_3Array18);
        rrcy_3[] rrcy_3Array19 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000)};
        objectArray2[18] = new rrcH_2(rdy_3.Sm, rrcy_3Array19);
        rrcy_3[] rrcy_3Array20 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000)};
        objectArray2[19] = new rrcH_2(rdy_3.hy, rrcy_3Array20);
        rrcy_3[] rrcy_3Array21 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000)};
        objectArray2[20] = new rrcH_2(rdy_3.ko, rrcy_3Array21);
        rrcy_3[] rrcy_3Array22 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(500000), new rrcy_3(1000000)};
        objectArray2[21] = new rrcH_2(rdy_3.OY, rrcy_3Array22);
        rrcy_3[] rrcy_3Array23 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(100000), new rrcy_3(1000000), new rrcy_3(5000000)};
        objectArray2[22] = new rrcH_2(rdy_3.Pn, rrcy_3Array23);
        rrcy_3[] rrcy_3Array24 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(250000), new rrcy_3(280000), new rrcy_3(300000), new rrcy_3(350000)};
        objectArray2[23] = new rrcH_2(rdy_3.Ok, rrcy_3Array24);
        rrcy_3[] rrcy_3Array25 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(25000), new rrcy_3(100000)};
        objectArray2[24] = new rrcH_2(rdy_3.xe, rrcy_3Array25);
        rrcy_3[] rrcy_3Array26 = new rrcy_3[]{new rrcy_3(10), new rrcy_3(100), new rrcy_3(1000), new rrcy_3(10000), new rrcy_3(100000), new rrcy_3(1000000)};
        objectArray2[25] = new rrcH_2(rdy_3.kk, rrcy_3Array26);
        objectArray[0] = Set.of(objectArray2);
        id_class = objectArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE266FA65;
    }

    private static void id_break() {
        id_byte = new short[]{1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000, 25000, 1000, 1000, 1000, 1000, 10000, 1000, 1000, 1000, 1000, 1000, 10000, 1000, 10000, 1000, 10000, 1000, 10000};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{100, -39, -90, 96, 79, 66, -32, -119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_break = new int[]{100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 500000, 1000000, 100000, 250000, 280000, 300000, 350000, 100000, 100000, 250000, 100000, 250000, 500000, 100000, 100000, 100000, 300000, 400000, 450000, 500000, 100000, 100000, 100000, 250000, 1000000, 2500000, 100000, 250000, 100000, 100000, 1000000, 5000000, 100000, 250000, 500000, 100000, 250000, 100000, 100000, 250000, 100000, 250000, 100000, 1000000, 100000, 250000};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcC_2.id_byte();
        rrcC_2.id_break();
        rrcC_2.id_protected();
        rrcC_2.id_throws();
        rrcC_2.id_class();
    }

    private static void id_protected() {
        id_protected = new byte[]{2, 2, 26, 8, 10, 100, 2, 3, 4, 5, 6, 7, 8, 10, 100, 2, 3, 4, 5, 6, 7, 2, 8, 10, 100, 2, 3, 4, 5, 6, 7, 3, 8, 10, 100, 2, 3, 4, 5, 6, 7, 4, 8, 10, 100, 2, 3, 4, 5, 6, 7, 5, 8, 10, 100, 2, 3, 4, 5, 6, 7, 6, 9, 10, 100, 2, 3, 4, 5, 6, 7, 8, 7, 5, 10, 100, 2, 3, 4, 8, 5, 10, 100, 2, 3, 4, 9, 7, 10, 100, 2, 3, 4, 5, 6, 10, 5, 10, 100, 2, 3, 4, 11, 5, 10, 100, 2, 3, 4, 12, 9, 10, 100, 2, 3, 4, 5, 6, 7, 8, 13, 6, 10, 100, 2, 3, 4, 5, 14, 4, 10, 100, 2, 3, 15, 7, 10, 100, 2, 3, 4, 5, 6, 16, 5, 10, 100, 2, 3, 4, 17, 5, 10, 100, 2, 3, 4, 18, 6, 10, 100, 2, 3, 4, 5, 19, 6, 10, 100, 2, 3, 4, 5, 20, 5, 10, 100, 2, 3, 4, 21, 4, 10, 100, 2, 3, 22, 6, 10, 100, 2, 3, 4, 5, 23, 6, 10, 100, 2, 3, 4, 5, 24, 6, 10, 100, 2, 3, 4, 5, 25, 6, 10, 100, 2, 3, 4, 5};
    }
}

