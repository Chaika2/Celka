/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JT;
import celestial.Je_1;
import celestial.Jq_1;
import celestial.kJ_2;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rfH_2;
import celestial.rjw_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;

public class kQ_2
extends JT
implements kJ_2 {
    protected kQ_2(Jq_1 jq_1) {
        super(jq_1, rpr_3.UP, rjw_3.id_break(), true);
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXs_1 rXs_12) {
        return false;
    }

    @Override
    public boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2) {
        return false;
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return rXG.id_byte.id_class(false);
    }

    @Override
    protected Je_1 id_implements() {
        return (Je_1)xu_3.OM;
    }
}

