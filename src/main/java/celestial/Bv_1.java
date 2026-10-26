/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rrAp_1;
import celestial.rrLu_1;
import celestial.rrfH_2;
import celestial.rvQ_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bv_1
extends Pv_1 {
    private static boolean[] id_break;
    private static short[] id_byte;
    private static byte[] id_protected;

    private static void id_byte() {
        id_byte = new short[]{1};
    }

    public Bv_1(C_class c_class) {
        super(c_class);
    }

    static {
        Bv_1.ntfClinit();
    }

    @Override
    public void id_class(rrLu_1 rrLu_12) {
        rvQ_2 rvQ_22;
        super.id_class(rrLu_12);
        Object object = rrLu_12.id_class();
        if (object instanceof rvQ_2 && (rvQ_22 = (rvQ_2)object).id_break() == id_protected[0] && (object = rvQ_22.id_class(((Ps_1)this.id_class[id_byte[0]]).id_case())) instanceof rhd_3) {
            rdn_3[] rdn_3Array;
            rhd_3 rhd_32 = (rhd_3)object;
            rdn_3[] rdn_3Array2 = rdn_3Array = rrfH_2.id_class(rhd_32);
            int n = rdn_3Array2.length;
            for (int i = id_break[0]; i < n; ++i) {
                rdn_3 rdn_32 = rdn_3Array2[i];
                if (rdn_32.id_break() != rdy_3.kL) continue;
                rrAp_1.id_class(rhd_32, rdn_32);
                break;
            }
        }
    }

    private static void id_class() {
        id_protected = new byte[]{35};
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x156D5362;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x3426F73F20D66D08L;
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{23, -8, -79, 90, -100, 64, 94, 84}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static void id_break() {
        id_break = new boolean[1];
    }

    private static /* synthetic */ void ntfClinit() {
        Bv_1.id_break();
        Bv_1.id_byte();
        Bv_1.id_class();
    }
}

