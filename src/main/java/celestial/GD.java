/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EZ;
import celestial.Go_1;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class GD
extends EZ {
    private static double[] id_byte;

    private static void id_byte() {
        id_byte = new double[]{1.0};
    }

    public GD(Go_1 go_1, boolean bl) {
        super(Go_1.id_class(go_1), bl);
    }

    static {
        GD.id_byte();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2F509D82;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xACECAE1E4F1800CAL;
    }

    @Override
    public double id_break(int n, int n2, int n3, xc_3 xc_32) {
        return id_byte[0];
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-2, 69, -116, -79, 103, 110, -61, 67}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

