/*
 * Decompiled with CFR 0.152.
 */
package celestial;

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
import celestial.rrrd_1;
import celestial.rrrn_1;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zg_3;
import java.util.List;
import java.util.Random;

public class rrrJ
extends rrrQ {
    protected final int id_class;

    public rrrJ(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_instanceof, n);
        this.id_class(rpr_32);
        this.id_protected = this.id_class(random);
        this.id_final = rfi_32;
        this.id_class = random.nextInt(5);
    }

    public rrrJ(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_instanceof, rcd_32);
        this.id_class = rcd_32.id_private("Type");
    }

    public static rrrJ id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -4, -1, 0, 11, 7, 11, rpr_32);
        return rrrJ.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rrrJ(n4, random, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 0, 0, 10, 6, 10, true, random, rii_3.id_throws);
        this.id_class(rRI2, random, rfi_32, this.id_protected, 4, 1, 0);
        this.id_class(rRI2, rfi_32, 4, 1, 10, 6, 3, 10, id_volatile, id_volatile, false);
        this.id_class(rRI2, rfi_32, 0, 1, 4, 0, 3, 6, id_volatile, id_volatile, false);
        this.id_class(rRI2, rfi_32, 10, 1, 4, 10, 3, 6, id_volatile, id_volatile, false);
        switch (this.id_class) {
            case 0: {
                this.id_class(rRI2, xu_3.BL.id_continue(), 5, 1, 5, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), 5, 2, 5, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), 5, 3, 5, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.WEST), 4, 3, 5, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.EAST), 6, 3, 5, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.SOUTH), 5, 3, 4, rfi_32);
                this.id_class(rRI2, (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.NORTH), 5, 3, 6, rfi_32);
                this.id_class(rRI2, xu_3.Ge.id_continue(), 4, 1, 4, rfi_32);
                this.id_class(rRI2, xu_3.Ge.id_continue(), 4, 1, 5, rfi_32);
                this.id_class(rRI2, xu_3.Ge.id_continue(), 4, 1, 6, rfi_32);
                this.id_class(rRI2, xu_3.Ge.id_continue(), 6, 1, 4, rfi_32);
                this.id_class(rRI2, xu_3.Ge.id_continue(), 6, 1, 5, rfi_32);
                this.id_class(rRI2, xu_3.Ge.id_continue(), 6, 1, 6, rfi_32);
                this.id_class(rRI2, xu_3.Ge.id_continue(), 5, 1, 4, rfi_32);
                this.id_class(rRI2, xu_3.Ge.id_continue(), 5, 1, 6, rfi_32);
                break;
            }
            case 1: {
                for (int i = 0; i < 5; ++i) {
                    this.id_class(rRI2, xu_3.BL.id_continue(), 3, 1, 3 + i, rfi_32);
                    this.id_class(rRI2, xu_3.BL.id_continue(), 7, 1, 3 + i, rfi_32);
                    this.id_class(rRI2, xu_3.BL.id_continue(), 3 + i, 1, 3, rfi_32);
                    this.id_class(rRI2, xu_3.BL.id_continue(), 3 + i, 1, 7, rfi_32);
                }
                this.id_class(rRI2, xu_3.BL.id_continue(), 5, 1, 5, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), 5, 2, 5, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), 5, 3, 5, rfi_32);
                this.id_class(rRI2, xu_3.id_try.id_continue(), 5, 4, 5, rfi_32);
                break;
            }
            case 2: {
                int n;
                for (n = 1; n <= 9; ++n) {
                    this.id_class(rRI2, xu_3.id_volatile.id_continue(), 1, 3, n, rfi_32);
                    this.id_class(rRI2, xu_3.id_volatile.id_continue(), 9, 3, n, rfi_32);
                }
                for (n = 1; n <= 9; ++n) {
                    this.id_class(rRI2, xu_3.id_volatile.id_continue(), n, 3, 1, rfi_32);
                    this.id_class(rRI2, xu_3.id_volatile.id_continue(), n, 3, 9, rfi_32);
                }
                this.id_class(rRI2, xu_3.id_volatile.id_continue(), 5, 1, 4, rfi_32);
                this.id_class(rRI2, xu_3.id_volatile.id_continue(), 5, 1, 6, rfi_32);
                this.id_class(rRI2, xu_3.id_volatile.id_continue(), 5, 3, 4, rfi_32);
                this.id_class(rRI2, xu_3.id_volatile.id_continue(), 5, 3, 6, rfi_32);
                this.id_class(rRI2, xu_3.id_volatile.id_continue(), 4, 1, 5, rfi_32);
                this.id_class(rRI2, xu_3.id_volatile.id_continue(), 6, 1, 5, rfi_32);
                this.id_class(rRI2, xu_3.id_volatile.id_continue(), 4, 3, 5, rfi_32);
                this.id_class(rRI2, xu_3.id_volatile.id_continue(), 6, 3, 5, rfi_32);
                for (n = 1; n <= 3; ++n) {
                    this.id_class(rRI2, xu_3.id_volatile.id_continue(), 4, n, 4, rfi_32);
                    this.id_class(rRI2, xu_3.id_volatile.id_continue(), 6, n, 4, rfi_32);
                    this.id_class(rRI2, xu_3.id_volatile.id_continue(), 4, n, 6, rfi_32);
                    this.id_class(rRI2, xu_3.id_volatile.id_continue(), 6, n, 6, rfi_32);
                }
                this.id_class(rRI2, xu_3.rR.id_continue(), 5, 3, 5, rfi_32);
                for (n = 2; n <= 8; ++n) {
                    this.id_class(rRI2, xu_3.id_final.id_continue(), 2, 3, n, rfi_32);
                    this.id_class(rRI2, xu_3.id_final.id_continue(), 3, 3, n, rfi_32);
                    if (n <= 3 || n >= 7) {
                        this.id_class(rRI2, xu_3.id_final.id_continue(), 4, 3, n, rfi_32);
                        this.id_class(rRI2, xu_3.id_final.id_continue(), 5, 3, n, rfi_32);
                        this.id_class(rRI2, xu_3.id_final.id_continue(), 6, 3, n, rfi_32);
                    }
                    this.id_class(rRI2, xu_3.id_final.id_continue(), 7, 3, n, rfi_32);
                    this.id_class(rRI2, xu_3.id_final.id_continue(), 8, 3, n, rfi_32);
                }
                xc_3 xc_32 = (xc_3)xu_3.PJ.id_continue().id_class(kc_3.id_volatile, rpr_3.WEST);
                this.id_class(rRI2, xc_32, 9, 1, 3, rfi_32);
                this.id_class(rRI2, xc_32, 9, 2, 3, rfi_32);
                this.id_class(rRI2, xc_32, 9, 3, 3, rfi_32);
                this.id_class(rRI2, rfi_32, random, 3, 4, 8, rzl_3.id_public);
            }
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        this.id_class((rrrd_1)rrrn_12, list, random, 4, 1);
        this.id_break((rrrd_1)rrrn_12, list, random, 1, 4);
        this.id_byte((rrrd_1)rrrn_12, list, random, 1, 4);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Type", this.id_class);
    }
}

