/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAL {
    private static short[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new short[1];
    }

    static {
        rrAL.ntfClinit();
    }

    public static rrAL id_class() {
        return (rrAL)id_class[id_break[0]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xADF90200;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE694F849BF7643CL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-37, 90, 121, -45, 2, 77, 40, 70}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAL.id_break();
        rrAL.id_byte();
        rrAL.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAL()};
        id_class = objectArray;
    }
}

