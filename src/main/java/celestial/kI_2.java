/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jp_1;
import celestial.Jq_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rls_3;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class kI_2
extends xF_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

    @Override
    public Jp_1 id_byte() {
        return Jp_1.XZ;
    }

    public kI_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_class(rls_3.c) || xc_32.id_class(xu_3.Po) || super.id_catch(xc_32, rRq_12, rfH_22);
    }
}

