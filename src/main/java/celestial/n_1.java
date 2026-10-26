/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class n_1
extends Enum<n_1> {
    private static String[] stringse7df95b1dfb038edb75e6ac1f750d600;
    private static byte[] bytese7df95b1dfb038edb75e6ac1f750d600;
    private static short[] shortse7df95b1dfb038edb75e6ac1f750d600;
    public static Object[] staticFieldse7df95b1dfb038edb75e6ac1f750d600;
    private static boolean[] booleanse7df95b1dfb038edb75e6ac1f750d600;

    private static void id_byte() {
        stringse7df95b1dfb038edb75e6ac1f750d600 = new String[]{new String("START_BREAK"), new String("USE")};
    }

    static {
        n_1.ntfClinit();
    }

    public static n_1[] values() {
        return (n_1[])((n_1[])staticFieldse7df95b1dfb038edb75e6ac1f750d600[shortse7df95b1dfb038edb75e6ac1f750d600[0]]).clone();
    }

    public static n_1 valueOf(String string) {
        return Enum.valueOf(n_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8393E02FF2BB6C6AL;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleanse7df95b1dfb038edb75e6ac1f750d600 = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-88, 97, -43, 72, 55, 106, -24, 30}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAADB68ED;
    }

    private static /* synthetic */ n_1[] id_break() {
        n_1[] n_1Array = new n_1[bytese7df95b1dfb038edb75e6ac1f750d600[0]];
        n_1Array[n_1.booleanse7df95b1dfb038edb75e6ac1f750d600[0]] = (n_1)((Object)staticFieldse7df95b1dfb038edb75e6ac1f750d600[shortse7df95b1dfb038edb75e6ac1f750d600[1]]);
        n_1Array[n_1.booleanse7df95b1dfb038edb75e6ac1f750d600[1]] = (n_1)((Object)staticFieldse7df95b1dfb038edb75e6ac1f750d600[shortse7df95b1dfb038edb75e6ac1f750d600[2]]);
        return n_1Array;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new n_1(), new n_1(), new n_1[]{(n_1)((Object)objectArray[0]), (n_1)((Object)objectArray[1])}};
        staticFieldse7df95b1dfb038edb75e6ac1f750d600 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        n_1.id_class();
        n_1.id_byte();
        n_1.id_protected();
        n_1.id_case();
        n_1.id_throws();
    }

    private static void id_case() {
        bytese7df95b1dfb038edb75e6ac1f750d600 = new byte[]{2, 2, 3};
    }

    private static void id_protected() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shortse7df95b1dfb038edb75e6ac1f750d600 = sArray;
    }
}

