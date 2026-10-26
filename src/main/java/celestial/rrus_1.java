/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrus_1
extends Enum<rrus_1> {
    private static String[] strings671469053d923ac8912036fe43a40b51;
    private static byte[] bytes671469053d923ac8912036fe43a40b51;
    public static Object[] staticFields671469053d923ac8912036fe43a40b51;
    private static short[] shorts671469053d923ac8912036fe43a40b51;
    private static boolean[] booleans671469053d923ac8912036fe43a40b51;

    private static void id_byte() {
        strings671469053d923ac8912036fe43a40b51 = new String[]{new String("NONE"), new String("WAVES")};
    }

    static {
        rrus_1.ntfClinit();
    }

    public static rrus_1[] values() {
        return (rrus_1[])((rrus_1[])staticFields671469053d923ac8912036fe43a40b51[shorts671469053d923ac8912036fe43a40b51[0]]).clone();
    }

    public static rrus_1 valueOf(String string) {
        return Enum.valueOf(rrus_1.class, string);
    }

    public static rrus_1[] id_class() {
        rrus_1[] rrus_1Array = new rrus_1[bytes671469053d923ac8912036fe43a40b51[0]];
        rrus_1Array[rrus_1.booleans671469053d923ac8912036fe43a40b51[0]] = (rrus_1)((Object)staticFields671469053d923ac8912036fe43a40b51[shorts671469053d923ac8912036fe43a40b51[1]]);
        rrus_1Array[rrus_1.booleans671469053d923ac8912036fe43a40b51[1]] = (rrus_1)((Object)staticFields671469053d923ac8912036fe43a40b51[shorts671469053d923ac8912036fe43a40b51[2]]);
        return rrus_1Array;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3912F4E2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x876D96A00E1E04E3L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-127, -120, 46, 63, 39, -120, 59, 27}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytes671469053d923ac8912036fe43a40b51 = new byte[]{2, 2, 2, 3};
    }

    private static /* synthetic */ rrus_1[] id_throws() {
        rrus_1[] rrus_1Array = new rrus_1[bytes671469053d923ac8912036fe43a40b51[1]];
        rrus_1Array[rrus_1.booleans671469053d923ac8912036fe43a40b51[2]] = (rrus_1)((Object)staticFields671469053d923ac8912036fe43a40b51[shorts671469053d923ac8912036fe43a40b51[3]]);
        rrus_1Array[rrus_1.booleans671469053d923ac8912036fe43a40b51[3]] = (rrus_1)((Object)staticFields671469053d923ac8912036fe43a40b51[shorts671469053d923ac8912036fe43a40b51[4]]);
        return rrus_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrus_1.id_protected();
        rrus_1.id_byte();
        rrus_1.id_catch();
        rrus_1.id_break();
        rrus_1.id_case();
    }

    private static void id_catch() {
        short[] sArray = new short[5];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[4] = 1;
        shorts671469053d923ac8912036fe43a40b51 = sArray;
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrus_1(), new rrus_1(), new rrus_1[]{(rrus_1)((Object)objectArray[0]), (rrus_1)((Object)objectArray[1])}};
        staticFields671469053d923ac8912036fe43a40b51 = objectArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleans671469053d923ac8912036fe43a40b51 = blArray;
    }
}

