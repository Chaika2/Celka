/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQJ {
    public static Object[] id_class;
    private static byte[] id_break;
    private static String[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_byte = new String[]{new String("Celestial"), new String("Celestial"), new String("1.16.5"), new String("1.1"), new String("25/05/2026")};
    }

    static {
        rrQJ.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3E6CE72A2FE64D29L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{39, 49, -15, 92, 19, -40, 113, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_break = new byte[]{6, 2, 3, 4};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3C1F238C;
    }

    private static void id_break() {
        Object[] objectArray = new Object[6];
        objectArray[0] = id_byte[1];
        objectArray[1] = new String("CELESTIAL");
        objectArray[2] = id_byte[2];
        objectArray[3] = id_byte[3];
        objectArray[4] = id_byte[4];
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQJ.id_protected();
        rrQJ.id_byte();
        rrQJ.id_class();
        rrQJ.id_break();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_protected = blArray;
    }
}

