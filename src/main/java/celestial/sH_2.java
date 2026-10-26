/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_boolean;
import celestial.C_case;
import celestial.C_static;
import celestial.C_this;
import celestial.C_try;
import celestial.k_1;
import celestial.rU_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sH_2
extends C_try {
    private static boolean[] id_break;
    private static String[] id_throws;
    private static byte[] id_case;
    private static short[] id_catch;

    public sH_2(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[sH_2.id_break[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        sH_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6E41FD3511DDC43AL;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_case[0]);
        int n = id_break[2];
        rU_2 rU_22 = null;
        if (c_static.id_break(id_break[3])) {
            n = c_static.id_catch(Integer.class);
        }
        if (c_static.id_break(id_break[4])) {
            C_this[] c_thisArray = (C_this[])c_static.id_break((C_boolean)C_boolean.staticFields1efcd1a6ae203b428c7ab1f68db4b5b6[id_catch[0]]);
            C_this c_this = null;
            switch (c_thisArray.length) {
                case 0: {
                    throw new k_1(id_throws[1]);
                }
                case 1: {
                    c_this = c_thisArray[id_break[5]];
                    break;
                }
                default: {
                    throw new k_1(id_throws[2]);
                }
            }
            rU_22 = c_this.id_class();
        }
        ((C_case)this.id_class[id_catch[1]]).id_throws().id_class(n, rU_22);
        this.id_case(id_throws[3]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xFC240297;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-118, -39, -80, 38, -88, 19, 57, 74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        id_case = new byte[]{2, 6, 2, 3, 4, 5};
    }

    private static /* synthetic */ void ntfClinit() {
        sH_2.id_extends();
        sH_2.id_finally();
        sH_2.id_protected();
        sH_2.id_throws();
    }

    private static void id_finally() {
        id_throws = new String[]{new String("farm"), new String("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d\u043e \u043d\u0438 \u043e\u0434\u043d\u043e\u0433\u043e \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442\u0430"), new String("\u041d\u0430\u0439\u0434\u0435\u043d\u043e \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442\u043e\u0432"), new String("\u0424\u0430\u0440\u043c\u043b\u044e\u0441\u044c..."), new String("\u0424\u0430\u0440\u043c\u0438\u0442 \u0431\u043b\u0438\u0436\u0430\u0439\u0448\u0438\u0439 \u0443\u0440\u043e\u0436\u0430\u0439"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"farm\" \u043d\u0430\u0447\u0438\u043d\u0430\u0435\u0442 \u0432\u044b\u0440\u0430\u0449\u0438\u0432\u0430\u0442\u044c \u0431\u043b\u0438\u0437\u043b\u0435\u0436\u0430\u0449\u0438\u0435 \u0440\u0430\u0441\u0442\u0435\u043d\u0438\u044f. \u041e\u043d\u0430 \u0441\u043e\u0431\u0438\u0440\u0430\u0435\u0442 \u0437\u0440\u0435\u043b\u044b\u0435 \u043a\u0443\u043b\u044c\u0442\u0443\u0440\u044b \u0438 \u0441\u0430\u0436\u0430\u0435\u0442 \u043d\u043e\u0432\u044b\u0435.."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> farm - \u0444\u0430\u0440\u043c\u0438\u0442 \u0432\u0435\u0441\u044c \u0443\u0440\u043e\u0436\u0430\u0439, \u043a\u043e\u0442\u043e\u0440\u044b\u0439 \u043c\u043e\u0436\u0435\u0442 \u043d\u0430\u0439\u0442\u0438."), new String("> farm <\u0440\u0430\u0434\u0438\u0443\u0441> - \u0444\u0430\u0440\u043c\u0438\u0442 \u0432\u0435\u0441\u044c \u0443\u0440\u043e\u0436\u0430\u0439 \u0432 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u043e\u043c \u0440\u0430\u0434\u0438\u0443\u0441\u0435."), new String("> farm <\u0440\u0430\u0434\u0438\u0443\u0441> <\u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442> - \u0444\u0430\u0440\u043c\u0438\u0442 \u0432\u0435\u0441\u044c \u0443\u0440\u043e\u0436\u0430\u0439 \u0432 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u043e\u043c \u0440\u0430\u0434\u0438\u0443\u0441\u0435 \u043e\u0442 \u0432\u0435\u0439\u043f\u043e\u0438\u043d\u0442\u0430.")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[1]];
        stringArray[sH_2.id_break[6]] = id_throws[5];
        stringArray[sH_2.id_break[7]] = id_throws[6];
        stringArray[sH_2.id_case[2]] = id_throws[7];
        stringArray[sH_2.id_case[3]] = id_throws[8];
        stringArray[sH_2.id_case[4]] = id_throws[9];
        stringArray[sH_2.id_case[5]] = id_throws[10];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[7] = true;
        blArray[8] = true;
        id_break = blArray;
    }

    @Override
    public boolean id_case() {
        return id_break[8];
    }

    @Override
    public String id_implements() {
        return id_throws[4];
    }

    private static void id_protected() {
        id_catch = new short[2];
    }
}

