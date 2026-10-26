/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcM_2;
import celestial.rrcT_2;
import celestial.rrfE_2;
import celestial.rrfI_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcb_3
implements rrcT_2<rrfE_2> {
    private static boolean[] id_break;
    private static short[] id_byte;
    public Object[] id_class;

    private static void id_byte() {
        id_break = new boolean[]{true};
    }

    public rrcb_3(rrfE_2 rrfE_22) {
        this.id_break();
        rrfE_2 rrfE_23 = rrfE_22;
        this.id_class[rrcb_3.id_byte[1]] = rrfE_23;
    }

    static {
        rrcb_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x8442D0CBCF3A5A6DL;
    }

    @Override
    public rrfI_2<rrfE_2> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcM_2(this, rrNw_12);
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xEAAB6182;
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-70, 105, 19, -4, -57, 112, -64, -120}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    public rrfE_2 id_class() {
        return (rrfE_2)((Object)this.id_class[id_byte[0]]);
    }

    private void id_break() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_break[0]];
        }
    }

    private static /* synthetic */ void ntfClinit() {
        rrcb_3.id_byte();
        rrcb_3.id_protected();
    }

    private static void id_protected() {
        id_byte = new short[2];
    }
}

