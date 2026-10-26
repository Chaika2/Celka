/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class p_1
extends Enum<p_1> {
    public static Object[] staticFields210b45dc4af9338b80bcf1ca23dea17d;
    private static boolean[] booleans210b45dc4af9338b80bcf1ca23dea17d;
    private static String[] strings210b45dc4af9338b80bcf1ca23dea17d;
    private static short[] shorts210b45dc4af9338b80bcf1ca23dea17d;
    private static byte[] bytes210b45dc4af9338b80bcf1ca23dea17d;

    private static void id_byte() {
        bytes210b45dc4af9338b80bcf1ca23dea17d = new byte[]{12, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13};
    }

    static {
        p_1.ntfClinit();
    }

    public static p_1[] values() {
        return (p_1[])((p_1[])staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[0]]).clone();
    }

    public static p_1 valueOf(String string) {
        return Enum.valueOf(p_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, 46, 60, 40, 91, 55, 61, -82}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6863F27D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x46F58365E01FE34BL;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1(), new p_1[]{(p_1)((Object)objectArray[0]), (p_1)((Object)objectArray[1]), (p_1)((Object)objectArray[2]), (p_1)((Object)objectArray[3]), (p_1)((Object)objectArray[4]), (p_1)((Object)objectArray[5]), (p_1)((Object)objectArray[6]), (p_1)((Object)objectArray[7]), (p_1)((Object)objectArray[8]), (p_1)((Object)objectArray[9]), (p_1)((Object)objectArray[10]), (p_1)((Object)objectArray[11])}};
        staticFields210b45dc4af9338b80bcf1ca23dea17d = objectArray;
    }

    private static void id_break() {
        strings210b45dc4af9338b80bcf1ca23dea17d = new String[]{new String("CALC_STARTED"), new String("CALC_FINISHED_NOW_EXECUTING"), new String("CALC_FAILED"), new String("NEXT_SEGMENT_CALC_STARTED"), new String("NEXT_SEGMENT_CALC_FINISHED"), new String("CONTINUING_ONTO_PLANNED_NEXT"), new String("SPLICING_ONTO_NEXT_EARLY"), new String("AT_GOAL"), new String("PATH_FINISHED_NEXT_STILL_CALCULATING"), new String("NEXT_CALC_FAILED"), new String("DISCARD_NEXT"), new String("CANCELED")};
    }

    private static /* synthetic */ p_1[] id_throws() {
        p_1[] p_1Array = new p_1[bytes210b45dc4af9338b80bcf1ca23dea17d[0]];
        p_1Array[p_1.booleans210b45dc4af9338b80bcf1ca23dea17d[0]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[1]]);
        p_1Array[p_1.booleans210b45dc4af9338b80bcf1ca23dea17d[1]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[2]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[1]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[3]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[2]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[4]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[3]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[5]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[4]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[6]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[5]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[7]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[6]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[8]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[7]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[9]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[8]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[10]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[9]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[11]]);
        p_1Array[p_1.bytes210b45dc4af9338b80bcf1ca23dea17d[10]] = (p_1)((Object)staticFields210b45dc4af9338b80bcf1ca23dea17d[shorts210b45dc4af9338b80bcf1ca23dea17d[12]]);
        return p_1Array;
    }

    private static /* synthetic */ void ntfClinit() {
        p_1.id_case();
        p_1.id_break();
        p_1.id_protected();
        p_1.id_byte();
        p_1.id_class();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans210b45dc4af9338b80bcf1ca23dea17d = blArray;
    }

    private static void id_protected() {
        short[] sArray = new short[13];
        sArray[0] = 12;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 5;
        sArray[7] = 6;
        sArray[8] = 7;
        sArray[9] = 8;
        sArray[10] = 9;
        sArray[11] = 10;
        sArray[12] = 11;
        shorts210b45dc4af9338b80bcf1ca23dea17d = sArray;
    }
}

