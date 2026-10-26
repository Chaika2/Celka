/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class SV {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3, 4}};
        id_class = objectArray;
    }

    static {
        SV.ntfClinit();
    }

    private static void id_class() {
        id_break = new byte[]{2, 2, 3, 3, 4};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-59, 67, 23, -107, 45, 27, 51, -36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC3FED53C88F61F35L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBAEC69A8;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[9];
        blArray[3] = true;
        blArray[5] = true;
        blArray[8] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        SV.id_break();
        SV.id_class();
        SV.id_byte();
    }
}

