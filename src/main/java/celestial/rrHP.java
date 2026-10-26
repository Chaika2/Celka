/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHP
extends Enum<rrHP> {
    public static Object[] staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889;
    private static short[] shortsd1f2ea7d9a9f3838978754e1a2c8b889;
    private static String[] stringsd1f2ea7d9a9f3838978754e1a2c8b889;
    private static byte[] bytesd1f2ea7d9a9f3838978754e1a2c8b889;
    private static boolean[] booleansd1f2ea7d9a9f3838978754e1a2c8b889;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsd1f2ea7d9a9f3838978754e1a2c8b889 = sArray;
    }

    static {
        rrHP.ntfClinit();
    }

    public static rrHP[] values() {
        return (rrHP[])((rrHP[])staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[shortsd1f2ea7d9a9f3838978754e1a2c8b889[0]]).clone();
    }

    public static rrHP valueOf(String string) {
        return Enum.valueOf(rrHP.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-62, -79, -5, 57, -49, -119, 75, 77}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDBDBE36E;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC4B55B8549865884L;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrHP(), new rrHP(), new rrHP(), new rrHP[]{(rrHP)((Object)objectArray[0]), (rrHP)((Object)objectArray[1]), (rrHP)((Object)objectArray[2])}};
        staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889 = objectArray;
    }

    private static void id_break() {
        stringsd1f2ea7d9a9f3838978754e1a2c8b889 = new String[]{new String("NOT_INVENTORY"), new String("STANDING"), new String("OK")};
    }

    private static void id_throws() {
        bytesd1f2ea7d9a9f3838978754e1a2c8b889 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static /* synthetic */ void ntfClinit() {
        rrHP.id_protected();
        rrHP.id_break();
        rrHP.id_byte();
        rrHP.id_throws();
        rrHP.id_class();
    }

    private static /* synthetic */ rrHP[] id_case() {
        rrHP[] rrHPArray = new rrHP[bytesd1f2ea7d9a9f3838978754e1a2c8b889[0]];
        rrHPArray[rrHP.booleansd1f2ea7d9a9f3838978754e1a2c8b889[0]] = (rrHP)((Object)staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[shortsd1f2ea7d9a9f3838978754e1a2c8b889[1]]);
        rrHPArray[rrHP.booleansd1f2ea7d9a9f3838978754e1a2c8b889[1]] = (rrHP)((Object)staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[shortsd1f2ea7d9a9f3838978754e1a2c8b889[2]]);
        rrHPArray[rrHP.bytesd1f2ea7d9a9f3838978754e1a2c8b889[1]] = (rrHP)((Object)staticFieldsd1f2ea7d9a9f3838978754e1a2c8b889[shortsd1f2ea7d9a9f3838978754e1a2c8b889[3]]);
        return rrHPArray;
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansd1f2ea7d9a9f3838978754e1a2c8b889 = blArray;
    }
}

