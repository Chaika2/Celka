/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bs_1;
import celestial.PX;
import celestial.rrTj_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BS
implements rrTj_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public BS(PX pX, boolean bl) {
        this.id_byte();
        PX pX2 = pX;
        this.id_class[BS.id_break[0]] = pX2;
        Bs_1 bs_1 = Bs_1.id_class(bl);
        this.id_class[BS.id_break[1]] = bs_1;
    }

    static {
        BS.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF419271F;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-85, -85, 85, 59, -118, -84, 56, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[2];
        sArray[1] = 1;
        id_break = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1189308119147681L;
    }

    private static void id_break() {
        id_byte = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        BS.id_class();
        BS.id_break();
    }
}

