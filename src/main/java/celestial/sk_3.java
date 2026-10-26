/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sk_3 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[10];
        blArray[3] = true;
        blArray[5] = true;
        blArray[9] = true;
        id_byte = blArray;
    }

    static {
        sk_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2E824B95F4E54EEFL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{74, 6, -114, -40, 6, 2, -94, -100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x13DEC71D;
    }

    private static void id_class() {
        id_break = new byte[]{2, 2, 3, 3, 4, 4, 5};
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3, 4, 5}};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sk_3.id_byte();
        sk_3.id_class();
        sk_3.id_break();
    }
}

