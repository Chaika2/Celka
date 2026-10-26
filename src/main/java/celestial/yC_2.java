/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.QS;
import celestial.Wu_1;
import celestial.du_3;
import celestial.rCZ;
import celestial.rCf_1;
import celestial.rRH;
import celestial.rRN;
import celestial.rRp_1;
import celestial.rVL;
import celestial.rYB;
import celestial.rYm_1;
import celestial.rfH_2;
import celestial.rqE_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.yy_3;
import celestial.zO_2;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Set;

public class yC_2 {
    private final rqE_2<yy_3> id_class = new rqE_2(32);
    private final Map<xd_3, Set<rCZ<?>>> id_break = Maps.newHashMap();

    private void id_class(Set<rCZ<?>> set, xd_3 ... xd_3Array) {
        for (xd_3 xd_32 : xd_3Array) {
            this.id_break.put(xd_32, set);
        }
    }

    private void id_class(rCZ<?> rCZ2, xd_3 ... xd_3Array) {
        this.id_class((Set<rCZ<?>>)ImmutableSet.of(rCZ2), xd_3Array);
    }

    public Set<rCZ<?>> id_class(xd_3 xd_32) {
        return (Set)this.id_break.getOrDefault(xd_32, (Set<rCZ<?>>)ImmutableSet.of());
    }

    public static yC_2 id_class() {
        yC_2 yC_22 = new yC_2();
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> rRp_12 != null && rfH_22 != null ? rYm_1.id_class(rRp_12, xc_32.id_byte(du_3.id_volatile) == rCf_1.UPPER ? rfH_22.id_break() : rfH_22) : -1, xu_3.GE, xu_3.Gs);
        yC_22.id_class(du_3.id_volatile, xu_3.GE, xu_3.Gs);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> rRp_12 != null && rfH_22 != null ? rYm_1.id_class(rRp_12, rfH_22) : rRH.id_class(0.5, 1.0), xu_3.id_implements, xu_3.a, xu_3.e, xu_3.Sq);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> rRN.id_class(), xu_3.d);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> rRN.id_break(), xu_3.k);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> rRp_12 != null && rfH_22 != null ? rYm_1.id_break(rRp_12, rfH_22) : rRN.id_byte(), xu_3.x, xu_3.W, xu_3.z, xu_3.Q, xu_3.BD);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> rRp_12 != null && rfH_22 != null ? rYm_1.id_byte(rRp_12, rfH_22) : -1, xu_3.id_try, xu_3.hM, xu_3.Sb);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> Wu_1.id_byte(xc_32.id_byte(Wu_1.id_new)), xu_3.ra);
        yC_22.id_class(Wu_1.id_new, xu_3.ra);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> rRp_12 != null && rfH_22 != null ? rYm_1.id_class(rRp_12, rfH_22) : -1, xu_3.Pf);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> 14731036, xu_3.BY, xu_3.BR);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> {
            int n2 = xc_32.id_byte(zO_2.id_volatile);
            int n3 = n2 * 32;
            int n4 = 255 - n2 * 8;
            int n5 = n2 * 4;
            return n3 << 16 | n4 << 8 | n5;
        }, xu_3.BK, xu_3.Bo);
        yC_22.id_class(zO_2.id_volatile, xu_3.BK, xu_3.Bo);
        yC_22.id_class((xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) -> rRp_12 != null && rfH_22 != null ? 2129968 : 7455580, xu_3.Sr);
        return yC_22;
    }

    public void id_class(yy_3 yy_32, xd_3 ... xd_3Array) {
        for (xd_3 xd_32 : xd_3Array) {
            this.id_class.id_class(yy_32, rVL.id_strictfp.id_class(xd_32));
        }
    }

    public int id_class(xc_3 xc_32, rRp_1 rRp_12, rfH_2 rfH_22, int n) {
        yy_3 yy_32 = this.id_class.id_class(rVL.id_strictfp.id_class(xc_32.id_break()));
        return yy_32 == null ? -1 : yy_32.getColor(xc_32, rRp_12, rfH_22, n);
    }

    public int id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        yy_3 yy_32 = this.id_class.id_class(rVL.id_strictfp.id_class(xc_32.id_break()));
        if (yy_32 != null) {
            return yy_32.getColor(xc_32, null, null, 0);
        }
        QS qS = xc_32.id_protected(rYB2, rfH_22);
        return qS != null ? qS.d : -1;
    }
}

