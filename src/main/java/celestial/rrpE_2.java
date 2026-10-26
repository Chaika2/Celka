/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpE_2
extends Enum<rrpE_2> {
    private static String[] stringsb83609a63cb43b15a88fd9d3cb0e97ea;
    private static boolean[] booleansb83609a63cb43b15a88fd9d3cb0e97ea;
    private static byte[] bytesb83609a63cb43b15a88fd9d3cb0e97ea;
    public static Object[] staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea;
    private static short[] shortsb83609a63cb43b15a88fd9d3cb0e97ea;

    private static /* synthetic */ rrpE_2[] id_byte() {
        rrpE_2[] rrpE_2Array = new rrpE_2[bytesb83609a63cb43b15a88fd9d3cb0e97ea[0]];
        rrpE_2Array[rrpE_2.booleansb83609a63cb43b15a88fd9d3cb0e97ea[0]] = (rrpE_2)((Object)staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea[shortsb83609a63cb43b15a88fd9d3cb0e97ea[1]]);
        rrpE_2Array[rrpE_2.booleansb83609a63cb43b15a88fd9d3cb0e97ea[1]] = (rrpE_2)((Object)staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea[shortsb83609a63cb43b15a88fd9d3cb0e97ea[2]]);
        rrpE_2Array[rrpE_2.bytesb83609a63cb43b15a88fd9d3cb0e97ea[1]] = (rrpE_2)((Object)staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea[shortsb83609a63cb43b15a88fd9d3cb0e97ea[3]]);
        return rrpE_2Array;
    }

    static {
        rrpE_2.ntfClinit();
    }

    public static rrpE_2[] values() {
        return (rrpE_2[])((rrpE_2[])staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea[shortsb83609a63cb43b15a88fd9d3cb0e97ea[0]]).clone();
    }

    public static rrpE_2 valueOf(String string) {
        return Enum.valueOf(rrpE_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{47, 88, 85, -18, -28, -59, -122, -103}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8BDD84B5;
    }

    private static void id_class() {
        stringsb83609a63cb43b15a88fd9d3cb0e97ea = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB14B79884D096D09L;
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsb83609a63cb43b15a88fd9d3cb0e97ea = sArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpE_2(), new rrpE_2(), new rrpE_2(), new rrpE_2[]{(rrpE_2)((Object)objectArray[0]), (rrpE_2)((Object)objectArray[1]), (rrpE_2)((Object)objectArray[2])}};
        staticFieldsb83609a63cb43b15a88fd9d3cb0e97ea = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpE_2.id_protected();
        rrpE_2.id_class();
        rrpE_2.id_break();
        rrpE_2.id_case();
        rrpE_2.id_throws();
    }

    private static void id_case() {
        bytesb83609a63cb43b15a88fd9d3cb0e97ea = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansb83609a63cb43b15a88fd9d3cb0e97ea = blArray;
    }
}

