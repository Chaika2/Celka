/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.WI;
import celestial.dB_2;
import celestial.eU_2;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.ryO_2;
import celestial.rys_3;
import celestial.xc_3;

public abstract class JU
extends dB_2
implements eU_2 {
    private final WI id_volatile;

    public JU(WI wI, Jq_1 jq_1) {
        super(jq_1);
        this.id_volatile = wI;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rys_3();
    }

    public WI id_break() {
        return this.id_volatile;
    }
}

