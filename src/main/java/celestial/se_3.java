/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_case;
import celestial.C_static;
import celestial.C_try;
import celestial.Ps_1;
import celestial.Qw_1;
import celestial.rU_2;
import celestial.x_1;
import celestial.yX_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class se_3
extends C_try {
    private static boolean[] id_break;
    private static byte[] id_throws;
    private static short[] id_case;
    private static String[] id_catch;

    public se_3(C_case c_case) {
        String[] stringArray = new String[id_break[0]];
        stringArray[se_3.id_break[1]] = id_catch[0];
        super(c_case, stringArray);
    }

    static {
        se_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8485EFAF;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x21256D08B16143A1L;
    }

    @Override
    public void id_class(String string, C_static c_static) throws x_1 {
        c_static.id_class(id_break[2]);
        rU_2 rU_22 = ((Ps_1)this.id_class[id_case[0]]).id_volatile();
        int n = (((Qw_1)se_3.b_.id_class[se_3.id_case[1]]).id_break + id_break[3]) * id_throws[0];
        ((yX_2)se_3.b_.id_class[id_case[2]]).id_class((Integer)rU_22.id_break[id_case[3]] - n, id_break[4], (Integer)rU_22.id_break[id_case[4]] - n, (Integer)rU_22.id_break[id_case[5]] + n, id_case[6], (Integer)rU_22.id_break[id_case[7]] + n);
        this.id_case(id_catch[1]);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, 12, 24, 126, 115, -118, -87, 25}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public Stream<String> id_break(String string, C_static c_static) {
        return Stream.empty();
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[7];
        blArray[0] = true;
        blArray[3] = true;
        blArray[6] = true;
        id_break = blArray;
    }

    private static /* synthetic */ void ntfClinit() {
        se_3.id_throws();
        se_3.id_finally();
        se_3.id_protected();
        se_3.id_extends();
    }

    private static void id_finally() {
        id_catch = new String[]{new String("render"), new String("Done"), new String("Fix glitched chunks"), new String("The render command fixes glitched chunk rendering without having to reload all of them."), new String(""), new String("Usage:"), new String("> render")};
    }

    @Override
    public List<String> id_catch() {
        String[] stringArray = new String[id_throws[1]];
        stringArray[se_3.id_break[5]] = id_catch[3];
        stringArray[se_3.id_break[6]] = id_catch[4];
        stringArray[se_3.id_throws[2]] = id_catch[5];
        stringArray[se_3.id_throws[3]] = id_catch[6];
        return Arrays.asList(stringArray);
    }

    private static void id_extends() {
        id_throws = new byte[]{16, 4, 2, 3};
    }

    @Override
    public String id_implements() {
        return id_catch[2];
    }

    private static void id_protected() {
        short[] sArray = new short[8];
        sArray[0] = 1;
        sArray[1] = 20;
        sArray[2] = 8;
        sArray[4] = 2;
        sArray[6] = 255;
        sArray[7] = 2;
        id_case = sArray;
    }
}

