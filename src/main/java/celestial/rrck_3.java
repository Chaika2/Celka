/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrcW_2;
import celestial.rrfI_2;
import celestial.rrfh_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrck_3
implements rrcT_2<rrfh_3> {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private static void id_byte() {
        id_break = new boolean[]{true};
    }

    public rrck_3(rrfh_3 rrfh_32) {
        this.id_protected();
        rrfh_3 rrfh_33 = rrfh_32;
        this.id_class[rrck_3.id_byte[1]] = rrfh_33;
    }

    static {
        rrck_3.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x462D4584;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xCAC7FF8E73D4C09AL;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-39, 91, -85, 91, 38, -16, -16, -28}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrfh_3 id_class() {
        return (rrfh_3)((Object)this.id_class[id_byte[0]]);
    }

    @Override
    public rrfI_2<rrfh_3> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcW_2(this, rrNw_12);
    }

    private static void id_break() {
        id_byte = new short[2];
    }

    private static /* synthetic */ void ntfClinit() {
        rrck_3.id_byte();
        rrck_3.id_break();
    }

    private void id_protected() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }
}

