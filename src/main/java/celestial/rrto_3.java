/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrto_3 {
    public static Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    static {
        rrto_3.ntfClinit();
    }

    private static void id_class() {
        id_break = new byte[]{2, 2, 3};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3F493471;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x57F1DBECB8F7ABBFL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{0, -45, 78, -106, -16, -42, 35, -90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3}};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrto_3.id_byte();
        rrto_3.id_class();
        rrto_3.id_break();
    }
}

