/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRW;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rfH_2;
import celestial.xc_3;
import java.util.Optional;

public class rRQ {
    public Optional<Float> id_class(rRW rRW2, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2) {
        return xc_32.id_catch() && rXE2.id_byte() ? Optional.empty() : Optional.of(Float.valueOf(Math.max(xc_32.id_break().id_extends(), rXE2.id_implements())));
    }

    public boolean id_class(rRW rRW2, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, float f) {
        return true;
    }
}

