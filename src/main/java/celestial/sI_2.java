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

public class sI_2
extends C_try {
    private static String[] id_break;
    private static byte[] id_throws;
    private static boolean[] id_case;

    public sI_2(C_case c_case) {
        String[] stringArray = new String[id_case[0]];
        stringArray[sI_2.id_case[1]] = id_break[0];
        super(c_case, stringArray);
    }

    static {
        sI_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDE48A32D9D45EABCL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2CBBE93B;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_case[2]);
        System.gc();
        this.id_case(id_break[1]);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{93, -4, -54, -22, -66, -128, -1, -2}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_throws() {
        id_throws = new byte[]{4, 2, 3};
    }

    private static /* synthetic */ void ntfClinit() {
        sI_2.id_protected();
        sI_2.id_finally();
        sI_2.id_throws();
    }

    private static void id_finally() {
        id_break = new String[]{new String("gc"), new String("ok called System.gc()"), new String("Call System.gc()"), new String("Calls System.gc()."), new String(""), new String("Usage:"), new String("> gc")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[0]];
        stringArray[sI_2.id_case[3]] = id_break[3];
        stringArray[sI_2.id_case[4]] = id_break[4];
        stringArray[sI_2.id_throws[1]] = id_break[5];
        stringArray[sI_2.id_throws[2]] = id_break[6];
        return Arrays.asList(stringArray);
    }

    @Override
    public String id_implements() {
        return id_break[2];
    }

    private static void id_protected() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[4] = true;
        id_case = blArray;
    }
}

