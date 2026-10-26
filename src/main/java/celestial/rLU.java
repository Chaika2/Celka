/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rLR;
import celestial.rLo_1;
import celestial.rRO;
import celestial.rhN_2;
import celestial.rrEm_1;

public class rLU
extends rLR {
    public rLU(rLo_1 rLo_12, int n) {
        super(rLo_12, n);
    }

    @Override
    public boolean id_class(int n, int n2) {
        return true;
    }

    @Override
    public void id_class(iB_2 iB_22, int n) {
        if (iB_22 instanceof rhN_2 && !iB_22.id_native()) {
            rhN_2 rhN_22 = (rhN_2)iB_22;
            rrEm_1 rrEm_12 = rhN_22.id_continue();
            if (rrEm_12.id_abstract() == rRO.PEACEFUL) {
                return;
            }
            if (rrEm_12.id_throw(iB_22.Bs())) {
                rrEm_12.k().id_class(rhN_22);
            }
        }
    }
}

