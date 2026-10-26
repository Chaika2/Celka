/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCZ;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class Jf_1
extends xd_3
implements kd_3 {
    public static final rCN id_volatile = rCT.id_throw;
    private static final rjC_2 id_final = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

    protected Jf_1(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, true));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return rpr_32 == rpr_3.DOWN && !this.id_class(xc_32, (rRR)rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    protected void id_class(xc_3 xc_32, rRg_1 rRg_12, rfH_2 rfH_22) {
        if (!Jf_1.id_case(xc_32, rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 60 + rRg_12.id_long().nextInt(40));
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        return rRR2.id_byte(rfH_23).id_protected(rRR2, rfH_23, rpr_3.UP);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        return (xc_3)this.id_continue().id_class(id_volatile, rXE2.id_class(rlG_2.id_break) && rXE2.id_throws() == 8);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }

    protected static boolean id_case(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            return true;
        }
        for (rpr_3 rpr_32 : rpr_3.values()) {
            if (!rRq_12.id_break(rfH_22.id_break(rpr_32)).id_class(rlG_2.id_break)) continue;
            return true;
        }
        return false;
    }
}

