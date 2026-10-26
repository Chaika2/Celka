/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryY
extends Enum<rryY> {
    private static String[] strings45ad03cc55cb3e668addddf47f67a723;
    public static Object[] staticFields45ad03cc55cb3e668addddf47f67a723;
    private static short[] shorts45ad03cc55cb3e668addddf47f67a723;
    private static boolean[] booleans45ad03cc55cb3e668addddf47f67a723;
    private static byte[] bytes45ad03cc55cb3e668addddf47f67a723;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans45ad03cc55cb3e668addddf47f67a723 = blArray;
    }

    static {
        rryY.ntfClinit();
    }

    public static rryY[] values() {
        return (rryY[])((rryY[])staticFields45ad03cc55cb3e668addddf47f67a723[shorts45ad03cc55cb3e668addddf47f67a723[0]]).clone();
    }

    public static rryY valueOf(String string) {
        return Enum.valueOf(rryY.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF249934B71130E85L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB7829593;
    }

    private static void id_class() {
        strings45ad03cc55cb3e668addddf47f67a723 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN"), new String("NO_PLAYER_AROUND")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{22, 5, -91, 91, 3, -7, 11, -99}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ rryY[] id_break() {
        rryY[] rryYArray = new rryY[bytes45ad03cc55cb3e668addddf47f67a723[0]];
        rryYArray[rryY.booleans45ad03cc55cb3e668addddf47f67a723[0]] = (rryY)((Object)staticFields45ad03cc55cb3e668addddf47f67a723[shorts45ad03cc55cb3e668addddf47f67a723[1]]);
        rryYArray[rryY.booleans45ad03cc55cb3e668addddf47f67a723[1]] = (rryY)((Object)staticFields45ad03cc55cb3e668addddf47f67a723[shorts45ad03cc55cb3e668addddf47f67a723[2]]);
        rryYArray[rryY.bytes45ad03cc55cb3e668addddf47f67a723[1]] = (rryY)((Object)staticFields45ad03cc55cb3e668addddf47f67a723[shorts45ad03cc55cb3e668addddf47f67a723[3]]);
        rryYArray[rryY.bytes45ad03cc55cb3e668addddf47f67a723[2]] = (rryY)((Object)staticFields45ad03cc55cb3e668addddf47f67a723[shorts45ad03cc55cb3e668addddf47f67a723[4]]);
        return rryYArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rryY(), new rryY(), new rryY(), new rryY(), new rryY[]{(rryY)((Object)objectArray[0]), (rryY)((Object)objectArray[1]), (rryY)((Object)objectArray[2]), (rryY)((Object)objectArray[3])}};
        staticFields45ad03cc55cb3e668addddf47f67a723 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryY.id_byte();
        rryY.id_class();
        rryY.id_case();
        rryY.id_protected();
        rryY.id_throws();
    }

    private static void id_case() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        shorts45ad03cc55cb3e668addddf47f67a723 = sArray;
    }

    private static void id_protected() {
        bytes45ad03cc55cb3e668addddf47f67a723 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }
}

