/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFf_1 {
    private static short[] id_byte;
    private static boolean[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;

    private static void id_byte() {
        id_byte = new short[4];
    }

    public rrFf_1() {
        this.id_throws();
    }

    static {
        rrFf_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA31CE7A47B639782L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x228832EE;
    }

    public static rrFf_1 id_class(an_3 an_32) {
        an_3 an_33 = an_32;
        ((rrFf_1)rrFf_1.id_break[rrFf_1.id_byte[0]]).id_class[rrFf_1.id_byte[1]] = an_33;
        return (rrFf_1)id_break[id_byte[2]];
    }

    public an_3 id_class() {
        return (an_3)this.id_class[id_byte[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{91, -112, -73, 26, 107, -15, 59, 18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_protected = blArray;
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_protected[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrFf_1.id_break();
        rrFf_1.id_byte();
        rrFf_1.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrFf_1()};
        id_break = objectArray;
    }
}

