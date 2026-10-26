/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EC;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GG;
import celestial.rU_2;

public non-sealed class EV
extends EC {
    public EV(int n2, int n3, int n4) {
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return GG.id_protected(eZ, n, n2, n3);
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new GG(eZ.id_break(), rU_22, rU_22.id_class());
    }
}

