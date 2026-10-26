/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rC_2;
import celestial.rP_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rn_3 {
    public Object[] id_class;
    private static short[] id_break;
    private static byte[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public rn_3(rP_2 rP_22, rC_2 rC_22) {
        this.id_byte();
        Objects.requireNonNull(rC_22);
        rP_2 rP_23 = rP_22;
        this.id_class[rn_3.id_break[0]] = rP_23;
        rC_2 rC_23 = rC_22;
        this.id_class[rn_3.id_break[1]] = rC_23;
    }

    static {
        rn_3.ntfClinit();
    }

    public String toString() {
        return (rC_2)((Object)this.id_class[id_break[2]]) + " " + (rP_2)this.id_class[id_break[3]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1DA81FD5791E1C94L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-59, 12, 124, -4, -114, -56, 63, -22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7FA261F;
    }

    public rP_2 id_class() {
        return (rP_2)this.id_class[id_break[4]];
    }

    public rC_2 id_break() {
        return (rC_2)((Object)this.id_class[id_break[5]]);
    }

    private static void id_throws() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[5] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rn_3.id_throws();
        rn_3.id_protected();
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

