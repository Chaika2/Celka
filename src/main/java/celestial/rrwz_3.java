/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwz_3 {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;

    private static void id_byte() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[10];
        nArray[2] = 1;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    static {
        rrwz_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x378B9562;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x69C5C5EE4F774ECFL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-37, -76, 10, 71, -120, -28, 118, -128}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_byte = new byte[]{2};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[4];
        blArray[2] = true;
        blArray[3] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwz_3.id_break();
        rrwz_3.id_class();
        rrwz_3.id_byte();
    }
}

