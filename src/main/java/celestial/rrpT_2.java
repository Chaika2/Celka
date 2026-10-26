/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpT_2
extends Enum<rrpT_2> {
    private static boolean[] booleans40114faa3468399f904240e789c63c91;
    private static String[] strings40114faa3468399f904240e789c63c91;
    private static short[] shorts40114faa3468399f904240e789c63c91;
    public static Object[] staticFields40114faa3468399f904240e789c63c91;
    private static byte[] bytes40114faa3468399f904240e789c63c91;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans40114faa3468399f904240e789c63c91 = blArray;
    }

    static {
        rrpT_2.ntfClinit();
    }

    public static rrpT_2[] values() {
        return (rrpT_2[])((rrpT_2[])staticFields40114faa3468399f904240e789c63c91[shorts40114faa3468399f904240e789c63c91[0]]).clone();
    }

    public static rrpT_2 valueOf(String string) {
        return Enum.valueOf(rrpT_2.class, string);
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpT_2(), new rrpT_2(), new rrpT_2(), new rrpT_2[]{(rrpT_2)((Object)objectArray[0]), (rrpT_2)((Object)objectArray[1]), (rrpT_2)((Object)objectArray[2])}};
        staticFields40114faa3468399f904240e789c63c91 = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x92627C56DAD17E2EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9E145CE4;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-63, -29, 40, 96, 126, -104, -68, -104}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytes40114faa3468399f904240e789c63c91 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static /* synthetic */ rrpT_2[] id_throws() {
        rrpT_2[] rrpT_2Array = new rrpT_2[bytes40114faa3468399f904240e789c63c91[0]];
        rrpT_2Array[rrpT_2.booleans40114faa3468399f904240e789c63c91[0]] = (rrpT_2)((Object)staticFields40114faa3468399f904240e789c63c91[shorts40114faa3468399f904240e789c63c91[1]]);
        rrpT_2Array[rrpT_2.booleans40114faa3468399f904240e789c63c91[1]] = (rrpT_2)((Object)staticFields40114faa3468399f904240e789c63c91[shorts40114faa3468399f904240e789c63c91[2]]);
        rrpT_2Array[rrpT_2.bytes40114faa3468399f904240e789c63c91[1]] = (rrpT_2)((Object)staticFields40114faa3468399f904240e789c63c91[shorts40114faa3468399f904240e789c63c91[3]]);
        return rrpT_2Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpT_2.id_byte();
        rrpT_2.id_protected();
        rrpT_2.id_case();
        rrpT_2.id_break();
        rrpT_2.id_class();
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts40114faa3468399f904240e789c63c91 = sArray;
    }

    private static void id_protected() {
        strings40114faa3468399f904240e789c63c91 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }
}

