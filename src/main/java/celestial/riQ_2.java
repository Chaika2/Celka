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

public class riQ_2
extends riW_2 {
    private int id_int;

    public riQ_2(rpr_3 rpr_32, riz_3 riz_32, Random random) {
        super(raF_2.P, 1, rpr_32, riz_32, 1, 1, 1);
        this.id_int = random.nextInt(3);
    }

    public riQ_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.P, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        boolean bl;
        if (this.id_native.id_class / 25 > 0) {
            this.id_class(rRI2, rfi_32, 0, 0, this.id_native.id_byte[rpr_3.DOWN.id_byte()]);
        }
        if (this.id_native.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 1, 4, 1, 6, 4, 6, id_class);
        }
        boolean bl2 = bl = this.id_int != 0 && random.nextBoolean() && !this.id_native.id_byte[rpr_3.DOWN.id_byte()] && !this.id_native.id_byte[rpr_3.UP.id_byte()] && this.id_native.id_byte() > 1;
        if (this.id_int == 0) {
            this.id_class(rRI2, rfi_32, 0, 1, 0, 2, 1, 2, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 0, 3, 0, 2, 3, 2, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 0, 2, 0, 0, 2, 2, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 1, 2, 0, 2, 2, 0, id_class, id_class, false);
            this.id_class(rRI2, id_throws, 1, 2, 1, rfi_32);
            this.id_class(rRI2, rfi_32, 5, 1, 0, 7, 1, 2, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 5, 3, 0, 7, 3, 2, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 7, 2, 0, 7, 2, 2, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 5, 2, 0, 6, 2, 0, id_class, id_class, false);
            this.id_class(rRI2, id_throws, 6, 2, 1, rfi_32);
            this.id_class(rRI2, rfi_32, 0, 1, 5, 2, 1, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 0, 3, 5, 2, 3, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 0, 2, 5, 0, 2, 7, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 1, 2, 7, 2, 2, 7, id_class, id_class, false);
            this.id_class(rRI2, id_throws, 1, 2, 6, rfi_32);
            this.id_class(rRI2, rfi_32, 5, 1, 5, 7, 1, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 5, 3, 5, 7, 3, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 7, 2, 5, 7, 2, 7, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 5, 2, 7, 6, 2, 7, id_class, id_class, false);
            this.id_class(rRI2, id_throws, 6, 2, 6, rfi_32);
            if (this.id_native.id_byte[rpr_3.SOUTH.id_byte()]) {
                this.id_class(rRI2, rfi_32, 3, 3, 0, 4, 3, 0, id_break, id_break, false);
            } else {
                this.id_class(rRI2, rfi_32, 3, 3, 0, 4, 3, 1, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 3, 2, 0, 4, 2, 0, id_class, id_class, false);
                this.id_class(rRI2, rfi_32, 3, 1, 0, 4, 1, 1, id_break, id_break, false);
            }
            if (this.id_native.id_byte[rpr_3.NORTH.id_byte()]) {
                this.id_class(rRI2, rfi_32, 3, 3, 7, 4, 3, 7, id_break, id_break, false);
            } else {
                this.id_class(rRI2, rfi_32, 3, 3, 6, 4, 3, 7, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 3, 2, 7, 4, 2, 7, id_class, id_class, false);
                this.id_class(rRI2, rfi_32, 3, 1, 6, 4, 1, 7, id_break, id_break, false);
            }
            if (this.id_native.id_byte[rpr_3.WEST.id_byte()]) {
                this.id_class(rRI2, rfi_32, 0, 3, 3, 0, 3, 4, id_break, id_break, false);
            } else {
                this.id_class(rRI2, rfi_32, 0, 3, 3, 1, 3, 4, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 0, 2, 3, 0, 2, 4, id_class, id_class, false);
                this.id_class(rRI2, rfi_32, 0, 1, 3, 1, 1, 4, id_break, id_break, false);
            }
            if (this.id_native.id_byte[rpr_3.EAST.id_byte()]) {
                this.id_class(rRI2, rfi_32, 7, 3, 3, 7, 3, 4, id_break, id_break, false);
            } else {
                this.id_class(rRI2, rfi_32, 6, 3, 3, 7, 3, 4, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 7, 2, 3, 7, 2, 4, id_class, id_class, false);
                this.id_class(rRI2, rfi_32, 6, 1, 3, 7, 1, 4, id_break, id_break, false);
            }
        } else if (this.id_int == 1) {
            this.id_class(rRI2, rfi_32, 2, 1, 2, 2, 3, 2, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 2, 1, 5, 2, 3, 5, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 5, 1, 5, 5, 3, 5, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 5, 1, 2, 5, 3, 2, id_break, id_break, false);
            this.id_class(rRI2, id_throws, 2, 2, 2, rfi_32);
            this.id_class(rRI2, id_throws, 2, 2, 5, rfi_32);
            this.id_class(rRI2, id_throws, 5, 2, 5, rfi_32);
            this.id_class(rRI2, id_throws, 5, 2, 2, rfi_32);
            this.id_class(rRI2, rfi_32, 0, 1, 0, 1, 3, 0, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 0, 1, 1, 0, 3, 1, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 0, 1, 7, 1, 3, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 0, 1, 6, 0, 3, 6, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 6, 1, 7, 7, 3, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 7, 1, 6, 7, 3, 6, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 6, 1, 0, 7, 3, 0, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 7, 1, 1, 7, 3, 1, id_break, id_break, false);
            this.id_class(rRI2, id_class, 1, 2, 0, rfi_32);
            this.id_class(rRI2, id_class, 0, 2, 1, rfi_32);
            this.id_class(rRI2, id_class, 1, 2, 7, rfi_32);
            this.id_class(rRI2, id_class, 0, 2, 6, rfi_32);
            this.id_class(rRI2, id_class, 6, 2, 7, rfi_32);
            this.id_class(rRI2, id_class, 7, 2, 6, rfi_32);
            this.id_class(rRI2, id_class, 6, 2, 0, rfi_32);
            this.id_class(rRI2, id_class, 7, 2, 1, rfi_32);
            if (!this.id_native.id_byte[rpr_3.SOUTH.id_byte()]) {
                this.id_class(rRI2, rfi_32, 1, 3, 0, 6, 3, 0, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 1, 2, 0, 6, 2, 0, id_class, id_class, false);
                this.id_class(rRI2, rfi_32, 1, 1, 0, 6, 1, 0, id_break, id_break, false);
            }
            if (!this.id_native.id_byte[rpr_3.NORTH.id_byte()]) {
                this.id_class(rRI2, rfi_32, 1, 3, 7, 6, 3, 7, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 1, 2, 7, 6, 2, 7, id_class, id_class, false);
                this.id_class(rRI2, rfi_32, 1, 1, 7, 6, 1, 7, id_break, id_break, false);
            }
            if (!this.id_native.id_byte[rpr_3.WEST.id_byte()]) {
                this.id_class(rRI2, rfi_32, 0, 3, 1, 0, 3, 6, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 0, 2, 1, 0, 2, 6, id_class, id_class, false);
                this.id_class(rRI2, rfi_32, 0, 1, 1, 0, 1, 6, id_break, id_break, false);
            }
            if (!this.id_native.id_byte[rpr_3.EAST.id_byte()]) {
                this.id_class(rRI2, rfi_32, 7, 3, 1, 7, 3, 6, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, 7, 2, 1, 7, 2, 6, id_class, id_class, false);
                this.id_class(rRI2, rfi_32, 7, 1, 1, 7, 1, 6, id_break, id_break, false);
            }
        } else if (this.id_int == 2) {
            this.id_class(rRI2, rfi_32, 0, 1, 0, 0, 1, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 7, 1, 0, 7, 1, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 1, 1, 0, 6, 1, 0, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 1, 1, 7, 6, 1, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 0, 2, 0, 0, 2, 7, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 7, 2, 0, 7, 2, 7, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 1, 2, 0, 6, 2, 0, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 1, 2, 7, 6, 2, 7, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 0, 3, 0, 0, 3, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 7, 3, 0, 7, 3, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 1, 3, 0, 6, 3, 0, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 1, 3, 7, 6, 3, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 0, 1, 3, 0, 2, 4, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 7, 1, 3, 7, 2, 4, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 3, 1, 0, 4, 2, 0, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 3, 1, 7, 4, 2, 7, id_byte, id_byte, false);
            if (this.id_native.id_byte[rpr_3.SOUTH.id_byte()]) {
                this.id_class(rRI2, rfi_32, 3, 1, 0, 4, 2, 0);
            }
            if (this.id_native.id_byte[rpr_3.NORTH.id_byte()]) {
                this.id_class(rRI2, rfi_32, 3, 1, 7, 4, 2, 7);
            }
            if (this.id_native.id_byte[rpr_3.WEST.id_byte()]) {
                this.id_class(rRI2, rfi_32, 0, 1, 3, 0, 2, 4);
            }
            if (this.id_native.id_byte[rpr_3.EAST.id_byte()]) {
                this.id_class(rRI2, rfi_32, 7, 1, 3, 7, 2, 4);
            }
        }
        if (bl) {
            this.id_class(rRI2, rfi_32, 3, 1, 3, 4, 1, 4, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 3, 2, 3, 4, 2, 4, id_class, id_class, false);
            this.id_class(rRI2, rfi_32, 3, 3, 3, 4, 3, 4, id_break, id_break, false);
        }
        return true;
    }
}

