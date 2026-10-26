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

public class rrwn_3
extends rrwp_3 {
    private static String[] id_extends;
    private static byte[] id_native;

    public rrwn_3() {
        super(id_extends[0], id_extends[1], id_native[0], id_extends[2]);
    }

    static {
        rrwn_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD23A13FC3958EA0DL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDEB0E49F;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{68, -77, -115, 26, -116, 27, 80, 49}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        rrwn_3.id_extends();
        rrwn_3.id_case();
    }

    private static void id_extends() {
        id_extends = new String[]{new String("HolyWorld"), new String("mc.holyworld.ru"), new String("Most Popular")};
    }

    private static void id_case() {
        id_native = new byte[]{-1};
    }
}

