/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrca_3
extends Enum<rrca_3> {
    private static byte[] bytesb97ca5f62a0f31cea6ad2f4a102e3de3;
    private static boolean[] booleansb97ca5f62a0f31cea6ad2f4a102e3de3;
    public static Object[] staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3;
    private static String[] stringsb97ca5f62a0f31cea6ad2f4a102e3de3;
    private static short[] shortsb97ca5f62a0f31cea6ad2f4a102e3de3;

    private static /* synthetic */ rrca_3[] id_byte() {
        rrca_3[] rrca_3Array = new rrca_3[bytesb97ca5f62a0f31cea6ad2f4a102e3de3[2]];
        rrca_3Array[rrca_3.booleansb97ca5f62a0f31cea6ad2f4a102e3de3[2]] = (rrca_3)((Object)staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[4]]);
        rrca_3Array[rrca_3.booleansb97ca5f62a0f31cea6ad2f4a102e3de3[3]] = (rrca_3)((Object)staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[5]]);
        rrca_3Array[rrca_3.bytesb97ca5f62a0f31cea6ad2f4a102e3de3[3]] = (rrca_3)((Object)staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[6]]);
        return rrca_3Array;
    }

    static {
        rrca_3.ntfClinit();
    }

    public static rrca_3[] values() {
        return (rrca_3[])((rrca_3[])staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[0]]).clone();
    }

    public static rrca_3 valueOf(String string) {
        return Enum.valueOf(rrca_3.class, string);
    }

    private static void id_class() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        booleansb97ca5f62a0f31cea6ad2f4a102e3de3 = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, 14, -98, -45, 77, 50, -117, -120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x85FDA077EB305CAL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE2826CBD;
    }

    private static void id_break() {
        bytesb97ca5f62a0f31cea6ad2f4a102e3de3 = new byte[]{3, 2, 3, 2, 2, 2, 3, 4};
    }

    private static rrca_3[] id_throws() {
        rrca_3[] rrca_3Array = new rrca_3[bytesb97ca5f62a0f31cea6ad2f4a102e3de3[0]];
        rrca_3Array[rrca_3.booleansb97ca5f62a0f31cea6ad2f4a102e3de3[0]] = (rrca_3)((Object)staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[1]]);
        rrca_3Array[rrca_3.booleansb97ca5f62a0f31cea6ad2f4a102e3de3[1]] = (rrca_3)((Object)staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[2]]);
        rrca_3Array[rrca_3.bytesb97ca5f62a0f31cea6ad2f4a102e3de3[1]] = (rrca_3)((Object)staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3[shortsb97ca5f62a0f31cea6ad2f4a102e3de3[3]]);
        return rrca_3Array;
    }

    private static /* synthetic */ void ntfClinit() {
        rrca_3.id_class();
        rrca_3.id_catch();
        rrca_3.id_protected();
        rrca_3.id_break();
        rrca_3.id_case();
    }

    private static void id_catch() {
        stringsb97ca5f62a0f31cea6ad2f4a102e3de3 = new String[]{new String("VANILLA"), new String("BASIC_SIMULATION"), new String("BASIC_SIMULATION_3D")};
    }

    private static void id_case() {
        Object[] objectArray = new Object[4];
        staticFieldsb97ca5f62a0f31cea6ad2f4a102e3de3 = objectArray;
        objectArray[0] = new rrca_3();
        objectArray[1] = new rrca_3();
        objectArray[2] = new rrca_3();
        objectArray[3] = rrca_3.id_byte();
    }

    private static void id_protected() {
        short[] sArray = new short[7];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        sArray[5] = 1;
        sArray[6] = 2;
        shortsb97ca5f62a0f31cea6ad2f4a102e3de3 = sArray;
    }
}

