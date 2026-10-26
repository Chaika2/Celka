/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rsU_2;
import java.util.EnumSet;

public class rse_3
extends rBk_1 {
    public final rsU_2 id_class;
    public final double id_break;
    public final double id_byte;
    public final /* synthetic */ rsU_2 id_protected;

    public rse_3(rsU_2 rsU_22, rsU_2 rsU_23, double d, double d2) {
        this.id_protected = rsU_22;
        this.id_class = rsU_23;
        this.id_break = d;
        this.id_byte = d2;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    private boolean id_class(rfH_2 rfH_22, double d) {
        return !rfH_22.id_class((eX_2)this.id_class.Ps(), d);
    }

    @Override
    public boolean id_class() {
        rfH_2 rfH_22 = this.id_class.sQ();
        return rfH_22 != null && this.id_class(rfH_22, this.id_break);
    }

    @Override
    public void id_throws() {
        rfH_2 rfH_22 = this.id_class.sQ();
        if (rfH_22 != null && rsU_2.id_break(this.id_protected).id_native()) {
            if (this.id_class(rfH_22, 10.0)) {
                rjU_2 rjU_22 = new rjU_2((double)rfH_22.b_() - this.id_class.rx(), (double)rfH_22.c_() - this.id_class.re(), (double)rfH_22.d_() - this.id_class.BO()).id_protected();
                rjU_2 rjU_23 = rjU_22.id_class(10.0).id_break(this.id_class.rx(), this.id_class.re(), this.id_class.BO());
                rsU_2.id_byte(this.id_protected).id_class(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, this.id_byte);
            } else {
                rsU_2.id_protected(this.id_protected).id_class((double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), this.id_byte);
            }
        }
    }

    @Override
    public void id_protected() {
        this.id_class.id_implements((rfH_2)null);
        rsU_2.id_class(this.id_protected).id_final();
    }
}

