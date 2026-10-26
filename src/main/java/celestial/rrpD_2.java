/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpD_2
extends Enum<rrpD_2> {
    private static short[] shortsb8f0ef75cc3a3659b008178ccc081710;
    public static Object[] staticFieldsb8f0ef75cc3a3659b008178ccc081710;
    private static String[] stringsb8f0ef75cc3a3659b008178ccc081710;
    private static byte[] bytesb8f0ef75cc3a3659b008178ccc081710;
    private static boolean[] booleansb8f0ef75cc3a3659b008178ccc081710;

    private static void id_byte() {
        stringsb8f0ef75cc3a3659b008178ccc081710 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    static {
        rrpD_2.ntfClinit();
    }

    public static rrpD_2[] values() {
        return (rrpD_2[])((rrpD_2[])staticFieldsb8f0ef75cc3a3659b008178ccc081710[shortsb8f0ef75cc3a3659b008178ccc081710[0]]).clone();
    }

    public static rrpD_2 valueOf(String string) {
        return Enum.valueOf(rrpD_2.class, string);
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsb8f0ef75cc3a3659b008178ccc081710 = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDA139798E5ADFCC9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x245E1F93;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{8, 46, -19, -100, -86, 48, -25, -64}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytesb8f0ef75cc3a3659b008178ccc081710 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpD_2(), new rrpD_2(), new rrpD_2(), new rrpD_2[]{(rrpD_2)((Object)objectArray[0]), (rrpD_2)((Object)objectArray[1]), (rrpD_2)((Object)objectArray[2])}};
        staticFieldsb8f0ef75cc3a3659b008178ccc081710 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpD_2.id_case();
        rrpD_2.id_byte();
        rrpD_2.id_class();
        rrpD_2.id_break();
        rrpD_2.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansb8f0ef75cc3a3659b008178ccc081710 = blArray;
    }

    private static /* synthetic */ rrpD_2[] id_protected() {
        rrpD_2[] rrpD_2Array = new rrpD_2[bytesb8f0ef75cc3a3659b008178ccc081710[0]];
        rrpD_2Array[rrpD_2.booleansb8f0ef75cc3a3659b008178ccc081710[0]] = (rrpD_2)((Object)staticFieldsb8f0ef75cc3a3659b008178ccc081710[shortsb8f0ef75cc3a3659b008178ccc081710[1]]);
        rrpD_2Array[rrpD_2.booleansb8f0ef75cc3a3659b008178ccc081710[1]] = (rrpD_2)((Object)staticFieldsb8f0ef75cc3a3659b008178ccc081710[shortsb8f0ef75cc3a3659b008178ccc081710[2]]);
        rrpD_2Array[rrpD_2.bytesb8f0ef75cc3a3659b008178ccc081710[1]] = (rrpD_2)((Object)staticFieldsb8f0ef75cc3a3659b008178ccc081710[shortsb8f0ef75cc3a3659b008178ccc081710[3]]);
        return rrpD_2Array;
    }
}

