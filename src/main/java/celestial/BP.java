/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BP {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[7];
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    static {
        BP.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCB0E9A2E;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, 74, -101, -37, -49, 24, -42, -91}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x39D93BE3901EDAD8L;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{new int[]{1, 2}};
        id_class = objectArray;
    }

    private static void id_break() {
        id_break = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        BP.id_byte();
        BP.id_break();
        BP.id_class();
    }
}

