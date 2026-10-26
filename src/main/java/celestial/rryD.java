/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryD
extends Enum<rryD> {
    private static boolean[] booleans24c72777b502351fbafe71530c75a9f7;
    public static Object[] staticFields24c72777b502351fbafe71530c75a9f7;
    private static byte[] bytes24c72777b502351fbafe71530c75a9f7;
    private static String[] strings24c72777b502351fbafe71530c75a9f7;
    private static short[] shorts24c72777b502351fbafe71530c75a9f7;

    private static /* synthetic */ rryD[] id_byte() {
        rryD[] rryDArray = new rryD[bytes24c72777b502351fbafe71530c75a9f7[0]];
        rryDArray[rryD.booleans24c72777b502351fbafe71530c75a9f7[0]] = (rryD)((Object)staticFields24c72777b502351fbafe71530c75a9f7[shorts24c72777b502351fbafe71530c75a9f7[1]]);
        rryDArray[rryD.booleans24c72777b502351fbafe71530c75a9f7[1]] = (rryD)((Object)staticFields24c72777b502351fbafe71530c75a9f7[shorts24c72777b502351fbafe71530c75a9f7[2]]);
        rryDArray[rryD.bytes24c72777b502351fbafe71530c75a9f7[1]] = (rryD)((Object)staticFields24c72777b502351fbafe71530c75a9f7[shorts24c72777b502351fbafe71530c75a9f7[3]]);
        return rryDArray;
    }

    static {
        rryD.ntfClinit();
    }

    public static rryD[] values() {
        return (rryD[])((rryD[])staticFields24c72777b502351fbafe71530c75a9f7[shorts24c72777b502351fbafe71530c75a9f7[0]]).clone();
    }

    public static rryD valueOf(String string) {
        return Enum.valueOf(rryD.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x79FFE8A0;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans24c72777b502351fbafe71530c75a9f7 = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{69, 42, -6, -47, -41, 66, 73, 111}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCCC8755ADB42A231L;
    }

    private static void id_break() {
        strings24c72777b502351fbafe71530c75a9f7 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rryD(), new rryD(), new rryD(), new rryD[]{(rryD)((Object)objectArray[0]), (rryD)((Object)objectArray[1]), (rryD)((Object)objectArray[2])}};
        staticFields24c72777b502351fbafe71530c75a9f7 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryD.id_class();
        rryD.id_break();
        rryD.id_case();
        rryD.id_protected();
        rryD.id_throws();
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts24c72777b502351fbafe71530c75a9f7 = sArray;
    }

    private static void id_protected() {
        bytes24c72777b502351fbafe71530c75a9f7 = new byte[]{3, 2, 2, 2, 3, 4};
    }
}

