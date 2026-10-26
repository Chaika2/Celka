/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class bu_3
extends Enum<bu_3> {
    public static Object[] staticFields580f7ea75a023f1a97051d53b9f86917;
    private static short[] shorts580f7ea75a023f1a97051d53b9f86917;
    private static String[] strings580f7ea75a023f1a97051d53b9f86917;
    private static byte[] bytes580f7ea75a023f1a97051d53b9f86917;
    private static boolean[] booleans580f7ea75a023f1a97051d53b9f86917;

    private static void id_byte() {
        bytes580f7ea75a023f1a97051d53b9f86917 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    static {
        bu_3.ntfClinit();
    }

    public static bu_3[] values() {
        return (bu_3[])((bu_3[])staticFields580f7ea75a023f1a97051d53b9f86917[shorts580f7ea75a023f1a97051d53b9f86917[0]]).clone();
    }

    public static bu_3 valueOf(String string) {
        return Enum.valueOf(bu_3.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-21, 57, -87, -103, -79, 122, 82, 60}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE0F16F4D;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new bu_3(), new bu_3(), new bu_3(), new bu_3[]{(bu_3)((Object)objectArray[0]), (bu_3)((Object)objectArray[1]), (bu_3)((Object)objectArray[2])}};
        staticFields580f7ea75a023f1a97051d53b9f86917 = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x18637F00FD3149CBL;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans580f7ea75a023f1a97051d53b9f86917 = blArray;
    }

    private static void id_throws() {
        strings580f7ea75a023f1a97051d53b9f86917 = new String[]{new String("ATTACKING"), new String("PLACING"), new String("IDLE")};
    }

    private static /* synthetic */ void ntfClinit() {
        bu_3.id_break();
        bu_3.id_throws();
        bu_3.id_protected();
        bu_3.id_byte();
        bu_3.id_class();
    }

    private static /* synthetic */ bu_3[] id_case() {
        bu_3[] bu_3Array = new bu_3[bytes580f7ea75a023f1a97051d53b9f86917[0]];
        bu_3Array[bu_3.booleans580f7ea75a023f1a97051d53b9f86917[0]] = (bu_3)((Object)staticFields580f7ea75a023f1a97051d53b9f86917[shorts580f7ea75a023f1a97051d53b9f86917[1]]);
        bu_3Array[bu_3.booleans580f7ea75a023f1a97051d53b9f86917[1]] = (bu_3)((Object)staticFields580f7ea75a023f1a97051d53b9f86917[shorts580f7ea75a023f1a97051d53b9f86917[2]]);
        bu_3Array[bu_3.bytes580f7ea75a023f1a97051d53b9f86917[1]] = (bu_3)((Object)staticFields580f7ea75a023f1a97051d53b9f86917[shorts580f7ea75a023f1a97051d53b9f86917[3]]);
        return bu_3Array;
    }

    private static void id_protected() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts580f7ea75a023f1a97051d53b9f86917 = sArray;
    }
}

