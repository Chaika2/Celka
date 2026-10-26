/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class H
extends Enum<H> {
    private static short[] shorts1fafa9bf76ed3352892023b88da3732d;
    private static boolean[] booleans1fafa9bf76ed3352892023b88da3732d;
    private static byte[] bytes1fafa9bf76ed3352892023b88da3732d;
    private static String[] strings1fafa9bf76ed3352892023b88da3732d;
    public static Object[] staticFields1fafa9bf76ed3352892023b88da3732d;

    private static /* synthetic */ H[] id_byte() {
        H[] hArray = new H[bytes1fafa9bf76ed3352892023b88da3732d[0]];
        hArray[H.booleans1fafa9bf76ed3352892023b88da3732d[0]] = (H)((Object)staticFields1fafa9bf76ed3352892023b88da3732d[shorts1fafa9bf76ed3352892023b88da3732d[1]]);
        hArray[H.booleans1fafa9bf76ed3352892023b88da3732d[1]] = (H)((Object)staticFields1fafa9bf76ed3352892023b88da3732d[shorts1fafa9bf76ed3352892023b88da3732d[2]]);
        hArray[H.bytes1fafa9bf76ed3352892023b88da3732d[1]] = (H)((Object)staticFields1fafa9bf76ed3352892023b88da3732d[shorts1fafa9bf76ed3352892023b88da3732d[3]]);
        hArray[H.bytes1fafa9bf76ed3352892023b88da3732d[2]] = (H)((Object)staticFields1fafa9bf76ed3352892023b88da3732d[shorts1fafa9bf76ed3352892023b88da3732d[4]]);
        return hArray;
    }

    static {
        H.ntfClinit();
    }

    public static H[] values() {
        return (H[])((H[])staticFields1fafa9bf76ed3352892023b88da3732d[shorts1fafa9bf76ed3352892023b88da3732d[0]]).clone();
    }

    public static H valueOf(String string) {
        return Enum.valueOf(H.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x75F0725CA4150A8FL;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans1fafa9bf76ed3352892023b88da3732d = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-56, -22, 32, 83, 110, 118, 53, -34}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9306D00C;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new H(), new H(), new H(), new H(), new H[]{(H)((Object)objectArray[0]), (H)((Object)objectArray[1]), (H)((Object)objectArray[2]), (H)((Object)objectArray[3])}};
        staticFields1fafa9bf76ed3352892023b88da3732d = objectArray;
    }

    private static void id_throws() {
        bytes1fafa9bf76ed3352892023b88da3732d = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }

    private static /* synthetic */ void ntfClinit() {
        H.id_class();
        H.id_case();
        H.id_protected();
        H.id_throws();
        H.id_break();
    }

    private static void id_case() {
        strings1fafa9bf76ed3352892023b88da3732d = new String[]{new String("LOAD"), new String("UNLOAD"), new String("POPULATE_FULL"), new String("POPULATE_PARTIAL")};
    }

    private static void id_protected() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        shorts1fafa9bf76ed3352892023b88da3732d = sArray;
    }
}

