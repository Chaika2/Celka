/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rruq_1;
import celestial.rrvZ;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmk_3
implements rruq_1 {
    private static short[] id_class;

    static {
        rrmk_3.id_class();
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        ((rrvZ)rrvZ.staticFieldse90af7ec3c763bb3bd1d99a27ea561d9[id_class[0]]).id_protected(c_static.id_extends());
    }

    private static void id_class() {
        id_class = new short[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x10E7D2EE62A8EBDBL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x637A15F0;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, -13, -63, -105, 18, 112, -120, -94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

