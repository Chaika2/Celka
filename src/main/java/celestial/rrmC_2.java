/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_static;
import celestial.rrqM_2;
import celestial.rruq_1;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrmC_2
implements rruq_1 {
    private static short[] id_class;

    static {
        rrmC_2.id_class();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x7FDB547D;
    }

    @Override
    public void id_class(C_static c_static) {
        ((rrqM_2)rrqM_2.staticFields360b36d126ee3c45b942181ce786df43[id_class[0]]).id_break();
    }

    private static void id_class() {
        id_class = new short[1];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xB16387B837BE640CL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{96, 110, -55, 19, 21, 105, -12, -41}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

