/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rzO_2;
import celestial.rzQ_2;
import celestial.rzh_3;
import celestial.rzr_3;
import celestial.rzx_3;
import java.util.Random;

public class rNm_1
extends rzO_2 {
    public static rzh_3<?> id_byte() {
        return rNm_1.id_class(rNm_1::new);
    }

    public rNm_1(rQz_1[] rQz_1Array) {
        super(rQz_1Array);
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_continue;
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        Float f = rzr_32.id_break(rzQ_2.id_finally);
        if (f != null) {
            Random random = rzr_32.id_class();
            float f2 = 1.0f / f.floatValue();
            int n = rdn_32.id_char();
            int n2 = 0;
            for (int i = 0; i < n; ++i) {
                if (!(random.nextFloat() <= f2)) continue;
                ++n2;
            }
            rdn_32.id_throws(n2);
        }
        return rdn_32;
    }
}

