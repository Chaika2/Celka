/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.Ps_1;
import celestial.So_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sa_3
extends C_try {
    private static String[] id_break;
    private static byte[] id_throws;
    private static boolean[] id_case;
    private static short[] id_catch;

    public sa_3(C_case c_case) {
        String[] stringArray = new String[id_throws[0]];
        stringArray[sa_3.id_case[0]] = id_break[0];
        stringArray[sa_3.id_case[1]] = id_break[1];
        super(c_case, stringArray);
    }

    static {
        sa_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x463F2E43EDA188F0L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x76A98018;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_case[2]);
        Object[] objectArray = new Object[id_case[3]];
        objectArray[sa_3.id_case[4]] = ((So_1)So_1.staticFields4d15df505e473c14b11aa564ea558cfe[id_catch[0]]).id_class((Ps_1)this.id_class[id_catch[1]]);
        this.id_case(String.format(id_break[2], objectArray));
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{50, 122, -110, 56, 126, -47, -21, 105}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        id_throws = new byte[]{2, 4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        sa_3.id_extends();
        sa_3.id_finally();
        sa_3.id_protected();
        sa_3.id_throws();
    }

    private static void id_finally() {
        id_break = new String[]{new String("repack"), new String("rescan"), new String("Queued %d chunks for repacking"), new String("Re-cache chunks"), new String("Repack chunks around you. This basically re-caches them."), new String(""), new String("Usage:"), new String("> repack - Repack chunks.")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[1]];
        stringArray[sa_3.id_case[5]] = id_break[4];
        stringArray[sa_3.id_case[6]] = id_break[5];
        stringArray[sa_3.id_throws[2]] = id_break[6];
        stringArray[sa_3.id_throws[3]] = id_break[7];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        boolean[] blArray = new boolean[7];
        blArray[1] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_case = blArray;
    }

    @Override
    public String id_implements() {
        return id_break[3];
    }

    private static void id_protected() {
        short[] sArray = new short[2];
        sArray[1] = 1;
        id_catch = sArray;
    }
}

