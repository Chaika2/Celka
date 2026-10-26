/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_class;
import celestial.C_static;
import celestial.C_throws;
import celestial.C_try;
import celestial.PI;
import celestial.PK;
import celestial.Pf_1;
import celestial.Pg_1;
import celestial.Po_1;
import celestial.SF;
import celestial.Sl_1;
import celestial.cb_3;
import celestial.rrfZ_2;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrfu_3;
import celestial.rrfv_3;
import celestial.rrmZ_2;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmm_3
extends C_try {
    private static short[] id_break;
    private static byte[] id_throws;
    private static String[] id_case;
    private static boolean[] id_catch;

    public rrmm_3(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[rrmm_3.id_catch[0]] = id_case[0];
        stringArray[rrmm_3.id_catch[1]] = id_case[1];
        super(c_case, stringArray);
    }

    static {
        rrmm_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x10061080A4A7CB80L;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        try {
            rrfq_3 rrfq_32 = (rrfq_3)((Object)rrfp_3.id_class[id_break[0]]);
            if (rrfq_32 != null) {
                switch (((int[])rrmZ_2.id_class[id_break[1]])[rrfq_32.ordinal()]) {
                    case 1: {
                        this.id_class(string, c_static.id_break(id_catch[2]) ? this.id_private(c_static.id_extends()) : id_case[2]);
                        return;
                    }
                    case 2: 
                    case 3: {
                        this.id_implements(string);
                        return;
                    }
                    case 4: {
                        this.id_break(string, c_static.id_break(id_catch[3]) ? c_static.id_extends() : id_case[3]);
                        return;
                    }
                }
            }
            rrfu_3.id_byte(id_case[4]);
        }
        catch (Exception exception) {
            rrfu_3.id_byte(id_case[5]);
            exception.printStackTrace();
        }
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x83D50014;
    }

    private void id_class(String string, String string2) {
        boolean bl;
        String string3 = C_throws.id_byte().id_final().id_throws();
        boolean bl2 = bl = string2.isEmpty() || string2.isBlank() ? id_catch[6] : id_catch[7];
        if (string3.isEmpty() && bl) {
            rrfu_3.id_byte(id_case[13]);
            return;
        }
        if (rrfv_3.id_class((String)C_throws.id_break().id_protected.id_class[id_break[8]] + string, rrfZ_2.id_byte())) {
            return;
        }
        ((cb_3)rrmm_3.b_.id_class[id_break[9]]).id_case(id_case[14]);
        C_throws.id_byte().id_default().id_class(new SF(bl ? string3 : string2.toLowerCase()));
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        if ((rrfq_3)((Object)rrfp_3.id_class[id_break[12]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[13]]) && c_static.id_case()) {
            return new v_1().id_break(((Map)Pg_1.id_throws[id_break[14]]).keySet().stream()).id_class(c_static.id_extends()).id_protected();
        }
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, 85, -76, 0, -22, 61, -11, -126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break(String string, String string2) {
        PK pK;
        boolean bl;
        C_class c_class = C_throws.id_byte();
        Po_1 po_1 = c_class.P().id_break();
        boolean bl2 = bl = string2.isEmpty() || string2.isBlank() ? id_catch[4] : id_catch[5];
        if (bl) {
            if (po_1 == null) {
                rrfu_3.id_byte(id_case[9]);
                return;
            }
            pK = po_1.id_break();
            if (pK == (PK)((Object)PK.staticFields6a264fee257833ddb403077ab7e90d84[id_break[5]])) {
                rrfu_3.id_byte(id_case[10]);
                return;
            }
        } else {
            po_1 = Po_1.id_break(string2);
            if (po_1 == null) {
                rrfu_3.id_byte(id_case[11]);
                return;
            }
            pK = po_1.id_break();
        }
        if (rrfv_3.id_class((String)C_throws.id_break().id_protected.id_class[id_break[6]] + string, rrfZ_2.id_byte())) {
            return;
        }
        ((cb_3)rrmm_3.b_.id_class[id_break[7]]).id_case(id_case[12]);
        c_class.id_default().id_class(new SF(pK.id_class() + po_1.id_class()));
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[13];
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[4] = true;
        blArray[6] = true;
        blArray[10] = true;
        blArray[12] = true;
        id_catch = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrmm_3.id_throws();
        rrmm_3.id_finally();
        rrmm_3.id_protected();
        rrmm_3.id_extends();
    }

    private static void id_finally() {
        id_case = new String[]{new String("rct"), new String("reconnect"), new String(""), new String(""), new String("\u042d\u0442\u0430 \u043a\u043e\u043c\u0430\u043d\u0434\u0430 \u043d\u0435 \u0440\u0430\u0431\u043e\u0442\u0430\u0435\u0442 \u043d\u0430 \u044d\u0442\u043e\u043c \u0441\u0435\u0440\u0432\u0435\u0440\u0435"), new String("\u041e\u0448\u0438\u0431\u043a\u0430! \u041d\u0435 \u043f\u043e\u0434\u043a\u043b\u044e\u0447\u0430\u0439\u0442\u0435\u0441\u044c \u0442\u0430\u043a \u0447\u0430\u0441\u0442\u043e, \u043b\u0438\u0431\u043e \u0443\u043a\u0430\u0436\u0438\u0442\u0435 \u0441\u0435\u0440\u0432\u0435\u0440 \u0432 .rct"), new String("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0442\u0435\u043a\u0443\u0449\u0438\u0439 \u0440\u0435\u0436\u0438\u043c"), new String("\u0412\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u044d\u0442\u0443 \u043a\u043e\u043c\u0430\u043d\u0434\u0443 \u0432 \u0445\u0430\u0431\u0435"), new String("/hub"), new String("\u041d\u0435 \u043d\u0430\u0439\u0434\u0435\u043d \u0442\u0435\u043a\u0443\u0449\u0438\u0439 \u0440\u0435\u0436\u0438\u043c"), new String("\u0412\u044b \u043d\u0435 \u043c\u043e\u0436\u0435\u0442\u0435 \u0438\u0441\u043f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u044c \u044d\u0442\u0443 \u043a\u043e\u043c\u0430\u043d\u0434\u0443 \u0432 \u043b\u043e\u0431\u0431\u0438"), new String("\u041d\u0435\u0432\u0435\u0440\u043d\u043e \u0443\u043a\u0430\u0437\u0430\u043d \u0440\u0435\u0436\u0438\u043c"), new String("/hub"), new String("\u041d\u0435\u0442\u0443 \u0441\u043a\u043e\u0440\u0431\u043e\u0440\u0434\u0430, \u043b\u0438\u0431\u043e \u0443\u043a\u0430\u0436\u0438\u0442\u0435 \u043f\u0440\u0430\u0432\u0438\u043b\u044c\u043d\u044b\u0439 \u0440\u0435\u0436\u0438\u043c"), new String("/hub"), new String("mega"), new String("\u043c\u0435\u0433\u0430"), new String("\\D"), new String(""), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \u0434\u043b\u044f \u0430\u0432\u0442\u043e\u043c\u0430\u0442\u0438\u0447\u0435\u0441\u043a\u043e\u0433\u043e \u043f\u0435\u0440\u0435\u0437\u0430\u0445\u043e\u0434\u0430 \u043d\u0430 \u0440\u0435\u0436\u0438\u043c (\u0430\u043d\u0430\u0440\u0445\u0438\u044f, \u0433\u0440\u0438\u0444 \u0438 \u0442.\u0434)"), new String("> %s%s - \u043f\u0435\u0440\u0435\u0437\u0430\u0439\u0442\u0438 \u043d\u0430 \u0442\u0435\u043a\u0443\u0449\u0438\u0439 \u0440\u0435\u0436\u0438\u043c"), new String("> %s%s <\u0440\u0435\u0436\u0438\u043c> - \u043f\u0435\u0440\u0435\u0437\u0430\u0439\u0442\u0438 \u043d\u0430 \u043d\u0443\u0436\u043d\u044b\u0439 \u0440\u0435\u0436\u0438\u043c")};
    }

    @Override
    public List<String> id_catch() {
        String string = this.id_break().get(id_catch[8]);
        String string2 = (String)C_class.id_instanceof().id_protected.id_class[id_break[15]];
        Object[] objectArray = new Object[id_throws[1]];
        objectArray[rrmm_3.id_catch[9]] = string2;
        objectArray[rrmm_3.id_catch[10]] = string;
        Object[] objectArray2 = new Object[id_throws[2]];
        objectArray2[rrmm_3.id_catch[11]] = string2;
        objectArray2[rrmm_3.id_catch[12]] = string;
        return List.of(id_case[20].formatted(objectArray), id_case[21].formatted(objectArray2));
    }

    private static void id_extends() {
        id_throws = new byte[]{2, 2, 2};
    }

    private void id_implements(String string) {
        C_class c_class = C_throws.id_byte();
        PI pI = c_class.id_native().id_protected();
        if (pI == null) {
            rrfu_3.id_byte(id_case[6]);
            return;
        }
        Pf_1 pf_1 = pI.id_class();
        if (pf_1 == (Pf_1)((Object)Pf_1.staticFieldsc81ab00368b8322fb29ceba592eaabc7[id_break[2]])) {
            rrfu_3.id_byte(id_case[7]);
            return;
        }
        if (rrfv_3.id_class((String)C_throws.id_break().id_protected.id_class[id_break[3]] + string, rrfZ_2.id_byte())) {
            return;
        }
        ((cb_3)rrmm_3.b_.id_class[id_break[4]]).id_case(id_case[8]);
        c_class.id_default().id_class(new Sl_1(pf_1.id_class() + pI.id_break()));
    }

    @Override
    public String id_implements() {
        return id_case[19];
    }

    private static void id_protected() {
        short[] sArray = new short[16];
        sArray[0] = 1;
        sArray[2] = 2;
        sArray[4] = 57;
        sArray[5] = 6;
        sArray[7] = 57;
        sArray[9] = 57;
        sArray[10] = 1;
        sArray[12] = 1;
        sArray[13] = 6;
        sArray[14] = 1;
        id_break = sArray;
    }

    private String id_private(String string) {
        if ((rrfq_3)((Object)rrfp_3.id_class[id_break[10]]) == (rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_break[11]]) && (string.equalsIgnoreCase(id_case[15]) || string.equalsIgnoreCase(id_case[16]))) {
            return string;
        }
        return string.replaceAll(id_case[17], id_case[18]);
    }
}

