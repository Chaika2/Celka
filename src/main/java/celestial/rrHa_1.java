/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHa_1 {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        id_byte = new short[2];
    }

    public rrHa_1(String string) {
        this.id_protected();
        String string2 = string;
        this.id_class[rrHa_1.id_byte[1]] = string2;
    }

    static {
        rrHa_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x16050C3087E9B52EL;
    }

    public String id_class() {
        return (String)this.id_class[id_byte[0]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7F8087A7;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-13, -97, 116, 65, 33, -118, 48, -27}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrHa_1.id_break();
        rrHa_1.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }
}

