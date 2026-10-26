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

public class rrCX
implements rrCh_1 {
    private static boolean[] id_class;

    static {
        rrCX.id_break();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x640E0F3D;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-85, -7, 63, -63, -102, 90, 78, 51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public boolean id_class(AutoSwap autoSwap) {
        if (autoSwap.id_try()) {
            return id_class[0];
        }
        return id_class[1];
    }

    @Override
    public rdb_3 id_class() {
        return rdy_3.du;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x643261A0346EF404L;
    }

    @Override
    public Predicate<rdn_3> id_break(AutoSwap autoSwap) {
        return rdn_32 -> rdn_32.id_break() == rdy_3.du ? id_class[2] : id_class[3];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[4];
        blArray[0] = true;
        blArray[2] = true;
        id_class = blArray;
    }
}

