/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjJ_2 {
    public static Object[] id_class;
    private static byte[] id_break;
    private static float[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    static {
        rrjJ_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-23, 30, 87, -93, -96, -107, -49, -38}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE5D96CBD;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x678C72A99D684C7AL;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f)};
        id_class = objectArray;
    }

    private static void id_break() {
        id_byte = new float[]{10.0f, 10.0f, 10.0f};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjJ_2.id_byte();
        rrjJ_2.id_break();
        rrjJ_2.id_protected();
        rrjJ_2.id_class();
    }

    private static void id_protected() {
        id_break = new byte[]{3, 2};
    }
}

