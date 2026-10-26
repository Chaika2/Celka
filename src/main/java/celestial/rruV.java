/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rruq_1;
import celestial.rrvw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruV
implements rruq_1 {
    private static short[] id_class;

    static {
        rruV.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF44C2B00;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrvw_1)((Object)rrvw_1.staticFieldsb5a707e7713735c98363c6b6bc5591b6[id_class[0]])).id_class();
    }

    private static void id_class() {
        id_class = new short[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-26, -113, 61, 109, 102, 29, -53, 90}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDC5442217E038808L;
    }
}

