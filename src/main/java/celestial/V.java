/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class V
extends Enum<V> {
    private static String[] strings30e1cd8580ce39faa61be3646b7cc079;
    private static byte[] bytes30e1cd8580ce39faa61be3646b7cc079;
    private static boolean[] booleans30e1cd8580ce39faa61be3646b7cc079;
    private static short[] shorts30e1cd8580ce39faa61be3646b7cc079;
    public static Object[] staticFields30e1cd8580ce39faa61be3646b7cc079;

    private static void id_byte() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts30e1cd8580ce39faa61be3646b7cc079 = sArray;
    }

    static {
        V.ntfClinit();
    }

    public static V[] values() {
        return (V[])((V[])staticFields30e1cd8580ce39faa61be3646b7cc079[shorts30e1cd8580ce39faa61be3646b7cc079[0]]).clone();
    }

    public static V valueOf(String string) {
        return Enum.valueOf(V.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x49CCFA1;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans30e1cd8580ce39faa61be3646b7cc079 = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-60, -123, -90, -82, 15, 18, 83, 103}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x96F0C21A87F9A339L;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new V(), new V(), new V[]{(V)((Object)objectArray[0]), (V)((Object)objectArray[1])}};
        staticFields30e1cd8580ce39faa61be3646b7cc079 = objectArray;
    }

    private static /* synthetic */ V[] id_throws() {
        V[] vArray = new V[bytes30e1cd8580ce39faa61be3646b7cc079[0]];
        vArray[V.booleans30e1cd8580ce39faa61be3646b7cc079[0]] = (V)((Object)staticFields30e1cd8580ce39faa61be3646b7cc079[shorts30e1cd8580ce39faa61be3646b7cc079[1]]);
        vArray[V.booleans30e1cd8580ce39faa61be3646b7cc079[1]] = (V)((Object)staticFields30e1cd8580ce39faa61be3646b7cc079[shorts30e1cd8580ce39faa61be3646b7cc079[2]]);
        return vArray;
    }

    private static /* synthetic */ void ntfClinit() {
        V.id_class();
        V.id_case();
        V.id_byte();
        V.id_protected();
        V.id_break();
    }

    private static void id_case() {
        strings30e1cd8580ce39faa61be3646b7cc079 = new String[]{new String("IN"), new String("OUT")};
    }

    private static void id_protected() {
        bytes30e1cd8580ce39faa61be3646b7cc079 = new byte[]{2, 2, 3};
    }
}

