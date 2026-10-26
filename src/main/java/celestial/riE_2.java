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

public class riE_2
extends riW_2 {
    public riE_2(rpr_3 rpr_32, riz_3 riz_32) {
        super(raF_2.id_boolean, 1, rpr_32, riz_32, 2, 2, 1);
    }

    public riE_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_boolean, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        riz_3 riz_32 = this.id_native.id_break[rpr_3.EAST.id_byte()];
        riz_3 riz_33 = this.id_native;
        riz_3 riz_34 = riz_33.id_break[rpr_3.UP.id_byte()];
        riz_3 riz_35 = riz_32.id_break[rpr_3.UP.id_byte()];
        if (this.id_native.id_class / 25 > 0) {
            this.id_class(rRI2, rfi_32, 8, 0, riz_32.id_byte[rpr_3.DOWN.id_byte()]);
            this.id_class(rRI2, rfi_32, 0, 0, riz_33.id_byte[rpr_3.DOWN.id_byte()]);
        }
        if (riz_34.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 1, 8, 1, 7, 8, 6, id_class);
        }
        if (riz_35.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 8, 8, 1, 14, 8, 6, id_class);
        }
        for (int i = 1; i <= 7; ++i) {
            xc_3 xc_32 = id_break;
            if (i == 2 || i == 6) {
                xc_32 = id_class;
            }
            this.id_class(rRI2, rfi_32, 0, i, 0, 0, i, 7, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 15, i, 0, 15, i, 7, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 1, i, 0, 15, i, 0, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 1, i, 7, 14, i, 7, xc_32, xc_32, false);
        }
        this.id_class(rRI2, rfi_32, 2, 1, 3, 2, 7, 4, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 3, 1, 2, 4, 7, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 3, 1, 5, 4, 7, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 13, 1, 3, 13, 7, 4, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 11, 1, 2, 12, 7, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 11, 1, 5, 12, 7, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 1, 3, 5, 3, 4, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 10, 1, 3, 10, 3, 4, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 7, 2, 10, 7, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 5, 2, 5, 7, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 10, 5, 2, 10, 7, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 5, 5, 5, 7, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 10, 5, 5, 10, 7, 5, id_break, id_break, false);
        this.id_class(rRI2, id_break, 6, 6, 2, rfi_32);
        this.id_class(rRI2, id_break, 9, 6, 2, rfi_32);
        this.id_class(rRI2, id_break, 6, 6, 5, rfi_32);
        this.id_class(rRI2, id_break, 9, 6, 5, rfi_32);
        this.id_class(rRI2, rfi_32, 5, 4, 3, 6, 4, 4, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 9, 4, 3, 10, 4, 4, id_break, id_break, false);
        this.id_class(rRI2, id_throws, 5, 4, 2, rfi_32);
        this.id_class(rRI2, id_throws, 5, 4, 5, rfi_32);
        this.id_class(rRI2, id_throws, 10, 4, 2, rfi_32);
        this.id_class(rRI2, id_throws, 10, 4, 5, rfi_32);
        if (riz_33.id_byte[rpr_3.SOUTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 3, 1, 0, 4, 2, 0);
        }
        if (riz_33.id_byte[rpr_3.NORTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 3, 1, 7, 4, 2, 7);
        }
        if (riz_33.id_byte[rpr_3.WEST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 0, 1, 3, 0, 2, 4);
        }
        if (riz_32.id_byte[rpr_3.SOUTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 11, 1, 0, 12, 2, 0);
        }
        if (riz_32.id_byte[rpr_3.NORTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 11, 1, 7, 12, 2, 7);
        }
        if (riz_32.id_byte[rpr_3.EAST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 15, 1, 3, 15, 2, 4);
        }
        if (riz_34.id_byte[rpr_3.SOUTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 3, 5, 0, 4, 6, 0);
        }
        if (riz_34.id_byte[rpr_3.NORTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 3, 5, 7, 4, 6, 7);
        }
        if (riz_34.id_byte[rpr_3.WEST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 0, 5, 3, 0, 6, 4);
        }
        if (riz_35.id_byte[rpr_3.SOUTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 11, 5, 0, 12, 6, 0);
        }
        if (riz_35.id_byte[rpr_3.NORTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 11, 5, 7, 12, 6, 7);
        }
        if (riz_35.id_byte[rpr_3.EAST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 15, 5, 3, 15, 6, 4);
        }
        return true;
    }
}

