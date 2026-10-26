/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpY_2
extends Enum<rrpY_2> {
    private static short[] shortsf0e328803e763329a58eb35af5ba74f4;
    private static boolean[] booleansf0e328803e763329a58eb35af5ba74f4;
    public static Object[] staticFieldsf0e328803e763329a58eb35af5ba74f4;
    private static byte[] bytesf0e328803e763329a58eb35af5ba74f4;
    private static String[] stringsf0e328803e763329a58eb35af5ba74f4;

    private static /* synthetic */ rrpY_2[] id_byte() {
        rrpY_2[] rrpY_2Array = new rrpY_2[bytesf0e328803e763329a58eb35af5ba74f4[0]];
        rrpY_2Array[rrpY_2.booleansf0e328803e763329a58eb35af5ba74f4[0]] = (rrpY_2)((Object)staticFieldsf0e328803e763329a58eb35af5ba74f4[shortsf0e328803e763329a58eb35af5ba74f4[1]]);
        rrpY_2Array[rrpY_2.booleansf0e328803e763329a58eb35af5ba74f4[1]] = (rrpY_2)((Object)staticFieldsf0e328803e763329a58eb35af5ba74f4[shortsf0e328803e763329a58eb35af5ba74f4[2]]);
        rrpY_2Array[rrpY_2.bytesf0e328803e763329a58eb35af5ba74f4[1]] = (rrpY_2)((Object)staticFieldsf0e328803e763329a58eb35af5ba74f4[shortsf0e328803e763329a58eb35af5ba74f4[3]]);
        return rrpY_2Array;
    }

    static {
        rrpY_2.ntfClinit();
    }

    public static rrpY_2[] values() {
        return (rrpY_2[])((rrpY_2[])staticFieldsf0e328803e763329a58eb35af5ba74f4[shortsf0e328803e763329a58eb35af5ba74f4[0]]).clone();
    }

    public static rrpY_2 valueOf(String string) {
        return Enum.valueOf(rrpY_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB5C49F31;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpY_2(), new rrpY_2(), new rrpY_2(), new rrpY_2[]{(rrpY_2)((Object)objectArray[0]), (rrpY_2)((Object)objectArray[1]), (rrpY_2)((Object)objectArray[2])}};
        staticFieldsf0e328803e763329a58eb35af5ba74f4 = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{91, 2, -2, 126, 7, 61, 1, 42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9EC25E82AB12745EL;
    }

    private static void id_break() {
        stringsf0e328803e763329a58eb35af5ba74f4 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static void id_throws() {
        bytesf0e328803e763329a58eb35af5ba74f4 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpY_2.id_case();
        rrpY_2.id_break();
        rrpY_2.id_protected();
        rrpY_2.id_throws();
        rrpY_2.id_class();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansf0e328803e763329a58eb35af5ba74f4 = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsf0e328803e763329a58eb35af5ba74f4 = sArray;
    }
}

