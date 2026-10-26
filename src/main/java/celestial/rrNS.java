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

public non-sealed class rrNS
extends rrQK {
    private static double[] doublesc5ad3b1a90063f789e1c064d7c8ca40c;

    static {
        rrNS.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9DF50057C9FE69CFL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x69E742EA;
    }

    private static void id_class() {
        doublesc5ad3b1a90063f789e1c064d7c8ca40c = new double[]{Math.PI, 0.2f, 2.5, 1.0, 2.2f, 1.0, 1.2f, 1.0};
    }

    @Override
    public double id_class(double d) {
        return (Math.sin(d * doublesc5ad3b1a90063f789e1c064d7c8ca40c[0] * (doublesc5ad3b1a90063f789e1c064d7c8ca40c[1] + doublesc5ad3b1a90063f789e1c064d7c8ca40c[2] * d * d * d)) * Math.pow(doublesc5ad3b1a90063f789e1c064d7c8ca40c[3] - d, doublesc5ad3b1a90063f789e1c064d7c8ca40c[4]) + d) * (doublesc5ad3b1a90063f789e1c064d7c8ca40c[5] + doublesc5ad3b1a90063f789e1c064d7c8ca40c[6] * (doublesc5ad3b1a90063f789e1c064d7c8ca40c[7] - d));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{125, 94, 78, 111, 119, -80, -24, -98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

