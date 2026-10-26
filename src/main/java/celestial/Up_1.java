/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.Uy_1;
import celestial.dQ_2;
import celestial.rSK;
import celestial.rSe_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rrEm_1;

public class Up_1
extends Uy_1 {
    private final Uy_1 id_break = new Uy_1();
    private final rSe_1 id_byte;

    public Up_1(rSe_1 rSe_12) {
        this.id_byte = rSe_12;
    }

    @Override
    public rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        double d;
        rpr_3 rpr_32 = uq_1.id_throws().id_byte(dQ_2.id_volatile);
        rrEm_1 rrEm_12 = uq_1.id_catch();
        double d2 = uq_1.id_class() + (double)((float)rpr_32.id_implements() * 1.125f);
        double d3 = uq_1.id_break() + (double)((float)rpr_32.id_finally() * 1.125f);
        double d4 = uq_1.id_byte() + (double)((float)rpr_32.id_extends() * 1.125f);
        rfH_2 rfH_22 = uq_1.id_protected().id_break(rpr_32);
        if (rrEm_12.id_break(rfH_22).id_class(rlG_2.id_break)) {
            d = 1.0;
        } else {
            if (!rrEm_12.id_byte(rfH_22).id_catch() || !rrEm_12.id_break(rfH_22.id_break()).id_class(rlG_2.id_break)) {
                return this.id_break.dispense(uq_1, rdn_32);
            }
            d = 0.0;
        }
        rSK rSK2 = new rSK(rrEm_12, d2, d3 + d, d4);
        rSK2.id_class(this.id_byte);
        Float f = Float.valueOf(rpr_32.id_package());
        rSK2.id_throws[15] = f;
        rrEm_12.a_(rSK2);
        rdn_32.id_catch(1);
        return rdn_32;
    }

    @Override
    protected void id_class(Uq_1 uq_1) {
        uq_1.id_catch().id_byte(1000, uq_1.id_protected(), 0);
    }
}

