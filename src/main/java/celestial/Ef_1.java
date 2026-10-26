/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EC;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GB;
import celestial.Mr_1;
import celestial.rU_2;
import celestial.rpr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class Ef_1
extends EC {
    private static boolean[] booleans3354f9d77e04380c822bc583237cbfb8;
    private static short[] shorts3354f9d77e04380c822bc583237cbfb8;

    public Ef_1(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    static {
        Ef_1.ntfClinit();
    }

    private static void id_class() {
        booleans3354f9d77e04380c822bc583237cbfb8 = new boolean[]{true, true};
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        Mr_1 mr_1 = new Mr_1();
        this.id_class(eZ, (Integer)rU_22.id_break[shorts3354f9d77e04380c822bc583237cbfb8[0]], (Integer)rU_22.id_break[shorts3354f9d77e04380c822bc583237cbfb8[1]], (Integer)rU_22.id_break[shorts3354f9d77e04380c822bc583237cbfb8[2]], mr_1);
        return new GB(eZ.id_break(), rU_22, rpr_3.SOUTH, rpr_3.WEST, (Integer)mr_1.id_class[shorts3354f9d77e04380c822bc583237cbfb8[3]] - (Integer)rU_22.id_break[shorts3354f9d77e04380c822bc583237cbfb8[4]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFDAFB2DF;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x90C100838F292DC2L;
    }

    @Override
    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        GB.id_class(eZ, n, n2, n3, n - booleans3354f9d77e04380c822bc583237cbfb8[0], n3 + booleans3354f9d77e04380c822bc583237cbfb8[1], mr_1);
    }

    private static void id_break() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        shorts3354f9d77e04380c822bc583237cbfb8 = sArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-42, -14, 10, 75, 51, -91, -44, -102}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Ef_1.id_class();
        Ef_1.id_break();
    }
}

