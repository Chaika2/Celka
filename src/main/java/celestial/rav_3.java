/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rUt_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rac_3;
import celestial.rfi_3;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.rrrn_1;
import java.util.List;

public class rav_3
extends rrrH<rUt_1> {
    public rav_3(rrrZ<rUt_1> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rUt_1 rUt_12) {
        rac_3 rac_32 = new rac_3(this.id_protected, (n << 4) + 2, (n2 << 4) + 2);
        this.id_break.add(rac_32);
        rac_32.id_class(rac_32, this.id_break, this.id_protected);
        List<rrrn_1> list = rac_32.id_protected;
        while (!list.isEmpty()) {
            int n3 = this.id_protected.nextInt(list.size());
            rrrn_1 rrrn_12 = list.remove(n3);
            rrrn_12.id_class(rac_32, this.id_break, this.id_protected);
        }
        this.id_break();
        this.id_class(this.id_protected, 48, 70);
    }
}

