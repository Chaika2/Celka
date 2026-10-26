/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rUV;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rej_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrrZ;

public class reg_3
extends rrrH<rUV> {
    public reg_3(rrrZ<rUV> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public rfH_2 id_class() {
        return new rfH_2((this.id_case() << 4) + 9, 0, (this.id_catch() << 4) + 9);
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rUV rUV2) {
        int n3 = n * 16;
        int n4 = n2 * 16;
        rfH_2 rfH_22 = new rfH_2(n3 + 9, 90, n4 + 9);
        this.id_break.add(new rej_3(rfH_22));
        this.id_break();
    }
}

