/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrlw_3
extends Enum<rrlw_3> {
    private static String[] stringsff97087b8aec3a608f6e6f0bcbd5ed33;
    private static boolean[] booleansff97087b8aec3a608f6e6f0bcbd5ed33;
    private static byte[] bytesff97087b8aec3a608f6e6f0bcbd5ed33;
    public static Object[] staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33;
    private static short[] shortsff97087b8aec3a608f6e6f0bcbd5ed33;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrlw_3(), new rrlw_3(), new rrlw_3[]{(rrlw_3)((Object)objectArray[0]), (rrlw_3)((Object)objectArray[1])}};
        staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33 = objectArray;
    }

    static {
        rrlw_3.ntfClinit();
    }

    public static rrlw_3[] values() {
        return (rrlw_3[])((rrlw_3[])staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[shortsff97087b8aec3a608f6e6f0bcbd5ed33[0]]).clone();
    }

    public static rrlw_3 valueOf(String string) {
        return Enum.valueOf(rrlw_3.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x50CA99C1;
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shortsff97087b8aec3a608f6e6f0bcbd5ed33 = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4D23C7BA0CCE7FL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{102, -88, -16, -12, -124, 36, 10, 118}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansff97087b8aec3a608f6e6f0bcbd5ed33 = blArray;
    }

    private static void id_throws() {
        bytesff97087b8aec3a608f6e6f0bcbd5ed33 = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrlw_3.id_break();
        rrlw_3.id_protected();
        rrlw_3.id_class();
        rrlw_3.id_throws();
        rrlw_3.id_byte();
    }

    private static /* synthetic */ rrlw_3[] id_case() {
        rrlw_3[] rrlw_3Array = new rrlw_3[bytesff97087b8aec3a608f6e6f0bcbd5ed33[0]];
        rrlw_3Array[rrlw_3.booleansff97087b8aec3a608f6e6f0bcbd5ed33[0]] = (rrlw_3)((Object)staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[shortsff97087b8aec3a608f6e6f0bcbd5ed33[1]]);
        rrlw_3Array[rrlw_3.booleansff97087b8aec3a608f6e6f0bcbd5ed33[1]] = (rrlw_3)((Object)staticFieldsff97087b8aec3a608f6e6f0bcbd5ed33[shortsff97087b8aec3a608f6e6f0bcbd5ed33[2]]);
        return rrlw_3Array;
    }

    private static void id_protected() {
        stringsff97087b8aec3a608f6e6f0bcbd5ed33 = new String[]{new String("WAITING_FOR_ACCEPT"), new String("ACCEPTED")};
    }
}

