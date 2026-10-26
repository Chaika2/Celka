/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryi_1
extends Enum<rryi_1> {
    private static byte[] bytescfae87556b8c3f6c9aa41bc5236996e9;
    private static String[] stringscfae87556b8c3f6c9aa41bc5236996e9;
    private static short[] shortscfae87556b8c3f6c9aa41bc5236996e9;
    public static Object[] staticFieldscfae87556b8c3f6c9aa41bc5236996e9;
    private static boolean[] booleanscfae87556b8c3f6c9aa41bc5236996e9;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleanscfae87556b8c3f6c9aa41bc5236996e9 = blArray;
    }

    static {
        rryi_1.ntfClinit();
    }

    public static rryi_1[] values() {
        return (rryi_1[])((rryi_1[])staticFieldscfae87556b8c3f6c9aa41bc5236996e9[shortscfae87556b8c3f6c9aa41bc5236996e9[0]]).clone();
    }

    public static rryi_1 valueOf(String string) {
        return Enum.valueOf(rryi_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x669AA314FD0C2A7L;
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortscfae87556b8c3f6c9aa41bc5236996e9 = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{33, -7, 99, -119, 120, -42, 75, 17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xECB60C59;
    }

    private static void id_break() {
        stringscfae87556b8c3f6c9aa41bc5236996e9 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static /* synthetic */ rryi_1[] id_throws() {
        rryi_1[] rryi_1Array = new rryi_1[bytescfae87556b8c3f6c9aa41bc5236996e9[0]];
        rryi_1Array[rryi_1.booleanscfae87556b8c3f6c9aa41bc5236996e9[0]] = (rryi_1)((Object)staticFieldscfae87556b8c3f6c9aa41bc5236996e9[shortscfae87556b8c3f6c9aa41bc5236996e9[1]]);
        rryi_1Array[rryi_1.booleanscfae87556b8c3f6c9aa41bc5236996e9[1]] = (rryi_1)((Object)staticFieldscfae87556b8c3f6c9aa41bc5236996e9[shortscfae87556b8c3f6c9aa41bc5236996e9[2]]);
        rryi_1Array[rryi_1.bytescfae87556b8c3f6c9aa41bc5236996e9[1]] = (rryi_1)((Object)staticFieldscfae87556b8c3f6c9aa41bc5236996e9[shortscfae87556b8c3f6c9aa41bc5236996e9[3]]);
        return rryi_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rryi_1.id_byte();
        rryi_1.id_break();
        rryi_1.id_class();
        rryi_1.id_protected();
        rryi_1.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rryi_1(), new rryi_1(), new rryi_1(), new rryi_1[]{(rryi_1)((Object)objectArray[0]), (rryi_1)((Object)objectArray[1]), (rryi_1)((Object)objectArray[2])}};
        staticFieldscfae87556b8c3f6c9aa41bc5236996e9 = objectArray;
    }

    private static void id_protected() {
        bytescfae87556b8c3f6c9aa41bc5236996e9 = new byte[]{3, 2, 2, 2, 3, 4};
    }
}

