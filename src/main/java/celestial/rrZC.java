/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjK_2;
import celestial.rqO_2;
import celestial.rrZO;
import celestial.rruy_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Supplier;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZC
extends rruy_1 {
    private static float[] id_protected;

    private static void id_int() {
        id_protected = new float[]{0.7f, 0.3f};
    }

    public rrZC(Supplier<String> supplier, rrZO rrZO2, Supplier<Integer> supplier2, Supplier<rjK_2> supplier3, Supplier<rqO_2> supplier4, Supplier<rjK_2> supplier5, Supplier<rjK_2> supplier6, Supplier<Integer> supplier7) {
        super(supplier, rrZO2, supplier2, supplier3, supplier4, supplier5, supplier6, supplier7);
    }

    static {
        rrZC.id_int();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x55E3566;
    }

    private static long id_break(long l) {
        return Long.rotateLeft(l, 32) ^ 0x36F95613E838BE05L;
    }

    public static String id_throws(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{73, -40, 120, 64, 48, -9, -126, 41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public float id_finally() {
        return id_protected[0] + id_protected[1] * this.id_protected();
    }
}

