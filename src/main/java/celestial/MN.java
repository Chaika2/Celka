/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class MN {
    private static boolean[] id_break;
    public static Object[] id_class;
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
        MN.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x55239EC89B6A03A2L;
    }

    private static void id_class() {
        id_byte = new byte[]{2, 2, 3, 2};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-79, 105, -54, 91, 127, 6, -57, 84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7FDBF196;
    }

    private static void id_break() {
        Object[] objectArray = new Object[2];
        int[] nArray = new int[4];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        objectArray[0] = nArray;
        int[] nArray2 = new int[3];
        nArray2[1] = 2;
        nArray2[2] = 1;
        objectArray[1] = nArray2;
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        MN.id_byte();
        MN.id_class();
        MN.id_break();
    }
}

