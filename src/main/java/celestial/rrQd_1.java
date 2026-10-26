/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQd_1
extends Enum<rrQd_1> {
    private static byte[] bytes634ba5beb257384d8792f008140c7c0a;
    private static boolean[] booleans634ba5beb257384d8792f008140c7c0a;
    public static Object[] staticFields634ba5beb257384d8792f008140c7c0a;
    private static String[] strings634ba5beb257384d8792f008140c7c0a;
    public Object[] fields634ba5beb257384d8792f008140c7c0a;
    private static short[] shorts634ba5beb257384d8792f008140c7c0a;

    private static void id_byte() {
        strings634ba5beb257384d8792f008140c7c0a = new String[]{new String("OFFLINE"), new String("Offline"), new String("RANDOM_OFFLINE"), new String("Random Offline"), new String("MOJANG"), new String("Mojang"), new String("MICROSOFT"), new String("Microsoft")};
    }

    private rrQd_1(String string2) {
        this.id_case();
        String string3 = string2;
        this.fields634ba5beb257384d8792f008140c7c0a[rrQd_1.shorts634ba5beb257384d8792f008140c7c0a[2]] = string3;
    }

    static {
        rrQd_1.ntfClinit();
    }

    public static rrQd_1[] values() {
        return (rrQd_1[])((rrQd_1[])staticFields634ba5beb257384d8792f008140c7c0a[shorts634ba5beb257384d8792f008140c7c0a[0]]).clone();
    }

    public static rrQd_1 valueOf(String string) {
        return Enum.valueOf(rrQd_1.class, string);
    }

    public String id_class() {
        return (String)this.fields634ba5beb257384d8792f008140c7c0a[shorts634ba5beb257384d8792f008140c7c0a[1]];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x453BDF87;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3F8A8E42FAD6A5A5L;
    }

    public static rrQd_1 id_class(String string) {
        rrQd_1[] rrQd_1Array = rrQd_1.values();
        int n = rrQd_1Array.length;
        for (int i = booleans634ba5beb257384d8792f008140c7c0a[0]; i < n; ++i) {
            rrQd_1 rrQd_12 = rrQd_1Array[i];
            if (!rrQd_12.id_class().equalsIgnoreCase(string.toLowerCase())) continue;
            return rrQd_12;
        }
        return null;
    }

    private static /* synthetic */ rrQd_1[] id_break() {
        rrQd_1[] rrQd_1Array = new rrQd_1[bytes634ba5beb257384d8792f008140c7c0a[0]];
        rrQd_1Array[rrQd_1.booleans634ba5beb257384d8792f008140c7c0a[1]] = (rrQd_1)((Object)staticFields634ba5beb257384d8792f008140c7c0a[shorts634ba5beb257384d8792f008140c7c0a[3]]);
        rrQd_1Array[rrQd_1.booleans634ba5beb257384d8792f008140c7c0a[2]] = (rrQd_1)((Object)staticFields634ba5beb257384d8792f008140c7c0a[shorts634ba5beb257384d8792f008140c7c0a[4]]);
        rrQd_1Array[rrQd_1.bytes634ba5beb257384d8792f008140c7c0a[1]] = (rrQd_1)((Object)staticFields634ba5beb257384d8792f008140c7c0a[shorts634ba5beb257384d8792f008140c7c0a[5]]);
        rrQd_1Array[rrQd_1.bytes634ba5beb257384d8792f008140c7c0a[2]] = (rrQd_1)((Object)staticFields634ba5beb257384d8792f008140c7c0a[shorts634ba5beb257384d8792f008140c7c0a[6]]);
        return rrQd_1Array;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{105, -68, -88, 124, -67, 19, -123, -67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        short[] sArray = new short[7];
        sArray[0] = 4;
        sArray[4] = 1;
        sArray[5] = 2;
        sArray[6] = 3;
        shorts634ba5beb257384d8792f008140c7c0a = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrQd_1.id_private();
        rrQd_1.id_byte();
        rrQd_1.id_throws();
        rrQd_1.id_catch();
        rrQd_1.id_protected();
    }

    private static void id_catch() {
        bytes634ba5beb257384d8792f008140c7c0a = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }

    private void id_case() {
        if (this.fields634ba5beb257384d8792f008140c7c0a == null) {
            Object[] objectArray = this.fields634ba5beb257384d8792f008140c7c0a = new Object[booleans634ba5beb257384d8792f008140c7c0a[7]];
        }
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrQd_1(strings634ba5beb257384d8792f008140c7c0a[1]), new rrQd_1(strings634ba5beb257384d8792f008140c7c0a[3]), new rrQd_1(strings634ba5beb257384d8792f008140c7c0a[5]), new rrQd_1(strings634ba5beb257384d8792f008140c7c0a[7]), new rrQd_1[]{(rrQd_1)((Object)objectArray[0]), (rrQd_1)((Object)objectArray[1]), (rrQd_1)((Object)objectArray[2]), (rrQd_1)((Object)objectArray[3])}};
        staticFields634ba5beb257384d8792f008140c7c0a = objectArray;
    }

    private static void id_private() {
        boolean[] blArray = new boolean[8];
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleans634ba5beb257384d8792f008140c7c0a = blArray;
    }
}

