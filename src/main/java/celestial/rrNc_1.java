/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNc_1 {
    public static Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        Object[] objectArray = new Object[2];
        objectArray[0] = new int[]{1, 2};
        int[] nArray = new int[3];
        nArray[0] = 1;
        objectArray[1] = nArray;
        id_class = objectArray;
    }

    static {
        rrNc_1.ntfClinit();
    }

    private static void id_class() {
        id_byte = new byte[]{2, 2};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-81, 57, 2, 67, 56, 0, -100, 20}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFD153DDC;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3E0D5308B2C57FC4L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[7] = true;
        blArray[9] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNc_1.id_break();
        rrNc_1.id_class();
        rrNc_1.id_byte();
    }
}

