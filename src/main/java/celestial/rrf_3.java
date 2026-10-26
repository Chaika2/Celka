/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rrD_2;
import celestial.rrEm_1;
import celestial.rrEr_1;

public class rrf_3
extends rrD_2 {
    public rrf_3(float f) {
        super(f);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        rrEr_1 rrEr_12 = rrEm_12.id_interface(iB_22.Bs());
        return rrEr_12 != null && rrEr_12.id_throws() && super.id_class(rrEm_12, iB_22);
    }
}

