/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GC {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[7];
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    static {
        GC.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-121, 95, -8, -21, 2, -62, 78, 34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFC4570EC;
    }

    private static void id_class() {
        Object[] objectArray = new Object[1];
        int[] nArray = new int[4];
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        objectArray[0] = nArray;
        id_class = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8C62CF7D18C4F5FL;
    }

    private static void id_break() {
        id_byte = new byte[]{2, 2, 3, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        GC.id_byte();
        GC.id_break();
        GC.id_class();
    }
}

