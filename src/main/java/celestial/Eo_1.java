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

public non-sealed class Eo_1
extends EC {
    private static boolean[] booleansd5fcc4e4daf23938a1a7f7ae2f130774;

    public Eo_1(int n2, int n3, int n4) {
    }

    static {
        Eo_1.id_class();
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return Gb_1.id_class(eZ, n, n2, n3, n, n3 - booleansd5fcc4e4daf23938a1a7f7ae2f130774[0]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE2B6209B2465136FL;
    }

    private static void id_class() {
        booleansd5fcc4e4daf23938a1a7f7ae2f130774 = new boolean[]{true};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD97BA295;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new Gb_1(eZ.id_break(), rU_22, rU_22.id_finally());
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{93, 10, 55, -124, 123, 106, -91, -28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

