/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Qo_1 {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[12];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[9] = true;
        id_break = blArray;
    }

    static {
        Qo_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x182C104BB7B67D02L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD3B7E617;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-28, -68, -26, -123, -23, -64, -91, 90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[2];
        int[] nArray = new int[4];
        nArray[1] = 3;
        nArray[2] = 2;
        nArray[3] = 1;
        objectArray[0] = nArray;
        int[] nArray2 = new int[7];
        nArray2[1] = 2;
        nArray2[2] = 1;
        nArray2[3] = 3;
        nArray2[5] = 4;
        nArray2[6] = 5;
        objectArray[1] = nArray2;
        id_class = objectArray;
    }

    private static void id_break() {
        id_byte = new byte[]{2, 3, 4, 5, 2, 3, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        Qo_1.id_byte();
        Qo_1.id_break();
        Qo_1.id_class();
    }
}

