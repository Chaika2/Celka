/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rrEm_1;
import celestial.rrEr_1;
import celestial.rrF_2;

public class rrv_3
extends rrF_2 {
    public rrv_3(int n, float f) {
        super(n, f, 1);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        rrEr_1 rrEr_12 = rrEm_12.id_interface(iB_22.Bs());
        return super.id_class(rrEm_12, iB_22) && rrEr_12 != null && rrEr_12.id_this() && !rrEr_12.id_throws() && !rrEr_12.id_case();
    }
}

