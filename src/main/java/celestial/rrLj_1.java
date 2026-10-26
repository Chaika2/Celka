/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLj_1 {
    private static boolean[] id_byte;
    public static Object[] id_class;
    private static short[] id_protected;
    private static byte[] id_throws;
    public Object[] id_break;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrLj_1()};
        id_class = objectArray;
    }

    public rrLj_1() {
        this.id_case();
    }

    static {
        rrLj_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-41, 83, -86, -12, -104, 101, 24, -85}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrLj_1 id_class(boolean bl, boolean bl2) {
        Boolean bl3 = bl;
        ((rrLj_1)rrLj_1.id_class[rrLj_1.id_protected[0]]).id_break[rrLj_1.id_protected[1]] = bl3;
        Boolean bl4 = bl2;
        ((rrLj_1)rrLj_1.id_class[rrLj_1.id_protected[2]]).id_break[rrLj_1.id_protected[3]] = bl4;
        return (rrLj_1)id_class[id_protected[4]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2A4EFC49FA063864L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x879D36BB;
    }

    public boolean id_class() {
        return (Boolean)this.id_break[id_protected[6]];
    }

    public boolean id_break() {
        return (Boolean)this.id_break[id_protected[5]];
    }

    private static void id_throws() {
        short[] sArray = new short[7];
        sArray[3] = 1;
        sArray[6] = 1;
        id_protected = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLj_1.id_protected();
        rrLj_1.id_throws();
        rrLj_1.id_catch();
        rrLj_1.id_byte();
    }

    private static void id_catch() {
        id_throws = new byte[]{2};
    }

    private void id_case() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[0]];
            objectArray[rrLj_1.id_byte[1]] = id_byte[2];
            objectArray[rrLj_1.id_byte[3]] = id_byte[4];
        }
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[3] = true;
        blArray[5] = true;
        id_byte = blArray;
    }
}

