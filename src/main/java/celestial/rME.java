/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBx_1;
import celestial.rba_3;

public class rME
extends rBx_1 {
    private final rba_3 id_class;

    @Override
    public void id_byte() {
        this.id_class.sL();
        super.id_byte();
    }

    public rME(rba_3 rba_32, rba_3 rba_33, double d) {
        super(rba_33, d);
        this.id_class = rba_33;
    }

    @Override
    public boolean id_class() {
        return !this.id_class.sv() && super.id_class();
    }

    @Override
    public boolean id_break() {
        return !this.id_class.sv() && super.id_break();
    }
}

