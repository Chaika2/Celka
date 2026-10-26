/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Gj_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zW_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public non-sealed class GV
extends Gj_1 {
    private static short[] shorts3c1b809b7322379d8c06e37e3e843031;
    private static boolean[] booleans3c1b809b7322379d8c06e37e3e843031;

    public GV(xd_3 xd_32, Predicate predicate) {
    }

    static {
        GV.ntfClinit();
    }

    private static void id_class() {
        booleans3c1b809b7322379d8c06e37e3e843031 = new boolean[]{true};
    }

    @Override
    public boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        if (((Boolean)C_class.id_instanceof().PG.id_class[shorts3c1b809b7322379d8c06e37e3e843031[0]]).booleanValue()) {
            return rYB2.id_byte(rfH_22.id_break()).id_break() instanceof zW_2;
        }
        return booleans3c1b809b7322379d8c06e37e3e843031[0];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x28A0147F;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x191C910AADE1A80FL;
    }

    private static void id_break() {
        shorts3c1b809b7322379d8c06e37e3e843031 = new short[1];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{86, 86, 17, 76, -106, 97, 82, 54}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        GV.id_class();
        GV.id_break();
    }
}

