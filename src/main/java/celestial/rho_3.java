/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhm_3;

public class rho_3
extends rhm_3 {
    private int id_private = 200;

    public rho_3(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.p, d, d2, d3, rYB2);
    }

    public rho_3(rYB rYB2, iB_2 iB_22) {
        super(aI_2.p, iB_22, rYB2);
    }

    public rho_3(aI_2<? extends rho_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rhm_3>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (((rYB)this.id_throws[7]).id_continue && !this.id_class) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_float, this.rx(), this.re(), this.BO(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void id_class(iB_2 iB_22) {
        super.id_class(iB_22);
        rLY rLY2 = new rLY(rLD.id_public, this.id_private, 0);
        iB_22.id_break(rLY2);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Duration", this.id_private);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_throws("Duration")) {
            this.id_private = rcd_32.id_private("Duration");
        }
    }

    @Override
    protected rdn_3 id_catch() {
        return new rdn_3(rdy_3.kW);
    }
}

