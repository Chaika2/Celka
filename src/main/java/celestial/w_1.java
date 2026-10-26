/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class w_1
extends Enum<w_1> {
    private static byte[] bytesa114f317008a3fe78339d2b3c5e6fe39;
    private static String[] stringsa114f317008a3fe78339d2b3c5e6fe39;
    private static boolean[] booleansa114f317008a3fe78339d2b3c5e6fe39;
    public static Object[] staticFieldsa114f317008a3fe78339d2b3c5e6fe39;
    private static short[] shortsa114f317008a3fe78339d2b3c5e6fe39;

    private static void id_byte() {
        stringsa114f317008a3fe78339d2b3c5e6fe39 = new String[]{new String("MOTION_UPDATE"), new String("JUMP")};
    }

    static {
        w_1.ntfClinit();
    }

    public static w_1[] values() {
        return (w_1[])((w_1[])staticFieldsa114f317008a3fe78339d2b3c5e6fe39[shortsa114f317008a3fe78339d2b3c5e6fe39[0]]).clone();
    }

    public static w_1 valueOf(String string) {
        return Enum.valueOf(w_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-69, 71, -104, -92, 105, -28, 49, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1D1CA822FB38265FL;
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shortsa114f317008a3fe78339d2b3c5e6fe39 = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA8E4F107;
    }

    private static /* synthetic */ w_1[] id_break() {
        w_1[] w_1Array = new w_1[bytesa114f317008a3fe78339d2b3c5e6fe39[0]];
        w_1Array[w_1.booleansa114f317008a3fe78339d2b3c5e6fe39[0]] = (w_1)((Object)staticFieldsa114f317008a3fe78339d2b3c5e6fe39[shortsa114f317008a3fe78339d2b3c5e6fe39[1]]);
        w_1Array[w_1.booleansa114f317008a3fe78339d2b3c5e6fe39[1]] = (w_1)((Object)staticFieldsa114f317008a3fe78339d2b3c5e6fe39[shortsa114f317008a3fe78339d2b3c5e6fe39[2]]);
        return w_1Array;
    }

    private static void id_throws() {
        bytesa114f317008a3fe78339d2b3c5e6fe39 = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        w_1.id_case();
        w_1.id_byte();
        w_1.id_class();
        w_1.id_throws();
        w_1.id_protected();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansa114f317008a3fe78339d2b3c5e6fe39 = blArray;
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new w_1(), new w_1(), new w_1[]{(w_1)((Object)objectArray[0]), (w_1)((Object)objectArray[1])}};
        staticFieldsa114f317008a3fe78339d2b3c5e6fe39 = objectArray;
    }
}

