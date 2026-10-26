/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruC {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    static {
        rruC.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x77093C6D;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{39, 19, 40, 18, -124, -61, 123, -34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{new int[]{1, 2}};
        id_class = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFED75BE6B6EED388L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[7];
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rruC.id_break();
        rruC.id_byte();
        rruC.id_class();
    }
}

