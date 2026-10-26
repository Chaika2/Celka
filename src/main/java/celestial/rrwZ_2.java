/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrwu_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwZ_2 {
    private static short[] id_break;
    public static Object[] id_class;
    private static String[] id_byte;
    private static byte[] id_protected;
    private static boolean[] id_throws;

    private static void id_byte() {
        id_byte = new String[]{new String("none")};
    }

    static {
        rrwZ_2.ntfClinit();
    }

    public static String id_class() {
        return ((rrwu_3)rrwZ_2.id_class[rrwZ_2.id_break[0]]).id_break.isEmpty() ? id_byte[0] : ((rrwu_3)id_class[id_break[1]]).id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7674CD7B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x503E1C01279EEB3BL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-71, -6, 81, -43, 10, 2, -15, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray = new Object[4];
        objectArray[0] = false;
        objectArray[1] = new rrwu_3();
        objectArray[2] = new rrwu_3();
        id_class = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[2] = true;
        id_throws = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrwZ_2.id_throws();
        rrwZ_2.id_byte();
        rrwZ_2.id_protected();
        rrwZ_2.id_case();
        rrwZ_2.id_break();
    }

    private static void id_case() {
        id_protected = new byte[]{2, 4};
    }

    private static void id_protected() {
        id_break = new short[]{2, 2};
    }
}

