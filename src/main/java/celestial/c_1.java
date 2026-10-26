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

public class c_1
extends J {
    private static String[] id_class;
    private static boolean[] id_break;

    public c_1(int n) {
        Object[] objectArray = new Object[id_break[0]];
        objectArray[c_1.id_break[1]] = n;
        super(String.format(id_class[0], objectArray));
    }

    static {
        c_1.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-58, -88, -37, 42, 13, -14, 60, 126}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x95F8276D;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_break = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x50EC5FC5C5AE6E41L;
    }

    private static void id_break() {
        id_class = new String[]{new String("\u0421\u043b\u0438\u0448\u043a\u043e\u043c \u043c\u043d\u043e\u0433\u043e \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442\u043e\u0432 (\u043c\u0430\u043a\u0441\u0438\u043c\u0443\u043c %d)")};
    }

    private static /* synthetic */ void ntfClinit() {
        c_1.id_class();
        c_1.id_break();
    }
}

