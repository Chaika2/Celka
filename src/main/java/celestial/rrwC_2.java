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

public class rrwC_2
extends rrwp_3 {
    private static boolean[] id_extends;
    private static String[] id_native;
    private static short[] id_volatile;
    private static int[] id_final;
    private static byte[] id_package;

    public rrwC_2() {
        super(id_native[0], id_native[1], id_final[0], id_native[2]);
        this.id_class(LocalDateTime.of((int)id_volatile[0], id_extends[0], (int)id_package[0], (int)id_package[1], (int)id_package[2], (int)id_package[3]));
    }

    static {
        rrwC_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEBDF57FD3C21453BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAB005F9E;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{110, 115, 119, -48, -74, 33, 113, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwC_2.id_volatile();
        rrwC_2.id_final();
        rrwC_2.id_extends();
        rrwC_2.id_native();
        rrwC_2.id_case();
    }

    private static void id_extends() {
        id_volatile = new short[]{2025};
    }

    private static void id_case() {
        id_final = new int[]{-1766445383};
    }

    private static void id_final() {
        id_native = new String[]{new String("Infinity HVH"), new String("cel.infinityhvh.com"), new String("Favorites")};
    }

    private static void id_volatile() {
        id_extends = new boolean[]{true};
    }

    private static void id_native() {
        id_package = new byte[]{31, 11, 59, 59};
    }
}

