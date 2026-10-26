/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.ik_3;
import celestial.rLR;
import celestial.rLo_1;

public class rLV
extends rLR {
    protected rLV(rLo_1 rLo_12, int n) {
        super(rLo_12, n);
    }

    @Override
    public void id_class(iB_2 iB_22, ik_3 ik_32, int n) {
        iB_22.id_return(iB_22.Sd() - (float)(4 * (n + 1)));
        super.id_class(iB_22, ik_32, n);
    }

    @Override
    public void id_break(iB_2 iB_22, ik_3 ik_32, int n) {
        iB_22.id_return(iB_22.Sd() + (float)(4 * (n + 1)));
        super.id_break(iB_22, ik_32, n);
    }
}

