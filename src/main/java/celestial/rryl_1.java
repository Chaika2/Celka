/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rryl_1
extends Enum<rryl_1> {
    private static short[] shortsf4b744ad2cb233a5a56c412114fd18f6;
    private static String[] stringsf4b744ad2cb233a5a56c412114fd18f6;
    private static boolean[] booleansf4b744ad2cb233a5a56c412114fd18f6;
    private static byte[] bytesf4b744ad2cb233a5a56c412114fd18f6;
    public static Object[] staticFieldsf4b744ad2cb233a5a56c412114fd18f6;

    private static void id_byte() {
        bytesf4b744ad2cb233a5a56c412114fd18f6 = new byte[]{2};
    }

    static {
        rryl_1.ntfClinit();
    }

    public static rryl_1[] values() {
        return (rryl_1[])((rryl_1[])staticFieldsf4b744ad2cb233a5a56c412114fd18f6[shortsf4b744ad2cb233a5a56c412114fd18f6[0]]).clone();
    }

    public static rryl_1 valueOf(String string) {
        return Enum.valueOf(rryl_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDF80433E34BE6B0CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x49D72528;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{92, -7, 16, -28, -6, -52, -99, -44}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        stringsf4b744ad2cb233a5a56c412114fd18f6 = new String[]{new String("WAITING")};
    }

    private static void id_break() {
        short[] sArray = new short[2];
        sArray[0] = 1;
        shortsf4b744ad2cb233a5a56c412114fd18f6 = sArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rryl_1(), new rryl_1[]{(rryl_1)((Object)objectArray[0])}};
        staticFieldsf4b744ad2cb233a5a56c412114fd18f6 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rryl_1.id_case();
        rryl_1.id_class();
        rryl_1.id_break();
        rryl_1.id_byte();
        rryl_1.id_throws();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        booleansf4b744ad2cb233a5a56c412114fd18f6 = blArray;
    }

    private static /* synthetic */ rryl_1[] id_protected() {
        rryl_1[] rryl_1Array = new rryl_1[booleansf4b744ad2cb233a5a56c412114fd18f6[0]];
        rryl_1Array[rryl_1.booleansf4b744ad2cb233a5a56c412114fd18f6[1]] = (rryl_1)((Object)staticFieldsf4b744ad2cb233a5a56c412114fd18f6[shortsf4b744ad2cb233a5a56c412114fd18f6[1]]);
        return rryl_1Array;
    }
}

