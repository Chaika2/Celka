/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjh_3 {
    private static String[] id_break;
    private static byte[] id_byte;
    public static Object[] id_class;
    private static boolean[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    static {
        rrjh_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC9CC8F5D405E02E3L;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{id_break[0], id_break[1], id_break[2], id_break[3], id_break[4], id_break[5], id_break[6], id_break[7], id_break[8], id_break[9], id_break[10], id_break[11], id_break[12], id_break[13], id_break[14], id_break[15]};
        id_class = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{70, -94, -50, -102, -94, 40, 47, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x70D9C748;
    }

    private static void id_break() {
        id_byte = new byte[]{16, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjh_3.id_byte();
        rrjh_3.id_protected();
        rrjh_3.id_break();
        rrjh_3.id_class();
    }

    private static void id_protected() {
        id_break = new String[]{new String("[\u2605] \u0414\u0435\u0437\u043e\u0440\u0438\u0435\u043d\u0442\u0430\u0446\u0438\u044f"), new String("[\u2605] \u041e\u0433\u043d\u0435\u043d\u043d\u044b\u0439 \u0441\u043c\u0435\u0440\u0447"), new String("[\u2605] \u042f\u0432\u043d\u0430\u044f \u043f\u044b\u043b\u044c"), new String("[\u2605] \u0421\u043d\u0435\u0436\u043e\u043a \u0437\u0430\u043c\u043e\u0440\u043e\u0437\u043a\u0430"), new String("[\u2605] \u041f\u043b\u0430\u0441\u0442"), new String("[\u2605] \u041d\u043e\u0432\u043e\u0433\u043e\u0434\u043d\u0438\u0439 \u043f\u043b\u0430\u0441\u0442"), new String("[\u2605] \u0422\u0440\u0430\u043f\u043a\u0430"), new String("[\u2605] \u041d\u043e\u0432\u043e\u0433\u043e\u0434\u043d\u044f\u044f \u043b\u043e\u0432\u0443\u0448\u043a\u0430"), new String("[\u2605] \u0411\u043e\u0436\u044c\u044f \u0430\u0443\u0440\u0430"), new String("[\u2605] \u0417\u0435\u043b\u044c\u0435 \u0420\u0430\u0434\u0438\u0430\u0446\u0438\u0438"), new String("[\u2605] \u0417\u0435\u043b\u044c\u0435 \u0413\u043d\u0435\u0432\u0430"), new String("[\u2605] \u0425\u043b\u043e\u043f\u0443\u0448\u043a\u0430"), new String("[\u2605] \u0417\u0435\u043b\u044c\u0435 \u041f\u0430\u043b\u043b\u0430\u0434\u0438\u043d\u0430"), new String("[\u2605] \u0417\u0435\u043b\u044c\u0435 \u0410\u0441\u0441\u0430\u0441\u0438\u043d\u0430"), new String("[\u2605] \u0421\u043d\u043e\u0442\u0432\u043e\u0440\u043d\u043e\u0435"), new String("[\u2605] \u0421\u0432\u044f\u0442\u0430\u044f \u0432\u043e\u0434\u0430")};
    }
}

