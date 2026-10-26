/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcJ_2;
import celestial.rrcT_2;
import celestial.rrfI_2;
import celestial.rrfM_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcX_2
implements rrcT_2<rrfM_2> {
    private static boolean[] id_break;
    public Object[] id_class;
    private static short[] id_byte;

    private static void id_byte() {
        id_byte = new short[2];
    }

    public rrcX_2(rrfM_2 rrfM_22) {
        this.id_break();
        rrfM_2 rrfM_23 = rrfM_22;
        this.id_class[rrcX_2.id_byte[1]] = rrfM_23;
    }

    static {
        rrcX_2.ntfClinit();
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-125, -39, -1, 4, 13, -40, -61, -20}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8CAFEB449E783906L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x1D50913D;
    }

    @Override
    public rrfI_2<rrfM_2> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcJ_2(this, rrNw_12);
    }

    public rrfM_2 id_class() {
        return (rrfM_2)((Object)this.id_class[id_byte[0]]);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrcX_2.id_protected();
        rrcX_2.id_byte();
    }

    private static void id_protected() {
        id_break = new boolean[]{true};
    }
}

