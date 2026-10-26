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

public class raO_2
extends raz_3 {
    public raO_2(int n, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_implements, n);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
    }

    public raO_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_implements, rcd_32);
    }

    public static raO_2 id_class(List<rrrn_1> list, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -3, 0, 0, 9, 7, 9, rpr_32);
        return raO_2.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new raO_2(n4, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        xc_3 xc_32 = (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_package, true);
        xc_3 xc_33 = (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_int, true)).id_class(dp_3.id_final, true);
        this.id_class(rRI2, rfi_32, 0, 0, 0, 8, 1, 8, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 2, 0, 8, 5, 8, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 6, 0, 8, 6, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 2, 0, 2, 5, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 6, 2, 0, 8, 5, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 3, 0, 1, 4, 0, xc_33, xc_33, false);
        this.id_class(rRI2, rfi_32, 7, 3, 0, 7, 4, 0, xc_33, xc_33, false);
        this.id_class(rRI2, rfi_32, 0, 2, 4, 8, 2, 8, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 1, 4, 2, 2, 4, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 6, 1, 4, 7, 2, 4, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 3, 8, 7, 3, 8, xc_33, xc_33, false);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_final, true)).id_class(dp_3.id_package, true), 0, 3, 8, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_int, true)).id_class(dp_3.id_package, true), 8, 3, 8, rfi_32);
        this.id_class(rRI2, rfi_32, 0, 3, 6, 0, 3, 7, xc_32, xc_32, false);
        this.id_class(rRI2, rfi_32, 8, 3, 6, 8, 3, 7, xc_32, xc_32, false);
        this.id_class(rRI2, rfi_32, 0, 3, 4, 0, 5, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, 3, 4, 8, 5, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 3, 5, 2, 5, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 6, 3, 5, 7, 5, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 4, 5, 1, 5, 5, xc_33, xc_33, false);
        this.id_class(rRI2, rfi_32, 7, 4, 5, 7, 5, 5, xc_33, xc_33, false);
        for (int i = 0; i <= 5; ++i) {
            for (int j = 0; j <= 8; ++j) {
                this.id_break(rRI2, xu_3.SP.id_continue(), j, -1, i, rfi_32);
            }
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        int n = 1;
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 == rpr_3.WEST || rpr_32 == rpr_3.NORTH) {
            n = 5;
        }
        this.id_break((rac_3)rrrn_12, list, random, 0, n, random.nextInt(8) > 0);
        this.id_byte((rac_3)rrrn_12, list, random, 0, n, random.nextInt(8) > 0);
    }
}

