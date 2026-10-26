/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvN {
    public Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_break = new short[2];
    }

    public rrvN(String string) {
        this.id_break();
        String string2 = string;
        this.id_class[rrvN.id_break[0]] = string2;
    }

    static {
        rrvN.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4E7AE490;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-79, -30, 25, -65, -90, -39, 11, -86}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDBEA3DDF52B38AFL;
    }

    public String id_class() {
        return (String)this.id_class[id_break[1]];
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrvN.id_protected();
        rrvN.id_byte();
    }

    private static void id_protected() {
        id_byte = new boolean[]{true};
    }
}

