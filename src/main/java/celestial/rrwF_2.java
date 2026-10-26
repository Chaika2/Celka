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

public class rrwF_2
extends rrwp_3 {
    private static String[] id_extends;
    private static int[] id_native;
    private static byte[] id_volatile;
    private static short[] id_final;
    private static boolean[] id_package;

    public rrwF_2() {
        super(id_extends[0], id_extends[1], id_native[0], id_extends[2]);
        this.id_class(LocalDateTime.of((int)id_final[0], id_package[0], (int)id_volatile[0], (int)id_volatile[1], (int)id_volatile[2], (int)id_volatile[3]));
    }

    static {
        rrwF_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCC29A92F0C68DF0EL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8F808CA3;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-31, 24, -128, 27, -56, -87, -116, -51}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwF_2.id_final();
        rrwF_2.id_volatile();
        rrwF_2.id_case();
        rrwF_2.id_native();
        rrwF_2.id_extends();
    }

    private static void id_extends() {
        id_native = new int[]{-61424};
    }

    private static void id_case() {
        id_final = new short[]{2025};
    }

    private static void id_final() {
        id_package = new boolean[]{true};
    }

    private static void id_volatile() {
        id_extends = new String[]{new String("Bravo HVH"), new String("celestial.bravohvh.fun"), new String("Favorites")};
    }

    private static void id_native() {
        id_volatile = new byte[]{31, 11, 59, 59};
    }
}

