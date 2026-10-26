/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHj_1 {
    private static byte[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{2};
    }

    static {
        rrHj_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{62, -126, -101, -16, 77, 65, 21, 123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x565ECE2B;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[7];
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x72DC65C490F99C8CL;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new int[]{1, 2}};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrHj_1.id_class();
        rrHj_1.id_byte();
        rrHj_1.id_break();
    }
}

