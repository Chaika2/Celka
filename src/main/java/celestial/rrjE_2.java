/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjE_2 {
    private static boolean[] id_break;
    private static byte[] id_byte;
    private static String[] id_protected;
    public static Object[] id_class;

    private static void id_byte() {
        id_byte = new byte[]{9, 10, 11, 12, 13, 2, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8};
    }

    static {
        rrjE_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE017835848F7630DL;
    }

    private static void id_class() {
        id_protected = new String[]{new String("(?:\u0410\u0443\u043a\u0446\u0438\u043e\u043d|\u0410\u0443\u043a\u0446\u0438\u043e\u043d\u044b)\\s+\\[(\\d+)/(\\d+)]"), new String("(?:\u041f\u043e\u0438\u0441\u043a|\u041f):\\s*(.+?)\\s+\\[(\\d+)/(\\d+)]"), new String("(?:\u0410\u0443\u043a\u0446\u0438\u043e\u043d|\u0410\u0443\u043a\u0446\u0438\u043e\u043d\u044b):\\s*(\\S+)\\s+\\[(\\d+)/(\\d+)]"), new String("\\[\u2318] \u0421\u043b\u0438\u0448\u043a\u043e\u043c \u043c\u043d\u043e\u0433\u043e \u043b\u044e\u0434\u0435\u0439 \u043f\u0438\u0448\u0443\u0442 \u044d\u0442\u0443 \u043a\u043e\u043c\u0430\u043d\u0434\u0443! \u041f\u043e\u043f\u0440\u043e\u0431\u0443\u0439\u0442\u0435 \u0447\u0435\u0440\u0435\u0437 (\\d+) \u0441\u0435\u043a\\."), new String("\u0445\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435"), new String("\u043f\u043e\u0434\u043e\u0437\u0440\u0438\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0446\u0435\u043d\u0430"), new String("\u043f\u043e\u0434\u0442\u0432\u0435\u0440\u0436\u0434\u0435\u043d\u0438\u0435 \u043f\u043e\u043a\u0443\u043f\u043a\u0438"), new String("\u0432\u044b\u0431\u043e\u0440 \u043a\u0430\u0442\u0435\u0433\u043e\u0440\u0438\u0438"), new String("[\u27f2] \u041e\u0431\u043d\u043e\u0432\u0438\u0442\u044c"), new String("[\u041ay\u043f\u0438\u0442\u044c]"), new String("\u0412\u044b \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u043a\u0443\u043f\u0438\u043b\u0438"), new String("\u0423 \u0412\u0430\u0441 \u043d\u0435 \u0445\u0432\u0430\u0442\u0430\u0435\u0442 \u041c\u043e\u043d\u0435\u0442!"), new String("\u042d\u0442\u043e\u0442 \u0442\u043e\u0432\u0430\u0440 \u0443\u0436\u0435 \u041a\u0443\u043f\u0438\u043b\u0438"), new String("[\u2603] \u041f\u043e\u0441\u043b\u0435 \u0432\u0445\u043e\u0434\u0430 \u043d\u0430 \u0440\u0435\u0436\u0438\u043c \u043d\u0435\u043e\u0431\u0445\u043e\u0434\u0438\u043c\u043e \u043d\u0435\u043c\u043d\u043e\u0433\u043e \u043f\u043e\u0434\u043e\u0436\u0434\u0430\u0442\u044c \u043f\u0435\u0440\u0435\u0434 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435\u043c \u0430\u0443\u043a\u0446\u0438\u043e\u043d\u0430"), new String("[\u274c] \u0414\u0430\u043d\u043d\u044b\u0439 \u043f\u0440\u0435\u0434\u043c\u0435\u0442 \u043d\u0435\u0431\u0435\u0437\u043e\u043f\u0430\u0441\u043d\u043e \u0432\u044b\u0441\u0442\u0430\u0432\u043b\u044f\u0442\u044c \u043d\u0430 \u0430\u0443\u043a\u0446\u0438\u043e\u043d \u043d\u0430\u0445\u043e\u0434\u044f\u0441\u044c \u043d\u0430 \u0441\u043f\u0430\u0432\u043d\u0435!"), new String("[\u2603] \u041e\u0441\u0432\u043e\u0431\u043e\u0434\u0438\u0442\u0435 \u0445\u0440\u0430\u043d\u0438\u043b\u0438\u0449\u0435 \u0438\u043b\u0438 \u0443\u0431\u0435\u0440\u0438\u0442\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b \u0441 \u043f\u0440\u043e\u0434\u0430\u0436\u0438"), new String("\\s+\\[(\\d+)/(\\d+)]")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{24, 15, 68, -116, 63, -97, -35, -22}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB135534C;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjE_2.id_break();
        rrjE_2.id_class();
        rrjE_2.id_byte();
        rrjE_2.id_protected();
    }

    private static void id_protected() {
        Object[] objectArray = new Object[16];
        objectArray[0] = id_protected[8];
        objectArray[1] = id_protected[9];
        objectArray[2] = id_protected[10];
        objectArray[3] = id_protected[11];
        objectArray[4] = id_protected[12];
        objectArray[5] = id_protected[13];
        objectArray[6] = id_protected[14];
        objectArray[7] = id_protected[15];
        objectArray[8] = id_protected[16];
        objectArray[9] = Pattern.compile(id_protected[0], 0);
        objectArray[10] = Pattern.compile(id_protected[1]);
        objectArray[11] = Pattern.compile(id_protected[2]);
        objectArray[12] = Pattern.compile(id_protected[3]);
        String[] stringArray = new String[]{id_protected[4]};
        objectArray[13] = stringArray;
        String[] stringArray2 = new String[]{id_protected[5], id_protected[6]};
        objectArray[14] = stringArray2;
        String[] stringArray3 = new String[]{id_protected[7]};
        objectArray[15] = stringArray3;
        id_class = objectArray;
    }
}

