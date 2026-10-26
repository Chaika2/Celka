/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EC;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GE;
import celestial.Mr_1;
import celestial.rU_2;
import celestial.rpr_3;

public non-sealed class EY
extends EC {
    public EY(int n2, int n3, int n4, boolean bl, boolean bl2) {
    }

    @Override
    public void id_class(EZ eZ, int n, int n2, int n3, Mr_1 mr_1) {
        GE.id_class(eZ, n, n2, n3, rpr_3.WEST, mr_1);
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return GE.id_class(eZ, rU_22, rpr_3.WEST);
    }
}

