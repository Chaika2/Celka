/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.Ps_1;
import celestial.So_1;
import celestial.rc_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class so_3
extends C_try {
    private static boolean[] id_break;
    private static String[] id_throws;
    private static short[] id_case;
    private static byte[] id_catch;

    public so_3(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[so_3.id_break[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        so_3.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        rc_3 rc_32 = ((C_case)this.id_class[id_case[0]]).id_import();
        c_static.id_class(id_break[2]);
        ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[id_case[1]]).id_class((Ps_1)this.id_class[id_case[2]]);
        rc_32.id_implements();
        this.id_case(id_throws[1]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x5B43E3BD939A48E0L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9A3F3166;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{115, -46, 24, -23, 68, 96, -71, -48}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        return Stream.empty();
    }

    private static void id_throws() {
        id_throws = new String[]{new String("path"), new String("\u041f\u0440\u043e\u043a\u043b\u0430\u0434\u044b\u0432\u0430\u043d\u0438\u0435 \u043f\u0443\u0442\u0438..."), new String("\u0414\u0432\u0438\u0433\u0430\u0442\u044c\u0441\u044f \u043a \u0446\u0435\u043b\u0438 (Goal)"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"path\" \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 Baritone \u043d\u0430\u043f\u0440\u0430\u0432\u0438\u0442\u044c\u0441\u044f \u043a \u0442\u0435\u043a\u0443\u0449\u0435\u0439 \u0446\u0435\u043b\u0438 (Goal)."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> path - \u041d\u0430\u0447\u0430\u0442\u044c \u0438\u0434\u0442\u0438 \u043a \u0446\u0435\u043b\u0438.")};
    }

    private static /* synthetic */ void ntfClinit() {
        so_3.id_protected();
        so_3.id_throws();
        so_3.id_finally();
        so_3.id_extends();
    }

    private static void id_finally() {
        short[] sArray = new short[3];
        sArray[2] = 1;
        id_case = sArray;
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_catch[0]];
        stringArray[so_3.id_break[3]] = id_throws[3];
        stringArray[so_3.id_break[4]] = id_throws[4];
        stringArray[so_3.id_catch[1]] = id_throws[5];
        stringArray[so_3.id_catch[2]] = id_throws[6];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_catch = new byte[]{4, 2, 3};
    }

    @Override
    public boolean id_case() {
        return id_break[5];
    }

    @Override
    public String id_implements() {
        return id_throws[2];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[6];
        blArray[0] = true;
        blArray[4] = true;
        blArray[5] = true;
        id_break = blArray;
    }
}

