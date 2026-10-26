/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTp_1
extends Enum<rrTp_1> {
    private static short[] shorts0bf0cd3d5fc6358ba8402b11be019aa4;
    private static byte[] bytes0bf0cd3d5fc6358ba8402b11be019aa4;
    public static Object[] staticFields0bf0cd3d5fc6358ba8402b11be019aa4;
    private static boolean[] booleans0bf0cd3d5fc6358ba8402b11be019aa4;
    private static String[] strings0bf0cd3d5fc6358ba8402b11be019aa4;

    private static void id_byte() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        shorts0bf0cd3d5fc6358ba8402b11be019aa4 = sArray;
    }

    static {
        rrTp_1.ntfClinit();
    }

    public static rrTp_1[] values() {
        return (rrTp_1[])((rrTp_1[])staticFields0bf0cd3d5fc6358ba8402b11be019aa4[shorts0bf0cd3d5fc6358ba8402b11be019aa4[0]]).clone();
    }

    public static rrTp_1 valueOf(String string) {
        return Enum.valueOf(rrTp_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9126B4F9A6D5B226L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB8B60222;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-92, 61, 33, -30, 34, -1, -117, -83}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        bytes0bf0cd3d5fc6358ba8402b11be019aa4 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }

    private static void id_break() {
        strings0bf0cd3d5fc6358ba8402b11be019aa4 = new String[]{new String("SILENT"), new String("STRICT"), new String("TARGET"), new String("NONE")};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrTp_1(), new rrTp_1(), new rrTp_1(), new rrTp_1(), new rrTp_1[]{(rrTp_1)((Object)objectArray[0]), (rrTp_1)((Object)objectArray[1]), (rrTp_1)((Object)objectArray[2]), (rrTp_1)((Object)objectArray[3])}};
        staticFields0bf0cd3d5fc6358ba8402b11be019aa4 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTp_1.id_case();
        rrTp_1.id_break();
        rrTp_1.id_byte();
        rrTp_1.id_class();
        rrTp_1.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans0bf0cd3d5fc6358ba8402b11be019aa4 = blArray;
    }

    private static /* synthetic */ rrTp_1[] id_protected() {
        rrTp_1[] rrTp_1Array = new rrTp_1[bytes0bf0cd3d5fc6358ba8402b11be019aa4[0]];
        rrTp_1Array[rrTp_1.booleans0bf0cd3d5fc6358ba8402b11be019aa4[0]] = (rrTp_1)((Object)staticFields0bf0cd3d5fc6358ba8402b11be019aa4[shorts0bf0cd3d5fc6358ba8402b11be019aa4[1]]);
        rrTp_1Array[rrTp_1.booleans0bf0cd3d5fc6358ba8402b11be019aa4[1]] = (rrTp_1)((Object)staticFields0bf0cd3d5fc6358ba8402b11be019aa4[shorts0bf0cd3d5fc6358ba8402b11be019aa4[2]]);
        rrTp_1Array[rrTp_1.bytes0bf0cd3d5fc6358ba8402b11be019aa4[1]] = (rrTp_1)((Object)staticFields0bf0cd3d5fc6358ba8402b11be019aa4[shorts0bf0cd3d5fc6358ba8402b11be019aa4[3]]);
        rrTp_1Array[rrTp_1.bytes0bf0cd3d5fc6358ba8402b11be019aa4[2]] = (rrTp_1)((Object)staticFields0bf0cd3d5fc6358ba8402b11be019aa4[shorts0bf0cd3d5fc6358ba8402b11be019aa4[4]]);
        return rrTp_1Array;
    }
}

