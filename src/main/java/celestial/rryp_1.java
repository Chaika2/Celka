/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryp_1
extends Enum<rryp_1> {
    private static boolean[] booleans1677081b7d6b3f3aa7e7dec6b87c7532;
    private static short[] shorts1677081b7d6b3f3aa7e7dec6b87c7532;
    public static Object[] staticFields1677081b7d6b3f3aa7e7dec6b87c7532;
    private static byte[] bytes1677081b7d6b3f3aa7e7dec6b87c7532;
    private static String[] strings1677081b7d6b3f3aa7e7dec6b87c7532;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans1677081b7d6b3f3aa7e7dec6b87c7532 = blArray;
    }

    static {
        rryp_1.ntfClinit();
    }

    public static rryp_1[] values() {
        return (rryp_1[])((rryp_1[])staticFields1677081b7d6b3f3aa7e7dec6b87c7532[shorts1677081b7d6b3f3aa7e7dec6b87c7532[0]]).clone();
    }

    public static rryp_1 valueOf(String string) {
        return Enum.valueOf(rryp_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{5, 8, -9, 18, -55, 29, 37, 77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9CAECB51264538B3L;
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts1677081b7d6b3f3aa7e7dec6b87c7532 = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF93CD960;
    }

    private static void id_break() {
        bytes1677081b7d6b3f3aa7e7dec6b87c7532 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static /* synthetic */ rryp_1[] id_throws() {
        rryp_1[] rryp_1Array = new rryp_1[bytes1677081b7d6b3f3aa7e7dec6b87c7532[0]];
        rryp_1Array[rryp_1.booleans1677081b7d6b3f3aa7e7dec6b87c7532[0]] = (rryp_1)((Object)staticFields1677081b7d6b3f3aa7e7dec6b87c7532[shorts1677081b7d6b3f3aa7e7dec6b87c7532[1]]);
        rryp_1Array[rryp_1.booleans1677081b7d6b3f3aa7e7dec6b87c7532[1]] = (rryp_1)((Object)staticFields1677081b7d6b3f3aa7e7dec6b87c7532[shorts1677081b7d6b3f3aa7e7dec6b87c7532[2]]);
        rryp_1Array[rryp_1.bytes1677081b7d6b3f3aa7e7dec6b87c7532[1]] = (rryp_1)((Object)staticFields1677081b7d6b3f3aa7e7dec6b87c7532[shorts1677081b7d6b3f3aa7e7dec6b87c7532[3]]);
        return rryp_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rryp_1.id_byte();
        rryp_1.id_case();
        rryp_1.id_class();
        rryp_1.id_break();
        rryp_1.id_protected();
    }

    private static void id_case() {
        strings1677081b7d6b3f3aa7e7dec6b87c7532 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rryp_1(), new rryp_1(), new rryp_1(), new rryp_1[]{(rryp_1)((Object)objectArray[0]), (rryp_1)((Object)objectArray[1]), (rryp_1)((Object)objectArray[2])}};
        staticFields1677081b7d6b3f3aa7e7dec6b87c7532 = objectArray;
    }
}

