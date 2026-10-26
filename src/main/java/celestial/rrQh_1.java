/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQh_1 {
    public static Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[12];
        blArray[2] = true;
        blArray[11] = true;
        id_byte = blArray;
    }

    static {
        rrQh_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5DE7D484;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB1C2328FD5F08430L;
    }

    private static void id_class() {
        id_break = new byte[]{2, 3, 4, 5, 6, 7, 8, 9};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{92, -76, -113, 95, 34, -26, 77, -16}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQh_1.id_byte();
        rrQh_1.id_class();
        rrQh_1.id_break();
    }
}

