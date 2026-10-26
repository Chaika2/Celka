/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrnX_2
extends Enum<rrnX_2> {
    private static boolean[] booleans1e73a3d9163a3242ac9ccbcc36d981ca;
    public static Object[] staticFields1e73a3d9163a3242ac9ccbcc36d981ca;
    private static String[] strings1e73a3d9163a3242ac9ccbcc36d981ca;
    private static short[] shorts1e73a3d9163a3242ac9ccbcc36d981ca;
    private static byte[] bytes1e73a3d9163a3242ac9ccbcc36d981ca;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts1e73a3d9163a3242ac9ccbcc36d981ca = sArray;
    }

    static {
        rrnX_2.ntfClinit();
    }

    public static rrnX_2[] values() {
        return (rrnX_2[])((rrnX_2[])staticFields1e73a3d9163a3242ac9ccbcc36d981ca[shorts1e73a3d9163a3242ac9ccbcc36d981ca[0]]).clone();
    }

    public static rrnX_2 valueOf(String string) {
        return Enum.valueOf(rrnX_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{0, 23, 45, 41, 4, 123, 25, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF8C1C07180ECF880L;
    }

    private static void id_class() {
        bytes1e73a3d9163a3242ac9ccbcc36d981ca = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA949C664;
    }

    private static /* synthetic */ rrnX_2[] id_break() {
        rrnX_2[] rrnX_2Array = new rrnX_2[bytes1e73a3d9163a3242ac9ccbcc36d981ca[0]];
        rrnX_2Array[rrnX_2.booleans1e73a3d9163a3242ac9ccbcc36d981ca[0]] = (rrnX_2)((Object)staticFields1e73a3d9163a3242ac9ccbcc36d981ca[shorts1e73a3d9163a3242ac9ccbcc36d981ca[1]]);
        rrnX_2Array[rrnX_2.booleans1e73a3d9163a3242ac9ccbcc36d981ca[1]] = (rrnX_2)((Object)staticFields1e73a3d9163a3242ac9ccbcc36d981ca[shorts1e73a3d9163a3242ac9ccbcc36d981ca[2]]);
        rrnX_2Array[rrnX_2.bytes1e73a3d9163a3242ac9ccbcc36d981ca[1]] = (rrnX_2)((Object)staticFields1e73a3d9163a3242ac9ccbcc36d981ca[shorts1e73a3d9163a3242ac9ccbcc36d981ca[3]]);
        return rrnX_2Array;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrnX_2(), new rrnX_2(), new rrnX_2(), new rrnX_2[]{(rrnX_2)((Object)objectArray[0]), (rrnX_2)((Object)objectArray[1]), (rrnX_2)((Object)objectArray[2])}};
        staticFields1e73a3d9163a3242ac9ccbcc36d981ca = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrnX_2.id_protected();
        rrnX_2.id_case();
        rrnX_2.id_byte();
        rrnX_2.id_class();
        rrnX_2.id_throws();
    }

    private static void id_case() {
        strings1e73a3d9163a3242ac9ccbcc36d981ca = new String[]{new String("FALL"), new String("ARROW"), new String("ENDER_PEARL")};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans1e73a3d9163a3242ac9ccbcc36d981ca = blArray;
    }
}

