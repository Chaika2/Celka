/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_const;
import celestial.C_short;
import celestial.C_static;
import celestial.C_try;
import celestial.G;
import celestial.rP_2;
import celestial.rU_2;
import celestial.re_3;
import celestial.s_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sj_3
extends C_try {
    private static String[] id_break;
    private static byte[] id_throws;
    private static short[] id_case;
    private static boolean[] id_catch;

    public sj_3(C_case c_case) {
        String[] stringArray = new String[id_catch[0]];
        stringArray[sj_3.id_catch[1]] = id_break[0];
        super(c_case, stringArray);
    }

    static {
        sj_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE02ED93AAD6126ABL;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        if (c_static.id_class((s_1)s_1.staticFields2f6c75eddeaf3dec901642e9ef998dc8[id_case[0]]) != null) {
            c_static.id_class(id_throws[0]);
            rU_2 rU_22 = ((C_case)this.id_class[id_case[1]]).id_throw().id_volatile();
            rP_2 rP_22 = (rP_2)c_static.id_break((G)G.staticFieldscbb17f97fc8b35a5b5d18fc81c3fa5eb[id_case[2]], rU_22);
            Object[] objectArray = new Object[id_catch[2]];
            objectArray[sj_3.id_catch[3]] = rP_22.toString();
            this.id_case(String.format(id_break[1], objectArray));
            ((C_case)this.id_class[id_case[3]]).id_import().id_break(rP_22);
            return;
        }
        c_static.id_class(id_catch[4]);
        re_3 re_32 = (re_3)c_static.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_case[4]]);
        ((C_case)this.id_class[id_case[5]]).id_super().id_class(re_32);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x41791B9F;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{104, -114, -97, 65, -111, 6, -8, 81}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        return c_static.id_class((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[id_case[6]]);
    }

    private static void id_throws() {
        id_break = new String[]{new String("goto"), new String("\u0418\u0434\u0435\u043c \u043a: %s"), new String("\u0418\u0434\u0442\u0438 \u043a \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u043c \u0438\u043b\u0438 \u0431\u043b\u043e\u043a\u0443"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"goto\" \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 Baritone \u043d\u0430\u043f\u0440\u0430\u0432\u0438\u0442\u044c\u0441\u044f \u043a \u0437\u0430\u0434\u0430\u043d\u043d\u043e\u0439 \u0446\u0435\u043b\u0438 \u0438\u043b\u0438 \u0431\u043b\u043e\u043a\u0443."), new String(""), new String("\u0412\u0435\u0437\u0434\u0435, \u0433\u0434\u0435 \u043e\u0436\u0438\u0434\u0430\u044e\u0442\u0441\u044f \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u044b, \u0432\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c ~, \u043a\u0430\u043a \u0432 \u043e\u0431\u044b\u0447\u043d\u044b\u0445 \u043a\u043e\u043c\u0430\u043d\u0434\u0430\u0445 Minecraft. \u0418\u043b\u0438 \u0432\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u043f\u0440\u043e\u0441\u0442\u043e \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043e\u0431\u044b\u0447\u043d\u044b\u0435 \u0447\u0438\u0441\u043b\u0430."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> goto <block> - \u0418\u0434\u0442\u0438 \u043a \u0431\u043b\u043e\u043a\u0443, \u0433\u0434\u0435 \u0431\u044b \u043e\u043d \u043d\u0438 \u043d\u0430\u0445\u043e\u0434\u0438\u043b\u0441\u044f."), new String("> goto <y> - \u0418\u0434\u0442\u0438 \u043d\u0430 Y \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0443"), new String("> goto <x> <z> - \u0418\u0434\u0442\u0438 \u043a X,Z \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u043c"), new String("> goto <x> <y> <z> - \u0418\u0434\u0442\u0438 \u043a X,Y,Z \u043a\u043e\u043e\u0440\u0434\u0438\u043d\u0430\u0442\u0430\u043c")};
    }

    private static /* synthetic */ void ntfClinit() {
        sj_3.id_extends();
        sj_3.id_throws();
        sj_3.id_protected();
        sj_3.id_finally();
    }

    private static void id_finally() {
        id_throws = new byte[]{3, 9, 2, 3, 4, 5, 6, 7, 8};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[1]];
        stringArray[sj_3.id_catch[5]] = id_break[3];
        stringArray[sj_3.id_catch[6]] = id_break[4];
        stringArray[sj_3.id_throws[2]] = id_break[5];
        stringArray[sj_3.id_throws[3]] = id_break[6];
        stringArray[sj_3.id_throws[4]] = id_break[7];
        stringArray[sj_3.id_throws[5]] = id_break[8];
        stringArray[sj_3.id_throws[6]] = id_break[9];
        stringArray[sj_3.id_throws[7]] = id_break[10];
        stringArray[sj_3.id_throws[8]] = id_break[11];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_catch = blArray;
    }

    @Override
    public boolean id_case() {
        return id_catch[7];
    }

    @Override
    public String id_implements() {
        return id_break[2];
    }

    private static void id_protected() {
        id_case = new short[7];
    }
}

