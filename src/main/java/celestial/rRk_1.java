/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rRQ;
import celestial.rRW;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rfH_2;
import celestial.xc_3;
import java.util.Optional;

public class rRk_1
extends rRQ {
    private final an_3 id_class;

    public rRk_1(an_3 an_32) {
        this.id_class = an_32;
    }

    @Override
    public boolean id_class(rRW rRW2, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, float f) {
        return this.id_class.id_class(rRW2, rRq_12, rfH_22, xc_32, f);
    }

    @Override
    public Optional<Float> id_class(rRW rRW2, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2) {
        return super.id_class(rRW2, rRq_12, rfH_22, xc_32, rXE2).map(f -> Float.valueOf(this.id_class.id_class(rRW2, rRq_12, rfH_22, xc_32, rXE2, f.floatValue())));
    }
}

