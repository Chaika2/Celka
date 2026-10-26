/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrzT_2
extends Enum<rrzT_2> {
    public static Object[] staticFieldsf131934b317338e68bb375b05e34a601;
    private static short[] shortsf131934b317338e68bb375b05e34a601;
    private static boolean[] booleansf131934b317338e68bb375b05e34a601;
    private static String[] stringsf131934b317338e68bb375b05e34a601;
    private static byte[] bytesf131934b317338e68bb375b05e34a601;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2(), new rrzT_2[]{(rrzT_2)((Object)objectArray[0]), (rrzT_2)((Object)objectArray[1]), (rrzT_2)((Object)objectArray[2]), (rrzT_2)((Object)objectArray[3]), (rrzT_2)((Object)objectArray[4]), (rrzT_2)((Object)objectArray[5]), (rrzT_2)((Object)objectArray[6]), (rrzT_2)((Object)objectArray[7]), (rrzT_2)((Object)objectArray[8]), (rrzT_2)((Object)objectArray[9]), (rrzT_2)((Object)objectArray[10]), (rrzT_2)((Object)objectArray[11]), (rrzT_2)((Object)objectArray[12]), (rrzT_2)((Object)objectArray[13]), (rrzT_2)((Object)objectArray[14])}};
        staticFieldsf131934b317338e68bb375b05e34a601 = objectArray;
    }

    static {
        rrzT_2.ntfClinit();
    }

    public static rrzT_2[] values() {
        return (rrzT_2[])((rrzT_2[])staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[0]]).clone();
    }

    public static rrzT_2 valueOf(String string) {
        return Enum.valueOf(rrzT_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{43, 77, 111, 115, -54, -3, 49, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBE253555B0F4508DL;
    }

    private static void id_class() {
        bytesf131934b317338e68bb375b05e34a601 = new byte[]{15, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 16};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9578FAA3;
    }

    private static /* synthetic */ rrzT_2[] id_break() {
        rrzT_2[] rrzT_2Array = new rrzT_2[bytesf131934b317338e68bb375b05e34a601[0]];
        rrzT_2Array[rrzT_2.booleansf131934b317338e68bb375b05e34a601[0]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[1]]);
        rrzT_2Array[rrzT_2.booleansf131934b317338e68bb375b05e34a601[1]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[2]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[1]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[3]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[2]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[4]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[3]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[5]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[4]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[6]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[5]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[7]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[6]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[8]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[7]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[9]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[8]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[10]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[9]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[11]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[10]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[12]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[11]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[13]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[12]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[14]]);
        rrzT_2Array[rrzT_2.bytesf131934b317338e68bb375b05e34a601[13]] = (rrzT_2)((Object)staticFieldsf131934b317338e68bb375b05e34a601[shortsf131934b317338e68bb375b05e34a601[15]]);
        return rrzT_2Array;
    }

    private static void id_throws() {
        stringsf131934b317338e68bb375b05e34a601 = new String[]{new String("size"), new String("creationTime"), new String("lastAccessTime"), new String("lastModifiedTime"), new String("isDirectory"), new String("isRegularFile"), new String("isSymbolicLink"), new String("isOther"), new String("fileKey"), new String("compressedSize"), new String("crc"), new String("method"), new String("owner"), new String("group"), new String("permissions")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrzT_2.id_protected();
        rrzT_2.id_throws();
        rrzT_2.id_case();
        rrzT_2.id_class();
        rrzT_2.id_byte();
    }

    private static void id_case() {
        short[] sArray = new short[16];
        sArray[0] = 15;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 5;
        sArray[7] = 6;
        sArray[8] = 7;
        sArray[9] = 8;
        sArray[10] = 9;
        sArray[11] = 10;
        sArray[12] = 11;
        sArray[13] = 12;
        sArray[14] = 13;
        sArray[15] = 14;
        shortsf131934b317338e68bb375b05e34a601 = sArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansf131934b317338e68bb375b05e34a601 = blArray;
    }
}

