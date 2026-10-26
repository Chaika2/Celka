/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_interface;
import celestial.Ps_1;
import celestial.rVe_1;
import celestial.rVi_1;
import celestial.rgF_2;
import celestial.rgH_2;
import celestial.rgN_2;
import celestial.rgl_3;
import celestial.rgp_3;
import celestial.rgv_3;
import celestial.rgy_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class C_try
implements C_interface {
    private static boolean[] id_break;
    private static short[] id_throws;
    private static byte[] id_case;
    private static String[] id_catch;
    public Object[] id_class;

    @Override
    public x_1 id_byte() {
        return null;
    }

    public C_try(C_case c_case, String ... stringArray) {
        List<String> list;
        this.id_native();
        this.id_class[C_try.id_throws[0]] = list = Stream.of(stringArray).map(string -> string.toLowerCase(Locale.US)).toList();
        C_case c_case2 = c_case;
        this.id_class[C_try.id_throws[1]] = c_case2;
        Ps_1 ps_1 = c_case.id_throw();
        this.id_class[C_try.id_throws[2]] = ps_1;
    }

    static {
        C_try.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{67, -56, -68, 69, -16, 46, -88, 16}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBB4515F4;
    }

    @Override
    public rVi_1 id_class() {
        rVi_1 rVi_12 = new rVe_1(id_catch[0]).id_class(new rgN_2("'" + this.id_break().get(id_break[0]) + "'").id_break(rgF_2.RED));
        rVe_1 rVe_12 = new rVe_1(this.id_implements() + "\n\n" + String.join((CharSequence)id_catch[1], this.id_catch()));
        rVi_12.id_class(rVi_12.id_class().id_class(rgF_2.GRAY));
        rVe_12.id_class(rVe_12.id_class().id_class(rgF_2.GRAY));
        return rgv_3.id_class(rVi_12, new rgy_3(rgp_3.id_class, rVe_12), new rgl_3(rgH_2.SUGGEST_COMMAND, (String)C_class.id_instanceof().id_protected.id_class[id_throws[3]] + this.id_break().get(id_break[1]) + " "));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x7BBA5160A6D81245L;
    }

    @Override
    public List<String> id_break() {
        return (List)this.id_class[id_throws[4]];
    }

    private static void id_throws() {
        id_break = new boolean[2];
    }

    private static /* synthetic */ void ntfClinit() {
        C_try.id_throws();
        C_try.id_finally();
        C_try.id_protected();
        C_try.id_extends();
    }

    private static void id_finally() {
        id_catch = new String[]{new String("\u041d\u0430\u0432\u0435\u0434\u0438\u0442\u0435 \u043c\u044b\u0448\u044c, \u0447\u0442\u043e\u0431\u044b \u0443\u0432\u0438\u0434\u0435\u0442\u044c \u043f\u043e\u0434\u0440\u043e\u0431\u043d\u043e\u0435 \u043e\u043f\u0438\u0441\u0430\u043d\u0438\u0435 \u043a\u043e\u043c\u0430\u043d\u0434\u044b "), new String("\n")};
    }

    private static void id_extends() {
        id_case = new byte[]{3};
    }

    private static void id_protected() {
        short[] sArray = new short[5];
        sArray[0] = 2;
        sArray[2] = 1;
        sArray[4] = 2;
        id_throws = sArray;
    }

    private void id_native() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_case[0]];
        }
    }
}

