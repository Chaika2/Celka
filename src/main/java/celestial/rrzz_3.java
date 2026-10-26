/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHD;
import celestial.rHH;
import celestial.rHO;
import celestial.rHb_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rpA_2;
import celestial.rrWq_1;
import celestial.rrxr_3;
import celestial.ryO_2;

public class rrzz_3 {
    public static rgP_2 id_byte(ryO_2 ryO_22) {
        if (ryO_22 instanceof rpA_2) {
            return ((rpA_2)((Object)ryO_22)).rD();
        }
        return ryO_22 instanceof rHO ? (rgP_2)rrxr_3.id_class(ryO_22, rrxr_3.GN) : null;
    }

    public static boolean id_class(ryO_2 ryO_22, rgP_2 rgP_22) {
        if (ryO_22 instanceof rHD) {
            ((rHD)ryO_22).id_class(rgP_22);
            return true;
        }
        if (ryO_22 instanceof rHb_1) {
            ((rHb_1)ryO_22).id_class(rgP_22);
            return true;
        }
        if (ryO_22 instanceof rHH) {
            ((rHH)ryO_22).id_class(rgP_22);
            return true;
        }
        if (ryO_22 instanceof rHO) {
            ((rHO)ryO_22).id_class(rgP_22);
            return true;
        }
        return false;
    }

    public static rgP_2 id_class(rfH_2 rfH_22) {
        ryO_2 ryO_22 = rrWq_1.id_class(rfH_22);
        return ryO_22 == null ? null : rrzz_3.id_byte(ryO_22);
    }

    public static String id_class(ryO_2 ryO_22) {
        if (!(ryO_22 instanceof rpA_2)) {
            return null;
        }
        rpA_2 rpA_22 = (rpA_2)((Object)ryO_22);
        rrzz_3.id_break(ryO_22);
        return !rpA_22.Bk() ? null : rpA_22.rD().id_break();
    }

    public static String id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        ryO_2 ryO_22 = rRq_12.id_class(rfH_22);
        return rrzz_3.id_class(ryO_22);
    }

    public static void id_break(ryO_2 ryO_22) {
        rfH_2 rfH_22 = ryO_22.id_char();
        rgP_2 rgP_22 = rrzz_3.id_byte(ryO_22);
        if (rgP_22 == null) {
            rgP_2 rgP_23 = rrzz_3.id_class(rfH_22);
            if (rgP_23 == null) {
                rgP_23 = new rgN_2("");
            }
            rrzz_3.id_class(ryO_22, rgP_23);
        }
    }
}

