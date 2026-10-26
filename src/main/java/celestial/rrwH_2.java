/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrwp_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrwH_2
extends rrwp_3 {
    private static byte[] id_extends;
    private static String[] id_native;

    public rrwH_2() {
        super(id_native[0], id_native[1], id_extends[0], id_native[2]);
    }

    static {
        rrwH_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCDB0B114467AFB0CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8918469C;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{106, 75, 49, -107, -52, 12, 11, -47}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwH_2.id_extends();
        rrwH_2.id_case();
    }

    private static void id_extends() {
        id_native = new String[]{new String("ReallyWorld"), new String("mc.reallyworld.ru"), new String("Most Popular")};
    }

    private static void id_case() {
        id_extends = new byte[]{-1};
    }
}

