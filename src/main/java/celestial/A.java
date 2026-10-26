/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.n_1;
import celestial.rfH_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class A {
    private static byte[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public A(rfH_2 rfH_22, n_1 n_12) {
        this.id_byte();
        rfH_2 rfH_23 = rfH_22;
        this.id_class[A.id_byte[0]] = rfH_23;
        n_1 n_13 = n_12;
        this.id_class[A.id_byte[1]] = n_13;
    }

    static {
        A.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA40300F3A56F1C7FL;
    }

    public n_1 id_class() {
        return (n_1)((Object)this.id_class[id_byte[3]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{117, -119, 45, 30, -92, -88, -36, 0}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x812DD1F3;
    }

    public rfH_2 id_break() {
        return (rfH_2)this.id_class[id_byte[2]];
    }

    private static void id_throws() {
        id_break = new byte[]{2};
    }

    private static /* synthetic */ void ntfClinit() {
        A.id_protected();
        A.id_throws();
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_byte = sArray;
    }
}

