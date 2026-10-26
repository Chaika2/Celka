/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpS_2
extends Enum<rrpS_2> {
    private static String[] stringsedb426333b473145b1f6515db5c3fcb9;
    private static byte[] bytesedb426333b473145b1f6515db5c3fcb9;
    private static short[] shortsedb426333b473145b1f6515db5c3fcb9;
    public static Object[] staticFieldsedb426333b473145b1f6515db5c3fcb9;
    private static boolean[] booleansedb426333b473145b1f6515db5c3fcb9;

    private static /* synthetic */ rrpS_2[] id_byte() {
        rrpS_2[] rrpS_2Array = new rrpS_2[bytesedb426333b473145b1f6515db5c3fcb9[0]];
        rrpS_2Array[rrpS_2.booleansedb426333b473145b1f6515db5c3fcb9[0]] = (rrpS_2)((Object)staticFieldsedb426333b473145b1f6515db5c3fcb9[shortsedb426333b473145b1f6515db5c3fcb9[1]]);
        rrpS_2Array[rrpS_2.booleansedb426333b473145b1f6515db5c3fcb9[1]] = (rrpS_2)((Object)staticFieldsedb426333b473145b1f6515db5c3fcb9[shortsedb426333b473145b1f6515db5c3fcb9[2]]);
        rrpS_2Array[rrpS_2.bytesedb426333b473145b1f6515db5c3fcb9[1]] = (rrpS_2)((Object)staticFieldsedb426333b473145b1f6515db5c3fcb9[shortsedb426333b473145b1f6515db5c3fcb9[3]]);
        return rrpS_2Array;
    }

    static {
        rrpS_2.ntfClinit();
    }

    public static rrpS_2[] values() {
        return (rrpS_2[])((rrpS_2[])staticFieldsedb426333b473145b1f6515db5c3fcb9[shortsedb426333b473145b1f6515db5c3fcb9[0]]).clone();
    }

    public static rrpS_2 valueOf(String string) {
        return Enum.valueOf(rrpS_2.class, string);
    }

    private static void id_class() {
        bytesedb426333b473145b1f6515db5c3fcb9 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x42CF7033;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1381AC04EF3534F2L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, -46, 23, -19, 74, -39, 102, -33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsedb426333b473145b1f6515db5c3fcb9 = sArray;
    }

    private static void id_throws() {
        stringsedb426333b473145b1f6515db5c3fcb9 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpS_2.id_protected();
        rrpS_2.id_throws();
        rrpS_2.id_break();
        rrpS_2.id_class();
        rrpS_2.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpS_2(), new rrpS_2(), new rrpS_2(), new rrpS_2[]{(rrpS_2)((Object)objectArray[0]), (rrpS_2)((Object)objectArray[1]), (rrpS_2)((Object)objectArray[2])}};
        staticFieldsedb426333b473145b1f6515db5c3fcb9 = objectArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansedb426333b473145b1f6515db5c3fcb9 = blArray;
    }
}

