/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bN_2 {
    private static byte[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new int[]{1, 2}};
        id_class = objectArray;
    }

    static {
        bN_2.ntfClinit();
    }

    private static void id_class() {
        id_break = new byte[]{2};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAA9669FA;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-31, 111, 115, -112, -88, -21, -70, 88}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD03B3D4A91827BA9L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[7];
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bN_2.id_break();
        bN_2.id_class();
        bN_2.id_byte();
    }
}

