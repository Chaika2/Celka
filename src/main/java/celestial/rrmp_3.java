/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrqX_2;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmp_3
implements rruq_1 {
    private static short[] id_class;
    private static boolean[] id_break;

    static {
        rrmp_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x82EE3944;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-49, -8, 46, -38, -1, 104, 52, -92}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1AF377D807F74B8BL;
    }

    private static void id_class() {
        id_class = new short[1];
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrqX_2)rrqX_2.staticFields25cb0eac93bd35f999c477f8effd8890[id_class[0]]).id_class(id_break[0]);
    }

    private static void id_break() {
        id_break = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrmp_3.id_break();
        rrmp_3.id_class();
    }
}

