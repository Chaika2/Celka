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

public non-sealed class Ei_1
extends EC {
    private static short[] shortsd8dd803979c73f38b46e2bc251ccb787;
    private static boolean[] booleansd8dd803979c73f38b46e2bc251ccb787;

    public Ei_1(int n2, int n3, int n4) {
    }

    static {
        Ei_1.ntfClinit();
    }

    private static void id_class() {
        booleansd8dd803979c73f38b46e2bc251ccb787 = new boolean[]{true, true, true};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD24B46FA;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new Gr_1(eZ.id_break(), rU_22, new rU_2((Integer)rU_22.id_break[shortsd8dd803979c73f38b46e2bc251ccb787[0]] + booleansd8dd803979c73f38b46e2bc251ccb787[0], (Integer)rU_22.id_break[shortsd8dd803979c73f38b46e2bc251ccb787[1]] + booleansd8dd803979c73f38b46e2bc251ccb787[1], (Integer)rU_22.id_break[shortsd8dd803979c73f38b46e2bc251ccb787[2]]));
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return Gr_1.id_class(eZ, n, n2, n3, n + booleansd8dd803979c73f38b46e2bc251ccb787[2], n3);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBD9119B8533907F5L;
    }

    private static void id_break() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        shortsd8dd803979c73f38b46e2bc251ccb787 = sArray;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-107, -62, -73, -39, -81, -15, -15, -82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Ei_1.id_class();
        Ei_1.id_break();
    }
}

