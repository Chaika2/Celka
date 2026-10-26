/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJY;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcn_3 {
    private static short[] id_break;
    public Object[] id_class;
    private static byte[] id_byte;
    private static boolean[] id_protected;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[0] = 1;
        sArray[2] = 1;
        id_break = sArray;
    }

    public rrcn_3(int n) {
        this.id_case();
        Integer n2 = n;
        this.id_class[rrcn_3.id_break[3]] = n2;
    }

    static {
        rrcn_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x62B971BAC6E36E1DL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF95F278;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{23, -94, 78, -61, -49, 101, -76, 81}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrcn_3 id_class(Predicate<rJY> predicate) {
        Predicate<rJY> predicate2;
        this.id_class[rrcn_3.id_break[0]] = predicate2 = predicate;
        return this;
    }

    public Predicate<rJY> id_class() {
        return (Predicate)this.id_class[id_break[2]];
    }

    public int id_break() {
        return (Integer)this.id_class[id_break[1]];
    }

    private static void id_throws() {
        id_protected = new boolean[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrcn_3.id_throws();
        rrcn_3.id_byte();
        rrcn_3.id_protected();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
            objectArray[rrcn_3.id_protected[0]] = id_protected[1];
        }
    }

    private static void id_protected() {
        id_byte = new byte[]{2};
    }
}

