/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QP;
import celestial.an_3;
import celestial.rRq_1;
import celestial.rSK;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rrEm_1;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;

public class kn_3
extends xF_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

    protected kn_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        super.id_class(xc_32, rYB2, rfH_22, an_32);
        if (rYB2 instanceof rrEm_1 && an_32 instanceof rSK) {
            rYB2.id_class(new rfH_2(rfH_22), true, an_32);
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        rXE rXE2 = rRq_12.id_break(rfH_22);
        rXE rXE3 = rRq_12.id_break(rfH_22.id_final());
        return (rXE2.id_class() == rXG.id_byte || xc_32.id_byte() == QP.id_long) && rXE3.id_class() == rXG.id_class;
    }
}

