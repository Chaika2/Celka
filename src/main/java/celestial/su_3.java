/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.k_1;
import celestial.sN_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class su_3
extends C_try {
    private static short[] id_throws;
    private static boolean[] id_case;
    private static byte[] id_catch;
    private static String[] id_private;
    public Object[] id_break;

    public su_3(sN_2 sN_22, C_case c_case, String[] stringArray, boolean ... blArray) {
        super(c_case, stringArray);
        this.id_protected();
        boolean[] blArray2 = blArray;
        this.id_break[su_3.id_throws[0]] = blArray2;
    }

    static {
        su_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xA5ECA0C646654B7L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9632E6CA;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        this.id_protected();
        c_static.id_class(id_case[0]);
        if (((boolean[])this.id_break[id_throws[1]])[id_case[1]]) {
            throw new k_1(id_private[0]);
        }
        ((boolean[])this.id_break[su_3.id_throws[2]])[su_3.id_case[2]] = id_case[3];
        this.id_case(id_private[1]);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-106, 25, 48, -51, -128, -25, -16, 2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_catch = new byte[]{6, 2, 3, 4, 5};
    }

    private static /* synthetic */ void ntfClinit() {
        su_3.id_finally();
        su_3.id_native();
        su_3.id_extends();
        su_3.id_throws();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[8];
        blArray[3] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_case = blArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_catch[0]];
        stringArray[su_3.id_case[4]] = id_private[3];
        stringArray[su_3.id_case[5]] = id_private[4];
        stringArray[su_3.id_catch[1]] = id_private[5];
        stringArray[su_3.id_catch[2]] = id_private[6];
        stringArray[su_3.id_catch[3]] = id_private[7];
        stringArray[su_3.id_catch[4]] = id_private[8];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_throws = new short[3];
    }

    @Override
    public boolean id_case() {
        return id_case[6];
    }

    @Override
    public String id_implements() {
        return id_private[2];
    }

    private void id_protected() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_case[7]];
        }
    }

    private static void id_native() {
        id_private = new String[]{new String("\u0423\u0436\u0435 \u043d\u0430 \u043f\u0430\u0443\u0437\u0435"), new String("\u041f\u0440\u0438\u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d\u043e"), new String("\u041f\u0440\u0438\u043e\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u0442 \u0431\u0430\u0440\u0438\u0442\u043e\u043d \u0434\u043e \u0442\u0435\u0445 \u043f\u043e\u0440, \u043f\u043e\u043a\u0430 \u0432\u044b \u043d\u0435 \u0432\u043e\u0441\u043f\u043e\u043b\u044c\u0437\u0443\u0435\u0442\u0435\u0441\u044c \u0444\u0443\u043d\u043a\u0446\u0438\u0435\u0439 \u0432\u043e\u0437\u043e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u044f"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"pause\" \u0443\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u0442 \u0431\u0430\u0440\u0438\u0442\u043e\u043d \u043d\u0430 \u043f\u0430\u0443\u0437\u0443."), new String(""), new String("\u042d\u0442\u043e \u043c\u043e\u0436\u043d\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u0434\u043b\u044f \u043f\u0440\u0438\u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043a\u0438 \u043f\u0440\u043e\u043a\u043b\u0430\u0434\u043a\u0438 \u043f\u0443\u0442\u0438, \u0441\u0442\u0440\u043e\u0438\u0442\u0435\u043b\u044c\u0441\u0442\u0432\u0430, \u0441\u043b\u0435\u0434\u043e\u0432\u0430\u043d\u0438\u044f, \u0447\u0435\u0433\u043e \u0443\u0433\u043e\u0434\u043d\u043e. \u041e\u0434\u043d\u043e\u043a\u0440\u0430\u0442\u043d\u043e\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435 \u043a\u043e\u043c\u0430\u043d\u0434\u044b resume \u0437\u0430\u043f\u0443\u0441\u0442\u0438\u0442 \u0435\u0433\u043e \u0441\u043d\u043e\u0432\u0430!"), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> pause")};
    }
}

