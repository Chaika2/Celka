/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class I {
    private static boolean[] id_byte;
    public Object[] id_class;
    public static Object[] id_break;
    private static short[] id_protected;

    private static void id_byte() {
        Object[] objectArray = new Object[]{new I()};
        id_break = objectArray;
    }

    public I() {
        this.id_throws();
    }

    static {
        I.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD844DE4A;
    }

    public Boolean id_class() {
        return (Boolean)this.id_class[id_protected[3]];
    }

    public void id_class(Boolean bl) {
        Boolean bl2 = bl;
        this.id_class[I.id_protected[4]] = bl2;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-79, -108, -87, 33, 57, -90, -32, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB5E1E6E665259D01L;
    }

    public static I id_break(Boolean bl) {
        Boolean bl2 = bl;
        ((I)I.id_break[I.id_protected[0]]).id_class[I.id_protected[1]] = bl2;
        return (I)id_break[id_protected[2]];
    }

    private static void id_break() {
        id_protected = new short[5];
    }

    private void id_throws() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[1]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        I.id_protected();
        I.id_break();
        I.id_byte();
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[3];
        blArray[1] = true;
        blArray[2] = true;
        id_byte = blArray;
    }
}

