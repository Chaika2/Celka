/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjN_2 {
    private static byte[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;
    private static float[] id_protected;

    private static void id_byte() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)};
        id_class = objectArray;
    }

    static {
        rrjN_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{66, 2, -96, -79, -73, 104, -8, 57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x877FEED6;
    }

    private static void id_class() {
        id_break = new byte[]{3, 2};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x90EF3074ED208DD9L;
    }

    private static void id_break() {
        id_protected = new float[]{14.0f, 5.0f, 5.0f};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjN_2.id_protected();
        rrjN_2.id_break();
        rrjN_2.id_class();
        rrjN_2.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }
}

