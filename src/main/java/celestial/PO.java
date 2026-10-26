/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class PO
extends Enum<PO> {
    private static byte[] bytes76a2616475a7392d96bc61fb714cace1;
    public static Object[] staticFields76a2616475a7392d96bc61fb714cace1;
    private static String[] strings76a2616475a7392d96bc61fb714cace1;
    private static boolean[] booleans76a2616475a7392d96bc61fb714cace1;
    private static short[] shorts76a2616475a7392d96bc61fb714cace1;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans76a2616475a7392d96bc61fb714cace1 = blArray;
    }

    static {
        PO.ntfClinit();
    }

    public static PO[] values() {
        return (PO[])((PO[])staticFields76a2616475a7392d96bc61fb714cace1[shorts76a2616475a7392d96bc61fb714cace1[0]]).clone();
    }

    public static PO valueOf(String string) {
        return Enum.valueOf(PO.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x30C8E61E;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-8, -50, 55, 43, 45, 33, 91, -27}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[6];
        sArray[0] = 5;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        shorts76a2616475a7392d96bc61fb714cace1 = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC36C2F7B9A49E51BL;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new PO(), new PO(), new PO(), new PO(), new PO(), new PO[]{(PO)((Object)objectArray[0]), (PO)((Object)objectArray[1]), (PO)((Object)objectArray[2]), (PO)((Object)objectArray[3]), (PO)((Object)objectArray[4])}};
        staticFields76a2616475a7392d96bc61fb714cace1 = objectArray;
    }

    private static void id_throws() {
        bytes76a2616475a7392d96bc61fb714cace1 = new byte[]{5, 2, 3, 4, 2, 2, 3, 3, 4, 4, 5, 6};
    }

    private static /* synthetic */ void ntfClinit() {
        PO.id_byte();
        PO.id_protected();
        PO.id_class();
        PO.id_throws();
        PO.id_break();
    }

    private static /* synthetic */ PO[] id_case() {
        PO[] pOArray = new PO[bytes76a2616475a7392d96bc61fb714cace1[0]];
        pOArray[PO.booleans76a2616475a7392d96bc61fb714cace1[0]] = (PO)((Object)staticFields76a2616475a7392d96bc61fb714cace1[shorts76a2616475a7392d96bc61fb714cace1[1]]);
        pOArray[PO.booleans76a2616475a7392d96bc61fb714cace1[1]] = (PO)((Object)staticFields76a2616475a7392d96bc61fb714cace1[shorts76a2616475a7392d96bc61fb714cace1[2]]);
        pOArray[PO.bytes76a2616475a7392d96bc61fb714cace1[1]] = (PO)((Object)staticFields76a2616475a7392d96bc61fb714cace1[shorts76a2616475a7392d96bc61fb714cace1[3]]);
        pOArray[PO.bytes76a2616475a7392d96bc61fb714cace1[2]] = (PO)((Object)staticFields76a2616475a7392d96bc61fb714cace1[shorts76a2616475a7392d96bc61fb714cace1[4]]);
        pOArray[PO.bytes76a2616475a7392d96bc61fb714cace1[3]] = (PO)((Object)staticFields76a2616475a7392d96bc61fb714cace1[shorts76a2616475a7392d96bc61fb714cace1[5]]);
        return pOArray;
    }

    private static void id_protected() {
        strings76a2616475a7392d96bc61fb714cace1 = new String[]{new String("SUCCESS_TO_GOAL"), new String("SUCCESS_SEGMENT"), new String("FAILURE"), new String("CANCELLATION"), new String("EXCEPTION")};
    }
}

