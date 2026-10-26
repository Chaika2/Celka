/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class iS_2 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new int[]{1, 2}, new int[]{1, 2, 5, 6, 4, 3}};
        id_class = objectArray;
    }

    static {
        iS_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x56618D2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{54, 85, 120, -12, -47, -18, -8, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF4B47889D1F29C60L;
    }

    private static void id_class() {
        id_break = new byte[]{2, 3, 4, 5, 6, 2, 2};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[12];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        blArray[10] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        iS_2.id_break();
        iS_2.id_class();
        iS_2.id_byte();
    }
}

