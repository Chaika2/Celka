/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rruq_1;
import celestial.rrvZ;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmx_3
implements rruq_1 {
    private static short[] id_class;

    static {
        rrmx_3.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1F4D2A71;
    }

    private static void id_class() {
        id_class = new short[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA7F240F39A2A1CEDL;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_class[0]]).id_class();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-39, -34, -24, 118, -58, -81, 9, -107}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

