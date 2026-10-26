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

public class riM_2
extends riW_2 {
    public riM_2(rpr_3 rpr_32, riz_3 riz_32) {
        super(raF_2.id_double, 1, rpr_32, riz_32, 1, 1, 2);
    }

    public riM_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_double, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        riz_3 riz_32 = this.id_native.id_break[rpr_3.NORTH.id_byte()];
        riz_3 riz_33 = this.id_native;
        if (this.id_native.id_class / 25 > 0) {
            this.id_class(rRI2, rfi_32, 0, 8, riz_32.id_byte[rpr_3.DOWN.id_byte()]);
            this.id_class(rRI2, rfi_32, 0, 0, riz_33.id_byte[rpr_3.DOWN.id_byte()]);
        }
        if (riz_33.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 1, 4, 1, 6, 4, 7, id_class);
        }
        if (riz_32.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 1, 4, 8, 6, 4, 14, id_class);
        }
        this.id_class(rRI2, rfi_32, 0, 3, 0, 0, 3, 15, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 7, 3, 0, 7, 3, 15, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 3, 0, 7, 3, 0, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 3, 15, 6, 3, 15, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 0, 2, 0, 0, 2, 15, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 7, 2, 0, 7, 2, 15, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 1, 2, 0, 7, 2, 0, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 1, 2, 15, 6, 2, 15, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 0, 1, 0, 0, 1, 15, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 7, 1, 0, 7, 1, 15, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 1, 0, 7, 1, 0, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 1, 15, 6, 1, 15, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 1, 1, 1, 1, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 1, 1, 6, 1, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 3, 1, 1, 3, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 3, 1, 6, 3, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 1, 13, 1, 1, 14, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 1, 13, 6, 1, 14, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 3, 13, 1, 3, 14, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 3, 13, 6, 3, 14, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 2, 1, 6, 2, 3, 6, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 1, 6, 5, 3, 6, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 2, 1, 9, 2, 3, 9, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 1, 9, 5, 3, 9, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 3, 2, 6, 4, 2, 6, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 3, 2, 9, 4, 2, 9, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 2, 2, 7, 2, 2, 8, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 2, 7, 5, 2, 8, id_break, id_break, false);
        this.id_class(rRI2, id_throws, 2, 2, 5, rfi_32);
        this.id_class(rRI2, id_throws, 5, 2, 5, rfi_32);
        this.id_class(rRI2, id_throws, 2, 2, 10, rfi_32);
        this.id_class(rRI2, id_throws, 5, 2, 10, rfi_32);
        this.id_class(rRI2, id_break, 2, 3, 5, rfi_32);
        this.id_class(rRI2, id_break, 5, 3, 5, rfi_32);
        this.id_class(rRI2, id_break, 2, 3, 10, rfi_32);
        this.id_class(rRI2, id_break, 5, 3, 10, rfi_32);
        if (riz_33.id_byte[rpr_3.SOUTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 3, 1, 0, 4, 2, 0);
        }
        if (riz_33.id_byte[rpr_3.EAST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 7, 1, 3, 7, 2, 4);
        }
        if (riz_33.id_byte[rpr_3.WEST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 0, 1, 3, 0, 2, 4);
        }
        if (riz_32.id_byte[rpr_3.NORTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 3, 1, 15, 4, 2, 15);
        }
        if (riz_32.id_byte[rpr_3.WEST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 0, 1, 11, 0, 2, 12);
        }
        if (riz_32.id_byte[rpr_3.EAST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 7, 1, 11, 7, 2, 12);
        }
        return true;
    }
}

