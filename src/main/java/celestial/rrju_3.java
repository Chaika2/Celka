/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrju_3
extends Enum<rrju_3> {
    private static String[] stringsaad619fe5d0133909138b6cd23b7fdf1;
    private static short[] shortsaad619fe5d0133909138b6cd23b7fdf1;
    private static byte[] bytesaad619fe5d0133909138b6cd23b7fdf1;
    public static Object[] staticFieldsaad619fe5d0133909138b6cd23b7fdf1;
    private static boolean[] booleansaad619fe5d0133909138b6cd23b7fdf1;

    private static void id_byte() {
        bytesaad619fe5d0133909138b6cd23b7fdf1 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    static {
        rrju_3.ntfClinit();
    }

    public static rrju_3[] values() {
        return (rrju_3[])((rrju_3[])staticFieldsaad619fe5d0133909138b6cd23b7fdf1[shortsaad619fe5d0133909138b6cd23b7fdf1[0]]).clone();
    }

    public static rrju_3 valueOf(String string) {
        return Enum.valueOf(rrju_3.class, string);
    }

    private static /* synthetic */ rrju_3[] id_class() {
        rrju_3[] rrju_3Array = new rrju_3[bytesaad619fe5d0133909138b6cd23b7fdf1[0]];
        rrju_3Array[rrju_3.booleansaad619fe5d0133909138b6cd23b7fdf1[0]] = (rrju_3)((Object)staticFieldsaad619fe5d0133909138b6cd23b7fdf1[shortsaad619fe5d0133909138b6cd23b7fdf1[1]]);
        rrju_3Array[rrju_3.booleansaad619fe5d0133909138b6cd23b7fdf1[1]] = (rrju_3)((Object)staticFieldsaad619fe5d0133909138b6cd23b7fdf1[shortsaad619fe5d0133909138b6cd23b7fdf1[2]]);
        rrju_3Array[rrju_3.bytesaad619fe5d0133909138b6cd23b7fdf1[1]] = (rrju_3)((Object)staticFieldsaad619fe5d0133909138b6cd23b7fdf1[shortsaad619fe5d0133909138b6cd23b7fdf1[3]]);
        return rrju_3Array;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA001896E;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{79, 109, -17, -26, -13, -63, 73, 25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x84B3143D20105818L;
    }

    private static void id_break() {
        stringsaad619fe5d0133909138b6cd23b7fdf1 = new String[]{new String("CLOSEST"), new String("FURTHEST"), new String("NONE")};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansaad619fe5d0133909138b6cd23b7fdf1 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrju_3.id_throws();
        rrju_3.id_break();
        rrju_3.id_case();
        rrju_3.id_byte();
        rrju_3.id_protected();
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsaad619fe5d0133909138b6cd23b7fdf1 = sArray;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrju_3(), new rrju_3(), new rrju_3(), new rrju_3[]{(rrju_3)((Object)objectArray[0]), (rrju_3)((Object)objectArray[1]), (rrju_3)((Object)objectArray[2])}};
        staticFieldsaad619fe5d0133909138b6cd23b7fdf1 = objectArray;
    }
}

