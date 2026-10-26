/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bm_3
extends Enum<bm_3> {
    public static Object[] staticFields25d9569e4235359b81fd7f84865d53c7;
    private static String[] strings25d9569e4235359b81fd7f84865d53c7;
    private static byte[] bytes25d9569e4235359b81fd7f84865d53c7;
    private static boolean[] booleans25d9569e4235359b81fd7f84865d53c7;
    private static short[] shorts25d9569e4235359b81fd7f84865d53c7;

    private static /* synthetic */ bm_3[] id_byte() {
        bm_3[] bm_3Array = new bm_3[bytes25d9569e4235359b81fd7f84865d53c7[0]];
        bm_3Array[bm_3.booleans25d9569e4235359b81fd7f84865d53c7[0]] = (bm_3)((Object)staticFields25d9569e4235359b81fd7f84865d53c7[shorts25d9569e4235359b81fd7f84865d53c7[1]]);
        bm_3Array[bm_3.booleans25d9569e4235359b81fd7f84865d53c7[1]] = (bm_3)((Object)staticFields25d9569e4235359b81fd7f84865d53c7[shorts25d9569e4235359b81fd7f84865d53c7[2]]);
        bm_3Array[bm_3.bytes25d9569e4235359b81fd7f84865d53c7[1]] = (bm_3)((Object)staticFields25d9569e4235359b81fd7f84865d53c7[shorts25d9569e4235359b81fd7f84865d53c7[3]]);
        return bm_3Array;
    }

    static {
        bm_3.ntfClinit();
    }

    public static bm_3[] values() {
        return (bm_3[])((bm_3[])staticFields25d9569e4235359b81fd7f84865d53c7[shorts25d9569e4235359b81fd7f84865d53c7[0]]).clone();
    }

    public static bm_3 valueOf(String string) {
        return Enum.valueOf(bm_3.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x77AB60EA8394BF89L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-128, 65, -91, -117, -103, 34, -115, -89}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x95253381;
    }

    private static void id_class() {
        bytes25d9569e4235359b81fd7f84865d53c7 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new bm_3(), new bm_3(), new bm_3(), new bm_3[]{(bm_3)((Object)objectArray[0]), (bm_3)((Object)objectArray[1]), (bm_3)((Object)objectArray[2])}};
        staticFields25d9569e4235359b81fd7f84865d53c7 = objectArray;
    }

    private static void id_throws() {
        strings25d9569e4235359b81fd7f84865d53c7 = new String[]{new String("SELECTED_IN_HOTBAR"), new String("SELECTED_IN_INVENTORY"), new String("NOT_SELECTED")};
    }

    private static /* synthetic */ void ntfClinit() {
        bm_3.id_protected();
        bm_3.id_throws();
        bm_3.id_case();
        bm_3.id_class();
        bm_3.id_break();
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts25d9569e4235359b81fd7f84865d53c7 = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans25d9569e4235359b81fd7f84865d53c7 = blArray;
    }
}

