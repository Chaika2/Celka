/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.Ps_1;
import celestial.rK_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BB
extends rK_2 {
    private static short[] id_break;

    @Override
    public PX id_byte() {
        return ((Ps_1)this.id_class[id_break[0]]).id_protected();
    }

    public BB(Ps_1 ps_1) {
        super(ps_1);
    }

    static {
        BB.id_protected();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDDCB847ED958112BL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-58, -35, -22, 89, -98, -40, -108, -95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA8E14C7A;
    }

    private static void id_protected() {
        id_break = new short[1];
    }
}

