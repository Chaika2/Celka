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
import celestial.zG_2;
import java.util.List;
import java.util.Random;

public class rrrk_1
extends rrrQ {
    public rrrk_1(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_abstract, n);
        this.id_class(rpr_32);
        this.id_protected = this.id_class(random);
        this.id_final = rfi_32;
    }

    public rrrk_1(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_abstract, rcd_32);
    }

    public static rrrk_1 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -1, -7, 0, 5, 11, 8, rpr_32);
        return rrrk_1.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rrrk_1(n4, random, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 0, 0, 4, 10, 7, true, random, rii_3.id_throws);
        this.id_class(rRI2, random, rfi_32, this.id_protected, 1, 7, 0);
        this.id_class(rRI2, random, rfi_32, rrrN.OPENING, 1, 1, 7);
        xc_3 xc_32 = (xc_3)xu_3.Pd.id_continue().id_class(zG_2.id_volatile, rpr_3.SOUTH);
        for (int i = 0; i < 6; ++i) {
            this.id_class(rRI2, xc_32, 1, 6 - i, 1 + i, rfi_32);
            this.id_class(rRI2, xc_32, 2, 6 - i, 1 + i, rfi_32);
            this.id_class(rRI2, xc_32, 3, 6 - i, 1 + i, rfi_32);
            if (i >= 5) continue;
            this.id_class(rRI2, xu_3.BL.id_continue(), 1, 5 - i, 1 + i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 2, 5 - i, 1 + i, rfi_32);
            this.id_class(rRI2, xu_3.BL.id_continue(), 3, 5 - i, 1 + i, rfi_32);
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        this.id_class((rrrd_1)rrrn_12, list, random, 1, 1);
    }
}

