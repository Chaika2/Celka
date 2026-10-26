/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpq_3 {
    public static Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{2, 2};
    }

    static {
        rrpq_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x62E3EA9E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA4A1724A493C3D40L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-17, -71, 126, -27, -70, 24, -124, 71}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[3];
        nArray[1] = 2;
        nArray[2] = 1;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpq_3.id_break();
        rrpq_3.id_byte();
        rrpq_3.id_class();
    }
}

