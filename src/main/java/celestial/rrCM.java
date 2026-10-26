/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.combat.AutoSwap;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrCh_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCM
implements rrCh_1 {
    private static boolean[] id_class;

    static {
        rrCM.id_break();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x807F7D894A0361F8L;
    }

    @Override
    public rdb_3 id_class() {
        return rdy_3.hy;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCEEAFA76;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-96, -17, -53, 19, 126, -58, -88, -99}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Predicate<rdn_3> id_break(AutoSwap autoSwap) {
        return rdn_32 -> rdn_32.id_break() == this.id_class() ? id_class[0] : id_class[1];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_class = blArray;
    }
}

