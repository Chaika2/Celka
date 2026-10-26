/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrwp_3;
import celestial.util.ColorHelper;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwL_2
extends rrwp_3 {
    private static String[] id_extends;
    private static byte[] id_native;
    private static short[] id_volatile;
    private static float[] id_final;
    private static int[] id_package;

    public rrwL_2() {
        super(id_extends[0], id_extends[1], ColorHelper.id_class(id_package[0], id_final[0]), id_extends[2]);
        this.id_class(LocalDateTime.of((int)id_volatile[0], id_native[0], (int)id_native[1], (int)id_native[2], (int)id_native[3], (int)id_native[4]));
    }

    static {
        rrwL_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDAE1A431;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xDEC47DFC30BA9458L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-54, 80, 118, 16, -23, -44, -82, -74}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwL_2.id_native();
        rrwL_2.id_volatile();
        rrwL_2.id_final();
        rrwL_2.id_extends();
        rrwL_2.id_case();
    }

    private static void id_extends() {
        id_native = new byte[]{7, 27, 11, 59, 59};
    }

    private static void id_case() {
        id_package = new int[]{-13172970};
    }

    private static void id_final() {
        id_volatile = new short[]{2025};
    }

    private static void id_volatile() {
        id_final = new float[]{0.7f};
    }

    private static void id_native() {
        id_extends = new String[]{new String("Clear World"), new String("online8.clearworld.pw"), new String("Favorites")};
    }
}

