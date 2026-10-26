/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLy_1
extends Enum<rrLy_1> {
    private static boolean[] booleans4117bd257b2839b395dedb8ac6b8a087;
    private static String[] strings4117bd257b2839b395dedb8ac6b8a087;
    private static byte[] bytes4117bd257b2839b395dedb8ac6b8a087;
    public static Object[] staticFields4117bd257b2839b395dedb8ac6b8a087;
    private static short[] shorts4117bd257b2839b395dedb8ac6b8a087;

    private static void id_byte() {
        strings4117bd257b2839b395dedb8ac6b8a087 = new String[]{new String("PRE"), new String("POST")};
    }

    static {
        rrLy_1.ntfClinit();
    }

    public static rrLy_1[] values() {
        return (rrLy_1[])((rrLy_1[])staticFields4117bd257b2839b395dedb8ac6b8a087[shorts4117bd257b2839b395dedb8ac6b8a087[0]]).clone();
    }

    public static rrLy_1 valueOf(String string) {
        return Enum.valueOf(rrLy_1.class, string);
    }

    private static /* synthetic */ rrLy_1[] id_class() {
        rrLy_1[] rrLy_1Array = new rrLy_1[bytes4117bd257b2839b395dedb8ac6b8a087[0]];
        rrLy_1Array[rrLy_1.booleans4117bd257b2839b395dedb8ac6b8a087[0]] = (rrLy_1)((Object)staticFields4117bd257b2839b395dedb8ac6b8a087[shorts4117bd257b2839b395dedb8ac6b8a087[1]]);
        rrLy_1Array[rrLy_1.booleans4117bd257b2839b395dedb8ac6b8a087[1]] = (rrLy_1)((Object)staticFields4117bd257b2839b395dedb8ac6b8a087[shorts4117bd257b2839b395dedb8ac6b8a087[2]]);
        return rrLy_1Array;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x79D901FE;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE8345F0694A3A504L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-5, -23, 49, 5, -3, -8, 98, -24}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rrLy_1(), new rrLy_1(), new rrLy_1[]{(rrLy_1)((Object)objectArray[0]), (rrLy_1)((Object)objectArray[1])}};
        staticFields4117bd257b2839b395dedb8ac6b8a087 = objectArray;
    }

    private static void id_throws() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts4117bd257b2839b395dedb8ac6b8a087 = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrLy_1.id_case();
        rrLy_1.id_byte();
        rrLy_1.id_throws();
        rrLy_1.id_protected();
        rrLy_1.id_break();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans4117bd257b2839b395dedb8ac6b8a087 = blArray;
    }

    private static void id_protected() {
        bytes4117bd257b2839b395dedb8ac6b8a087 = new byte[]{2, 2, 3};
    }
}

