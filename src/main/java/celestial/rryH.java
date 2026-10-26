/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryH
extends Enum<rryH> {
    private static byte[] bytes11c0dbdf8fff34b19e0679f05309932f;
    public static Object[] staticFields11c0dbdf8fff34b19e0679f05309932f;
    private static String[] strings11c0dbdf8fff34b19e0679f05309932f;
    private static short[] shorts11c0dbdf8fff34b19e0679f05309932f;
    private static boolean[] booleans11c0dbdf8fff34b19e0679f05309932f;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans11c0dbdf8fff34b19e0679f05309932f = blArray;
    }

    static {
        rryH.ntfClinit();
    }

    public static rryH[] values() {
        return (rryH[])((rryH[])staticFields11c0dbdf8fff34b19e0679f05309932f[shorts11c0dbdf8fff34b19e0679f05309932f[0]]).clone();
    }

    public static rryH valueOf(String string) {
        return Enum.valueOf(rryH.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3479D57D;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-82, 52, 31, -24, -8, -83, -111, 120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rryH(), new rryH(), new rryH(), new rryH[]{(rryH)((Object)objectArray[0]), (rryH)((Object)objectArray[1]), (rryH)((Object)objectArray[2])}};
        staticFields11c0dbdf8fff34b19e0679f05309932f = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1715A8B6B86551FAL;
    }

    private static void id_break() {
        bytes11c0dbdf8fff34b19e0679f05309932f = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_throws() {
        strings11c0dbdf8fff34b19e0679f05309932f = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static /* synthetic */ void ntfClinit() {
        rryH.id_byte();
        rryH.id_throws();
        rryH.id_case();
        rryH.id_break();
        rryH.id_class();
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts11c0dbdf8fff34b19e0679f05309932f = sArray;
    }

    private static /* synthetic */ rryH[] id_protected() {
        rryH[] rryHArray = new rryH[bytes11c0dbdf8fff34b19e0679f05309932f[0]];
        rryHArray[rryH.booleans11c0dbdf8fff34b19e0679f05309932f[0]] = (rryH)((Object)staticFields11c0dbdf8fff34b19e0679f05309932f[shorts11c0dbdf8fff34b19e0679f05309932f[1]]);
        rryHArray[rryH.booleans11c0dbdf8fff34b19e0679f05309932f[1]] = (rryH)((Object)staticFields11c0dbdf8fff34b19e0679f05309932f[shorts11c0dbdf8fff34b19e0679f05309932f[2]]);
        rryHArray[rryH.bytes11c0dbdf8fff34b19e0679f05309932f[1]] = (rryH)((Object)staticFields11c0dbdf8fff34b19e0679f05309932f[shorts11c0dbdf8fff34b19e0679f05309932f[3]]);
        return rryHArray;
    }
}

