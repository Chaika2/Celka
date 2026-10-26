/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.Ja_1;
import celestial.gm_3;
import celestial.rS_2;
import celestial.rU_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Eb_1
extends C_try {
    private static String[] id_break;
    private static byte[] id_throws;
    private static short[] id_case;
    private static boolean[] id_catch;

    public Eb_1(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[Eb_1.id_catch[0]] = id_break[0];
        stringArray[Eb_1.id_catch[1]] = id_break[1];
        super(c_case, stringArray);
    }

    static {
        Eb_1.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        int n;
        rU_2 rU_22 = ((C_case)this.id_class[id_case[0]]).id_throw().id_volatile();
        int n2 = ((C_case)this.id_class[id_case[1]]).id_throw().id_case().id_short();
        int n3 = ((C_case)this.id_class[id_case[2]]).id_throw().id_case().id_try();
        if (rU_22.c_() > n2 && ((gm_3)Eb_1.b_.id_class[id_case[3]]).id_byte(rU_22.id_class()).id_break() instanceof Ja_1) {
            this.id_case(id_break[2]);
            return;
        }
        for (int i = n = Math.max(rU_22.c_(), n2); i < n3; ++i) {
            rU_2 rU_23 = new rU_2(rU_22.b_(), i, rU_22.d_());
            if (((gm_3)Eb_1.b_.id_class[id_case[4]]).id_byte(rU_23).id_break() instanceof Ja_1 || rU_23.c_() <= rU_22.c_()) continue;
            rS_2 rS_22 = new rS_2(rU_23.id_class());
            Object[] objectArray = new Object[id_catch[2]];
            objectArray[Eb_1.id_catch[3]] = ((Object)rS_22).toString();
            this.id_case(String.format(id_break[3], objectArray));
            ((C_case)this.id_class[id_case[5]]).id_import().id_break(rS_22);
            return;
        }
        this.id_case(id_break[4]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x16B86C8B;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB9440AFBC7468873L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-27, -43, 37, 12, 105, 103, -35, 124}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        id_break = new String[]{new String("surface"), new String("top"), new String("\u0412\u044b \u0443\u0436\u0435 \u043d\u0430 \u043f\u043e\u0432\u0435\u0440\u0445\u043d\u043e\u0441\u0442\u0438"), new String("\u0418\u0434\u0435\u043c \u043a: %s"), new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \u043f\u043e\u0432\u0435\u0440\u0445\u043d\u043e\u0441\u0442\u044c"), new String("Used to get out of caves, mines, ..."), new String("The surface/top command tells Baritone to head towards the closest surface-like area."), new String(""), new String("This can be the surface or the highest available air space, depending on circumstances."), new String(""), new String("Usage:"), new String("> surface - Used to get out of caves, mines, ..."), new String("> top - Used to get out of caves, mines, ...")};
    }

    private static /* synthetic */ void ntfClinit() {
        Eb_1.id_extends();
        Eb_1.id_throws();
        Eb_1.id_protected();
        Eb_1.id_finally();
    }

    private static void id_finally() {
        id_throws = new byte[]{2, 7, 2, 3, 4, 5, 6};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[1]];
        stringArray[Eb_1.id_catch[4]] = id_break[6];
        stringArray[Eb_1.id_catch[5]] = id_break[7];
        stringArray[Eb_1.id_throws[2]] = id_break[8];
        stringArray[Eb_1.id_throws[3]] = id_break[9];
        stringArray[Eb_1.id_throws[4]] = id_break[10];
        stringArray[Eb_1.id_throws[5]] = id_break[11];
        stringArray[Eb_1.id_throws[6]] = id_break[12];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[2] = true;
        blArray[5] = true;
        blArray[6] = true;
        id_catch = blArray;
    }

    @Override
    public boolean id_case() {
        return id_catch[6];
    }

    @Override
    public String id_implements() {
        return id_break[5];
    }

    private static void id_protected() {
        short[] sArray = new short[6];
        sArray[3] = 56;
        sArray[4] = 56;
        id_case = sArray;
    }
}

