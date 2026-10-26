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

public class rrjb_3 {
    private static String[] id_break;
    private static byte[] id_byte;
    private static boolean[] id_protected;
    public static Object[] id_class;

    private static void id_byte() {
        id_break = new String[]{new String("\\[\u2720] \u0420\u0435\u0433\u0438\u043e\u043d \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u0441\u043e\u0437\u0434\u0430\u043d! #(\\d+)"), new String("\\[\\$] \u0412\u0430\u0448 \u0431\u0430\u043b\u0430\u043d\u0441:\\s+\\$([\\d,]+)"), new String("\\[\u2694] \u0411\u0430\u043b\u0430\u043d\u0441 \u043a\u043b\u0430\u043d\u0430:\\s+(.*)"), new String("\\[\\$] \u0412\u044b \u043f\u043e\u0434\u043e\u0431\u0440\u0430\u043b\u0438 \\$(\\d+)[.\\d]+ \u0441 \u043c\u043e\u0431\u0430(?:\\s?\\(\u0411\u0443\u0441\u0442 \\+(\\d+)[.\\d]+\\$\\))?"), new String("\\[\u2714] \u0423\u0441\u043f\u0435\u0448\u043d\u0430\u044f \u0430\u0432\u0442\u043e-\u043f\u0440\u043e\u0434\u0430\u0436\u0430 (.+) \\d+ \u0448\u0442. \u0437\u0430 ([\\d,]+)\\$"), new String("/ah\\s+(sell|dsell)\\s+(.*)"), new String("/ah\\s+(.*)"), new String("/duel\\s+(?:stats|statistics)\\s+(.*)"), new String("/clan\\s+(invest|withdraw)\\s+(.*)"), new String("/(epay|pay)\\s+(.*)\\s+(.*)"), new String("/clan\\s+create(?:\\s+(.*))?"), new String("/b\\s+(\\S+)(?:\\s+(.*))?"), new String("(\\d+ (\u0441\u0435\u043a|\u0441\u0435\u043a\u0443\u043d\u0434))"), new String("\u0412\u044b \u0431\u044b\u043b\u0438 \u043a\u0438\u043a\u043d\u0443\u0442\u044b \u043f\u0440\u0438 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0435\u043d\u0438\u0438 \u043a \u0441\u0435\u0440\u0432\u0435\u0440\u0443"), new String("[\u2694] \u041e\u0448\u0438\u0431\u043a\u0430, \u043a\u043b\u0430\u043d \u0441 \u0442\u0430\u043a\u0438\u043c \u043d\u0430\u0437\u0432\u0430\u043d\u0438\u0435\u043c \u0443\u0436\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0443\u0435\u0442!"), new String("[\u2694] \u0421\u0443\u043f\u0435\u0440! \u0412\u044b \u0443\u0441\u043f\u0435\u0448\u043d\u043e \u0441\u043e\u0437\u0434\u0430\u043b\u0438 \u043a\u043b\u0430\u043d:"), new String("[\u2694] \u041e\u0448\u0438\u0431\u043a\u0430: \u0422\u044b \u0443\u0436\u0435 \u0441\u043e\u0441\u0442\u043e\u0438\u0448\u044c \u0432 \u043a\u043b\u0430\u043d\u0435!")};
    }

    static {
        rrjb_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x22541DD5;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{id_break[13], id_break[14], id_break[15], id_break[16], Pattern.compile(id_break[0]), Pattern.compile(id_break[1]), Pattern.compile(id_break[2]), Pattern.compile(id_break[3]), Pattern.compile(id_break[4]), Pattern.compile(id_break[5]), Pattern.compile(id_break[6]), Pattern.compile(id_break[7]), Pattern.compile(id_break[8]), Pattern.compile(id_break[9]), Pattern.compile(id_break[10]), Pattern.compile(id_break[11]), Pattern.compile(id_break[12])};
        id_class = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{78, 84, -72, -116, -117, 15, 92, 59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8089A1F72B314562L;
    }

    private static void id_break() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_protected = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrjb_3.id_break();
        rrjb_3.id_byte();
        rrjb_3.id_protected();
        rrjb_3.id_class();
    }

    private static void id_protected() {
        id_byte = new byte[]{4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 2, 3};
    }
}

