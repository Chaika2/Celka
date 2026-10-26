/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.dp_3;
import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.rac_3;
import celestial.raz_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import celestial.rzl_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.List;
import java.util.Random;

public class raG_2
extends raz_3 {
    private boolean id_class;

    public raG_2(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_native, n);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
        this.id_class = random.nextInt(3) == 0;
    }

    public raG_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_native, rcd_32);
        this.id_class = rcd_32.id_new("Chest");
    }

    public static raG_2 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -1, 0, 0, 5, 7, 5, rpr_32);
        return raG_2.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new raG_2(n4, random, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 0, 0, 4, 1, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 2, 0, 4, 5, 4, xu_3.id_class.id_continue(), xu_3.id_class.id_continue(), false);
        xc_3 xc_32 = (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_int, true)).id_class(dp_3.id_final, true);
        xc_3 xc_33 = (xc_3)((xc_3)xu_3.SB.id_continue().id_class(dp_3.id_volatile, true)).id_class(dp_3.id_package, true);
        this.id_class(rRI2, rfi_32, 4, 2, 0, 4, 5, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 4, 3, 1, 4, 4, 1, xc_33, xc_33, false);
        this.id_class(rRI2, rfi_32, 4, 3, 3, 4, 4, 3, xc_33, xc_33, false);
        this.id_class(rRI2, rfi_32, 0, 2, 0, 0, 5, 0, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 0, 2, 4, 3, 5, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        this.id_class(rRI2, rfi_32, 1, 3, 4, 1, 4, 4, xc_32, xc_32, false);
        this.id_class(rRI2, rfi_32, 3, 3, 4, 3, 4, 4, xc_32, xc_32, false);
        if (this.id_class && rfi_32.id_break(new rfH_2(this.id_class(3, 3), this.id_class(2), this.id_break(3, 3)))) {
            this.id_class = false;
            this.id_class(rRI2, rfi_32, random, 3, 2, 3, rzl_3.id_synchronized);
        }
        this.id_class(rRI2, rfi_32, 0, 6, 0, 4, 6, 4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        for (int i = 0; i <= 4; ++i) {
            for (int j = 0; j <= 4; ++j) {
                this.id_break(rRI2, xu_3.SP.id_continue(), i, -1, j, rfi_32);
            }
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        this.id_break((rac_3)rrrn_12, list, random, 0, 1, true);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("Chest", this.id_class);
    }
}

