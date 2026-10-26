/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sR_2
extends C_try {
    private static boolean[] id_break;
    private static byte[] id_throws;
    private static String[] id_case;
    private static short[] id_catch;

    public sR_2(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[sR_2.id_break[1]] = id_case[0];
        super(c_case, stringArray);
    }

    static {
        sR_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD6D6D156;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        int n = id_break[2];
        if (c_static.id_final()) {
            c_static.id_class(id_break[3]);
            if (c_static.id_extends(Integer.class)) {
                n = c_static.id_catch(Integer.class) - id_break[4];
            }
        }
        try {
            ((C_case)this.id_class[id_catch[0]]).r().id_class(n);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            this.id_case(id_case[1]);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x510BFDCD03DA1456L;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-117, -85, -36, -37, -114, 102, -30, 45}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_catch = new short[1];
    }

    private static /* synthetic */ void ntfClinit() {
        sR_2.id_protected();
        sR_2.id_extends();
        sR_2.id_throws();
        sR_2.id_finally();
    }

    private static void id_finally() {
        id_throws = new byte[]{5, 2, 3, 4};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[0]];
        stringArray[sR_2.id_break[5]] = id_case[3];
        stringArray[sR_2.id_break[6]] = id_case[4];
        stringArray[sR_2.id_throws[1]] = id_case[5];
        stringArray[sR_2.id_throws[2]] = id_case[6];
        stringArray[sR_2.id_throws[3]] = id_case[7];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_case = new String[]{new String("litematica"), new String("\u041f\u043e\u0436\u0430\u043b\u0443\u0439\u0441\u0442\u0430, \u043f\u0440\u0435\u0434\u043e\u0441\u0442\u0430\u0432\u044c\u0442\u0435 \u0434\u0435\u0439\u0441\u0442\u0432\u0438\u0442\u0435\u043b\u044c\u043d\u044b\u0439 \u0438\u043d\u0434\u0435\u043a\u0441"), new String("\u041f\u043e\u0441\u0442\u0440\u043e\u0435\u043d\u0438\u0435 \u0437\u0430\u0433\u0440\u0443\u0436\u0435\u043d\u043d\u043e\u0439 \u0441\u0445\u0435\u043c\u044b"), new String("\u041f\u043e\u0441\u0442\u0440\u043e\u0439\u0442\u0435 \u0441\u0445\u0435\u043c\u0443, \u043e\u0442\u043a\u0440\u044b\u0442\u0443\u044e \u0432 \u043d\u0430\u0441\u0442\u043e\u044f\u0449\u0435\u0435 \u0432\u0440\u0435\u043c\u044f \u0432 Litematica"), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u043d\u0438\u0435:"), new String("> litematica"), new String("> litematica <#>")};
    }

    @Override
    public boolean id_case() {
        return id_break[7];
    }

    @Override
    public String id_implements() {
        return id_case[2];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_break = blArray;
    }
}

