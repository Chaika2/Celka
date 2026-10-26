/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.Hh_1;
import celestial.PP;
import celestial.cb_3;
import celestial.h_1;
import celestial.rjU_2;
import celestial.rrfp_3;
import celestial.rrjD_2;
import celestial.rrje_3;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmj_3
implements rruq_1 {
    private static boolean[] id_class;
    private static float[] id_break;
    private static double[] id_byte;
    private static String[] id_protected;
    private static short[] id_throws;
    private static byte[] id_case;

    private static void id_byte() {
        id_byte = new double[2];
    }

    static {
        rrmj_3.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{55, -66, -34, -68, 79, -32, 19, 69}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAA802FB484459254L;
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        rjU_2 rjU_22 = ((Hh_1)PP.b_.id_class[id_throws[0]]).id_finally().id_new();
        if (rjU_22 == null) {
            return;
        }
        rjU_2 rjU_23 = rjU_22.id_class(id_byte[0], (double)(((cb_3)PP.b_.id_class[id_throws[1]]).Bx() / id_break[0]), id_byte[1]);
        String string = c_static.id_case() || c_static.id_case(id_case[0]) ? c_static.id_extends() : ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_throws[2]])).id_class(id_protected[0]);
        rjU_2 rjU_24 = c_static.id_final() ? (rjU_2)c_static.id_break((h_1)h_1.staticFieldse900d351c8b53997a0ceaa72eeab0b7d[id_throws[3]], rjU_23) : rjU_23;
        ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_throws[4]])).id_class(new rrjD_2(string, rjU_24, rrfp_3.id_throws()), id_class[0]);
    }

    private static void id_class() {
        id_class = new boolean[]{true};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x549C7268;
    }

    private static void id_break() {
        id_protected = new String[]{new String("Untitled")};
    }

    private static void id_throws() {
        short[] sArray = new short[5];
        sArray[0] = 16;
        sArray[1] = 57;
        id_throws = sArray;
    }

    private static /* synthetic */ void ntfClinit() {
        rrmj_3.id_class();
        rrmj_3.id_break();
        rrmj_3.id_throws();
        rrmj_3.id_byte();
        rrmj_3.id_case();
        rrmj_3.id_protected();
    }

    private static void id_case() {
        id_break = new float[]{2.0f};
    }

    private static void id_protected() {
        id_case = new byte[]{4};
    }
}

