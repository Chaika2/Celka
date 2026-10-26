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

public class Bl_1 {
    private static boolean[] id_break;
    public static Object[] id_class;
    private static byte[] id_byte;
    private static String[] id_protected;

    private static void id_byte() {
        boolean[] blArray = new boolean[42];
        blArray[1] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[8] = true;
        blArray[11] = true;
        blArray[13] = true;
        blArray[14] = true;
        blArray[16] = true;
        blArray[18] = true;
        blArray[20] = true;
        blArray[22] = true;
        blArray[25] = true;
        blArray[27] = true;
        blArray[29] = true;
        blArray[31] = true;
        blArray[33] = true;
        blArray[35] = true;
        blArray[37] = true;
        blArray[39] = true;
        blArray[41] = true;
        id_break = blArray;
    }

    static {
        Bl_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD6BE60A9D17041DCL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDDD1C76B;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{55, -62, -46, 11, 54, -46, 47, -47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_byte = new byte[]{2, 3, 4, 5, 6, 7, 2, 8, 2, 9, 10, 11, 12, 13, 14, 2, 15, 2, 16, 2, 17, 2, 18, 2, 19, 2, 20, 2, 21, 2, 22, 2, 23, 24};
    }

    private static void id_break() {
        Object[] objectArray = new Object[24];
        objectArray[0] = Pattern.compile(id_protected[0], 0);
        objectArray[1] = Pattern.compile(id_protected[1]);
        objectArray[2] = Pattern.compile(id_protected[2]);
        objectArray[3] = Pattern.compile(id_protected[3]);
        String[] stringArray = new String[]{id_protected[4]};
        objectArray[4] = stringArray;
        String[] stringArray2 = new String[]{id_protected[5]};
        objectArray[5] = stringArray2;
        String[] stringArray3 = new String[]{id_protected[6]};
        objectArray[6] = stringArray3;
        String[] stringArray4 = new String[]{id_protected[7]};
        objectArray[7] = stringArray4;
        String[] stringArray5 = new String[]{id_protected[8], id_protected[9]};
        objectArray[8] = stringArray5;
        String[] stringArray6 = new String[]{id_protected[10], id_protected[11]};
        objectArray[9] = stringArray6;
        String[] stringArray7 = new String[]{id_protected[12]};
        objectArray[10] = stringArray7;
        String[] stringArray8 = new String[]{id_protected[13]};
        objectArray[11] = stringArray8;
        String[] stringArray9 = new String[]{id_protected[14]};
        objectArray[12] = stringArray9;
        String[] stringArray10 = new String[]{id_protected[15]};
        objectArray[13] = stringArray10;
        String[] stringArray11 = new String[]{id_protected[16]};
        objectArray[14] = stringArray11;
        Pattern[] patternArray = new Pattern[]{Pattern.compile(id_protected[17]), Pattern.compile(id_protected[18])};
        objectArray[15] = patternArray;
        Pattern[] patternArray2 = new Pattern[]{Pattern.compile(id_protected[19]), Pattern.compile(id_protected[20])};
        objectArray[16] = patternArray2;
        Pattern[] patternArray3 = new Pattern[]{Pattern.compile(id_protected[21]), Pattern.compile(id_protected[22])};
        objectArray[17] = patternArray3;
        Pattern[] patternArray4 = new Pattern[]{Pattern.compile(id_protected[23]), Pattern.compile(id_protected[24])};
        objectArray[18] = patternArray4;
        Pattern[] patternArray5 = new Pattern[]{Pattern.compile(id_protected[25]), Pattern.compile(id_protected[26])};
        objectArray[19] = patternArray5;
        Pattern[] patternArray6 = new Pattern[]{Pattern.compile(id_protected[27]), Pattern.compile(id_protected[28])};
        objectArray[20] = patternArray6;
        Pattern[] patternArray7 = new Pattern[]{Pattern.compile(id_protected[29]), Pattern.compile(id_protected[30])};
        objectArray[21] = patternArray7;
        Pattern[] patternArray8 = new Pattern[]{Pattern.compile(id_protected[31]), Pattern.compile(id_protected[32])};
        objectArray[22] = patternArray8;
        Pattern[] patternArray9 = new Pattern[]{Pattern.compile(id_protected[33]), Pattern.compile(id_protected[34])};
        objectArray[23] = patternArray9;
        id_class = objectArray;
    }

    private static /* synthetic */ void ntfClinit() {
        Bl_1.id_byte();
        Bl_1.id_protected();
        Bl_1.id_class();
        Bl_1.id_break();
    }

    private static void id_protected() {
        id_protected = new String[]{new String("\\[(\\d+)] (\u041c\u0438\u0441\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0441\u0443\u043d\u0434\u0443\u043a|\u041c\u0435\u0442\u0435\u043e\u0440\u0438\u0442\u043d\u044b\u0439 \u0434\u043e\u0436\u0434\u044c|\u041c\u0430\u044f\u043a \u0443\u0431\u0438\u0439\u0446\u0430|\u0421\u0443\u043d\u0434\u0443\u043a \u0441\u043c\u0435\u0440\u0442\u0438|\u0412\u0443\u043b\u043a\u0430\u043d|\u0410\u043b\u0442\u0430\u0440\u044c|\u0421\u043d\u0435\u0436\u043d\u0430\u044f \u0431\u043e\u0439\u043d\u044f|\u0417\u0430\u0433\u0430\u0434\u043e\u0447\u043d\u044b\u0439 \u043c\u0430\u044f\u043a|\u0414\u0435\u0434 \u043c\u043e\u0440\u043e\u0437|\u0413\u043e\u0440\u044f\u0449\u0438\u0439 \u0447\u0435\u0440\u0435\u043f|\u0413\u0435\u0439\u0437\u0435\u0440):"), new String("\\|\\| (\u0421\u0442\u0430\u0442\u0443\u0441|\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b|\u0423\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430): (.+)"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041f\u0440\u0438\u0437\u0432\u0430\u043d \u0438\u0433\u0440\u043e\u043a\u043e\u043c: (\\w+)"), new String("\u043c\u0435\u0442\u0435\u043e\u0440\u0438\u0442\u043d\u044b\u0439 \u0434\u043e\u0436\u0434\u044c"), new String("\u043c\u0438\u0441\u0442\u0438\u0447\u0435\u0441\u043a\u0438\u0439 \u0441\u0443\u043d\u0434\u0443\u043a"), new String("\u0437\u0430\u0433\u0430\u0434\u043e\u0447\u043d\u044b\u0439 \u043c\u0430\u044f\u043a"), new String("\u043c\u0430\u044f\u043a \u0443\u0431\u0438\u0439\u0446\u0430"), new String("\u0441\u0443\u043d\u0434\u0443\u043a \u0441\u043c\u0435\u0440\u0442\u0438"), new String("\u0443\u0440\u043e\u0432\u0435\u043d\u044c \u043b\u0443\u0442\u0430"), new String("\u0441\u043d\u0435\u0436\u043d\u0430\u044f \u0431\u043e\u0439\u043d\u044f"), new String("\u043f\u043e\u0440\u0442\u0430\u043b \u0430\u043a\u0442\u0438\u0432\u0438\u0440\u0443\u0435\u0442\u0441\u044f \u0447\u0435\u0440\u0435\u0437 3 \u043c\u0438\u043d\u0443\u0442\u044b!"), new String("\u0432\u0443\u043b\u043a\u0430\u043d"), new String("\u0430\u043b\u0442\u0430\u0440\u044c"), new String("\u0434\u0435\u0434 \u043c\u043e\u0440\u043e\u0437"), new String("\u0433\u043e\u0440\u044f\u0449\u0438\u0439 \u0447\u0435\u0440\u0435\u043f"), new String("\u0433\u0435\u0439\u0437\u0435\u0440"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041f\u043e\u044f\u0432\u0438\u043b\u0441\u044f \u043d\u0430 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u0445 ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*"), new String("\u041a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b:? ?[^\\d-]*(-?\\d+)(?: (-?\\d+))? (-?\\d+)[^\\d-]*")};
    }
}

