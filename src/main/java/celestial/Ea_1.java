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

public non-sealed class Ea_1
extends EC {
    private static boolean[] booleans7b45469866d13c3ebf28fa6b347c1eae;
    private static short[] shorts7b45469866d13c3ebf28fa6b347c1eae;

    public Ea_1(int n2, int n3, int n4) {
    }

    static {
        Ea_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x46FA5937;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new Gr_1(eZ.id_break(), rU_22, new rU_2((Integer)rU_22.id_break[shorts7b45469866d13c3ebf28fa6b347c1eae[0]], (Integer)rU_22.id_break[shorts7b45469866d13c3ebf28fa6b347c1eae[1]] + booleans7b45469866d13c3ebf28fa6b347c1eae[0], (Integer)rU_22.id_break[shorts7b45469866d13c3ebf28fa6b347c1eae[2]] + booleans7b45469866d13c3ebf28fa6b347c1eae[1]));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x39DC153D95ABA178L;
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        shorts7b45469866d13c3ebf28fa6b347c1eae = sArray;
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return Gr_1.id_class(eZ, n, n2, n3, n, n3 + booleans7b45469866d13c3ebf28fa6b347c1eae[2]);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{125, -51, 49, -94, 72, 2, -77, -39}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        booleans7b45469866d13c3ebf28fa6b347c1eae = new boolean[]{true, true, true};
    }

    private static /* synthetic */ void ntfClinit() {
        Ea_1.id_break();
        Ea_1.id_class();
    }
}

