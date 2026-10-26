/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GM {
    private static byte[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[3];
        nArray[0] = 2;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    static {
        GM.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-110, -49, -82, -2, 6, 35, -89, 48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEADF3357;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x968CD76264C26CE0L;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[7];
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_byte = blArray;
    }

    private static void id_break() {
        id_break = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        GM.id_class();
        GM.id_break();
        GM.id_byte();
    }
}

