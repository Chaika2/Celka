/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dO_2;
import celestial.rRq_1;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpL_2;
import celestial.xc_3;
import celestial.xd_3;

public class WS
extends dO_2 {
    private static final rjC_2[] id_volatile = new rjC_2[]{xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 3.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 5.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 7.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)};

    public WS(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile[xc_32.id_byte(this.id_break())];
    }

    @Override
    protected rpL_2 id_finally() {
        return rdy_3.dE;
    }
}

