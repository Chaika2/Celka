/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rk_3
extends Enum<rk_3> {
    public static Object[] staticFields5f483cd00ec6343b89d8ec7a44fc67de;
    public Object[] fields5f483cd00ec6343b89d8ec7a44fc67de;
    private static boolean[] booleans5f483cd00ec6343b89d8ec7a44fc67de;
    private static String[] strings5f483cd00ec6343b89d8ec7a44fc67de;
    private static short[] shorts5f483cd00ec6343b89d8ec7a44fc67de;
    private static byte[] bytes5f483cd00ec6343b89d8ec7a44fc67de;

    private static /* synthetic */ rk_3[] id_byte() {
        rk_3[] rk_3Array = new rk_3[bytes5f483cd00ec6343b89d8ec7a44fc67de[0]];
        rk_3Array[rk_3.booleans5f483cd00ec6343b89d8ec7a44fc67de[0]] = (rk_3)((Object)staticFields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[3]]);
        rk_3Array[rk_3.booleans5f483cd00ec6343b89d8ec7a44fc67de[1]] = (rk_3)((Object)staticFields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[4]]);
        rk_3Array[rk_3.bytes5f483cd00ec6343b89d8ec7a44fc67de[1]] = (rk_3)((Object)staticFields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[5]]);
        rk_3Array[rk_3.bytes5f483cd00ec6343b89d8ec7a44fc67de[2]] = (rk_3)((Object)staticFields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[6]]);
        rk_3Array[rk_3.bytes5f483cd00ec6343b89d8ec7a44fc67de[3]] = (rk_3)((Object)staticFields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[7]]);
        rk_3Array[rk_3.bytes5f483cd00ec6343b89d8ec7a44fc67de[4]] = (rk_3)((Object)staticFields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[8]]);
        rk_3Array[rk_3.bytes5f483cd00ec6343b89d8ec7a44fc67de[5]] = (rk_3)((Object)staticFields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[9]]);
        return rk_3Array;
    }

    private rk_3(boolean bl) {
        this.id_private();
        Boolean bl2 = bl;
        this.fields5f483cd00ec6343b89d8ec7a44fc67de[rk_3.shorts5f483cd00ec6343b89d8ec7a44fc67de[1]] = bl2;
    }

    static {
        rk_3.ntfClinit();
    }

    public static rk_3[] values() {
        return (rk_3[])((rk_3[])staticFields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[0]]).clone();
    }

    public static rk_3 valueOf(String string) {
        return Enum.valueOf(rk_3.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6F95E855392FFD89L;
    }

    public boolean id_class() {
        return (Boolean)this.fields5f483cd00ec6343b89d8ec7a44fc67de[shorts5f483cd00ec6343b89d8ec7a44fc67de[2]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x139AC301;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{98, -45, -128, -51, -127, 74, -116, -60}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[10];
        sArray[0] = 7;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        sArray[7] = 4;
        sArray[8] = 5;
        sArray[9] = 6;
        shorts5f483cd00ec6343b89d8ec7a44fc67de = sArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[16];
        blArray[1] = true;
        blArray[5] = true;
        blArray[7] = true;
        blArray[9] = true;
        blArray[10] = true;
        blArray[11] = true;
        blArray[12] = true;
        blArray[13] = true;
        booleans5f483cd00ec6343b89d8ec7a44fc67de = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rk_3.id_throws();
        rk_3.id_protected();
        rk_3.id_break();
        rk_3.id_case();
        rk_3.id_catch();
    }

    private static void id_catch() {
        Object[] objectArray;
        objectArray = new Object[]{new rk_3(false), new rk_3(false), new rk_3(false), new rk_3(true), new rk_3(true), new rk_3(true), new rk_3(true), new rk_3[]{(rk_3)((Object)objectArray[0]), (rk_3)((Object)objectArray[1]), (rk_3)((Object)objectArray[2]), (rk_3)((Object)objectArray[3]), (rk_3)((Object)objectArray[4]), (rk_3)((Object)objectArray[5]), (rk_3)((Object)objectArray[6])}};
        staticFields5f483cd00ec6343b89d8ec7a44fc67de = objectArray;
    }

    private static void id_case() {
        bytes5f483cd00ec6343b89d8ec7a44fc67de = new byte[]{7, 2, 3, 4, 5, 6, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 8};
    }

    private static void id_protected() {
        strings5f483cd00ec6343b89d8ec7a44fc67de = new String[]{new String("PREPPING"), new String("WAITING"), new String("RUNNING"), new String("SUCCESS"), new String("UNREACHABLE"), new String("FAILED"), new String("CANCELED")};
    }

    private void id_private() {
        if (this.fields5f483cd00ec6343b89d8ec7a44fc67de == null) {
            Object[] objectArray = this.fields5f483cd00ec6343b89d8ec7a44fc67de = new Object[booleans5f483cd00ec6343b89d8ec7a44fc67de[13]];
            objectArray[rk_3.booleans5f483cd00ec6343b89d8ec7a44fc67de[14]] = booleans5f483cd00ec6343b89d8ec7a44fc67de[15];
        }
    }
}

