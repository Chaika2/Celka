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

public non-sealed class Ey_1
extends EC {
    private static boolean[] booleans2f4c7d38ac4b3d05aa2e4d8321ae2a12;
    private static short[] shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12;

    public Ey_1(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    static {
        Ey_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCB5A40EC89800262L;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        Mr_1 mr_1 = new Mr_1();
        this.id_class(eZ, (Integer)rU_22.id_break[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[0]], (Integer)rU_22.id_break[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[1]], (Integer)rU_22.id_break[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[2]], mr_1);
        if ((Integer)mr_1.id_class[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[3]] == (Integer)rU_22.id_break[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[4]] - booleans2f4c7d38ac4b3d05aa2e4d8321ae2a12[0]) {
            return new GP(eZ.id_break(), rU_22, new rU_2((Integer)mr_1.id_class[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[5]], (Integer)mr_1.id_class[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[6]], (Integer)mr_1.id_class[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[7]]));
        }
        return new Gs_1(eZ.id_break(), rU_22, new rU_2((Integer)mr_1.id_class[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[8]], (Integer)mr_1.id_class[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[9]], (Integer)mr_1.id_class[shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12[10]]));
    }

    @Override
    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        GP.id_class(eZ, n, n2, n3, n + booleans2f4c7d38ac4b3d05aa2e4d8321ae2a12[1], n3, mr_1);
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
        shorts2f4c7d38ac4b3d05aa2e4d8321ae2a12 = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAEF3CB70;
    }

    private static void id_break() {
        booleans2f4c7d38ac4b3d05aa2e4d8321ae2a12 = new boolean[]{true, true};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{125, -26, -75, 78, -65, -99, 106, -13}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Ey_1.id_break();
        Ey_1.id_class();
    }
}

