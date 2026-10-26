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

public class rrnm_3 {
    private static boolean[] id_byte;
    private static short[] id_protected;
    public Object[] id_class;
    public static Object[] id_break;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    public rrnm_3() {
        this.id_byte();
    }

    static {
        rrnm_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7BFAD288;
    }

    public rYB id_class() {
        return (rYB)this.id_class[id_protected[3]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{75, -45, 95, -88, -14, 72, 91, -114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1420ED7B13DAA420L;
    }

    public static rrnm_3 id_class(rYB rYB2) {
        rYB rYB3 = rYB2;
        ((rrnm_3)rrnm_3.id_break[rrnm_3.id_protected[0]]).id_class[rrnm_3.id_protected[1]] = rYB3;
        return (rrnm_3)id_break[id_protected[2]];
    }

    private static void id_break() {
        id_protected = new short[4];
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrnm_3()};
        id_break = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnm_3.id_protected();
        rrnm_3.id_break();
        rrnm_3.id_throws();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }
}

