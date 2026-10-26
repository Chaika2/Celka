/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLg_1
extends Enum<rrLg_1> {
    private static short[] shorts83bfa4843c3c3647913690fe22963b15;
    private static String[] strings83bfa4843c3c3647913690fe22963b15;
    public static Object[] staticFields83bfa4843c3c3647913690fe22963b15;
    private static byte[] bytes83bfa4843c3c3647913690fe22963b15;
    private static boolean[] booleans83bfa4843c3c3647913690fe22963b15;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrLg_1(), new rrLg_1(), new rrLg_1[]{(rrLg_1)((Object)objectArray[0]), (rrLg_1)((Object)objectArray[1])}};
        staticFields83bfa4843c3c3647913690fe22963b15 = objectArray;
    }

    static {
        rrLg_1.ntfClinit();
    }

    public static rrLg_1[] values() {
        return (rrLg_1[])((rrLg_1[])staticFields83bfa4843c3c3647913690fe22963b15[shorts83bfa4843c3c3647913690fe22963b15[0]]).clone();
    }

    public static rrLg_1 valueOf(String string) {
        return Enum.valueOf(rrLg_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDCE1B800;
    }

    private static /* synthetic */ rrLg_1[] id_class() {
        rrLg_1[] rrLg_1Array = new rrLg_1[bytes83bfa4843c3c3647913690fe22963b15[0]];
        rrLg_1Array[rrLg_1.booleans83bfa4843c3c3647913690fe22963b15[0]] = (rrLg_1)((Object)staticFields83bfa4843c3c3647913690fe22963b15[shorts83bfa4843c3c3647913690fe22963b15[1]]);
        rrLg_1Array[rrLg_1.booleans83bfa4843c3c3647913690fe22963b15[1]] = (rrLg_1)((Object)staticFields83bfa4843c3c3647913690fe22963b15[shorts83bfa4843c3c3647913690fe22963b15[2]]);
        return rrLg_1Array;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBF6857E8297DE2FBL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-20, -97, -45, 43, 63, 1, 7, 74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts83bfa4843c3c3647913690fe22963b15 = sArray;
    }

    private static void id_throws() {
        strings83bfa4843c3c3647913690fe22963b15 = new String[]{new String("INVENTORY"), new String("DIGGING")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrLg_1.id_protected();
        rrLg_1.id_throws();
        rrLg_1.id_break();
        rrLg_1.id_case();
        rrLg_1.id_byte();
    }

    private static void id_case() {
        bytes83bfa4843c3c3647913690fe22963b15 = new byte[]{2, 2, 3};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans83bfa4843c3c3647913690fe22963b15 = blArray;
    }
}

