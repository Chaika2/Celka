/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBH;
import celestial.rba_3;

public class rMz_1
extends rBH {
    public final /* synthetic */ rba_3 id_class;

    @Override
    public void id_byte() {
        this.id_class.sL();
        super.id_byte();
    }

    public rMz_1(rba_3 rba_32, int n, int n2) {
        this.id_class = rba_32;
        super(rba_32, n2);
    }

    @Override
    public boolean id_class() {
        return super.id_class() && this.id_catch();
    }

    @Override
    public boolean id_break() {
        return super.id_break() && this.id_catch();
    }

    private boolean id_catch() {
        return !this.id_class.Sc() && !this.id_class.sJ() && !this.id_class.sv() && this.id_class.I_() == null;
    }
}

