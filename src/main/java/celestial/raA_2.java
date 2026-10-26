/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHu_1;
import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rRf_1;
import celestial.raF_2;
import celestial.raL_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpa_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rrPG;
import celestial.rrPN;
import celestial.rrPl_1;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrw_1;
import celestial.ryO_2;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public class raA_2
extends rrrw_1 {
    private final rqO_2 id_protected;
    private final rqd_3 id_throws;

    public raA_2(rrPt_1 rrPt_12, rqO_2 rqO_22, rfH_2 rfH_22, rqd_3 rqd_32, int n) {
        super(raF_2.id_void, 0);
        this.id_protected = rqO_22;
        rfH_2 rfH_23 = raL_2.id_throws.get(rqO_22);
        this.id_byte = rfH_22.id_break(rfH_23.b_(), rfH_23.c_() - n, rfH_23.d_());
        this.id_throws = rqd_32;
        this.id_class(rrPt_12);
    }

    public raA_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_void, rcd_32);
        this.id_protected = new rqO_2(rcd_32.id_native("Template"));
        this.id_throws = rqd_3.valueOf(rcd_32.id_native("Rot"));
        this.id_class(rrPt_12);
    }

    @Override
    protected void id_class(String string, rfH_2 rfH_22, rRf_1 rRf_12, Random random, rfi_3 rfi_32) {
        if ("chest".equals(string)) {
            rRf_12.id_class(rfH_22, xu_3.id_class.id_continue(), 3);
            ryO_2 ryO_22 = rRf_12.id_class(rfH_22.id_break());
            if (ryO_22 instanceof rHu_1) {
                ((rHu_1)ryO_22).id_class(rzl_3.id_throw, random.nextLong());
            }
        }
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        rfH_2 rfH_23;
        xc_3 xc_32;
        rrPN rrPN2 = new rrPN().id_class(this.id_throws).id_class(rpa_3.NONE).id_class(raL_2.id_protected.get(this.id_protected)).id_class(rrPG.id_break);
        rfH_2 rfH_24 = raL_2.id_throws.get(this.id_protected);
        rfH_2 rfH_25 = this.id_byte.id_break(rrPl_1.id_class(rrPN2, new rfH_2(3 - rfH_24.b_(), 0, 0 - rfH_24.d_())));
        int n = rRI2.id_class(rKv_1.WORLD_SURFACE_WG, rfH_25.b_(), rfH_25.d_());
        rfH_2 rfH_26 = this.id_byte;
        this.id_byte = this.id_byte.id_break(0, n - 90 - 1, 0);
        boolean bl = super.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfj_32, rfH_22);
        if (this.id_protected.equals(raL_2.id_class) && !(xc_32 = rRI2.id_byte((rfH_23 = this.id_byte.id_break(rrPl_1.id_class(rrPN2, new rfH_2(3, 0, 5)))).id_break())).id_catch() && !xc_32.id_class(xu_3.PJ)) {
            rRI2.id_class(rfH_23, xu_3.Pt.id_continue(), 3);
        }
        this.id_byte = rfH_26;
        return bl;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Template", this.id_protected.toString());
        rcd_32.id_class("Rot", this.id_throws.name());
    }

    private void id_class(rrPt_1 rrPt_12) {
        rrPl_1 rrPl_12 = rrPt_12.id_class(this.id_protected);
        rrPN rrPN2 = new rrPN().id_class(this.id_throws).id_class(rpa_3.NONE).id_class(raL_2.id_protected.get(this.id_protected)).id_class(rrPG.id_break);
        this.id_class(rrPl_12, this.id_byte, rrPN2);
    }
}

