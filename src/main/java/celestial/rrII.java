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

public class rrII
extends rrIp_1 {
    private static String[] id_class;

    public rrII() {
        super(id_class[0]);
    }

    static {
        rrII.id_final();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x98531F7E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC7E8AB05EC72EF40L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{14, 50, -114, 32, 27, 57, 96, 23}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_final() {
        id_class = new String[]{new String("moan_4")};
    }
}

