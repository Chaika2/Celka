/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.event.EventTarget;
import celestial.module.movement.NoSlow;
import celestial.rdy_3;
import celestial.rrAB;
import celestial.rrAb_1;
import celestial.rrTF;
import celestial.xu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCe_1
extends rrTF<NoSlow> {
    private static boolean[] id_class;

    public rrCe_1(NoSlow noSlow) {
        super(noSlow);
    }

    static {
        rrCe_1.id_class();
    }

    @EventTarget
    public void id_class(rrAB rrAB2) {
        if (rrAB2.id_catch().id_break() == rdy_3.kU) {
            rrAB2.id_class(id_class[0]);
        }
    }

    @EventTarget
    public void id_class(rrAb_1 rrAb_12) {
        if (rrAb_12.id_class() == xu_3.XJ) {
            rrAb_12.id_class(id_class[1]);
        }
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-1, 8, -120, 16, -72, -53, -107, -9}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFE000CCA0A625E98L;
    }

    private static void id_class() {
        id_class = new boolean[]{true, true};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAE125E83;
    }
}

