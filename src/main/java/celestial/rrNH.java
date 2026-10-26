/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rrNV;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNH
implements rrNV {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public rrNH(rgP_2 rgP_22) {
        this.id_byte();
        rgP_2 rgP_23 = rgP_22;
        this.id_class[rrNH.id_byte[1]] = rgP_23;
    }

    static {
        rrNH.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE1565FBCF2981486L;
    }

    @Override
    public rgP_2 id_class() {
        return (rgP_2)this.id_class[id_byte[0]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9D255591;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{19, -27, -44, -85, 109, -53, -49, 11}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrNH.id_protected();
        rrNH.id_break();
    }

    private static void id_protected() {
        id_break = new boolean[]{true};
    }
}

