/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gl_1
extends Enum<Gl_1> {
    public static Object[] staticFields1a1463d15ff638568fa2d9ee62dd2289;
    private static String[] strings1a1463d15ff638568fa2d9ee62dd2289;
    private static short[] shorts1a1463d15ff638568fa2d9ee62dd2289;
    private static boolean[] booleans1a1463d15ff638568fa2d9ee62dd2289;
    private static byte[] bytes1a1463d15ff638568fa2d9ee62dd2289;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new Gl_1(), new Gl_1(), new Gl_1(), new Gl_1(), new Gl_1[]{(Gl_1)((Object)objectArray[0]), (Gl_1)((Object)objectArray[1]), (Gl_1)((Object)objectArray[2]), (Gl_1)((Object)objectArray[3])}};
        staticFields1a1463d15ff638568fa2d9ee62dd2289 = objectArray;
    }

    static {
        Gl_1.ntfClinit();
    }

    public static Gl_1[] values() {
        return (Gl_1[])((Gl_1[])staticFields1a1463d15ff638568fa2d9ee62dd2289[shorts1a1463d15ff638568fa2d9ee62dd2289[0]]).clone();
    }

    public static Gl_1 valueOf(String string) {
        return Enum.valueOf(Gl_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x630870F0;
    }

    private static /* synthetic */ Gl_1[] id_class() {
        Gl_1[] gl_1Array = new Gl_1[bytes1a1463d15ff638568fa2d9ee62dd2289[0]];
        gl_1Array[Gl_1.booleans1a1463d15ff638568fa2d9ee62dd2289[0]] = (Gl_1)((Object)staticFields1a1463d15ff638568fa2d9ee62dd2289[shorts1a1463d15ff638568fa2d9ee62dd2289[1]]);
        gl_1Array[Gl_1.booleans1a1463d15ff638568fa2d9ee62dd2289[1]] = (Gl_1)((Object)staticFields1a1463d15ff638568fa2d9ee62dd2289[shorts1a1463d15ff638568fa2d9ee62dd2289[2]]);
        gl_1Array[Gl_1.bytes1a1463d15ff638568fa2d9ee62dd2289[1]] = (Gl_1)((Object)staticFields1a1463d15ff638568fa2d9ee62dd2289[shorts1a1463d15ff638568fa2d9ee62dd2289[3]]);
        gl_1Array[Gl_1.bytes1a1463d15ff638568fa2d9ee62dd2289[2]] = (Gl_1)((Object)staticFields1a1463d15ff638568fa2d9ee62dd2289[shorts1a1463d15ff638568fa2d9ee62dd2289[4]]);
        return gl_1Array;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEB1902EFAAC8DCDFL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{115, -10, -120, -9, 18, 126, -17, -17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans1a1463d15ff638568fa2d9ee62dd2289 = blArray;
    }

    private static void id_throws() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        shorts1a1463d15ff638568fa2d9ee62dd2289 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Gl_1.id_break();
        Gl_1.id_case();
        Gl_1.id_throws();
        Gl_1.id_protected();
        Gl_1.id_byte();
    }

    private static void id_case() {
        strings1a1463d15ff638568fa2d9ee62dd2289 = new String[]{new String("NONE"), new String("GOAL_SET"), new String("PATH_REQUESTED"), new String("EXECUTING")};
    }

    private static void id_protected() {
        bytes1a1463d15ff638568fa2d9ee62dd2289 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }
}

