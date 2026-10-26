/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aU_2;
import celestial.iO_2;
import celestial.rCK;
import celestial.rGi_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rRf_1;
import celestial.raF_2;
import celestial.rbf_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.riY_2;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zG_2;
import java.util.Random;

public class rrrp_1
extends riY_2 {
    private boolean id_throws;
    private boolean id_case;

    public rrrp_1(Random random, int n, int n2) {
        super(raF_2.id_import, random, n, 64, n2, 7, 7, 9);
    }

    public rrrp_1(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_import, rcd_32);
        this.id_throws = rcd_32.id_new("Witch");
        this.id_case = rcd_32.id_new("Cat");
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2;
        int n3;
        if (!this.id_class(rRI2, rfi_32, 0)) {
            return false;
        }
        this.id_class(rRI2, rfi_32, 1, 1, 1, 5, 1, 7, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 4, 2, 5, 4, 7, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 1, 0, 4, 1, 0, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 2, 2, 3, 3, 2, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 2, 3, 1, 3, 6, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 2, 3, 5, 3, 6, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
        this.id_class(rRI2, rfi_32, 2, 2, 7, 4, 3, 7, xu_3.id_package.id_continue(), xu_3.id_package.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 0, 2, 1, 3, 2, xu_3.id_static.id_continue(), xu_3.id_static.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 0, 2, 5, 3, 2, xu_3.id_static.id_continue(), xu_3.id_static.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 0, 7, 1, 3, 7, xu_3.id_static.id_continue(), xu_3.id_static.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 0, 7, 5, 3, 7, xu_3.id_static.id_continue(), xu_3.id_static.id_continue(), false);
        this.id_class(rRI2, xu_3.PV.id_continue(), 2, 3, 2, rfi_32);
        this.id_class(rRI2, xu_3.PV.id_continue(), 3, 3, 7, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 1, 3, 4, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 5, 3, 4, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 5, 3, 5, rfi_32);
        this.id_class(rRI2, xu_3.SU.id_continue(), 1, 3, 5, rfi_32);
        this.id_class(rRI2, xu_3.PP.id_continue(), 3, 2, 6, rfi_32);
        this.id_class(rRI2, xu_3.Sb.id_continue(), 4, 2, 6, rfi_32);
        this.id_class(rRI2, xu_3.PV.id_continue(), 1, 2, 1, rfi_32);
        this.id_class(rRI2, xu_3.PV.id_continue(), 5, 2, 1, rfi_32);
        xc_3 xc_32 = (xc_3)xu_3.Sc.id_continue().id_class(zG_2.id_volatile, rpr_3.NORTH);
        xc_3 xc_33 = (xc_3)xu_3.Sc.id_continue().id_class(zG_2.id_volatile, rpr_3.EAST);
        xc_3 xc_34 = (xc_3)xu_3.Sc.id_continue().id_class(zG_2.id_volatile, rpr_3.WEST);
        xc_3 xc_35 = (xc_3)xu_3.Sc.id_continue().id_class(zG_2.id_volatile, rpr_3.SOUTH);
        this.id_class(rRI2, rfi_32, 0, 4, 1, 6, 4, 1, xc_32, xc_32, false);
        this.id_class(rRI2, rfi_32, 0, 4, 2, 0, 4, 7, xc_33, xc_33, false);
        this.id_class(rRI2, rfi_32, 6, 4, 2, 6, 4, 7, xc_34, xc_34, false);
        this.id_class(rRI2, rfi_32, 0, 4, 8, 6, 4, 8, xc_35, xc_35, false);
        this.id_class(rRI2, (xc_3)xc_32.id_class(zG_2.id_package, rCK.OUTER_RIGHT), 0, 4, 1, rfi_32);
        this.id_class(rRI2, (xc_3)xc_32.id_class(zG_2.id_package, rCK.OUTER_LEFT), 6, 4, 1, rfi_32);
        this.id_class(rRI2, (xc_3)xc_35.id_class(zG_2.id_package, rCK.OUTER_LEFT), 0, 4, 8, rfi_32);
        this.id_class(rRI2, (xc_3)xc_35.id_class(zG_2.id_package, rCK.OUTER_RIGHT), 6, 4, 8, rfi_32);
        for (n3 = 2; n3 <= 7; n3 += 5) {
            for (n2 = 1; n2 <= 5; n2 += 4) {
                this.id_break(rRI2, xu_3.id_static.id_continue(), n2, -1, n3, rfi_32);
            }
        }
        if (!this.id_throws && rfi_32.id_break(new rfH_2(n3 = this.id_class(2, 5), n2 = this.id_class(2), n = this.id_break(2, 5)))) {
            this.id_throws = true;
            rGi_1 rGi_12 = aI_2.a.id_class(rRI2.id_byte());
            rGi_12.b();
            rGi_12.id_class((double)n3 + 0.5, (double)n2, (double)n + 0.5, 0.0f, 0.0f);
            rGi_12.id_class(rRI2, rRI2.id_throws(new rfH_2(n3, n2, n)), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
            rRI2.id_class(rGi_12);
        }
        this.id_class(rRI2, rfi_32);
        return true;
    }

    private void id_class(rRf_1 rRf_12, rfi_3 rfi_32) {
        int n;
        int n2;
        int n3;
        if (!this.id_case && rfi_32.id_break(new rfH_2(n3 = this.id_class(2, 5), n2 = this.id_class(2), n = this.id_break(2, 5)))) {
            this.id_case = true;
            rbf_3 rbf_32 = aI_2.id_private.id_class(rRf_12.id_byte());
            rbf_32.b();
            rbf_32.id_class((double)n3 + 0.5, (double)n2, (double)n + 0.5, 0.0f, 0.0f);
            rbf_32.id_class(rRf_12, rRf_12.id_throws(new rfH_2(n3, n2, n)), iO_2.STRUCTURE, (aU_2)null, (rcd_3)null);
            rRf_12.id_class(rbf_32);
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Witch", this.id_throws);
        rcd_32.id_class("Cat", this.id_case);
    }
}

