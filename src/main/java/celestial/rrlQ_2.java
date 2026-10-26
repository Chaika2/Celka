/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlQ_2 {
    private static byte[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{2, 4, 2, 6, 3, 4};
    }

    static {
        rrlQ_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBD9EC8CBEAA39669L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE7B0ADEC;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, -6, -116, 107, -16, -98, -116, 13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[10];
        nArray[0] = 4;
        nArray[2] = 1;
        nArray[4] = 2;
        nArray[6] = 3;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlQ_2.id_class();
        rrlQ_2.id_byte();
        rrlQ_2.id_break();
    }
}

