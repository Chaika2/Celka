/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.Ps_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class si_3
extends C_try {
    private static short[] id_break;
    private static String[] id_throws;
    private static byte[] id_case;
    private static boolean[] id_catch;

    public si_3(C_case c_case) {
        String[] stringArray = new String[id_catch[0]];
        stringArray[si_3.id_catch[1]] = id_throws[0];
        super(c_case, stringArray);
    }

    static {
        si_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xE085B3CD6235297BL;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_catch[2]);
        ((Ps_1)this.id_class[id_break[0]]).id_package().id_break().id_class();
        this.id_case(id_throws[1]);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x3451FD84;
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{7, 106, -50, 36, -29, 104, 30, -125}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_break = new short[]{1};
    }

    private static /* synthetic */ void ntfClinit() {
        si_3.id_extends();
        si_3.id_protected();
        si_3.id_throws();
        si_3.id_finally();
    }

    private static void id_finally() {
        id_case = new byte[]{4, 2, 3};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_case[0]];
        stringArray[si_3.id_catch[3]] = id_throws[3];
        stringArray[si_3.id_catch[4]] = id_throws[4];
        stringArray[si_3.id_case[1]] = id_throws[5];
        stringArray[si_3.id_case[2]] = id_throws[6];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        id_catch = blArray;
    }

    @Override
    public String id_implements() {
        return id_throws[2];
    }

    private static void id_protected() {
        id_throws = new String[]{new String("saveall"), new String("Saved"), new String("Saves Baritone's cache for this world"), new String("The saveall command saves Baritone's world cache."), new String(""), new String("Usage:"), new String("> saveall")};
    }
}

