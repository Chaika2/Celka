/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.BQ;
import celestial.BW;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bz_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;

    private static void id_byte() {
        short[] sArray = new short[2];
        sArray[1] = 1;
        id_break = sArray;
    }

    public Bz_1(BQ bQ, BW bW) {
        this.id_break();
        BQ bQ2 = bQ;
        this.id_class[Bz_1.id_break[0]] = bQ2;
        BW bW2 = bW;
        this.id_class[Bz_1.id_break[1]] = bW2;
    }

    static {
        Bz_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5ACBDCFE;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2C9E7F35C0DF2B0L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-36, -8, 56, -108, -97, 80, -40, -66}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_byte = new byte[]{2};
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Bz_1.id_byte();
        Bz_1.id_class();
    }
}

