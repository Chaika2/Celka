/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBI;
import celestial.rbF_2;
import celestial.rhd_3;

public class rbn_3
extends rBI<rhd_3> {
    public rbn_3(rbF_2 rbF_22) {
        super(rbF_22, rhd_3.class, 10, true, false, rbF_22::b_);
    }

    @Override
    public boolean id_class() {
        return this.id_catch() && super.id_class();
    }

    @Override
    public boolean id_break() {
        boolean bl = this.id_catch();
        if (bl && this.id_throws.I_() != null) {
            return super.id_break();
        }
        this.id_catch = null;
        return false;
    }

    private boolean id_catch() {
        rbF_2 rbF_22 = (rbF_2)this.id_throws;
        return rbF_22.T_() && !rbF_22.su();
    }
}

