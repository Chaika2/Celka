/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Wt_1;
import celestial.rCL;
import celestial.rCZ;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class xR_2
extends Wt_1 {
    protected xR_2(Jq_1 jq_1) {
        super(0.3125f, jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, false)).id_class(id_final, false)).id_class(id_package, false)).id_class(id_int, false)).id_class(id_new, false)).id_class(id_continue, false));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_33 = rRR2.id_byte(rfH_22.id_break());
        boolean bl = !rRR2.id_byte(rfH_22.id_final()).id_catch() && !xc_33.id_catch();
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
            xd_3 xd_32 = rRR2.id_byte(rfH_23).id_break();
            if (xd_32 != this) continue;
            if (bl) {
                return false;
            }
            xd_3 xd_33 = rRR2.id_byte(rfH_23.id_break()).id_break();
            if (xd_33 != this && xd_33 != xu_3.Sh) continue;
            return true;
        }
        xd_3 xd_34 = xc_33.id_break();
        return xd_34 == this || xd_34 == xu_3.Sh;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package, id_int, id_new, id_continue);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return this.id_class((rRq_1)rxx_32.id_int(), rxx_32.id_class());
    }

    public xc_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        xd_3 xd_32 = rRq_12.id_byte(rfH_22.id_break()).id_break();
        xd_3 xd_33 = rRq_12.id_byte(rfH_22.id_final()).id_break();
        xd_3 xd_34 = rRq_12.id_byte(rfH_22.id_private()).id_break();
        xd_3 xd_35 = rRq_12.id_byte(rfH_22.id_extends()).id_break();
        xd_3 xd_36 = rRq_12.id_byte(rfH_22.id_protected()).id_break();
        xd_3 xd_37 = rRq_12.id_byte(rfH_22.id_byte()).id_break();
        return (xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_continue, xd_32 == this || xd_32 == xu_3.bl || xd_32 == xu_3.Sh)).id_class(id_new, xd_33 == this || xd_33 == xu_3.bl)).id_class(id_volatile, xd_34 == this || xd_34 == xu_3.bl)).id_class(id_final, xd_35 == this || xd_35 == xu_3.bl)).id_class(id_package, xd_36 == this || xd_36 == xu_3.bl)).id_class(id_int, xd_37 == this || xd_37 == xu_3.bl);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (!xc_32.id_class(rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
            return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
        }
        boolean bl = xc_33.id_break() == this || xc_33.id_class(xu_3.bl) || rpr_32 == rpr_3.DOWN && xc_33.id_class(xu_3.Sh);
        return (xc_3)xc_32.id_class((rCZ)id_super.get(rpr_32), bl);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!xc_32.id_class((rRR)rrEm_12, rfH_22)) {
            rrEm_12.id_break(rfH_22, true);
        }
    }
}

