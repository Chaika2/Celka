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

public non-sealed class rrNB
extends rrQK {
    private static double[] doublesea3adade77813ee18c7a28313b70454f;

    static {
        rrNB.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5977CF14;
    }

    private static void id_class() {
        doublesea3adade77813ee18c7a28313b70454f = new double[]{Math.PI, 2.0};
    }

    @Override
    public double id_class(double d) {
        return Math.sin(d * doublesea3adade77813ee18c7a28313b70454f[0] / doublesea3adade77813ee18c7a28313b70454f[1]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC98011C3E19497F7L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-122, 75, 29, 5, 58, 9, 63, -104}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

