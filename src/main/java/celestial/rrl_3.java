/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.rrEm_1;
import celestial.rrEr_1;
import celestial.rrH_2;

public class rrl_3
extends rrH_2 {
    public rrl_3(float f) {
        super(f);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, aA_2 aA_22) {
        rrEr_1 rrEr_12 = rrEm_12.id_interface(aA_22.Bs());
        return rrEr_12 != null && rrEr_12.id_throws() && super.id_class(rrEm_12, aA_22);
    }
}

