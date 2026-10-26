/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfl_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrCp_1 {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            this.id_class = new Object[1];
        }
    }

    public rrCp_1() {
        this.id_byte();
    }

    static {
        rrCp_1.ntfClinit();
    }

    public rfl_3 id_class() {
        return (rfl_3)this.id_class[id_break[0]];
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1FD07D879A3863F1L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x98228555;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-72, -41, 25, -57, 78, 47, 22, -42}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public void id_class(rfl_3 rfl_32) {
        rfl_3 rfl_33 = rfl_32;
        this.id_class[rrCp_1.id_break[1]] = rfl_33;
    }

    private static void id_break() {
        id_byte = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrCp_1.id_break();
        rrCp_1.id_protected();
    }

    private static void id_protected() {
        id_break = new short[2];
    }
}

