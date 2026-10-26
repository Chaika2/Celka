/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.sN_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sv_3
extends C_try {
    private static short[] id_throws;
    public Object[] id_break;
    private static byte[] id_case;
    private static boolean[] id_catch;
    private static String[] id_private;

    public sv_3(sN_2 sN_22, C_case c_case, String[] stringArray, boolean ... blArray) {
        super(c_case, stringArray);
        this.id_extends();
        boolean[] blArray2 = blArray;
        this.id_break[sv_3.id_throws[0]] = blArray2;
    }

    static {
        sv_3.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        this.id_extends();
        c_static.id_class(id_catch[0]);
        if (((boolean[])this.id_break[id_throws[1]])[id_catch[1]]) {
            ((boolean[])this.id_break[sv_3.id_throws[2]])[sv_3.id_catch[2]] = id_catch[3];
        }
        ((C_case)this.id_class[id_throws[3]]).id_this().id_break();
        this.id_case(id_private[0]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x45EA1BE5;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFEB6C39CB3A2EAD5L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{49, 99, 119, 53, -105, 61, 113, 7}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[8];
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_catch = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sv_3.id_throws();
        sv_3.id_protected();
        sv_3.id_finally();
        sv_3.id_native();
    }

    private static void id_finally() {
        id_throws = new short[4];
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[0]];
        stringArray[sv_3.id_catch[4]] = id_private[2];
        stringArray[sv_3.id_catch[5]] = id_private[3];
        stringArray[sv_3.id_case[1]] = id_private[4];
        stringArray[sv_3.id_case[2]] = id_private[5];
        return Arrays.asList(stringArray);
    }

    private void id_extends() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_catch[7]];
        }
    }

    @Override
    public boolean id_case() {
        return id_catch[6];
    }

    @Override
    public String id_implements() {
        return id_private[1];
    }

    private static void id_protected() {
        id_private = new String[]{new String("\u041e\u0442\u043c\u0435\u043d\u044f\u0435\u043c \u0432\u0441\u0435 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u044b \u0431\u0430\u0440\u0438\u0442\u043e\u043d\u0430"), new String("\u041e\u0442\u043c\u0435\u043d\u044f\u0435\u0442 \u0432\u0441\u0435 \u0430\u043a\u0442\u0438\u0432\u043d\u044b\u0435 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u044b \u0431\u0430\u0440\u0438\u0442\u043e\u043d\u0430"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"cancel\" \u043e\u0442\u043c\u0435\u043d\u044f\u0435\u0442 \u0432\u0441\u0435 \u0430\u043a\u0442\u0438\u0432\u043d\u044b\u0435 \u043f\u0440\u043e\u0446\u0435\u0441\u0441\u044b \u0431\u0430\u0440\u0438\u0442\u043e\u043d\u0430"), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> cancel")};
    }

    private static void id_native() {
        id_case = new byte[]{4, 2, 3};
    }
}

