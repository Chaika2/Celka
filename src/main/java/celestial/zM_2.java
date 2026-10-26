/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JD;
import celestial.Jq_1;
import celestial.Qr_1;
import celestial.rCL;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class zM_2
extends JD {
    public static final rCm_1 id_package = rCT.T;

    public zM_2(Jq_1 jq_1, Qr_1 qr_1) {
        super(jq_1, qr_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_package, 0)).id_class(id_volatile, false));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_package, rqd_32.id_class(xc_32.id_byte(id_package), 16));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_package, id_volatile);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return (xc_3)xc_32.id_class(id_package, rpa_32.id_class(xc_32.id_byte(id_package), 16));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return rRR2.id_byte(rfH_22.id_break()).id_byte().id_break();
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32 == rpr_3.DOWN && !this.id_class(xc_32, rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        return (xc_3)((xc_3)this.id_continue().id_class(id_package, rfU_2.id_byte((double)((180.0f + rxx_32.id_private()) * 16.0f / 360.0f) + 0.5) & 0xF)).id_class(id_volatile, rXE2.id_class() == rXG.id_byte);
    }
}

