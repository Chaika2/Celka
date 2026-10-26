/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjz_3 {
    private static String[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        id_break = new String[]{new String(" \u041a\u043e\u043c \u0441\u043d\u0435\u0433\u0430 (\u043f\u0440\u0435\u0434\u043c\u0435\u0442)"), new String(" \u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0448\u0442\u0443\u0447\u043a\u0430 (\u043f\u0440\u0435\u0434\u043c\u0435\u0442)"), new String("\u0412\u0437\u0440\u044b\u0432\u043d\u0430\u044f \u0442\u0440\u0430\u043f\u043a\u0430"), new String("\u0421\u0442\u0430\u043d"), new String("\u0422\u0440\u0430\u043f\u043a\u0430")};
    }

    static {
        rrjz_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{123, 19, -123, -52, -44, 26, 53, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAFF5AD543D93039CL;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x74FE4ABA;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{id_break[0], id_break[1], id_break[2], id_break[3], id_break[4]};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjz_3.id_class();
        rrjz_3.id_byte();
        rrjz_3.id_protected();
        rrjz_3.id_break();
    }

    private static void id_protected() {
        id_byte = new byte[]{5, 2, 3, 4};
    }
}

