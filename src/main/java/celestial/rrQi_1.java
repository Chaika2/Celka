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

public non-sealed class rrQi_1
extends rrQK {
    private static double[] doubles0f54b2fc731339b384bb832ab8328044;

    static {
        rrQi_1.id_class();
    }

    @Override
    public double id_class(double d) {
        if (d < doubles0f54b2fc731339b384bb832ab8328044[0]) {
            return doubles0f54b2fc731339b384bb832ab8328044[1] * d * d;
        }
        if (d < doubles0f54b2fc731339b384bb832ab8328044[2]) {
            return doubles0f54b2fc731339b384bb832ab8328044[3] * (d -= doubles0f54b2fc731339b384bb832ab8328044[4]) * d + doubles0f54b2fc731339b384bb832ab8328044[5];
        }
        if (d < doubles0f54b2fc731339b384bb832ab8328044[6]) {
            return doubles0f54b2fc731339b384bb832ab8328044[7] * (d -= doubles0f54b2fc731339b384bb832ab8328044[8]) * d + doubles0f54b2fc731339b384bb832ab8328044[9];
        }
        return doubles0f54b2fc731339b384bb832ab8328044[10] * (d -= doubles0f54b2fc731339b384bb832ab8328044[11]) * d + doubles0f54b2fc731339b384bb832ab8328044[12];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x32E2F77A1670259L;
    }

    private static void id_class() {
        doubles0f54b2fc731339b384bb832ab8328044 = new double[]{0.36363636363636365, 7.5625, 0.7272727272727273, 7.5625, 0.5454545454545454, 0.75, 0.9090909090909091, 7.5625, 0.8181818181818182, 0.9375, 7.5625, 0.9545454545454546, 0.984375};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8281AB73;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{20, 127, -17, 113, -38, 80, 92, -35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

