/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.u_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class z_1
extends u_1 {
    private static boolean[] id_class;
    private static String[] id_break;

    public z_1(Class<?> clazz) {
        Object[] objectArray = new Object[id_class[0]];
        objectArray[z_1.id_class[1]] = clazz.getSimpleName();
        super(String.format(id_break[0], objectArray));
    }

    static {
        z_1.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3FC534FDEA3A7A9FL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xE881A71B;
    }

    private static void id_class() {
        boolean[] blArray = new boolean[2];
        blArray[0] = true;
        id_class = blArray;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-24, -79, -14, -1, 10, -127, 48, -67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new String[]{new String("\u041d\u0435 \u0443\u0434\u0430\u043b\u043e\u0441\u044c \u043d\u0430\u0439\u0442\u0438 \u043e\u0431\u0440\u0430\u0431\u043e\u0442\u0447\u0438\u043a \u0434\u043b\u044f \u0442\u0438\u043f\u0430 %s")};
    }

    private static /* synthetic */ void ntfClinit() {
        z_1.id_class();
        z_1.id_break();
    }
}

