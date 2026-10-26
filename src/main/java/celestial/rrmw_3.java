/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.gm_3;
import celestial.rhd_3;
import celestial.rrIi_1;
import celestial.rrfB_2;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmw_3
extends C_try {
    private static short[] id_break;
    private static double[] id_throws;
    private static byte[] id_case;
    private static boolean[] id_catch;
    private static String[] id_private;

    public rrmw_3(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[rrmw_3.id_catch[0]] = id_private[0];
        stringArray[rrmw_3.id_catch[1]] = id_private[1];
        super(c_case, stringArray);
    }

    static {
        rrmw_3.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        if ((rrfq_3)((Object)rrfp_3.id_class[id_break[0]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[1]])) {
            rrfu_3.id_byte(id_private[2]);
            return;
        }
        c_static.id_private(id_catch[2]);
        if (c_static.id_case(id_catch[3])) {
            String string2 = c_static.id_extends();
            rhd_3 rhd_32 = ((gm_3)rrmw_3.b_.id_class[id_break[2]]).id_break(string2);
            if (rhd_32 == null) {
                this.id_case(id_private[3]);
                return;
            }
            double d = (float)rhd_32.rx();
            double d2 = (float)rhd_32.re();
            double d3 = (float)rhd_32.BO();
            rrIi_1.id_class((rrfB_2)((Object)rrfB_2.staticFieldsfc18f9297f253886af5bb346ef27734e[id_break[3]]), d, d2, d3);
        } else {
            boolean bl = c_static.id_break(id_case[1]);
            c_static.id_private(bl ? id_case[2] : id_case[3]);
            double d = c_static.id_catch(Double.class);
            double d4 = bl ? c_static.id_catch(Double.class) : id_throws[0];
            double d5 = c_static.id_catch(Double.class);
            rrIi_1.id_class((rrfB_2)((Object)rrfB_2.staticFieldsfc18f9297f253886af5bb346ef27734e[id_break[4]]), d, d4, d5);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x86CB38609A1C0C83L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xECAF69B6;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-4, -100, -69, 86, -114, -96, 34, -122}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        short[] sArray = new short[6];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[2] = 56;
        sArray[3] = 2;
        sArray[4] = 1;
        id_break = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrmw_3.id_extends();
        rrmw_3.id_native();
        rrmw_3.id_throws();
        rrmw_3.id_protected();
        rrmw_3.id_finally();
    }

    private static void id_finally() {
        id_case = new byte[]{2, 3, 3, 2, 2, 2};
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_catch[4]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_break[5]];
        Object[] objectArray = new Object[id_case[4]];
        objectArray[rrmw_3.id_catch[5]] = string2;
        objectArray[rrmw_3.id_catch[6]] = string;
        Object[] objectArray2 = new Object[id_case[5]];
        objectArray2[rrmw_3.id_catch[7]] = string2;
        objectArray2[rrmw_3.id_catch[8]] = string;
        return List.of(id_private[5].formatted(objectArray), id_private[6].formatted(objectArray2));
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[9];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[8] = true;
        id_catch = blArray;
    }

    @Override
    public String id_implements() {
        return id_private[4];
    }

    private static void id_protected() {
        id_throws = new double[]{180.0};
    }

    private static void id_native() {
        id_private = new String[]{new String("tp"), new String("teleport"), new String("\u0414\u0430\u043d\u043d\u0430\u044f \u043a\u043e\u043c\u0430\u043d\u0434\u0430 \u0431\u0430\u043d\u0438\u0442\u0441\u044f \u043d\u0430 \u044d\u0442\u043e\u043c \u0441\u0435\u0440\u0432\u0435\u0440\u0435"), new String("\u0418\u0433\u0440\u043e\u043a \u043d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0430 \u043d\u0430 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u044b\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b"), new String("> %s%s <X Y Z> - \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u0443\u0435\u0442 \u0432\u0430\u0441 \u043d\u0430 \u0443\u043a\u0430\u0437\u0430\u043d\u043d\u044b\u0435 \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b"), new String("> %s%s <\u043d\u0438\u043a> - \u0442\u0435\u043b\u0435\u043f\u043e\u0440\u0442\u0438\u0440\u0443\u0435\u0442 \u0432\u0430\u0441 \u043a \u0438\u0433\u0440\u043e\u043a\u0443 \u0432 \u0440\u0430\u0434\u0438\u0443\u0441\u0435 \u043f\u0440\u043e\u0440\u0438\u0441\u043e\u0432\u043a\u0438")};
    }
}

