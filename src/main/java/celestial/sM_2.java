/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.k_1;
import celestial.rF_2;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sM_2
extends C_try {
    private static short[] id_break;
    private static byte[] id_throws;
    private static boolean[] id_case;
    private static String[] id_catch;

    public sM_2(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[sM_2.id_case[1]] = id_catch[0];
        super(c_case, stringArray);
    }

    static {
        sM_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xF9437E8E45C240F3L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE96DBD96;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_case[2]);
        rF_2 rF_22 = ((C_case)this.id_class[id_break[0]]).id_super();
        if (!rF_22.id_byte()) {
            throw new k_1(id_catch[1]);
        }
        if (!rF_22.id_private()) {
            throw new k_1(id_catch[3]);
        }
        this.id_case(id_catch[2]);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-104, -37, 42, 117, 91, 124, -95, -87}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_throws = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        sM_2.id_protected();
        sM_2.id_finally();
        sM_2.id_extends();
        sM_2.id_throws();
    }

    private static void id_finally() {
        id_catch = new String[]{new String("blacklist"), new String("GetToBlockProcess is not currently active"), new String("Blacklisted closest instances"), new String("No known locations, unable to blacklist"), new String("Blacklist closest block"), new String("While going to a block this command blacklists the closest block so that Baritone won't attempt to get to it."), new String(""), new String("Usage:"), new String("> blacklist")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[0]];
        stringArray[sM_2.id_case[3]] = id_catch[5];
        stringArray[sM_2.id_case[4]] = id_catch[6];
        stringArray[sM_2.id_throws[1]] = id_catch[7];
        stringArray[sM_2.id_throws[2]] = id_catch[8];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_break = new short[1];
    }

    @Override
    public String id_implements() {
        return id_catch[4];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        id_case = blArray;
    }
}

