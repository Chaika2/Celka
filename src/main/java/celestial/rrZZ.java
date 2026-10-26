/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZZ {
    public static Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[14];
        blArray[3] = true;
        blArray[5] = true;
        blArray[13] = true;
        id_break = blArray;
    }

    static {
        rrZZ.ntfClinit();
    }

    private static void id_class() {
        id_byte = new byte[]{2, 2, 3, 3, 4, 4, 5, 7, 6, 8, 7, 5, 8, 6, 9};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{24, 119, 41, -24, 99, -93, 69, -28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEDE78110F789BB13L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4475288F;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3, 4, 5, 8, 9, 6, 7}};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrZZ.id_byte();
        rrZZ.id_class();
        rrZZ.id_break();
    }
}

