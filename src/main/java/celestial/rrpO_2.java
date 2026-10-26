/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpO_2
extends Enum<rrpO_2> {
    private static byte[] bytes4014939632583c5ba36d4475b7d8caf4;
    public static Object[] staticFields4014939632583c5ba36d4475b7d8caf4;
    private static short[] shorts4014939632583c5ba36d4475b7d8caf4;
    private static String[] strings4014939632583c5ba36d4475b7d8caf4;
    private static boolean[] booleans4014939632583c5ba36d4475b7d8caf4;

    private static void id_byte() {
        bytes4014939632583c5ba36d4475b7d8caf4 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    static {
        rrpO_2.ntfClinit();
    }

    public static rrpO_2[] values() {
        return (rrpO_2[])((rrpO_2[])staticFields4014939632583c5ba36d4475b7d8caf4[shorts4014939632583c5ba36d4475b7d8caf4[0]]).clone();
    }

    public static rrpO_2 valueOf(String string) {
        return Enum.valueOf(rrpO_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-106, 10, 14, -84, -121, 111, -80, 33}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCD07A48B04B30D96L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x977F9304;
    }

    private static /* synthetic */ rrpO_2[] id_class() {
        rrpO_2[] rrpO_2Array = new rrpO_2[bytes4014939632583c5ba36d4475b7d8caf4[0]];
        rrpO_2Array[rrpO_2.booleans4014939632583c5ba36d4475b7d8caf4[0]] = (rrpO_2)((Object)staticFields4014939632583c5ba36d4475b7d8caf4[shorts4014939632583c5ba36d4475b7d8caf4[1]]);
        rrpO_2Array[rrpO_2.booleans4014939632583c5ba36d4475b7d8caf4[1]] = (rrpO_2)((Object)staticFields4014939632583c5ba36d4475b7d8caf4[shorts4014939632583c5ba36d4475b7d8caf4[2]]);
        rrpO_2Array[rrpO_2.bytes4014939632583c5ba36d4475b7d8caf4[1]] = (rrpO_2)((Object)staticFields4014939632583c5ba36d4475b7d8caf4[shorts4014939632583c5ba36d4475b7d8caf4[3]]);
        return rrpO_2Array;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans4014939632583c5ba36d4475b7d8caf4 = blArray;
    }

    private static void id_throws() {
        strings4014939632583c5ba36d4475b7d8caf4 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpO_2.id_break();
        rrpO_2.id_throws();
        rrpO_2.id_case();
        rrpO_2.id_byte();
        rrpO_2.id_protected();
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts4014939632583c5ba36d4475b7d8caf4 = sArray;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpO_2(), new rrpO_2(), new rrpO_2(), new rrpO_2[]{(rrpO_2)((Object)objectArray[0]), (rrpO_2)((Object)objectArray[1]), (rrpO_2)((Object)objectArray[2])}};
        staticFields4014939632583c5ba36d4475b7d8caf4 = objectArray;
    }
}

