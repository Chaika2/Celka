/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrIp_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIT
extends rrIp_1 {
    private static String[] id_class;

    public rrIT() {
        super(id_class[0]);
    }

    static {
        rrIT.id_final();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE9A3EEE1284E10C3L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB66F2C1F;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{105, -32, 67, 16, 84, 48, 105, 100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_final() {
        id_class = new String[]{new String("marker")};
    }
}

