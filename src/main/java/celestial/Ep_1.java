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

public non-sealed class Ep_1
extends EC {
    private static boolean[] booleans9a37dad5349a3b0cbe97062398727f4e;
    private static short[] shorts9a37dad5349a3b0cbe97062398727f4e;

    public Ep_1(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    static {
        Ep_1.ntfClinit();
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
        shorts9a37dad5349a3b0cbe97062398727f4e = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD2378C5F4560D1EL;
    }

    @Override
    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        GP.id_class(eZ, n, n2, n3, n - booleans9a37dad5349a3b0cbe97062398727f4e[1], n3, mr_1);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFC24DD8B;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        Mr_1 mr_1 = new Mr_1();
        this.id_class(eZ, (Integer)rU_22.id_break[shorts9a37dad5349a3b0cbe97062398727f4e[0]], (Integer)rU_22.id_break[shorts9a37dad5349a3b0cbe97062398727f4e[1]], (Integer)rU_22.id_break[shorts9a37dad5349a3b0cbe97062398727f4e[2]], mr_1);
        if ((Integer)mr_1.id_class[shorts9a37dad5349a3b0cbe97062398727f4e[3]] == (Integer)rU_22.id_break[shorts9a37dad5349a3b0cbe97062398727f4e[4]] - booleans9a37dad5349a3b0cbe97062398727f4e[0]) {
            return new GP(eZ.id_break(), rU_22, new rU_2((Integer)mr_1.id_class[shorts9a37dad5349a3b0cbe97062398727f4e[5]], (Integer)mr_1.id_class[shorts9a37dad5349a3b0cbe97062398727f4e[6]], (Integer)mr_1.id_class[shorts9a37dad5349a3b0cbe97062398727f4e[7]]));
        }
        return new Gs_1(eZ.id_break(), rU_22, new rU_2((Integer)mr_1.id_class[shorts9a37dad5349a3b0cbe97062398727f4e[8]], (Integer)mr_1.id_class[shorts9a37dad5349a3b0cbe97062398727f4e[9]], (Integer)mr_1.id_class[shorts9a37dad5349a3b0cbe97062398727f4e[10]]));
    }

    private static void id_break() {
        booleans9a37dad5349a3b0cbe97062398727f4e = new boolean[]{true, true};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-85, 120, -52, -6, -85, 80, -71, 103}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Ep_1.id_break();
        Ep_1.id_class();
    }
}

