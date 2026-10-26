/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrcs_3;
import celestial.rrfI_2;
import celestial.rrfs_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcS_2
implements rrcT_2<rrfs_3> {
    public Object[] id_class;
    private static boolean[] id_break;
    private static short[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    public rrcS_2(rrfs_3 rrfs_32) {
        this.id_byte();
        rrfs_3 rrfs_33 = rrfs_32;
        this.id_class[rrcS_2.id_byte[1]] = rrfs_33;
    }

    static {
        rrcS_2.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB998A16A;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xD467845DE629C865L;
    }

    public rrfs_3 id_class() {
        return (rrfs_3)((Object)this.id_class[id_byte[0]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{121, -121, -64, 32, 124, 55, -61, -59}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    @Override
    public rrfI_2<rrfs_3> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcs_3(this, rrNw_12);
    }

    private static void id_break() {
        id_break = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcS_2.id_break();
        rrcS_2.id_protected();
    }

    private static void id_protected() {
        id_byte = new short[2];
    }
}

