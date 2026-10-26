/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Wg_1;
import celestial.rCo_1;
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
import celestial.xc_3;
import celestial.xu_3;
import celestial.zg_3;
import java.util.List;
import java.util.Random;

public class rrrE
extends rrrQ {
    private final boolean id_class;
    private final boolean id_break;
    private final boolean id_byte;
    private final boolean id_throws;

    public rrrE(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_synchronized, n);
        this.id_class(rpr_32);
        this.id_protected = this.id_class(random);
        this.id_final = rfi_32;
        this.id_class = random.nextBoolean();
        this.id_break = random.nextBoolean();
        this.id_byte = random.nextBoolean();
        this.id_throws = random.nextInt(3) > 0;
    }

    public rrrE(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_synchronized, rcd_32);
        this.id_class = rcd_32.id_new("leftLow");
        this.id_break = rcd_32.id_new("leftHigh");
        this.id_byte = rcd_32.id_new("rightLow");
        this.id_throws = rcd_32.id_new("rightHigh");
    }

    public static rrrE id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -4, -3, 0, 10, 9, 11, rpr_32);
        return rrrE.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rrrE(n4, random, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 0, 0, 9, 8, 10, true, random, rii_3.id_throws);
        this.id_class(rRI2, random, rfi_32, this.id_protected, 4, 3, 0);
        if (this.id_class) {
            this.id_class(rRI2, rfi_32, 0, 3, 1, 0, 5, 3, id_volatile, id_volatile, false);
        }
        if (this.id_byte) {
            this.id_class(rRI2, rfi_32, 9, 3, 1, 9, 5, 3, id_volatile, id_volatile, false);
        }
        if (this.id_break) {
            this.id_class(rRI2, rfi_32, 0, 5, 7, 0, 7, 9, id_volatile, id_volatile, false);
        }
        if (this.id_throws) {
            this.id_class(rRI2, rfi_32, 9, 5, 7, 9, 7, 9, id_volatile, id_volatile, false);
        }
        this.id_class(rRI2, rfi_32, 5, 1, 10, 7, 3, 10, id_volatile, id_volatile, false);
        this.id_class(rRI2, rfi_32, 1, 2, 1, 8, 2, 6, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 4, 1, 5, 4, 4, 9, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 8, 1, 5, 8, 4, 9, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 1, 4, 7, 3, 4, 9, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 1, 3, 5, 3, 3, 6, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 1, 3, 4, 3, 3, 4, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 4, 6, 3, 4, 6, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 1, 7, 7, 1, 8, false, random, rii_3.id_throws);
        this.id_class(rRI2, rfi_32, 5, 1, 9, 7, 1, 9, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 2, 7, 7, 2, 7, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
        this.id_class(rRI2, rfi_32, 4, 5, 7, 4, 5, 9, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, 5, 7, 8, 5, 9, xu_3.Ge.id_continue(), xu_3.Ge.id_continue(), false);
        this.id_class(rRI2, rfi_32, 5, 5, 7, 7, 5, 9, (xc_3)xu_3.Ge.id_continue().id_class(Wg_1.id_volatile, rCo_1.DOUBLE), (xc_3)xu_3.Ge.id_continue().id_class(Wg_1.id_volatile, rCo_1.DOUBLE), false);
        this.id_class(rRI2, (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_3.SOUTH), 6, 5, 6, rfi_32);
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        int n = 3;
        int n2 = 5;
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 == rpr_3.WEST || rpr_32 == rpr_3.NORTH) {
            n = 8 - n;
            n2 = 8 - n2;
        }
        this.id_class((rrrd_1)rrrn_12, list, random, 5, 1);
        if (this.id_class) {
            this.id_break((rrrd_1)rrrn_12, list, random, n, 1);
        }
        if (this.id_break) {
            this.id_break((rrrd_1)rrrn_12, list, random, n2, 7);
        }
        if (this.id_byte) {
            this.id_byte((rrrd_1)rrrn_12, list, random, n, 1);
        }
        if (this.id_throws) {
            this.id_byte((rrrd_1)rrrn_12, list, random, n2, 7);
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("leftLow", this.id_class);
        rcd_32.id_class("leftHigh", this.id_break);
        rcd_32.id_class("rightLow", this.id_byte);
        rcd_32.id_class("rightHigh", this.id_throws);
    }
}

