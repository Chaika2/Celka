/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gx_1
extends Enum<Gx_1> {
    private static boolean[] booleans5eb6de38577e3355bf35a0696e0b0ac4;
    private static short[] shorts5eb6de38577e3355bf35a0696e0b0ac4;
    private static String[] strings5eb6de38577e3355bf35a0696e0b0ac4;
    private static byte[] bytes5eb6de38577e3355bf35a0696e0b0ac4;
    public static Object[] staticFields5eb6de38577e3355bf35a0696e0b0ac4;

    private static void id_byte() {
        bytes5eb6de38577e3355bf35a0696e0b0ac4 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    static {
        Gx_1.ntfClinit();
    }

    public static Gx_1[] values() {
        return (Gx_1[])((Gx_1[])staticFields5eb6de38577e3355bf35a0696e0b0ac4[shorts5eb6de38577e3355bf35a0696e0b0ac4[0]]).clone();
    }

    public static Gx_1 valueOf(String string) {
        return Enum.valueOf(Gx_1.class, string);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans5eb6de38577e3355bf35a0696e0b0ac4 = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-37, -7, 67, -128, 92, 99, -3, -56}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x112F39FDFB4B9C85L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xCF39EE19;
    }

    private static void id_break() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts5eb6de38577e3355bf35a0696e0b0ac4 = sArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new Gx_1(), new Gx_1(), new Gx_1(), new Gx_1[]{(Gx_1)((Object)objectArray[0]), (Gx_1)((Object)objectArray[1]), (Gx_1)((Object)objectArray[2])}};
        staticFields5eb6de38577e3355bf35a0696e0b0ac4 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Gx_1.id_class();
        Gx_1.id_protected();
        Gx_1.id_break();
        Gx_1.id_byte();
        Gx_1.id_throws();
    }

    private static /* synthetic */ Gx_1[] id_case() {
        Gx_1[] gx_1Array = new Gx_1[bytes5eb6de38577e3355bf35a0696e0b0ac4[0]];
        gx_1Array[Gx_1.booleans5eb6de38577e3355bf35a0696e0b0ac4[0]] = (Gx_1)((Object)staticFields5eb6de38577e3355bf35a0696e0b0ac4[shorts5eb6de38577e3355bf35a0696e0b0ac4[1]]);
        gx_1Array[Gx_1.booleans5eb6de38577e3355bf35a0696e0b0ac4[1]] = (Gx_1)((Object)staticFields5eb6de38577e3355bf35a0696e0b0ac4[shorts5eb6de38577e3355bf35a0696e0b0ac4[2]]);
        gx_1Array[Gx_1.bytes5eb6de38577e3355bf35a0696e0b0ac4[1]] = (Gx_1)((Object)staticFields5eb6de38577e3355bf35a0696e0b0ac4[shorts5eb6de38577e3355bf35a0696e0b0ac4[3]]);
        return gx_1Array;
    }

    private static void id_protected() {
        strings5eb6de38577e3355bf35a0696e0b0ac4 = new String[]{new String("YES"), new String("MAYBE"), new String("NO")};
    }
}

