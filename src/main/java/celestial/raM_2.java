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

public class raM_2
extends raz_3 {
    public raM_2(int n, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_private, n);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
    }

    public raM_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_private, rcd_32);
    }

    public static raM_2 id_class(List<rrrn_1> list, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -1, -7, 0, 5, 14, 10, rpr_32);
        return raM_2.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new raM_2(n4, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        xc_3 xc_32 = (xc_3)xu_3.SS.id_continue().id_class(zG_2.id_volatile, rpr_3.SOUTH);
        xc_3 xc_33 = (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_package, true);
        for (int i = 0; i <= 9; ++i) {
            int n = Math.max(1, 7 - i);
            int n2 = Math.min(Math.max(n + 5, 14 - i), 13);
            int n3 = i;
            this.id_class(rRI2, rfi_32, 0, 0, i, 4, n, i, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
            this.id_class(rRI2, rfi_32, 1, n + 1, i, 3, n2 - 1, i, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
            if (i <= 6) {
                this.id_class(rRI2, xc_32, 1, n + 1, i, rfi_32);
                this.id_class(rRI2, xc_32, 2, n + 1, i, rfi_32);
                this.id_class(rRI2, xc_32, 3, n + 1, i, rfi_32);
            }
            this.id_class(rRI2, rfi_32, 0, n2, i, 4, n2, i, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
            this.id_class(rRI2, rfi_32, 0, n + 1, i, 0, n2 - 1, i, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
            this.id_class(rRI2, rfi_32, 4, n + 1, i, 4, n2 - 1, i, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
            if ((i & 1) == 0) {
                this.id_class(rRI2, rfi_32, 0, n + 2, i, 0, n + 3, i, xc_33, xc_33, false);
                this.id_class(rRI2, rfi_32, 4, n + 2, i, 4, n + 3, i, xc_33, xc_33, false);
            }
            for (int j = 0; j <= 4; ++j) {
                this.id_break(rRI2, xu_3.SP.id_continue(), j, -1, n3, rfi_32);
            }
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        this.id_class((rac_3)rrrn_12, list, random, 1, 0, true);
    }
}

