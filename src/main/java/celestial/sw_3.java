/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_final;
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

public class sw_3
extends C_try {
    private static short[] id_break;
    private static boolean[] id_throws;
    private static byte[] id_case;
    private static String[] id_catch;

    public sw_3(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[sw_3.id_throws[1]] = id_catch[0];
        super(c_case, stringArray);
    }

    static {
        sw_3.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_throws[2]);
        C_final c_final = ((C_case)this.id_class[id_break[0]]).id_this();
        c_final.id_break();
        c_final.id_private();
        this.id_case(id_catch[1]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xACCB2E69;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xC45921FBAD56D46EL;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{109, -72, 98, -98, -18, 16, 50, 120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        id_break = new short[1];
    }

    private static /* synthetic */ void ntfClinit() {
        sw_3.id_finally();
        sw_3.id_extends();
        sw_3.id_throws();
        sw_3.id_protected();
    }

    private static void id_finally() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_throws = blArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[0]];
        stringArray[sw_3.id_throws[3]] = id_catch[3];
        stringArray[sw_3.id_throws[4]] = id_catch[4];
        stringArray[sw_3.id_case[1]] = id_catch[5];
        stringArray[sw_3.id_case[2]] = id_catch[6];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_catch = new String[]{new String("forcecancel"), new String("\u041f\u0440\u0438\u043d\u0443\u0434\u0438\u0442\u0435\u043b\u044c\u043d\u043e \u043e\u0442\u043c\u0435\u043d\u0435\u043d\u044b \u0432\u0441\u0435 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u044b."), new String("\u041f\u0440\u0438\u043d\u0443\u0434\u0438\u0442\u0435\u043b\u044c\u043d\u043e \u043e\u0442\u043c\u0435\u043d\u044f\u0435\u0442 \u0432\u0441\u0435 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u044b."), new String("\u041a\u0430\u043a cancel, \u043d\u043e \u0431\u043e\u043b\u0435\u0435 \u0441 \u0431\u043e\u043b\u044c\u0448\u043e\u0439 \u0441\u0438\u043b\u043e\u0439."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> forcecancel")};
    }

    @Override
    public boolean id_case() {
        return id_throws[5];
    }

    @Override
    public String id_implements() {
        return id_catch[2];
    }

    private static void id_protected() {
        id_case = new byte[]{4, 2, 3};
    }
}

