/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnu_3 {
    public Object[] id_class;
    public static Object[] id_break;
    private static boolean[] id_byte;
    private static short[] id_protected;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new rrnu_3()};
        id_break = objectArray;
    }

    public rrnu_3() {
        this.id_break();
    }

    static {
        rrnu_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDABBE643;
    }

    public rYB id_class() {
        return (rYB)this.id_class[id_protected[3]];
    }

    public static rrnu_3 id_class(rYB rYB2) {
        rYB rYB3 = rYB2;
        ((rrnu_3)rrnu_3.id_break[rrnu_3.id_protected[0]]).id_class[rrnu_3.id_protected[1]] = rYB3;
        return (rrnu_3)id_break[id_protected[2]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x483BF5A65E7DF35CL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-73, -43, 121, -33, -59, -71, -121, 0}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnu_3.id_throws();
        rrnu_3.id_protected();
        rrnu_3.id_byte();
    }

    private static void id_protected() {
        id_protected = new short[4];
    }
}

