/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrch_3;
import celestial.rrfG_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcO_2
implements rrcT_2<rrfG_2> {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;

    private static void id_byte() {
        id_byte = new boolean[]{true};
    }

    public rrcO_2(rrfG_2 rrfG_22) {
        this.id_break();
        rrfG_2 rrfG_23 = rrfG_22;
        this.id_class[rrcO_2.id_break[1]] = rrfG_23;
    }

    static {
        rrcO_2.ntfClinit();
    }

    @Override
    public rrfI_2<rrfG_2> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrch_3(this, rrNw_12);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x1B1F84CE037D0BF9L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x89FCB9B5;
    }

    public rrfG_2 id_class() {
        return (rrfG_2)this.id_class[id_break[0]];
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{84, -97, -70, 125, -58, 24, -25, 124}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrcO_2.id_byte();
        rrcO_2.id_protected();
    }

    private static void id_protected() {
        id_break = new short[2];
    }
}

