/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjG_2 {
    private static float[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;
    private static byte[] id_protected;

    private static void id_byte() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)};
        id_class = objectArray;
    }

    static {
        rrjG_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-99, 78, -37, 2, -127, 43, -76, -79}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE3A909D4;
    }

    private static void id_class() {
        id_break = new float[]{60.0f, 30.0f, 20.0f};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x54C238F96DB88DBFL;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjG_2.id_break();
        rrjG_2.id_class();
        rrjG_2.id_protected();
        rrjG_2.id_byte();
    }

    private static void id_protected() {
        id_protected = new byte[]{3, 2};
    }
}

