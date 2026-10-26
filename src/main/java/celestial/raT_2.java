/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rUt_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.ray_3;
import celestial.rfi_3;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrrZ;

public class raT_2
extends rrrH<rUt_1> {
    public raT_2(rrrZ<rUt_1> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rUt_1 rUt_12) {
        ray_3 ray_32 = new ray_3(this.id_protected, n * 16, n2 * 16);
        this.id_break.add(ray_32);
        this.id_break();
    }
}

