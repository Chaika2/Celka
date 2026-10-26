/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rhk_3 {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    static {
        rhk_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{121, 63, 18, -64, 1, 74, -91, -58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x82D98F60;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6508963C345FAD7BL;
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[7];
        nArray[1] = 2;
        nArray[3] = 1;
        nArray[4] = 3;
        nArray[5] = 4;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static void id_break() {
        id_byte = new byte[]{2, 3, 4};
    }

    private static /* synthetic */ void ntfClinit() {
        rhk_3.id_byte();
        rhk_3.id_break();
        rhk_3.id_class();
    }
}

