/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Pn_1
extends Enum<Pn_1> {
    private static short[] shorts96e7b83c036d3953981f6df41072b416;
    private static boolean[] booleans96e7b83c036d3953981f6df41072b416;
    private static String[] strings96e7b83c036d3953981f6df41072b416;
    private static byte[] bytes96e7b83c036d3953981f6df41072b416;
    public static Object[] staticFields96e7b83c036d3953981f6df41072b416;

    private static void id_byte() {
        bytes96e7b83c036d3953981f6df41072b416 = new byte[]{2, 2, 3};
    }

    static {
        Pn_1.ntfClinit();
    }

    public static Pn_1[] values() {
        return (Pn_1[])((Pn_1[])staticFields96e7b83c036d3953981f6df41072b416[shorts96e7b83c036d3953981f6df41072b416[0]]).clone();
    }

    public static Pn_1 valueOf(String string) {
        return Enum.valueOf(Pn_1.class, string);
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new Pn_1(), new Pn_1(), new Pn_1[]{(Pn_1)((Object)objectArray[0]), (Pn_1)((Object)objectArray[1])}};
        staticFields96e7b83c036d3953981f6df41072b416 = objectArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x92BBA96E;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-38, 108, -13, -73, 82, -35, -84, -45}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8AFCADD23AFBEA07L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans96e7b83c036d3953981f6df41072b416 = blArray;
    }

    private static void id_throws() {
        strings96e7b83c036d3953981f6df41072b416 = new String[]{new String("RECONNECTING"), new String("PENDING_AH_AVAILABILITY")};
    }

    private static /* synthetic */ void ntfClinit() {
        Pn_1.id_break();
        Pn_1.id_throws();
        Pn_1.id_protected();
        Pn_1.id_byte();
        Pn_1.id_class();
    }

    private static /* synthetic */ Pn_1[] id_case() {
        Pn_1[] pn_1Array = new Pn_1[bytes96e7b83c036d3953981f6df41072b416[0]];
        pn_1Array[Pn_1.booleans96e7b83c036d3953981f6df41072b416[0]] = (Pn_1)((Object)staticFields96e7b83c036d3953981f6df41072b416[shorts96e7b83c036d3953981f6df41072b416[1]]);
        pn_1Array[Pn_1.booleans96e7b83c036d3953981f6df41072b416[1]] = (Pn_1)((Object)staticFields96e7b83c036d3953981f6df41072b416[shorts96e7b83c036d3953981f6df41072b416[2]]);
        return pn_1Array;
    }

    private static void id_protected() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts96e7b83c036d3953981f6df41072b416 = sArray;
    }
}

