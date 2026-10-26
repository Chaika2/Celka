/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rI_2;
import celestial.rq_3;
import celestial.xc_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rj_3
extends rI_2 {
    private static boolean[] id_byte;

    public static String id_byte(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-20, -11, -62, 21, 21, 31, -37, 112}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rj_3(rq_3 rq_32) {
        super(rq_32);
    }

    static {
        rj_3.id_throws();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1350005B23025B88L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xBFC01FD;
    }

    @Override
    public boolean id_break(int n, int n2, int n3, xc_3 xc_32) {
        return n == 0 || n2 == 0 || n3 == 0 || n == this.id_break() - id_byte[0] || n2 == this.id_class() - id_byte[1] || n3 == this.id_byte() - id_byte[2] ? id_byte[3] : id_byte[4];
    }

    private static void id_throws() {
        boolean[] blArray = new boolean[5];
        blArray[0] = true;
        blArray[1] = true;
        blArray[2] = true;
        blArray[3] = true;
        id_byte = blArray;
    }
}

