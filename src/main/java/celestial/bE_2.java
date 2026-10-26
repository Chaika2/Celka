/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bE_2
extends Enum<bE_2> {
    private static boolean[] booleans41d67a8911663c568d38045d1ac26747;
    private static String[] strings41d67a8911663c568d38045d1ac26747;
    private static short[] shorts41d67a8911663c568d38045d1ac26747;
    private static byte[] bytes41d67a8911663c568d38045d1ac26747;
    public static Object[] staticFields41d67a8911663c568d38045d1ac26747;

    private static void id_byte() {
        strings41d67a8911663c568d38045d1ac26747 = new String[]{new String("CHEST"), new String("SHULKER_BOX"), new String("ANVIL"), new String("ENCHANTING_TABLE"), new String("BARREL"), new String("FURNACE")};
    }

    static {
        bE_2.ntfClinit();
    }

    public static bE_2[] values() {
        return (bE_2[])((bE_2[])staticFields41d67a8911663c568d38045d1ac26747[shorts41d67a8911663c568d38045d1ac26747[0]]).clone();
    }

    public static bE_2 valueOf(String string) {
        return Enum.valueOf(bE_2.class, string);
    }

    private static /* synthetic */ bE_2[] id_class() {
        bE_2[] bE_2Array = new bE_2[bytes41d67a8911663c568d38045d1ac26747[0]];
        bE_2Array[bE_2.booleans41d67a8911663c568d38045d1ac26747[0]] = (bE_2)((Object)staticFields41d67a8911663c568d38045d1ac26747[shorts41d67a8911663c568d38045d1ac26747[1]]);
        bE_2Array[bE_2.booleans41d67a8911663c568d38045d1ac26747[1]] = (bE_2)((Object)staticFields41d67a8911663c568d38045d1ac26747[shorts41d67a8911663c568d38045d1ac26747[2]]);
        bE_2Array[bE_2.bytes41d67a8911663c568d38045d1ac26747[1]] = (bE_2)((Object)staticFields41d67a8911663c568d38045d1ac26747[shorts41d67a8911663c568d38045d1ac26747[3]]);
        bE_2Array[bE_2.bytes41d67a8911663c568d38045d1ac26747[2]] = (bE_2)((Object)staticFields41d67a8911663c568d38045d1ac26747[shorts41d67a8911663c568d38045d1ac26747[4]]);
        bE_2Array[bE_2.bytes41d67a8911663c568d38045d1ac26747[3]] = (bE_2)((Object)staticFields41d67a8911663c568d38045d1ac26747[shorts41d67a8911663c568d38045d1ac26747[5]]);
        bE_2Array[bE_2.bytes41d67a8911663c568d38045d1ac26747[4]] = (bE_2)((Object)staticFields41d67a8911663c568d38045d1ac26747[shorts41d67a8911663c568d38045d1ac26747[6]]);
        return bE_2Array;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-63, 111, 77, 118, -106, -35, -127, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA4A1C064;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFC74771B525F0B54L;
    }

    private static void id_break() {
        short[] sArray = new short[7];
        sArray[0] = 6;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 5;
        shorts41d67a8911663c568d38045d1ac26747 = sArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans41d67a8911663c568d38045d1ac26747 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        bE_2.id_throws();
        bE_2.id_byte();
        bE_2.id_break();
        bE_2.id_case();
        bE_2.id_protected();
    }

    private static void id_case() {
        bytes41d67a8911663c568d38045d1ac26747 = new byte[]{6, 2, 3, 4, 5, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new bE_2(), new bE_2(), new bE_2(), new bE_2(), new bE_2(), new bE_2(), new bE_2[]{(bE_2)((Object)objectArray[0]), (bE_2)((Object)objectArray[1]), (bE_2)((Object)objectArray[2]), (bE_2)((Object)objectArray[3]), (bE_2)((Object)objectArray[4]), (bE_2)((Object)objectArray[5])}};
        staticFields41d67a8911663c568d38045d1ac26747 = objectArray;
    }
}

