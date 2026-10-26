/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.k_1;
import celestial.rn_3;
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

public class sD_2
extends C_try {
    private static String[] id_break;
    private static byte[] id_throws;
    private static short[] id_case;
    private static boolean[] id_catch;

    public sD_2(C_case c_case) {
        String[] stringArray = new String[id_catch[0]];
        stringArray[sD_2.id_catch[1]] = id_break[0];
        super(c_case, stringArray);
    }

    static {
        sD_2.ntfClinit();
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_catch[2]);
        rr_3 rr_32 = ((C_case)this.id_class[id_case[0]]).id_goto();
        rz_3 rz_32 = rr_32.id_protected().orElse(null);
        if (rz_32 == null) {
            throw new k_1(id_break[1]);
        }
        Object[] objectArray = new Object[id_throws[0]];
        objectArray[sD_2.id_catch[3]] = rz_32.getClass().getTypeName();
        objectArray[sD_2.id_catch[4]] = rz_32.id_case();
        objectArray[sD_2.id_throws[1]] = rz_32.id_catch();
        objectArray[sD_2.id_throws[2]] = rz_32.id_break();
        objectArray[sD_2.id_throws[3]] = rr_32.id_break().map(rn_3::toString).orElse(id_break[3]);
        this.id_case(String.format(id_break[2], objectArray));
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB3964755FFB32833L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x6DB21E46;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-25, 115, 5, 20, -112, -91, -32, 127}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[4] = true;
        blArray[6] = true;
        id_catch = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        sD_2.id_throws();
        sD_2.id_protected();
        sD_2.id_finally();
        sD_2.id_extends();
    }

    private static void id_finally() {
        id_case = new short[1];
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[4]];
        stringArray[sD_2.id_catch[5]] = id_break[5];
        stringArray[sD_2.id_catch[6]] = id_break[6];
        stringArray[sD_2.id_throws[5]] = id_break[7];
        stringArray[sD_2.id_throws[6]] = id_break[8];
        stringArray[sD_2.id_throws[7]] = id_break[9];
        stringArray[sD_2.id_throws[8]] = id_break[10];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_throws = new byte[]{5, 2, 3, 4, 6, 2, 3, 4, 5};
    }

    @Override
    public String id_implements() {
        return id_break[4];
    }

    private static void id_protected() {
        id_break = new String[]{new String("proc"), new String("No process in control"), new String("Class: %s\nPriority: %f\nTemporary: %b\nDisplay name: %s\nLast command: %s"), new String("None"), new String("View process state information"), new String("The proc command provides miscellaneous information about the process currently controlling Baritone."), new String(""), new String("You are not expected to understand this if you aren't familiar with how Baritone works."), new String(""), new String("Usage:"), new String("> proc - View process information, if present")};
    }
}

