/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;

public class rHL
extends ryO_2 {
    private int id_class;

    public rHL() {
        super(ryW_2.id_continue);
    }

    public void id_class(int n) {
        this.id_class = n;
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_class = rcd_32.id_private("OutputSignal");
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("OutputSignal", this.id_class);
        return rcd_32;
    }

    public int id_throws() {
        return this.id_class;
    }
}

