/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.rac_3;
import celestial.raz_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpB_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import celestial.xu_3;
import java.util.List;
import java.util.Random;

public class rax_3
extends raz_3 {
    public rax_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        this(raF_2.id_throws, rcd_32);
    }

    protected rax_3(raF_2 raF_22, rcd_3 rcd_32) {
        super(raF_22, rcd_32);
    }

    protected rax_3(Random random, int n, int n2) {
        super(raF_2.id_throws, 0);
        this.id_class(rpb_3.HORIZONTAL.id_class(random));
        this.id_final = this.id_implements().id_final() == rpB_2.Z ? new rfi_3(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1) : new rfi_3(n, 64, n2, n + 19 - 1, 73, n2 + 19 - 1);
    }

    public rax_3(int n, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_throws, n);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
    }

    public static rax_3 id_class(List<rrrn_1> list, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -8, -3, 0, 19, 10, 19, rpr_32);
        return rax_3.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rax_3(n4, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2;
        this.id_class(rRI2, rfi_32, 7, 3, 0, 11, 4, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 3, 7, 18, 4, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 8, 5, 0, 10, 7, 18, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 5, 8, 18, 7, 10, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        this.id_class(rRI2, rfi_32, 7, 5, 0, 7, 5, 7, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 7, 5, 11, 7, 5, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 11, 5, 0, 11, 5, 7, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 11, 5, 11, 11, 5, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 5, 7, 7, 5, 7, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 11, 5, 7, 18, 5, 7, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 5, 11, 7, 5, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 11, 5, 11, 18, 5, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 7, 2, 0, 11, 2, 5, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 7, 2, 13, 11, 2, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 7, 0, 0, 11, 1, 3, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 7, 0, 15, 11, 1, 18, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        for (n2 = 7; n2 <= 11; ++n2) {
            for (n = 0; n <= 2; ++n) {
                this.id_break(rRI2, xu_3.SP.id_continue(), n2, -1, n, rfi_32);
                this.id_break(rRI2, xu_3.SP.id_continue(), n2, -1, 18 - n, rfi_32);
            }
        }
        this.id_class(rRI2, rfi_32, 0, 2, 7, 5, 2, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 13, 2, 7, 18, 2, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 0, 7, 3, 1, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 15, 0, 7, 18, 1, 11, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        for (n2 = 0; n2 <= 2; ++n2) {
            for (n = 7; n <= 11; ++n) {
                this.id_break(rRI2, xu_3.SP.id_continue(), n2, -1, n, rfi_32);
                this.id_break(rRI2, xu_3.SP.id_continue(), 18 - n2, -1, n, rfi_32);
            }
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        this.id_class((rac_3)rrrn_12, list, random, 8, 3, false);
        this.id_break((rac_3)rrrn_12, list, random, 3, 8, false);
        this.id_byte((rac_3)rrrn_12, list, random, 3, 8, false);
    }
}

