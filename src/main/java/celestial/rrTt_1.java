/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTt_1 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        Object[] objectArray = new Object[2];
        objectArray[0] = new int[]{1, 2};
        int[] nArray = new int[4];
        nArray[0] = 1;
        nArray[2] = 2;
        objectArray[1] = nArray;
        id_class = objectArray;
    }

    static {
        rrTt_1.ntfClinit();
    }

    private static void id_class() {
        id_break = new byte[]{2, 2, 2, 2};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAACB657B01F277B2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEDA76205;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{78, -46, -41, -31, -92, 106, -11, 8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[11];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[10] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTt_1.id_break();
        rrTt_1.id_class();
        rrTt_1.id_byte();
    }
}

