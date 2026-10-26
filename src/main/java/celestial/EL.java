/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class EL
extends Enum<EL> {
    private static byte[] bytese3b1cfc58f9d3b6596ccfd637c5fdb13;
    public static Object[] staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13;
    private static boolean[] booleanse3b1cfc58f9d3b6596ccfd637c5fdb13;
    private static short[] shortse3b1cfc58f9d3b6596ccfd637c5fdb13;
    private static String[] stringse3b1cfc58f9d3b6596ccfd637c5fdb13;

    private static void id_byte() {
        stringse3b1cfc58f9d3b6596ccfd637c5fdb13 = new String[]{new String("READY_TO_PLACE"), new String("ATTEMPTING"), new String("NO_OPTION")};
    }

    static {
        EL.ntfClinit();
    }

    public static EL[] values() {
        return (EL[])((EL[])staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[shortse3b1cfc58f9d3b6596ccfd637c5fdb13[0]]).clone();
    }

    public static EL valueOf(String string) {
        return Enum.valueOf(EL.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x56CD747331849B51L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x220D3DEF;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-98, 61, -18, 44, -67, -30, -81, 42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleanse3b1cfc58f9d3b6596ccfd637c5fdb13 = blArray;
    }

    private static void id_break() {
        bytese3b1cfc58f9d3b6596ccfd637c5fdb13 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_throws() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortse3b1cfc58f9d3b6596ccfd637c5fdb13 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        EL.id_class();
        EL.id_byte();
        EL.id_throws();
        EL.id_break();
        EL.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new EL(), new EL(), new EL(), new EL[]{(EL)((Object)objectArray[0]), (EL)((Object)objectArray[1]), (EL)((Object)objectArray[2])}};
        staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13 = objectArray;
    }

    private static /* synthetic */ EL[] id_protected() {
        EL[] eLArray = new EL[bytese3b1cfc58f9d3b6596ccfd637c5fdb13[0]];
        eLArray[EL.booleanse3b1cfc58f9d3b6596ccfd637c5fdb13[0]] = (EL)((Object)staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[shortse3b1cfc58f9d3b6596ccfd637c5fdb13[1]]);
        eLArray[EL.booleanse3b1cfc58f9d3b6596ccfd637c5fdb13[1]] = (EL)((Object)staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[shortse3b1cfc58f9d3b6596ccfd637c5fdb13[2]]);
        eLArray[EL.bytese3b1cfc58f9d3b6596ccfd637c5fdb13[1]] = (EL)((Object)staticFieldse3b1cfc58f9d3b6596ccfd637c5fdb13[shortse3b1cfc58f9d3b6596ccfd637c5fdb13[3]]);
        return eLArray;
    }
}

