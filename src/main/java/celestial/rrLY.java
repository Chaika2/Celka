/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLY {
    private static short[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new short[1];
    }

    static {
        rrLY.ntfClinit();
    }

    public static rrLY id_class() {
        return (rrLY)id_class[id_break[0]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x14973125606ED5D4L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{72, 57, 57, -39, 21, -111, 27, -44}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x66840C85;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLY.id_break();
        rrLY.id_byte();
        rrLY.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrLY()};
        id_class = objectArray;
    }
}

