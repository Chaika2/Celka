/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rUt_1;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rix_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrH;
import celestial.rrrZ;
import java.util.Random;

public class riA_2
extends rrrH<rUt_1> {
    private boolean id_throws;

    public riA_2(rrrZ<rUt_1> rrrZ2, int n, int n2, rfi_3 rfi_32, int n3, long l) {
        super(rrrZ2, n, n2, rfi_32, n3, l);
    }

    @Override
    public void id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32) {
        if (!this.id_throws) {
            this.id_break.clear();
            this.id_break(this.id_case(), this.id_catch());
        }
        super.id_class(rRI2, rrrA2, rKd_12, random, rfi_32, rfj_32);
    }

    @Override
    public void id_class(rVm_1 rVm_12, rKd_1 rKd_12, rrPt_1 rrPt_12, int n, int n2, rYG rYG2, rUt_1 rUt_12) {
        this.id_break(n, n2);
    }

    private void id_break(int n, int n2) {
        int n3 = n * 16 - 29;
        int n4 = n2 * 16 - 29;
        rpr_3 rpr_32 = rpb_3.HORIZONTAL.id_class(this.id_protected);
        this.id_break.add(new rix_3(this.id_protected, n3, n4, rpr_32));
        this.id_break();
        this.id_throws = true;
    }
}

