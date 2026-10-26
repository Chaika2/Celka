/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpI_2
extends Enum<rrpI_2> {
    private static short[] shorts9e44efdcc167316f82dd237e58019786;
    private static byte[] bytes9e44efdcc167316f82dd237e58019786;
    public static Object[] staticFields9e44efdcc167316f82dd237e58019786;
    private static String[] strings9e44efdcc167316f82dd237e58019786;
    private static boolean[] booleans9e44efdcc167316f82dd237e58019786;

    private static void id_byte() {
        strings9e44efdcc167316f82dd237e58019786 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    static {
        rrpI_2.ntfClinit();
    }

    public static rrpI_2[] values() {
        return (rrpI_2[])((rrpI_2[])staticFields9e44efdcc167316f82dd237e58019786[shorts9e44efdcc167316f82dd237e58019786[0]]).clone();
    }

    public static rrpI_2 valueOf(String string) {
        return Enum.valueOf(rrpI_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFF1D34207CEA01F4L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-26, -47, -12, 59, -115, 59, -12, 51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        bytes9e44efdcc167316f82dd237e58019786 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFFA23F7C;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpI_2(), new rrpI_2(), new rrpI_2(), new rrpI_2[]{(rrpI_2)((Object)objectArray[0]), (rrpI_2)((Object)objectArray[1]), (rrpI_2)((Object)objectArray[2])}};
        staticFields9e44efdcc167316f82dd237e58019786 = objectArray;
    }

    private static /* synthetic */ rrpI_2[] id_throws() {
        rrpI_2[] rrpI_2Array = new rrpI_2[bytes9e44efdcc167316f82dd237e58019786[0]];
        rrpI_2Array[rrpI_2.booleans9e44efdcc167316f82dd237e58019786[0]] = (rrpI_2)((Object)staticFields9e44efdcc167316f82dd237e58019786[shorts9e44efdcc167316f82dd237e58019786[1]]);
        rrpI_2Array[rrpI_2.booleans9e44efdcc167316f82dd237e58019786[1]] = (rrpI_2)((Object)staticFields9e44efdcc167316f82dd237e58019786[shorts9e44efdcc167316f82dd237e58019786[2]]);
        rrpI_2Array[rrpI_2.bytes9e44efdcc167316f82dd237e58019786[1]] = (rrpI_2)((Object)staticFields9e44efdcc167316f82dd237e58019786[shorts9e44efdcc167316f82dd237e58019786[3]]);
        return rrpI_2Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpI_2.id_case();
        rrpI_2.id_byte();
        rrpI_2.id_protected();
        rrpI_2.id_class();
        rrpI_2.id_break();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans9e44efdcc167316f82dd237e58019786 = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts9e44efdcc167316f82dd237e58019786 = sArray;
    }
}

