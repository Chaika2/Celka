/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.raF_2;
import celestial.raR_2;
import celestial.raU_2;
import celestial.raf_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfj_3;
import celestial.rpr_3;
import celestial.rrPt_1;
import celestial.rrrA;
import celestial.rrrn_1;
import celestial.xu_3;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class raY_2
extends raR_2 {
    private final List<rfi_3> id_break = Lists.newLinkedList();

    public raY_2(int n, Random random, int n2, int n3, raU_2 raU_22) {
        super(raF_2.id_byte, n, raU_22);
        this.id_class = raU_22;
        this.id_final = new rfi_3(n2, 50, n3, n2 + 7 + random.nextInt(6), 54 + random.nextInt(6), n3 + 7 + random.nextInt(6));
    }

    public raY_2(rrPt_1 rrPt_12, rcd_3 rcd_32) {
        super(raF_2.id_byte, rcd_32);
        rcy_3 rcy_32 = rcd_32.id_protected("Entrances", 11);
        for (int i = 0; i < rcy_32.size(); ++i) {
            this.id_break.add(new rfi_3(rcy_32.id_case(i)));
        }
    }

    @Override
    public void id_class(int n, int n2, int n3) {
        super.id_class(n, n2, n3);
        for (rfi_3 rfi_32 : this.id_break) {
            rfi_32.id_class(n, n2, n3);
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcy_3 rcy_32 = new rcy_3();
        for (rfi_3 rfi_32 : this.id_break) {
            rcy_32.add(rfi_32.id_private());
        }
        rcd_32.id_class("Entrances", rcy_32);
    }

    @Override
    public boolean id_class(rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, Random random, rfi_3 rfi_32, rfj_3 rfj_32, rfH_2 rfH_22) {
        if (this.id_class(rRI2, rfi_32)) {
            return false;
        }
        this.id_class(rRI2, rfi_32, this.id_final.id_class, this.id_final.id_break, this.id_final.id_byte, this.id_final.id_protected, this.id_final.id_break, this.id_final.id_case, xu_3.id_finally.id_continue(), id_volatile, true);
        this.id_class(rRI2, rfi_32, this.id_final.id_class, this.id_final.id_break + 1, this.id_final.id_byte, this.id_final.id_protected, Math.min(this.id_final.id_break + 3, this.id_final.id_throws), this.id_final.id_case, id_volatile, id_volatile, false);
        for (rfi_3 rfi_33 : this.id_break) {
            this.id_class(rRI2, rfi_32, rfi_33.id_class, rfi_33.id_throws - 2, rfi_33.id_byte, rfi_33.id_protected, rfi_33.id_throws, rfi_33.id_case, id_volatile, id_volatile, false);
        }
        this.id_class(rRI2, rfi_32, this.id_final.id_class, this.id_final.id_break + 4, this.id_final.id_byte, this.id_final.id_protected, this.id_final.id_throws, this.id_final.id_case, id_volatile, false);
        return true;
    }

    @Override
    public void id_class(rrrn_1 rrrn_12, List<rrrn_1> list, Random random) {
        rfi_3 rfi_32;
        raR_2 raR_22;
        int n;
        int n2 = this.id_private();
        int n3 = this.id_final.id_throws() - 3 - 1;
        if (n3 <= 0) {
            n3 = 1;
        }
        for (n = 0; n < this.id_final.id_protected() && (n += random.nextInt(this.id_final.id_protected())) + 3 <= this.id_final.id_protected(); n += 4) {
            raR_22 = raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + n, this.id_final.id_break + random.nextInt(n3) + 1, this.id_final.id_byte - 1, rpr_3.NORTH, n2);
            if (raR_22 == null) continue;
            rfi_32 = raR_22.id_catch();
            this.id_break.add(new rfi_3(rfi_32.id_class, rfi_32.id_break, this.id_final.id_byte, rfi_32.id_protected, rfi_32.id_throws, this.id_final.id_byte + 1));
        }
        for (n = 0; n < this.id_final.id_protected() && (n += random.nextInt(this.id_final.id_protected())) + 3 <= this.id_final.id_protected(); n += 4) {
            raR_22 = raf_3.id_class(rrrn_12, list, random, this.id_final.id_class + n, this.id_final.id_break + random.nextInt(n3) + 1, this.id_final.id_case + 1, rpr_3.SOUTH, n2);
            if (raR_22 == null) continue;
            rfi_32 = raR_22.id_catch();
            this.id_break.add(new rfi_3(rfi_32.id_class, rfi_32.id_break, this.id_final.id_case - 1, rfi_32.id_protected, rfi_32.id_throws, this.id_final.id_case));
        }
        for (n = 0; n < this.id_final.id_case() && (n += random.nextInt(this.id_final.id_case())) + 3 <= this.id_final.id_case(); n += 4) {
            raR_22 = raf_3.id_class(rrrn_12, list, random, this.id_final.id_class - 1, this.id_final.id_break + random.nextInt(n3) + 1, this.id_final.id_byte + n, rpr_3.WEST, n2);
            if (raR_22 == null) continue;
            rfi_32 = raR_22.id_catch();
            this.id_break.add(new rfi_3(this.id_final.id_class, rfi_32.id_break, rfi_32.id_byte, this.id_final.id_class + 1, rfi_32.id_throws, rfi_32.id_case));
        }
        for (n = 0; n < this.id_final.id_case() && (n += random.nextInt(this.id_final.id_case())) + 3 <= this.id_final.id_case(); n += 4) {
            raR_22 = raf_3.id_class(rrrn_12, list, random, this.id_final.id_protected + 1, this.id_final.id_break + random.nextInt(n3) + 1, this.id_final.id_byte + n, rpr_3.EAST, n2);
            if (raR_22 == null) continue;
            rfi_32 = raR_22.id_catch();
            this.id_break.add(new rfi_3(this.id_final.id_protected - 1, rfi_32.id_break, rfi_32.id_byte, this.id_final.id_protected, rfi_32.id_throws, rfi_32.id_case));
        }
    }
}

