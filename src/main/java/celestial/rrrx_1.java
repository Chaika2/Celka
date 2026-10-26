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
import celestial.rpB_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrE;
import celestial.rrrN;
import celestial.rrrQ;
import celestial.rrrd_1;
import celestial.rrrn_1;
import celestial.xu_3;
import java.util.List;
import java.util.Random;

public class rrrx_1
extends rrrQ {
    private final boolean id_class;

    public rrrx_1(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        this(raF_2.id_throw, rcd_32);
    }

    public rrrx_1(raF_2 raF_22, rcd_3 rcd_32) {
        super(raF_22, rcd_32);
        this.id_class = rcd_32.id_new("Source");
    }

    public rrrx_1(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_throw, n);
        this.id_class = false;
        this.id_class(rpr_32);
        this.id_protected = this.id_class(random);
        this.id_final = rfi_32;
    }

    public rrrx_1(raF_2 raF_22, int n, Random random, int n2, int n3) {
        super(raF_22, n);
        this.id_class = true;
        this.id_class(rpb_3.HORIZONTAL.id_class(random));
        this.id_protected = rrrN.OPENING;
        this.id_final = this.id_implements().id_final() == rpB_2.Z ? new rfi_3(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1) : new rfi_3(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
    }

    public static rrrx_1 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -1, -7, 0, 5, 11, 5, rpr_32);
        return rrrx_1.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rrrx_1(n4, random, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 0, 0, 4, 10, 4, true, random, rii_3.id_throws);
        this.id_class(rRI2, random, rfi_32, this.id_protected, 1, 7, 0);
        this.id_class(rRI2, random, rfi_32, rrrN.OPENING, 1, 1, 4);
        this.id_class(rRI2, xu_3.BL.id_continue(), 2, 6, 1, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 1, 5, 1, rfi_32);
        this.id_class(rRI2, xu_3.Ge.id_continue(), 1, 6, 1, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 1, 5, 2, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 1, 4, 3, rfi_32);
        this.id_class(rRI2, xu_3.Ge.id_continue(), 1, 5, 3, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 2, 4, 3, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 3, 3, 3, rfi_32);
        this.id_class(rRI2, xu_3.Ge.id_continue(), 3, 4, 3, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 3, 3, 2, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 3, 2, 1, rfi_32);
        this.id_class(rRI2, xu_3.Ge.id_continue(), 3, 3, 1, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 2, 2, 1, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 1, 1, 1, rfi_32);
        this.id_class(rRI2, xu_3.Ge.id_continue(), 1, 2, 1, rfi_32);
        this.id_class(rRI2, xu_3.BL.id_continue(), 1, 1, 2, rfi_32);
        this.id_class(rRI2, xu_3.Ge.id_continue(), 1, 1, 3, rfi_32);
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        if (this.id_class) {
            rii_3.id_byte = rrrE.class;
        }
        this.id_class((rrrd_1)rrrn_12, list, random, 1, 1);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Source", this.id_class);
    }
}

