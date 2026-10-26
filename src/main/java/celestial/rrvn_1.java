/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rruz_1;
import celestial.rrvC;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrvn_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;

    private static void id_byte() {
        id_byte = new byte[]{2};
    }

    public rrvn_1(rruz_1 rruz_12, List<rrvC> list) {
        List<rrvC> list2;
        this.id_protected();
        rruz_1 rruz_13 = rruz_12;
        this.id_class[rrvn_1.id_break[0]] = rruz_13;
        this.id_class[rrvn_1.id_break[1]] = list2 = list;
    }

    static {
        rrvn_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x59C05E47F6092E78L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1DBE6083;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{107, 117, 94, -44, 73, -82, -17, -84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public List<rrvC> id_class() {
        return (List)this.id_class[id_break[3]];
    }

    public rruz_1 id_break() {
        return (rruz_1)this.id_class[id_break[2]];
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[1] = 1;
        sArray[3] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrvn_1.id_throws();
        rrvn_1.id_byte();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }
}

