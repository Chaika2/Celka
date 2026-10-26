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

public class sZ_2
extends C_try {
    private static byte[] id_throws;
    private static String[] id_case;
    public Object[] id_break;
    private static short[] id_catch;
    private static boolean[] id_private;

    public sZ_2(sN_2 sN_22, C_case c_case, String[] stringArray, boolean ... blArray) {
        super(c_case, stringArray);
        this.id_native();
        boolean[] blArray2 = blArray;
        this.id_break[sZ_2.id_catch[0]] = blArray2;
    }

    static {
        sZ_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x432BEDCD78A9A551L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEB118A2E;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        this.id_native();
        c_static.id_class(id_private[0]);
        Object[] objectArray = new Object[id_private[1]];
        objectArray[sZ_2.id_private[2]] = ((boolean[])this.id_break[id_catch[1]])[id_private[3]] ? id_case[1] : id_case[2];
        this.id_case(String.format(id_case[0], objectArray));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-26, -59, -54, -22, -68, -22, 45, 108}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        id_case = new String[]{new String("\u0411\u0430\u0440\u0438\u0442\u043e\u043d %s \u043f\u0430\u0443\u0437\u0435"), new String("\u043d\u0430"), new String("\u043d\u0435 \u043d\u0430"), new String("\u0421\u043e\u043e\u0431\u0449\u0430\u0435\u0442 \u0432\u0430\u043c, \u0435\u0441\u043b\u0438 \u0431\u0430\u0440\u0438\u0442\u043e\u043d \u043d\u0430\u0445\u043e\u0434\u0438\u0442\u0441\u044f \u0432 \u0441\u043e\u0441\u0442\u043e\u044f\u043d\u0438\u0438 \u043f\u0430\u0443\u0437\u044b"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"pauses\" \u0441\u043e\u043e\u0431\u0449\u0430\u0435\u0442 \u0432\u0430\u043c, \u043f\u0440\u0438\u043e\u0441\u0442\u0430\u043d\u043e\u0432\u043b\u0435\u043d \u043b\u0438 \u0432 \u0434\u0430\u043d\u043d\u044b\u0439 \u043c\u043e\u043c\u0435\u043d\u0442 Baritone \u0441 \u043f\u043e\u043c\u043e\u0449\u044c\u044e \u043a\u043e\u043c\u0430\u043d\u0434\u044b pause."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> paused")};
    }

    private static /* synthetic */ void ntfClinit() {
        sZ_2.id_protected();
        sZ_2.id_throws();
        sZ_2.id_extends();
        sZ_2.id_finally();
    }

    private static void id_finally() {
        id_throws = new byte[]{4, 2, 3};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[0]];
        stringArray[sZ_2.id_private[4]] = id_case[4];
        stringArray[sZ_2.id_private[5]] = id_case[5];
        stringArray[sZ_2.id_throws[1]] = id_case[6];
        stringArray[sZ_2.id_throws[2]] = id_case[7];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_catch = new short[2];
    }

    @Override
    public boolean id_case() {
        return id_private[6];
    }

    @Override
    public String id_implements() {
        return id_case[3];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[1] = true;
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_private = blArray;
    }

    private void id_native() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_private[7]];
        }
    }
}

