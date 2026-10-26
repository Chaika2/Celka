/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrul_1
extends Enum<rrul_1> {
    public static Object[] staticFields9897caebb88b3588975198b6a548d1f7;
    private static boolean[] booleans9897caebb88b3588975198b6a548d1f7;
    private static short[] shorts9897caebb88b3588975198b6a548d1f7;
    private static String[] strings9897caebb88b3588975198b6a548d1f7;
    private static byte[] bytes9897caebb88b3588975198b6a548d1f7;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrul_1(), new rrul_1(), new rrul_1[]{(rrul_1)((Object)objectArray[0]), (rrul_1)((Object)objectArray[1])}};
        staticFields9897caebb88b3588975198b6a548d1f7 = objectArray;
    }

    static {
        rrul_1.ntfClinit();
    }

    public static rrul_1[] values() {
        return (rrul_1[])((rrul_1[])staticFields9897caebb88b3588975198b6a548d1f7[shorts9897caebb88b3588975198b6a548d1f7[0]]).clone();
    }

    public static rrul_1 valueOf(String string) {
        return Enum.valueOf(rrul_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-100, 58, -39, -11, -43, -40, -56, -57}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB59F60BB099CDBF2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6443A026;
    }

    private static void id_class() {
        strings9897caebb88b3588975198b6a548d1f7 = new String[]{new String("TO_DARKER"), new String("TO_BRIGHTER")};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans9897caebb88b3588975198b6a548d1f7 = blArray;
    }

    private static /* synthetic */ rrul_1[] id_throws() {
        rrul_1[] rrul_1Array = new rrul_1[bytes9897caebb88b3588975198b6a548d1f7[0]];
        rrul_1Array[rrul_1.booleans9897caebb88b3588975198b6a548d1f7[0]] = (rrul_1)((Object)staticFields9897caebb88b3588975198b6a548d1f7[shorts9897caebb88b3588975198b6a548d1f7[1]]);
        rrul_1Array[rrul_1.booleans9897caebb88b3588975198b6a548d1f7[1]] = (rrul_1)((Object)staticFields9897caebb88b3588975198b6a548d1f7[shorts9897caebb88b3588975198b6a548d1f7[2]]);
        return rrul_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrul_1.id_break();
        rrul_1.id_class();
        rrul_1.id_case();
        rrul_1.id_protected();
        rrul_1.id_byte();
    }

    private static void id_case() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts9897caebb88b3588975198b6a548d1f7 = sArray;
    }

    private static void id_protected() {
        bytes9897caebb88b3588975198b6a548d1f7 = new byte[]{2, 2, 3};
    }
}

