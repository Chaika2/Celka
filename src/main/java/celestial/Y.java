/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Y
extends Enum<Y> {
    private static String[] strings22c81230f53b33f2a682b4198db24cc4;
    public static Object[] staticFields22c81230f53b33f2a682b4198db24cc4;
    private static short[] shorts22c81230f53b33f2a682b4198db24cc4;
    private static byte[] bytes22c81230f53b33f2a682b4198db24cc4;
    private static boolean[] booleans22c81230f53b33f2a682b4198db24cc4;

    private static void id_byte() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts22c81230f53b33f2a682b4198db24cc4 = sArray;
    }

    static {
        Y.ntfClinit();
    }

    public static Y[] values() {
        return (Y[])((Y[])staticFields22c81230f53b33f2a682b4198db24cc4[shorts22c81230f53b33f2a682b4198db24cc4[0]]).clone();
    }

    public static Y valueOf(String string) {
        return Enum.valueOf(Y.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC859AB72;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF14C634473D244CCL;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans22c81230f53b33f2a682b4198db24cc4 = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-98, 21, -83, 100, -83, -35, -20, -48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytes22c81230f53b33f2a682b4198db24cc4 = new byte[]{2, 2, 3};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new Y(), new Y(), new Y[]{(Y)((Object)objectArray[0]), (Y)((Object)objectArray[1])}};
        staticFields22c81230f53b33f2a682b4198db24cc4 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Y.id_class();
        Y.id_case();
        Y.id_byte();
        Y.id_break();
        Y.id_throws();
    }

    private static void id_case() {
        strings22c81230f53b33f2a682b4198db24cc4 = new String[]{new String("PRE"), new String("POST")};
    }

    private static /* synthetic */ Y[] id_protected() {
        Y[] yArray = new Y[bytes22c81230f53b33f2a682b4198db24cc4[0]];
        yArray[Y.booleans22c81230f53b33f2a682b4198db24cc4[0]] = (Y)((Object)staticFields22c81230f53b33f2a682b4198db24cc4[shorts22c81230f53b33f2a682b4198db24cc4[1]]);
        yArray[Y.booleans22c81230f53b33f2a682b4198db24cc4[1]] = (Y)((Object)staticFields22c81230f53b33f2a682b4198db24cc4[shorts22c81230f53b33f2a682b4198db24cc4[2]]);
        return yArray;
    }
}

