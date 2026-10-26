/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.k_1;
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

public class sm_3
extends C_try {
    public Object[] id_break;
    private static boolean[] id_throws;
    private static short[] id_case;
    private static String[] id_catch;
    private static byte[] id_private;

    public sm_3(sN_2 sN_22, C_case c_case, String[] stringArray, boolean ... blArray) {
        super(c_case, stringArray);
        this.id_finally();
        boolean[] blArray2 = blArray;
        this.id_break[sm_3.id_case[0]] = blArray2;
    }

    static {
        sm_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3576EEE6;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        this.id_finally();
        c_static.id_class(id_throws[0]);
        ((C_case)this.id_class[id_case[1]]).r().id_finally();
        if (!((boolean[])this.id_break[id_case[2]])[id_throws[1]]) {
            throw new k_1(id_catch[0]);
        }
        ((boolean[])this.id_break[sm_3.id_case[3]])[sm_3.id_throws[2]] = id_throws[3];
        this.id_case(id_catch[1]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x97E0E7A77E972F32L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{100, 105, 71, -42, 18, -53, -92, 91}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        id_case = new short[4];
    }

    private static /* synthetic */ void ntfClinit() {
        sm_3.id_extends();
        sm_3.id_native();
        sm_3.id_throws();
        sm_3.id_protected();
    }

    private void id_finally() {
        if (this.id_break == null) {
            Object[] objectArray = this.id_break = new Object[id_throws[7]];
        }
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_private[0]];
        stringArray[sm_3.id_throws[4]] = id_catch[3];
        stringArray[sm_3.id_throws[5]] = id_catch[4];
        stringArray[sm_3.id_private[1]] = id_catch[5];
        stringArray[sm_3.id_private[2]] = id_catch[6];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[8];
        blArray[5] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_throws = blArray;
    }

    @Override
    public boolean id_case() {
        return id_throws[6];
    }

    @Override
    public String id_implements() {
        return id_catch[2];
    }

    private static void id_protected() {
        id_private = new byte[]{4, 2, 3};
    }

    private static void id_native() {
        id_catch = new String[]{new String("\u041d\u0435 \u043d\u0430 \u043f\u0430\u0443\u0437\u0435"), new String("\u0412\u043e\u0437\u043e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u043e"), new String("\u0412\u043e\u0441\u0441\u0442\u0430\u043d\u0430\u0432\u043b\u0438\u0432\u0430\u0435\u0442 \u0431\u0430\u0440\u0438\u0442\u043e\u043d \u043f\u043e\u0441\u043b\u0435 \u043f\u0430\u0443\u0437\u044b"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"resume\" \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 Baritone \u0432\u043e\u0437\u043e\u0431\u043d\u043e\u0432\u0438\u0442\u044c \u0432\u0441\u0435, \u0447\u0442\u043e \u043e\u043d \u0434\u0435\u043b\u0430\u043b, \u043a\u043e\u0433\u0434\u0430 \u0432\u044b \u0432 \u043f\u043e\u0441\u043b\u0435\u0434\u043d\u0438\u0439 \u0440\u0430\u0437 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043b\u0438 \u043a\u043e\u043c\u0430\u043d\u0434\u0443 pause."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> resume")};
    }
}

