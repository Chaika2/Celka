/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryT
extends Enum<rryT> {
    public static Object[] staticFields37876a19520c3c81842a5cb803ef3c99;
    private static boolean[] booleans37876a19520c3c81842a5cb803ef3c99;
    private static String[] strings37876a19520c3c81842a5cb803ef3c99;
    private static short[] shorts37876a19520c3c81842a5cb803ef3c99;
    private static byte[] bytes37876a19520c3c81842a5cb803ef3c99;

    private static void id_byte() {
        bytes37876a19520c3c81842a5cb803ef3c99 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    static {
        rryT.ntfClinit();
    }

    public static rryT[] values() {
        return (rryT[])((rryT[])staticFields37876a19520c3c81842a5cb803ef3c99[shorts37876a19520c3c81842a5cb803ef3c99[0]]).clone();
    }

    public static rryT valueOf(String string) {
        return Enum.valueOf(rryT.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{41, -99, -91, -107, 118, -15, 69, 127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ rryT[] id_class() {
        rryT[] rryTArray = new rryT[bytes37876a19520c3c81842a5cb803ef3c99[0]];
        rryTArray[rryT.booleans37876a19520c3c81842a5cb803ef3c99[0]] = (rryT)((Object)staticFields37876a19520c3c81842a5cb803ef3c99[shorts37876a19520c3c81842a5cb803ef3c99[1]]);
        rryTArray[rryT.booleans37876a19520c3c81842a5cb803ef3c99[1]] = (rryT)((Object)staticFields37876a19520c3c81842a5cb803ef3c99[shorts37876a19520c3c81842a5cb803ef3c99[2]]);
        rryTArray[rryT.bytes37876a19520c3c81842a5cb803ef3c99[1]] = (rryT)((Object)staticFields37876a19520c3c81842a5cb803ef3c99[shorts37876a19520c3c81842a5cb803ef3c99[3]]);
        rryTArray[rryT.bytes37876a19520c3c81842a5cb803ef3c99[2]] = (rryT)((Object)staticFields37876a19520c3c81842a5cb803ef3c99[shorts37876a19520c3c81842a5cb803ef3c99[4]]);
        rryTArray[rryT.bytes37876a19520c3c81842a5cb803ef3c99[3]] = (rryT)((Object)staticFields37876a19520c3c81842a5cb803ef3c99[shorts37876a19520c3c81842a5cb803ef3c99[5]]);
        return rryTArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x937B48B51CD54033L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x97BDE37E;
    }

    private static void id_break() {
        short[] sArray = new short[6];
        sArray[0] = 5;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        shorts37876a19520c3c81842a5cb803ef3c99 = sArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans37876a19520c3c81842a5cb803ef3c99 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryT.id_throws();
        rryT.id_case();
        rryT.id_break();
        rryT.id_byte();
        rryT.id_protected();
    }

    private static void id_case() {
        strings37876a19520c3c81842a5cb803ef3c99 = new String[]{new String("PAY"), new String("B"), new String("AH_SELL"), new String("CLAN_WITHDRAW"), new String("CLAN_INVEST")};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rryT(), new rryT(), new rryT(), new rryT(), new rryT(), new rryT[]{(rryT)((Object)objectArray[0]), (rryT)((Object)objectArray[1]), (rryT)((Object)objectArray[2]), (rryT)((Object)objectArray[3]), (rryT)((Object)objectArray[4])}};
        staticFields37876a19520c3c81842a5cb803ef3c99 = objectArray;
    }
}

