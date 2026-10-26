/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBY;
import celestial.rMK;

public class rMa_1
extends rBY {
    public final /* synthetic */ rMK id_catch;

    public rMa_1(rMK rMK2) {
        this.id_catch = rMK2;
        super(rMK2, 2.0);
    }

    @Override
    public boolean id_class() {
        return !this.id_catch.n_() && !this.id_catch.Pz() ? false : super.id_class();
    }
}

