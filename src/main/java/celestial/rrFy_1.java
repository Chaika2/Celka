/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aw_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFy_1 {
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;
    public Object[] id_break;
    private static short[] id_throws;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    public rrFy_1() {
        this.id_protected();
    }

    static {
        rrFy_1.ntfClinit();
    }

    public static rrFy_1 id_class(Aw_1 aw_1, Set<String> set) {
        Set<String> set2;
        Aw_1 aw_12 = aw_1;
        ((rrFy_1)rrFy_1.id_class[rrFy_1.id_throws[0]]).id_break[rrFy_1.id_throws[1]] = aw_12;
        ((rrFy_1)rrFy_1.id_class[rrFy_1.id_throws[2]]).id_break[rrFy_1.id_throws[3]] = set2 = set;
        return (rrFy_1)id_class[id_throws[4]];
    }

    public Aw_1 id_class() {
        return (Aw_1)this.id_break[id_throws[5]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{83, -110, -82, 83, -83, -117, -6, -72}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5E06732B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD6DD84AE65744E30L;
    }

    public Set<String> id_break() {
        return (Set)this.id_break[id_throws[6]];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrFy_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFy_1.id_byte();
        rrFy_1.id_case();
        rrFy_1.id_catch();
        rrFy_1.id_throws();
    }

    private static void id_catch() {
        id_byte = new byte[]{2};
    }

    private static void id_case() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_throws = sArray;
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_byte[0]];
        }
    }
}

