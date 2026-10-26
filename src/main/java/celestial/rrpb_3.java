/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpb_3
extends Enum<rrpb_3> {
    private static byte[] bytes91a494c78a8435468eb612e156e4cedc;
    private static boolean[] booleans91a494c78a8435468eb612e156e4cedc;
    private static short[] shorts91a494c78a8435468eb612e156e4cedc;
    public static Object[] staticFields91a494c78a8435468eb612e156e4cedc;
    private static String[] strings91a494c78a8435468eb612e156e4cedc;

    private static /* synthetic */ rrpb_3[] id_byte() {
        rrpb_3[] rrpb_3Array = new rrpb_3[bytes91a494c78a8435468eb612e156e4cedc[0]];
        rrpb_3Array[rrpb_3.booleans91a494c78a8435468eb612e156e4cedc[0]] = (rrpb_3)((Object)staticFields91a494c78a8435468eb612e156e4cedc[shorts91a494c78a8435468eb612e156e4cedc[1]]);
        rrpb_3Array[rrpb_3.booleans91a494c78a8435468eb612e156e4cedc[1]] = (rrpb_3)((Object)staticFields91a494c78a8435468eb612e156e4cedc[shorts91a494c78a8435468eb612e156e4cedc[2]]);
        rrpb_3Array[rrpb_3.bytes91a494c78a8435468eb612e156e4cedc[1]] = (rrpb_3)((Object)staticFields91a494c78a8435468eb612e156e4cedc[shorts91a494c78a8435468eb612e156e4cedc[3]]);
        return rrpb_3Array;
    }

    static {
        rrpb_3.ntfClinit();
    }

    public static rrpb_3[] values() {
        return (rrpb_3[])((rrpb_3[])staticFields91a494c78a8435468eb612e156e4cedc[shorts91a494c78a8435468eb612e156e4cedc[0]]).clone();
    }

    public static rrpb_3 valueOf(String string) {
        return Enum.valueOf(rrpb_3.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5959CACC27A5DE37L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x58ED2835;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-92, 93, -125, 117, 13, -19, -41, -112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpb_3(), new rrpb_3(), new rrpb_3(), new rrpb_3[]{(rrpb_3)((Object)objectArray[0]), (rrpb_3)((Object)objectArray[1]), (rrpb_3)((Object)objectArray[2])}};
        staticFields91a494c78a8435468eb612e156e4cedc = objectArray;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans91a494c78a8435468eb612e156e4cedc = blArray;
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts91a494c78a8435468eb612e156e4cedc = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpb_3.id_break();
        rrpb_3.id_protected();
        rrpb_3.id_throws();
        rrpb_3.id_case();
        rrpb_3.id_class();
    }

    private static void id_case() {
        bytes91a494c78a8435468eb612e156e4cedc = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_protected() {
        strings91a494c78a8435468eb612e156e4cedc = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }
}

