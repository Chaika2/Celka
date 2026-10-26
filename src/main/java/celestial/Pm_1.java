/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pm_1
extends Enum<Pm_1> {
    private static short[] shortsd2ae74894aa334618e73ed450cdbde1f;
    private static byte[] bytesd2ae74894aa334618e73ed450cdbde1f;
    private static String[] stringsd2ae74894aa334618e73ed450cdbde1f;
    public static Object[] staticFieldsd2ae74894aa334618e73ed450cdbde1f;
    private static boolean[] booleansd2ae74894aa334618e73ed450cdbde1f;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1(), new Pm_1[]{(Pm_1)((Object)objectArray[0]), (Pm_1)((Object)objectArray[1]), (Pm_1)((Object)objectArray[2]), (Pm_1)((Object)objectArray[3]), (Pm_1)((Object)objectArray[4]), (Pm_1)((Object)objectArray[5]), (Pm_1)((Object)objectArray[6]), (Pm_1)((Object)objectArray[7]), (Pm_1)((Object)objectArray[8])}};
        staticFieldsd2ae74894aa334618e73ed450cdbde1f = objectArray;
    }

    static {
        Pm_1.ntfClinit();
    }

    public static Pm_1[] values() {
        return (Pm_1[])((Pm_1[])staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[0]]).clone();
    }

    public static Pm_1 valueOf(String string) {
        return Enum.valueOf(Pm_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xF6953A61;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x49B4B6D82A8DF02CL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-12, -8, 56, -52, -18, -118, 119, 122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansd2ae74894aa334618e73ed450cdbde1f = blArray;
    }

    private static void id_break() {
        bytesd2ae74894aa334618e73ed450cdbde1f = new byte[]{9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10};
    }

    private static void id_throws() {
        short[] sArray = new short[10];
        sArray[0] = 9;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 5;
        sArray[7] = 6;
        sArray[8] = 7;
        sArray[9] = 8;
        shortsd2ae74894aa334618e73ed450cdbde1f = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Pm_1.id_class();
        Pm_1.id_protected();
        Pm_1.id_throws();
        Pm_1.id_break();
        Pm_1.id_byte();
    }

    private static /* synthetic */ Pm_1[] id_case() {
        Pm_1[] pm_1Array = new Pm_1[bytesd2ae74894aa334618e73ed450cdbde1f[0]];
        pm_1Array[Pm_1.booleansd2ae74894aa334618e73ed450cdbde1f[0]] = (Pm_1)((Object)staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[1]]);
        pm_1Array[Pm_1.booleansd2ae74894aa334618e73ed450cdbde1f[1]] = (Pm_1)((Object)staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[2]]);
        pm_1Array[Pm_1.bytesd2ae74894aa334618e73ed450cdbde1f[1]] = (Pm_1)((Object)staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[3]]);
        pm_1Array[Pm_1.bytesd2ae74894aa334618e73ed450cdbde1f[2]] = (Pm_1)((Object)staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[4]]);
        pm_1Array[Pm_1.bytesd2ae74894aa334618e73ed450cdbde1f[3]] = (Pm_1)((Object)staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[5]]);
        pm_1Array[Pm_1.bytesd2ae74894aa334618e73ed450cdbde1f[4]] = (Pm_1)((Object)staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[6]]);
        pm_1Array[Pm_1.bytesd2ae74894aa334618e73ed450cdbde1f[5]] = (Pm_1)((Object)staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[7]]);
        pm_1Array[Pm_1.bytesd2ae74894aa334618e73ed450cdbde1f[6]] = (Pm_1)((Object)staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[8]]);
        pm_1Array[Pm_1.bytesd2ae74894aa334618e73ed450cdbde1f[7]] = (Pm_1)((Object)staticFieldsd2ae74894aa334618e73ed450cdbde1f[shortsd2ae74894aa334618e73ed450cdbde1f[9]]);
        return pm_1Array;
    }

    private static void id_protected() {
        stringsd2ae74894aa334618e73ed450cdbde1f = new String[]{new String("MOVE_FORWARD"), new String("MOVE_BACK"), new String("MOVE_LEFT"), new String("MOVE_RIGHT"), new String("CLICK_LEFT"), new String("CLICK_RIGHT"), new String("JUMP"), new String("SNEAK"), new String("SPRINT")};
    }
}

