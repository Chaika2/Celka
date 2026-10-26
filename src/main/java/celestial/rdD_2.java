/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.QP;
import celestial.rdG_2;
import celestial.rdO_2;
import celestial.rdn_3;
import celestial.rkQ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rdD_2
extends rkQ_2 {
    private static final Set<xd_3> id_class = ImmutableSet.of((Object)xu_3.sT, (Object)xu_3.id_float, (Object)xu_3.id_volatile, (Object)xu_3.K, (Object)xu_3.Pr, (Object)xu_3.ri, (Object[])new xd_3[]{xu_3.o, xu_3.rt, xu_3.id_abstract, xu_3.id_void, xu_3.PT, xu_3.rw, xu_3.id_long, xu_3.Z, xu_3.m, xu_3.rV, xu_3.PR, xu_3.Ei, xu_3.hP, xu_3.Px, xu_3.Pl, xu_3.F, xu_3.L, xu_3.A, xu_3.Gf, xu_3.Gj, xu_3.GI, xu_3.id_break, xu_3.id_byte, xu_3.id_protected, xu_3.id_throws, xu_3.id_case, xu_3.id_catch, xu_3.id_private, xu_3.GU, xu_3.Ge, xu_3.Ga, xu_3.br, xu_3.bP, xu_3.bB, xu_3.bS, xu_3.bs, xu_3.bE, xu_3.bG, xu_3.bM, xu_3.bX, xu_3.bJ, xu_3.bh, xu_3.bO, xu_3.Pp, xu_3.Pm, xu_3.hZ, xu_3.hv, xu_3.hF, xu_3.hL, xu_3.hA, xu_3.hn, xu_3.hC, xu_3.hl, xu_3.hH, xu_3.hy, xu_3.hp, xu_3.hq, xu_3.hT, xu_3.bD, xu_3.MX, xu_3.Mb, xu_3.MM, xu_3.ME, xu_3.MS, xu_3.MO, xu_3.bi, xu_3.Ms, xu_3.MP, xu_3.ba, xu_3.be, xu_3.MB, xu_3.MG, xu_3.Mh, xu_3.bU, xu_3.Mr, xu_3.rB, xu_3.D, xu_3.rS});

    protected rdD_2(rdG_2 rdG_22, int n, float f, rdO_2 rdO_22) {
        super(n, f, rdG_22, id_class, rdO_22);
    }

    @Override
    public float id_class(rdn_3 rdn_32, xc_3 xc_32) {
        QP qP = xc_32.id_byte();
        return qP != QP.id_static && qP != QP.id_short && qP != QP.id_void ? super.id_class(rdn_32, xc_32) : this.id_break;
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        int n = this.id_private().id_protected();
        if (!(xc_32.id_class(xu_3.rg) || xc_32.id_class(xu_3.Jd) || xc_32.id_class(xu_3.JJ) || xc_32.id_class(xu_3.Jk) || xc_32.id_class(xu_3.Jx))) {
            if (!(xc_32.id_class(xu_3.Pr) || xc_32.id_class(xu_3.ri) || xc_32.id_class(xu_3.Sk) || xc_32.id_class(xu_3.SN) || xc_32.id_class(xu_3.rt) || xc_32.id_class(xu_3.id_abstract) || xc_32.id_class(xu_3.Pl))) {
                if (!(xc_32.id_class(xu_3.rw) || xc_32.id_class(xu_3.id_long) || xc_32.id_class(xu_3.Z) || xc_32.id_class(xu_3.m))) {
                    QP qP = xc_32.id_byte();
                    return qP == QP.id_void || qP == QP.id_static || qP == QP.id_short || xc_32.id_class(xu_3.id_void);
                }
                return n >= 1;
            }
            return n >= 2;
        }
        return n >= 3;
    }
}

