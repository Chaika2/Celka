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

public class rik_3
extends riW_2 {
    public rik_3(rpr_3 rpr_32, rfi_3 rfi_32) {
        super(raF_2.r, rpr_32, rfi_32);
    }

    public rik_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.r, rcd_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        this.id_class(rRI2, rfi_32, 2, -1, 2, 11, -1, 11, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 0, -1, 0, 1, -1, 11, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 12, -1, 0, 13, -1, 11, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 2, -1, 0, 11, -1, 1, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 2, -1, 12, 11, -1, 13, id_class, id_class, false);
        this.id_class(rRI2, rfi_32, 0, 0, 0, 0, 0, 13, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 13, 0, 0, 13, 0, 13, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 0, 0, 12, 0, 0, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 1, 0, 13, 12, 0, 13, id_break, id_break, false);
        for (n = 2; n <= 11; n += 3) {
            this.id_class(rRI2, id_throws, 0, 0, n, rfi_32);
            this.id_class(rRI2, id_throws, 13, 0, n, rfi_32);
            this.id_class(rRI2, id_throws, n, 0, 0, rfi_32);
        }
        this.id_class(rRI2, rfi_32, 2, 0, 3, 4, 0, 9, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 9, 0, 3, 11, 0, 9, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 4, 0, 9, 9, 0, 11, id_break, id_break, false);
        this.id_class(rRI2, id_break, 5, 0, 8, rfi_32);
        this.id_class(rRI2, id_break, 8, 0, 8, rfi_32);
        this.id_class(rRI2, id_break, 10, 0, 10, rfi_32);
        this.id_class(rRI2, id_break, 3, 0, 10, rfi_32);
        this.id_class(rRI2, rfi_32, 3, 0, 3, 3, 0, 7, id_byte, id_byte, false);
        this.id_class(rRI2, rfi_32, 10, 0, 3, 10, 0, 7, id_byte, id_byte, false);
        this.id_class(rRI2, rfi_32, 6, 0, 10, 7, 0, 10, id_byte, id_byte, false);
        n = 3;
        for (int i = 0; i < 2; ++i) {
            for (int j = 2; j <= 8; j += 3) {
                this.id_class(rRI2, rfi_32, n, 0, j, n, 2, j, id_break, id_break, false);
            }
            n = 10;
        }
        this.id_class(rRI2, rfi_32, 5, 0, 10, 5, 2, 10, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 8, 0, 10, 8, 2, 10, id_break, id_break, false);
        this.id_class(rRI2, rfi_32, 6, -1, 7, 7, -1, 8, id_byte, id_byte, false);
        this.id_class(rRI2, rfi_32, 6, -1, 3, 7, -1, 4);
        this.id_class(rRI2, rfi_32, 6, 1, 6);
        return true;
    }
}

