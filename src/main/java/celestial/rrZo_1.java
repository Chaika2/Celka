/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgF_2;
import celestial.rrtU_2;
import celestial.rrwr_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrZo_1
implements rrwr_3 {
    private static boolean[] id_class;

    static {
        rrZo_1.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE8C3669F;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x75A05E39F813FDDAL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{27, -91, 20, -108, -65, 92, 7, 111}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_class = new boolean[]{true};
    }

    @Override
    public rrtU_2 id_break(String string) {
        try {
            int n = Integer.parseInt(string);
            if (n < id_class[0]) {
                return rrtU_2.id_class(rgF_2.RED + "\u0421\u043b\u0438\u0448\u043a\u043e\u043c \u043c\u0430\u043b\u0435\u043d\u044c\u043a\u0430\u044f \u0446\u0435\u043d\u0430");
            }
        }
        catch (Exception exception) {
            return rrtU_2.id_class(rgF_2.RED + "\u0421\u043b\u0438\u0448\u043a\u043e\u043c \u0431\u043e\u043b\u044c\u0448\u0430\u044f \u0446\u0435\u043d\u0430");
        }
        return rrtU_2.id_class();
    }
}

