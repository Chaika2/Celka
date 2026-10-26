/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rRI;
import celestial.rRf_1;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public class rej_3
extends rrrn_1 {
    public rej_3(rfH_2 rfH_22) {
        super(raF_2.G, 0);
        this.id_final = new rfi_3(rfH_22.b_(), rfH_22.c_(), rfH_22.d_(), rfH_22.b_(), rfH_22.c_(), rfH_22.d_());
    }

    public rej_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.G, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n = rRI2.id_class(rKv_1.OCEAN_FLOOR_WG, this.id_final.id_class, this.id_final.id_byte);
        rfw_3 rfw_32 = new rfw_3(this.id_final.id_class, n, this.id_final.id_byte);
        while (rfw_32.c_() > 0) {
            xc_3 xc_32 = rRI2.id_byte(rfw_32);
            xc_3 xc_33 = rRI2.id_byte(rfw_32.id_break());
            if (xc_33 == xu_3.F.id_continue() || xc_33 == xu_3.id_break.id_continue() || xc_33 == xu_3.id_catch.id_continue() || xc_33 == xu_3.id_byte.id_continue() || xc_33 == xu_3.id_throws.id_continue()) {
                xc_3 xc_34 = !xc_32.id_catch() && !this.id_class(xc_32) ? xc_32 : xu_3.id_throw.id_continue();
                for (rpr_3 rpr_32 : rpr_3.values()) {
                    rfH_2 rfH_23 = rfw_32.id_break(rpr_32);
                    xc_3 xc_35 = rRI2.id_byte(rfH_23);
                    if (!xc_35.id_catch() && !this.id_class(xc_35)) continue;
                    rfH_2 rfH_24 = rfH_23.id_break();
                    xc_3 xc_36 = rRI2.id_byte(rfH_24);
                    if ((xc_36.id_catch() || this.id_class(xc_36)) && rpr_32 != rpr_3.UP) {
                        rRI2.id_class(rfH_23, xc_33, 3);
                        continue;
                    }
                    rRI2.id_class(rfH_23, xc_34, 3);
                }
                this.id_final = new rfi_3(rfw_32.b_(), rfw_32.c_(), rfw_32.d_(), rfw_32.b_(), rfw_32.c_(), rfw_32.d_());
                return this.id_class((rRf_1)rRI2, rfi_32, random, rfw_32, rzl_3.id_long, (xc_3)null);
            }
            rfw_32.id_byte(0, -1, 0);
        }
        return false;
    }

    private boolean id_class(xc_3 xc_32) {
        return xc_32 == xu_3.id_try.id_continue() || xc_32 == xu_3.id_instanceof.id_continue();
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
    }
}

