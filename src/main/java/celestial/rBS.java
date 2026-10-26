/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_do;
import celestial.JC;
import celestial.rBp_1;
import celestial.rCp_1;
import celestial.rHu_1;
import celestial.rRR;
import celestial.rbf_3;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.xb_3;
import celestial.xc_3;
import celestial.xu_3;

public class rBS
extends rBp_1 {
    private final rbf_3 id_catch;

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_catch.id_public(false);
    }

    public rBS(rbf_3 rbf_32, double d) {
        super(rbf_32, d, 8);
        this.id_catch = rbf_32;
    }

    @Override
    protected boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        if (!rRR2.id_finally(rfH_22.id_final())) {
            return false;
        }
        xc_3 xc_32 = rRR2.id_byte(rfH_22);
        if (xc_32.id_class(xu_3.re)) {
            return rHu_1.id_class(rRR2, rfH_22) < 1;
        }
        return xc_32.id_class(xu_3.Ps) && xc_32.id_byte(C_do.id_final) != false ? true : xc_32.id_class(rls_3.id_short, (JC jC) -> jC.id_protected(xb_3.id_volatile).map(rCp_12 -> rCp_12 != rCp_1.HEAD).orElse(true));
    }

    @Override
    public boolean id_class() {
        return this.id_catch.sZ() && !this.id_catch.sL() && super.id_class();
    }

    @Override
    public void id_throws() {
        super.id_throws();
        this.id_catch.id_public(this.id_native());
    }

    @Override
    public void id_protected() {
        super.id_protected();
        this.id_catch.id_public(false);
    }
}

