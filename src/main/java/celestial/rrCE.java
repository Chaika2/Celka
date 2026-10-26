/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrTT;
import celestial.rrTy_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCE
extends rrTy_1 {
    private static double[] id_protected;

    @Override
    public double id_byte() {
        return id_protected[0];
    }

    public rrCE(rrTT rrTT2) {
        super(rrTT2);
    }

    static {
        rrCE.id_case();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x98412C1CFDC89217L;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-6, 21, 28, -4, -5, 48, -93, -15}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x299E02C2;
    }

    private static void id_case() {
        id_protected = new double[]{0.12676056};
    }
}

