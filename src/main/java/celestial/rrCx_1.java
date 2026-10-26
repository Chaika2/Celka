/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.module.combat.AutoSwap;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rrCh_1;
import celestial.rrjS_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCx_1
implements rrCh_1 {
    private static boolean[] id_class;

    static {
        rrCx_1.id_break();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{5, 105, 79, 121, 75, 90, 84, -51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x850950C2F436E80CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD6371250;
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
        return rdy_3.dJ;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_class = blArray;
    }

    @Override
    public Predicate<rdn_3> id_break(AutoSwap autoSwap) {
        return rdn_32 -> rrjS_2.id_break(rdn_32);
    }
}

