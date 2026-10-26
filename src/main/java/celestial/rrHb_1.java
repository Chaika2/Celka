/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHb_1 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        Object[] objectArray = new Object[2];
        int[] nArray = new int[3];
        nArray[0] = 3;
        objectArray[0] = nArray;
        int[] nArray2 = new int[3];
        nArray2[0] = 3;
        objectArray[1] = nArray2;
        id_class = objectArray;
    }

    static {
        rrHb_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8FA32877D15E5730L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC35B5CFA;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, 105, -59, -24, -103, 0, -30, 18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[1] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[10] = true;
        blArray[12] = true;
        id_byte = blArray;
    }

    private static void id_break() {
        id_break = new byte[]{2, 2, 3, 2, 2, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrHb_1.id_class();
        rrHb_1.id_break();
        rrHb_1.id_byte();
    }
}

