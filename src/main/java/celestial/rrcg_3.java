/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcg_3
extends Enum<rrcg_3> {
    public static Object[] staticFields9e7054085b8332b2a0d7ffdb908291c6;
    private static byte[] bytes9e7054085b8332b2a0d7ffdb908291c6;
    private static short[] shorts9e7054085b8332b2a0d7ffdb908291c6;
    private static String[] strings9e7054085b8332b2a0d7ffdb908291c6;
    private static boolean[] booleans9e7054085b8332b2a0d7ffdb908291c6;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans9e7054085b8332b2a0d7ffdb908291c6 = blArray;
    }

    static {
        rrcg_3.ntfClinit();
    }

    public static rrcg_3[] values() {
        return (rrcg_3[])((rrcg_3[])staticFields9e7054085b8332b2a0d7ffdb908291c6[shorts9e7054085b8332b2a0d7ffdb908291c6[0]]).clone();
    }

    public static rrcg_3 valueOf(String string) {
        return Enum.valueOf(rrcg_3.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x23E087A3;
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts9e7054085b8332b2a0d7ffdb908291c6 = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-10, -67, -3, -8, -60, 108, -11, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2C5BC31920487605L;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rrcg_3(), new rrcg_3(), new rrcg_3(), new rrcg_3[]{(rrcg_3)((Object)objectArray[0]), (rrcg_3)((Object)objectArray[1]), (rrcg_3)((Object)objectArray[2])}};
        staticFields9e7054085b8332b2a0d7ffdb908291c6 = objectArray;
    }

    private static /* synthetic */ rrcg_3[] id_throws() {
        rrcg_3[] rrcg_3Array = new rrcg_3[bytes9e7054085b8332b2a0d7ffdb908291c6[0]];
        rrcg_3Array[rrcg_3.booleans9e7054085b8332b2a0d7ffdb908291c6[0]] = (rrcg_3)((Object)staticFields9e7054085b8332b2a0d7ffdb908291c6[shorts9e7054085b8332b2a0d7ffdb908291c6[1]]);
        rrcg_3Array[rrcg_3.booleans9e7054085b8332b2a0d7ffdb908291c6[1]] = (rrcg_3)((Object)staticFields9e7054085b8332b2a0d7ffdb908291c6[shorts9e7054085b8332b2a0d7ffdb908291c6[2]]);
        rrcg_3Array[rrcg_3.bytes9e7054085b8332b2a0d7ffdb908291c6[1]] = (rrcg_3)((Object)staticFields9e7054085b8332b2a0d7ffdb908291c6[shorts9e7054085b8332b2a0d7ffdb908291c6[3]]);
        return rrcg_3Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrcg_3.id_byte();
        rrcg_3.id_protected();
        rrcg_3.id_class();
        rrcg_3.id_case();
        rrcg_3.id_break();
    }

    private static void id_case() {
        bytes9e7054085b8332b2a0d7ffdb908291c6 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_protected() {
        strings9e7054085b8332b2a0d7ffdb908291c6 = new String[]{new String("OK"), new String("PRICE_TOO_HIGH"), new String("NOT_ENOUGH_MONEY")};
    }
}

