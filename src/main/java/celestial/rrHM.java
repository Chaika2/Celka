/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHM
extends Enum<rrHM> {
    public static Object[] staticFields6335874c02e73489a27afe393d14ab7b;
    private static boolean[] booleans6335874c02e73489a27afe393d14ab7b;
    private static byte[] bytes6335874c02e73489a27afe393d14ab7b;
    private static short[] shorts6335874c02e73489a27afe393d14ab7b;
    private static String[] strings6335874c02e73489a27afe393d14ab7b;

    private static /* synthetic */ rrHM[] id_byte() {
        rrHM[] rrHMArray = new rrHM[bytes6335874c02e73489a27afe393d14ab7b[0]];
        rrHMArray[rrHM.booleans6335874c02e73489a27afe393d14ab7b[0]] = (rrHM)((Object)staticFields6335874c02e73489a27afe393d14ab7b[shorts6335874c02e73489a27afe393d14ab7b[1]]);
        rrHMArray[rrHM.booleans6335874c02e73489a27afe393d14ab7b[1]] = (rrHM)((Object)staticFields6335874c02e73489a27afe393d14ab7b[shorts6335874c02e73489a27afe393d14ab7b[2]]);
        rrHMArray[rrHM.bytes6335874c02e73489a27afe393d14ab7b[1]] = (rrHM)((Object)staticFields6335874c02e73489a27afe393d14ab7b[shorts6335874c02e73489a27afe393d14ab7b[3]]);
        return rrHMArray;
    }

    static {
        rrHM.ntfClinit();
    }

    public static rrHM[] values() {
        return (rrHM[])((rrHM[])staticFields6335874c02e73489a27afe393d14ab7b[shorts6335874c02e73489a27afe393d14ab7b[0]]).clone();
    }

    public static rrHM valueOf(String string) {
        return Enum.valueOf(rrHM.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9E5FA6C6;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{108, -95, 48, -86, -125, 104, 50, -128}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBE09D6F53D61ACB4L;
    }

    private static void id_class() {
        strings6335874c02e73489a27afe393d14ab7b = new String[]{new String("FORWARD"), new String("UP"), new String("DOWN")};
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts6335874c02e73489a27afe393d14ab7b = sArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrHM(), new rrHM(), new rrHM(), new rrHM[]{(rrHM)((Object)objectArray[0]), (rrHM)((Object)objectArray[1]), (rrHM)((Object)objectArray[2])}};
        staticFields6335874c02e73489a27afe393d14ab7b = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrHM.id_protected();
        rrHM.id_class();
        rrHM.id_break();
        rrHM.id_case();
        rrHM.id_throws();
    }

    private static void id_case() {
        bytes6335874c02e73489a27afe393d14ab7b = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans6335874c02e73489a27afe393d14ab7b = blArray;
    }
}

