/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Bu_1;
import celestial.C_class;
import celestial.Ps_1;
import celestial.Pv_1;
import celestial.Y;
import celestial.q_1;
import celestial.rAa_1;
import celestial.rYB;
import celestial.rhd_3;
import celestial.rnP_2;
import celestial.rns_3;
import celestial.rrfp_3;
import celestial.rrfq_3;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bc_1
extends Pv_1 {
    private static short[] id_break;
    private static byte[] id_byte;

    private void id_byte(rYB rYB2, rns_3 rns_32, rnP_2 rnP_22) {
        for (rhd_3 rhd_32 : rYB2.id_continue()) {
            if (rhd_32 == ((Ps_1)this.id_class[id_break[9]]).id_catch()) continue;
            rAa_1 rAa_12 = rns_32.id_break(rhd_32.i(), rnP_22);
            Float f = Float.valueOf(rAa_12.id_break());
            rhd_32.id_implements[Bc_1.id_break[10]] = f;
        }
    }

    public Bc_1(C_class c_class) {
        super(c_class);
    }

    static {
        Bc_1.ntfClinit();
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0x2CE19C72;
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x988B82DE71C94D17L;
    }

    private static void id_class() {
        short[] sArray = new short[11];
        sArray[1] = 1;
        sArray[2] = 1;
        sArray[4] = 1;
        sArray[5] = 1;
        sArray[6] = 24;
        sArray[7] = 1;
        sArray[8] = 24;
        sArray[9] = 1;
        sArray[10] = 24;
        id_break = sArray;
    }

    private void id_class(rYB rYB2, rns_3 rns_32, rnP_2 rnP_22) {
        for (rhd_3 rhd_32 : rYB2.id_continue()) {
            if (rhd_32 == ((Ps_1)this.id_class[id_break[5]]).id_catch()) continue;
            rAa_1 rAa_12 = rns_32.id_break(rhd_32.i(), rnP_22);
            Float f = Float.valueOf(rAa_12.id_break());
            rhd_32.id_implements[Bc_1.id_break[6]] = f;
        }
    }

    @Override
    public void id_class(q_1 q_12) {
        if (q_12.id_class() == (Y)((Object)Y.staticFields22c81230f53b33f2a682b4198db24cc4[id_break[0]])) {
            if ((rrfq_3)((Object)rrfp_3.id_class[id_break[1]]) == null) {
                return;
            }
            rYB rYB2 = ((Ps_1)this.id_class[id_break[2]]).id_case();
            rns_3 rns_32 = rYB2.id_package();
            switch (((int[])Bu_1.id_class[id_break[3]])[((rrfq_3)((Object)rrfp_3.id_class[id_break[4]])).ordinal()]) {
                case 1: {
                    rnP_2 rnP_22 = rns_32.id_class(id_byte[0]);
                    if (rnP_22 == null) break;
                    this.id_break(rYB2, rns_32, rnP_22);
                    break;
                }
                case 2: {
                    rnP_2 rnP_23 = rns_32.id_class(id_byte[1]);
                    if (rnP_23 == null) break;
                    this.id_class(rYB2, rns_32, rnP_23);
                    break;
                }
                case 3: {
                    rnP_2 rnP_24 = rns_32.id_class(id_byte[2]);
                    if (rnP_24 == null) break;
                    this.id_byte(rYB2, rns_32, rnP_24);
                }
            }
        }
    }

    private static void id_break() {
        id_byte = new byte[]{2, 2, 2};
    }

    private void id_break(rYB rYB2, rns_3 rns_32, rnP_2 rnP_22) {
        for (rhd_3 rhd_32 : rYB2.id_continue()) {
            if (rhd_32 == ((Ps_1)this.id_class[id_break[7]]).id_catch() || rhd_32.Pp()) continue;
            rAa_1 rAa_12 = rns_32.id_break(rhd_32.i(), rnP_22);
            Float f = Float.valueOf(rAa_12.id_break());
            rhd_32.id_implements[Bc_1.id_break[8]] = f;
        }
    }

    public static String id_break(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{70, 19, -50, 48, 76, -42, 113, 1}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }

    private static /* synthetic */ void ntfClinit() {
        Bc_1.id_class();
        Bc_1.id_break();
    }
}

