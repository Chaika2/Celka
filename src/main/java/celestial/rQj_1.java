/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQF;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rrEm_1;
import celestial.rzr_3;

public class rQj_1
implements rQz_1 {
    public final Boolean id_class;
    public final Boolean id_break;

    public rQj_1(Boolean bl, Boolean bl2) {
        this.id_class = bl;
        this.id_break = bl2;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public boolean id_class(rzr_3 rzr_32) {
        rrEm_1 rrEm_12 = rzr_32.id_byte();
        if (this.id_class != null && this.id_class.booleanValue() != rrEm_12.s()) {
            return false;
        }
        return this.id_break == null || this.id_break.booleanValue() == rrEm_12.S();
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_final;
    }
}

