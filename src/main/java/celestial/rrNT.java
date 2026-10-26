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

public class rrNT
implements rrNV {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    private static void id_byte() {
        id_byte = new short[2];
    }

    public rrNT(rgP_2 rgP_22) {
        this.id_break();
        rgP_2 rgP_23 = rgP_22;
        this.id_class[rrNT.id_byte[1]] = rgP_23;
    }

    static {
        rrNT.ntfClinit();
    }

    @Override
    public rgP_2 id_class() {
        return (rgP_2)this.id_class[id_byte[0]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{51, -91, 119, -67, -122, -37, 41, 41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC81C7249;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE0B51CA905641D6EL;
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrNT.id_protected();
        rrNT.id_byte();
    }

    private static void id_protected() {
        id_break = new boolean[]{true};
    }
}

