/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.an_3;
import celestial.k_1;
import celestial.rS_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sX_2
extends C_try {
    private static boolean[] id_break;
    private static short[] id_throws;
    private static String[] id_case;
    private static byte[] id_catch;

    public sX_2(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[sX_2.id_break[1]] = id_case[0];
        super(c_case, stringArray);
    }

    static {
        sX_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDA0BDFC;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_break[2]);
        an_3 an_32 = b_.id_catch();
        if (an_32 == null) {
            throw new k_1(id_case[1]);
        }
        ((C_case)this.id_class[id_throws[0]]).id_import().id_break(new rS_2(an_32.Bs()));
        this.id_case(id_case[2]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1639C818EACD7329L;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{0, 1, 14, 58, 113, 15, -16, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_case = new String[]{new String("come"), new String("\u0412\u0430\u0448 \u0438\u0433\u0440\u043e\u043a \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d"), new String("\u0418\u0434\u0451\u043c"), new String("\u0423\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 Baritone \u043d\u0430\u043f\u0440\u0430\u0432\u0438\u0442\u044c\u0441\u044f \u043a \u0432\u0430\u0448\u0435\u0439 \u043a\u0430\u043c\u0435\u0440\u0435"), new String("\u0423\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 Baritone \u043d\u0430\u043f\u0440\u0430\u0432\u0438\u0442\u044c\u0441\u044f \u043a \u0432\u0430\u0448\u0435\u0439 \u043a\u0430\u043c\u0435\u0440\u0435"), new String(""), new String("\u042d\u0442\u043e \u043c\u043e\u0436\u0435\u0442 \u0431\u044b\u0442\u044c \u043f\u043e\u043b\u0435\u0437\u043d\u043e \u0432 \u0447\u0438\u0442 \u043a\u043b\u0438\u0435\u043d\u0442\u0430\u0445, \u0433\u0434\u0435 FreeCamera \u043d\u0435 \u043f\u0435\u0440\u0435\u043c\u0435\u0449\u0430\u0435\u0442 \u043f\u043e\u0437\u0438\u0446\u0438\u044e \u0438\u0433\u0440\u043e\u043a\u0430"), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> come")};
    }

    private static /* synthetic */ void ntfClinit() {
        sX_2.id_finally();
        sX_2.id_throws();
        sX_2.id_extends();
        sX_2.id_protected();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_break = blArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_catch[0]];
        stringArray[sX_2.id_break[3]] = id_case[4];
        stringArray[sX_2.id_break[4]] = id_case[5];
        stringArray[sX_2.id_catch[1]] = id_case[6];
        stringArray[sX_2.id_catch[2]] = id_case[7];
        stringArray[sX_2.id_catch[3]] = id_case[8];
        stringArray[sX_2.id_catch[4]] = id_case[9];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_throws = new short[1];
    }

    @Override
    public boolean id_case() {
        return id_break[5];
    }

    @Override
    public String id_implements() {
        return id_case[3];
    }

    private static void id_protected() {
        id_catch = new byte[]{6, 2, 3, 4, 5};
    }
}

