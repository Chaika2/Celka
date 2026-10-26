/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Y;
import celestial.gm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class g_1 {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public g_1(gm_3 gm_32, Y y) {
        this.id_throws();
        gm_3 gm_33 = gm_32;
        this.id_class[g_1.id_break[0]] = gm_33;
        Y y2 = y;
        this.id_class[g_1.id_break[1]] = y2;
    }

    static {
        g_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB6F7685E6D8EC0D6L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-4, -106, 1, -55, -128, 124, -125, -30}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9FF3A8AD;
    }

    public gm_3 id_class() {
        return (gm_3)this.id_class[id_break[2]];
    }

    public Y id_break() {
        return (Y)((Object)this.id_class[id_break[3]]);
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        g_1.id_protected();
        g_1.id_byte();
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }
}

