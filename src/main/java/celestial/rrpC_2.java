/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpC_2
extends Enum<rrpC_2> {
    private static short[] shorts58cea7ed1d8d31da9b1cc2bca3fc3669;
    private static String[] strings58cea7ed1d8d31da9b1cc2bca3fc3669;
    private static boolean[] booleans58cea7ed1d8d31da9b1cc2bca3fc3669;
    public static Object[] staticFields58cea7ed1d8d31da9b1cc2bca3fc3669;
    private static byte[] bytes58cea7ed1d8d31da9b1cc2bca3fc3669;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpC_2(), new rrpC_2[]{(rrpC_2)((Object)objectArray[0])}};
        staticFields58cea7ed1d8d31da9b1cc2bca3fc3669 = objectArray;
    }

    static {
        rrpC_2.ntfClinit();
    }

    public static rrpC_2[] values() {
        return (rrpC_2[])((rrpC_2[])staticFields58cea7ed1d8d31da9b1cc2bca3fc3669[shorts58cea7ed1d8d31da9b1cc2bca3fc3669[0]]).clone();
    }

    public static rrpC_2 valueOf(String string) {
        return Enum.valueOf(rrpC_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x40805613;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA465E62F9A459FDFL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-99, 17, -106, -44, 61, 79, 69, -1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        strings58cea7ed1d8d31da9b1cc2bca3fc3669 = new String[]{new String("JOINING")};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleans58cea7ed1d8d31da9b1cc2bca3fc3669 = blArray;
    }

    private static void id_throws() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shorts58cea7ed1d8d31da9b1cc2bca3fc3669 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpC_2.id_break();
        rrpC_2.id_class();
        rrpC_2.id_throws();
        rrpC_2.id_protected();
        rrpC_2.id_byte();
    }

    private static /* synthetic */ rrpC_2[] id_case() {
        rrpC_2[] rrpC_2Array = new rrpC_2[booleans58cea7ed1d8d31da9b1cc2bca3fc3669[0]];
        rrpC_2Array[rrpC_2.booleans58cea7ed1d8d31da9b1cc2bca3fc3669[1]] = (rrpC_2)((Object)staticFields58cea7ed1d8d31da9b1cc2bca3fc3669[shorts58cea7ed1d8d31da9b1cc2bca3fc3669[1]]);
        return rrpC_2Array;
    }

    private static void id_protected() {
        bytes58cea7ed1d8d31da9b1cc2bca3fc3669 = new byte[]{2};
    }
}

