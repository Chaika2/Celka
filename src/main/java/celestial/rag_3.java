/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rRq_1;
import celestial.raF_2;
import celestial.raR_2;
import celestial.raU_2;
import celestial.raf_3;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import celestial.xc_3;
import java.util.List;
import java.util.Random;

public class rag_3
extends raR_2 {
    private final rpr_3 id_break;
    private final boolean id_byte;

    public rag_3(int n, rfi_3 rfi_32, rpr_3 rpr_32, raU_2 raU_22) {
        super(raF_2.id_break, n, raU_22);
        this.id_break = rpr_32;
        this.id_final = rfi_32;
        this.id_byte = rfi_32.id_throws() > 3;
    }

    public rag_3(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_break, rcd_32);
        this.id_byte = rcd_32.id_new("tf");
        this.id_break = rpr_3.id_break(rcd_32.id_private("D"));
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        int n = this.id_private();
        switch (this.id_break) {
            default: {
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte - 1, rpr_3.NORTH, n);
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.WEST, n);
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.EAST, n);
                break;
            }
            case SOUTH: {
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_case + 1, rpr_3.SOUTH, n);
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.WEST, n);
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.EAST, n);
                break;
            }
            case WEST: {
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte - 1, rpr_3.NORTH, n);
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_case + 1, rpr_3.SOUTH, n);
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.WEST, n);
                break;
            }
            case EAST: {
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte - 1, rpr_3.NORTH, n);
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_case + 1, rpr_3.SOUTH, n);
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break, this.id_final.id_byte + 1, rpr_3.EAST, n);
            }
        }
        if (this.id_byte) {
            if (random.nextBoolean()) {
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + 1, this.id_final.id_break + 3 + 1, this.id_final.id_byte - 1, rpr_3.NORTH, n);
            }
            if (random.nextBoolean()) {
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break + 3 + 1, this.id_final.id_byte + 1, rpr_3.WEST, n);
            }
            if (random.nextBoolean()) {
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break + 3 + 1, this.id_final.id_byte + 1, rpr_3.EAST, n);
            }
            if (random.nextBoolean()) {
                raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + 1, this.id_final.id_break + 3 + 1, this.id_final.id_case + 1, rpr_3.SOUTH, n);
            }
        }
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        if (this.id_class(rRI2, rfi_32)) {
            return false;
        }
        xc_3 xc_32 = this.id_break();
        if (this.id_byte) {
            this.id_class(rRI2, rfi_32, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte, this.id_final.id_protected - 1, this.id_final.id_break + 3 - 1, this.id_final.id_case, id_volatile, id_volatile, false);
            this.id_class(rRI2, rfi_32, this.id_final.id_class, this.id_final.id_break, this.id_final.id_byte + 1, this.id_final.id_protected, this.id_final.id_break + 3 - 1, this.id_final.id_case - 1, id_volatile, id_volatile, false);
            this.id_class(rRI2, rfi_32, this.id_final.id_class + 1, this.id_final.id_throws - 2, this.id_final.id_byte, this.id_final.id_protected - 1, this.id_final.id_throws, this.id_final.id_case, id_volatile, id_volatile, false);
            this.id_class(rRI2, rfi_32, this.id_final.id_class, this.id_final.id_throws - 2, this.id_final.id_byte + 1, this.id_final.id_protected, this.id_final.id_throws, this.id_final.id_case - 1, id_volatile, id_volatile, false);
            this.id_class(rRI2, rfi_32, this.id_final.id_class + 1, this.id_final.id_break + 3, this.id_final.id_byte + 1, this.id_final.id_protected - 1, this.id_final.id_break + 3, this.id_final.id_case - 1, id_volatile, id_volatile, false);
        } else {
            this.id_class(rRI2, rfi_32, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte, this.id_final.id_protected - 1, this.id_final.id_throws, this.id_final.id_case, id_volatile, id_volatile, false);
            this.id_class(rRI2, rfi_32, this.id_final.id_class, this.id_final.id_break, this.id_final.id_byte + 1, this.id_final.id_protected, this.id_final.id_throws, this.id_final.id_case - 1, id_volatile, id_volatile, false);
        }
        this.id_class(rRI2, rfi_32, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_byte + 1, this.id_final.id_throws);
        this.id_class(rRI2, rfi_32, this.id_final.id_class + 1, this.id_final.id_break, this.id_final.id_case - 1, this.id_final.id_throws);
        this.id_class(rRI2, rfi_32, this.id_final.id_protected - 1, this.id_final.id_break, this.id_final.id_byte + 1, this.id_final.id_throws);
        this.id_class(rRI2, rfi_32, this.id_final.id_protected - 1, this.id_final.id_break, this.id_final.id_case - 1, this.id_final.id_throws);
        for (int i = this.id_final.id_class; i <= this.id_final.id_protected; ++i) {
            for (int j = this.id_final.id_byte; j <= this.id_final.id_case; ++j) {
                if (!this.id_class((rRq_1)rRI2, i, this.id_final.id_break - 1, j, rfi_32).id_catch() || !this.id_class(rRI2, i, this.id_final.id_break - 1, j, rfi_32)) continue;
                this.id_class(rRI2, xc_32, i, this.id_final.id_break - 1, j, rfi_32);
            }
        }
        return true;
    }

    private void id_class(rRI rRI2, rfi_3 rfi_32, int n, int n2, int n3, int n4) {
        if (!this.id_class((rRq_1)rRI2, n, n4 + 1, n3, rfi_32).id_catch()) {
            this.id_class(rRI2, rfi_32, n, n2, n3, n, n4, n3, this.id_break(), id_volatile, false);
        }
    }

    public static rfi_3 id_class(List<rrrn_1> list, Random random, int n, int n2, int n3, rpr_3 rpr_32) {
        rfi_3 rfi_32 = new rfi_3(n, n2, n3, n, n2 + 3 - 1, n3);
        if (random.nextInt(4) == 0) {
            rfi_32.id_throws += 4;
        }
        switch (rpr_32) {
            default: {
                rfi_32.id_class = n - 1;
                rfi_32.id_protected = n + 3;
                rfi_32.id_byte = n3 - 4;
                break;
            }
            case SOUTH: {
                rfi_32.id_class = n - 1;
                rfi_32.id_protected = n + 3;
                rfi_32.id_case = n3 + 3 + 1;
                break;
            }
            case WEST: {
                rfi_32.id_class = n - 4;
                rfi_32.id_byte = n3 - 1;
                rfi_32.id_case = n3 + 3;
                break;
            }
            case EAST: {
                rfi_32.id_protected = n + 3 + 1;
                rfi_32.id_byte = n3 - 1;
                rfi_32.id_case = n3 + 3;
            }
        }
        return rrrn_1.id_class(list, rfi_32) != null ? null : rfi_32;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("tf", this.id_byte);
        rcd_32.id_break("D", this.id_break.id_protected());
    }
}

