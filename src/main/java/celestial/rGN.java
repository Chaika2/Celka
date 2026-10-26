/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rBI;
import celestial.rGz_1;
import celestial.rRO;
import celestial.rYB;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rpB_2;
import celestial.rpr_3;

public class rGN
extends rBI<rhd_3> {
    public final /* synthetic */ rGz_1 id_implements;

    public rGN(rGz_1 rGz_12, rGz_1 rGz_13) {
        this.id_implements = rGz_12;
        super((is_3)rGz_13, rhd_3.class, true);
    }

    @Override
    public boolean id_class() {
        return ((rYB)this.id_implements.id_throws[7]).id_abstract() == rRO.PEACEFUL ? false : super.id_class();
    }

    @Override
    protected rfl_3 id_class(double d) {
        rpr_3 rpr_32 = ((rGz_1)this.id_throws).n();
        if (rpr_32.id_final() == rpB_2.X) {
            return this.id_throws.rN().id_byte(4.0, d, d);
        }
        return rpr_32.id_final() == rpB_2.Z ? this.id_throws.rN().id_byte(d, d, 4.0) : this.id_throws.rN().id_byte(d, 4.0, d);
    }
}

