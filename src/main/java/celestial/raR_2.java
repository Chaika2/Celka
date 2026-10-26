/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRq_1;
import celestial.raF_2;
import celestial.raU_2;
import celestial.rcd_3;
import celestial.rfi_3;
import celestial.rrrn_1;
import celestial.xc_3;
import celestial.xu_3;

public abstract class raR_2
extends rrrn_1 {
    protected raU_2 id_class;

    protected xc_3 id_byte() {
        switch (this.id_class) {
            default: {
                return xu_3.PV.id_continue();
            }
            case MESA: 
        }
        return xu_3.bm.id_continue();
    }

    public raR_2(raF_2 raF_22, int n, raU_2 raU_22) {
        super(raF_22, n);
        this.id_class = raU_22;
    }

    public raR_2(raF_2 raF_22, rcd_3 rcd_32) {
        super(raF_22, rcd_32);
        this.id_class = raU_2.id_class(rcd_32.id_private("MST"));
    }

    protected boolean id_class(rRq_1 rRq_12, rfi_3 rfi_32, int n, int n2, int n3, int n4) {
        for (int i = n; i <= n2; ++i) {
            if (!this.id_class(rRq_12, i, n3 + 1, n4, rfi_32).id_catch()) continue;
            return false;
        }
        return true;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_break("MST", this.id_class.ordinal());
    }

    protected xc_3 id_break() {
        switch (this.id_class) {
            default: {
                return xu_3.id_final.id_continue();
            }
            case MESA: 
        }
        return xu_3.id_super.id_continue();
    }
}

