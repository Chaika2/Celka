/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.WZ;
import celestial.Wu_1;
import celestial.kD_2;
import celestial.kL_2;
import celestial.rCH;
import celestial.rCY;
import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.rap_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.riY_2;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zA_2;
import celestial.zC_2;
import celestial.zG_2;
import celestial.zq_3;
import java.util.Random;

public class ray_3
extends riY_2 {
    private boolean id_throws;
    private boolean id_case;
    private boolean id_catch;
    private boolean id_private;
    private static final rap_3 id_implements = new rap_3();

    public ray_3(Random random, int n, int n2) {
        super(raF_2.id_long, random, n, 64, n2, 12, 10, 15);
    }

    public ray_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_long, rcd_32);
        this.id_throws = rcd_32.id_new("placedMainChest");
        this.id_case = rcd_32.id_new("placedHiddenChest");
        this.id_catch = rcd_32.id_new("placedTrap1");
        this.id_private = rcd_32.id_new("placedTrap2");
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2;
        if (!this.id_class(rRI2, rfi_32, 0)) {
            return false;
        }
        this.id_class(rRI2, rfi_32, 0, -4, 0, this.id_class - 1, 0, this.id_byte - 1, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 2, 1, 2, 9, 2, 2, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 2, 1, 12, 9, 2, 12, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 2, 1, 3, 2, 2, 11, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 9, 1, 3, 9, 2, 11, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 1, 3, 1, 10, 6, 1, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 1, 3, 13, 10, 6, 13, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 1, 3, 2, 1, 6, 12, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 10, 3, 2, 10, 6, 12, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 2, 3, 2, 9, 3, 12, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 2, 6, 2, 9, 6, 12, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 3, 7, 3, 8, 7, 11, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 4, 8, 4, 7, 8, 10, false, random, id_implements);
        this.id_break(rRI2, rfi_32, 3, 1, 3, 8, 2, 11);
        this.id_break(rRI2, rfi_32, 4, 3, 6, 7, 3, 9);
        this.id_break(rRI2, rfi_32, 2, 4, 2, 9, 5, 12);
        this.id_break(rRI2, rfi_32, 4, 6, 5, 7, 6, 9);
        this.id_break(rRI2, rfi_32, 5, 7, 6, 6, 7, 8);
        this.id_break(rRI2, rfi_32, 5, 1, 2, 6, 2, 2);
        this.id_break(rRI2, rfi_32, 5, 2, 12, 6, 2, 12);
        this.id_break(rRI2, rfi_32, 5, 5, 1, 6, 5, 1);
        this.id_break(rRI2, rfi_32, 5, 5, 13, 6, 5, 13);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 1, 5, 5, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 10, 5, 5, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 1, 5, 9, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 10, 5, 9, rfi_32);
        for (n2 = 0; n2 <= 14; n2 += 14) {
            this.id_class(rRI2, rfi_32, 2, 4, n2, 2, 5, n2, false, random, id_implements);
            this.id_class(rRI2, rfi_32, 4, 4, n2, 4, 5, n2, false, random, id_implements);
            this.id_class(rRI2, rfi_32, 7, 4, n2, 7, 5, n2, false, random, id_implements);
            this.id_class(rRI2, rfi_32, 9, 4, n2, 9, 5, n2, false, random, id_implements);
        }
        this.id_class(rRI2, rfi_32, 5, 6, 0, 6, 6, 0, false, random, id_implements);
        for (n2 = 0; n2 <= 11; n2 += 11) {
            for (int i = 2; i <= 12; i += 2) {
                this.id_class(rRI2, rfi_32, n2, 4, i, n2, 5, i, false, random, id_implements);
            }
            this.id_class(rRI2, rfi_32, n2, 6, 5, n2, 6, 5, false, random, id_implements);
            this.id_class(rRI2, rfi_32, n2, 6, 9, n2, 6, 9, false, random, id_implements);
        }
        this.id_class(rRI2, rfi_32, 2, 7, 2, 2, 9, 2, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 9, 7, 2, 9, 9, 2, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 2, 7, 12, 2, 9, 12, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 9, 7, 12, 9, 9, 12, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 4, 9, 4, 4, 9, 4, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 7, 9, 4, 7, 9, 4, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 4, 9, 10, 4, 9, 10, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 7, 9, 10, 7, 9, 10, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 5, 9, 7, 6, 9, 7, false, random, id_implements);
        xc_3 xc_32 = (xc_3)xu_3.Pd.id_continue().id_class(zG_2.id_volatile, rpr_3.EAST);
        xc_3 xc_33 = (xc_3)xu_3.Pd.id_continue().id_class(zG_2.id_volatile, rpr_3.WEST);
        xc_3 xc_34 = (xc_3)xu_3.Pd.id_continue().id_class(zG_2.id_volatile, rpr_3.SOUTH);
        xc_3 xc_35 = (xc_3)xu_3.Pd.id_continue().id_class(zG_2.id_volatile, rpr_3.NORTH);
        this.id_class(rRI2, xc_35, 5, 9, 6, rfi_32);
        this.id_class(rRI2, xc_35, 6, 9, 6, rfi_32);
        this.id_class(rRI2, xc_34, 5, 9, 8, rfi_32);
        this.id_class(rRI2, xc_34, 6, 9, 8, rfi_32);
        this.id_class(rRI2, xc_35, 4, 0, 0, rfi_32);
        this.id_class(rRI2, xc_35, 5, 0, 0, rfi_32);
        this.id_class(rRI2, xc_35, 6, 0, 0, rfi_32);
        this.id_class(rRI2, xc_35, 7, 0, 0, rfi_32);
        this.id_class(rRI2, xc_35, 4, 1, 8, rfi_32);
        this.id_class(rRI2, xc_35, 4, 2, 9, rfi_32);
        this.id_class(rRI2, xc_35, 4, 3, 10, rfi_32);
        this.id_class(rRI2, xc_35, 7, 1, 8, rfi_32);
        this.id_class(rRI2, xc_35, 7, 2, 9, rfi_32);
        this.id_class(rRI2, xc_35, 7, 3, 10, rfi_32);
        this.id_class(rRI2, rfi_32, 4, 1, 9, 4, 1, 9, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 7, 1, 9, 7, 1, 9, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 4, 1, 10, 7, 2, 10, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 5, 4, 5, 6, 4, 5, false, random, id_implements);
        this.id_class(rRI2, xc_32, 4, 4, 5, rfi_32);
        this.id_class(rRI2, xc_33, 7, 4, 5, rfi_32);
        for (n = 0; n < 4; ++n) {
            this.id_class(rRI2, xc_34, 5, 0 - n, 6 + n, rfi_32);
            this.id_class(rRI2, xc_34, 6, 0 - n, 6 + n, rfi_32);
            this.id_break(rRI2, rfi_32, 5, 0 - n, 7 + n, 6, 0 - n, 9 + n);
        }
        this.id_break(rRI2, rfi_32, 1, -3, 12, 10, -1, 13);
        this.id_break(rRI2, rfi_32, 1, -3, 1, 3, -1, 13);
        this.id_break(rRI2, rfi_32, 1, -3, 1, 9, -1, 5);
        for (n = 1; n <= 13; n += 2) {
            this.id_class(rRI2, rfi_32, 1, -3, n, 1, -2, n, false, random, id_implements);
        }
        for (n = 2; n <= 12; n += 2) {
            this.id_class(rRI2, rfi_32, 1, -1, n, 3, -1, n, false, random, id_implements);
        }
        this.id_class(rRI2, rfi_32, 2, -2, 1, 5, -2, 1, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 7, -2, 1, 9, -2, 1, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 6, -3, 1, 6, -3, 1, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 6, -1, 1, 6, -1, 1, false, random, id_implements);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.Sz.id_continue().id_class(zC_2.id_volatile, rpr_3.EAST)).id_class(zC_2.id_package, true), 1, -3, 8, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.Sz.id_continue().id_class(zC_2.id_volatile, rpr_3.WEST)).id_class(zC_2.id_package, true), 4, -3, 8, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)((xc_3)xu_3.SQ.id_continue().id_class(zA_2.id_new, true)).id_class(zA_2.id_super, true)).id_class(zA_2.id_final, true), 2, -3, 8, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)((xc_3)xu_3.SQ.id_continue().id_class(zA_2.id_new, true)).id_class(zA_2.id_super, true)).id_class(zA_2.id_final, true), 3, -3, 8, rfi_32);
        xc_3 xc_36 = (xc_3)((xc_3)xu_3.ra.id_continue().id_class(Wu_1.id_volatile, rCY.SIDE)).id_class(Wu_1.id_package, rCY.SIDE);
        this.id_class(rRI2, xc_36, 5, -3, 7, rfi_32);
        this.id_class(rRI2, xc_36, 5, -3, 6, rfi_32);
        this.id_class(rRI2, xc_36, 5, -3, 5, rfi_32);
        this.id_class(rRI2, xc_36, 5, -3, 4, rfi_32);
        this.id_class(rRI2, xc_36, 5, -3, 3, rfi_32);
        this.id_class(rRI2, xc_36, 5, -3, 2, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.ra.id_continue().id_class(Wu_1.id_volatile, rCY.SIDE)).id_class(Wu_1.id_int, rCY.SIDE), 5, -3, 1, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.ra.id_continue().id_class(Wu_1.id_final, rCY.SIDE)).id_class(Wu_1.id_int, rCY.SIDE), 4, -3, 1, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 3, -3, 1, rfi_32);
        if (!this.id_catch) {
            this.id_catch = this.id_class(rRI2, rfi_32, random, 3, -2, 1, rpr_3.NORTH, rzl_3.id_instanceof);
        }
        this.id_class(rRI2, (xc_3)xu_3.BD.id_continue().id_class(zq_3.id_int, true), 3, -2, 2, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.Sz.id_continue().id_class(zC_2.id_volatile, rpr_3.NORTH)).id_class(zC_2.id_package, true), 7, -3, 1, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.Sz.id_continue().id_class(zC_2.id_volatile, rpr_3.SOUTH)).id_class(zC_2.id_package, true), 7, -3, 5, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)((xc_3)xu_3.SQ.id_continue().id_class(zA_2.id_int, true)).id_class(zA_2.id_continue, true)).id_class(zA_2.id_final, true), 7, -3, 2, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)((xc_3)xu_3.SQ.id_continue().id_class(zA_2.id_int, true)).id_class(zA_2.id_continue, true)).id_class(zA_2.id_final, true), 7, -3, 3, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)((xc_3)xu_3.SQ.id_continue().id_class(zA_2.id_int, true)).id_class(zA_2.id_continue, true)).id_class(zA_2.id_final, true), 7, -3, 4, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.ra.id_continue().id_class(Wu_1.id_final, rCY.SIDE)).id_class(Wu_1.id_int, rCY.SIDE), 8, -3, 6, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.ra.id_continue().id_class(Wu_1.id_int, rCY.SIDE)).id_class(Wu_1.id_package, rCY.SIDE), 9, -3, 6, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)xu_3.ra.id_continue().id_class(Wu_1.id_volatile, rCY.SIDE)).id_class(Wu_1.id_package, rCY.UP), 9, -3, 5, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 9, -3, 4, rfi_32);
        this.id_class(rRI2, xc_36, 9, -2, 4, rfi_32);
        if (!this.id_private) {
            this.id_private = this.id_class(rRI2, rfi_32, random, 9, -2, 3, rpr_3.WEST, rzl_3.id_instanceof);
        }
        this.id_class(rRI2, (xc_3)xu_3.BD.id_continue().id_class(zq_3.id_package, true), 8, -1, 3, rfi_32);
        this.id_class(rRI2, (xc_3)xu_3.BD.id_continue().id_class(zq_3.id_package, true), 8, -2, 3, rfi_32);
        if (!this.id_throws) {
            this.id_throws = this.id_class(rRI2, rfi_32, random, 8, -3, 3, rzl_3.id_try);
        }
        this.id_class(rRI2, xu_3.rV.id_continue(), 9, -3, 2, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 8, -3, 1, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 4, -3, 5, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 5, -2, 5, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 5, -1, 5, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 6, -3, 5, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 7, -2, 5, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 7, -1, 5, rfi_32);
        this.id_class(rRI2, xu_3.rV.id_continue(), 8, -3, 5, rfi_32);
        this.id_class(rRI2, rfi_32, 9, -1, 1, 9, -1, 5, false, random, id_implements);
        this.id_break(rRI2, rfi_32, 8, -3, 8, 10, -1, 10);
        this.id_class(rRI2, xu_3.BC.id_continue(), 8, -2, 11, rfi_32);
        this.id_class(rRI2, xu_3.BC.id_continue(), 9, -2, 11, rfi_32);
        this.id_class(rRI2, xu_3.BC.id_continue(), 10, -2, 11, rfi_32);
        xc_3 xc_37 = (xc_3)((xc_3)xu_3.Pu.id_continue().id_class(kL_2.p, rpr_3.NORTH)).id_class(kL_2.q, rCH.WALL);
        this.id_class(rRI2, xc_37, 8, -2, 12, rfi_32);
        this.id_class(rRI2, xc_37, 9, -2, 12, rfi_32);
        this.id_class(rRI2, xc_37, 10, -2, 12, rfi_32);
        this.id_class(rRI2, rfi_32, 8, -3, 8, 8, -3, 10, false, random, id_implements);
        this.id_class(rRI2, rfi_32, 10, -3, 8, 10, -3, 10, false, random, id_implements);
        this.id_class(rRI2, xu_3.rV.id_continue(), 10, -2, 9, rfi_32);
        this.id_class(rRI2, xc_36, 8, -2, 9, rfi_32);
        this.id_class(rRI2, xc_36, 8, -2, 10, rfi_32);
        this.id_class(rRI2, (xc_3)((xc_3)((xc_3)((xc_3)xu_3.ra.id_continue().id_class(Wu_1.id_volatile, rCY.SIDE)).id_class(Wu_1.id_package, rCY.SIDE)).id_class(Wu_1.id_final, rCY.SIDE)).id_class(Wu_1.id_int, rCY.SIDE), 10, -1, 9, rfi_32);
        this.id_class(rRI2, (xc_3)xu_3.D.id_continue().id_class(kD_2.id_volatile, rpr_3.UP), 9, -2, 8, rfi_32);
        this.id_class(rRI2, (xc_3)xu_3.D.id_continue().id_class(kD_2.id_volatile, rpr_3.WEST), 10, -2, 8, rfi_32);
        this.id_class(rRI2, (xc_3)xu_3.D.id_continue().id_class(kD_2.id_volatile, rpr_3.WEST), 10, -1, 8, rfi_32);
        this.id_class(rRI2, (xc_3)xu_3.BS.id_continue().id_class(WZ.p, rpr_3.NORTH), 10, -2, 10, rfi_32);
        if (!this.id_case) {
            this.id_case = this.id_class(rRI2, rfi_32, random, 9, -3, 10, rzl_3.id_try);
        }
        return true;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("placedMainChest", this.id_throws);
        rcd_32.id_class("placedHiddenChest", this.id_case);
        rcd_32.id_class("placedTrap1", this.id_catch);
        rcd_32.id_class("placedTrap2", this.id_private);
    }
}

