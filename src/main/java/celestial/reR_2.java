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
import celestial.riY_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zG_2;
import java.util.Random;

public class reR_2
extends riY_2 {
    private final boolean[] id_throws = new boolean[4];

    public reR_2(Random random, int n, int n2) {
        super(raF_2.id_short, random, n, 64, n2, 21, 15, 21);
    }

    public reR_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_short, rcd_32);
        this.id_throws[0] = rcd_32.id_new("hasPlacedChest0");
        this.id_throws[1] = rcd_32.id_new("hasPlacedChest1");
        this.id_throws[2] = rcd_32.id_new("hasPlacedChest2");
        this.id_throws[3] = rcd_32.id_new("hasPlacedChest3");
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2;
        this.id_class(rRI2, rfi_32, 0, -4, 0, this.id_class - 1, 0, this.id_byte - 1, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        for (n2 = 1; n2 <= 9; ++n2) {
            this.id_class(rRI2, rfi_32, n2, n2, n2, this.id_class - 1 - n2, n2, this.id_byte - 1 - n2, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
            this.id_class(rRI2, rfi_32, n2 + 1, n2, n2 + 1, this.id_class - 2 - n2, n2, this.id_byte - 2 - n2, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        }
        for (n2 = 0; n2 < this.id_class; ++n2) {
            for (int i = 0; i < this.id_byte; ++i) {
                int n3 = -5;
                this.id_break(rRI2, xu_3.F.id_continue(), n2, -5, i, rfi_32);
            }
        }
        xc_3 xc_32 = (xc_3)xu_3.Sd.id_continue().id_class(zG_2.id_volatile, rpr_3.NORTH);
        xc_3 xc_33 = (xc_3)xu_3.Sd.id_continue().id_class(zG_2.id_volatile, rpr_3.SOUTH);
        xc_3 xc_34 = (xc_3)xu_3.Sd.id_continue().id_class(zG_2.id_volatile, rpr_3.EAST);
        xc_3 xc_35 = (xc_3)xu_3.Sd.id_continue().id_class(zG_2.id_volatile, rpr_3.WEST);
        this.id_class(rRI2, rfi_32, 0, 0, 0, 4, 9, 4, xu_3.F.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 10, 1, 3, 10, 3, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, xc_32, 2, 10, 0, rfi_32);
        this.id_class(rRI2, xc_33, 2, 10, 4, rfi_32);
        this.id_class(rRI2, xc_34, 0, 10, 2, rfi_32);
        this.id_class(rRI2, xc_35, 4, 10, 2, rfi_32);
        this.id_class(rRI2, rfi_32, this.id_class - 5, 0, 0, this.id_class - 1, 9, 4, xu_3.F.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, this.id_class - 4, 10, 1, this.id_class - 2, 10, 3, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, xc_32, this.id_class - 3, 10, 0, rfi_32);
        this.id_class(rRI2, xc_33, this.id_class - 3, 10, 4, rfi_32);
        this.id_class(rRI2, xc_34, this.id_class - 5, 10, 2, rfi_32);
        this.id_class(rRI2, xc_35, this.id_class - 1, 10, 2, rfi_32);
        this.id_class(rRI2, rfi_32, 8, 0, 0, 12, 4, 4, xu_3.F.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 9, 1, 0, 11, 3, 4, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, xu_3.A.id_continue(), 9, 1, 1, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 9, 2, 1, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 9, 3, 1, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 10, 3, 1, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 11, 3, 1, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 11, 2, 1, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 11, 1, 1, rfi_32);
        this.id_class(rRI2, rfi_32, 4, 1, 1, 8, 3, 3, xu_3.F.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 4, 1, 2, 8, 2, 2, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 12, 1, 1, 16, 3, 3, xu_3.F.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 12, 1, 2, 16, 2, 2, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 4, 5, this.id_class - 6, 4, this.id_byte - 6, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, rfi_32, 9, 4, 9, 11, 4, 11, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, 1, 8, 8, 3, 8, xu_3.A.id_continue(), xu_3.A.id_continue(), false);
        this.id_class(rRI2, rfi_32, 12, 1, 8, 12, 3, 8, xu_3.A.id_continue(), xu_3.A.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, 1, 12, 8, 3, 12, xu_3.A.id_continue(), xu_3.A.id_continue(), false);
        this.id_class(rRI2, rfi_32, 12, 1, 12, 12, 3, 12, xu_3.A.id_continue(), xu_3.A.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 1, 5, 4, 4, 11, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, rfi_32, this.id_class - 5, 1, 5, this.id_class - 2, 4, 11, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, rfi_32, 6, 7, 9, 6, 7, 11, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, rfi_32, this.id_class - 7, 7, 9, this.id_class - 7, 7, 11, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 5, 9, 5, 7, 11, xu_3.A.id_continue(), xu_3.A.id_continue(), false);
        this.id_class(rRI2, rfi_32, this.id_class - 6, 5, 9, this.id_class - 6, 7, 11, xu_3.A.id_continue(), xu_3.A.id_continue(), false);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 5, 5, 10, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 5, 6, 10, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 6, 6, 10, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), this.id_class - 6, 5, 10, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), this.id_class - 6, 6, 10, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), this.id_class - 7, 6, 10, rfi_32);
        this.id_class(rRI2, rfi_32, 2, 4, 4, 2, 6, 4, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, this.id_class - 3, 4, 4, this.id_class - 3, 6, 4, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, xc_32, 2, 4, 5, rfi_32);
        this.id_class(rRI2, xc_32, 2, 3, 4, rfi_32);
        this.id_class(rRI2, xc_32, this.id_class - 3, 4, 5, rfi_32);
        this.id_class(rRI2, xc_32, this.id_class - 3, 3, 4, rfi_32);
        this.id_class(rRI2, rfi_32, 1, 1, 3, 2, 2, 3, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, rfi_32, this.id_class - 3, 1, 3, this.id_class - 2, 2, 3, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, xu_3.F.id_continue(), 1, 1, 2, rfi_32);
        this.id_class(rRI2, xu_3.F.id_continue(), this.id_class - 2, 1, 2, rfi_32);
        this.id_class(rRI2, xu_3.Ga.id_continue(), 1, 2, 2, rfi_32);
        this.id_class(rRI2, xu_3.Ga.id_continue(), this.id_class - 2, 2, 2, rfi_32);
        this.id_class(rRI2, xc_35, 2, 1, 2, rfi_32);
        this.id_class(rRI2, xc_34, this.id_class - 3, 1, 2, rfi_32);
        this.id_class(rRI2, rfi_32, 4, 3, 5, 4, 3, 17, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, rfi_32, this.id_class - 5, 3, 5, this.id_class - 5, 3, 17, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, rfi_32, 3, 1, 5, 4, 2, 16, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, this.id_class - 6, 1, 5, this.id_class - 5, 2, 16, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        for (n = 5; n <= 17; n += 2) {
            this.id_class(rRI2, xu_3.A.id_continue(), 4, 1, n, rfi_32);
            this.id_class(rRI2, xu_3.L.id_continue(), 4, 2, n, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), this.id_class - 5, 1, n, rfi_32);
            this.id_class(rRI2, xu_3.L.id_continue(), this.id_class - 5, 2, n, rfi_32);
        }
        this.id_class(rRI2, xu_3.sI.id_continue(), 10, 0, 7, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 10, 0, 8, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 9, 0, 9, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 11, 0, 9, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 8, 0, 10, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 12, 0, 10, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 7, 0, 10, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 13, 0, 10, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 9, 0, 11, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 11, 0, 11, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 10, 0, 12, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 10, 0, 13, rfi_32);
        this.id_class(rRI2, xu_3.sU.id_continue(), 10, 0, 10, rfi_32);
        for (n = 0; n <= this.id_class - 1; n += this.id_class - 1) {
            this.id_class(rRI2, xu_3.A.id_continue(), n, 2, 1, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 2, 2, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n, 2, 3, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n, 3, 1, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 3, 2, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n, 3, 3, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 4, 1, rfi_32);
            this.id_class(rRI2, xu_3.L.id_continue(), n, 4, 2, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 4, 3, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n, 5, 1, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 5, 2, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n, 5, 3, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 6, 1, rfi_32);
            this.id_class(rRI2, xu_3.L.id_continue(), n, 6, 2, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 6, 3, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 7, 1, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 7, 2, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 7, 3, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n, 8, 1, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n, 8, 2, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n, 8, 3, rfi_32);
        }
        for (n = 2; n <= this.id_class - 3; n += this.id_class - 3 - 2) {
            this.id_class(rRI2, xu_3.A.id_continue(), n - 1, 2, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 2, 0, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n + 1, 2, 0, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n - 1, 3, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 3, 0, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n + 1, 3, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n - 1, 4, 0, rfi_32);
            this.id_class(rRI2, xu_3.L.id_continue(), n, 4, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n + 1, 4, 0, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n - 1, 5, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 5, 0, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n + 1, 5, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n - 1, 6, 0, rfi_32);
            this.id_class(rRI2, xu_3.L.id_continue(), n, 6, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n + 1, 6, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n - 1, 7, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n, 7, 0, rfi_32);
            this.id_class(rRI2, xu_3.sI.id_continue(), n + 1, 7, 0, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n - 1, 8, 0, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n, 8, 0, rfi_32);
            this.id_class(rRI2, xu_3.A.id_continue(), n + 1, 8, 0, rfi_32);
        }
        this.id_class(rRI2, rfi_32, 8, 4, 0, 12, 6, 0, xu_3.A.id_continue(), xu_3.A.id_continue(), false);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 8, 6, 0, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 12, 6, 0, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 9, 5, 0, rfi_32);
        this.id_class(rRI2, xu_3.L.id_continue(), 10, 5, 0, rfi_32);
        this.id_class(rRI2, xu_3.sI.id_continue(), 11, 5, 0, rfi_32);
        this.id_class(rRI2, rfi_32, 8, -14, 8, 12, -11, 12, xu_3.A.id_continue(), xu_3.A.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, -10, 8, 12, -10, 12, xu_3.L.id_continue(), xu_3.L.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, -9, 8, 12, -9, 12, xu_3.A.id_continue(), xu_3.A.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, -8, 8, 12, -1, 12, xu_3.F.id_continue(), xu_3.F.id_continue(), false);
        this.id_class(rRI2, rfi_32, 9, -11, 9, 11, -1, 11, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, xu_3.Pm.id_continue(), 10, -11, 10, rfi_32);
        this.id_class(rRI2, rfi_32, 9, -13, 9, 11, -13, 11, xu_3.rf.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 8, -11, 10, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 8, -10, 10, rfi_32);
        this.id_class(rRI2, xu_3.L.id_continue(), 7, -10, 10, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 7, -11, 10, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 12, -11, 10, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 12, -10, 10, rfi_32);
        this.id_class(rRI2, xu_3.L.id_continue(), 13, -10, 10, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 13, -11, 10, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 10, -11, 8, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 10, -10, 8, rfi_32);
        this.id_class(rRI2, xu_3.L.id_continue(), 10, -10, 7, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 10, -11, 7, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 10, -11, 12, rfi_32);
        this.id_class(rRI2, xu_3.id_class.id_continue(), 10, -10, 12, rfi_32);
        this.id_class(rRI2, xu_3.L.id_continue(), 10, -10, 13, rfi_32);
        this.id_class(rRI2, xu_3.A.id_continue(), 10, -11, 13, rfi_32);
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            if (this.id_throws[rpr_32.id_protected()]) continue;
            int n4 = rpr_32.id_implements() * 2;
            int n5 = rpr_32.id_extends() * 2;
            this.id_throws[rpr_32.id_protected()] = this.id_class(rRI2, rfi_32, random, 10 + n4, -11, 10 + n5, rzl_3.id_while);
        }
        return true;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("hasPlacedChest0", this.id_throws[0]);
        rcd_32.id_class("hasPlacedChest1", this.id_throws[1]);
        rcd_32.id_class("hasPlacedChest2", this.id_throws[2]);
        rcd_32.id_class("hasPlacedChest3", this.id_throws[3]);
    }
}

