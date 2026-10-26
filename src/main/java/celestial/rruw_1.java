/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrNh_1;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rruw_1
implements rruq_1 {
    private static short[] id_class;

    static {
        rruw_1.id_class();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCD0B6FF4FA67C411L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB07EC57F;
    }

    private static void id_class() {
        id_class = new short[1];
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrNh_1)((Object)rrNh_1.staticFieldsfb3637209df43f25b1ac5845136e2aa5[id_class[0]])).id_native();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{52, 80, 35, -98, 89, 100, -9, 17}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

