/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rhd_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sq_3
extends Enum<sq_3> {
    private static String[] strings7c97b86bc96f32548c9e3133b384faa8;
    private static short[] shorts7c97b86bc96f32548c9e3133b384faa8;
    public Object[] fields7c97b86bc96f32548c9e3133b384faa8;
    private static boolean[] booleans7c97b86bc96f32548c9e3133b384faa8;
    private static byte[] bytes7c97b86bc96f32548c9e3133b384faa8;
    public static Object[] staticFields7c97b86bc96f32548c9e3133b384faa8;

    private void id_byte() {
        if (this.fields7c97b86bc96f32548c9e3133b384faa8 == null) {
            Object[] objectArray = this.fields7c97b86bc96f32548c9e3133b384faa8 = new Object[booleans7c97b86bc96f32548c9e3133b384faa8[6]];
        }
    }

    private sq_3(Predicate<an_3> predicate) {
        Predicate<an_3> predicate2;
        this.id_byte();
        this.fields7c97b86bc96f32548c9e3133b384faa8[sq_3.shorts7c97b86bc96f32548c9e3133b384faa8[1]] = predicate2 = predicate;
    }

    static {
        sq_3.ntfClinit();
    }

    public static sq_3[] values() {
        return (sq_3[])((sq_3[])staticFields7c97b86bc96f32548c9e3133b384faa8[shorts7c97b86bc96f32548c9e3133b384faa8[0]]).clone();
    }

    public static sq_3 valueOf(String string) {
        return Enum.valueOf(sq_3.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{5, -12, -32, 0, 5, -54, 21, 10}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x43D7797C;
    }

    private static void id_class() {
        strings7c97b86bc96f32548c9e3133b384faa8 = new String[]{new String("ENTITIES"), new String("PLAYERS")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA424BC553D0E57D0L;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new sq_3(iB_2.class::isInstance), new sq_3(rhd_3.class::isInstance), new sq_3[]{(sq_3)((Object)objectArray[0]), (sq_3)((Object)objectArray[1])}};
        staticFields7c97b86bc96f32548c9e3133b384faa8 = objectArray;
    }

    private static /* synthetic */ sq_3[] id_throws() {
        sq_3[] sq_3Array = new sq_3[bytes7c97b86bc96f32548c9e3133b384faa8[0]];
        sq_3Array[sq_3.booleans7c97b86bc96f32548c9e3133b384faa8[0]] = (sq_3)((Object)staticFields7c97b86bc96f32548c9e3133b384faa8[shorts7c97b86bc96f32548c9e3133b384faa8[2]]);
        sq_3Array[sq_3.booleans7c97b86bc96f32548c9e3133b384faa8[1]] = (sq_3)((Object)staticFields7c97b86bc96f32548c9e3133b384faa8[shorts7c97b86bc96f32548c9e3133b384faa8[3]]);
        return sq_3Array;
    }

    private static /* synthetic */ void ntfClinit() {
        sq_3.id_case();
        sq_3.id_class();
        sq_3.id_catch();
        sq_3.id_protected();
        sq_3.id_break();
    }

    private static void id_catch() {
        short[] sArray = new short[4];
        sArray[0] = 2;
        sArray[3] = 1;
        shorts7c97b86bc96f32548c9e3133b384faa8 = sArray;
    }

    private static void id_case() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[6] = true;
        booleans7c97b86bc96f32548c9e3133b384faa8 = blArray;
    }

    private static void id_protected() {
        bytes7c97b86bc96f32548c9e3133b384faa8 = new byte[]{2, 2, 3};
    }
}

