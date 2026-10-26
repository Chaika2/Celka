/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.Uy_1;
import celestial.dQ_2;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rrEm_1;
import celestial.rxN_2;

public class UR
extends Uy_1 {
    private final Uy_1 id_break = new Uy_1();

    @Override
    public rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        rxN_2 rxN_22 = (rxN_2)rdn_32.id_break();
        rfH_2 rfH_22 = uq_1.id_protected().id_break(uq_1.id_throws().id_byte(dQ_2.id_volatile));
        rrEm_1 rrEm_12 = uq_1.id_catch();
        if (rxN_22.id_class((rhd_3)null, (rYB)rrEm_12, rfH_22, (rff_3)null)) {
            rxN_22.id_class((rYB)rrEm_12, rdn_32, rfH_22);
            return new rdn_3(rdy_3.hg);
        }
        return this.id_break.dispense(uq_1, rdn_32);
    }
}

