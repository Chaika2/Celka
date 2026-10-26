/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmZ_2 {
    private static byte[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{2, 2, 4, 3, 6, 4};
    }

    static {
        rrmZ_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x30AE3F4F6A94E42DL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-87, 101, 4, 37, 111, -65, 2, -50}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x397C3B73;
    }

    private static void id_break() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[10];
        nArray[0] = 1;
        nArray[2] = 2;
        nArray[4] = 3;
        nArray[6] = 4;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrmZ_2.id_class();
        rrmZ_2.id_byte();
        rrmZ_2.id_break();
    }
}

