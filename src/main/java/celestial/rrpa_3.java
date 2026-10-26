/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpa_3
extends Enum<rrpa_3> {
    private static String[] strings056fc31e671730e3aeb58e324ad8a234;
    private static boolean[] booleans056fc31e671730e3aeb58e324ad8a234;
    private static byte[] bytes056fc31e671730e3aeb58e324ad8a234;
    public static Object[] staticFields056fc31e671730e3aeb58e324ad8a234;
    private static short[] shorts056fc31e671730e3aeb58e324ad8a234;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpa_3(), new rrpa_3(), new rrpa_3(), new rrpa_3[]{(rrpa_3)((Object)objectArray[0]), (rrpa_3)((Object)objectArray[1]), (rrpa_3)((Object)objectArray[2])}};
        staticFields056fc31e671730e3aeb58e324ad8a234 = objectArray;
    }

    static {
        rrpa_3.ntfClinit();
    }

    public static rrpa_3[] values() {
        return (rrpa_3[])((rrpa_3[])staticFields056fc31e671730e3aeb58e324ad8a234[shorts056fc31e671730e3aeb58e324ad8a234[0]]).clone();
    }

    public static rrpa_3 valueOf(String string) {
        return Enum.valueOf(rrpa_3.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD63FD47C15C21750L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x718E9C05;
    }

    private static void id_class() {
        strings056fc31e671730e3aeb58e324ad8a234 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{118, -44, 7, 117, -57, -43, 72, 2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts056fc31e671730e3aeb58e324ad8a234 = sArray;
    }

    private static void id_throws() {
        bytes056fc31e671730e3aeb58e324ad8a234 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpa_3.id_protected();
        rrpa_3.id_class();
        rrpa_3.id_break();
        rrpa_3.id_throws();
        rrpa_3.id_byte();
    }

    private static /* synthetic */ rrpa_3[] id_case() {
        rrpa_3[] rrpa_3Array = new rrpa_3[bytes056fc31e671730e3aeb58e324ad8a234[0]];
        rrpa_3Array[rrpa_3.booleans056fc31e671730e3aeb58e324ad8a234[0]] = (rrpa_3)((Object)staticFields056fc31e671730e3aeb58e324ad8a234[shorts056fc31e671730e3aeb58e324ad8a234[1]]);
        rrpa_3Array[rrpa_3.booleans056fc31e671730e3aeb58e324ad8a234[1]] = (rrpa_3)((Object)staticFields056fc31e671730e3aeb58e324ad8a234[shorts056fc31e671730e3aeb58e324ad8a234[2]]);
        rrpa_3Array[rrpa_3.bytes056fc31e671730e3aeb58e324ad8a234[1]] = (rrpa_3)((Object)staticFields056fc31e671730e3aeb58e324ad8a234[shorts056fc31e671730e3aeb58e324ad8a234[3]]);
        return rrpa_3Array;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans056fc31e671730e3aeb58e324ad8a234 = blArray;
    }
}

