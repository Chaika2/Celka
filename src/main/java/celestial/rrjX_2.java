/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLD;
import celestial.rLY;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjX_2 {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_break = blArray;
    }

    static {
        rrjX_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB22D97971D1558B2L;
    }

    private static void id_class() {
        id_protected = new short[]{3600};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-58, -77, -44, 10, -14, -21, 13, -31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x96300AAF;
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{List.of((Object)new rLY(rLD.id_throws, 3600, 3))};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjX_2.id_byte();
        rrjX_2.id_class();
        rrjX_2.id_protected();
        rrjX_2.id_break();
    }

    private static void id_protected() {
        id_byte = new byte[]{3};
    }
}

