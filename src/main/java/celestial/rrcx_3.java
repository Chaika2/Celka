/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrNd_1;
import celestial.rrNw_1;
import celestial.rrcT_2;
import celestial.rrcd_3;
import celestial.rrfI_2;
import celestial.rrfO_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class rrcx_3
implements rrcT_2<rrfO_2> {
    private static short[] id_break;
    public Object[] id_class;
    private static boolean[] id_byte;

    private void id_byte() {
        if (this.id_class == null) {
            Object[] objectArray = this.id_class = new Object[id_byte[0]];
        }
    }

    public rrcx_3(rrfO_2 rrfO_22) {
        this.id_byte();
        rrfO_2 rrfO_23 = rrfO_22;
        this.id_class[rrcx_3.id_break[1]] = rrfO_23;
    }

    static {
        rrcx_3.ntfClinit();
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0xBF0B756741885321L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x13A01436;
    }

    @Override
    public rrfI_2<rrfO_2> id_class(rrNd_1 rrNd_12, rrNw_1 rrNw_12) {
        return new rrcd_3(this, rrNw_12);
    }

    public rrfO_2 id_class() {
        return (rrfO_2)((Object)this.id_class[id_break[0]]);
    }

    public static String id_class(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-12, -121, -96, 103, 14, -51, 61, -66}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_byte = new boolean[]{true};
    }

    private static /* synthetic */ void ntfClinit() {
        rrcx_3.id_break();
        rrcx_3.id_protected();
    }

    private static void id_protected() {
        id_break = new short[2];
    }
}

