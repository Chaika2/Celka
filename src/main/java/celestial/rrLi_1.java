/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrAP;
import celestial.rrAr_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract sealed class rrLi_1
permits rrAr_1, rrAP {
    private static short[] id_class;

    static {
        rrLi_1.id_break();
    }

    public static rrAr_1 id_class(int n) {
        return new rrAr_1(n);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-11, -125, -76, 125, 42, 45, -128, -31}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public static rrAP id_class() {
        return (rrAP)rrAP.id_class[id_class[0]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x356FE864727ECC46L;
    }

    private static void id_break() {
        id_class = new short[1];
    }

    private static int id_break(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x441DB7FE;
    }
}

