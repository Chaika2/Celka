/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFa_1
extends Enum<rrFa_1> {
    private static short[] shortsc276c0e8494830db9e45df4464b752ad;
    public static Object[] staticFieldsc276c0e8494830db9e45df4464b752ad;
    private static String[] stringsc276c0e8494830db9e45df4464b752ad;
    private static boolean[] booleansc276c0e8494830db9e45df4464b752ad;
    private static byte[] bytesc276c0e8494830db9e45df4464b752ad;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrFa_1(), new rrFa_1(), new rrFa_1[]{(rrFa_1)((Object)objectArray[0]), (rrFa_1)((Object)objectArray[1])}};
        staticFieldsc276c0e8494830db9e45df4464b752ad = objectArray;
    }

    static {
        rrFa_1.ntfClinit();
    }

    public static rrFa_1[] values() {
        return (rrFa_1[])((rrFa_1[])staticFieldsc276c0e8494830db9e45df4464b752ad[shortsc276c0e8494830db9e45df4464b752ad[0]]).clone();
    }

    public static rrFa_1 valueOf(String string) {
        return Enum.valueOf(rrFa_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-120, 37, 26, -50, -72, -58, 72, -75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shortsc276c0e8494830db9e45df4464b752ad = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x57D747DA;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC2AAE67086BC7721L;
    }

    private static /* synthetic */ rrFa_1[] id_break() {
        rrFa_1[] rrFa_1Array = new rrFa_1[bytesc276c0e8494830db9e45df4464b752ad[0]];
        rrFa_1Array[rrFa_1.booleansc276c0e8494830db9e45df4464b752ad[0]] = (rrFa_1)((Object)staticFieldsc276c0e8494830db9e45df4464b752ad[shortsc276c0e8494830db9e45df4464b752ad[1]]);
        rrFa_1Array[rrFa_1.booleansc276c0e8494830db9e45df4464b752ad[1]] = (rrFa_1)((Object)staticFieldsc276c0e8494830db9e45df4464b752ad[shortsc276c0e8494830db9e45df4464b752ad[2]]);
        return rrFa_1Array;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansc276c0e8494830db9e45df4464b752ad = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrFa_1.id_throws();
        rrFa_1.id_protected();
        rrFa_1.id_class();
        rrFa_1.id_case();
        rrFa_1.id_byte();
    }

    private static void id_case() {
        bytesc276c0e8494830db9e45df4464b752ad = new byte[]{2, 2, 3};
    }

    private static void id_protected() {
        stringsc276c0e8494830db9e45df4464b752ad = new String[]{new String("REFRESH"), new String("DISABLE_PURCHASE")};
    }
}

