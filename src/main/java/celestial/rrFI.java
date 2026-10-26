/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrFI
extends Enum<rrFI> {
    private static boolean[] booleans7eee503931553d5586d91adc0f9df349;
    private static short[] shorts7eee503931553d5586d91adc0f9df349;
    private static String[] strings7eee503931553d5586d91adc0f9df349;
    public static Object[] staticFields7eee503931553d5586d91adc0f9df349;
    private static byte[] bytes7eee503931553d5586d91adc0f9df349;

    private static /* synthetic */ rrFI[] id_byte() {
        rrFI[] rrFIArray = new rrFI[bytes7eee503931553d5586d91adc0f9df349[0]];
        rrFIArray[rrFI.booleans7eee503931553d5586d91adc0f9df349[0]] = (rrFI)((Object)staticFields7eee503931553d5586d91adc0f9df349[shorts7eee503931553d5586d91adc0f9df349[1]]);
        rrFIArray[rrFI.booleans7eee503931553d5586d91adc0f9df349[1]] = (rrFI)((Object)staticFields7eee503931553d5586d91adc0f9df349[shorts7eee503931553d5586d91adc0f9df349[2]]);
        return rrFIArray;
    }

    static {
        rrFI.ntfClinit();
    }

    public static rrFI[] values() {
        return (rrFI[])((rrFI[])staticFields7eee503931553d5586d91adc0f9df349[shorts7eee503931553d5586d91adc0f9df349[0]]).clone();
    }

    public static rrFI valueOf(String string) {
        return Enum.valueOf(rrFI.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE19CC1AA;
    }

    private static void id_class() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts7eee503931553d5586d91adc0f9df349 = sArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{46, -14, 95, 118, -84, -3, 3, -120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEA81C96732ACA830L;
    }

    private static void id_break() {
        Object[] objectArray;
        objectArray = new Object[]{new rrFI(), new rrFI(), new rrFI[]{(rrFI)((Object)objectArray[0]), (rrFI)((Object)objectArray[1])}};
        staticFields7eee503931553d5586d91adc0f9df349 = objectArray;
    }

    private static void id_throws() {
        bytes7eee503931553d5586d91adc0f9df349 = new byte[]{2, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        rrFI.id_case();
        rrFI.id_protected();
        rrFI.id_class();
        rrFI.id_throws();
        rrFI.id_break();
    }

    private static void id_case() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans7eee503931553d5586d91adc0f9df349 = blArray;
    }

    private static void id_protected() {
        strings7eee503931553d5586d91adc0f9df349 = new String[]{new String("START"), new String("END")};
    }
}

