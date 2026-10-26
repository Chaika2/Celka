/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lu_1;
import celestial.cm_3;
import celestial.rgF_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.vm_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrQY
extends Lu_1 {
    private static boolean[] id_class;

    public rrQY(cm_3 cm_32, int n2, int n3, int n4, int n5, rgP_2 rgP_22) {
        super(cm_32, n2, n3, n4, n5, rgP_22);
        this.id_class((String string, Integer n) -> new rgN_2((String)string).id_class(rgF_2.OBFUSCATED).id_catch());
    }

    static {
        rrQY.id_goto();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x9C82A571CA604E99L;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (!this.id_int || vm_3.id_catch(n) || vm_3.id_throws(n)) {
            return id_class[0];
        }
        return super.id_class(n, n2, n3);
    }

    private static void id_goto() {
        id_class = new boolean[1];
    }

    private static int id_new(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xECA99F0C;
    }

    public static String id_protected(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{92, -20, 4, -128, 35, -66, -124, -18}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

