/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrpd_3
extends Enum<rrpd_3> {
    private static String[] stringsf0e458d392b335c78064d20a36d4b573;
    private static boolean[] booleansf0e458d392b335c78064d20a36d4b573;
    private static byte[] bytesf0e458d392b335c78064d20a36d4b573;
    private static short[] shortsf0e458d392b335c78064d20a36d4b573;
    public static Object[] staticFieldsf0e458d392b335c78064d20a36d4b573;

    private static /* synthetic */ rrpd_3[] id_byte() {
        rrpd_3[] rrpd_3Array = new rrpd_3[bytesf0e458d392b335c78064d20a36d4b573[0]];
        rrpd_3Array[rrpd_3.booleansf0e458d392b335c78064d20a36d4b573[0]] = (rrpd_3)((Object)staticFieldsf0e458d392b335c78064d20a36d4b573[shortsf0e458d392b335c78064d20a36d4b573[1]]);
        rrpd_3Array[rrpd_3.booleansf0e458d392b335c78064d20a36d4b573[1]] = (rrpd_3)((Object)staticFieldsf0e458d392b335c78064d20a36d4b573[shortsf0e458d392b335c78064d20a36d4b573[2]]);
        rrpd_3Array[rrpd_3.bytesf0e458d392b335c78064d20a36d4b573[1]] = (rrpd_3)((Object)staticFieldsf0e458d392b335c78064d20a36d4b573[shortsf0e458d392b335c78064d20a36d4b573[3]]);
        return rrpd_3Array;
    }

    static {
        rrpd_3.ntfClinit();
    }

    public static rrpd_3[] values() {
        return (rrpd_3[])((rrpd_3[])staticFieldsf0e458d392b335c78064d20a36d4b573[shortsf0e458d392b335c78064d20a36d4b573[0]]).clone();
    }

    public static rrpd_3 valueOf(String string) {
        return Enum.valueOf(rrpd_3.class, string);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE537ECBF;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB6F006FECFDCFE40L;
    }

    private static void id_class() {
        Object[] objectArray;
        objectArray = new Object[]{new rrpd_3(), new rrpd_3(), new rrpd_3(), new rrpd_3[]{(rrpd_3)((Object)objectArray[0]), (rrpd_3)((Object)objectArray[1]), (rrpd_3)((Object)objectArray[2])}};
        staticFieldsf0e458d392b335c78064d20a36d4b573 = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-32, 113, -67, 97, -64, -8, -50, 100}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        bytesf0e458d392b335c78064d20a36d4b573 = new byte[]{3, 2, 2, 2, 3, 4};
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[6];
        blArray[1] = true;
        blArray[4] = true;
        blArray[5] = true;
        booleansf0e458d392b335c78064d20a36d4b573 = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrpd_3.id_throws();
        rrpd_3.id_protected();
        rrpd_3.id_case();
        rrpd_3.id_break();
        rrpd_3.id_class();
    }

    private static void id_case() {
        short[] sArray = new short[4];
        sArray[0] = 3;
        sArray[2] = 1;
        sArray[3] = 2;
        shortsf0e458d392b335c78064d20a36d4b573 = sArray;
    }

    private static void id_protected() {
        stringsf0e458d392b335c78064d20a36d4b573 = new String[]{new String("SUCCESS"), new String("ITEM_NOT_FOUND"), new String("ITEM_HAS_COOLDOWN")};
    }
}

