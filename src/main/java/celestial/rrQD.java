/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrQK;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class rrQD
extends rrQK {
    private static double[] doubles926ed2443b7d3c18a628aaa6cd7f0440;

    static {
        rrQD.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6061CB9E;
    }

    @Override
    public double id_class(double d) {
        return doubles926ed2443b7d3c18a628aaa6cd7f0440[0] - (doubles926ed2443b7d3c18a628aaa6cd7f0440[1] - d) * (doubles926ed2443b7d3c18a628aaa6cd7f0440[2] - d);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x72768EDA406BA7D6L;
    }

    private static void id_class() {
        doubles926ed2443b7d3c18a628aaa6cd7f0440 = new double[]{1.0, 1.0, 1.0};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-65, -15, 30, 56, -37, -76, 102, 121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

