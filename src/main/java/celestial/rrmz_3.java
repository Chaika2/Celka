/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.ri_3;
import celestial.rrHE;
import celestial.rruq_1;
import celestial.x_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmz_3
implements rruq_1 {
    private static short[] id_class;
    private static boolean[] id_break;

    static {
        rrmz_3.ntfClinit();
    }

    private static void id_class() {
        id_class = new short[1];
    }

    @Override
    public void id_class(C_static c_static) throws x_1 {
        String string = c_static.id_extends();
        ((rrHE)rrHE.staticFieldsba1f59fc216a32d3a8f1aabb25cf0fd2[id_class[0]]).id_class(ri_3.id_class(string), string, id_break[0]);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB6213FE3D3C5650BL;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1CD94659;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-98, 76, 100, 75, -93, 81, -42, 49}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmz_3.id_break();
        rrmz_3.id_class();
    }
}

