/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.C_class;
import celestial.PP;
import celestial.Pv_1;
import celestial.rgP_2;
import celestial.rrLu_1;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.ruS_2;
import celestial.rud_3;
import celestial.rvV_2;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class Bm_1
extends Pv_1
implements PP {
    private static String[] id_break;
    private static short[] id_throws;

    public Bm_1(C_class c_class) {
        super(c_class);
    }

    static {
        Bm_1.ntfClinit();
    }

    @Override
    public void id_class(rrLu_1 rrLu_12) {
        ruS_2<?> ruS_22 = rrLu_12.id_class();
        if (ruS_22 instanceof rvV_2) {
            rvV_2 rvV_22 = (rvV_2)ruS_22;
            if ((rrfq_3)((Object)rrfp_3.id_class[id_throws[0]]) != null) {
                return;
            }
            rgP_2 rgP_22 = rvV_22.id_break();
            if (rgP_22 == null) {
                return;
            }
            String string = rgP_22.id_byte();
            if (string.isEmpty()) {
                return;
            }
            Bm_1.id_break(string);
        }
    }

    private static long id_class(long l) {
        return Long.rotateLeft(l, 32) ^ 0x664528C8C7195397L;
    }

    private static int id_class(int n) {
        return Integer.rotateLeft(n, 16) ^ 0xB5F2A12E;
    }

    private static void id_class() {
        id_break = new String[]{new String("funtime.su"), new String("reallyworld"), new String("holyworld"), new String("sunrise"), new String("eztime.su"), new String("metahvh")};
    }

    private static void id_break() {
        short[] sArray = new short[7];
        sArray[0] = 1;
        sArray[1] = 2;
        sArray[3] = 6;
        sArray[4] = 7;
        sArray[5] = 8;
        sArray[6] = 9;
        id_throws = sArray;
    }

    public static void id_break(String string) {
        rud_3 rud_32;
        string = string.toLowerCase();
        Aq_1 aq_1 = b_.id_void();
        rud_3 rud_33 = rud_32 = aq_1 == null ? null : aq_1.id_class();
        if (string.contains(id_break[0])) {
            rrfp_3.id_break((rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[1]]), rud_32);
        } else if (string.contains(id_break[1])) {
            rrfp_3.id_break((rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[2]]), rud_32);
        } else if (string.contains(id_break[2])) {
            rrfp_3.id_break((rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[3]]), rud_32);
        } else if (string.contains(id_break[3])) {
            rrfp_3.id_break((rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[4]]), rud_32);
        } else if (string.contains(id_break[4])) {
            rrfp_3.id_break((rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[5]]), rud_32);
        } else if (string.contains(id_break[5])) {
            rrfp_3.id_break((rrfq_3)((Object)rrfq_3.staticFields8f8c034c8eef39ccbbc33e665d937d16[id_throws[6]]), rud_32);
        }
    }

    private static /* synthetic */ void ntfClinit() {
        Bm_1.id_class();
        Bm_1.id_break();
    }

    public static String id_private(String string) throws Exception {
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeySpec secretKeySpec = new SecretKeySpec(new byte[]{-23, -39, 18, 15, -97, 30, 0, 94}, "DES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[8]);
        cipher.init(2, (Key)secretKeySpec, ivParameterSpec);
        return new String(cipher.doFinal(string.getBytes(StandardCharsets.ISO_8859_1)), StandardCharsets.UTF_8);
    }
}

