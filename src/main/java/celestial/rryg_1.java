/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryg_1
extends Enum<rryg_1> {
    public static Object[] staticFields024e8373b551338f96ec40891e552616;
    private static byte[] bytes024e8373b551338f96ec40891e552616;
    private static short[] shorts024e8373b551338f96ec40891e552616;
    private static boolean[] booleans024e8373b551338f96ec40891e552616;
    private static String[] strings024e8373b551338f96ec40891e552616;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans024e8373b551338f96ec40891e552616 = blArray;
    }

    static {
        rryg_1.ntfClinit();
    }

    public static rryg_1[] values() {
        return (rryg_1[])((rryg_1[])staticFields024e8373b551338f96ec40891e552616[shorts024e8373b551338f96ec40891e552616[0]]).clone();
    }

    public static rryg_1 valueOf(String string) {
        return Enum.valueOf(rryg_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x5DE6CC4A;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{40, -114, -68, -38, -56, 15, -109, 109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7377B6CD7BD2EA43L;
    }

    private static void id_class() {
        strings024e8373b551338f96ec40891e552616 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rryg_1(), new rryg_1(), new rryg_1(), new rryg_1[]{(rryg_1)((Object)objectArray[0]), (rryg_1)((Object)objectArray[1]), (rryg_1)((Object)objectArray[2])}};
        staticFields024e8373b551338f96ec40891e552616 = objectArray;
    }

    private static void id_throws() {
        bytes024e8373b551338f96ec40891e552616 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static /* synthetic */ void ntfClinit() {
        rryg_1.id_byte();
        rryg_1.id_class();
        rryg_1.id_protected();
        rryg_1.id_throws();
        rryg_1.id_break();
    }

    private static /* synthetic */ rryg_1[] id_case() {
        rryg_1[] rryg_1Array = new rryg_1[bytes024e8373b551338f96ec40891e552616[0]];
        rryg_1Array[rryg_1.booleans024e8373b551338f96ec40891e552616[0]] = (rryg_1)((Object)staticFields024e8373b551338f96ec40891e552616[shorts024e8373b551338f96ec40891e552616[1]]);
        rryg_1Array[rryg_1.booleans024e8373b551338f96ec40891e552616[1]] = (rryg_1)((Object)staticFields024e8373b551338f96ec40891e552616[shorts024e8373b551338f96ec40891e552616[2]]);
        rryg_1Array[rryg_1.bytes024e8373b551338f96ec40891e552616[1]] = (rryg_1)((Object)staticFields024e8373b551338f96ec40891e552616[shorts024e8373b551338f96ec40891e552616[3]]);
        return rryg_1Array;
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts024e8373b551338f96ec40891e552616 = sArray;
    }
}

