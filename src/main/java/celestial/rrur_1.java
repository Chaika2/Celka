/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrur_1
extends Enum<rrur_1> {
    private static short[] shorts11cf60dc087237409ab550ffa4a0389b;
    private static boolean[] booleans11cf60dc087237409ab550ffa4a0389b;
    private static byte[] bytes11cf60dc087237409ab550ffa4a0389b;
    private static String[] strings11cf60dc087237409ab550ffa4a0389b;
    public static Object[] staticFields11cf60dc087237409ab550ffa4a0389b;

    private static void id_byte() {
        strings11cf60dc087237409ab550ffa4a0389b = new String[]{new String("BLOCKY"), new String("SMOOTH")};
    }

    static {
        rrur_1.ntfClinit();
    }

    public static rrur_1[] values() {
        return (rrur_1[])((rrur_1[])staticFields11cf60dc087237409ab550ffa4a0389b[shorts11cf60dc087237409ab550ffa4a0389b[0]]).clone();
    }

    public static rrur_1 valueOf(String string) {
        return Enum.valueOf(rrur_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-96, -3, -110, 108, 33, 10, 52, -4}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9A815850;
    }

    public static rrur_1[] id_class() {
        rrur_1[] rrur_1Array = new rrur_1[bytes11cf60dc087237409ab550ffa4a0389b[0]];
        rrur_1Array[rrur_1.booleans11cf60dc087237409ab550ffa4a0389b[0]] = (rrur_1)((Object)staticFields11cf60dc087237409ab550ffa4a0389b[shorts11cf60dc087237409ab550ffa4a0389b[1]]);
        rrur_1Array[rrur_1.booleans11cf60dc087237409ab550ffa4a0389b[1]] = (rrur_1)((Object)staticFields11cf60dc087237409ab550ffa4a0389b[shorts11cf60dc087237409ab550ffa4a0389b[2]]);
        return rrur_1Array;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE0E56F583307963EL;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rrur_1(), new rrur_1(), new rrur_1[]{(rrur_1)((Object)objectArray[0]), (rrur_1)((Object)objectArray[1])}};
        staticFields11cf60dc087237409ab550ffa4a0389b = objectArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleans11cf60dc087237409ab550ffa4a0389b = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrur_1.id_throws();
        rrur_1.id_byte();
        rrur_1.id_catch();
        rrur_1.id_case();
        rrur_1.id_break();
    }

    private static void id_catch() {
        short[] sArray = new short[5];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[4] = 1;
        shorts11cf60dc087237409ab550ffa4a0389b = sArray;
    }

    private static void id_case() {
        bytes11cf60dc087237409ab550ffa4a0389b = new byte[]{2, 2, 2, 3};
    }

    private static /* synthetic */ rrur_1[] id_protected() {
        rrur_1[] rrur_1Array = new rrur_1[bytes11cf60dc087237409ab550ffa4a0389b[1]];
        rrur_1Array[rrur_1.booleans11cf60dc087237409ab550ffa4a0389b[2]] = (rrur_1)((Object)staticFields11cf60dc087237409ab550ffa4a0389b[shorts11cf60dc087237409ab550ffa4a0389b[3]]);
        rrur_1Array[rrur_1.booleans11cf60dc087237409ab550ffa4a0389b[3]] = (rrur_1)((Object)staticFields11cf60dc087237409ab550ffa4a0389b[shorts11cf60dc087237409ab550ffa4a0389b[4]]);
        return rrur_1Array;
    }
}

