/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqL_2 {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        id_break = new byte[]{2, 2, 3, 3, 4, 4, 5};
    }

    static {
        rrqL_2.ntfClinit();
    }

    private static void id_class() {
        boolean[] blArray = new boolean[10];
        blArray[3] = true;
        blArray[5] = true;
        blArray[9] = true;
        id_byte = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDC0B0B36CAC26278L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-125, 78, 103, 88, -34, -16, 83, -93}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x26E4FD0C;
    }

    private static void id_break() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[9];
        nArray[0] = 1;
        nArray[1] = 2;
        nArray[2] = 3;
        nArray[3] = 4;
        nArray[4] = 5;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqL_2.id_class();
        rrqL_2.id_byte();
        rrqL_2.id_break();
    }
}

