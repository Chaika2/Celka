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

public class rrNq_1
implements rrNV {
    public Object[] id_class;
    private static byte[] id_break;
    private static short[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public rrNq_1(rgP_2 rgP_22, String string) {
        this.id_byte();
        rgP_2 rgP_23 = rgP_22;
        this.id_class[rrNq_1.id_byte[2]] = rgP_23;
        String string2 = string;
        this.id_class[rrNq_1.id_byte[3]] = string2;
    }

    static {
        rrNq_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCBAA9424;
    }

    @Override
    public rgP_2 id_class() {
        return (rgP_2)this.id_class[id_byte[0]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{58, 2, 88, -106, -54, -127, -53, 26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x83D75B96E1E6981L;
    }

    public String id_break() {
        return (String)this.id_class[id_byte[1]];
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNq_1.id_throws();
        rrNq_1.id_protected();
    }

    private static void id_protected() {
        id_break = new byte[]{2};
    }
}

