/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNB;
import celestial.rrNP;
import celestial.rrNS;
import celestial.rrNr_1;
import celestial.rrQD;
import celestial.rrQU;
import celestial.rrQa_1;
import celestial.rrQe_1;
import celestial.rrQi_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract sealed class rrQK
extends Enum<rrQK>
permits rrQD, rrQU, rrQe_1, rrQa_1, rrQi_1, rrNr_1, rrNP, rrNB, rrNS {
    private static boolean[] booleansd7edc8a98bf936d38fa97cfea6cbd552;
    private static String[] stringsd7edc8a98bf936d38fa97cfea6cbd552;
    private static short[] shortsd7edc8a98bf936d38fa97cfea6cbd552;
    private static byte[] bytesd7edc8a98bf936d38fa97cfea6cbd552;
    public static Object[] staticFieldsd7edc8a98bf936d38fa97cfea6cbd552;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansd7edc8a98bf936d38fa97cfea6cbd552 = blArray;
    }

    static {
        rrQK.ntfClinit();
    }

    public static rrQK[] values() {
        return (rrQK[])((rrQK[])staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[0]]).clone();
    }

    public static rrQK valueOf(String string) {
        return Enum.valueOf(rrQK.class, string);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xACC8CF392D48831AL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x32997E5E;
    }

    private static void id_class() {
        stringsd7edc8a98bf936d38fa97cfea6cbd552 = new String[]{new String("OUT_QUAD"), new String("OUT_CIRC"), new String("OUT_BACK"), new String("LINEAR"), new String("OUT_BOUNCE"), new String("OUT_ELASTIC"), new String("OUT_EXPO"), new String("OUT_SINE"), new String("SPRING")};
    }

    public abstract double id_class(double var1);

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{23, -41, 42, 9, 55, 20, 116, -32}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rrQD(), new rrQU(), new rrQe_1(), new rrQa_1(), new rrQi_1(), new rrNr_1(), new rrNP(), new rrNB(), new rrNS(), new rrQK[]{(rrQK)((Object)objectArray[1]), (rrQK)((Object)objectArray[2]), (rrQK)((Object)objectArray[3]), (rrQK)((Object)objectArray[4]), (rrQK)((Object)objectArray[5]), (rrQK)((Object)objectArray[6]), (rrQK)((Object)objectArray[7])}};
        staticFieldsd7edc8a98bf936d38fa97cfea6cbd552 = objectArray;
    }

    private static void id_throws() {
        bytesd7edc8a98bf936d38fa97cfea6cbd552 = new byte[]{9, 2, 3, 4, 5, 6, 7, 8, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10};
    }

    private static /* synthetic */ void ntfClinit() {
        rrQK.id_byte();
        rrQK.id_class();
        rrQK.id_protected();
        rrQK.id_throws();
        rrQK.id_break();
    }

    private static /* synthetic */ rrQK[] id_case() {
        rrQK[] rrQKArray = new rrQK[bytesd7edc8a98bf936d38fa97cfea6cbd552[0]];
        rrQKArray[rrQK.booleansd7edc8a98bf936d38fa97cfea6cbd552[0]] = (rrQK)((Object)staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[1]]);
        rrQKArray[rrQK.booleansd7edc8a98bf936d38fa97cfea6cbd552[1]] = (rrQK)((Object)staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[2]]);
        rrQKArray[rrQK.bytesd7edc8a98bf936d38fa97cfea6cbd552[1]] = (rrQK)((Object)staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[3]]);
        rrQKArray[rrQK.bytesd7edc8a98bf936d38fa97cfea6cbd552[2]] = (rrQK)((Object)staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[4]]);
        rrQKArray[rrQK.bytesd7edc8a98bf936d38fa97cfea6cbd552[3]] = (rrQK)((Object)staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[5]]);
        rrQKArray[rrQK.bytesd7edc8a98bf936d38fa97cfea6cbd552[4]] = (rrQK)((Object)staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[6]]);
        rrQKArray[rrQK.bytesd7edc8a98bf936d38fa97cfea6cbd552[5]] = (rrQK)((Object)staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[7]]);
        rrQKArray[rrQK.bytesd7edc8a98bf936d38fa97cfea6cbd552[6]] = (rrQK)((Object)staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[8]]);
        rrQKArray[rrQK.bytesd7edc8a98bf936d38fa97cfea6cbd552[7]] = (rrQK)((Object)staticFieldsd7edc8a98bf936d38fa97cfea6cbd552[shortsd7edc8a98bf936d38fa97cfea6cbd552[9]]);
        return rrQKArray;
    }

    private static void id_protected() {
        short[] sArray = new short[10];
        sArray[0] = 9;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 5;
        sArray[7] = 6;
        sArray[8] = 7;
        sArray[9] = 8;
        shortsd7edc8a98bf936d38fa97cfea6cbd552 = sArray;
    }
}

