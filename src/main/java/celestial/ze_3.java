/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Oo_1;
import celestial.QJ;
import celestial.QM;
import celestial.QP;
import celestial.Qd_1;
import celestial.Qh_1;
import celestial.Qx_1;
import celestial.Wf_1;
import celestial.Ww_1;
import celestial.aI_2;
import celestial.iB_2;
import celestial.rRO;
import celestial.rSN;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhN_2;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.ryO_2;
import celestial.rys_3;
import celestial.ryw_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class ze_3
extends Ww_1 {
    private static Qh_1 id_package;
    private static Qh_1 id_int;

    protected ze_3(Jq_1 jq_1) {
        super(Wf_1.WITHER_SKELETON, jq_1);
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22, rys_3 rys_32) {
        if (!rYB2.id_continue) {
            Qh_1 qh_1;
            QJ qJ;
            boolean bl;
            xc_3 xc_32 = rys_32.id_abstract();
            boolean bl2 = bl = xc_32.id_class(xu_3.sh) || xc_32.id_class(xu_3.sX);
            if (bl && rfH_22.c_() >= 0 && rYB2.id_abstract() != rRO.PEACEFUL && (qJ = (qh_1 = ze_3.id_implements()).id_class(rYB2, rfH_22)) != null) {
                for (int i = 0; i < qh_1.id_byte(); ++i) {
                    for (int j = 0; j < qh_1.id_break(); ++j) {
                        ryw_3 ryw_32 = qJ.id_class(i, j, 0);
                        rYB2.id_class(ryw_32.id_protected(), xu_3.id_class.id_continue(), 2);
                        rYB2.id_byte(2001, ryw_32.id_protected(), xd_3.id_finally(ryw_32.id_class()));
                    }
                }
                rSN rSN2 = aI_2.i.id_class(rYB2);
                rfH_2 rfH_23 = qJ.id_class(1, 2, 0).id_protected();
                rSN2.id_class((double)rfH_23.b_() + 0.5, (double)rfH_23.c_() + 0.55, (double)rfH_23.d_() + 0.5, qJ.id_break().id_final() == rpB_2.X ? 0.0f : 90.0f, 0.0f);
                Float f = Float.valueOf(qJ.id_break().id_final() == rpB_2.X ? 0.0f : 90.0f);
                rSN2.id_private[23] = f;
                rSN2.id_throws();
                for (rhN_2 rhN_22 : rYB2.id_class(rhN_2.class, rSN2.rN().id_class(50.0))) {
                    Oo_1.id_final.id_class(rhN_22, rSN2);
                }
                rYB2.a_(rSN2);
                for (int i = 0; i < qh_1.id_byte(); ++i) {
                    for (int j = 0; j < qh_1.id_break(); ++j) {
                        rYB2.id_class(qJ.id_class(i, j, 0).id_protected(), xu_3.id_class);
                    }
                }
            }
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        super.id_class(rYB2, rfH_22, xc_32, iB_22, rdn_32);
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rys_3) {
            ze_3.id_class(rYB2, rfH_22, (rys_3)ryO_22);
        }
    }

    public static boolean id_break(rYB rYB2, rfH_2 rfH_22, rdn_3 rdn_32) {
        if (rdn_32.id_break() == rdy_3.dX && rfH_22.c_() >= 2 && rYB2.id_abstract() != rRO.PEACEFUL && !rYB2.id_continue) {
            return ze_3.id_finally().id_class(rYB2, rfH_22) != null;
        }
        return false;
    }

    private static Qh_1 id_finally() {
        if (id_int == null) {
            id_int = Qx_1.id_class().id_class("   ", "###", "~#~").id_class('#', (ryw_3 ryw_32) -> ryw_32.id_class().id_class(rls_3.d)).id_class('~', ryw_3.id_class(QM.id_class(QP.id_class))).id_break();
        }
        return id_int;
    }

    private static Qh_1 id_implements() {
        if (id_package == null) {
            id_package = Qx_1.id_class().id_class("^^^", "###", "~#~").id_class('#', (ryw_3 ryw_32) -> ryw_32.id_class().id_class(rls_3.d)).id_class('^', ryw_3.id_class(Qd_1.id_class(xu_3.sh).or(Qd_1.id_class(xu_3.sX)))).id_class('~', ryw_3.id_class(QM.id_class(QP.id_class))).id_break();
        }
        return id_package;
    }
}

