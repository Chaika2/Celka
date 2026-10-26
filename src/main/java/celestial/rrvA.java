/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvA {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        id_byte = new byte[]{4, 2, 3, 2, 4, 3, 5};
    }

    static {
        rrvA.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8D637008430C7B8EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF2D97835;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{new int[]{1, 3, 4, 5, 2}};
        id_class = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-62, -11, -120, 91, 59, -52, -127, -98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[10];
        blArray[3] = true;
        blArray[6] = true;
        blArray[9] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvA.id_break();
        rrvA.id_byte();
        rrvA.id_class();
    }
}

