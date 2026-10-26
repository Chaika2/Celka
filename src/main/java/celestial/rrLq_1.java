/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrLq_1
extends Enum<rrLq_1> {
    public static Object[] staticFields2d4389a28d3a3bcfbac26ede38e74314;
    private static String[] strings2d4389a28d3a3bcfbac26ede38e74314;
    private static short[] shorts2d4389a28d3a3bcfbac26ede38e74314;
    private static boolean[] booleans2d4389a28d3a3bcfbac26ede38e74314;
    private static byte[] bytes2d4389a28d3a3bcfbac26ede38e74314;

    private static void id_byte() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shorts2d4389a28d3a3bcfbac26ede38e74314 = sArray;
    }

    static {
        rrLq_1.ntfClinit();
    }

    public static rrLq_1[] values() {
        return (rrLq_1[])((rrLq_1[])staticFields2d4389a28d3a3bcfbac26ede38e74314[shorts2d4389a28d3a3bcfbac26ede38e74314[0]]).clone();
    }

    public static rrLq_1 valueOf(String string) {
        return Enum.valueOf(rrLq_1.class, string);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleans2d4389a28d3a3bcfbac26ede38e74314 = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{68, 110, 112, 74, 46, -79, -7, 92}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x790E7BAD;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAF2A68BB956ADD2DL;
    }

    private static void id_break() {
        bytes2d4389a28d3a3bcfbac26ede38e74314 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_throws() {
        strings2d4389a28d3a3bcfbac26ede38e74314 = new String[]{new String("CLICK_BLOCK"), new String("DAMAGE"), new String("BROKEN")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrLq_1.id_class();
        rrLq_1.id_throws();
        rrLq_1.id_byte();
        rrLq_1.id_break();
        rrLq_1.id_case();
    }

    private static void id_case() {
        Object[] objectArray;
        objectArray = new Object[]{new rrLq_1(), new rrLq_1(), new rrLq_1(), new rrLq_1[]{(rrLq_1)((Object)objectArray[0]), (rrLq_1)((Object)objectArray[1]), (rrLq_1)((Object)objectArray[2])}};
        staticFields2d4389a28d3a3bcfbac26ede38e74314 = objectArray;
    }

    private static /* synthetic */ rrLq_1[] id_protected() {
        rrLq_1[] rrLq_1Array = new rrLq_1[bytes2d4389a28d3a3bcfbac26ede38e74314[0]];
        rrLq_1Array[rrLq_1.booleans2d4389a28d3a3bcfbac26ede38e74314[0]] = (rrLq_1)((Object)staticFields2d4389a28d3a3bcfbac26ede38e74314[shorts2d4389a28d3a3bcfbac26ede38e74314[1]]);
        rrLq_1Array[rrLq_1.booleans2d4389a28d3a3bcfbac26ede38e74314[1]] = (rrLq_1)((Object)staticFields2d4389a28d3a3bcfbac26ede38e74314[shorts2d4389a28d3a3bcfbac26ede38e74314[2]]);
        rrLq_1Array[rrLq_1.bytes2d4389a28d3a3bcfbac26ede38e74314[1]] = (rrLq_1)((Object)staticFields2d4389a28d3a3bcfbac26ede38e74314[shorts2d4389a28d3a3bcfbac26ede38e74314[3]]);
        return rrLq_1Array;
    }
}

