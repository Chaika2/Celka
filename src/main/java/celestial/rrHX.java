/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrHX
extends Enum<rrHX> {
    private static byte[] bytesf71f99cac23234318e24f4e142924a57;
    private static String[] stringsf71f99cac23234318e24f4e142924a57;
    private static short[] shortsf71f99cac23234318e24f4e142924a57;
    public static Object[] staticFieldsf71f99cac23234318e24f4e142924a57;
    private static boolean[] booleansf71f99cac23234318e24f4e142924a57;

    private static void id_byte() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansf71f99cac23234318e24f4e142924a57 = blArray;
    }

    static {
        rrHX.ntfClinit();
    }

    public static rrHX[] values() {
        return (rrHX[])((rrHX[])staticFieldsf71f99cac23234318e24f4e142924a57[shortsf71f99cac23234318e24f4e142924a57[0]]).clone();
    }

    public static rrHX valueOf(String string) {
        return Enum.valueOf(rrHX.class, string);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-81, -61, 82, 22, 32, 105, 77, 25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        stringsf71f99cac23234318e24f4e142924a57 = new String[]{new String("BLOCK_PRIORITY"), new String("BLOCK_HARDNESS"), new String("DISTANCE")};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC55BCC17;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD0019D4945E72B95L;
    }

    private static void id_break() {
        bytesf71f99cac23234318e24f4e142924a57 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_throws() {
        Object[] objectArray;
        objectArray = new Object[]{new rrHX(), new rrHX(), new rrHX(), new rrHX[]{(rrHX)((Object)objectArray[0]), (rrHX)((Object)objectArray[1]), (rrHX)((Object)objectArray[2])}};
        staticFieldsf71f99cac23234318e24f4e142924a57 = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrHX.id_byte();
        rrHX.id_class();
        rrHX.id_case();
        rrHX.id_break();
        rrHX.id_throws();
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsf71f99cac23234318e24f4e142924a57 = sArray;
    }

    private static /* synthetic */ rrHX[] id_protected() {
        rrHX[] rrHXArray = new rrHX[bytesf71f99cac23234318e24f4e142924a57[0]];
        rrHXArray[rrHX.booleansf71f99cac23234318e24f4e142924a57[0]] = (rrHX)((Object)staticFieldsf71f99cac23234318e24f4e142924a57[shortsf71f99cac23234318e24f4e142924a57[1]]);
        rrHXArray[rrHX.booleansf71f99cac23234318e24f4e142924a57[1]] = (rrHX)((Object)staticFieldsf71f99cac23234318e24f4e142924a57[shortsf71f99cac23234318e24f4e142924a57[2]]);
        rrHXArray[rrHX.bytesf71f99cac23234318e24f4e142924a57[1]] = (rrHX)((Object)staticFieldsf71f99cac23234318e24f4e142924a57[shortsf71f99cac23234318e24f4e142924a57[3]]);
        return rrHXArray;
    }
}

