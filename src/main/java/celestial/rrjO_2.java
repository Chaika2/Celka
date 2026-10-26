/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjO_2 {
    private static byte[] id_break;
    private static String[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;

    private static void id_byte() {
        id_byte = new String[]{new String("don-item"), new String("isSphere"), new String("desorientation"), new String("fierytornado"), new String("sheerdust"), new String("freezeball"), new String("stratum"), new String("christmasstratum"), new String("trap"), new String("christmastrap"), new String("gift"), new String("godsaura"), new String("isSilver")};
    }

    static {
        rrjO_2.ntfClinit();
    }

    private static void id_class() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA0B4F434;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{43, 54, -118, -110, 65, 49, -95, -10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2B0110E59DAC1497L;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{id_byte[0], id_byte[1], id_byte[2], id_byte[3], id_byte[4], id_byte[5], id_byte[6], id_byte[7], id_byte[8], id_byte[9], id_byte[10], id_byte[11], id_byte[12]};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjO_2.id_class();
        rrjO_2.id_byte();
        rrjO_2.id_protected();
        rrjO_2.id_break();
    }

    private static void id_protected() {
        id_break = new byte[]{13, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    }
}

