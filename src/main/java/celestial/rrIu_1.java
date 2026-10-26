/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrIu_1
extends Enum<rrIu_1> {
    private static short[] shorts10847edfe142316aa094e53a68b36f7b;
    private static byte[] bytes10847edfe142316aa094e53a68b36f7b;
    private static String[] strings10847edfe142316aa094e53a68b36f7b;
    private static boolean[] booleans10847edfe142316aa094e53a68b36f7b;
    public static Object[] staticFields10847edfe142316aa094e53a68b36f7b;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans10847edfe142316aa094e53a68b36f7b = blArray;
    }

    static {
        rrIu_1.ntfClinit();
    }

    public static rrIu_1[] values() {
        return (rrIu_1[])((rrIu_1[])staticFields10847edfe142316aa094e53a68b36f7b[shorts10847edfe142316aa094e53a68b36f7b[0]]).clone();
    }

    public static rrIu_1 valueOf(String string) {
        return Enum.valueOf(rrIu_1.class, string);
    }

    private static /* synthetic */ rrIu_1[] id_class() {
        rrIu_1[] rrIu_1Array = new rrIu_1[bytes10847edfe142316aa094e53a68b36f7b[0]];
        rrIu_1Array[rrIu_1.booleans10847edfe142316aa094e53a68b36f7b[0]] = (rrIu_1)((Object)staticFields10847edfe142316aa094e53a68b36f7b[shorts10847edfe142316aa094e53a68b36f7b[1]]);
        rrIu_1Array[rrIu_1.booleans10847edfe142316aa094e53a68b36f7b[1]] = (rrIu_1)((Object)staticFields10847edfe142316aa094e53a68b36f7b[shorts10847edfe142316aa094e53a68b36f7b[2]]);
        return rrIu_1Array;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x2B7E969E4091C1D1L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9DDDB891;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-82, -46, -115, -82, 90, -68, 109, -8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts10847edfe142316aa094e53a68b36f7b = sArray;
    }

    private static void id_throws() {
        strings10847edfe142316aa094e53a68b36f7b = new String[]{new String("LIST"), new String("BOX")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrIu_1.id_byte();
        rrIu_1.id_throws();
        rrIu_1.id_break();
        rrIu_1.id_protected();
        rrIu_1.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrIu_1(), new rrIu_1(), new rrIu_1[]{(rrIu_1)((Object)objectArray[0]), (rrIu_1)((Object)objectArray[1])}};
        staticFields10847edfe142316aa094e53a68b36f7b = objectArray;
    }

    private static void id_protected() {
        bytes10847edfe142316aa094e53a68b36f7b = new byte[]{2, 2, 3};
    }
}

