/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrwp_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.time.LocalDateTime;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwy_3
extends rrwp_3 {
    private static short[] id_extends;
    private static String[] id_native;
    private static int[] id_volatile;
    private static byte[] id_final;
    private static boolean[] id_package;

    public rrwy_3() {
        super(id_native[0], id_native[1], id_volatile[0], id_native[2]);
        this.id_class(LocalDateTime.of((int)id_extends[0], id_package[0], (int)id_final[0], (int)id_final[1], (int)id_final[2], (int)id_final[3]));
    }

    static {
        rrwy_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x973C42650945ADD8L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xA006191;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-68, 3, -69, -13, 71, 77, 98, -7}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwy_3.id_final();
        rrwy_3.id_volatile();
        rrwy_3.id_extends();
        rrwy_3.id_case();
        rrwy_3.id_native();
    }

    private static void id_extends() {
        id_extends = new short[]{2025};
    }

    private static void id_case() {
        id_final = new byte[]{31, 11, 59, 59};
    }

    private static void id_final() {
        id_package = new boolean[]{true};
    }

    private static void id_volatile() {
        id_native = new String[]{new String("Snow HVH"), new String("mc.snowhvh.ru"), new String("Favorites")};
    }

    private static void id_native() {
        id_volatile = new int[]{-8553091};
    }
}

