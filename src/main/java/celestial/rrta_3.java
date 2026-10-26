/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrta_3
extends Enum<rrta_3> {
    private static boolean[] booleans0b9ba99d5751335787deb45ab94d73c6;
    public static Object[] staticFields0b9ba99d5751335787deb45ab94d73c6;
    private static String[] strings0b9ba99d5751335787deb45ab94d73c6;
    private static short[] shorts0b9ba99d5751335787deb45ab94d73c6;
    private static byte[] bytes0b9ba99d5751335787deb45ab94d73c6;

    private static /* synthetic */ rrta_3[] id_byte() {
        rrta_3[] rrta_3Array = new rrta_3[bytes0b9ba99d5751335787deb45ab94d73c6[0]];
        rrta_3Array[rrta_3.booleans0b9ba99d5751335787deb45ab94d73c6[0]] = (rrta_3)((Object)staticFields0b9ba99d5751335787deb45ab94d73c6[shorts0b9ba99d5751335787deb45ab94d73c6[1]]);
        rrta_3Array[rrta_3.booleans0b9ba99d5751335787deb45ab94d73c6[1]] = (rrta_3)((Object)staticFields0b9ba99d5751335787deb45ab94d73c6[shorts0b9ba99d5751335787deb45ab94d73c6[2]]);
        return rrta_3Array;
    }

    static {
        rrta_3.ntfClinit();
    }

    public static rrta_3[] values() {
        return (rrta_3[])((rrta_3[])staticFields0b9ba99d5751335787deb45ab94d73c6[shorts0b9ba99d5751335787deb45ab94d73c6[0]]).clone();
    }

    public static rrta_3 valueOf(String string) {
        return Enum.valueOf(rrta_3.class, string);
    }

    private static void id_class() {
        strings0b9ba99d5751335787deb45ab94d73c6 = new String[]{new String("KEY_TYPED"), new String("FOCUS_LOST")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x37A5234DD6BC00A0L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-13, -67, -26, -22, -57, 59, -45, -121}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDB704852;
    }

    private static void id_break() {
        bytes0b9ba99d5751335787deb45ab94d73c6 = new byte[]{2, 2, 3};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrta_3(), new rrta_3(), new rrta_3[]{(rrta_3)((Object)objectArray[0]), (rrta_3)((Object)objectArray[1])}};
        staticFields0b9ba99d5751335787deb45ab94d73c6 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrta_3.id_case();
        rrta_3.id_class();
        rrta_3.id_protected();
        rrta_3.id_break();
        rrta_3.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans0b9ba99d5751335787deb45ab94d73c6 = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts0b9ba99d5751335787deb45ab94d73c6 = sArray;
    }
}

