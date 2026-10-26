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

public class rrcy_3 {
    private static short[] id_break;
    private static boolean[] id_byte;
    private static byte[] id_protected;
    public Object[] id_class;

    private static void id_byte() {
        id_protected = new byte[]{2};
    }

    public rrcy_3(int n) {
        this.id_case();
        Integer n2 = n;
        this.id_class[rrcy_3.id_break[3]] = n2;
    }

    static {
        rrcy_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x69D9464B488E0BC4L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{10, -65, 69, -26, -66, -29, -56, -127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public int id_class() {
        return (Integer)this.id_class[id_break[1]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9315F664;
    }

    public rrcy_3 id_class(Predicate<rJY> predicate) {
        Predicate<rJY> predicate2;
        this.id_class[rrcy_3.id_break[0]] = predicate2 = predicate;
        return this;
    }

    public Predicate<rJY> id_break() {
        return (Predicate)this.id_class[id_break[2]];
    }

    private static void id_throws() {
        id_byte = new boolean[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrcy_3.id_throws();
        rrcy_3.id_protected();
        rrcy_3.id_byte();
    }

    private void id_case() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[0]];
            objectArray[rrcy_3.id_byte[0]] = id_byte[1];
        }
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[0] = 1;
        sArray[2] = 1;
        id_break = sArray;
    }
}

