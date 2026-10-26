/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZB {
    private static boolean[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        id_byte = new byte[]{2, 4, 2, 6, 3, 4, 9, 5, 8, 6, 7, 7, 8};
    }

    static {
        rrZB.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3929A2CC;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-45, -60, 6, -32, -37, -27, -120, 96}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[10];
        nArray[0] = 4;
        nArray[1] = 7;
        nArray[2] = 1;
        nArray[4] = 2;
        nArray[6] = 3;
        nArray[7] = 8;
        nArray[8] = 6;
        nArray[9] = 5;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBE301618AF627C5AL;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[13];
        blArray[2] = true;
        blArray[10] = true;
        blArray[12] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrZB.id_break();
        rrZB.id_byte();
        rrZB.id_class();
    }
}

