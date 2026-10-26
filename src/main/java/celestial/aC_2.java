/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class aC_2 {
    public static Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    static {
        aC_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9B310766;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, 28, -25, 16, -76, -113, -9, -113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[2];
        int[] nArray = new int[4];
        nArray[1] = 3;
        nArray[2] = 1;
        nArray[3] = 2;
        objectArray[0] = nArray;
        int[] nArray2 = new int[3];
        nArray2[1] = 1;
        nArray2[2] = 2;
        objectArray[1] = nArray2;
        id_class = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x81CD106CE3B1C9CCL;
    }

    private static void id_break() {
        id_byte = new byte[]{2, 2, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        aC_2.id_byte();
        aC_2.id_break();
        aC_2.id_class();
    }
}

