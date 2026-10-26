/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrZW;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmM_2
implements rruq_1 {
    private static short[] id_class;

    static {
        rrmM_2.id_class();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{49, -78, -27, -125, -115, -17, -42, -43}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_class[0]]).id_byte(c_static.id_extends());
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x89605AEA;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x929125397E4F5549L;
    }

    private static void id_class() {
        id_class = new short[1];
    }
}

