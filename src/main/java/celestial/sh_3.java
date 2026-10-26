/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sh_3
extends C_try {
    private static byte[] id_break;
    private static String[] id_throws;
    private static short[] id_case;
    private static boolean[] id_catch;

    public sh_3(C_case c_case) {
        String[] stringArray = new String[id_catch[0]];
        stringArray[sh_3.id_catch[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        sh_3.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_catch[2]);
        ((C_case)this.id_class[id_case[0]]).id_float();
        this.id_case(id_throws[1]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBA46705D;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1098305651E174BCL;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-91, 37, -20, -29, -70, -108, 104, -61}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_throws = new String[]{new String("click"), new String("\u0412\u044b\u043f\u043e\u043b\u043d\u044f\u044e!"), new String("\u041e\u0442\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u043c\u0435\u043d\u044e \u0441 \u043a\u043b\u0438\u043a\u043e\u043c"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"click\" \u043e\u0442\u043a\u0440\u044b\u0432\u0430\u0435\u0442 \u043c\u0435\u043d\u044e \u0433\u0434\u0435 \u0432\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u0432\u044b\u0431\u0440\u0430\u0442\u044c \u043b\u044e\u0431\u0443\u044e \u0446\u0435\u043b\u044c \u043a\u043b\u0438\u043a\u043d\u0443\u0432 \u043f\u043e \u043d\u0435\u0439."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> click")};
    }

    private static /* synthetic */ void ntfClinit() {
        sh_3.id_finally();
        sh_3.id_throws();
        sh_3.id_extends();
        sh_3.id_protected();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_catch = blArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_break[0]];
        stringArray[sh_3.id_catch[3]] = id_throws[3];
        stringArray[sh_3.id_catch[4]] = id_throws[4];
        stringArray[sh_3.id_break[1]] = id_throws[5];
        stringArray[sh_3.id_break[2]] = id_throws[6];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_case = new short[1];
    }

    @Override
    public boolean id_case() {
        return id_catch[5];
    }

    @Override
    public String id_implements() {
        return id_throws[2];
    }

    private static void id_protected() {
        id_break = new byte[]{4, 2, 3};
    }
}

