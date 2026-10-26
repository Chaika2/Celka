/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBI;
import celestial.rMK;
import celestial.rYB;
import celestial.rhd_3;

public class rMD
extends rBI<rhd_3> {
    public final /* synthetic */ rMK id_implements;

    public rMD(rMK rMK2) {
        this.id_implements = rMK2;
        super(rMK2, rhd_3.class, 20, true, true, null);
    }

    @Override
    public boolean id_class() {
        if (this.id_implements.n_()) {
            return false;
        }
        if (super.id_class()) {
            for (rMK rMK2 : ((rYB)this.id_implements.id_throws[7]).id_class(rMK.class, this.id_implements.rN().id_byte(8.0, 4.0, 8.0))) {
                if (!rMK2.n_()) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    protected double id_extends() {
        return super.id_extends() * 0.5;
    }
}

