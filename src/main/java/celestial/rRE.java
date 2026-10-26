/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRq_1;
import celestial.rXE;
import celestial.rfH_2;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xu_3;

public final class rRE
implements rRq_1 {
    private final xc_3[] id_class;

    @Override
    public xc_3 id_byte(rfH_2 rfH_22) {
        int n = rfH_22.c_();
        return n >= 0 && n < this.id_class.length ? this.id_class[n] : xu_3.id_class.id_continue();
    }

    public rRE(xc_3[] xc_3Array) {
        this.id_class = xc_3Array;
    }

    @Override
    public ryO_2 id_class(rfH_2 rfH_22) {
        return null;
    }

    @Override
    public rXE id_break(rfH_2 rfH_22) {
        return this.id_byte(rfH_22).id_volatile();
    }
}

