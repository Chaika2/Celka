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

public class rrwl_3
extends rrwp_3 {
    private static byte[] id_extends;
    private static String[] id_native;
    private static int[] id_volatile;
    private static short[] id_final;

    public rrwl_3() {
        super(id_native[0], id_native[1], id_volatile[0], id_native[2]);
        this.id_class(LocalDateTime.of((int)id_final[0], id_extends[0], (int)id_extends[1], (int)id_extends[2], (int)id_extends[3], (int)id_extends[4]));
    }

    static {
        rrwl_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xEF5F418726841CFL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xC7D5E363;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-21, 85, 34, 15, -65, -72, -121, 37}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwl_3.id_extends();
        rrwl_3.id_native();
        rrwl_3.id_volatile();
        rrwl_3.id_case();
    }

    private static void id_extends() {
        id_native = new String[]{new String("Meta HVH"), new String("cel.MetaHVH.space"), new String("Favorites")};
    }

    private static void id_case() {
        id_volatile = new int[]{-1777296385};
    }

    private static void id_volatile() {
        id_extends = new byte[]{8, 13, 11, 59, 59};
    }

    private static void id_native() {
        id_final = new short[]{2025};
    }
}

