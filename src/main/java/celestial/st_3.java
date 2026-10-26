/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.J;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class st_3
extends J {
    private static String[] id_class;

    public st_3() {
        super(id_class[0]);
    }

    static {
        st_3.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x588210DE;
    }

    private static void id_class() {
        id_class = new String[]{new String("\u041d\u0435\u0442 \u0432\u0430\u043b\u0438\u0434\u043d\u044b\u0445 \u0441\u0443\u0449\u0435\u0441\u0442\u0432 \u0432 \u0440\u0430\u0434\u0438\u0443\u0441\u0435!")};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{37, -37, -43, -109, 35, -59, -13, 95}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x377F1FB45F078D65L;
    }
}

