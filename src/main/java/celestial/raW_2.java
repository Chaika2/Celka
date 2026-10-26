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
import celestial.zG_2;
import java.util.List;
import java.util.Random;

public class raW_2
extends raz_3 {
    public raW_2(int n, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_package, n);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
    }

    public raW_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_package, rcd_32);
    }

    public static raW_2 id_class(List<rrrn_1> list, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -5, -3, 0, 13, 14, 13, rpr_32);
        return raW_2.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new raW_2(n4, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2;
        int n3;
        int n4;
        this.id_class(rRI2, rfi_32, 0, 3, 0, 12, 4, 12, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 5, 0, 12, 13, 12, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 5, 0, 1, 12, 12, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 11, 5, 0, 12, 12, 12, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 5, 11, 4, 12, 12, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, 5, 11, 10, 12, 12, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 9, 11, 7, 12, 12, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 5, 0, 4, 12, 1, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, 5, 0, 10, 12, 1, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 9, 0, 7, 12, 1, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 11, 2, 10, 12, 10, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        xc_3 xc_32 = (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_int, true)).id_class(dp_3.id_final, true);
        xc_3 xc_33 = (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_package, true);
        xc_3 xc_34 = (xc_3)xc_33.id_class(dp_3.id_int, true);
        xc_3 xc_35 = (xc_3)xc_33.id_class(dp_3.id_final, true);
        for (n4 = 1; n4 <= 11; n4 += 2) {
            this.id_class(rRI2, rfi_32, n4, 10, 0, n4, 11, 0, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, n4, 10, 12, n4, 11, 12, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 0, 10, n4, 0, 11, n4, xc_33, xc_33, false);
            this.id_class(rRI2, rfi_32, 12, 10, n4, 12, 11, n4, xc_33, xc_33, false);
            this.id_class(rRI2, xu_3.SP.id_continue(), n4, 13, 0, rfi_32);
            this.id_class(rRI2, xu_3.SP.id_continue(), n4, 13, 12, rfi_32);
            this.id_class(rRI2, xu_3.SP.id_continue(), 0, 13, n4, rfi_32);
            this.id_class(rRI2, xu_3.SP.id_continue(), 12, 13, n4, rfi_32);
            if (n4 == 11) continue;
            this.id_class(rRI2, xc_32, n4 + 1, 13, 0, rfi_32);
            this.id_class(rRI2, xc_32, n4 + 1, 13, 12, rfi_32);
            this.id_class(rRI2, xc_33, 0, 13, n4 + 1, rfi_32);
            this.id_class(rRI2, xc_33, 12, 13, n4 + 1, rfi_32);
        }
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_final, true), 0, 13, 0, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_package, true)).id_class(dp_3.id_final, true), 0, 13, 12, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_package, true)).id_class(dp_3.id_int, true), 12, 13, 12, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_int, true), 12, 13, 0, rfi_32);
        for (n4 = 3; n4 <= 9; n4 += 2) {
            this.id_class(rRI2, rfi_32, 1, 7, n4, 1, 8, n4, xc_34, xc_34, false);
            this.id_class(rRI2, rfi_32, 11, 7, n4, 11, 8, n4, xc_35, xc_35, false);
        }
        xc_3 xc_36 = (xc_3)xu_3.SS.id_continue().id_class(zG_2.id_volatile, rpr_3.NORTH);
        for (n3 = 0; n3 <= 6; ++n3) {
            int n5 = n3 + 4;
            for (n2 = 5; n2 <= 7; ++n2) {
                this.id_class(rRI2, xc_36, n2, 5 + n3, n5, rfi_32);
            }
            if (n5 >= 5 && n5 <= 8) {
                this.id_class(rRI2, rfi_32, 5, 5, n5, 7, n3 + 4, n5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
            } else if (n5 >= 9 && n5 <= 10) {
                this.id_class(rRI2, rfi_32, 5, 8, n5, 7, n3 + 4, n5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
            }
            if (n3 < 1) continue;
            this.id_class(rRI2, rfi_32, 5, 6 + n3, n5, 7, 9 + n3, n5, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        }
        for (n3 = 5; n3 <= 7; ++n3) {
            this.id_class(rRI2, xc_36, n3, 12, 11, rfi_32);
        }
        this.id_class(rRI2, rfi_32, 5, 6, 7, 5, 7, 7, xc_35, xc_35, false);
        this.id_class(rRI2, rfi_32, 7, 6, 7, 7, 7, 7, xc_34, xc_34, false);
        this.id_class(rRI2, rfi_32, 5, 13, 12, 7, 13, 12, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 5, 2, 3, 5, 3, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 5, 9, 3, 5, 10, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 5, 4, 2, 5, 8, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 9, 5, 2, 10, 5, 3, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 9, 5, 9, 10, 5, 10, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 10, 5, 4, 10, 5, 8, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        xc_3 xc_37 = (xc_3)xc_36.id_class(zG_2.id_volatile, rpr_3.EAST);
        xc_3 xc_38 = (xc_3)xc_36.id_class(zG_2.id_volatile, rpr_3.WEST);
        this.id_class(rRI2, xc_38, 4, 5, 2, rfi_32);
        this.id_class(rRI2, xc_38, 4, 5, 3, rfi_32);
        this.id_class(rRI2, xc_38, 4, 5, 9, rfi_32);
        this.id_class(rRI2, xc_38, 4, 5, 10, rfi_32);
        this.id_class(rRI2, xc_37, 8, 5, 2, rfi_32);
        this.id_class(rRI2, xc_37, 8, 5, 3, rfi_32);
        this.id_class(rRI2, xc_37, 8, 5, 9, rfi_32);
        this.id_class(rRI2, xc_37, 8, 5, 10, rfi_32);
        this.id_class(rRI2, rfi_32, 3, 4, 4, 4, 4, 8, xu_3.PY.id_continue(), xu_3.PY.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, 4, 4, 9, 4, 8, xu_3.PY.id_continue(), xu_3.PY.id_continue(), false);
        this.id_class(rRI2, rfi_32, 3, 5, 4, 4, 5, 8, xu_3.Ss.id_continue(), xu_3.Ss.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, 5, 4, 9, 5, 8, xu_3.Ss.id_continue(), xu_3.Ss.id_continue(), false);
        this.id_class(rRI2, rfi_32, 4, 2, 0, 8, 2, 12, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 2, 4, 12, 2, 8, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 4, 0, 0, 8, 1, 3, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 4, 0, 9, 8, 1, 12, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 0, 4, 3, 1, 8, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 9, 0, 4, 12, 1, 8, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        for (n2 = 4; n2 <= 8; ++n2) {
            for (n = 0; n <= 2; ++n) {
                this.id_break(rRI2, xu_3.SP.id_continue(), n2, -1, n, rfi_32);
                this.id_break(rRI2, xu_3.SP.id_continue(), n2, -1, 12 - n, rfi_32);
            }
        }
        for (n2 = 0; n2 <= 2; ++n2) {
            for (n = 4; n <= 8; ++n) {
                this.id_break(rRI2, xu_3.SP.id_continue(), n2, -1, n, rfi_32);
                this.id_break(rRI2, xu_3.SP.id_continue(), 12 - n2, -1, n, rfi_32);
            }
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        this.id_class((rac_3)rrrn_12, list, random, 5, 3, true);
        this.id_class((rac_3)rrrn_12, list, random, 5, 11, true);
    }
}

