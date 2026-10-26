/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rQF;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rrEm_1;
import celestial.rzV_2;
import celestial.rzr_3;

public class rQI
implements rQz_1 {
    public final Long id_class;
    public final rzV_2 id_break;

    public rQI(Long l, rzV_2 rzV_22) {
        this.id_class = l;
        this.id_break = rzV_22;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public boolean id_class(rzr_3 rzr_32) {
        rrEm_1 rrEm_12 = rzr_32.id_byte();
        long l = rrEm_12.P();
        if (this.id_class != null) {
            l %= this.id_class.longValue();
        }
        return this.id_break.id_class((int)l);
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_int;
    }
}

