/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBY;
import celestial.rba_3;

public class rMJ
extends rBY {
    public final /* synthetic */ rba_3 id_catch;

    public rMJ(rba_3 rba_32, double d) {
        this.id_catch = rba_32;
        super(rba_32, d);
    }

    @Override
    public boolean id_class() {
        return !this.id_catch.sv() && super.id_class();
    }
}

