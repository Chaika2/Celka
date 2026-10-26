/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Eh_1 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        id_break = new byte[]{2, 3, 4};
    }

    static {
        Eh_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEF1E78E59FA30B62L;
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[6];
        nArray[2] = 3;
        nArray[3] = 4;
        nArray[4] = 2;
        nArray[5] = 1;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-115, 69, 104, 126, 98, 48, 116, 101}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2675CF89;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Eh_1.id_break();
        Eh_1.id_byte();
        Eh_1.id_class();
    }
}

