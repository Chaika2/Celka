/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrzC_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzl_3
extends rrzC_2 {
    private static boolean[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_protected = new byte[]{127};
    }

    @Override
    public byte[] id_byte(String string) {
        for (int i = id_byte[0]; i < string.length(); ++i) {
            if (string.charAt(i) <= id_protected[0]) continue;
            return super.id_byte(string);
        }
        return string.getBytes(StandardCharsets.ISO_8859_1);
    }

    public rrzl_3() {
        super(StandardCharsets.UTF_8);
    }

    static {
        rrzl_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC9E610FB04704A64L;
    }

    @Override
    public String id_class(byte[] byArray) {
        byte[] byArray2 = byArray;
        int n = byArray2.length;
        for (int i = id_byte[1]; i < n; ++i) {
            byte by = byArray2[i];
            if (by >= 0) continue;
            return super.id_class(byArray);
        }
        return new String(byArray, StandardCharsets.ISO_8859_1);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x77B845DE;
    }

    private static void id_break() {
        id_byte = new boolean[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrzl_3.id_break();
        rrzl_3.id_byte();
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-128, 27, 31, -7, -25, -51, 82, 61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

