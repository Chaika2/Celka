/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Om_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAh_1
extends Om_1 {
    public static Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    static {
        rrAh_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE410084;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{124, 123, -18, 44, -118, 5, 55, 91}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD7D1387CB6BD6665L;
    }

    public static rrAh_1 id_class() {
        ((rrAh_1)id_class[id_break[0]]).id_class(id_byte[0]);
        return (rrAh_1)id_class[id_break[1]];
    }

    private static void id_break() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    private static void id_throws() {
        Object[] objectArray = new Object[]{new rrAh_1()};
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAh_1.id_break();
        rrAh_1.id_protected();
        rrAh_1.id_throws();
    }

    private static void id_protected() {
        id_break = new short[2];
    }
}

