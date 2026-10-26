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

public class BH {
    private static String[] id_break;
    private static boolean[] id_byte;
    public static Object[] id_class;
    private static byte[] id_protected;

    private static void id_byte() {
        Object[] objectArray = new Object[8];
        String[] stringArray = new String[]{id_break[0]};
        objectArray[0] = stringArray;
        String[] stringArray2 = new String[]{id_break[1]};
        objectArray[1] = stringArray2;
        String[] stringArray3 = new String[]{id_break[2]};
        objectArray[2] = stringArray3;
        String[] stringArray4 = new String[]{id_break[3]};
        objectArray[3] = stringArray4;
        Pattern[] patternArray = new Pattern[]{Pattern.compile(id_break[4], 0)};
        objectArray[4] = patternArray;
        Pattern[] patternArray2 = new Pattern[]{Pattern.compile(id_break[5])};
        objectArray[5] = patternArray2;
        Pattern[] patternArray3 = new Pattern[]{Pattern.compile(id_break[6])};
        objectArray[6] = patternArray3;
        Pattern[] patternArray4 = new Pattern[]{Pattern.compile(id_break[7])};
        objectArray[7] = patternArray4;
        id_class = objectArray;
    }

    static {
        BH.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x38231A6B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8EAAA5E8740A227CL;
    }

    private static void id_class() {
        id_protected = new byte[]{2, 3, 4, 5, 6, 7, 8};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{35, -51, -36, 126, -40, -18, -103, -115}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        boolean[] blArray = new boolean[18];
        blArray[0] = true;
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[10] = true;
        blArray[12] = true;
        blArray[14] = true;
        blArray[16] = true;
        id_byte = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        BH.id_break();
        BH.id_protected();
        BH.id_class();
        BH.id_byte();
    }

    private static void id_protected() {
        id_break = new String[]{new String("\u0430\u0438\u0440\u0434\u0440\u043e\u043f"), new String("\u0441\u043a\u0440\u0443\u0434\u0436"), new String("\u0442\u0430\u043b\u0438\u0441\u043c\u0430\u043d"), new String("\u0442\u0430\u0439\u043d\u044b\u0439 \u0442\u043e\u0440\u0433\u043e\u0432\u0435\u0446 \u00bb \u043f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u0442\u0430\u0439\u043d\u044b\u0439 \u0442\u043e\u0440\u0433\u043e\u0432\u0435\u0446:"), new String("x: (-?\\d+)(?: y: (-?\\d+))? z: (-?\\d+)"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b (-?\\d+)(?: (-?\\d+))? (-?\\d+)"), new String("\u0422\u0430\u043b\u0438\u0441\u043c\u0430\u043d: (-?\\d+)(?: (-?\\d+))? (-?\\d+)"), new String("\u0422\u0410\u0419\u041d\u042b\u0419 \u0422\u041e\u0420\u0413\u041e\u0412\u0415\u0426 \u00bb \u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u0442\u0430\u0439\u043d\u044b\u0439 \u0442\u043e\u0440\u0433\u043e\u0432\u0435\u0446: (-?\\d+)(?: (-?\\d+))? (-?\\d+)")};
    }
}

