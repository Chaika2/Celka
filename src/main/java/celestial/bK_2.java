/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bK_2 {
    public static Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[10];
        blArray[2] = true;
        blArray[3] = true;
        blArray[9] = true;
        id_break = blArray;
    }

    static {
        bK_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x242A8C9E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB44B9FA822B0790FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{70, 13, -10, 97, -98, -53, -124, -22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[6];
        nArray[0] = 5;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 4;
        nArray[4] = 3;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static void id_break() {
        id_byte = new byte[]{2, 2, 4, 3, 3, 4, 5};
    }

    private static /* synthetic */ void ntfClinit() {
        bK_2.id_byte();
        bK_2.id_break();
        bK_2.id_class();
    }
}

