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

public non-sealed class EH
extends EC {
    private static short[] shorts82dbb89706383b24a38b1bf56dadcae8;
    private static boolean[] booleans82dbb89706383b24a38b1bf56dadcae8;

    public EH(int n2, int n3, int n4) {
    }

    static {
        EH.ntfClinit();
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return Gr_1.id_class(eZ, n, n2, n3, n - booleans82dbb89706383b24a38b1bf56dadcae8[2], n3);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA43D2CB35F512D82L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE69F1B14;
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new Gr_1(eZ.id_break(), rU_22, new rU_2((Integer)rU_22.id_break[shorts82dbb89706383b24a38b1bf56dadcae8[0]] - booleans82dbb89706383b24a38b1bf56dadcae8[0], (Integer)rU_22.id_break[shorts82dbb89706383b24a38b1bf56dadcae8[1]] + booleans82dbb89706383b24a38b1bf56dadcae8[1], (Integer)rU_22.id_break[shorts82dbb89706383b24a38b1bf56dadcae8[2]]));
    }

    private static void id_class() {
        booleans82dbb89706383b24a38b1bf56dadcae8 = new boolean[]{true, true, true};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-7, -75, -71, -17, -50, 67, 121, -123}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[3];
        sArray[1] = 1;
        sArray[2] = 2;
        shorts82dbb89706383b24a38b1bf56dadcae8 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        EH.id_class();
        EH.id_break();
    }
}

