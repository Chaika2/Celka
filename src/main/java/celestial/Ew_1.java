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

public non-sealed class Ew_1
extends EC {
    private static boolean[] booleansf07dde0113993f1987f0ce2e881d1376;
    private static short[] shortsf07dde0113993f1987f0ce2e881d1376;

    public Ew_1(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    static {
        Ew_1.ntfClinit();
    }

    private static void id_class() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        shortsf07dde0113993f1987f0ce2e881d1376 = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x40BD7C03;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        Mr_1 mr_1 = new Mr_1();
        this.id_class(eZ, (Integer)rU_22.id_break[shortsf07dde0113993f1987f0ce2e881d1376[0]], (Integer)rU_22.id_break[shortsf07dde0113993f1987f0ce2e881d1376[1]], (Integer)rU_22.id_break[shortsf07dde0113993f1987f0ce2e881d1376[2]], mr_1);
        return new GB(eZ.id_break(), rU_22, rpr_3.NORTH, rpr_3.WEST, (Integer)mr_1.id_class[shortsf07dde0113993f1987f0ce2e881d1376[3]] - (Integer)rU_22.id_break[shortsf07dde0113993f1987f0ce2e881d1376[4]]);
    }

    @Override
    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        GB.id_class(eZ, n, n2, n3, n - booleansf07dde0113993f1987f0ce2e881d1376[0], n3 - booleansf07dde0113993f1987f0ce2e881d1376[1], mr_1);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x663FEC27B0071A3FL;
    }

    private static void id_break() {
        booleansf07dde0113993f1987f0ce2e881d1376 = new boolean[]{true, true};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-85, -94, 12, 39, 22, 108, 118, 33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Ew_1.id_break();
        Ew_1.id_class();
    }
}

