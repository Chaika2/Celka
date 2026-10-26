/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.riW_2;
import celestial.riz_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import java.util.Random;

public class riG_2
extends riW_2 {
    public riG_2(rpr_3 rpr_32, riz_3 riz_32) {
        super(raF_2.id_transient, 1, rpr_32, riz_32, 1, 2, 1);
    }

    public riG_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_transient, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        if (this.id_native.id_class / 25 > 0) {
            this.id_class(rRI2, rfi_32, 0, 0, this.id_native.id_byte[rpr_3.DOWN.id_byte()]);
        }
        riz_3 riz_32 = this.id_native.id_break[rpr_3.UP.id_byte()];
        if (riz_32.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 1, 8, 1, 6, 8, 6, id_class);
        }
        this.id_class(rRI2, rfi_32, 0, 4, 0, 0, 4, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 7, 4, 0, 7, 4, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 4, 0, 6, 4, 0, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 4, 7, 6, 4, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 2, 4, 1, 2, 4, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 4, 2, 1, 4, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 4, 1, 5, 4, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 4, 2, 6, 4, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 2, 4, 5, 2, 4, 6, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 4, 5, 1, 4, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 4, 5, 5, 4, 6, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 4, 5, 6, 4, 5, id_break, id_break, false);
        riz_3 riz_33 = this.id_native;
        for (int i = 1; i <= 5; i += 4) {
            int n = 0;
            if (riz_33.id_byte[rpr_3.SOUTH.id_byte()]) {
                this.id_class(rRI2, rfi_32, 2, i, n, 2, i + 2, n, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 5, i, n, 5, i + 2, n, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 3, i + 2, n, 4, i + 2, n, id_break, id_break, false);
            } else {
                this.id_class(rRI2, rfi_32, 0, i, n, 7, i + 2, n, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 0, i + 1, n, 7, i + 1, n, id_class, id_class, false);
            }
            n = 7;
            if (riz_33.id_byte[rpr_3.NORTH.id_byte()]) {
                this.id_class(rRI2, rfi_32, 2, i, n, 2, i + 2, n, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 5, i, n, 5, i + 2, n, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 3, i + 2, n, 4, i + 2, n, id_break, id_break, false);
            } else {
                this.id_class(rRI2, rfi_32, 0, i, n, 7, i + 2, n, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 0, i + 1, n, 7, i + 1, n, id_class, id_class, false);
            }
            int n2 = 0;
            if (riz_33.id_byte[rpr_3.WEST.id_byte()]) {
                this.id_class(rRI2, rfi_32, n2, i, 2, n2, i + 2, 2, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n2, i, 5, n2, i + 2, 5, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n2, i + 2, 3, n2, i + 2, 4, id_break, id_break, false);
            } else {
                this.id_class(rRI2, rfi_32, n2, i, 0, n2, i + 2, 7, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n2, i + 1, 0, n2, i + 1, 7, id_class, id_class, false);
            }
            n2 = 7;
            if (riz_33.id_byte[rpr_3.EAST.id_byte()]) {
                this.id_class(rRI2, rfi_32, n2, i, 2, n2, i + 2, 2, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n2, i, 5, n2, i + 2, 5, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n2, i + 2, 3, n2, i + 2, 4, id_break, id_break, false);
            } else {
                this.id_class(rRI2, rfi_32, n2, i, 0, n2, i + 2, 7, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n2, i + 1, 0, n2, i + 1, 7, id_class, id_class, false);
            }
            riz_33 = riz_32;
        }
        return true;
    }
}

