/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.dp_3;
import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.rac_3;
import celestial.raz_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import celestial.xc_3;
import celestial.xu_3;
import java.util.List;
import java.util.Random;

public class raN_2
extends raz_3 {
    public raN_2(int n, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_continue, n);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
    }

    public raN_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_continue, rcd_32);
    }

    public static raN_2 id_class(List<rrrn_1> list, int n, int n2, int n3, int n4, rpr_3 rpr_32) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -2, 0, 0, 7, 11, 7, rpr_32);
        return raN_2.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new raN_2(n4, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 0, 0, 6, 1, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 2, 0, 6, 10, 6, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 2, 0, 1, 8, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 2, 0, 6, 8, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 2, 1, 0, 8, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 6, 2, 1, 6, 8, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 2, 6, 5, 8, 6, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        xc_3 xc_32 = (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_int, true)).id_class(dp_3.id_final, true);
        xc_3 xc_33 = (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_package, true);
        this.id_class(rRI2, rfi_32, 0, 3, 2, 0, 5, 4, xc_33, xc_33, false);
        this.id_class(rRI2, rfi_32, 6, 3, 2, 6, 5, 2, xc_33, xc_33, false);
        this.id_class(rRI2, rfi_32, 6, 3, 4, 6, 5, 4, xc_33, xc_33, false);
        this.id_class(rRI2, xu_3.SP.id_continue(), 5, 2, 5, rfi_32);
        this.id_class(rRI2, rfi_32, 4, 2, 5, 4, 3, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 3, 2, 5, 3, 4, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 2, 5, 2, 5, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 2, 5, 1, 6, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 7, 1, 5, 7, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 6, 8, 2, 6, 8, 4, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 6, 0, 4, 8, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 5, 0, 4, 5, 0, xc_32, xc_32, false);
        for (int i = 0; i <= 6; ++i) {
            for (int j = 0; j <= 6; ++j) {
                this.id_break(rRI2, xu_3.SP.id_continue(), i, -1, j, rfi_32);
            }
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        this.id_byte((rac_3)rrrn_12, list, random, 6, 2, false);
    }
}

