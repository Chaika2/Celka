/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjK_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjF_2 {
    private static boolean[] id_class;

    static {
        rrjF_2.id_class();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{3, -67, -33, 85, -124, -88, -16, -79}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_class = blArray;
    }

    public static boolean id_class(double d, double d2, double d3, double d4, double d5, double d6) {
        return d5 > d && d5 < d + d3 && d6 > d2 && d6 < d2 + d4 ? id_class[0] : id_class[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC51CD20661EFE61L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x53FC1890;
    }

    public static boolean id_class(rjK_2 rjK_22, rjK_2 rjK_23, double d, double d2) {
        return d > (double)rjK_22.id_byte && d < (double)(rjK_22.id_byte + rjK_23.id_byte) && d2 > (double)rjK_22.id_protected && d2 < (double)(rjK_22.id_protected + rjK_23.id_protected) ? id_class[2] : id_class[3];
    }
}

