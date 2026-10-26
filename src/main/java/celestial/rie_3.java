/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.riK_2;
import celestial.rio_3;
import celestial.rqd_3;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrrZ;

public class rie_3
extends rrrH<rio_3> {
    public rie_3(rrrZ<rio_3> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rio_3 rio_32) {
        rqd_3 rqd_32 = rqd_3.id_class(this.id_protected);
        rfH_2 rfH_22 = new rfH_2(n * 16, 90, n2 * 16);
        riK_2.id_class(rrPt_12, rfH_22, rqd_32, this.id_break, this.id_protected, rio_32);
        this.id_break();
    }
}

