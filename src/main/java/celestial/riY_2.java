/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKv_1;
import celestial.rRg_1;
import celestial.raF_2;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rfw_3;
import celestial.rpB_2;
import celestial.rpb_3;
import celestial.rrrn_1;
import java.util.Random;

public abstract class riY_2
extends rrrn_1 {
    protected final int id_class;
    protected final int id_break;
    protected final int id_byte;
    protected int id_protected = -1;

    protected riY_2(raF_2 raF_22, Random random, int n, int n2, int n3, int n4, int n5, int n6) {
        super(raF_22, 0);
        this.id_class = n4;
        this.id_break = n5;
        this.id_byte = n6;
        this.id_class(rpb_3.HORIZONTAL.id_class(random));
        this.id_final = this.id_implements().id_final() == rpB_2.Z ? new rfi_3(n, n2, n3, n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1) : new rfi_3(n, n2, n3, n + n6 - 1, n2 + n5 - 1, n3 + n4 - 1);
    }

    protected riY_2(raF_2 raF_22, rcd_3 rcd_32) {
        super(raF_22, rcd_32);
        this.id_class = rcd_32.id_private("Width");
        this.id_break = rcd_32.id_private("Height");
        this.id_byte = rcd_32.id_private("Depth");
        this.id_protected = rcd_32.id_private("HPos");
    }

    protected boolean id_class(rRg_1 rRg_12, rfi_3 rfi_32, int n) {
        if (this.id_protected >= 0) {
            return true;
        }
        int n2 = 0;
        int n3 = 0;
        rfw_3 rfw_32 = new rfw_3();
        for (int i = this.id_final.id_byte; i <= this.id_final.id_case; ++i) {
            for (int j = this.id_final.id_class; j <= this.id_final.id_protected; ++j) {
                rfw_32.id_class(j, 64, i);
                if (!rfi_32.id_break(rfw_32)) continue;
                n2 += rRg_12.id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, (rfH_2)rfw_32).c_();
                ++n3;
            }
        }
        if (n3 == 0) {
            return false;
        }
        this.id_protected = n2 / n3;
        this.id_final.id_class(0, this.id_protected - this.id_final.id_break + n, 0);
        return true;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_break("Width", this.id_class);
        rcd_32.id_break("Height", this.id_break);
        rcd_32.id_break("Depth", this.id_byte);
        rcd_32.id_break("HPos", this.id_protected);
    }
}

