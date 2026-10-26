/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrmY_2;
import celestial.rrqQ_2;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrma_3
implements rruq_1 {
    private static short[] id_class;

    public rrma_3(rrmY_2 rrmY_22) {
    }

    static {
        rrma_3.id_class();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-13, -50, -95, 27, -76, 85, -65, 58}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrqQ_2)rrqQ_2.staticFieldsaf585ffa18e23930a314cd0048f74bf2[id_class[0]]).id_class();
    }

    private static void id_class() {
        id_class = new short[1];
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xAA63F5D4;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xFC1F37D599749793L;
    }
}

