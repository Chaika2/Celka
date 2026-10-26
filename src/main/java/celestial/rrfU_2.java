/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfU_2 {
    public static Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        id_byte = new byte[]{2, 3, 4, 5, 6};
    }

    static {
        rrfU_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC084B570EC07E784L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-41, -50, -123, 46, 71, -39, 74, -116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3, 4, 5, 6}};
        id_class = objectArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x107D58C8;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[9];
        blArray[2] = true;
        blArray[8] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfU_2.id_break();
        rrfU_2.id_byte();
        rrfU_2.id_class();
    }
}

