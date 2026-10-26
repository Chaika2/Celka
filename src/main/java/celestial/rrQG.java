/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQG {
    public static Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{2, 3};
    }

    static {
        rrQG.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x17DB5E1ED3A3E4CFL;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{new int[]{1, 2, 3}};
        id_class = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-3, 20, -70, 35, 81, 85, 25, -39}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x96F882D9;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQG.id_break();
        rrQG.id_byte();
        rrQG.id_class();
    }
}

