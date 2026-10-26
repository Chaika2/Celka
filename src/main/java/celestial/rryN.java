/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryN {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[3] = true;
        blArray[5] = true;
        id_byte = blArray;
    }

    static {
        rryN.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCF29DE85C2B9AF29L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{37, -25, 54, 32, 117, -109, 77, -48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1733D10F;
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[3];
        nArray[0] = 1;
        nArray[2] = 2;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static void id_break() {
        id_break = new byte[]{2, 2};
    }

    private static /* synthetic */ void ntfClinit() {
        rryN.id_byte();
        rryN.id_break();
        rryN.id_class();
    }
}

