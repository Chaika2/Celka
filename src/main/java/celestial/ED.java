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

public non-sealed class ED
extends EC {
    private static boolean[] booleansc670709b195231fba943ce97a7da6469;

    public ED(int n2, int n3, int n4) {
    }

    static {
        ED.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC12CDFD0;
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return Gb_1.id_class(eZ, n, n2, n3, n + booleansc670709b195231fba943ce97a7da6469[0], n3);
    }

    private static void id_class() {
        booleansc670709b195231fba943ce97a7da6469 = new boolean[]{true};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4402508E04085B7L;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new Gb_1(eZ.id_break(), rU_22, rU_22.id_throws());
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-64, -88, 23, -71, -12, 93, 2, 13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

