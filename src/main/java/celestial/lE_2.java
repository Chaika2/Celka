/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CT;
import celestial.Ch_1;
import celestial.gm_3;

public class lE_2
extends CT {
    public lE_2(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, d4, d5, d6, ch_1);
        this.id_else = 0.5f;
    }

    @Override
    public void id_case() {
        super.id_case();
        this.id_extends -= 0.004 + 0.04 * (double)this.id_else;
    }
}

