/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpP_2
extends Enum<rrpP_2> {
    private static String[] stringsc884105b69f333058e091d3dfd5ffa8a;
    public static Object[] staticFieldsc884105b69f333058e091d3dfd5ffa8a;
    private static short[] shortsc884105b69f333058e091d3dfd5ffa8a;
    private static boolean[] booleansc884105b69f333058e091d3dfd5ffa8a;
    private static byte[] bytesc884105b69f333058e091d3dfd5ffa8a;

    private static void id_byte() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpP_2(), new rrpP_2(), new rrpP_2(), new rrpP_2[]{(rrpP_2)((Object)objectArray[0]), (rrpP_2)((Object)objectArray[1]), (rrpP_2)((Object)objectArray[2])}};
        staticFieldsc884105b69f333058e091d3dfd5ffa8a = objectArray;
    }

    static {
        rrpP_2.ntfClinit();
    }

    public static rrpP_2[] values() {
        return (rrpP_2[])((rrpP_2[])staticFieldsc884105b69f333058e091d3dfd5ffa8a[shortsc884105b69f333058e091d3dfd5ffa8a[0]]).clone();
    }

    public static rrpP_2 valueOf(String string) {
        return Enum.valueOf(rrpP_2.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x58E3260250523EA2L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x73BD3C1B;
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsc884105b69f333058e091d3dfd5ffa8a = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{84, -23, -15, 123, -126, -116, -119, 8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ rrpP_2[] id_break() {
        rrpP_2[] rrpP_2Array = new rrpP_2[bytesc884105b69f333058e091d3dfd5ffa8a[0]];
        rrpP_2Array[rrpP_2.booleansc884105b69f333058e091d3dfd5ffa8a[0]] = (rrpP_2)((Object)staticFieldsc884105b69f333058e091d3dfd5ffa8a[shortsc884105b69f333058e091d3dfd5ffa8a[1]]);
        rrpP_2Array[rrpP_2.booleansc884105b69f333058e091d3dfd5ffa8a[1]] = (rrpP_2)((Object)staticFieldsc884105b69f333058e091d3dfd5ffa8a[shortsc884105b69f333058e091d3dfd5ffa8a[2]]);
        rrpP_2Array[rrpP_2.bytesc884105b69f333058e091d3dfd5ffa8a[1]] = (rrpP_2)((Object)staticFieldsc884105b69f333058e091d3dfd5ffa8a[shortsc884105b69f333058e091d3dfd5ffa8a[3]]);
        return rrpP_2Array;
    }

    private static void id_throws() {
        stringsc884105b69f333058e091d3dfd5ffa8a = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrpP_2.id_case();
        rrpP_2.id_throws();
        rrpP_2.id_class();
        rrpP_2.id_protected();
        rrpP_2.id_byte();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansc884105b69f333058e091d3dfd5ffa8a = blArray;
    }

    private static void id_protected() {
        bytesc884105b69f333058e091d3dfd5ffa8a = new byte[]{3, 2, 2, 2, 3, 4};
    }
}

