/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrHE;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmu_3
implements rruq_1 {
    private static short[] id_class;

    static {
        rrmu_3.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2DDD4127535A44F2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x96D9266E;
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[id_class[0]]).id_break(c_static.id_extends());
    }

    private static void id_class() {
        id_class = new short[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{107, -34, -3, -114, 53, -18, -39, 76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

