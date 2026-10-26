/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_throws;
import celestial.rrfu_3;
import celestial.util.MinecraftAccessor;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrfZ_2
implements MinecraftAccessor {
    private static String[] id_class;

    public static boolean id_byte() {
        return C_throws.id_byte().id_synchronized().id_class();
    }

    static {
        rrfZ_2.id_throws();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCE07102F4B41CCF6L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4E92FDE8;
    }

    public static void id_class() {
        rrfu_3.id_byte(id_class[1]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{87, 110, -48, 29, -102, 24, -38, 113}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static void id_break() {
        if (rrfZ_2.id_protected()) {
            C_throws.id_class().id_break().id_switch().id_class(id_class[0]);
        }
    }

    private static void id_throws() {
        id_class = new String[]{new String("cancel"), new String("\u0412\u0430\u0441 \u043f\u043e\u043f\u044b\u0442\u0430\u043b\u0438\u0441\u044c \u043a\u0440\u0430\u0448\u043d\u0443\u0442\u044c, \u043d\u043e AntiCrash \u043f\u0440\u0435\u0434\u043e\u0442\u0432\u0440\u0430\u0442\u0438\u043b \u044d\u0442\u043e")};
    }

    public static boolean id_protected() {
        return C_throws.id_class().id_catch();
    }
}

