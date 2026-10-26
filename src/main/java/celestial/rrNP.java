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

public non-sealed class rrNP
extends rrQK {
    private static double[] doubles7ac0fc5835d836de894458790e6e5ce6;

    static {
        rrNP.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x18CAAADA;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCCCCEB1850FF1F92L;
    }

    private static void id_class() {
        doubles7ac0fc5835d836de894458790e6e5ce6 = new double[]{1.0, 1.0, 1.0, 2.0, -10.0};
    }

    @Override
    public double id_class(double d) {
        return d == doubles7ac0fc5835d836de894458790e6e5ce6[0] ? doubles7ac0fc5835d836de894458790e6e5ce6[1] : doubles7ac0fc5835d836de894458790e6e5ce6[2] - Math.pow(doubles7ac0fc5835d836de894458790e6e5ce6[3], doubles7ac0fc5835d836de894458790e6e5ce6[4] * d);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-68, -116, -115, 22, -93, -14, -3, -55}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

