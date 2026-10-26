/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBY;
import celestial.rON;
import celestial.rYB;
import celestial.rfH_2;

public class rOL
extends rBY {
    public rOL(rON rON2, double d) {
        super(rON2, d);
    }

    @Override
    public boolean id_class() {
        if (this.id_class.Sr() == null && !this.id_class.Pz()) {
            return false;
        }
        rfH_2 rfH_22 = this.id_class((rYB)this.id_class.id_throws[7], this.id_class, 7, 4);
        if (rfH_22 != null) {
            this.id_byte = rfH_22.b_();
            this.id_protected = rfH_22.c_();
            this.id_throws = rfH_22.d_();
            return true;
        }
        return this.id_catch();
    }
}

