/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.annotation.Nullable;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQv_1 {
    private static String[] id_break;
    @Nullable
    public String id_class = id_break[0];

    static {
        rrQv_1.id_class();
    }

    private static void id_class() {
        id_break = new String[]{new String("")};
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1BF7855E5880AE02L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{44, 125, 43, -32, -83, -91, 45, -112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x98944344;
    }
}

