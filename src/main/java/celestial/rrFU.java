/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_break;
import celestial.rrQX;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFU {
    private static short[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;

    private static void id_byte() {
        id_break = new short[3];
    }

    static {
        rrFU.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEAE70420A26C6EE3L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBADBAC9A;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-35, 90, 50, -67, 102, 40, -48, -49}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_class() {
        rrFU rrFU2 = rrFU.id_protected();
        ((rrQX)rrQX.staticFields09f1f28026cd378cb9df490a64ac8f2a[id_break[1]]).id_finally().id_class(rrFU2);
        ((C_break)C_break.staticFieldsf9703d96375232b196815afd59d1eb48[id_break[2]]).id_class(rrFU2);
    }

    private static void id_break() {
        Object[] objectArray = new Object[]{new rrFU()};
        id_class = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFU.id_throws();
        rrFU.id_byte();
        rrFU.id_break();
    }

    private static rrFU id_protected() {
        return (rrFU)id_class[id_break[0]];
    }
}

