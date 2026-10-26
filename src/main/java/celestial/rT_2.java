/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rT_2 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    static {
        rT_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3826993F;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{120, 91, -127, -57, 125, 88, -40, -55}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7BD7FC65FAB3BA2FL;
    }

    private static void id_class() {
        id_byte = new byte[]{2, 3};
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3}};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rT_2.id_byte();
        rT_2.id_class();
        rT_2.id_break();
    }
}

