/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryj_1
extends Enum<rryj_1> {
    private static byte[] bytes0ba82fb5ac3130929eb6fe12cd822ba8;
    private static short[] shorts0ba82fb5ac3130929eb6fe12cd822ba8;
    public static Object[] staticFields0ba82fb5ac3130929eb6fe12cd822ba8;
    private static boolean[] booleans0ba82fb5ac3130929eb6fe12cd822ba8;
    private static String[] strings0ba82fb5ac3130929eb6fe12cd822ba8;

    private static /* synthetic */ rryj_1[] id_byte() {
        rryj_1[] rryj_1Array = new rryj_1[bytes0ba82fb5ac3130929eb6fe12cd822ba8[0]];
        rryj_1Array[rryj_1.booleans0ba82fb5ac3130929eb6fe12cd822ba8[0]] = (rryj_1)((Object)staticFields0ba82fb5ac3130929eb6fe12cd822ba8[shorts0ba82fb5ac3130929eb6fe12cd822ba8[1]]);
        rryj_1Array[rryj_1.booleans0ba82fb5ac3130929eb6fe12cd822ba8[1]] = (rryj_1)((Object)staticFields0ba82fb5ac3130929eb6fe12cd822ba8[shorts0ba82fb5ac3130929eb6fe12cd822ba8[2]]);
        rryj_1Array[rryj_1.bytes0ba82fb5ac3130929eb6fe12cd822ba8[1]] = (rryj_1)((Object)staticFields0ba82fb5ac3130929eb6fe12cd822ba8[shorts0ba82fb5ac3130929eb6fe12cd822ba8[3]]);
        rryj_1Array[rryj_1.bytes0ba82fb5ac3130929eb6fe12cd822ba8[2]] = (rryj_1)((Object)staticFields0ba82fb5ac3130929eb6fe12cd822ba8[shorts0ba82fb5ac3130929eb6fe12cd822ba8[4]]);
        return rryj_1Array;
    }

    static {
        rryj_1.ntfClinit();
    }

    public static rryj_1[] values() {
        return (rryj_1[])((rryj_1[])staticFields0ba82fb5ac3130929eb6fe12cd822ba8[shorts0ba82fb5ac3130929eb6fe12cd822ba8[0]]).clone();
    }

    public static rryj_1 valueOf(String string) {
        return Enum.valueOf(rryj_1.class, string);
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rryj_1(), new rryj_1(), new rryj_1(), new rryj_1(), new rryj_1[]{(rryj_1)((Object)objectArray[0]), (rryj_1)((Object)objectArray[1]), (rryj_1)((Object)objectArray[2]), (rryj_1)((Object)objectArray[3])}};
        staticFields0ba82fb5ac3130929eb6fe12cd822ba8 = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAECC87476B4BE7B7L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{105, -7, 38, 12, -20, -22, -87, -77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x317E7157;
    }

    private static void id_break() {
        bytes0ba82fb5ac3130929eb6fe12cd822ba8 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }

    private static void id_throws() {
        strings0ba82fb5ac3130929eb6fe12cd822ba8 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN"), new String("NO_PLAYER_AROUND")};
    }

    private static /* synthetic */ void ntfClinit() {
        rryj_1.id_protected();
        rryj_1.id_throws();
        rryj_1.id_case();
        rryj_1.id_break();
        rryj_1.id_class();
    }

    private static void id_case() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        shorts0ba82fb5ac3130929eb6fe12cd822ba8 = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans0ba82fb5ac3130929eb6fe12cd822ba8 = blArray;
    }
}

