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

public non-sealed class EU
extends EC {
    private static boolean[] booleansa09f7561b417386b8d4a4476df9929df;

    public EU(int n2, int n3, int n4) {
    }

    static {
        EU.id_class();
    }

    private static void id_class() {
        booleansa09f7561b417386b8d4a4476df9929df = new boolean[]{true};
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return Gb_1.id_class(eZ, n, n2, n3, n - booleansa09f7561b417386b8d4a4476df9929df[0], n3);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x160B549E;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new Gb_1(eZ.id_break(), rU_22, rU_22.id_native());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x734A0F6C3C64F018L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{111, 1, 22, -94, -39, -98, -117, 65}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

