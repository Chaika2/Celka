/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBY;
import celestial.rMl_1;
import celestial.rYB;
import celestial.rfH_2;

public class rMI
extends rBY {
    private final rMl_1 id_catch;

    public rMI(rMl_1 rMl_12, double d) {
        super(rMl_12, d);
        this.id_catch = rMl_12;
    }

    @Override
    public boolean id_class() {
        if (!this.id_catch.Pz()) {
            return false;
        }
        rfH_2 rfH_22 = this.id_class((rYB)this.id_class.id_throws[7], this.id_class, 5, 4);
        if (rfH_22 != null) {
            this.id_byte = rfH_22.b_();
            this.id_protected = rfH_22.c_();
            this.id_throws = rfH_22.d_();
            return true;
        }
        return this.id_catch();
    }

    @Override
    public boolean id_break() {
        if (this.id_catch.sJ()) {
            this.id_catch.id_public().id_final();
            return false;
        }
        return super.id_break();
    }
}

