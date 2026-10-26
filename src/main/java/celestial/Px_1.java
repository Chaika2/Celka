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

public class Px_1 {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public Px_1(PX pX, rjG_2 rjG_22) {
        this.id_protected();
        PX pX2 = pX;
        this.id_class[Px_1.id_break[2]] = pX2;
        rjG_2 rjG_23 = rjG_22;
        this.id_class[Px_1.id_break[3]] = rjG_23;
    }

    static {
        Px_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4A0B52A1;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-52, -102, 2, -114, -100, -46, -52, 82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public PX id_class() {
        return (PX)this.id_class[id_break[0]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE422B433AB3E53BAL;
    }

    public rjG_2 id_break() {
        return (rjG_2)this.id_class[id_break[1]];
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Px_1.id_throws();
        Px_1.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }
}

