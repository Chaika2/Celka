/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfr_3 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3}};
        id_class = objectArray;
    }

    static {
        rrfr_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x96539F1B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{2, 101, 17, -76, 66, -74, -51, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_byte = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5DB6D83C4CD27EB5L;
    }

    private static void id_break() {
        id_break = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrfr_3.id_class();
        rrfr_3.id_break();
        rrfr_3.id_byte();
    }
}

