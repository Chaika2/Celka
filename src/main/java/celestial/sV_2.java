/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_try;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgy_3;
import celestial.rrfu_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sV_2
extends C_try {
    private static boolean[] id_break;
    private static short[] id_throws;
    private static String[] id_case;
    private static byte[] id_catch;

    public sV_2(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[sV_2.id_break[1]] = id_case[0];
        super(c_case, stringArray);
    }

    static {
        sV_2.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_break[2]);
        ((C_case)this.id_class[id_throws[0]]).id_switch().id_class().id_byte().forEach(c_interface -> {
            if (c_interface.id_case()) {
                return;
            }
            String string = String.join((CharSequence)id_case[6], c_interface.id_break());
            String string2 = c_interface.id_break().get(id_break[6]);
            rgN_2 rgN_22 = new rgN_2(" - " + c_interface.id_implements());
            rgN_22.id_class(rgN_22.id_class().id_class(rgF_2.GRAY));
            rVe_1 rVe_12 = rrfu_3.id_class((Object)string).id_break();
            rVe_12.id_class(rVe_12.id_class().id_class(rgF_2.WHITE));
            rgN_2 rgN_23 = new rgN_2(id_case[7]);
            rgN_23.id_class(rgN_23.id_class().id_class(rgF_2.GRAY));
            rgN_23.id_break(String.join((CharSequence)id_case[8], c_interface.id_catch()));
            rVe_1 rVe_13 = rrfu_3.id_class((Object)string2).id_break();
            rVe_13.id_class(rVe_13.id_class().id_class(rgF_2.GRAY));
            rVe_13.id_class(rgN_22);
            rVe_13.id_class(rVe_13.id_class().id_class(new rgy_3(rgp_3.id_class, rgN_23)));
            rVe_13.id_class(rVe_13.id_class().id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_throws[2]] + string2 + " ")));
            rVi_1[] rVi_1Array = new rVi_1[id_break[7]];
            rVi_1Array[sV_2.id_break[8]] = rVe_13;
            this.id_class(rVi_1Array);
        });
        this.id_case("\u0418\u0437\u043c\u0435\u043d\u0438\u0442\u044c \u043f\u0440\u0435\u0444\u0438\u043a\u0441 \u043a\u043e\u043c\u0430\u043d\u0434: " + (String)C_class.id_instanceof().id_protected.id_class[id_throws[1]] + "prefix <\u043d\u043e\u0432\u044b\u0439 \u043f\u0440\u0435\u0444\u0438\u043a\u0441>");
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC9472002;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEA9A66E480AE5041L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-16, 66, 19, -93, -42, -55, -126, -46}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        return Stream.empty();
    }

    private static void id_throws() {
        id_catch = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        sV_2.id_protected();
        sV_2.id_finally();
        sV_2.id_extends();
        sV_2.id_throws();
    }

    private static void id_finally() {
        id_case = new String[]{new String("help"), new String("\u041f\u0440\u043e\u0441\u043c\u043e\u0442\u0440 \u0432\u0441\u0435\u0445 \u043a\u043e\u043c\u0430\u043d\u0434"), new String("\u0421 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u044d\u0442\u043e\u0439 \u043a\u043e\u043c\u0430\u043d\u0434\u044b \u0432\u044b \u043c\u043e\u0436\u0435\u0442\u0435 \u043f\u0440\u043e\u0441\u043c\u043e\u0442\u0440\u0435\u0442\u044c \u043f\u043e\u0434\u0440\u043e\u0431\u043d\u0443\u044e \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u043e \u0442\u043e\u043c, \u043a\u0430\u043a \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u043a\u043e\u043c\u0430\u043d\u0434\u044b Celestial."), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> help - \u041f\u0435\u0440\u0435\u0447\u0438\u0441\u043b\u044f\u0435\u0442 \u0432\u0441\u0435 \u043a\u043e\u043c\u0430\u043d\u0434\u044b \u0438 \u0438\u0445 \u043a\u0440\u0430\u0442\u043a\u0438\u0435 \u043e\u043f\u0438\u0441\u0430\u043d\u0438\u044f."), new String("> help <\u043a\u043e\u043c\u0430\u043d\u0434\u0430> - \u041e\u0442\u043e\u0431\u0440\u0430\u0436\u0430\u0435\u0442 \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044e \u043f\u043e \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043d\u043e\u0439 \u043a\u043e\u043c\u0430\u043d\u0434\u0435."), new String("/"), new String(""), new String("\n")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_catch[0]];
        stringArray[sV_2.id_break[3]] = id_case[2];
        stringArray[sV_2.id_break[4]] = id_case[3];
        stringArray[sV_2.id_catch[1]] = id_case[4];
        stringArray[sV_2.id_catch[2]] = id_case[5];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_throws = new short[3];
    }

    @Override
    public boolean id_case() {
        return id_break[5];
    }

    @Override
    public String id_implements() {
        return id_case[1];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[9];
        blArray[0] = true;
        blArray[2] = true;
        blArray[4] = true;
        blArray[5] = true;
        blArray[7] = true;
        id_break = blArray;
    }
}

