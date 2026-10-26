/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_import;
import celestial.C_interface;
import celestial.PP;
import celestial.m_1;
import celestial.rgF_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class u_1
extends RuntimeException
implements m_1 {
    private static String[] id_class;

    public u_1(Throwable throwable) {
        super(throwable);
    }

    public u_1(String string) {
        super(string);
    }

    static {
        u_1.id_class();
    }

    private static void id_class() {
        id_class = new String[]{new String("\u041f\u0440\u043e\u0438\u0437\u043e\u0448\u043b\u0430 \u043e\u0448\u0438\u0431\u043a\u0430, \u043e\u0431\u0440\u0430\u0442\u0438\u0442\u0435\u0441\u044c \u0432 \u0442\u0438\u043a\u0435\u0442 \u0447\u0442\u043e\u0431\u044b \u0440\u0435\u0448\u0438\u0442\u044c \u043f\u0440\u043e\u0431\u043b\u0435\u043c\u0443")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xAB5B97223B077695L;
    }

    @Override
    public void id_class(C_interface c_interface, List<C_import> list) {
        PP.a_.id_class(id_class[0], rgF_2.RED);
        this.printStackTrace();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x16EB3B70;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-17, 108, -40, 123, -45, -88, 111, -80}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

