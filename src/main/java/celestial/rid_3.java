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

public class rid_3
extends riW_2 {
    public rid_3(rpr_3 rpr_32, riz_3 riz_32) {
        super(raF_2.id_const, 1, rpr_32, riz_32, 2, 2, 2);
    }

    public rid_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_const, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2;
        this.id_class(rRI2, rfi_32, 1, 8, 0, 14, 8, 14, id_class);
        int n3 = 7;
        xc_3 xc_32 = id_break;
        this.id_class(rRI2, rfi_32, 0, 7, 0, 0, 7, 15, xc_32, xc_32, false);
        this.id_class(rRI2, rfi_32, 15, 7, 0, 15, 7, 15, xc_32, xc_32, false);
        this.id_class(rRI2, rfi_32, 1, 7, 0, 15, 7, 0, xc_32, xc_32, false);
        this.id_class(rRI2, rfi_32, 1, 7, 15, 14, 7, 15, xc_32, xc_32, false);
        for (n2 = 1; n2 <= 6; ++n2) {
            xc_32 = id_break;
            if (n2 == 2 || n2 == 6) {
                xc_32 = id_class;
            }
            for (n = 0; n <= 15; n += 15) {
                this.id_class(rRI2, rfi_32, n, n2, 0, n, n2, 1, xc_32, xc_32, false);
                this.id_class(rRI2, rfi_32, n, n2, 6, n, n2, 9, xc_32, xc_32, false);
                this.id_class(rRI2, rfi_32, n, n2, 14, n, n2, 15, xc_32, xc_32, false);
            }
            this.id_class(rRI2, rfi_32, 1, n2, 0, 1, n2, 0, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 6, n2, 0, 9, n2, 0, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 14, n2, 0, 14, n2, 0, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 1, n2, 15, 14, n2, 15, xc_32, xc_32, false);
        }
        this.id_class(rRI2, rfi_32, 6, 3, 6, 9, 6, 9, id_byte, id_byte, false);
        this.id_class(rRI2, rfi_32, 7, 4, 7, 8, 5, 8, xu_3.rt.id_continue(), xu_3.rt.id_continue(), false);
        for (n2 = 3; n2 <= 6; n2 += 3) {
            for (n = 6; n <= 9; n += 3) {
                this.id_class(rRI2, id_throws, n, n2, 6, rfi_32);
                this.id_class(rRI2, id_throws, n, n2, 9, rfi_32);
            }
        }
        this.id_class(rRI2, rfi_32, 5, 1, 6, 5, 2, 6, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 1, 9, 5, 2, 9, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 10, 1, 6, 10, 2, 6, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 10, 1, 9, 10, 2, 9, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 1, 5, 6, 2, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 9, 1, 5, 9, 2, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, 1, 10, 6, 2, 10, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 9, 1, 10, 9, 2, 10, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 2, 5, 5, 6, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 2, 10, 5, 6, 10, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 10, 2, 5, 10, 6, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 10, 2, 10, 10, 6, 10, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 7, 1, 5, 7, 6, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 10, 7, 1, 10, 7, 6, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 5, 7, 9, 5, 7, 14, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 10, 7, 9, 10, 7, 14, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 7, 5, 6, 7, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 7, 10, 6, 7, 10, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 9, 7, 5, 14, 7, 5, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 9, 7, 10, 14, 7, 10, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 2, 1, 2, 2, 1, 3, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 3, 1, 2, 3, 1, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 13, 1, 2, 13, 1, 3, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 12, 1, 2, 12, 1, 2, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 2, 1, 12, 2, 1, 13, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 3, 1, 13, 3, 1, 13, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 13, 1, 12, 13, 1, 13, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 12, 1, 13, 12, 1, 13, id_break, id_break, false);
        return true;
    }
}

