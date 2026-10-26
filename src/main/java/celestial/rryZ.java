/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rryF;
import celestial.rryv_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryZ
extends rryv_1 {
    private static short[] id_class;

    static {
        rryZ.id_break();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC8A17EB917F9639DL;
    }

    @Override
    public rryF id_class() {
        return (rryF)((Object)rryF.staticFieldsfd087588ab503ef5ba48903746a1e506[id_class[0]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB93D8CE0;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{22, -13, 68, -37, -95, 103, 81, 103}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_class = new short[]{1};
    }
}

