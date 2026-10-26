/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtb_3
extends Enum<rrtb_3> {
    private static byte[] bytes37d12a728fd138a98f39979b8f11d1be;
    private static String[] strings37d12a728fd138a98f39979b8f11d1be;
    private static boolean[] booleans37d12a728fd138a98f39979b8f11d1be;
    private static short[] shorts37d12a728fd138a98f39979b8f11d1be;
    public static Object[] staticFields37d12a728fd138a98f39979b8f11d1be;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans37d12a728fd138a98f39979b8f11d1be = blArray;
    }

    static {
        rrtb_3.ntfClinit();
    }

    public static rrtb_3[] values() {
        return (rrtb_3[])((rrtb_3[])staticFields37d12a728fd138a98f39979b8f11d1be[shorts37d12a728fd138a98f39979b8f11d1be[0]]).clone();
    }

    public static rrtb_3 valueOf(String string) {
        return Enum.valueOf(rrtb_3.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x39CFAA2FA2124A1BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB8ED0FE1;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-100, -14, 1, -20, -96, 79, 16, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts37d12a728fd138a98f39979b8f11d1be = sArray;
    }

    private static void id_break() {
        strings37d12a728fd138a98f39979b8f11d1be = new String[]{new String("READY"), new String("RECONNECTING")};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrtb_3(), new rrtb_3(), new rrtb_3[]{(rrtb_3)((Object)objectArray[0]), (rrtb_3)((Object)objectArray[1])}};
        staticFields37d12a728fd138a98f39979b8f11d1be = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtb_3.id_byte();
        rrtb_3.id_break();
        rrtb_3.id_class();
        rrtb_3.id_protected();
        rrtb_3.id_throws();
    }

    private static /* synthetic */ rrtb_3[] id_case() {
        rrtb_3[] rrtb_3Array = new rrtb_3[bytes37d12a728fd138a98f39979b8f11d1be[0]];
        rrtb_3Array[rrtb_3.booleans37d12a728fd138a98f39979b8f11d1be[0]] = (rrtb_3)((Object)staticFields37d12a728fd138a98f39979b8f11d1be[shorts37d12a728fd138a98f39979b8f11d1be[1]]);
        rrtb_3Array[rrtb_3.booleans37d12a728fd138a98f39979b8f11d1be[1]] = (rrtb_3)((Object)staticFields37d12a728fd138a98f39979b8f11d1be[shorts37d12a728fd138a98f39979b8f11d1be[2]]);
        return rrtb_3Array;
    }

    private static void id_protected() {
        bytes37d12a728fd138a98f39979b8f11d1be = new byte[]{2, 2, 3};
    }
}

