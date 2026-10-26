/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.eX_2;
import celestial.is_3;
import celestial.rLA;
import celestial.rLC;
import celestial.rYB;
import celestial.rfH_2;

public class rLZ
extends rLA {
    private rfH_2 id_class;

    public rLZ(is_3 is_32, rYB rYB2) {
        super(is_32, rYB2);
    }

    @Override
    public void id_class() {
        if (!this.id_native()) {
            super.id_class();
        } else if (this.id_class != null) {
            if (!(this.id_class.id_class((eX_2)this.id_break.Ps(), (double)this.id_break.PN()) || this.id_break.re() > (double)this.id_class.c_() && new rfH_2((double)this.id_class.b_(), this.id_break.re(), (double)this.id_class.d_()).id_class((eX_2)this.id_break.Ps(), (double)this.id_break.PN()))) {
                this.id_break.id_super().id_class(this.id_class.b_(), this.id_class.c_(), this.id_class.d_(), this.id_throws);
            } else {
                this.id_class = null;
            }
        }
    }

    @Override
    public boolean id_class(an_3 an_32, double d) {
        rLC rLC2 = this.id_class(an_32, 0);
        if (rLC2 != null) {
            return this.id_class(rLC2, d);
        }
        this.id_class = an_32.Bs();
        this.id_throws = d;
        return true;
    }

    @Override
    public rLC id_class(an_3 an_32, int n) {
        this.id_class = an_32.Bs();
        return super.id_class(an_32, n);
    }

    @Override
    public rLC id_class(rfH_2 rfH_22, int n) {
        this.id_class = rfH_22;
        return super.id_class(rfH_22, n);
    }
}

