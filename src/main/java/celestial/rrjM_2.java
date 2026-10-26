/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrjM_2 {
    private static String[] id_break;
    public static Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        boolean[] blArray = new boolean[2];
        blArray[1] = true;
        id_byte = blArray;
    }

    static {
        rrjM_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xDEC80A87;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x47BCF4487DC1B925L;
    }

    private static void id_class() {
        Object[] objectArray = new Object[]{Pattern.compile(id_break[0], 0)};
        id_class = objectArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-101, 45, -26, 111, -82, -61, -58, -84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new String[]{new String("\\[\u2720] \u0412\u0442\u043e\u0440\u0436\u0435\u043d\u0438\u0435 \u0432 \u0440\u0435\u0433\u0438\u043e\u043d \u0438\u0433\u0440\u043e\u043a\u0430 (.+)")};
    }

    private static /* synthetic */ void ntfClinit() {
        rrjM_2.id_byte();
        rrjM_2.id_break();
        rrjM_2.id_class();
    }
}

