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

public non-sealed class Et_1
extends EC {
    private static boolean[] booleans4a6cac8c56bd302eb2a87593bc0cd77a;
    private static short[] shorts4a6cac8c56bd302eb2a87593bc0cd77a;

    public Et_1(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    static {
        Et_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCA55659B125CE345L;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        Mr_1 mr_1 = new Mr_1();
        this.id_class(eZ, (Integer)rU_22.id_break[shorts4a6cac8c56bd302eb2a87593bc0cd77a[0]], (Integer)rU_22.id_break[shorts4a6cac8c56bd302eb2a87593bc0cd77a[1]], (Integer)rU_22.id_break[shorts4a6cac8c56bd302eb2a87593bc0cd77a[2]], mr_1);
        return new GB(eZ.id_break(), rU_22, rpr_3.NORTH, rpr_3.EAST, (Integer)mr_1.id_class[shorts4a6cac8c56bd302eb2a87593bc0cd77a[3]] - (Integer)rU_22.id_break[shorts4a6cac8c56bd302eb2a87593bc0cd77a[4]]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x96B1355D;
    }

    private static void id_class() {
        short[] sArray = new short[5];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[3] = 1;
        sArray[4] = 1;
        shorts4a6cac8c56bd302eb2a87593bc0cd77a = sArray;
    }

    @Override
    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        GB.id_class(eZ, n, n2, n3, n + booleans4a6cac8c56bd302eb2a87593bc0cd77a[0], n3 - booleans4a6cac8c56bd302eb2a87593bc0cd77a[1], mr_1);
    }

    private static void id_break() {
        booleans4a6cac8c56bd302eb2a87593bc0cd77a = new boolean[]{true, true};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, 115, 93, -2, 93, -127, 85, -35}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Et_1.id_break();
        Et_1.id_class();
    }
}

