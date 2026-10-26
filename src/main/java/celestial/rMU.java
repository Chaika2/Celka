/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.is_3;
import celestial.rBc_1;
import celestial.rMK;

public class rMU
extends rBc_1 {
    public final /* synthetic */ rMK id_class;

    @Override
    public void id_byte() {
        super.id_byte();
        if (this.id_class.n_()) {
            this.id_catch();
            this.id_protected();
        }
    }

    public rMU(rMK rMK2) {
        this.id_class = rMK2;
        super(rMK2, new Class[0]);
    }

    @Override
    protected void id_class(is_3 is_32, iB_2 iB_22) {
        if (is_32 instanceof rMK && !is_32.n_()) {
            super.id_class(is_32, iB_22);
        }
    }
}

