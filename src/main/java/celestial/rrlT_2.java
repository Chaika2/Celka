/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlT_2
extends Enum<rrlT_2> {
    private static boolean[] booleans8894b88cba4233cc950e42483f078233;
    public static Object[] staticFields8894b88cba4233cc950e42483f078233;
    private static short[] shorts8894b88cba4233cc950e42483f078233;
    private static byte[] bytes8894b88cba4233cc950e42483f078233;
    private static String[] strings8894b88cba4233cc950e42483f078233;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrlT_2(), new rrlT_2[]{(rrlT_2)((Object)objectArray[0])}};
        staticFields8894b88cba4233cc950e42483f078233 = objectArray;
    }

    static {
        rrlT_2.ntfClinit();
    }

    public static rrlT_2[] values() {
        return (rrlT_2[])((rrlT_2[])staticFields8894b88cba4233cc950e42483f078233[shorts8894b88cba4233cc950e42483f078233[0]]).clone();
    }

    public static rrlT_2 valueOf(String string) {
        return Enum.valueOf(rrlT_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x629C75F57B2B392DL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF87F2467;
    }

    private static /* synthetic */ rrlT_2[] id_class() {
        rrlT_2[] rrlT_2Array = new rrlT_2[booleans8894b88cba4233cc950e42483f078233[0]];
        rrlT_2Array[rrlT_2.booleans8894b88cba4233cc950e42483f078233[1]] = (rrlT_2)((Object)staticFields8894b88cba4233cc950e42483f078233[shorts8894b88cba4233cc950e42483f078233[1]]);
        return rrlT_2Array;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-127, -88, 116, 20, 73, 9, -102, 117}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans8894b88cba4233cc950e42483f078233 = blArray;
    }

    private static void id_throws() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts8894b88cba4233cc950e42483f078233 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrlT_2.id_break();
        rrlT_2.id_case();
        rrlT_2.id_throws();
        rrlT_2.id_protected();
        rrlT_2.id_byte();
    }

    private static void id_case() {
        strings8894b88cba4233cc950e42483f078233 = new String[]{new String("CLICK_IN_SCREEN")};
    }

    private static void id_protected() {
        bytes8894b88cba4233cc950e42483f078233 = new byte[]{2};
    }
}

