/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EC;
import celestial.EZ;
import celestial.Ev_1;
import celestial.Gb_1;
import celestial.rU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class EK
extends EC {
    private static boolean[] booleanse9b89556140633d1961d70e473c4e93e;

    public EK(int n2, int n3, int n4) {
    }

    static {
        EK.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB468DD64C5EB16F7L;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new Gb_1(eZ.id_break(), rU_22, rU_22.id_volatile());
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD4A28F02;
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return Gb_1.id_class(eZ, n, n2, n3, n, n3 + booleanse9b89556140633d1961d70e473c4e93e[0]);
    }

    private static void id_class() {
        booleanse9b89556140633d1961d70e473c4e93e = new boolean[]{true};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, -85, 82, 39, -81, -110, 14, 13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

