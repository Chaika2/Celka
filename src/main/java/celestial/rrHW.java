/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHW {
    public static Object[] id_class;
    private static boolean[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[2] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    static {
        rrHW.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x20A64D488447C111L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x34399F24;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{36, 49, -122, -117, 84, -99, -19, -34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{new int[]{2, 1, 3}};
        id_class = objectArray;
    }

    private static void id_break() {
        id_byte = new byte[]{2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrHW.id_byte();
        rrHW.id_break();
        rrHW.id_class();
    }
}

