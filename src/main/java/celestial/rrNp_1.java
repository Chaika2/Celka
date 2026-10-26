/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rrNC;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNp_1
implements rrNC {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }

    public rrNp_1(rgP_2 rgP_22, String string) {
        this.id_throws();
        rgP_2 rgP_23 = rgP_22;
        this.id_class[rrNp_1.id_break[2]] = rgP_23;
        String string2 = string;
        this.id_class[rrNp_1.id_break[3]] = string2;
    }

    static {
        rrNp_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB00CC3BB;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x93E8F2B487B9779FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-120, -114, 1, -64, 12, -47, -56, -94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rgP_2 id_class() {
        return (rgP_2)this.id_class[id_break[0]];
    }

    public String id_break() {
        return (String)this.id_class[id_break[1]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrNp_1.id_byte();
        rrNp_1.id_protected();
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

