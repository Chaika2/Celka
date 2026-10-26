/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLI;
import celestial.rLl_1;
import celestial.rLw_1;
import celestial.rON;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xu_3;

public class rOF
extends rLw_1 {
    public rOF(rON rON2, rYB rYB2) {
        super(rON2, rYB2);
    }

    @Override
    public boolean id_class(rfH_2 rfH_22) {
        rON rON2;
        if (this.id_break instanceof rON && (rON2 = (rON)this.id_break).su()) {
            return this.id_byte.id_byte(rfH_22).id_class(xu_3.id_try);
        }
        return !this.id_byte.id_byte(rfH_22.id_break()).id_catch();
    }

    @Override
    protected rLl_1 id_class(int n) {
        this.id_int = new rLI();
        return new rLl_1(this.id_int, n);
    }

    @Override
    protected boolean id_break() {
        return true;
    }
}

