/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtW_2 {
    private static byte[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new int[]{1, 3, 2}};
        id_class = objectArray;
    }

    static {
        rrtW_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x104BA381;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, 7, -4, -2, 18, -82, -119, 76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_break = new byte[]{2, 2, 3};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7B69ED0B66685C2CL;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtW_2.id_break();
        rrtW_2.id_class();
        rrtW_2.id_byte();
    }
}

