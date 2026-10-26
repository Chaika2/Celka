/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryk_1 {
    public Object[] id_class;
    private static byte[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_byte = blArray;
    }

    public rryk_1(String string, String string2) {
        this.id_protected();
        String string3 = string;
        this.id_class[rryk_1.id_protected[2]] = string3;
        String string4 = string2;
        this.id_class[rryk_1.id_protected[3]] = string4;
    }

    static {
        rryk_1.ntfClinit();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return id_byte[0];
        }
        if (!(object instanceof rryk_1)) {
            return id_byte[1];
        }
        rryk_1 rryk_12 = (rryk_1)object;
        return Objects.equals(this.id_break(), rryk_12.id_break());
    }

    public int hashCode() {
        return Objects.hashCode(this.id_break());
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA8BFC521B89DA7A6L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-113, -105, -91, -79, 115, 7, 3, 26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x78A615F0;
    }

    public String id_class() {
        return (String)this.id_class[id_protected[1]];
    }

    public String id_break() {
        return (String)this.id_class[id_protected[0]];
    }

    private static void id_throws() {
        id_break = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        rryk_1.id_byte();
        rryk_1.id_case();
        rryk_1.id_throws();
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_protected = sArray;
    }

    private void id_protected() {
        if (this.id_class == null) {
            this.id_class = new Object[2];
        }
    }
}

