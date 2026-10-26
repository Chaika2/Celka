/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjx_3 {
    public Object[] id_break;
    private static boolean[] id_class;
    private static short[] id_byte;
    private static byte[] id_protected;

    public String[] id_byte() {
        return (String[])this.id_break[id_byte[2]];
    }

    public rrjx_3(String[] stringArray, int n) {
        String[] stringArray2;
        this.id_case();
        this.id_break[rrjx_3.id_byte[4]] = stringArray2 = stringArray;
        Integer n2 = n;
        this.id_break[rrjx_3.id_byte[5]] = n2;
    }

    static {
        rrjx_3.ntfClinit();
    }

    public String toString() {
        return "Server{names=" + this.id_class() + ", number=" + (Integer)this.id_break[id_byte[1]] + "}";
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAB9CF51A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC9F0D48750ABF24EL;
    }

    public String id_class() {
        return ((String[])this.id_break[id_byte[0]])[id_class[0]];
    }

    public int id_break() {
        return (Integer)this.id_break[id_byte[3]];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{32, 96, 54, 117, 98, -56, 92, 96}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_protected = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjx_3.id_catch();
        rrjx_3.id_protected();
        rrjx_3.id_throws();
    }

    private static void id_catch() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        id_class = blArray;
    }

    private void id_case() {
        if (this.id_break == null) {
            this.id_break = new Object[2];
            this.id_break[1] = 0;
        }
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[1] = 1;
        sArray[3] = 1;
        sArray[5] = 1;
        id_byte = sArray;
    }
}

