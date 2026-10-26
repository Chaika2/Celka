/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrNu_1
extends Enum<rrNu_1> {
    private static boolean[] booleansd295d8674c763b5f9f18e6479c787fcc;
    private static byte[] bytesd295d8674c763b5f9f18e6479c787fcc;
    public static Object[] staticFieldsd295d8674c763b5f9f18e6479c787fcc;
    private static short[] shortsd295d8674c763b5f9f18e6479c787fcc;
    private static String[] stringsd295d8674c763b5f9f18e6479c787fcc;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrNu_1(), new rrNu_1(), new rrNu_1[]{(rrNu_1)((Object)objectArray[0]), (rrNu_1)((Object)objectArray[1])}};
        staticFieldsd295d8674c763b5f9f18e6479c787fcc = objectArray;
    }

    static {
        rrNu_1.ntfClinit();
    }

    public static rrNu_1[] values() {
        return (rrNu_1[])((rrNu_1[])staticFieldsd295d8674c763b5f9f18e6479c787fcc[shortsd295d8674c763b5f9f18e6479c787fcc[0]]).clone();
    }

    public static rrNu_1 valueOf(String string) {
        return Enum.valueOf(rrNu_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-62, 107, 22, 51, 17, -58, 96, -15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shortsd295d8674c763b5f9f18e6479c787fcc = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5A9339B94E0B3118L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x40A2D9D2;
    }

    private static void id_break() {
        bytesd295d8674c763b5f9f18e6479c787fcc = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ rrNu_1[] id_throws() {
        rrNu_1[] rrNu_1Array = new rrNu_1[bytesd295d8674c763b5f9f18e6479c787fcc[0]];
        rrNu_1Array[rrNu_1.booleansd295d8674c763b5f9f18e6479c787fcc[0]] = (rrNu_1)((Object)staticFieldsd295d8674c763b5f9f18e6479c787fcc[shortsd295d8674c763b5f9f18e6479c787fcc[1]]);
        rrNu_1Array[rrNu_1.booleansd295d8674c763b5f9f18e6479c787fcc[1]] = (rrNu_1)((Object)staticFieldsd295d8674c763b5f9f18e6479c787fcc[shortsd295d8674c763b5f9f18e6479c787fcc[2]]);
        return rrNu_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrNu_1.id_protected();
        rrNu_1.id_case();
        rrNu_1.id_class();
        rrNu_1.id_break();
        rrNu_1.id_byte();
    }

    private static void id_case() {
        stringsd295d8674c763b5f9f18e6479c787fcc = new String[]{new String("RECONNECTING"), new String("OPEN_AUCTION")};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansd295d8674c763b5f9f18e6479c787fcc = blArray;
    }
}

