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
import celestial.xc_3;
import java.util.Random;

public class rib_3
extends riW_2 {
    public rib_3(rpr_3 rpr_32, riz_3 riz_32) {
        super(raF_2.id_for, 1, rpr_32, riz_32, 1, 2, 2);
    }

    public rib_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_for, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        xc_3 xc_32;
        int n;
        riz_3 riz_32 = this.id_native.id_break[rpr_3.NORTH.id_byte()];
        riz_3 riz_33 = this.id_native;
        riz_3 riz_34 = riz_32.id_break[rpr_3.UP.id_byte()];
        riz_3 riz_35 = riz_33.id_break[rpr_3.UP.id_byte()];
        if (this.id_native.id_class / 25 > 0) {
            this.id_class(rRI2, rfi_32, 0, 8, riz_32.id_byte[rpr_3.DOWN.id_byte()]);
            this.id_class(rRI2, rfi_32, 0, 0, riz_33.id_byte[rpr_3.DOWN.id_byte()]);
        }
        if (riz_35.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 1, 8, 1, 6, 8, 7, id_class);
        }
        if (riz_34.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 1, 8, 8, 6, 8, 14, id_class);
        }
        for (n = 1; n <= 7; ++n) {
            xc_32 = id_break;
            if (n == 2 || n == 6) {
                xc_32 = id_class;
            }
            this.id_class(rRI2, rfi_32, 0, n, 0, 0, n, 15, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 7, n, 0, 7, n, 15, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 1, n, 0, 6, n, 0, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 1, n, 15, 6, n, 15, xc_32, xc_32, false);
        }
        for (n = 1; n <= 7; ++n) {
            xc_32 = id_byte;
            if (n == 2 || n == 6) {
                xc_32 = id_throws;
            }
            this.id_class(rRI2, rfi_32, 3, n, 7, 4, n, 8, xc_32, xc_32, false);
        }
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
        if (riz_35.id_byte[rpr_3.SOUTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 3, 5, 0, 4, 6, 0);
        }
        if (riz_35.id_byte[rpr_3.EAST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 7, 5, 3, 7, 6, 4);
            this.id_class(rRI2, rfi_32, 5, 4, 2, 6, 4, 5, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 6, 1, 2, 6, 3, 2, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 6, 1, 5, 6, 3, 5, id_break, id_break, false);
        }
        if (riz_35.id_byte[rpr_3.WEST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 0, 5, 3, 0, 6, 4);
            this.id_class(rRI2, rfi_32, 1, 4, 2, 2, 4, 5, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 1, 1, 2, 1, 3, 2, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 1, 1, 5, 1, 3, 5, id_break, id_break, false);
        }
        if (riz_34.id_byte[rpr_3.NORTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 3, 5, 15, 4, 6, 15);
        }
        if (riz_34.id_byte[rpr_3.WEST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 0, 5, 11, 0, 6, 12);
            this.id_class(rRI2, rfi_32, 1, 4, 10, 2, 4, 13, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 1, 1, 10, 1, 3, 10, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 1, 1, 13, 1, 3, 13, id_break, id_break, false);
        }
        if (riz_34.id_byte[rpr_3.EAST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 7, 5, 11, 7, 6, 12);
            this.id_class(rRI2, rfi_32, 5, 4, 10, 6, 4, 13, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 6, 1, 10, 6, 3, 10, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 6, 1, 13, 6, 3, 13, id_break, id_break, false);
        }
        return true;
    }
}

