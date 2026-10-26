/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.P;
import celestial.rVL;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rqO_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sK_2
extends C_try {
    private static short[] id_break;
    private static byte[] id_throws;
    private static String[] id_case;
    private static boolean[] id_catch;

    public sK_2(C_case c_case) {
        String[] stringArray = new String[id_catch[0]];
        stringArray[sK_2.id_catch[1]] = id_case[0];
        super(c_case, stringArray);
    }

    static {
        sK_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCDA9C37868193163L;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        HashSet<rdb_3> hashSet = new HashSet<rdb_3>();
        while (c_static.id_final()) {
            rdb_3 rdb_32 = (rdb_3)c_static.id_break((P)P.staticFieldsee62191719013ce696dd0417ea84d4fd[id_break[0]]);
            hashSet.add(rdb_32);
        }
        if (hashSet.isEmpty()) {
            ((C_case)this.id_class[id_break[1]]).id_public().id_class((rdn_3 rdn_32) -> id_catch[4]);
            this.id_case(id_case[1]);
        } else {
            ((C_case)this.id_class[id_break[2]]).id_public().id_class((rdn_3 rdn_32) -> hashSet.contains(rdn_32.id_break()));
            this.id_case(id_case[2]);
            hashSet.stream().map(rVL.id_for::id_break).map(rqO_2::toString).forEach(this::id_case);
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD1717FCD;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{70, 6, 41, -35, 0, 8, -14, 67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        while (c_static.id_break(id_throws[0])) {
            if (c_static.id_byte((P)P.staticFieldsee62191719013ce696dd0417ea84d4fd[id_break[3]]) == null) {
                return Stream.empty();
            }
            c_static.id_throws();
        }
        return c_static.id_class((P)P.staticFieldsee62191719013ce696dd0417ea84d4fd[id_break[4]]);
    }

    private static void id_throws() {
        id_case = new String[]{new String("pickup"), new String("\u0421\u043e\u0431\u0438\u0440\u0430\u0435\u043c \u0432\u0441\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b"), new String("\u0421\u043e\u0431\u0438\u0440\u0430\u0435\u043c \u044d\u0442\u0438 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b:"), new String("\u041f\u043e\u0434\u0431\u0438\u0440\u0430\u0442\u044c \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b"), new String("Usage:"), new String("> pickup - \u041f\u043e\u0434\u0431\u0438\u0440\u0430\u0442\u044c \u0432\u0441\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b"), new String("> pickup <item1> <item2> <...> - \u041f\u043e\u0434\u0431\u0438\u0440\u0430\u0442\u044c \u0442\u043e\u043b\u044c\u043a\u043e \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u044b\u0435 \u043f\u0440\u0435\u0434\u043c\u0435\u0442\u044b")};
    }

    private static /* synthetic */ void ntfClinit() {
        sK_2.id_extends();
        sK_2.id_throws();
        sK_2.id_protected();
        sK_2.id_finally();
    }

    private static void id_finally() {
        id_throws = new byte[]{2, 3, 2};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[1]];
        stringArray[sK_2.id_catch[2]] = id_case[4];
        stringArray[sK_2.id_catch[3]] = id_case[5];
        stringArray[sK_2.id_throws[2]] = id_case[6];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        id_catch = blArray;
    }

    @Override
    public String id_implements() {
        return id_case[3];
    }

    private static void id_protected() {
        id_break = new short[5];
    }
}

