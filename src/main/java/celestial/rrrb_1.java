/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.dp_3;
import celestial.kc_3;
import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rii_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrQ;
import celestial.rrrn_1;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zg_3;
import java.util.List;
import java.util.Random;

public class rrrb_1
extends rrrQ {
    private final boolean id_class;

    public rrrb_1(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_public, n);
        this.id_class(rpr_32);
        this.id_protected = this.id_class(random);
        this.id_final = rfi_32;
        this.id_class = rfi_32.id_throws() > 6;
    }

    public rrrb_1(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_public, rcd_32);
        this.id_class = rcd_32.id_new("Tall");
    }

    public static rrrb_1 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -4, -1, 0, 14, 11, 15, rpr_32);
        if (!(rrrb_1.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null || rrrb_1.id_class(rfi_32 = rfi_3.id_class(n, n2, n3, -4, -1, 0, 14, 6, 15, rpr_32)) && rrrn_1.id_class(list, rfi_32) == null)) {
            return null;
        }
        return new rrrb_1(n4, random, rfi_32, rpr_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2 = 11;
        if (!this.id_class) {
            n2 = 6;
        }
        this.id_class(rRI2, rfi_32, 0, 0, 0, 13, n2 - 1, 14, true, random, rii_3.id_throws);
        this.id_class(rRI2, random, rfi_32, this.id_protected, 4, 1, 0);
        this.id_class(rRI2, rfi_32, random, 0.07f, 2, 1, 1, 11, 4, 13, xu_3.U.id_continue(), xu_3.U.id_continue(), false, false);
        boolean bl = true;
        int n3 = 12;
        for (n = 1; n <= 13; ++n) {
            if ((n - 1) % 4 == 0) {
                this.id_class(rRI2, rfi_32, 1, 1, n, 1, 4, n, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
                this.id_class(rRI2, rfi_32, 12, 1, n, 12, 4, n, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
                this.id_class(rRI2, (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.EAST), 2, 3, n, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.WEST), 11, 3, n, rfi_32);
                if (!this.id_class) continue;
                this.id_class(rRI2, rfi_32, 1, 6, n, 1, 9, n, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
                this.id_class(rRI2, rfi_32, 12, 6, n, 12, 9, n, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
                continue;
            }
            this.id_class(rRI2, rfi_32, 1, 1, n, 1, 4, n, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
            this.id_class(rRI2, rfi_32, 12, 1, n, 12, 4, n, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
            if (!this.id_class) continue;
            this.id_class(rRI2, rfi_32, 1, 6, n, 1, 9, n, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
            this.id_class(rRI2, rfi_32, 12, 6, n, 12, 9, n, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
        }
        for (n = 3; n < 12; n += 2) {
            this.id_class(rRI2, rfi_32, 3, 1, n, 4, 3, n, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
            this.id_class(rRI2, rfi_32, 6, 1, n, 7, 3, n, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
            this.id_class(rRI2, rfi_32, 9, 1, n, 10, 3, n, xu_3.rj.id_continue(), xu_3.rj.id_continue(), false);
        }
        if (this.id_class) {
            this.id_class(rRI2, rfi_32, 1, 5, 1, 3, 5, 13, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
            this.id_class(rRI2, rfi_32, 10, 5, 1, 12, 5, 13, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
            this.id_class(rRI2, rfi_32, 4, 5, 1, 9, 5, 2, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
            this.id_class(rRI2, rfi_32, 4, 5, 12, 9, 5, 13, xu_3.id_final.id_continue(), xu_3.id_final.id_continue(), false);
            this.id_class(rRI2, xu_3.id_final.id_continue(), 9, 5, 11, rfi_32);
            this.id_class(rRI2, xu_3.id_final.id_continue(), 8, 5, 11, rfi_32);
            this.id_class(rRI2, xu_3.id_final.id_continue(), 9, 5, 10, rfi_32);
            xc_3 xc_32 = (xc_3)((xc_3)xu_3.PV.id_continue().id_class(dp_3.id_int, true)).id_class(dp_3.id_final, true);
            xc_3 xc_33 = (xc_3)((xc_3)xu_3.PV.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_package, true);
            this.id_class(rRI2, rfi_32, 3, 6, 3, 3, 6, 11, xc_33, xc_33, false);
            this.id_class(rRI2, rfi_32, 10, 6, 3, 10, 6, 9, xc_33, xc_33, false);
            this.id_class(rRI2, rfi_32, 4, 6, 2, 9, 6, 2, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 4, 6, 12, 7, 6, 12, xc_32, xc_32, false);
            this.id_class(rRI2, (xc_3)((xc_3)xu_3.PV.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_final, true), 3, 6, 2, rfi_32);
            this.id_class(rRI2, (xc_3)((xc_3)xu_3.PV.id_continue().id_class(dp_3.id_package, true)).id_class(dp_3.id_final, true), 3, 6, 12, rfi_32);
            this.id_class(rRI2, (xc_3)((xc_3)xu_3.PV.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_int, true), 10, 6, 2, rfi_32);
            for (int i = 0; i <= 2; ++i) {
                this.id_class(rRI2, (xc_3)((xc_3)xu_3.PV.id_continue().id_class(dp_3.id_package, true)).id_class(dp_3.id_int, true), 8 + i, 6, 12 - i, rfi_32);
                if (i == 2) continue;
                this.id_class(rRI2, (xc_3)((xc_3)xu_3.PV.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_final, true), 8 + i, 6, 11 - i, rfi_32);
            }
            xc_3 xc_34 = (xc_3)xu_3.PJ.id_continue().id_class(kc_3.id_volatile, rpr_3.SOUTH);
            this.id_class(rRI2, xc_34, 10, 1, 13, rfi_32);
            this.id_class(rRI2, xc_34, 10, 2, 13, rfi_32);
            this.id_class(rRI2, xc_34, 10, 3, 13, rfi_32);
            this.id_class(rRI2, xc_34, 10, 4, 13, rfi_32);
            this.id_class(rRI2, xc_34, 10, 5, 13, rfi_32);
            this.id_class(rRI2, xc_34, 10, 6, 13, rfi_32);
            this.id_class(rRI2, xc_34, 10, 7, 13, rfi_32);
            int n4 = 7;
            int n5 = 7;
            xc_3 xc_35 = (xc_3)xu_3.PV.id_continue().id_class(dp_3.id_final, true);
            this.id_class(rRI2, xc_35, 6, 9, 7, rfi_32);
            xc_3 xc_36 = (xc_3)xu_3.PV.id_continue().id_class(dp_3.id_int, true);
            this.id_class(rRI2, xc_36, 7, 9, 7, rfi_32);
            this.id_class(rRI2, xc_35, 6, 8, 7, rfi_32);
            this.id_class(rRI2, xc_36, 7, 8, 7, rfi_32);
            xc_3 xc_37 = (xc_3)((xc_3)xc_33.id_class(dp_3.id_int, true)).id_class(dp_3.id_final, true);
            this.id_class(rRI2, xc_37, 6, 7, 7, rfi_32);
            this.id_class(rRI2, xc_37, 7, 7, 7, rfi_32);
            this.id_class(rRI2, xc_35, 5, 7, 7, rfi_32);
            this.id_class(rRI2, xc_36, 8, 7, 7, rfi_32);
            this.id_class(rRI2, (xc_3)xc_35.id_class(dp_3.id_volatile, true), 6, 7, 6, rfi_32);
            this.id_class(rRI2, (xc_3)xc_35.id_class(dp_3.id_package, true), 6, 7, 8, rfi_32);
            this.id_class(rRI2, (xc_3)xc_36.id_class(dp_3.id_volatile, true), 7, 7, 6, rfi_32);
            this.id_class(rRI2, (xc_3)xc_36.id_class(dp_3.id_package, true), 7, 7, 8, rfi_32);
            xc_3 xc_38 = xu_3.rR.id_continue();
            this.id_class(rRI2, xc_38, 5, 8, 7, rfi_32);
            this.id_class(rRI2, xc_38, 8, 8, 7, rfi_32);
            this.id_class(rRI2, xc_38, 6, 8, 6, rfi_32);
            this.id_class(rRI2, xc_38, 6, 8, 8, rfi_32);
            this.id_class(rRI2, xc_38, 7, 8, 6, rfi_32);
            this.id_class(rRI2, xc_38, 7, 8, 8, rfi_32);
        }
        this.id_class(rRI2, rfi_32, random, 3, 3, 5, rzl_3.id_return);
        if (this.id_class) {
            this.id_class(rRI2, id_volatile, 12, 9, 1, rfi_32);
            this.id_class(rRI2, rfi_32, random, 12, 8, 1, rzl_3.id_return);
        }
        return true;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Tall", this.id_class);
    }
}

