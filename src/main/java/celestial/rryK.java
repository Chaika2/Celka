/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryK {
    private static byte[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new byte[]{2, 2};
    }

    static {
        rryK.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3A542DF7;
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[3];
        nArray[0] = 2;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-32, 27, -45, 115, 29, 5, 35, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5B0856043282AA95L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryK.id_break();
        rryK.id_byte();
        rryK.id_class();
    }
}

