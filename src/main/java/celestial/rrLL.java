/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import celestial.rgP_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLL {
    private static short[] id_byte;
    public static Object[] id_class;
    private static byte[] id_protected;
    private static boolean[] id_throws;
    public Object[] id_break;

    private static void id_byte() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_byte = sArray;
    }

    public rrLL() {
        this.id_protected();
    }

    static {
        rrLL.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-56, -123, -90, -57, 2, -6, 22, 26}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFB86341331F0DC9CL;
    }

    public static rrLL id_class(Aw_1 aw_1, rgP_2 rgP_22) {
        Aw_1 aw_12 = aw_1;
        ((rrLL)rrLL.id_class[rrLL.id_byte[0]]).id_break[rrLL.id_byte[1]] = aw_12;
        rgP_2 rgP_23 = rgP_22;
        ((rrLL)rrLL.id_class[rrLL.id_byte[2]]).id_break[rrLL.id_byte[3]] = rgP_23;
        return (rrLL)id_class[id_byte[4]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC084FBC5;
    }

    public rgP_2 id_class() {
        return (rgP_2)this.id_break[id_byte[6]];
    }

    public Aw_1 id_break() {
        return (Aw_1)this.id_break[id_byte[5]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrLL()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLL.id_case();
        rrLL.id_byte();
        rrLL.id_catch();
        rrLL.id_throws();
    }

    private static void id_catch() {
        id_protected = new byte[]{2};
    }

    private static void id_case() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_throws = blArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_protected[0]];
        }
    }
}

