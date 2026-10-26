/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Gj_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xL_2;
import celestial.xc_3;
import celestial.xd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class GR
extends Gj_1 {
    private static boolean[] booleanse9b3c193080c31c68abf3eb579fb5f49;
    private static short[] shortse9b3c193080c31c68abf3eb579fb5f49;

    public GR(xd_3 xd_32, Predicate predicate) {
    }

    static {
        GR.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE7973A670D303194L;
    }

    @Override
    public boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        if (((Boolean)C_class.id_instanceof().PG.id_class[shortse9b3c193080c31c68abf3eb579fb5f49[0]]).booleanValue()) {
            return rYB2.id_byte(rfH_22.id_break()).id_break() instanceof xL_2;
        }
        return booleanse9b3c193080c31c68abf3eb579fb5f49[0];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4924535B;
    }

    private static void id_class() {
        shortse9b3c193080c31c68abf3eb579fb5f49 = new short[1];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{116, -82, 28, -66, -109, -63, -45, -115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        booleanse9b3c193080c31c68abf3eb579fb5f49 = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        GR.id_break();
        GR.id_class();
    }
}

