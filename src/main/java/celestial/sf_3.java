/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.G;
import celestial.rP_2;
import celestial.rU_2;
import celestial.rc_3;
import celestial.s_1;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sf_3
extends C_try {
    private static short[] id_break;
    private static String[] id_throws;
    private static boolean[] id_case;
    private static byte[] id_catch;

    public sf_3(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[sf_3.id_case[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        sf_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6123D2420BA18D87L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB0B223B7;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        rc_3 rc_32 = ((C_case)this.id_class[id_break[0]]).id_import();
        if (c_static.id_final()) {
            String[] stringArray = new String[id_catch[0]];
            stringArray[sf_3.id_case[2]] = id_throws[1];
            stringArray[sf_3.id_case[3]] = id_throws[2];
            stringArray[sf_3.id_catch[1]] = id_throws[3];
            if (Arrays.asList(stringArray).contains(c_static.id_implements())) {
                c_static.id_class(id_case[4]);
                if (rc_32.id_private() != null) {
                    rc_32.id_class((rP_2)null);
                    this.id_case(id_throws[4]);
                    return;
                }
                this.id_case(id_throws[5]);
                return;
            }
        }
        c_static.id_class(id_catch[2]);
        rU_2 rU_22 = ((C_case)this.id_class[id_break[1]]).id_throw().id_volatile();
        rP_2 rP_22 = (rP_2)c_static.id_break((G)G.staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb[id_break[2]], rU_22);
        rc_32.id_class(rP_22);
        Object[] objectArray = new Object[id_case[5]];
        objectArray[sf_3.id_case[6]] = rP_22.toString();
        this.id_case(String.format(id_throws[6], objectArray));
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        v_1 v_12 = new v_1();
        if (c_static.id_case()) {
            String[] stringArray = new String[id_catch[3]];
            stringArray[sf_3.id_case[7]] = id_throws[7];
            stringArray[sf_3.id_case[8]] = id_throws[8];
            stringArray[sf_3.id_catch[4]] = id_throws[9];
            stringArray[sf_3.id_catch[5]] = id_throws[10];
            v_12.id_break(stringArray);
        } else if (c_static.id_catch(id_catch[6])) {
            while (c_static.id_break(id_catch[7]) && c_static.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[id_break[3]]) != null) {
                c_static.id_throws();
                if (c_static.id_break(id_catch[8])) continue;
                String[] stringArray = new String[id_case[9]];
                stringArray[sf_3.id_case[10]] = id_throws[11];
                v_12.id_break(stringArray);
            }
        }
        return v_12.id_class(c_static.id_extends()).id_protected();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-67, 88, 39, -77, 79, -53, -54, -3}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[14];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[8] = true;
        blArray[9] = true;
        blArray[12] = true;
        blArray[13] = true;
        id_case = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sf_3.id_throws();
        sf_3.id_finally();
        sf_3.id_protected();
        sf_3.id_extends();
    }

    private static void id_finally() {
        id_throws = new String[]{new String("goal"), new String("reset"), new String("clear"), new String("none"), new String("\u0426\u0435\u043b\u044c \u043e\u0447\u0438\u0449\u0435\u043d\u0430"), new String("\u041d\u0435\u0442\u0443 \u0446\u0435\u043b\u0438 \u0447\u0442\u043e\u0431\u044b \u0435\u0435 \u043e\u0447\u0438\u0441\u0442\u0438\u0442\u044c"), new String("Goal: %s"), new String("reset"), new String("clear"), new String("none"), new String("~"), new String("~"), new String("\u0423\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u0442 \u0438\u043b\u0438 \u0443\u0431\u0438\u0440\u0430\u0435\u0442 \u043f\u0443\u0442\u044c \u0434\u043e \u0442\u043e\u0447\u043a\u0438"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"goal\" \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0443\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u0438\u043b\u0438 \u0441\u043d\u044f\u0442\u044c \u0446\u0435\u043b\u044c Baritone."), new String(""), new String("\u0412\u0435\u0437\u0434\u0435, \u0433\u0434\u0435 \u043e\u0436\u0438\u0434\u0430\u044e\u0442\u0441\u044f \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b, \u0432\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c ~, \u043a\u0430\u043a \u0432 \u043e\u0431\u044b\u0447\u043d\u044b\u0445 \u043a\u043e\u043c\u0430\u043d\u0434\u0430\u0445 Minecraft. \u0418\u043b\u0438 \u0432\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u043f\u0440\u043e\u0441\u0442\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043e\u0431\u044b\u0447\u043d\u044b\u0435 \u0447\u0438\u0441\u043b\u0430."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> goal - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u043f\u0443\u0442\u044c \u0432 \u0441\u043e\u043e\u0442\u0432\u0435\u0442\u0441\u0442\u0432\u0438\u0438 \u0441 \u0432\u0430\u0448\u0438\u043c \u0442\u0435\u043a\u0443\u0449\u0438\u043c \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435\u043c"), new String("> goal <reset/clear/none> - \u0421\u0442\u0435\u0440\u0435\u0442\u044c \u0446\u0435\u043b\u044c"), new String("> goal <y> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u0435 \u043f\u0443\u0442\u044c \u043d\u0430 \u0443\u0440\u043e\u0432\u043d\u0435 Y"), new String("> goal <x> <z> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u0446\u0435\u043b\u044c \u0432 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435 X,Z"), new String("> goal <x> <y> <z> - \u0423\u0441\u0442\u0430\u043d\u043e\u0432\u0438\u0442\u044c \u0446\u0435\u043b\u044c \u0432 \u043f\u043e\u043b\u043e\u0436\u0435\u043d\u0438\u0435 X,Y,Z")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_catch[9]];
        stringArray[sf_3.id_case[11]] = id_throws[13];
        stringArray[sf_3.id_case[12]] = id_throws[14];
        stringArray[sf_3.id_catch[10]] = id_throws[15];
        stringArray[sf_3.id_catch[11]] = id_throws[16];
        stringArray[sf_3.id_catch[12]] = id_throws[17];
        stringArray[sf_3.id_catch[13]] = id_throws[18];
        stringArray[sf_3.id_catch[14]] = id_throws[19];
        stringArray[sf_3.id_catch[15]] = id_throws[20];
        stringArray[sf_3.id_catch[16]] = id_throws[21];
        stringArray[sf_3.id_catch[17]] = id_throws[22];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_catch = new byte[]{3, 2, 3, 4, 2, 3, 3, 2, 2, 10, 2, 3, 4, 5, 6, 7, 8, 9};
    }

    @Override
    public boolean id_case() {
        return id_case[13];
    }

    @Override
    public String id_implements() {
        return id_throws[12];
    }

    private static void id_protected() {
        id_break = new short[4];
    }
}

