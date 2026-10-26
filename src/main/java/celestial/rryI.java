/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryI
extends Enum<rryI> {
    private static String[] strings0877fde0314d38ca87da6306c28c77a3;
    private static byte[] bytes0877fde0314d38ca87da6306c28c77a3;
    public static Object[] staticFields0877fde0314d38ca87da6306c28c77a3;
    private static short[] shorts0877fde0314d38ca87da6306c28c77a3;
    private static boolean[] booleans0877fde0314d38ca87da6306c28c77a3;

    private static void id_byte() {
        bytes0877fde0314d38ca87da6306c28c77a3 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    static {
        rryI.ntfClinit();
    }

    public static rryI[] values() {
        return (rryI[])((rryI[])staticFields0877fde0314d38ca87da6306c28c77a3[shorts0877fde0314d38ca87da6306c28c77a3[0]]).clone();
    }

    public static rryI valueOf(String string) {
        return Enum.valueOf(rryI.class, string);
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts0877fde0314d38ca87da6306c28c77a3 = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFE4E7E9C;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x18CD2310FE0290E8L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{50, -109, -10, 59, 14, -68, -3, 3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rryI(), new rryI(), new rryI(), new rryI[]{(rryI)((Object)objectArray[0]), (rryI)((Object)objectArray[1]), (rryI)((Object)objectArray[2])}};
        staticFields0877fde0314d38ca87da6306c28c77a3 = objectArray;
    }

    private static void id_throws() {
        strings0877fde0314d38ca87da6306c28c77a3 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static /* synthetic */ void ntfClinit() {
        rryI.id_case();
        rryI.id_throws();
        rryI.id_class();
        rryI.id_byte();
        rryI.id_break();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans0877fde0314d38ca87da6306c28c77a3 = blArray;
    }

    private static /* synthetic */ rryI[] id_protected() {
        rryI[] rryIArray = new rryI[bytes0877fde0314d38ca87da6306c28c77a3[0]];
        rryIArray[rryI.booleans0877fde0314d38ca87da6306c28c77a3[0]] = (rryI)((Object)staticFields0877fde0314d38ca87da6306c28c77a3[shorts0877fde0314d38ca87da6306c28c77a3[1]]);
        rryIArray[rryI.booleans0877fde0314d38ca87da6306c28c77a3[1]] = (rryI)((Object)staticFields0877fde0314d38ca87da6306c28c77a3[shorts0877fde0314d38ca87da6306c28c77a3[2]]);
        rryIArray[rryI.bytes0877fde0314d38ca87da6306c28c77a3[1]] = (rryI)((Object)staticFields0877fde0314d38ca87da6306c28c77a3[shorts0877fde0314d38ca87da6306c28c77a3[3]]);
        return rryIArray;
    }
}

