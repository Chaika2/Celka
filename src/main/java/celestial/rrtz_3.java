/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrtz_3
extends Enum<rrtz_3> {
    private static String[] stringsb85642e435023a9b997fb27aa0167b70;
    private static byte[] bytesb85642e435023a9b997fb27aa0167b70;
    private static short[] shortsb85642e435023a9b997fb27aa0167b70;
    public static Object[] staticFieldsb85642e435023a9b997fb27aa0167b70;
    private static boolean[] booleansb85642e435023a9b997fb27aa0167b70;

    private static void id_byte() {
        stringsb85642e435023a9b997fb27aa0167b70 = new String[]{new String("ENABLED"), new String("DISABLED"), new String("BIND_CHANGED")};
    }

    static {
        rrtz_3.ntfClinit();
    }

    public static rrtz_3[] values() {
        return (rrtz_3[])((rrtz_3[])staticFieldsb85642e435023a9b997fb27aa0167b70[shortsb85642e435023a9b997fb27aa0167b70[0]]).clone();
    }

    public static rrtz_3 valueOf(String string) {
        return Enum.valueOf(rrtz_3.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-97, -121, 84, -60, -44, 71, 18, -61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsb85642e435023a9b997fb27aa0167b70 = sArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE4FCE928931012ABL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x469B9D3;
    }

    private static /* synthetic */ rrtz_3[] id_break() {
        rrtz_3[] rrtz_3Array = new rrtz_3[bytesb85642e435023a9b997fb27aa0167b70[0]];
        rrtz_3Array[rrtz_3.booleansb85642e435023a9b997fb27aa0167b70[0]] = (rrtz_3)((Object)staticFieldsb85642e435023a9b997fb27aa0167b70[shortsb85642e435023a9b997fb27aa0167b70[1]]);
        rrtz_3Array[rrtz_3.booleansb85642e435023a9b997fb27aa0167b70[1]] = (rrtz_3)((Object)staticFieldsb85642e435023a9b997fb27aa0167b70[shortsb85642e435023a9b997fb27aa0167b70[2]]);
        rrtz_3Array[rrtz_3.bytesb85642e435023a9b997fb27aa0167b70[1]] = (rrtz_3)((Object)staticFieldsb85642e435023a9b997fb27aa0167b70[shortsb85642e435023a9b997fb27aa0167b70[3]]);
        return rrtz_3Array;
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansb85642e435023a9b997fb27aa0167b70 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrtz_3.id_throws();
        rrtz_3.id_byte();
        rrtz_3.id_class();
        rrtz_3.id_case();
        rrtz_3.id_protected();
    }

    private static void id_case() {
        bytesb85642e435023a9b997fb27aa0167b70 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_protected() {
        Object[] objectArray;
        objectArray = new Object[]{new rrtz_3(), new rrtz_3(), new rrtz_3(), new rrtz_3[]{(rrtz_3)((Object)objectArray[0]), (rrtz_3)((Object)objectArray[1]), (rrtz_3)((Object)objectArray[2])}};
        staticFieldsb85642e435023a9b997fb27aa0167b70 = objectArray;
    }
}

