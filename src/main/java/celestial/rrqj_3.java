/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqj_3 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        id_byte = new byte[]{2, 2, 2};
    }

    static {
        rrqj_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-109, 39, 64, -119, -117, -76, -77, 62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{new int[]{2, 1}, new int[]{1, 2}};
        id_class = objectArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x24FD7D90;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEF84136CDC5C11DFL;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqj_3.id_break();
        rrqj_3.id_byte();
        rrqj_3.id_class();
    }
}

