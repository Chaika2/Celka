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

public class riO_2
extends riW_2 {
    public riO_2(rpr_3 rpr_32, riz_3 riz_32) {
        super(raF_2.id_switch, 1, rpr_32, riz_32, 1, 1, 1);
    }

    public riO_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_switch, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 3, 0, 2, 3, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 3, 0, 7, 3, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 0, 2, 0, 1, 2, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 2, 0, 7, 2, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 0, 1, 0, 0, 1, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 7, 1, 0, 7, 1, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 0, 1, 7, 7, 3, 7, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 1, 0, 2, 3, 0, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 1, 0, 6, 3, 0, id_break, id_break, false);
        if (this.id_native.id_byte[rpr_3.NORTH.id_byte()]) {
            this.id_class(rRI2, rfi_32, 3, 1, 7, 4, 2, 7);
        }
        if (this.id_native.id_byte[rpr_3.WEST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 0, 1, 3, 1, 2, 4);
        }
        if (this.id_native.id_byte[rpr_3.EAST.id_byte()]) {
            this.id_class(rRI2, rfi_32, 6, 1, 3, 7, 2, 4);
        }
        return true;
    }
}

