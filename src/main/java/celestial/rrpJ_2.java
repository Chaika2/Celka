/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpJ_2
extends Enum<rrpJ_2> {
    private static String[] strings5c082363986d3091901b81d145e82889;
    private static short[] shorts5c082363986d3091901b81d145e82889;
    public static Object[] staticFields5c082363986d3091901b81d145e82889;
    private static byte[] bytes5c082363986d3091901b81d145e82889;
    private static boolean[] booleans5c082363986d3091901b81d145e82889;

    private static void id_byte() {
        strings5c082363986d3091901b81d145e82889 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    static {
        rrpJ_2.ntfClinit();
    }

    public static rrpJ_2[] values() {
        return (rrpJ_2[])((rrpJ_2[])staticFields5c082363986d3091901b81d145e82889[shorts5c082363986d3091901b81d145e82889[0]]).clone();
    }

    public static rrpJ_2 valueOf(String string) {
        return Enum.valueOf(rrpJ_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{66, 66, -65, -43, -15, -65, -35, 40}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB725D7144410E616L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCB66D793;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans5c082363986d3091901b81d145e82889 = blArray;
    }

    private static /* synthetic */ rrpJ_2[] id_break() {
        rrpJ_2[] rrpJ_2Array = new rrpJ_2[bytes5c082363986d3091901b81d145e82889[0]];
        rrpJ_2Array[rrpJ_2.booleans5c082363986d3091901b81d145e82889[0]] = (rrpJ_2)((Object)staticFields5c082363986d3091901b81d145e82889[shorts5c082363986d3091901b81d145e82889[1]]);
        rrpJ_2Array[rrpJ_2.booleans5c082363986d3091901b81d145e82889[1]] = (rrpJ_2)((Object)staticFields5c082363986d3091901b81d145e82889[shorts5c082363986d3091901b81d145e82889[2]]);
        rrpJ_2Array[rrpJ_2.bytes5c082363986d3091901b81d145e82889[1]] = (rrpJ_2)((Object)staticFields5c082363986d3091901b81d145e82889[shorts5c082363986d3091901b81d145e82889[3]]);
        return rrpJ_2Array;
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts5c082363986d3091901b81d145e82889 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpJ_2.id_class();
        rrpJ_2.id_byte();
        rrpJ_2.id_throws();
        rrpJ_2.id_case();
        rrpJ_2.id_protected();
    }

    private static void id_case() {
        bytes5c082363986d3091901b81d145e82889 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpJ_2(), new rrpJ_2(), new rrpJ_2(), new rrpJ_2[]{(rrpJ_2)((Object)objectArray[0]), (rrpJ_2)((Object)objectArray[1]), (rrpJ_2)((Object)objectArray[2])}};
        staticFields5c082363986d3091901b81d145e82889 = objectArray;
    }
}

