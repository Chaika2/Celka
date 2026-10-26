/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBI;
import celestial.rOH;
import celestial.rhP_2;

public class rhB_2
extends rBI<rOH> {
    public rhB_2(rhP_2 rhP_22) {
        super(rhP_22, rOH.class, 16, false, true, iB_22 -> !((rOH)iB_22).sZ());
    }

    @Override
    protected double id_extends() {
        return super.id_extends() * 0.25;
    }
}

