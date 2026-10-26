/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvQ {
    private static byte[] id_break;
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;

    public String id_byte() {
        return (String)this.id_class[id_byte[4]];
    }

    public rrvQ(String string, String string2, boolean bl) {
        this.id_protected();
        String string3 = string;
        this.id_class[rrvQ.id_byte[0]] = string3;
        String string4 = string2;
        this.id_class[rrvQ.id_byte[1]] = string4;
        Boolean bl2 = bl;
        this.id_class[rrvQ.id_byte[2]] = bl2;
    }

    static {
        rrvQ.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5D66B620;
    }

    private static void id_class() {
        id_protected = new boolean[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{18, 71, 112, 109, -22, 72, 21, -36}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDC7B9F36CF043958L;
    }

    private static void id_break() {
        id_break = new byte[]{3, 2};
    }

    private static void id_throws() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[2] = 2;
        sArray[4] = 1;
        sArray[5] = 2;
        id_byte = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvQ.id_class();
        rrvQ.id_throws();
        rrvQ.id_break();
    }

    public boolean id_catch() {
        return (Boolean)this.id_class[id_byte[5]];
    }

    public String id_case() {
        return (String)this.id_class[id_byte[3]];
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
            objectArray[rrvQ.id_break[1]] = id_protected[0];
        }
    }
}

