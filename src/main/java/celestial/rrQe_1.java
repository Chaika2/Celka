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

public non-sealed class rrQe_1
extends rrQK {
    private static double[] doubles1770e99df65a3a9eae04d8fca8f4496a;

    static {
        rrQe_1.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC2EC81834ADD5CE1L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD316249D;
    }

    private static void id_class() {
        doubles1770e99df65a3a9eae04d8fca8f4496a = new double[]{1.70158, 1.0, 1.0, 1.0, 3.0, 1.0, 2.0};
    }

    @Override
    public double id_class(double d) {
        double d2 = doubles1770e99df65a3a9eae04d8fca8f4496a[0];
        double d3 = d2 + doubles1770e99df65a3a9eae04d8fca8f4496a[1];
        return doubles1770e99df65a3a9eae04d8fca8f4496a[2] + d3 * Math.pow(d - doubles1770e99df65a3a9eae04d8fca8f4496a[3], doubles1770e99df65a3a9eae04d8fca8f4496a[4]) + d2 * Math.pow(d - doubles1770e99df65a3a9eae04d8fca8f4496a[5], doubles1770e99df65a3a9eae04d8fca8f4496a[6]);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, -81, -25, 48, -119, 124, -38, -99}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

