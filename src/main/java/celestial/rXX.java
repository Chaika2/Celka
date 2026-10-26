/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCL;
import celestial.rCZ;
import celestial.rXE;
import celestial.rXh_1;
import celestial.rXs_1;

public class rXX
extends rXh_1 {
    @Override
    public boolean id_byte(rXE rXE2) {
        return false;
    }

    @Override
    protected void id_class(rCL<rXs_1, rXE> rCL2) {
        super.id_class(rCL2);
        rCL2.id_class(new rCZ[]{id_break});
    }

    @Override
    public int id_protected(rXE rXE2) {
        return rXE2.id_byte(id_break);
    }
}

