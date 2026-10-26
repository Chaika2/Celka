/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rruQ;
import celestial.rruv_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvC {
    private static short[] id_break;
    private static byte[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        id_break = sArray;
    }

    public rrvC(rruQ rruQ2) {
        this.id_throws();
        rruv_1 rruv_12 = (rruv_1)rruv_1.id_class[id_break[0]];
        this.id_class[rrvC.id_break[1]] = rruv_12;
        rruQ rruQ3 = rruQ2;
        this.id_class[rrvC.id_break[2]] = rruQ3;
    }

    static {
        rrvC.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA99881C5;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-20, -98, -1, -114, -127, -87, -106, 12}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x842ECCD74E366D28L;
    }

    public void id_class(rruv_1 rruv_12) {
        rruv_1 rruv_13 = rruv_12;
        this.id_class[rrvC.id_break[3]] = rruv_13;
    }

    public rruv_1 id_class() {
        return (rruv_1)this.id_class[id_break[5]];
    }

    public rruQ id_break() {
        return (rruQ)this.id_class[id_break[4]];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrvC.id_byte();
        rrvC.id_protected();
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

