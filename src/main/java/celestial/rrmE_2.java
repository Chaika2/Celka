/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrZW;
import celestial.rrZk_1;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmE_2
implements rruq_1 {
    private static short[] id_class;
    private static boolean[] id_break;

    static {
        rrmE_2.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x581E57C0FAAAC5DFL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x50CE296D;
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        ((rrZW)rrZW.staticFieldsf09fd5e6d24c37ccb4408917cb188133[id_class[0]]).id_class(new rrZk_1(c_static.id_extends()), id_break[0]);
    }

    private static void id_class() {
        id_break = new boolean[]{true};
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{30, -69, -92, -66, 47, 93, -62, -109}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_class = new short[1];
    }

    private static /* synthetic */ void ntfClinit() {
        rrmE_2.id_class();
        rrmE_2.id_break();
    }
}

