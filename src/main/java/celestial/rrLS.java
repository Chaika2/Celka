/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLS
extends Enum<rrLS> {
    private static boolean[] booleans5263c46d9cc33ff8a76200218759034b;
    private static String[] strings5263c46d9cc33ff8a76200218759034b;
    private static byte[] bytes5263c46d9cc33ff8a76200218759034b;
    private static short[] shorts5263c46d9cc33ff8a76200218759034b;
    public static Object[] staticFields5263c46d9cc33ff8a76200218759034b;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrLS(), new rrLS(), new rrLS[]{(rrLS)((Object)objectArray[0]), (rrLS)((Object)objectArray[1])}};
        staticFields5263c46d9cc33ff8a76200218759034b = objectArray;
    }

    static {
        rrLS.ntfClinit();
    }

    public static rrLS[] values() {
        return (rrLS[])((rrLS[])staticFields5263c46d9cc33ff8a76200218759034b[shorts5263c46d9cc33ff8a76200218759034b[0]]).clone();
    }

    public static rrLS valueOf(String string) {
        return Enum.valueOf(rrLS.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-103, 103, 29, 18, -44, -36, -42, 25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x50240A92093C63DBL;
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts5263c46d9cc33ff8a76200218759034b = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB893E5D3;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans5263c46d9cc33ff8a76200218759034b = blArray;
    }

    private static void id_throws() {
        strings5263c46d9cc33ff8a76200218759034b = new String[]{new String("MOUSE"), new String("KEYBOARD")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrLS.id_break();
        rrLS.id_throws();
        rrLS.id_class();
        rrLS.id_case();
        rrLS.id_byte();
    }

    private static void id_case() {
        bytes5263c46d9cc33ff8a76200218759034b = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ rrLS[] id_protected() {
        rrLS[] rrLSArray = new rrLS[bytes5263c46d9cc33ff8a76200218759034b[0]];
        rrLSArray[rrLS.booleans5263c46d9cc33ff8a76200218759034b[0]] = (rrLS)((Object)staticFields5263c46d9cc33ff8a76200218759034b[shorts5263c46d9cc33ff8a76200218759034b[1]]);
        rrLSArray[rrLS.booleans5263c46d9cc33ff8a76200218759034b[1]] = (rrLS)((Object)staticFields5263c46d9cc33ff8a76200218759034b[shorts5263c46d9cc33ff8a76200218759034b[2]]);
        return rrLSArray;
    }
}

