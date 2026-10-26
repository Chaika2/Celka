/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EC;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GP;
import celestial.Gs_1;
import celestial.Mr_1;
import celestial.rU_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class Eq_1
extends EC {
    private static boolean[] booleans2542617fbc4030e69ab9da0e5b26aa6e;
    private static short[] shorts2542617fbc4030e69ab9da0e5b26aa6e;

    public Eq_1(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    static {
        Eq_1.ntfClinit();
    }

    @Override
    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        GP.id_class(eZ, n, n2, n3, n, n3 - booleans2542617fbc4030e69ab9da0e5b26aa6e[1], mr_1);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2E266A4569AA814DL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x45262AF5;
    }

    private static void id_class() {
        short[] sArray = new short[11];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        sArray[6] = 1;
        sArray[7] = 2;
        sArray[9] = 1;
        sArray[10] = 2;
        shorts2542617fbc4030e69ab9da0e5b26aa6e = sArray;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        Mr_1 mr_1 = new Mr_1();
        this.id_class(eZ, (Integer)rU_22.id_break[shorts2542617fbc4030e69ab9da0e5b26aa6e[0]], (Integer)rU_22.id_break[shorts2542617fbc4030e69ab9da0e5b26aa6e[1]], (Integer)rU_22.id_break[shorts2542617fbc4030e69ab9da0e5b26aa6e[2]], mr_1);
        if ((Integer)mr_1.id_class[shorts2542617fbc4030e69ab9da0e5b26aa6e[3]] == (Integer)rU_22.id_break[shorts2542617fbc4030e69ab9da0e5b26aa6e[4]] - booleans2542617fbc4030e69ab9da0e5b26aa6e[0]) {
            return new GP(eZ.id_break(), rU_22, new rU_2((Integer)mr_1.id_class[shorts2542617fbc4030e69ab9da0e5b26aa6e[5]], (Integer)mr_1.id_class[shorts2542617fbc4030e69ab9da0e5b26aa6e[6]], (Integer)mr_1.id_class[shorts2542617fbc4030e69ab9da0e5b26aa6e[7]]));
        }
        return new Gs_1(eZ.id_break(), rU_22, new rU_2((Integer)mr_1.id_class[shorts2542617fbc4030e69ab9da0e5b26aa6e[8]], (Integer)mr_1.id_class[shorts2542617fbc4030e69ab9da0e5b26aa6e[9]], (Integer)mr_1.id_class[shorts2542617fbc4030e69ab9da0e5b26aa6e[10]]));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{1, -52, -49, -30, 33, -96, 58, 16}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        booleans2542617fbc4030e69ab9da0e5b26aa6e = new boolean[]{true, true};
    }

    private static /* synthetic */ void ntfClinit() {
        Eq_1.id_break();
        Eq_1.id_class();
    }
}

