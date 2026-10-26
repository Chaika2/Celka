/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rC_2
extends Enum<rC_2> {
    private static short[] shorts8c829f9bf33c3c2bb018688b591a16ef;
    public static Object[] staticFields8c829f9bf33c3c2bb018688b591a16ef;
    private static String[] strings8c829f9bf33c3c2bb018688b591a16ef;
    private static boolean[] booleans8c829f9bf33c3c2bb018688b591a16ef;
    private static byte[] bytes8c829f9bf33c3c2bb018688b591a16ef;

    private static void id_byte() {
        short[] sArray = new short[7];
        sArray[0] = 6;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        sArray[5] = 4;
        sArray[6] = 5;
        shorts8c829f9bf33c3c2bb018688b591a16ef = sArray;
    }

    static {
        rC_2.ntfClinit();
    }

    public static rC_2[] values() {
        return (rC_2[])((rC_2[])staticFields8c829f9bf33c3c2bb018688b591a16ef[shorts8c829f9bf33c3c2bb018688b591a16ef[0]]).clone();
    }

    public static rC_2 valueOf(String string) {
        return Enum.valueOf(rC_2.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x188569C7;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans8c829f9bf33c3c2bb018688b591a16ef = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{77, -65, 92, 50, -81, 105, -24, 98}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6BA24FB6FF0518E3L;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rC_2(), new rC_2(), new rC_2(), new rC_2(), new rC_2(), new rC_2(), new rC_2[]{(rC_2)((Object)objectArray[0]), (rC_2)((Object)objectArray[1]), (rC_2)((Object)objectArray[2]), (rC_2)((Object)objectArray[3]), (rC_2)((Object)objectArray[4]), (rC_2)((Object)objectArray[5])}};
        staticFields8c829f9bf33c3c2bb018688b591a16ef = objectArray;
    }

    private static void id_throws() {
        strings8c829f9bf33c3c2bb018688b591a16ef = new String[]{new String("SET_GOAL_AND_PATH"), new String("REQUEST_PAUSE"), new String("CANCEL_AND_SET_GOAL"), new String("REVALIDATE_GOAL_AND_PATH"), new String("FORCE_REVALIDATE_GOAL_AND_PATH"), new String("DEFER")};
    }

    private static /* synthetic */ void ntfClinit() {
        rC_2.id_class();
        rC_2.id_throws();
        rC_2.id_byte();
        rC_2.id_protected();
        rC_2.id_break();
    }

    private static /* synthetic */ rC_2[] id_case() {
        rC_2[] rC_2Array = new rC_2[bytes8c829f9bf33c3c2bb018688b591a16ef[0]];
        rC_2Array[rC_2.booleans8c829f9bf33c3c2bb018688b591a16ef[0]] = (rC_2)((Object)staticFields8c829f9bf33c3c2bb018688b591a16ef[shorts8c829f9bf33c3c2bb018688b591a16ef[1]]);
        rC_2Array[rC_2.booleans8c829f9bf33c3c2bb018688b591a16ef[1]] = (rC_2)((Object)staticFields8c829f9bf33c3c2bb018688b591a16ef[shorts8c829f9bf33c3c2bb018688b591a16ef[2]]);
        rC_2Array[rC_2.bytes8c829f9bf33c3c2bb018688b591a16ef[1]] = (rC_2)((Object)staticFields8c829f9bf33c3c2bb018688b591a16ef[shorts8c829f9bf33c3c2bb018688b591a16ef[3]]);
        rC_2Array[rC_2.bytes8c829f9bf33c3c2bb018688b591a16ef[2]] = (rC_2)((Object)staticFields8c829f9bf33c3c2bb018688b591a16ef[shorts8c829f9bf33c3c2bb018688b591a16ef[4]]);
        rC_2Array[rC_2.bytes8c829f9bf33c3c2bb018688b591a16ef[3]] = (rC_2)((Object)staticFields8c829f9bf33c3c2bb018688b591a16ef[shorts8c829f9bf33c3c2bb018688b591a16ef[5]]);
        rC_2Array[rC_2.bytes8c829f9bf33c3c2bb018688b591a16ef[4]] = (rC_2)((Object)staticFields8c829f9bf33c3c2bb018688b591a16ef[shorts8c829f9bf33c3c2bb018688b591a16ef[6]]);
        return rC_2Array;
    }

    private static void id_protected() {
        bytes8c829f9bf33c3c2bb018688b591a16ef = new byte[]{6, 2, 3, 4, 5, 2, 2, 3, 3, 4, 4, 5, 5, 6, 7};
    }
}

