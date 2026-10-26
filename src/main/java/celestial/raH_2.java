/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.ral_3;
import celestial.raw_3;
import celestial.reW_2;
import celestial.reZ_2;
import celestial.rel_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rrPt_1;
import celestial.rrrI;

public class raH_2
extends raw_3<rrrI> {
    private final ral_3 id_throws;

    public raH_2(ral_3 ral_32, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(ral_32, n, n2, rfi_32, n3, l);
        this.id_throws = ral_32;
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rrrI rrrI2) {
        rfH_2 rfH_22 = new rfH_2(n * 16, this.id_throws.id_else, n2 * 16);
        reZ_2.id_class();
        reW_2.id_class(rVm_12, rrrI2, rel_3::new, rKd_12, rrPt_12, rfH_22, this.id_break, this.id_protected, this.id_throws.id_synchronized, this.id_throws.id_return);
        this.id_break();
    }
}

