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
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrQ;
import celestial.rrrn_1;
import celestial.xu_3;
import java.util.List;
import java.util.Random;

public class rrrs_1
extends rrrQ {
    private final int id_class;

    public rrrs_1(int n, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_else, n);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
        this.id_class = rpr_32 != rpr_3.NORTH && rpr_32 != rpr_3.SOUTH ? rfi_32.id_protected() : rfi_32.id_case();
    }

    public rrrs_1(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_else, rcd_32);
        this.id_class = rcd_32.id_private("Steps");
    }

    public static rfi_3 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32) {
        int n4 = 3;
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -1, -1, 0, 5, 5, 4, rpr_32);
        rrrn_1 rrrn_12 = rrrn_1.id_class(list, rfi_32);
        if (rrrn_12 == null) {
            return null;
        }
        if (rrrn_12.id_catch().id_break == rfi_32.id_break) {
            for (int i = 3; i >= 1; --i) {
                rfi_32 = rfi_3.id_class(n, n2, n3, -1, -1, 0, 5, 5, i - 1, rpr_32);
                if (rrrn_12.id_catch().id_class(rfi_32)) continue;
                return rfi_3.id_class(n, n2, n3, -1, -1, 0, 5, 5, i, rpr_32);
            }
        }
        return null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        for (int i = 0; i < this.id_class; ++i) {
            this.id_class(rRI2, xu_3.BL.id_continue(), 0, 0, i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 1, 0, i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 2, 0, i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 3, 0, i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 4, 0, i, rfi_32);
            for (int j = 1; j <= 3; ++j) {
                this.id_class(rRI2, xu_3.BL.id_continue(), 0, j, i, rfi_32);
                this.id_class(rRI2, xu_3.hb.id_continue(), 1, j, i, rfi_32);
                this.id_class(rRI2, xu_3.hb.id_continue(), 2, j, i, rfi_32);
                this.id_class(rRI2, xu_3.hb.id_continue(), 3, j, i, rfi_32);
                this.id_class(rRI2, xu_3.BL.id_continue(), 4, j, i, rfi_32);
            }
            this.id_class(rRI2, xu_3.BL.id_continue(), 0, 4, i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 1, 4, i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 2, 4, i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 3, 4, i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 4, 4, i, rfi_32);
        }
        return true;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Steps", this.id_class);
    }
}

