/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JR;
import celestial.Je_1;
import celestial.Jq_1;
import celestial.kX_2;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXG;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Optional;
import java.util.Random;

public abstract class JT
extends JR
implements kX_2 {
    protected JT(Jq_1 jq_1, rpr_3 rpr_32, rjC_2 rjC_22, boolean bl) {
        super(jq_1, rpr_32, rjC_22, bl);
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        Optional<rfH_2> optional = this.id_break(rrEm_12, rfH_22, xc_32);
        if (optional.isPresent()) {
            xc_3 xc_33 = rrEm_12.id_byte(optional.get());
            ((Je_1)xc_33.id_break()).id_class(rrEm_12, random, optional.get(), xc_33);
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rxx_3 rxx_32) {
        boolean bl = super.id_class(xc_32, rxx_32);
        return bl && rxx_32.id_volatile().id_break() == this.id_implements().id_case() ? false : bl;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        xd_3 xd_32;
        if (rpr_32 == this.id_volatile.id_case() && !xc_32.id_class(rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
        }
        Je_1 je_1 = this.id_implements();
        if (rpr_32 == this.id_volatile && (xd_32 = xc_33.id_break()) != this && xd_32 != je_1) {
            return je_1.id_class(rRg_12);
        }
        if (this.id_final) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return new rdn_3(this.id_implements());
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        Optional<rfH_2> optional = this.id_break(rRq_12, rfH_22, xc_32);
        return optional.isPresent() && this.id_implements().id_private(rRq_12.id_byte(optional.get().id_break(this.id_volatile)));
    }

    @Override
    protected xd_3 id_break() {
        return this;
    }

    private Optional<rfH_2> id_break(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        xd_3 xd_32;
        rfH_2 rfH_23 = rfH_22;
        while ((xd_32 = rRq_12.id_byte(rfH_23 = rfH_23.id_break(this.id_volatile)).id_break()) == xc_32.id_break()) {
        }
        return xd_32 == this.id_implements() ? Optional.of(rfH_23) : Optional.empty();
    }
}

