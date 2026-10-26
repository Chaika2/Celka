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
import celestial.rzl_3;
import celestial.xu_3;
import java.util.List;
import java.util.Random;

public class rrrS
extends rrrQ {
    private boolean id_class;

    public rrrS(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_this, n);
        this.id_class(rpr_32);
        this.id_protected = this.id_class(random);
        this.id_final = rfi_32;
    }

    public rrrS(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_this, rcd_32);
        this.id_class = rcd_32.id_new("Chest");
    }

    public static rrrS id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -1, -1, 0, 5, 5, 7, rpr_32);
        return rrrS.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rrrS(n4, random, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 0, 0, 4, 4, 6, true, random, rii_3.id_throws);
        this.id_class(rRI2, random, rfi_32, this.id_protected, 1, 1, 0);
        this.id_class(rRI2, random, rfi_32, rrrN.OPENING, 1, 1, 6);
        this.id_class(rRI2, rfi_32, 3, 1, 2, 3, 1, 4, xu_3.BL.id_continue(), xu_3.BL.id_continue(), false);
        this.id_class(rRI2, xu_3.bS.id_continue(), 3, 1, 1, rfi_32);
        this.id_class(rRI2, xu_3.bS.id_continue(), 3, 1, 5, rfi_32);
        this.id_class(rRI2, xu_3.bS.id_continue(), 3, 2, 2, rfi_32);
        this.id_class(rRI2, xu_3.bS.id_continue(), 3, 2, 4, rfi_32);
        for (int i = 2; i <= 4; ++i) {
            this.id_class(rRI2, xu_3.bS.id_continue(), 2, 1, i, rfi_32);
        }
        if (!this.id_class && rfi_32.id_break(new rfH_2(this.id_class(3, 3), this.id_class(2), this.id_break(3, 3)))) {
            this.id_class = true;
            this.id_class(rRI2, rfi_32, random, 3, 2, 3, rzl_3.id_goto);
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        this.id_class((rrrd_1)rrrn_12, list, random, 1, 1);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Chest", this.id_class);
    }
}

