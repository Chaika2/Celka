/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.riC_2;
import celestial.rin_3;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrrZ;

public class riy_3
extends rrrH<rin_3> {
    public riy_3(rrrZ<rin_3> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rin_3 rin_32) {
        int n3 = n * 16;
        int n4 = n2 * 16;
        rfH_2 rfH_22 = new rfH_2(n3, 90, n4);
        rqd_3 rqd_32 = rqd_3.id_class(this.id_protected);
        riC_2.id_class(rrPt_12, rfH_22, rqd_32, this.id_break, this.id_protected, rin_32);
        this.id_break();
    }
}

