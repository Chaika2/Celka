/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtP_2
extends Enum<rrtP_2> {
    private static boolean[] booleans2f7653125b2938db917a91704c972442;
    public static Object[] staticFields2f7653125b2938db917a91704c972442;
    private static byte[] bytes2f7653125b2938db917a91704c972442;
    private static String[] strings2f7653125b2938db917a91704c972442;
    private static short[] shorts2f7653125b2938db917a91704c972442;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrtP_2(), new rrtP_2(), new rrtP_2[]{(rrtP_2)((Object)objectArray[0]), (rrtP_2)((Object)objectArray[1])}};
        staticFields2f7653125b2938db917a91704c972442 = objectArray;
    }

    static {
        rrtP_2.ntfClinit();
    }

    public static rrtP_2[] values() {
        return (rrtP_2[])((rrtP_2[])staticFields2f7653125b2938db917a91704c972442[shorts2f7653125b2938db917a91704c972442[0]]).clone();
    }

    public static rrtP_2 valueOf(String string) {
        return Enum.valueOf(rrtP_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7C1D9AB3;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x53F0D1618887779DL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, 26, 25, 88, -29, -87, -47, -62}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ rrtP_2[] id_class() {
        rrtP_2[] rrtP_2Array = new rrtP_2[bytes2f7653125b2938db917a91704c972442[0]];
        rrtP_2Array[rrtP_2.booleans2f7653125b2938db917a91704c972442[0]] = (rrtP_2)((Object)staticFields2f7653125b2938db917a91704c972442[shorts2f7653125b2938db917a91704c972442[1]]);
        rrtP_2Array[rrtP_2.booleans2f7653125b2938db917a91704c972442[1]] = (rrtP_2)((Object)staticFields2f7653125b2938db917a91704c972442[shorts2f7653125b2938db917a91704c972442[2]]);
        return rrtP_2Array;
    }

    private static void id_break() {
        bytes2f7653125b2938db917a91704c972442 = new byte[]{2, 2, 3};
    }

    private static void id_throws() {
        strings2f7653125b2938db917a91704c972442 = new String[]{new String("CLIENT"), new String("SERVER")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrtP_2.id_case();
        rrtP_2.id_throws();
        rrtP_2.id_protected();
        rrtP_2.id_break();
        rrtP_2.id_byte();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans2f7653125b2938db917a91704c972442 = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts2f7653125b2938db917a91704c972442 = sArray;
    }
}

