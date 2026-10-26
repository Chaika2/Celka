/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JC;
import celestial.Jo_1;
import celestial.Uq_1;
import celestial.Uy_1;
import celestial.an_3;
import celestial.dQ_2;
import celestial.rCR;
import celestial.rCn_1;
import celestial.rdV_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rsJ_2;
import celestial.xc_3;

public class rdg_3
extends Uy_1 {
    private final Uy_1 id_break = new Uy_1();

    @Override
    public rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        Object object;
        double d;
        rCR rCR2;
        rpr_3 rpr_32 = uq_1.id_throws().id_byte(dQ_2.id_volatile);
        rrEm_1 rrEm_12 = uq_1.id_catch();
        double d2 = uq_1.id_class() + (double)rpr_32.id_implements() * 1.125;
        double d3 = Math.floor(uq_1.id_break()) + (double)rpr_32.id_finally();
        double d4 = uq_1.id_byte() + (double)rpr_32.id_extends() * 1.125;
        rfH_2 rfH_22 = uq_1.id_protected().id_break(rpr_32);
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        rCR rCR3 = rCR2 = xc_32.id_break() instanceof Jo_1 ? xc_32.id_byte(((Jo_1)xc_32.id_break()).id_implements()) : rCR.NORTH_SOUTH;
        if (xc_32.id_class(rls_3.id_float)) {
            d = rCR2.id_break() ? 0.6 : 0.1;
        } else {
            if (!xc_32.id_catch() || !rrEm_12.id_byte(rfH_22.id_break()).id_class(rls_3.id_float)) {
                return this.id_break.dispense(uq_1, rdn_32);
            }
            object = rrEm_12.id_byte(rfH_22.id_break());
            rCR rCR4 = ((JC)object).id_break() instanceof Jo_1 ? ((rCn_1)object).id_byte(((Jo_1)((JC)object).id_break()).id_implements()) : rCR.NORTH_SOUTH;
            d = rpr_32 != rpr_3.DOWN && rCR4.id_break() ? -0.4 : -0.9;
        }
        object = rsJ_2.id_class(rrEm_12, d2, d3 + d, d4, ((rdV_2)rdn_32.id_break()).id_break);
        if (rdn_32.id_this()) {
            ((an_3)object).id_break(rdn_32.id_continue());
        }
        rrEm_12.a_((an_3)object);
        rdn_32.id_catch(1);
        return rdn_32;
    }

    @Override
    protected void id_class(Uq_1 uq_1) {
        uq_1.id_catch().id_byte(1000, uq_1.id_protected(), 0);
    }
}

