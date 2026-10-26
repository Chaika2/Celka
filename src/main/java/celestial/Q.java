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

public class Q
extends J {
    private static boolean[] id_class;
    private static String[] id_break;

    public Q(int n) {
        Object[] objectArray = new Object[id_class[0]];
        objectArray[Q.id_class[1]] = n;
        super(String.format(id_break[0], objectArray));
    }

    static {
        Q.ntfClinit();
    }

    private static void id_class() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_class = blArray;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x6CB134B7ECA2582CL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xD92DE18;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{29, 77, -102, 54, -92, -96, 3, 114}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new String[]{new String("\u041d\u0435\u0434\u043e\u0441\u0442\u0430\u0442\u043e\u0447\u043d\u043e \u0430\u0440\u0433\u0443\u043c\u0435\u043d\u0442\u043e\u0432 (\u043c\u0438\u043d\u0438\u043c\u0443\u043c %d)")};
    }

    private static /* synthetic */ void ntfClinit() {
        Q.id_class();
        Q.id_break();
    }
}

