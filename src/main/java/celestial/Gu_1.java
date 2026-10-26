/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gu_1 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new int[]{2, 1, 3, 4, 6, 5}};
        id_class = objectArray;
    }

    static {
        Gu_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-8, 110, -83, 61, -63, 15, -79, -39}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x82B45469;
    }

    private static void id_class() {
        id_byte = new byte[]{2, 3, 4, 5, 6};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5D441A7E04BB9EA2L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[9];
        blArray[2] = true;
        blArray[8] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Gu_1.id_break();
        Gu_1.id_class();
        Gu_1.id_byte();
    }
}

