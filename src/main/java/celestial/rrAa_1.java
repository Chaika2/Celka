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

public class rrAa_1
extends Om_1 {
    public static Object[] id_class;
    private static short[] id_break;
    private static boolean[] id_byte;

    static {
        rrAa_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{97, -60, 111, 13, 68, 116, 85, 52}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9A33504A;
    }

    public static rrAa_1 id_class() {
        ((rrAa_1)id_class[id_break[0]]).id_class(id_byte[0]);
        return (rrAa_1)id_class[id_break[1]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x956E4A174420ACFL;
    }

    private static void id_break() {
        id_break = new short[2];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[3];
        blArray[2] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAa_1.id_throws();
        rrAa_1.id_break();
        rrAa_1.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[]{new rrAa_1()};
        id_class = objectArray;
    }
}

