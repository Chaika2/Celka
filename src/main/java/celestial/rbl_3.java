/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.rHx_1;
import celestial.rYB;
import celestial.rbF_2;
import celestial.rbq_3;
import celestial.ryO_2;

public class rbl_3
extends rbq_3 {
    public final /* synthetic */ rbF_2 id_class;

    @Override
    public void id_byte() {
        ryO_2 ryO_22 = ((rYB)this.id_class.id_throws[7]).id_class(this.id_class.id_abstract);
        if (ryO_22 instanceof rHx_1) {
            rHx_1 rHx_12 = (rHx_1)ryO_22;
            rHx_12.id_class(this.id_class, this.id_class.sc());
        }
    }

    public rbl_3(rbF_2 rbF_22) {
        this.id_class = rbF_22;
        super(rbF_22);
    }

    @Override
    public boolean id_catch() {
        ryO_2 ryO_22;
        if (this.id_class.sx() && this.id_class.sF() && this.id_class.id_abstract.id_class((eX_2)this.id_class.Ps(), 2.0) && (ryO_22 = ((rYB)this.id_class.id_throws[7]).id_class(this.id_class.id_abstract)) instanceof rHx_1) {
            rHx_1 rHx_12 = (rHx_1)ryO_22;
            if (!rHx_12.id_private()) {
                return true;
            }
            this.id_class.id_abstract = null;
        }
        return false;
    }

    @Override
    public boolean id_private() {
        return false;
    }
}

