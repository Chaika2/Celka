/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gk_1 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new int[]{2, 3, 1}};
        id_class = objectArray;
    }

    static {
        Gk_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{71, -10, 32, 62, 102, -65, 82, -15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x42F50218;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7E77336D8B5E8D36L;
    }

    private static void id_class() {
        id_break = new byte[]{2, 2, 3};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Gk_1.id_break();
        Gk_1.id_class();
        Gk_1.id_byte();
    }
}

