/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class xF_2
extends xd_3 {
    protected xF_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return rLT2 == rLT.AIR && !this.id_byte ? true : super.id_class(xc_32, rRq_12, rfH_22, rLT2);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        return this.id_catch(rRR2.id_byte(rfH_23), rRR2, rfH_23);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_class(xu_3.id_implements) || xc_32.id_class(xu_3.id_finally) || xc_32.id_class(xu_3.id_extends) || xc_32.id_class(xu_3.id_native) || xc_32.id_class(xu_3.PS);
    }

    @Override
    public boolean a_(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_volatile().id_byte();
    }
}

