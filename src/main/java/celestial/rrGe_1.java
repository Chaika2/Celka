/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IJ;
import celestial.Jt_1;
import celestial.WC;
import celestial.WQ;
import celestial.Wg_1;
import celestial.dI_2;
import celestial.dV_2;
import celestial.df_3;
import celestial.dp_3;
import celestial.dq_3;
import celestial.du_3;
import celestial.kL_2;
import celestial.kS_2;
import celestial.kc_3;
import celestial.kp_3;
import celestial.rCH;
import celestial.rCj_1;
import celestial.rCo_1;
import celestial.rRp_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rrbb_3;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zG_2;
import celestial.zH_2;
import celestial.zW_2;
import celestial.zc_3;
import celestial.zq_3;
import celestial.zw_3;

public class rrGe_1 {
    private static IJ id_class = null;

    public static xc_3 id_byte() {
        return xu_3.Pq.id_continue();
    }

    private static boolean id_class(rRq_1 rRq_12, xc_3 xc_32, rfH_2 rfH_22) {
        if (xc_32.id_implements(rRq_12, rfH_22)) {
            return false;
        }
        xd_3 xd_32 = xc_32.id_break();
        if (xd_32 == xu_3.Pt) {
            return false;
        }
        if (!(xd_32 instanceof xF_2 && (xd_32 instanceof du_3 || xd_32 instanceof dI_2 || xd_32 instanceof kp_3 || xd_32 instanceof WC || xd_32 instanceof zc_3))) {
            if (!(xd_32 instanceof dp_3 || xd_32 instanceof dq_3 || xd_32 instanceof df_3 || xd_32 instanceof dV_2 || xd_32 instanceof zW_2 || xd_32 instanceof zw_3)) {
                if (xd_32 instanceof WQ) {
                    return true;
                }
                if (xd_32 instanceof zG_2) {
                    return xc_32.id_byte(zG_2.id_final) == rCj_1.TOP;
                }
                if (xd_32 instanceof Wg_1) {
                    return xc_32.id_byte(Wg_1.id_volatile) == rCo_1.TOP;
                }
                if (xd_32 instanceof Jt_1) {
                    return xc_32.id_byte(Jt_1.q) != rCH.FLOOR;
                }
                if (xd_32 instanceof kS_2) {
                    return true;
                }
                if (xd_32 instanceof kc_3) {
                    return true;
                }
                if (xd_32 instanceof kL_2) {
                    return true;
                }
                if (xd_32 instanceof zH_2) {
                    return true;
                }
                return xd_32 instanceof zq_3;
            }
            return true;
        }
        return true;
    }

    public static boolean id_class(rRp_1 rRp_12, xc_3 xc_32, rfH_2 rfH_22) {
        if (!(rRp_12 instanceof rRq_1)) {
            return false;
        }
        return !rrGe_1.id_class((rRq_1)rRp_12, xc_32, rfH_22) ? false : rrGe_1.id_class(rRp_12, rfH_22);
    }

    public static void id_class() {
        id_class = rrbb_3.X().id_synchronized().id_break().id_break(xu_3.Pq.id_continue());
    }

    private static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        xd_3 xd_32 = xu_3.Pq;
        if (rRq_12.id_byte(rfH_22.id_private()).id_break() == xd_32 || rRq_12.id_byte(rfH_22.id_protected()).id_break() == xd_32 || rRq_12.id_byte(rfH_22.id_byte()).id_break() == xd_32 || rRq_12.id_byte(rfH_22.id_extends()).id_break() == xd_32) {
            xc_3 xc_32 = rRq_12.id_byte(rfH_22.id_break());
            if (xc_32.id_implements(rRq_12, rfH_22)) {
                return true;
            }
            xd_3 xd_33 = xc_32.id_break();
            if (xd_33 instanceof zG_2) {
                return xc_32.id_byte(zG_2.id_final) == rCj_1.TOP;
            }
            if (xd_33 instanceof Wg_1) {
                return xc_32.id_byte(Wg_1.id_volatile) == rCo_1.TOP;
            }
        }
        return false;
    }

    public static IJ id_break() {
        return id_class;
    }
}

