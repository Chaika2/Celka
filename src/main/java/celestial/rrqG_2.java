/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrqG_2 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        id_byte = new byte[]{3, 2, 2, 3, 4, 4, 5};
    }

    static {
        rrqG_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7ED94F6C29A0ACE1L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6140CBAD;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[10];
        blArray[2] = true;
        blArray[3] = true;
        blArray[9] = true;
        id_break = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{122, 115, -39, 110, 107, -37, -39, -77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[6];
        nArray[0] = 4;
        nArray[1] = 1;
        nArray[2] = 3;
        nArray[3] = 2;
        nArray[4] = 5;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrqG_2.id_class();
        rrqG_2.id_byte();
        rrqG_2.id_break();
    }
}

