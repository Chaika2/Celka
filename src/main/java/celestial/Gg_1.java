/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Gj_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xP_2;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class Gg_1
extends Gj_1 {
    private static boolean[] booleansb884524ca0633de0836cca46c5ab830f;
    private static short[] shortsb884524ca0633de0836cca46c5ab830f;

    public Gg_1(xd_3 xd_32, Predicate predicate) {
    }

    static {
        Gg_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x37C8FCD2;
    }

    @Override
    public boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        if (((Boolean)C_class.id_instanceof().PG.id_class[shortsb884524ca0633de0836cca46c5ab830f[0]]).booleanValue()) {
            return rYB2.id_byte(rfH_22.id_break()).id_break() instanceof xP_2;
        }
        return booleansb884524ca0633de0836cca46c5ab830f[0];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1C32E9D6B2B59B40L;
    }

    private static void id_class() {
        shortsb884524ca0633de0836cca46c5ab830f = new short[1];
    }

    private static void id_break() {
        booleansb884524ca0633de0836cca46c5ab830f = new boolean[]{true};
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-122, 113, -92, -84, 96, -59, -6, -98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Gg_1.id_break();
        Gg_1.id_class();
    }
}

