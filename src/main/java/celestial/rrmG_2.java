/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrZW;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmG_2
implements rruq_1 {
    private static short[] id_class;

    static {
        rrmG_2.id_class();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{107, 30, -18, 10, 89, 1, -84, 118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3FC1D767D10AB1CL;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_class[0]]).id_protected();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2213D719;
    }

    private static void id_class() {
        id_class = new short[1];
    }
}

