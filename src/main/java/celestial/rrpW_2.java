/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpW_2
extends Enum<rrpW_2> {
    private static boolean[] booleans1ac742ac88213c01994e700cd2890005;
    public static Object[] staticFields1ac742ac88213c01994e700cd2890005;
    private static String[] strings1ac742ac88213c01994e700cd2890005;
    private static short[] shorts1ac742ac88213c01994e700cd2890005;
    private static byte[] bytes1ac742ac88213c01994e700cd2890005;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans1ac742ac88213c01994e700cd2890005 = blArray;
    }

    static {
        rrpW_2.ntfClinit();
    }

    public static rrpW_2[] values() {
        return (rrpW_2[])((rrpW_2[])staticFields1ac742ac88213c01994e700cd2890005[shorts1ac742ac88213c01994e700cd2890005[0]]).clone();
    }

    public static rrpW_2 valueOf(String string) {
        return Enum.valueOf(rrpW_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC02B70A09B195ADL;
    }

    private static void id_class() {
        strings1ac742ac88213c01994e700cd2890005 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN"), new String("NO_PLAYER_AROUND")};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x12DF382B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-38, 43, 93, -93, 70, 76, 124, -66}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytes1ac742ac88213c01994e700cd2890005 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }

    private static void id_throws() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        shorts1ac742ac88213c01994e700cd2890005 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpW_2.id_byte();
        rrpW_2.id_class();
        rrpW_2.id_throws();
        rrpW_2.id_break();
        rrpW_2.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpW_2(), new rrpW_2(), new rrpW_2(), new rrpW_2(), new rrpW_2[]{(rrpW_2)((Object)objectArray[0]), (rrpW_2)((Object)objectArray[1]), (rrpW_2)((Object)objectArray[2]), (rrpW_2)((Object)objectArray[3])}};
        staticFields1ac742ac88213c01994e700cd2890005 = objectArray;
    }

    private static /* synthetic */ rrpW_2[] id_protected() {
        rrpW_2[] rrpW_2Array = new rrpW_2[bytes1ac742ac88213c01994e700cd2890005[0]];
        rrpW_2Array[rrpW_2.booleans1ac742ac88213c01994e700cd2890005[0]] = (rrpW_2)((Object)staticFields1ac742ac88213c01994e700cd2890005[shorts1ac742ac88213c01994e700cd2890005[1]]);
        rrpW_2Array[rrpW_2.booleans1ac742ac88213c01994e700cd2890005[1]] = (rrpW_2)((Object)staticFields1ac742ac88213c01994e700cd2890005[shorts1ac742ac88213c01994e700cd2890005[2]]);
        rrpW_2Array[rrpW_2.bytes1ac742ac88213c01994e700cd2890005[1]] = (rrpW_2)((Object)staticFields1ac742ac88213c01994e700cd2890005[shorts1ac742ac88213c01994e700cd2890005[3]]);
        rrpW_2Array[rrpW_2.bytes1ac742ac88213c01994e700cd2890005[2]] = (rrpW_2)((Object)staticFields1ac742ac88213c01994e700cd2890005[shorts1ac742ac88213c01994e700cd2890005[4]]);
        return rrpW_2Array;
    }
}

