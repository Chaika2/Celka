/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EC;
import celestial.EZ;
import celestial.Ev_1;
import celestial.Gr_1;
import celestial.rU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class Ee_1
extends EC {
    private static boolean[] booleans7441ccf2084636e1a5659d2f20aec6ff;
    private static short[] shorts7441ccf2084636e1a5659d2f20aec6ff;

    public Ee_1(int n2, int n3, int n4) {
    }

    static {
        Ee_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5D32A15ACCABFC30L;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new Gr_1(eZ.id_break(), rU_22, new rU_2((Integer)rU_22.id_break[shorts7441ccf2084636e1a5659d2f20aec6ff[0]], (Integer)rU_22.id_break[shorts7441ccf2084636e1a5659d2f20aec6ff[1]] + booleans7441ccf2084636e1a5659d2f20aec6ff[0], (Integer)rU_22.id_break[shorts7441ccf2084636e1a5659d2f20aec6ff[2]] - booleans7441ccf2084636e1a5659d2f20aec6ff[1]));
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return Gr_1.id_class(eZ, n, n2, n3, n, n3 - booleans7441ccf2084636e1a5659d2f20aec6ff[2]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2E3943D6;
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        shorts7441ccf2084636e1a5659d2f20aec6ff = sArray;
    }

    private static void id_break() {
        booleans7441ccf2084636e1a5659d2f20aec6ff = new boolean[]{true, true, true};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-90, 9, 98, 46, -36, 118, -42, -10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Ee_1.id_break();
        Ee_1.id_class();
    }
}

