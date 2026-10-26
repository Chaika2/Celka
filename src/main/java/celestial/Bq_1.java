/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bq_1
extends Enum<Bq_1> {
    private static short[] shortsc48d9c2a6a943f1684eec8a5f13e9034;
    private static String[] stringsc48d9c2a6a943f1684eec8a5f13e9034;
    private static byte[] bytesc48d9c2a6a943f1684eec8a5f13e9034;
    private static boolean[] booleansc48d9c2a6a943f1684eec8a5f13e9034;
    public static Object[] staticFieldsc48d9c2a6a943f1684eec8a5f13e9034;

    private static void id_byte() {
        stringsc48d9c2a6a943f1684eec8a5f13e9034 = new String[]{new String("REALLY_WORLD"), new String("FUNTIME")};
    }

    static {
        Bq_1.ntfClinit();
    }

    public static Bq_1[] values() {
        return (Bq_1[])((Bq_1[])staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[shortsc48d9c2a6a943f1684eec8a5f13e9034[0]]).clone();
    }

    public static Bq_1 valueOf(String string) {
        return Enum.valueOf(Bq_1.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3983D5FE85188C4DL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{95, 46, 29, -63, 35, -122, -58, -116}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansc48d9c2a6a943f1684eec8a5f13e9034 = blArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFBA73F7B;
    }

    private static void id_break() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shortsc48d9c2a6a943f1684eec8a5f13e9034 = sArray;
    }

    private static /* synthetic */ Bq_1[] id_throws() {
        Bq_1[] bq_1Array = new Bq_1[bytesc48d9c2a6a943f1684eec8a5f13e9034[0]];
        bq_1Array[Bq_1.booleansc48d9c2a6a943f1684eec8a5f13e9034[0]] = (Bq_1)((Object)staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[shortsc48d9c2a6a943f1684eec8a5f13e9034[1]]);
        bq_1Array[Bq_1.booleansc48d9c2a6a943f1684eec8a5f13e9034[1]] = (Bq_1)((Object)staticFieldsc48d9c2a6a943f1684eec8a5f13e9034[shortsc48d9c2a6a943f1684eec8a5f13e9034[2]]);
        return bq_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        Bq_1.id_class();
        Bq_1.id_byte();
        Bq_1.id_break();
        Bq_1.id_case();
        Bq_1.id_protected();
    }

    private static void id_case() {
        bytesc48d9c2a6a943f1684eec8a5f13e9034 = new byte[]{2, 2, 3};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new Bq_1(), new Bq_1(), new Bq_1[]{(Bq_1)((Object)objectArray[0]), (Bq_1)((Object)objectArray[1])}};
        staticFieldsc48d9c2a6a943f1684eec8a5f13e9034 = objectArray;
    }
}

