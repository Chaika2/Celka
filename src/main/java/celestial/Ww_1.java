/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JU;
import celestial.Jq_1;
import celestial.WI;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpa_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public class Ww_1
extends JU {
    public static final rCm_1 id_volatile = rCT.T;
    protected static final rjC_2 id_final = xd_3.id_class(4.0, 0.0, 4.0, 12.0, 8.0, 12.0);

    protected Ww_1(WI wI, Jq_1 jq_1) {
        super(wI, jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile), 16));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return (xc_3)xc_32.id_class(id_volatile, rpa_32.id_class(xc_32.id_byte(id_volatile), 16));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rfU_2.id_byte((double)(rxx_32.id_private() * 16.0f / 360.0f) + 0.5) & 0xF);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rjw_3.id_class();
    }
}

