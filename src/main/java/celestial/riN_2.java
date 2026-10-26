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
import celestial.xu_3;
import java.util.Random;

public class riN_2
extends riW_2 {
    public riN_2(rpr_3 rpr_32, riz_3 riz_32) {
        super(raF_2.B, 1, rpr_32, riz_32, 1, 1, 1);
    }

    public riN_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.B, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        if (this.id_native.id_class / 25 > 0) {
            this.id_class(rRI2, rfi_32, 0, 0, this.id_native.id_byte[rpr_3.DOWN.id_byte()]);
        }
        if (this.id_native.id_break[rpr_3.UP.id_byte()] == null) {
            this.id_class(rRI2, rfi_32, 1, 4, 1, 6, 4, 6, id_class);
        }
        for (int i = 1; i <= 6; ++i) {
            for (int j = 1; j <= 6; ++j) {
                if (random.nextInt(3) == 0) continue;
                int n = 2 + (random.nextInt(4) == 0 ? 0 : 1);
                xc_3 xc_32 = xu_3.c.id_continue();
                this.id_class(rRI2, rfi_32, i, n, j, i, 3, j, xc_32, xc_32, false);
            }
        }
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
        return true;
    }
}

