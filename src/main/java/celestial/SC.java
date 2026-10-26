/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class SC {
    private static boolean[] id_class;
    public Object[] id_break;
    private static short[] id_byte;

    public String id_byte() {
        return (String)this.id_break[id_byte[0]];
    }

    public SC(String string) {
        this.id_class();
        String string2 = string;
        this.id_break[SC.id_byte[1]] = string2;
    }

    static {
        SC.ntfClinit();
    }

    private void id_class() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_class[0]];
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB96468DA;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x86AB7C345EB0221FL;
    }

    public abstract int id_break();

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-119, 113, -47, 104, 89, 3, -9, 113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_byte = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        SC.id_protected();
        SC.id_throws();
    }

    private static void id_protected() {
        id_class = new boolean[]{true};
    }
}

