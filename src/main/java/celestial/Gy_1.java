/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.rJ_2;
import celestial.rX_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Gy_1
extends rX_2 {
    private static short[] id_byte;

    public Gy_1(int n, int n2) {
        super(n, n2);
    }

    static {
        Gy_1.id_protected();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xED4CC6ED6B8A31C4L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x4326CBFA;
    }

    @Override
    public double id_class(int n, int n2, int n3) {
        return super.id_class(n, n2, n3) + rJ_2.id_class((Integer)C_class.id_instanceof().rP.id_class[id_byte[0]], n2);
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-48, -69, 67, 66, 100, -121, -85, -40}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_protected() {
        id_byte = new short[1];
    }
}

