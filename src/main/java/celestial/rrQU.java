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

public non-sealed class rrQU
extends rrQK {
    private static double[] doublese59d3ce919893f2d9b520c562d76fecb;

    static {
        rrQU.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2D810F966965F6BBL;
    }

    private static void id_class() {
        doublese59d3ce919893f2d9b520c562d76fecb = new double[]{1.0, 1.0, 2.0};
    }

    @Override
    public double id_class(double d) {
        return Math.sqrt(doublese59d3ce919893f2d9b520c562d76fecb[0] - Math.pow(d - doublese59d3ce919893f2d9b520c562d76fecb[1], doublese59d3ce919893f2d9b520c562d76fecb[2]));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE2A9699;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{29, 30, -4, 110, 81, 18, -58, 4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

