/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.PX;
import celestial.rjG_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTq_1 {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_byte = sArray;
    }

    public rrTq_1(rjG_2 rjG_22, PX pX) {
        this.id_throws();
        rjG_2 rjG_23 = rjG_22;
        this.id_class[rrTq_1.id_byte[2]] = rjG_23;
        PX pX2 = pX;
        this.id_class[rrTq_1.id_byte[3]] = pX2;
    }

    static {
        rrTq_1.ntfClinit();
    }

    public rjG_2 id_class() {
        return (rjG_2)this.id_class[id_byte[0]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE2E636B5;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFBBDCFAA2D13E3B8L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-120, 104, -52, -83, -59, 119, 91, 5}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public PX id_break() {
        return (PX)this.id_class[id_byte[1]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrTq_1.id_byte();
        rrTq_1.id_protected();
    }

    private static void id_protected() {
        id_break = new byte[]{2};
    }
}

