/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAy_1 {
    public static Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    static {
        rrAy_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x642CA9D4F546CE51L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6D513358;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-62, 69, -38, -121, 32, 15, -127, -93}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrAy_1 id_class() {
        return (rrAy_1)id_class[id_byte[0]];
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrAy_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAy_1.id_byte();
        rrAy_1.id_protected();
        rrAy_1.id_break();
    }

    private static void id_protected() {
        id_byte = new short[1];
    }
}

