/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class BT
extends Enum<BT> {
    private static byte[] bytes10e8ecd1ac80321e9230ae9a938c7436;
    public static Object[] staticFields10e8ecd1ac80321e9230ae9a938c7436;
    private static short[] shorts10e8ecd1ac80321e9230ae9a938c7436;
    private static String[] strings10e8ecd1ac80321e9230ae9a938c7436;
    private static boolean[] booleans10e8ecd1ac80321e9230ae9a938c7436;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans10e8ecd1ac80321e9230ae9a938c7436 = blArray;
    }

    static {
        BT.ntfClinit();
    }

    public static BT[] values() {
        return (BT[])((BT[])staticFields10e8ecd1ac80321e9230ae9a938c7436[shorts10e8ecd1ac80321e9230ae9a938c7436[0]]).clone();
    }

    public static BT valueOf(String string) {
        return Enum.valueOf(BT.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x11CC4B213574F4A5L;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new BT(), new BT(), new BT[]{(BT)((Object)objectArray[0]), (BT)((Object)objectArray[1])}};
        staticFields10e8ecd1ac80321e9230ae9a938c7436 = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-67, -122, -103, 12, 53, -78, 24, -75}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x491B175B;
    }

    private static void id_break() {
        strings10e8ecd1ac80321e9230ae9a938c7436 = new String[]{new String("ADD"), new String("REMOVE")};
    }

    private static void id_throws() {
        bytes10e8ecd1ac80321e9230ae9a938c7436 = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        BT.id_byte();
        BT.id_break();
        BT.id_case();
        BT.id_throws();
        BT.id_class();
    }

    private static void id_case() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts10e8ecd1ac80321e9230ae9a938c7436 = sArray;
    }

    private static /* synthetic */ BT[] id_protected() {
        BT[] bTArray = new BT[bytes10e8ecd1ac80321e9230ae9a938c7436[0]];
        bTArray[BT.booleans10e8ecd1ac80321e9230ae9a938c7436[0]] = (BT)((Object)staticFields10e8ecd1ac80321e9230ae9a938c7436[shorts10e8ecd1ac80321e9230ae9a938c7436[1]]);
        bTArray[BT.booleans10e8ecd1ac80321e9230ae9a938c7436[1]] = (BT)((Object)staticFields10e8ecd1ac80321e9230ae9a938c7436[shorts10e8ecd1ac80321e9230ae9a938c7436[2]]);
        return bTArray;
    }
}

