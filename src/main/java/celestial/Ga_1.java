/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ge_1;
import celestial.rM_2;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Ga_1
extends rM_2 {
    private static double[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_byte = new boolean[1];
    }

    public Ga_1(Ge_1 ge_1, double d, Integer n, rfH_2 ... rfH_2Array) {
        super(d, n, rfH_2Array);
    }

    static {
        Ga_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x59C9CBF2;
    }

    @Override
    public double id_class() {
        return id_break[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9EA64527FB0A4639L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{67, -109, 91, -39, 78, 74, 48, -77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_break(int n, int n2, int n3) {
        return id_byte[0];
    }

    private static void id_break() {
        id_break = new double[]{Double.NEGATIVE_INFINITY};
    }

    private static /* synthetic */ void ntfClinit() {
        Ga_1.id_byte();
        Ga_1.id_break();
    }
}

