/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrAd_1
extends Enum<rrAd_1> {
    private static boolean[] booleanseafc2f5d275533c69a39185d3a872ac0;
    private static short[] shortseafc2f5d275533c69a39185d3a872ac0;
    private static byte[] byteseafc2f5d275533c69a39185d3a872ac0;
    public static Object[] staticFieldseafc2f5d275533c69a39185d3a872ac0;
    private static String[] stringseafc2f5d275533c69a39185d3a872ac0;

    private static void id_byte() {
        stringseafc2f5d275533c69a39185d3a872ac0 = new String[]{new String("LIQUID"), new String("ENTITY"), new String("BLOCKS"), new String("BUBBLE_COLUMN")};
    }

    static {
        rrAd_1.ntfClinit();
    }

    public static rrAd_1[] values() {
        return (rrAd_1[])((rrAd_1[])staticFieldseafc2f5d275533c69a39185d3a872ac0[shortseafc2f5d275533c69a39185d3a872ac0[0]]).clone();
    }

    public static rrAd_1 valueOf(String string) {
        return Enum.valueOf(rrAd_1.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{90, 124, 106, 13, -77, -90, -6, -47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7CCC168AA2183485L;
    }

    private static void id_class() {
        short[] sArray = new short[5];
        sArray[0] = 4;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[4] = 3;
        shortseafc2f5d275533c69a39185d3a872ac0 = sArray;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBCAF40CD;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleanseafc2f5d275533c69a39185d3a872ac0 = blArray;
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrAd_1(), new rrAd_1(), new rrAd_1(), new rrAd_1(), new rrAd_1[]{(rrAd_1)((Object)objectArray[0]), (rrAd_1)((Object)objectArray[1]), (rrAd_1)((Object)objectArray[2]), (rrAd_1)((Object)objectArray[3])}};
        staticFieldseafc2f5d275533c69a39185d3a872ac0 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrAd_1.id_break();
        rrAd_1.id_byte();
        rrAd_1.id_class();
        rrAd_1.id_case();
        rrAd_1.id_throws();
    }

    private static void id_case() {
        byteseafc2f5d275533c69a39185d3a872ac0 = new byte[]{4, 2, 3, 2, 2, 3, 3, 4, 5};
    }

    private static /* synthetic */ rrAd_1[] id_protected() {
        rrAd_1[] rrAd_1Array = new rrAd_1[byteseafc2f5d275533c69a39185d3a872ac0[0]];
        rrAd_1Array[rrAd_1.booleanseafc2f5d275533c69a39185d3a872ac0[0]] = (rrAd_1)((Object)staticFieldseafc2f5d275533c69a39185d3a872ac0[shortseafc2f5d275533c69a39185d3a872ac0[1]]);
        rrAd_1Array[rrAd_1.booleanseafc2f5d275533c69a39185d3a872ac0[1]] = (rrAd_1)((Object)staticFieldseafc2f5d275533c69a39185d3a872ac0[shortseafc2f5d275533c69a39185d3a872ac0[2]]);
        rrAd_1Array[rrAd_1.byteseafc2f5d275533c69a39185d3a872ac0[1]] = (rrAd_1)((Object)staticFieldseafc2f5d275533c69a39185d3a872ac0[shortseafc2f5d275533c69a39185d3a872ac0[3]]);
        rrAd_1Array[rrAd_1.byteseafc2f5d275533c69a39185d3a872ac0[2]] = (rrAd_1)((Object)staticFieldseafc2f5d275533c69a39185d3a872ac0[shortseafc2f5d275533c69a39185d3a872ac0[4]]);
        return rrAd_1Array;
    }
}

