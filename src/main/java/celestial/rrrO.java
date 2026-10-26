/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.dA_2;
import celestial.kK_2;
import celestial.rHU;
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
import celestial.rrrN;
import celestial.rrrQ;
import celestial.rrrd_1;
import celestial.rrrn_1;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zG_2;
import java.util.List;
import java.util.Random;

public class rrrO
extends rrrQ {
    private boolean id_class;

    public rrrO(int n, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_goto, n);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
    }

    public rrrO(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_goto, rcd_32);
        this.id_class = rcd_32.id_new("Mob");
    }

    public static rrrO id_class(List<rrrn_1> list, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -4, -1, 0, 11, 8, 16, rpr_32);
        return rrrO.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rrrO(n4, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        this.id_class(rRI2, rfi_32, 0, 0, 0, 10, 7, 15, false, random, rii_3.id_throws);
        this.id_class(rRI2, random, rfi_32, rrrN.GRATES, 4, 1, 0);
        int n2 = 6;
        this.id_class(rRI2, rfi_32, 1, n2, 1, 1, n2, 14, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 9, n2, 1, 9, n2, 14, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 2, n2, 1, 8, n2, 2, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 2, n2, 14, 8, n2, 14, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 1, 1, 1, 2, 1, 4, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 8, 1, 1, 9, 1, 4, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 1, 1, 1, 1, 1, 3, xu_3.id_instanceof.id_continue(), xu_3.id_instanceof.id_continue(), false);
        this.id_class(rRI2, rfi_32, 9, 1, 1, 9, 1, 3, xu_3.id_instanceof.id_continue(), xu_3.id_instanceof.id_continue(), false);
        this.id_class(rRI2, rfi_32, 3, 1, 8, 7, 1, 12, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 4, 1, 9, 6, 1, 11, xu_3.id_instanceof.id_continue(), xu_3.id_instanceof.id_continue(), false);
        xc_3 xc_32 = (xc_3)((xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_volatile, true)).id_class(kK_2.id_package, true);
        xc_3 xc_33 = (xc_3)((xc_3)xu_3.Bf.id_continue().id_class(kK_2.id_int, true)).id_class(kK_2.id_final, true);
        for (n = 3; n < 14; n += 2) {
            this.id_class(rRI2, rfi_32, 0, 3, n, 0, 4, n, xc_32, xc_32, false);
            this.id_class(rRI2, rfi_32, 10, 3, n, 10, 4, n, xc_32, xc_32, false);
        }
        for (n = 2; n < 9; n += 2) {
            this.id_class(rRI2, rfi_32, n, 3, 15, n, 4, 15, xc_33, xc_33, false);
        }
        xc_3 xc_34 = (xc_3)xu_3.Ba.id_continue().id_class(zG_2.id_volatile, rpr_3.NORTH);
        this.id_class(rRI2, rfi_32, 4, 1, 5, 6, 1, 7, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 4, 2, 6, 6, 2, 7, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 4, 3, 7, 6, 3, 7, false, random, rii_3.id_throws);
        for (int i = 4; i <= 6; ++i) {
            this.id_class(rRI2, xc_34, i, 1, 4, rfi_32);
            this.id_class(rRI2, xc_34, i, 2, 5, rfi_32);
            this.id_class(rRI2, xc_34, i, 3, 6, rfi_32);
        }
        xc_3 xc_35 = (xc_3)xu_3.SO.id_continue().id_class(dA_2.id_volatile, rpr_3.NORTH);
        xc_3 xc_36 = (xc_3)xu_3.SO.id_continue().id_class(dA_2.id_volatile, rpr_3.SOUTH);
        xc_3 xc_37 = (xc_3)xu_3.SO.id_continue().id_class(dA_2.id_volatile, rpr_3.EAST);
        xc_3 xc_38 = (xc_3)xu_3.SO.id_continue().id_class(dA_2.id_volatile, rpr_3.WEST);
        boolean bl = true;
        boolean[] blArray = new boolean[12];
        for (int i = 0; i < blArray.length; ++i) {
            blArray[i] = random.nextFloat() > 0.9f;
            bl &= blArray[i];
        }
        this.id_class(rRI2, (xc_3)xc_35.id_class(dA_2.id_final, blArray[0]), 4, 3, 8, rfi_32);
        this.id_class(rRI2, (xc_3)xc_35.id_class(dA_2.id_final, blArray[1]), 5, 3, 8, rfi_32);
        this.id_class(rRI2, (xc_3)xc_35.id_class(dA_2.id_final, blArray[2]), 6, 3, 8, rfi_32);
        this.id_class(rRI2, (xc_3)xc_36.id_class(dA_2.id_final, blArray[3]), 4, 3, 12, rfi_32);
        this.id_class(rRI2, (xc_3)xc_36.id_class(dA_2.id_final, blArray[4]), 5, 3, 12, rfi_32);
        this.id_class(rRI2, (xc_3)xc_36.id_class(dA_2.id_final, blArray[5]), 6, 3, 12, rfi_32);
        this.id_class(rRI2, (xc_3)xc_37.id_class(dA_2.id_final, blArray[6]), 3, 3, 9, rfi_32);
        this.id_class(rRI2, (xc_3)xc_37.id_class(dA_2.id_final, blArray[7]), 3, 3, 10, rfi_32);
        this.id_class(rRI2, (xc_3)xc_37.id_class(dA_2.id_final, blArray[8]), 3, 3, 11, rfi_32);
        this.id_class(rRI2, (xc_3)xc_38.id_class(dA_2.id_final, blArray[9]), 7, 3, 9, rfi_32);
        this.id_class(rRI2, (xc_3)xc_38.id_class(dA_2.id_final, blArray[10]), 7, 3, 10, rfi_32);
        this.id_class(rRI2, (xc_3)xc_38.id_class(dA_2.id_final, blArray[11]), 7, 3, 11, rfi_32);
        if (bl) {
            xc_3 xc_39 = xu_3.SM.id_continue();
            this.id_class(rRI2, xc_39, 4, 3, 9, rfi_32);
            this.id_class(rRI2, xc_39, 5, 3, 9, rfi_32);
            this.id_class(rRI2, xc_39, 6, 3, 9, rfi_32);
            this.id_class(rRI2, xc_39, 4, 3, 10, rfi_32);
            this.id_class(rRI2, xc_39, 5, 3, 10, rfi_32);
            this.id_class(rRI2, xc_39, 6, 3, 10, rfi_32);
            this.id_class(rRI2, xc_39, 4, 3, 11, rfi_32);
            this.id_class(rRI2, xc_39, 5, 3, 11, rfi_32);
            this.id_class(rRI2, xc_39, 6, 3, 11, rfi_32);
        }
        if (!this.id_class) {
            n2 = this.id_class(3);
            rfH_2 rfH_23 = new rfH_2(this.id_class(5, 6), n2, this.id_break(5, 6));
            if (rfi_32.id_break(rfH_23)) {
                this.id_class = true;
                rRI2.id_class(rfH_23, xu_3.rD.id_continue(), 2);
                ryO_2 ryO_22 = rRI2.id_class(rfH_23);
                if (ryO_22 instanceof rHU) {
                    ((rHU)ryO_22).id_catch().id_class(aI_2.L);
                }
            }
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        if (rrrn_12 != null) {
            ((rrrd_1)rrrn_12).id_break = this;
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Mob", this.id_class);
    }
}

