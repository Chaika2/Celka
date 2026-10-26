/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.ap_3;
import celestial.iM_2;
import celestial.iQ_2;
import celestial.iz_3;
import celestial.rEi_1;
import celestial.rRR;
import celestial.rYB;
import celestial.rfH_2;

public class rEw_1
extends rEi_1 {
    public rEw_1(aI_2<? extends rEw_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rEi_1>)aI_22, rYB2);
    }

    @Override
    public float id_class(rfH_2 rfH_22, rRR rRR2) {
        return rRR2.id_native(rfH_22) - 0.5f;
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return 10.440001f;
    }

    public static iz_3 id_throws() {
        return rEi_1.sm().id_class(iQ_2.id_class, 100.0).id_class(iQ_2.id_protected, 0.5).id_class(iQ_2.id_case, 50.0);
    }
}

