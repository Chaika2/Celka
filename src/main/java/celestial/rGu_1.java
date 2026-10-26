/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBI;
import celestial.rEK;
import celestial.rGz_1;
import celestial.rfl_3;
import celestial.rpB_2;
import celestial.rpr_3;

public class rGu_1
extends rBI<iB_2> {
    public rGu_1(rGz_1 rGz_12) {
        super(rGz_12, iB_2.class, 10, true, false, iB_22 -> iB_22 instanceof rEK);
    }

    @Override
    protected rfl_3 id_class(double d) {
        rpr_3 rpr_32 = ((rGz_1)this.id_throws).n();
        if (rpr_32.id_final() == rpB_2.X) {
            return this.id_throws.rN().id_byte(4.0, d, d);
        }
        return rpr_32.id_final() == rpB_2.Z ? this.id_throws.rN().id_byte(d, d, 4.0) : this.id_throws.rN().id_byte(d, 4.0, d);
    }

    @Override
    public boolean id_class() {
        return this.id_throws.BG() == null ? false : super.id_class();
    }
}

