/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JC;
import celestial.Uq_1;
import celestial.Uy_1;
import celestial.dQ_2;
import celestial.eJ_2;
import celestial.rAB;
import celestial.rAS;
import celestial.rHC;
import celestial.rHk_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rlG_2;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.xO_2;
import celestial.xc_3;

public class er_3
extends eJ_2 {
    private final Uy_1 id_break = new Uy_1();

    @Override
    public rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32) {
        this.id_class(false);
        rrEm_1 rrEm_12 = uq_1.id_catch();
        rfH_2 rfH_22 = uq_1.id_protected().id_break(uq_1.id_throws().id_byte(dQ_2.id_volatile));
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        if (xc_32.id_class(rls_3.k, (JC jC) -> jC.id_break(xO_2.id_final)) && xc_32.id_byte(xO_2.id_final) >= 5) {
            ((xO_2)xc_32.id_break()).id_class((rYB)rrEm_12, xc_32, rfH_22, (rhd_3)null, rHk_1.BEE_RELEASED);
            this.id_class(true);
            return this.id_class(uq_1, rdn_32, new rdn_3(rdy_3.WF));
        }
        if (rrEm_12.id_break(rfH_22).id_class(rlG_2.id_break)) {
            this.id_class(true);
            return this.id_class(uq_1, rdn_32, rAB.id_class(new rdn_3(rdy_3.JA), rAS.id_break));
        }
        return super.id_class(uq_1, rdn_32);
    }

    private rdn_3 id_class(Uq_1 uq_1, rdn_3 rdn_32, rdn_3 rdn_33) {
        rdn_32.id_catch(1);
        if (rdn_32.id_class()) {
            return rdn_33.id_implements();
        }
        if (((rHC)uq_1.id_case()).id_class(rdn_33.id_implements()) < 0) {
            this.id_break.dispense(uq_1, rdn_33.id_implements());
        }
        return rdn_32;
    }
}

