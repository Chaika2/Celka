/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.EC;
import celestial.EZ;
import celestial.Ev_1;
import celestial.GS;
import celestial.rU_2;

public non-sealed class El_1
extends EC {
    public El_1(int n2, int n3, int n4) {
    }

    @Override
    public double id_class(EZ eZ, int n, int n2, int n3) {
        return GS.id_protected(eZ, n, n2, n3);
    }

    @Override
    public Ev_1 id_class(EZ eZ, rU_2 rU_22) {
        return new GS(eZ.id_break(), rU_22, rU_22.id_case());
    }
}

