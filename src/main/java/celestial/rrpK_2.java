/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpK_2 {
    public static Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{2, 2};
    }

    static {
        rrpK_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{3, -106, 53, 36, 75, 51, 36, 22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDC5B98E7DF5F3F2CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1FB5E4D0;
    }

    private static void id_break() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[3];
        nArray[1] = 2;
        nArray[2] = 1;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpK_2.id_class();
        rrpK_2.id_byte();
        rrpK_2.id_break();
    }
}

