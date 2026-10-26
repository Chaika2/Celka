/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sn_1 {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;

    private static void id_byte() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[10];
        nArray[0] = 1;
        nArray[2] = 2;
        nArray[4] = 3;
        nArray[6] = 4;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    static {
        Sn_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-46, 28, -64, -23, 41, -81, -85, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x96C7703D00DF81B6L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8C7F61E3;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[7] = true;
        id_break = blArray;
    }

    private static void id_break() {
        id_byte = new byte[]{2, 2, 4, 3, 6, 4};
    }

    private static /* synthetic */ void ntfClinit() {
        Sn_1.id_class();
        Sn_1.id_break();
        Sn_1.id_byte();
    }
}

