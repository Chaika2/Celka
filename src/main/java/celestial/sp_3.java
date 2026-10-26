/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_double;
import celestial.C_static;
import celestial.C_try;
import celestial.aI_2;
import celestial.an_3;
import celestial.rVL;
import celestial.rqO_2;
import celestial.sT_2;
import celestial.sq_3;
import celestial.st_3;
import celestial.v_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sp_3
extends C_try {
    private static short[] id_break;
    private static byte[] id_throws;
    private static String[] id_case;
    private static boolean[] id_catch;

    public sp_3(C_case c_case) {
        String[] stringArray = new String[id_catch[0]];
        stringArray[sp_3.id_catch[1]] = id_case[0];
        super(c_case, stringArray);
    }

    static {
        sp_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x51F6B40A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x4A7F3B7F21C376C5L;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        sq_3 sq_32;
        c_static.id_private(id_catch[2]);
        ArrayList<an_3> arrayList = new ArrayList<an_3>();
        ArrayList<aI_2> arrayList2 = new ArrayList<aI_2>();
        if (c_static.id_case()) {
            sq_32 = c_static.id_implements(sq_3.class);
            ((C_case)this.id_class[id_break[0]]).id_public().id_break((Predicate)sq_32.fields7c97b86bc96f32548c9e3133b384faa8[id_break[1]]);
        } else {
            c_static.id_private(id_throws[0]);
            sq_32 = null;
            sT_2 sT_22 = c_static.id_implements(sT_2.class);
            while (c_static.id_final()) {
                Object t = c_static.id_break((C_double)sT_22.fieldsd035b37d0ef43a14a807173dd90a9560[id_break[2]]);
                if (t instanceof aI_2) {
                    arrayList2.add((aI_2)t);
                    continue;
                }
                if (t == null) continue;
                arrayList.add((an_3)t);
            }
            ((C_case)this.id_class[id_break[3]]).id_public().id_break(arrayList2.isEmpty() ? arrayList::contains : an_32 -> arrayList2.stream().anyMatch(aI_22 -> an_32.BC().equals(aI_22)));
        }
        if (sq_32 != null) {
            Object[] objectArray = new Object[id_catch[3]];
            objectArray[sp_3.id_catch[4]] = sq_32.name().toLowerCase(Locale.US);
            this.id_case(String.format(id_case[1], objectArray));
        } else if (arrayList2.isEmpty()) {
            if (arrayList.isEmpty()) {
                throw new st_3();
            }
            this.id_case(id_case[2]);
            arrayList.stream().map(an_3::toString).forEach(this::id_case);
        } else {
            this.id_case(id_case[3]);
            arrayList2.stream().map(rVL.id_transient::id_break).map(Objects::requireNonNull).map(rqO_2::toString).forEach(this::id_case);
        }
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) throws x_1 {
        C_double c_double;
        if (c_static.id_case()) {
            return new v_1().id_break(sq_3.class).id_break(sT_2.class).id_class(c_static.id_extends()).id_protected();
        }
        try {
            c_double = (C_double)c_static.id_implements(sT_2.class).fieldsd035b37d0ef43a14a807173dd90a9560[id_break[4]];
        }
        catch (NullPointerException nullPointerException) {
            return Stream.empty();
        }
        while (c_static.id_break(id_throws[1])) {
            if (c_static.id_byte(c_double) == null) {
                return Stream.empty();
            }
            c_static.id_throws();
        }
        return c_static.id_class(c_double);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{37, -78, -69, -108, -87, 75, -10, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[8];
        blArray[0] = true;
        blArray[2] = true;
        blArray[3] = true;
        blArray[6] = true;
        blArray[7] = true;
        id_catch = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sp_3.id_throws();
        sp_3.id_finally();
        sp_3.id_protected();
        sp_3.id_extends();
    }

    private static void id_finally() {
        id_case = new String[]{new String("follow"), new String("\u041f\u0440\u0435\u0441\u043b\u0435\u0434\u0443\u0435\u043c \u0432\u0441\u0435\u0445 %s"), new String("\u041f\u0440\u0435\u0441\u043b\u0435\u0434\u0443\u0435\u043c \u044d\u0442\u0438\u0445 \u0441\u0443\u0449\u0435\u0441\u0442\u0432:"), new String("\u041f\u0440\u0438\u0441\u043b\u0435\u0434\u0443\u0435\u043c \u044d\u0442\u043e\u0442 \u0442\u0438\u043f \u0441\u0443\u0449\u0435\u0441\u0442\u0432:"), new String("\u041f\u0440\u0435\u0441\u043b\u0435\u0434\u043e\u0432\u0430\u0442\u044c \u043a\u0430\u043a\u043e\u0435 \u043b\u0438\u0431\u043e \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u043e"), new String("\u041a\u043e\u043c\u0430\u043d\u0434\u0430 \"follow\" \u0443\u043a\u0430\u0437\u044b\u0432\u0430\u0435\u0442 Baritone \u0441\u043b\u0435\u0434\u043e\u0432\u0430\u0442\u044c \u0437\u0430 \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043d\u044b\u043c\u0438 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0430\u043c\u0438."), new String(""), new String("\u0418\u0441\u043f\u043e\u043b\u044c\u0437\u0432\u0430\u043d\u0438\u0435:"), new String("> follow entities - \u043f\u0440\u0438\u0441\u043b\u0435\u0434\u0443\u0435\u0442 \u0432\u0441\u0435\u0445 \u0441\u0443\u0449\u0435\u0432\u0441\u0442\u0432."), new String("> follow entity <entity1> <entity2> <...> - \u0421\u043b\u0435\u0434\u043e\u0432\u0430\u0442\u044c \u043e\u043f\u0440\u0435\u0434\u0435\u043b\u0435\u043d\u043d\u044b\u043c \u0441\u0443\u0449\u043d\u043e\u0441\u0442\u044f\u043c (\u043d\u0430\u043f\u0440\u0438\u043c\u0435\u0440, \"\u0441\u043a\u0435\u043b\u0435\u0442\", \"\u043b\u043e\u0448\u0430\u0434\u044c\" \u0438 \u0442.\u0434.)"), new String("> follow players - \u043f\u0440\u0438\u0441\u043b\u0443\u0434\u0435\u0442 \u0438\u0433\u0440\u043e\u043a\u043e\u0432"), new String("> follow player <username1> <username2> <...> - \u043f\u0440\u0438\u0441\u043b\u0435\u0434\u0443\u0435\u0442 \u043e\u043f\u0440\u0435\u0434\u043b\u0435\u043d\u043d\u044b\u0445 \u0438\u0433\u0440\u043e\u043a\u043e\u0432")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[2]];
        stringArray[sp_3.id_catch[5]] = id_case[5];
        stringArray[sp_3.id_catch[6]] = id_case[6];
        stringArray[sp_3.id_throws[3]] = id_case[7];
        stringArray[sp_3.id_throws[4]] = id_case[8];
        stringArray[sp_3.id_throws[5]] = id_case[9];
        stringArray[sp_3.id_throws[6]] = id_case[10];
        stringArray[sp_3.id_throws[7]] = id_case[11];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_throws = new byte[]{2, 2, 7, 2, 3, 4, 5, 6};
    }

    @Override
    public boolean id_case() {
        return id_catch[7];
    }

    @Override
    public String id_implements() {
        return id_case[4];
    }

    private static void id_protected() {
        id_break = new short[5];
    }
}

