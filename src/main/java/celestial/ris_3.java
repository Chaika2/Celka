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

public class ris_3
extends riW_2 {
    public ris_3(rpr_3 rpr_32, riz_3 riz_32) {
        super(raF_2.id_strictfp, 1, rpr_32, riz_32, 2, 1, 1);
    }

    public ris_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_strictfp, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        riz_3 riz_32 = this.id_native.id_break[rpr_3.EAST.id_byte()];
        riz_3 riz_33 = this.id_native;
        if (this.id_native.id_class / 25 > 0) {
            this.id_class(rRI2, rfi_32, 8, 0, riz_32.id_byte[rpr_3.DOWN.id_byte()]);
            this.id_class(rRI2, rfi_32, 0, 0, riz_33.id_byte[rpr_3.DOWN.id_byte()]);
        }
        if (riz_33.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 1, 4, 1, 7, 4, 6, id_class);
        }
        if (riz_32.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 8, 4, 1, 14, 4, 6, id_class);
        }
        this.id_class(rRI2, rfi_32, 0, 3, 0, 0, 3, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 15, 3, 0, 15, 3, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 3, 0, 15, 3, 0, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 3, 7, 14, 3, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 0, 2, 0, 0, 2, 7, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 15, 2, 0, 15, 2, 7, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 1, 2, 0, 15, 2, 0, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 1, 2, 7, 14, 2, 7, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 0, 1, 0, 0, 1, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 15, 1, 0, 15, 1, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 1, 0, 15, 1, 0, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 1, 7, 14, 1, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 1, 0, 10, 1, 4, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 2, 0, 9, 2, 3, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 5, 3, 0, 10, 3, 4, id_break, id_break, false);
        this.id_class(rRI2, id_throws, 6, 2, 3, rfi_32);
        this.id_class(rRI2, id_throws, 9, 2, 3, rfi_32);
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
        return true;
    }
}

