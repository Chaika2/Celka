/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rAB;
import celestial.rRH;
import celestial.rRp_1;
import celestial.rVL;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rds_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rkO_2;
import celestial.rpL_2;
import celestial.rqE_2;
import celestial.rxI_2;
import celestial.rxJ_2;
import celestial.xc_3;
import celestial.xu_3;
import celestial.yC_2;
import celestial.yp_3;

public class yq_3 {
    private final rqE_2<yp_3> id_class = new rqE_2(32);

    public int id_class(rdn_3 rdn_32, int n) {
        yp_3 yp_32 = this.id_class.id_class(rVL.id_for.id_class(rdn_32.id_break()));
        return yp_32 == null ? -1 : yp_32.getColor(rdn_32, n);
    }

    public void id_class(yp_3 yp_32, rpL_2 ... rpL_2Array) {
        for (rpL_2 rpL_22 : rpL_2Array) {
            this.id_class.id_class(yp_32, rdb_3.id_class(rpL_22.id_case()));
        }
    }

    public static yq_3 id_class(yC_2 yC_22) {
        yq_3 yq_32 = new yq_3();
        yq_32.id_class((rdn_3 rdn_32, int n) -> n > 0 ? -1 : ((rds_3)((Object)rdn_32.id_break())).d_(rdn_32), rdy_3.hs, rdy_3.hE, rdy_3.hG, rdy_3.hb, rdy_3.dI);
        yq_32.id_class((rdn_3 rdn_32, int n) -> rRH.id_class(0.5, 1.0), xu_3.Gs, xu_3.GE);
        yq_32.id_class((rdn_3 rdn_32, int n) -> {
            int[] nArray;
            if (n != 1) {
                return -1;
            }
            rcd_3 rcd_32 = rdn_32.id_break("Explosion");
            int[] nArray2 = nArray = rcd_32 != null && rcd_32.id_byte("Colors", 11) ? rcd_32.id_final("Colors") : null;
            if (nArray != null && nArray.length != 0) {
                if (nArray.length == 1) {
                    return nArray[0];
                }
                int n2 = 0;
                int n3 = 0;
                int n4 = 0;
                for (int n5 : nArray) {
                    n2 += (n5 & 0xFF0000) >> 16;
                    n3 += (n5 & 0xFF00) >> 8;
                    n4 += (n5 & 0xFF) >> 0;
                }
                return (n2 /= nArray.length) << 16 | (n3 /= nArray.length) << 8 | (n4 /= nArray.length);
            }
            return 0x8A8A8A;
        }, rdy_3.du);
        yq_32.id_class((rdn_3 rdn_32, int n) -> n > 0 ? -1 : rAB.id_byte(rdn_32), rdy_3.JA, rdy_3.kk, rdy_3.kQ);
        for (rkO_2 rkO_22 : rkO_2.id_catch()) {
            yq_32.id_class((rdn_3 rdn_32, int n) -> rkO_22.id_class(n), rkO_22);
        }
        yq_32.id_class((rdn_3 rdn_32, int n) -> {
            xc_3 xc_32 = ((rxJ_2)rdn_32.id_break()).id_catch().id_continue();
            return yC_22.id_class(xc_32, (rRp_1)null, (rfH_2)null, n);
        }, xu_3.id_implements, xu_3.e, xu_3.a, xu_3.BD, xu_3.x, xu_3.d, xu_3.k, xu_3.W, xu_3.z, xu_3.Q, xu_3.Sr);
        yq_32.id_class((rdn_3 rdn_32, int n) -> n == 0 ? rAB.id_byte(rdn_32) : -1, rdy_3.kz);
        yq_32.id_class((rdn_3 rdn_32, int n) -> n == 0 ? -1 : rxI_2.id_catch(rdn_32), rdy_3.JX);
        return yq_32;
    }
}

