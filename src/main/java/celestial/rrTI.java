/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrTI
extends Enum<rrTI> {
    private static byte[] bytes26dd9f437bcd34c68d5b38988a1a3f7f;
    public static Object[] staticFields26dd9f437bcd34c68d5b38988a1a3f7f;
    private static short[] shorts26dd9f437bcd34c68d5b38988a1a3f7f;
    private static boolean[] booleans26dd9f437bcd34c68d5b38988a1a3f7f;
    private static String[] strings26dd9f437bcd34c68d5b38988a1a3f7f;

    private static void id_byte() {
        short[] sArray = new short[3];
        sArray[0] = 2;
        sArray[2] = 1;
        shorts26dd9f437bcd34c68d5b38988a1a3f7f = sArray;
    }

    static {
        rrTI.ntfClinit();
    }

    public static rrTI[] values() {
        return (rrTI[])((rrTI[])staticFields26dd9f437bcd34c68d5b38988a1a3f7f[shorts26dd9f437bcd34c68d5b38988a1a3f7f[0]]).clone();
    }

    public static rrTI valueOf(String string) {
        return Enum.valueOf(rrTI.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-73, -58, -23, 42, -38, -65, -20, -76}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC3600B75;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrTI(), new rrTI(), new rrTI[]{(rrTI)((Object)objectArray[0]), (rrTI)((Object)objectArray[1])}};
        staticFields26dd9f437bcd34c68d5b38988a1a3f7f = objectArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x40E5A2FDD2E8D0FCL;
    }

    private static /* synthetic */ rrTI[] id_break() {
        rrTI[] rrTIArray = new rrTI[bytes26dd9f437bcd34c68d5b38988a1a3f7f[0]];
        rrTIArray[rrTI.booleans26dd9f437bcd34c68d5b38988a1a3f7f[0]] = (rrTI)((Object)staticFields26dd9f437bcd34c68d5b38988a1a3f7f[shorts26dd9f437bcd34c68d5b38988a1a3f7f[1]]);
        rrTIArray[rrTI.booleans26dd9f437bcd34c68d5b38988a1a3f7f[1]] = (rrTI)((Object)staticFields26dd9f437bcd34c68d5b38988a1a3f7f[shorts26dd9f437bcd34c68d5b38988a1a3f7f[2]]);
        return rrTIArray;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans26dd9f437bcd34c68d5b38988a1a3f7f = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrTI.id_throws();
        rrTI.id_case();
        rrTI.id_byte();
        rrTI.id_protected();
        rrTI.id_class();
    }

    private static void id_case() {
        strings26dd9f437bcd34c68d5b38988a1a3f7f = new String[]{new String("DEFAULT"), new String("FORCE")};
    }

    private static void id_protected() {
        bytes26dd9f437bcd34c68d5b38988a1a3f7f = new byte[]{2, 2, 3};
    }
}

