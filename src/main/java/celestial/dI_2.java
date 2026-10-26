/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jp_1;
import celestial.Jq_1;
import celestial.rLR;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;

public class dI_2
extends xF_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(5.0, 0.0, 5.0, 11.0, 10.0, 11.0);
    private final rLR id_final;
    private final int id_package;

    @Override
    public Jp_1 id_byte() {
        return Jp_1.XZ;
    }

    public dI_2(rLR rLR2, int n, Jq_1 jq_1) {
        super(jq_1);
        this.id_final = rLR2;
        this.id_package = rLR2.id_class() ? n : n * 20;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rjU_2 rjU_22 = xc_32.id_class(rfH_22);
        return id_volatile.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    public rLR id_break() {
        return this.id_final;
    }

    public int id_implements() {
        return this.id_package;
    }
}

