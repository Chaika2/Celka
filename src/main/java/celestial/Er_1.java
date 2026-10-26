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

public class Er_1
extends C_try {
    private static boolean[] id_break;
    private static byte[] id_throws;
    private static short[] id_case;
    private static String[] id_catch;

    public Er_1(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[Er_1.id_break[1]] = id_catch[0];
        super(c_case, stringArray);
    }

    static {
        Er_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x20734E25E798CD97L;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_break[2]);
        ((C_case)this.id_class[id_case[0]]).r().id_private();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC2318874;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-91, 0, -118, -2, -98, 107, -1, 119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_throws = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        Er_1.id_protected();
        Er_1.id_finally();
        Er_1.id_extends();
        Er_1.id_throws();
    }

    private static void id_finally() {
        id_catch = new String[]{new String("schematica"), new String("\u041f\u043e\u0441\u0442\u0440\u043e\u0435\u043d\u0438\u0435 \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u043d\u043e\u0439 \u0441\u0445\u0435\u043c\u044b"), new String("\u041f\u043e\u0441\u0442\u0440\u043e\u0435\u043d\u0438\u0435 \u0441\u0445\u0435\u043c\u044b, \u043e\u0442\u043a\u0440\u044b\u0442\u043e\u0439 \u0432 \u0434\u0430\u043d\u043d\u044b\u0439 \u043c\u043e\u043c\u0435\u043d\u0442 \u0432 Schematica"), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> schematica")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[0]];
        stringArray[Er_1.id_break[3]] = id_catch[2];
        stringArray[Er_1.id_break[4]] = id_catch[3];
        stringArray[Er_1.id_throws[1]] = id_catch[4];
        stringArray[Er_1.id_throws[2]] = id_catch[5];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_case = new short[1];
    }

    @Override
    public boolean id_case() {
        return id_break[5];
    }

    @Override
    public String id_implements() {
        return id_catch[1];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_break = blArray;
    }
}

