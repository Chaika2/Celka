/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gp_1 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[4] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    static {
        Gp_1.ntfClinit();
    }

    private static void id_class() {
        id_break = new byte[]{2, 2, 3};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC3573493;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x68A2322B4C812C25L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{119, 122, 41, 25, -128, -2, 88, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[3];
        nArray[0] = 3;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Gp_1.id_byte();
        Gp_1.id_class();
        Gp_1.id_break();
    }
}

