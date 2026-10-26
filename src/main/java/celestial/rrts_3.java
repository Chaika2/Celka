/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrts_3
extends Enum<rrts_3> {
    private static byte[] bytes7f20647f48ec3d8aae2ee5813ea8ad96;
    private static boolean[] booleans7f20647f48ec3d8aae2ee5813ea8ad96;
    private static short[] shorts7f20647f48ec3d8aae2ee5813ea8ad96;
    private static String[] strings7f20647f48ec3d8aae2ee5813ea8ad96;
    public static Object[] staticFields7f20647f48ec3d8aae2ee5813ea8ad96;

    private static void id_byte() {
        bytes7f20647f48ec3d8aae2ee5813ea8ad96 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    static {
        rrts_3.ntfClinit();
    }

    public static rrts_3[] values() {
        return (rrts_3[])((rrts_3[])staticFields7f20647f48ec3d8aae2ee5813ea8ad96[shorts7f20647f48ec3d8aae2ee5813ea8ad96[0]]).clone();
    }

    public static rrts_3 valueOf(String string) {
        return Enum.valueOf(rrts_3.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1D25DC0CC70D651DL;
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts7f20647f48ec3d8aae2ee5813ea8ad96 = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8D2A4ED4;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{18, -55, 14, 104, 70, 33, 97, 122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rrts_3(), new rrts_3(), new rrts_3(), new rrts_3[]{(rrts_3)((Object)objectArray[0]), (rrts_3)((Object)objectArray[1]), (rrts_3)((Object)objectArray[2])}};
        staticFields7f20647f48ec3d8aae2ee5813ea8ad96 = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans7f20647f48ec3d8aae2ee5813ea8ad96 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrts_3.id_throws();
        rrts_3.id_case();
        rrts_3.id_class();
        rrts_3.id_byte();
        rrts_3.id_break();
    }

    private static void id_case() {
        strings7f20647f48ec3d8aae2ee5813ea8ad96 = new String[]{new String("HAS"), new String("DOES_NOT_HAVE"), new String("FAILED_TO_CHECK")};
    }

    private static /* synthetic */ rrts_3[] id_protected() {
        rrts_3[] rrts_3Array = new rrts_3[bytes7f20647f48ec3d8aae2ee5813ea8ad96[0]];
        rrts_3Array[rrts_3.booleans7f20647f48ec3d8aae2ee5813ea8ad96[0]] = (rrts_3)((Object)staticFields7f20647f48ec3d8aae2ee5813ea8ad96[shorts7f20647f48ec3d8aae2ee5813ea8ad96[1]]);
        rrts_3Array[rrts_3.booleans7f20647f48ec3d8aae2ee5813ea8ad96[1]] = (rrts_3)((Object)staticFields7f20647f48ec3d8aae2ee5813ea8ad96[shorts7f20647f48ec3d8aae2ee5813ea8ad96[2]]);
        rrts_3Array[rrts_3.bytes7f20647f48ec3d8aae2ee5813ea8ad96[1]] = (rrts_3)((Object)staticFields7f20647f48ec3d8aae2ee5813ea8ad96[shorts7f20647f48ec3d8aae2ee5813ea8ad96[3]]);
        return rrts_3Array;
    }
}

