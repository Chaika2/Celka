/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfB_2
extends Enum<rrfB_2> {
    private static byte[] bytesfc18f9297f253886af5bb346ef27734e;
    public static Object[] staticFieldsfc18f9297f253886af5bb346ef27734e;
    private static boolean[] booleansfc18f9297f253886af5bb346ef27734e;
    private static String[] stringsfc18f9297f253886af5bb346ef27734e;
    private static short[] shortsfc18f9297f253886af5bb346ef27734e;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsfc18f9297f253886af5bb346ef27734e = sArray;
    }

    static {
        rrfB_2.ntfClinit();
    }

    public static rrfB_2[] values() {
        return (rrfB_2[])((rrfB_2[])staticFieldsfc18f9297f253886af5bb346ef27734e[shortsfc18f9297f253886af5bb346ef27734e[0]]).clone();
    }

    public static rrfB_2 valueOf(String string) {
        return Enum.valueOf(rrfB_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD4D774CC;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8B6E7AE9B7D9F7BCL;
    }

    private static void id_class() {
        bytesfc18f9297f253886af5bb346ef27734e = new byte[]{3, 2, 2, 2, 3, 4};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{93, 68, -107, -106, -27, 73, -90, 83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rrfB_2(), new rrfB_2(), new rrfB_2(), new rrfB_2[]{(rrfB_2)((Object)objectArray[0]), (rrfB_2)((Object)objectArray[1]), (rrfB_2)((Object)objectArray[2])}};
        staticFieldsfc18f9297f253886af5bb346ef27734e = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansfc18f9297f253886af5bb346ef27734e = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrfB_2.id_throws();
        rrfB_2.id_case();
        rrfB_2.id_byte();
        rrfB_2.id_class();
        rrfB_2.id_break();
    }

    private static void id_case() {
        stringsfc18f9297f253886af5bb346ef27734e = new String[]{new String("DEFAULT"), new String("DEFAULT_MOREPACKETS"), new String("TO_PLAYER")};
    }

    private static /* synthetic */ rrfB_2[] id_protected() {
        rrfB_2[] rrfB_2Array = new rrfB_2[bytesfc18f9297f253886af5bb346ef27734e[0]];
        rrfB_2Array[rrfB_2.booleansfc18f9297f253886af5bb346ef27734e[0]] = (rrfB_2)((Object)staticFieldsfc18f9297f253886af5bb346ef27734e[shortsfc18f9297f253886af5bb346ef27734e[1]]);
        rrfB_2Array[rrfB_2.booleansfc18f9297f253886af5bb346ef27734e[1]] = (rrfB_2)((Object)staticFieldsfc18f9297f253886af5bb346ef27734e[shortsfc18f9297f253886af5bb346ef27734e[2]]);
        rrfB_2Array[rrfB_2.bytesfc18f9297f253886af5bb346ef27734e[1]] = (rrfB_2)((Object)staticFieldsfc18f9297f253886af5bb346ef27734e[shortsfc18f9297f253886af5bb346ef27734e[3]]);
        return rrfB_2Array;
    }
}

