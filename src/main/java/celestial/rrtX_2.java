/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtX_2
extends Enum<rrtX_2> {
    private static String[] stringsdadd6b8236373470b3196397455fa876;
    private static boolean[] booleansdadd6b8236373470b3196397455fa876;
    private static short[] shortsdadd6b8236373470b3196397455fa876;
    private static byte[] bytesdadd6b8236373470b3196397455fa876;
    public static Object[] staticFieldsdadd6b8236373470b3196397455fa876;

    private static void id_byte() {
        stringsdadd6b8236373470b3196397455fa876 = new String[]{new String("SUCCESS"), new String("ERROR"), new String("INFO")};
    }

    static {
        rrtX_2.ntfClinit();
    }

    public static rrtX_2[] values() {
        return (rrtX_2[])((rrtX_2[])staticFieldsdadd6b8236373470b3196397455fa876[shortsdadd6b8236373470b3196397455fa876[0]]).clone();
    }

    public static rrtX_2 valueOf(String string) {
        return Enum.valueOf(rrtX_2.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{6, -107, -105, 40, -90, 54, 37, 64}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x33350F231AF015E8L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x63A30407;
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsdadd6b8236373470b3196397455fa876 = sArray;
    }

    private static /* synthetic */ rrtX_2[] id_break() {
        rrtX_2[] rrtX_2Array = new rrtX_2[bytesdadd6b8236373470b3196397455fa876[0]];
        rrtX_2Array[rrtX_2.booleansdadd6b8236373470b3196397455fa876[0]] = (rrtX_2)((Object)staticFieldsdadd6b8236373470b3196397455fa876[shortsdadd6b8236373470b3196397455fa876[1]]);
        rrtX_2Array[rrtX_2.booleansdadd6b8236373470b3196397455fa876[1]] = (rrtX_2)((Object)staticFieldsdadd6b8236373470b3196397455fa876[shortsdadd6b8236373470b3196397455fa876[2]]);
        rrtX_2Array[rrtX_2.bytesdadd6b8236373470b3196397455fa876[1]] = (rrtX_2)((Object)staticFieldsdadd6b8236373470b3196397455fa876[shortsdadd6b8236373470b3196397455fa876[3]]);
        return rrtX_2Array;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrtX_2(), new rrtX_2(), new rrtX_2(), new rrtX_2[]{(rrtX_2)((Object)objectArray[0]), (rrtX_2)((Object)objectArray[1]), (rrtX_2)((Object)objectArray[2])}};
        staticFieldsdadd6b8236373470b3196397455fa876 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtX_2.id_protected();
        rrtX_2.id_byte();
        rrtX_2.id_class();
        rrtX_2.id_case();
        rrtX_2.id_throws();
    }

    private static void id_case() {
        bytesdadd6b8236373470b3196397455fa876 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansdadd6b8236373470b3196397455fa876 = blArray;
    }
}

