/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpX_2 {
    private static byte[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[3];
        nArray[1] = 2;
        nArray[2] = 1;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    static {
        rrpX_2.ntfClinit();
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-99, -95, 107, -128, 98, -109, 88, -88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x94919F45;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF9D92A6693A176DFL;
    }

    private static void id_break() {
        id_break = new byte[]{2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpX_2.id_class();
        rrpX_2.id_break();
        rrpX_2.id_byte();
    }
}

