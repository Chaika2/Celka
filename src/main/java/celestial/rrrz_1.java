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
import celestial.rii_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrN;
import celestial.rrrQ;
import celestial.rrrd_1;
import celestial.rrrn_1;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zg_3;
import java.util.List;
import java.util.Random;

public class rrrz_1
extends rrrQ {
    private final boolean id_class;
    private final boolean id_break;

    public rrrz_1(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_char, n);
        this.id_class(rpr_32);
        this.id_protected = this.id_class(random);
        this.id_final = rfi_32;
        this.id_class = random.nextInt(2) == 0;
        this.id_break = random.nextInt(2) == 0;
    }

    public rrrz_1(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_char, rcd_32);
        this.id_class = rcd_32.id_new("Left");
        this.id_break = rcd_32.id_new("Right");
    }

    public static rrrz_1 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -1, -1, 0, 5, 5, 7, rpr_32);
        return rrrz_1.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rrrz_1(n4, random, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 0, 0, 4, 4, 6, true, random, rii_3.id_throws);
        this.id_class(rRI2, random, rfi_32, this.id_protected, 1, 1, 0);
        this.id_class(rRI2, random, rfi_32, rrrN.OPENING, 1, 1, 6);
        xc_3 xc_32 = (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.EAST);
        xc_3 xc_33 = (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.WEST);
        this.id_class(rRI2, rfi_32, random, 0.1f, 1, 2, 1, xc_32);
        this.id_class(rRI2, rfi_32, random, 0.1f, 3, 2, 1, xc_33);
        this.id_class(rRI2, rfi_32, random, 0.1f, 1, 2, 5, xc_32);
        this.id_class(rRI2, rfi_32, random, 0.1f, 3, 2, 5, xc_33);
        if (this.id_class) {
            this.id_class(rRI2, rfi_32, 0, 1, 2, 0, 3, 4, id_volatile, id_volatile, false);
        }
        if (this.id_break) {
            this.id_class(rRI2, rfi_32, 4, 1, 2, 4, 3, 4, id_volatile, id_volatile, false);
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        this.id_class((rrrd_1)rrrn_12, list, random, 1, 1);
        if (this.id_class) {
            this.id_break((rrrd_1)rrrn_12, list, random, 1, 2);
        }
        if (this.id_break) {
            this.id_byte((rrrd_1)rrrn_12, list, random, 1, 2);
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Left", this.id_class);
        rcd_32.id_class("Right", this.id_break);
    }
}

