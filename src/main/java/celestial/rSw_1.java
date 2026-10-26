/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rSp_1;
import celestial.rSu_1;
import celestial.rhm_3;
import celestial.rye_3;

public abstract class rSw_1
extends rSp_1 {
    public rSw_1(rSu_1 rSu_12) {
        super(rSu_12);
    }

    @Override
    public float id_class(rye_3 rye_32, float f) {
        if (rye_32.id_finally() instanceof rhm_3) {
            rye_32.id_finally().id_case(1);
            return 0.0f;
        }
        return super.id_class(rye_32, f);
    }

    @Override
    public boolean M_() {
        return true;
    }
}

