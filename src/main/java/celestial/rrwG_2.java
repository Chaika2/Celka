/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwG_2 {
    private static byte[] id_class;
    private static boolean[] id_break;

    private rrwG_2() {
    }

    static {
        rrwG_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9CAFD52E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA2563C11BB45ACB1L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, 58, -75, 9, 39, 84, 60, -39}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static float id_class(float f, int n) {
        if (n <= id_break[0]) {
            return f;
        }
        return (float)Math.round(f / (float)n) * (float)n;
    }

    private static void id_class() {
        id_class = new byte[]{5};
    }

    public static float id_class(float f) {
        return rrwG_2.id_class(f, id_class[0]);
    }

    private static void id_break() {
        id_break = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrwG_2.id_break();
        rrwG_2.id_class();
    }
}

