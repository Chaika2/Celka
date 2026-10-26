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
import celestial.rrrc_1;
import celestial.rrrd_1;
import celestial.rrrn_1;
import java.util.List;
import java.util.Random;

public class rrrG
extends rrrc_1 {
    public rrrG(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_return, n);
        this.id_class(rpr_32);
        this.id_protected = this.id_class(random);
        this.id_final = rfi_32;
    }

    public rrrG(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_return, rcd_32);
    }

    public static rrrG id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -1, -1, 0, 5, 5, 5, rpr_32);
        return rrrG.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rrrG(n4, random, rfi_32, rpr_32) : null;
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        this.id_class(rRI2, rfi_32, 0, 0, 0, 4, 4, 4, true, random, rii_3.id_throws);
        this.id_class(rRI2, random, rfi_32, this.id_protected, 1, 1, 0);
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 != rpr_3.NORTH && rpr_32 != rpr_3.EAST) {
            this.id_class(rRI2, rfi_32, 4, 1, 1, 4, 3, 3, id_volatile, id_volatile, false);
        } else {
            this.id_class(rRI2, rfi_32, 0, 1, 1, 0, 3, 3, id_volatile, id_volatile, false);
        }
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        rpr_3 rpr_32 = this.id_implements();
        if (rpr_32 != rpr_3.NORTH && rpr_32 != rpr_3.EAST) {
            this.id_byte((rrrd_1)rrrn_12, list, random, 1, 1);
        } else {
            this.id_break((rrrd_1)rrrn_12, list, random, 1, 1);
        }
    }
}

