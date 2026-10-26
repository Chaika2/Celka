/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.raI_2;
import celestial.raU_2;
import celestial.raY_2;
import celestial.rfi_3;
import celestial.rrPt_1;
import celestial.rrrH;
import celestial.rrrZ;
import celestial.rrrn_1;

public class raD_2
extends rrrH<raI_2> {
    public raD_2(rrrZ<raI_2> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, raI_2 raI_22) {
        raY_2 raY_22 = new raY_2(0, this.id_protected, (n << 4) + 2, (n2 << 4) + 2, raI_22.id_byte);
        this.id_break.add(raY_22);
        raY_22.id_class(raY_22, this.id_break, this.id_protected);
        this.id_break();
        if (raI_22.id_byte == raU_2.MESA) {
            int n3 = -5;
            int n4 = rKd_12.id_case() - this.id_byte.id_throws + this.id_byte.id_throws() / 2 - -5;
            this.id_byte.id_class(0, n4, 0);
            for (rrrn_1 rrrn_12 : this.id_break) {
                rrrn_12.id_class(0, n4, 0);
            }
        } else {
            this.id_class(rKd_12.id_case(), this.id_protected, 10);
        }
    }
}

