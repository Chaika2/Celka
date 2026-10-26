/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bu_1 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[10];
        nArray[0] = 2;
        nArray[2] = 1;
        nArray[3] = 3;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    static {
        Bu_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7C4BB8B48C3119FCL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{25, 41, 57, -116, 57, -68, -69, -16}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF1C1BE58;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    private static void id_break() {
        id_break = new byte[]{2, 2, 3, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        Bu_1.id_class();
        Bu_1.id_break();
        Bu_1.id_byte();
    }
}

