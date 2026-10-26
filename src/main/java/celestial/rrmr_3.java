/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rruq_1;
import celestial.rryd_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmr_3
implements rruq_1 {
    private static boolean[] id_class;
    private static short[] id_break;

    static {
        rrmr_3.ntfClinit();
    }

    private static void id_class() {
        id_break = new short[1];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{72, 16, -18, -110, 101, -72, -60, 8}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x8A8CBBCC;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rryd_1)rryd_1.staticFields78f62b0b61073300aba99f31bcf5126e[id_break[0]]).id_class(id_class[0]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCDA1D3293D82C6CL;
    }

    private static void id_break() {
        id_class = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmr_3.id_break();
        rrmr_3.id_class();
    }
}

