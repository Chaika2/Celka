/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBI;
import celestial.rGD;

public class rGa_1
extends rBI<iB_2> {
    @Override
    public void id_byte() {
        super.id_byte();
        this.id_throws.id_native(0);
    }

    public rGa_1(rGD rGD2) {
        super(rGD2, iB_2.class, 0, true, true, iB_2::Sq);
    }

    @Override
    public boolean id_class() {
        return ((rGD)this.id_throws).id_super && super.id_class();
    }
}

