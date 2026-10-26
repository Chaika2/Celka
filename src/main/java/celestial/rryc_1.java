/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryc_1
extends Enum<rryc_1> {
    private static short[] shorts7b9d953229a23ea8afc65e6592cc33c5;
    private static byte[] bytes7b9d953229a23ea8afc65e6592cc33c5;
    private static String[] strings7b9d953229a23ea8afc65e6592cc33c5;
    public static Object[] staticFields7b9d953229a23ea8afc65e6592cc33c5;
    private static boolean[] booleans7b9d953229a23ea8afc65e6592cc33c5;

    private static /* synthetic */ rryc_1[] id_byte() {
        rryc_1[] rryc_1Array = new rryc_1[bytes7b9d953229a23ea8afc65e6592cc33c5[0]];
        rryc_1Array[rryc_1.booleans7b9d953229a23ea8afc65e6592cc33c5[0]] = (rryc_1)((Object)staticFields7b9d953229a23ea8afc65e6592cc33c5[shorts7b9d953229a23ea8afc65e6592cc33c5[1]]);
        rryc_1Array[rryc_1.booleans7b9d953229a23ea8afc65e6592cc33c5[1]] = (rryc_1)((Object)staticFields7b9d953229a23ea8afc65e6592cc33c5[shorts7b9d953229a23ea8afc65e6592cc33c5[2]]);
        return rryc_1Array;
    }

    static {
        rryc_1.ntfClinit();
    }

    public static rryc_1[] values() {
        return (rryc_1[])((rryc_1[])staticFields7b9d953229a23ea8afc65e6592cc33c5[shorts7b9d953229a23ea8afc65e6592cc33c5[0]]).clone();
    }

    public static rryc_1 valueOf(String string) {
        return Enum.valueOf(rryc_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE25840C1;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rryc_1(), new rryc_1(), new rryc_1[]{(rryc_1)((Object)objectArray[0]), (rryc_1)((Object)objectArray[1])}};
        staticFields7b9d953229a23ea8afc65e6592cc33c5 = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-18, -61, -13, -30, -102, 114, -122, 106}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3E2E342BD034C45CL;
    }

    private static void id_break() {
        bytes7b9d953229a23ea8afc65e6592cc33c5 = new byte[]{2, 2, 3};
    }

    private static void id_throws() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts7b9d953229a23ea8afc65e6592cc33c5 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryc_1.id_case();
        rryc_1.id_protected();
        rryc_1.id_throws();
        rryc_1.id_break();
        rryc_1.id_class();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans7b9d953229a23ea8afc65e6592cc33c5 = blArray;
    }

    private static void id_protected() {
        strings7b9d953229a23ea8afc65e6592cc33c5 = new String[]{new String("SELECT_TEAMMATES"), new String("START_SEARCH")};
    }
}

