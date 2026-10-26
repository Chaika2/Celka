/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrje_3;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmV_2
implements rruq_1 {
    private static short[] id_class;

    static {
        rrmV_2.id_class();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-55, 14, 102, -76, 30, -53, -101, 119}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_class() {
        id_class = new short[1];
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        ((rrje_3)((Object)rrje_3.staticFields67a5399629443d9d93e54c2de6d74063[id_class[0]])).id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x9FD7FDA2;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBCB1CFE85B8B97FL;
    }
}

