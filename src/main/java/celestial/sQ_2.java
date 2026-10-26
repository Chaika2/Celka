/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_final;
import celestial.C_static;
import celestial.C_try;
import celestial.k_1;
import celestial.rr_3;
import celestial.rz_3;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sQ_2
extends C_try {
    private static boolean[] id_break;
    private static String[] id_throws;
    private static byte[] id_case;
    private static double[] id_catch;
    private static short[] id_private;

    public sQ_2(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[sQ_2.id_break[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        sQ_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x446A2ACE1B0C6930L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBF61561;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_break[2]);
        rr_3 rr_32 = ((C_case)this.id_class[id_private[0]]).id_goto();
        rz_3 rz_32 = rr_32.id_protected().orElse(null);
        if (rz_32 == null) {
            throw new k_1(id_throws[1]);
        }
        C_final c_final = ((C_case)this.id_class[id_private[1]]).id_this();
        double d = c_final.id_extends().orElse(id_catch[0]);
        double d2 = c_final.id_class().orElse(id_catch[1]);
        Object[] objectArray = new Object[id_case[0]];
        objectArray[sQ_2.id_break[3]] = d / id_catch[2];
        objectArray[sQ_2.id_break[4]] = d;
        objectArray[sQ_2.id_case[1]] = d2 / id_catch[3];
        objectArray[sQ_2.id_case[2]] = d2;
        this.id_case(String.format(id_throws[2], objectArray));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{69, -15, 42, 74, -61, -23, -51, -21}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        id_throws = new String[]{new String("eta"), new String("No process in control"), new String("Next segment: %.1fs (%.0f ticks)\nGoal: %.1fs (%.0f ticks)"), new String("View the current ETA"), new String("The ETA command provides information about the estimated time until the next segment."), new String("and the goal"), new String(""), new String("Be aware that the ETA to your goal is really unprecise"), new String(""), new String("Usage:"), new String("> eta - View ETA, if present")};
    }

    private static /* synthetic */ void ntfClinit() {
        sQ_2.id_extends();
        sQ_2.id_throws();
        sQ_2.id_protected();
        sQ_2.id_native();
        sQ_2.id_finally();
    }

    private static void id_finally() {
        id_case = new byte[]{4, 2, 3, 7, 2, 3, 4, 5, 6};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[3]];
        stringArray[sQ_2.id_break[5]] = id_throws[4];
        stringArray[sQ_2.id_break[6]] = id_throws[5];
        stringArray[sQ_2.id_case[4]] = id_throws[6];
        stringArray[sQ_2.id_case[5]] = id_throws[7];
        stringArray[sQ_2.id_case[6]] = id_throws[8];
        stringArray[sQ_2.id_case[7]] = id_throws[9];
        stringArray[sQ_2.id_case[8]] = id_throws[10];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    @Override
    public String id_implements() {
        return id_throws[3];
    }

    private static void id_protected() {
        id_private = new short[2];
    }

    private static void id_native() {
        id_catch = new double[]{Double.NaN, Double.NaN, 20.0, 20.0};
    }
}

