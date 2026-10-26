/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.raz_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import celestial.xu_3;
import java.util.List;
import java.util.Random;

public class rad_3
extends raz_3 {
    private final int id_class;

    public rad_3(int n, Random random, rfi_3 rfi_32, rpr_3 rpr_32) {
        super(raF_2.id_case, n);
        this.id_class(rpr_32);
        this.id_final = rfi_32;
        this.id_class = random.nextInt();
    }

    public rad_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_case, rcd_32);
        this.id_class = rcd_32.id_private("Seed");
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Seed", this.id_class);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        int n;
        int n2;
        int n3;
        Random random2 = new Random(this.id_class);
        for (n3 = 0; n3 <= 4; ++n3) {
            for (n2 = 3; n2 <= 4; ++n2) {
                n = random2.nextInt(8);
                this.id_class(rRI2, rfi_32, n3, n2, 0, n3, n2, n, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
            }
        }
        n3 = random2.nextInt(8);
        this.id_class(rRI2, rfi_32, 0, 5, 0, 0, 5, n3, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        n3 = random2.nextInt(8);
        this.id_class(rRI2, rfi_32, 4, 5, 0, 4, 5, n3, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        for (n2 = 0; n2 <= 4; ++n2) {
            n = random2.nextInt(5);
            this.id_class(rRI2, rfi_32, n2, 2, 0, n2, 2, n, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
        }
        for (n2 = 0; n2 <= 4; ++n2) {
            for (n = 0; n <= 1; ++n) {
                int n4 = random2.nextInt(3);
                this.id_class(rRI2, rfi_32, n2, n, 0, n2, n, n4, xu_3.SP.id_continue(), xu_3.SP.id_continue(), false);
            }
        }
        return true;
    }

    public static rad_3 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32, int n4) {
        rfi_3 rfi_32 = rfi_3.id_class(n, n2, n3, -1, -3, 0, 5, 10, 8, rpr_32);
        return rad_3.id_class(rfi_32) && rrrn_1.id_class(list, rfi_32) == null ? new rad_3(n4, random, rfi_32, rpr_32) : null;
    }
}

