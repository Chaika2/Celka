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
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import java.util.Random;

public class ric_3
extends riW_2 {
    private int id_int;

    public ric_3(rpr_3 rpr_32, rfi_3 rfi_32, int n) {
        super(raF_2.S, rpr_32, rfi_32);
        this.id_int = n & 1;
    }

    public ric_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.S, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        if (this.id_int == 0) {
            int n;
            for (n = 0; n < 4; ++n) {
                this.id_class(rRI2, rfi_32, 10 - n, 3 - n, 20 - n, 12 + n, 3 - n, 20, id_break, id_break, false);
            }
            this.id_class(rRI2, rfi_32, 7, 0, 6, 15, 0, 16, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 6, 0, 6, 6, 3, 20, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 16, 0, 6, 16, 3, 20, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 7, 1, 7, 7, 1, 20, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 15, 1, 7, 15, 1, 20, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 7, 1, 6, 9, 3, 6, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 13, 1, 6, 15, 3, 6, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 8, 1, 7, 9, 1, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 13, 1, 7, 14, 1, 7, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 9, 0, 5, 13, 0, 5, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 10, 0, 7, 12, 0, 7, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 8, 0, 10, 8, 0, 12, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 14, 0, 10, 14, 0, 12, id_byte, id_byte, false);
            for (n = 18; n >= 7; n -= 3) {
                this.id_class(rRI2, id_throws, 6, 3, n, rfi_32);
                this.id_class(rRI2, id_throws, 16, 3, n, rfi_32);
            }
            this.id_class(rRI2, id_throws, 10, 0, 10, rfi_32);
            this.id_class(rRI2, id_throws, 12, 0, 10, rfi_32);
            this.id_class(rRI2, id_throws, 10, 0, 12, rfi_32);
            this.id_class(rRI2, id_throws, 12, 0, 12, rfi_32);
            this.id_class(rRI2, id_throws, 8, 3, 6, rfi_32);
            this.id_class(rRI2, id_throws, 14, 3, 6, rfi_32);
            this.id_class(rRI2, id_break, 4, 2, 4, rfi_32);
            this.id_class(rRI2, id_throws, 4, 1, 4, rfi_32);
            this.id_class(rRI2, id_break, 4, 0, 4, rfi_32);
            this.id_class(rRI2, id_break, 18, 2, 4, rfi_32);
            this.id_class(rRI2, id_throws, 18, 1, 4, rfi_32);
            this.id_class(rRI2, id_break, 18, 0, 4, rfi_32);
            this.id_class(rRI2, id_break, 4, 2, 18, rfi_32);
            this.id_class(rRI2, id_throws, 4, 1, 18, rfi_32);
            this.id_class(rRI2, id_break, 4, 0, 18, rfi_32);
            this.id_class(rRI2, id_break, 18, 2, 18, rfi_32);
            this.id_class(rRI2, id_throws, 18, 1, 18, rfi_32);
            this.id_class(rRI2, id_break, 18, 0, 18, rfi_32);
            this.id_class(rRI2, id_break, 9, 7, 20, rfi_32);
            this.id_class(rRI2, id_break, 13, 7, 20, rfi_32);
            this.id_class(rRI2, rfi_32, 6, 0, 21, 7, 4, 21, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 15, 0, 21, 16, 4, 21, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 11, 2, 16);
        } else if (this.id_int == 1) {
            int n;
            this.id_class(rRI2, rfi_32, 9, 3, 18, 13, 3, 20, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 9, 0, 18, 9, 2, 18, id_break, id_break, false);
            this.id_class(rRI2, rfi_32, 13, 0, 18, 13, 2, 18, id_break, id_break, false);
            int n2 = 9;
            int n3 = 20;
            int n4 = 5;
            for (n = 0; n < 2; ++n) {
                this.id_class(rRI2, id_break, n2, 6, 20, rfi_32);
                this.id_class(rRI2, id_throws, n2, 5, 20, rfi_32);
                this.id_class(rRI2, id_break, n2, 4, 20, rfi_32);
                n2 = 13;
            }
            this.id_class(rRI2, rfi_32, 7, 3, 7, 15, 3, 14, id_break, id_break, false);
            n2 = 10;
            for (n = 0; n < 2; ++n) {
                this.id_class(rRI2, rfi_32, n2, 0, 10, n2, 6, 10, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n2, 0, 12, n2, 6, 12, id_break, id_break, false);
                this.id_class(rRI2, id_throws, n2, 0, 10, rfi_32);
                this.id_class(rRI2, id_throws, n2, 0, 12, rfi_32);
                this.id_class(rRI2, id_throws, n2, 4, 10, rfi_32);
                this.id_class(rRI2, id_throws, n2, 4, 12, rfi_32);
                n2 = 12;
            }
            n2 = 8;
            for (n = 0; n < 2; ++n) {
                this.id_class(rRI2, rfi_32, n2, 0, 7, n2, 2, 7, id_break, id_break, false);
                this.id_class(rRI2, rfi_32, n2, 0, 14, n2, 2, 14, id_break, id_break, false);
                n2 = 14;
            }
            this.id_class(rRI2, rfi_32, 8, 3, 8, 8, 3, 13, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 14, 3, 8, 14, 3, 13, id_byte, id_byte, false);
            this.id_class(rRI2, rfi_32, 11, 5, 13);
        }
        return true;
    }
}

