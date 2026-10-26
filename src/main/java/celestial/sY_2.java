/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_const;
import celestial.C_short;
import celestial.C_static;
import celestial.C_try;
import celestial.Ps_1;
import celestial.So_1;
import celestial.re_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sY_2
extends C_try {
    private static String[] id_break;
    private static boolean[] id_throws;
    private static byte[] id_case;
    private static short[] id_catch;

    public sY_2(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[sY_2.id_throws[1]] = id_break[0];
        super(c_case, stringArray);
    }

    static {
        sY_2.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        int n = (Integer)c_static.id_byte(Integer.class, Integer.valueOf(id_throws[2]));
        c_static.id_private(id_throws[3]);
        ArrayList<re_3> arrayList = new ArrayList<re_3>();
        while (c_static.id_final()) {
            arrayList.add((re_3)c_static.id_break((C_const)C_const.staticFieldsa08d321dfe9f33979ad5f9dfda99c615[id_catch[0]]));
        }
        ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[id_catch[1]]).id_class((Ps_1)this.id_class[id_catch[2]]);
        Object[] objectArray = new Object[id_throws[4]];
        objectArray[sY_2.id_throws[5]] = arrayList;
        this.id_case(String.format(id_break[1], objectArray));
        ((C_case)this.id_class[id_catch[3]]).id_case().id_class(n, arrayList.toArray(new re_3[id_throws[6]]));
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x97250742;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x95F92B2230F21912L;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return c_static.id_class((C_short)C_short.staticFields527f5e1fd5d43b2790a2d9e0b8d76cee[id_catch[4]]);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, -84, 60, 93, 53, 118, -89, -29}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        short[] sArray = new short[5];
        sArray[2] = 1;
        id_catch = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sY_2.id_extends();
        sY_2.id_finally();
        sY_2.id_throws();
        sY_2.id_protected();
    }

    private static void id_finally() {
        id_break = new String[]{new String("mine"), new String("\u041a\u043e\u043f\u0430\u0435\u043c %s"), new String("\u041a\u043e\u043f\u0430\u0435\u0442 \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u0431\u043b\u043e\u043a\u0438"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"mine\" \u043f\u043e\u0437\u0432\u043e\u043b\u044f\u0435\u0442 \u0443\u043a\u0430\u0437\u0430\u0442\u044c Baritone \u0438\u0441\u043a\u0430\u0442\u044c \u0438 \u0434\u043e\u0431\u044b\u0432\u0430\u0442\u044c \u0432\u044b\u0431\u0440\u0430\u043d\u043d\u044b\u0435 \u0431\u043b\u043e\u043a\u0438."), new String(""), new String("\u0423\u043a\u0430\u0437\u0430\u043d\u043d\u044b\u0435 \u0431\u043b\u043e\u043a\u0438 \u043c\u043e\u0433\u0443\u0442 \u0431\u044b\u0442\u044c \u0440\u0443\u0434\u0430\u043c\u0438 \u0438\u043b\u0438 \u043b\u044e\u0431\u044b\u043c\u0438 \u0434\u0440\u0443\u0433\u0438\u043c\u0438 \u0431\u043b\u043e\u043a\u0430\u043c\u0438."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> mine diamond_ore - \u041a\u043e\u043f\u0430\u0435\u0442 \u0432\u0441\u0435 \u0430\u043b\u043c\u0430\u0437\u044b \u043a\u043e\u0442\u043e\u0440\u044b\u0435 \u043d\u0430\u0439\u0434\u0435\u0442.")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[0]];
        stringArray[sY_2.id_throws[7]] = id_break[3];
        stringArray[sY_2.id_throws[8]] = id_break[4];
        stringArray[sY_2.id_case[1]] = id_break[5];
        stringArray[sY_2.id_case[2]] = id_break[6];
        stringArray[sY_2.id_case[3]] = id_break[7];
        stringArray[sY_2.id_case[4]] = id_break[8];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[10];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[8] = true;
        blArray[9] = true;
        id_throws = blArray;
    }

    @Override
    public boolean id_case() {
        return id_throws[9];
    }

    @Override
    public String id_implements() {
        return id_break[2];
    }

    private static void id_protected() {
        id_case = new byte[]{6, 2, 3, 4, 5};
    }
}

