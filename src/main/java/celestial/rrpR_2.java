/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpR_2 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        id_byte = new byte[]{2, 2};
    }

    static {
        rrpR_2.ntfClinit();
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-84, 2, 1, 4, -13, 124, -82, 38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x84021A1F;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x45AEAA51883BC395L;
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
        rrpR_2.id_class();
        rrpR_2.id_byte();
        rrpR_2.id_break();
    }
}

