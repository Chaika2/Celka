/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sC_2 {
    public static Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{2, 2, 3};
    }

    static {
        sC_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x190B00AF;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{22, 27, -41, 105, 40, 58, -76, -43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7EF99A89475B90AEL;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3}};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sC_2.id_class();
        sC_2.id_byte();
        sC_2.id_break();
    }
}

