/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import celestial.rXu_1;
import celestial.rdn_3;
import celestial.rhd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTc_1
extends rJY {
    private static boolean[] id_class;

    private static int id_byte(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE07B62BB;
    }

    public rrTc_1(rXu_1 rXu_12, int n, int n2, int n3) {
        super(rXu_12, n, n2, n3);
    }

    static {
        rrTc_1.id_catch();
    }

    @Override
    public boolean id_class(rhd_3 rhd_32) {
        return id_class[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDD47A936CA7B6CD8L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{18, -108, -92, 52, -22, 126, 11, -122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rdn_3 id_class(int n) {
        return rdn_3.id_break;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32) {
        return id_class[1];
    }

    @Override
    public rdn_3 id_class(rhd_3 rhd_32, rdn_3 rdn_32) {
        return rdn_3.id_break;
    }

    @Override
    public void id_break(rdn_3 rdn_32) {
    }

    private static void id_catch() {
        id_class = new boolean[2];
    }
}

