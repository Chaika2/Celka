/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Sq_1
extends Enum<Sq_1> {
    private static boolean[] booleans3819d0a25319329c972e0f964aeaa125;
    private static short[] shorts3819d0a25319329c972e0f964aeaa125;
    private static byte[] bytes3819d0a25319329c972e0f964aeaa125;
    public static Object[] staticFields3819d0a25319329c972e0f964aeaa125;
    private static String[] strings3819d0a25319329c972e0f964aeaa125;

    private static void id_byte() {
        bytes3819d0a25319329c972e0f964aeaa125 = new byte[]{2, 2, 3};
    }

    static {
        Sq_1.ntfClinit();
    }

    public static Sq_1[] values() {
        return (Sq_1[])((Sq_1[])staticFields3819d0a25319329c972e0f964aeaa125[shorts3819d0a25319329c972e0f964aeaa125[0]]).clone();
    }

    public static Sq_1 valueOf(String string) {
        return Enum.valueOf(Sq_1.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x55E1F465;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{104, 12, 21, -128, -13, -106, -119, 67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x54FBED6505091A07L;
    }

    private static void id_class() {
        strings3819d0a25319329c972e0f964aeaa125 = new String[]{new String("FOUND_BUT_NO_NEEDED_NUMBER"), new String("OK")};
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans3819d0a25319329c972e0f964aeaa125 = blArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new Sq_1(), new Sq_1(), new Sq_1[]{(Sq_1)((Object)objectArray[0]), (Sq_1)((Object)objectArray[1])}};
        staticFields3819d0a25319329c972e0f964aeaa125 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Sq_1.id_break();
        Sq_1.id_class();
        Sq_1.id_protected();
        Sq_1.id_byte();
        Sq_1.id_throws();
    }

    private static /* synthetic */ Sq_1[] id_case() {
        Sq_1[] sq_1Array = new Sq_1[bytes3819d0a25319329c972e0f964aeaa125[0]];
        sq_1Array[Sq_1.booleans3819d0a25319329c972e0f964aeaa125[0]] = (Sq_1)((Object)staticFields3819d0a25319329c972e0f964aeaa125[shorts3819d0a25319329c972e0f964aeaa125[1]]);
        sq_1Array[Sq_1.booleans3819d0a25319329c972e0f964aeaa125[1]] = (Sq_1)((Object)staticFields3819d0a25319329c972e0f964aeaa125[shorts3819d0a25319329c972e0f964aeaa125[2]]);
        return sq_1Array;
    }

    private static void id_protected() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts3819d0a25319329c972e0f964aeaa125 = sArray;
    }
}

