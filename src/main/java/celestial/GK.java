/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Go_1;
import celestial.rM_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GK
extends rM_2 {
    private static boolean[] id_break;
    private static double[] id_byte;

    private static void id_byte() {
        id_byte = new double[]{Double.NEGATIVE_INFINITY};
    }

    public GK(Go_1 go_1, double d, rfH_2 ... rfH_2Array) {
        super(d, rfH_2Array);
    }

    static {
        GK.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA170EA52DC7C8FDFL;
    }

    @Override
    public double id_class() {
        return id_byte[0];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x769BF312;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-79, -87, -106, -44, -119, 31, -11, -34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return id_break[0];
    }

    private static void id_break() {
        id_break = new boolean[1];
    }

    private static /* synthetic */ void ntfClinit() {
        GK.id_break();
        GK.id_byte();
    }
}

