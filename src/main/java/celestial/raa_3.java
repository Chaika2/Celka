/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rRq_1;
import celestial.rUt_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rai_3;
import celestial.raw_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrZ;
import celestial.xc_3;
import celestial.xu_3;

public class raa_3
extends raw_3<rUt_1> {
    public raa_3(rrrZ<rUt_1> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rUt_1 rUt_12) {
        int n3;
        rfj_3 rfj_32 = new rfj_3(n, n2);
        int n4 = rfj_32.id_break() + this.id_protected.nextInt(16);
        int n5 = rfj_32.id_byte() + this.id_protected.nextInt(16);
        int n6 = rKd_12.id_case();
        rRq_1 rRq_12 = rKd_12.id_class(n4, n5);
        rfw_3 rfw_32 = new rfw_3(n4, n3, n5);
        for (n3 = n6 + this.id_protected.nextInt(rKd_12.id_throws() - 2 - n6); n3 > n6; --n3) {
            xc_3 xc_32 = rRq_12.id_byte(rfw_32);
            rfw_32.id_class(rpr_3.DOWN);
            xc_3 xc_33 = rRq_12.id_byte(rfw_32);
            if (xc_32.id_catch() && (xc_33.id_class(xu_3.PY) || xc_33.id_protected(rRq_12, rfw_32, rpr_3.UP))) break;
        }
        if (n3 > n6) {
            rai_3.id_class(rrPt_12, this.id_break, this.id_protected, new rfH_2(n4, n3, n5));
            this.id_break();
        }
    }
}

