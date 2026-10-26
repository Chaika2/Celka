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

public class rrIf_1
extends rrIp_1 {
    private static String[] id_class;

    public rrIf_1() {
        super(id_class[0]);
    }

    static {
        rrIf_1.id_final();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x72C9C082;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5AAAC3DBD031108AL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{59, 110, 9, -117, -32, 24, 17, -118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_final() {
        id_class = new String[]{new String("moan_2")};
    }
}

