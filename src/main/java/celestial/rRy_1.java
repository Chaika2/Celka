/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rKH;
import celestial.rKv_1;
import celestial.rRR;
import celestial.rRw_1;
import celestial.rVL;
import celestial.rVm_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rqM_2;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface rRy_1
extends rKH,
rRR,
rRw_1 {
    @Override
    default public rfH_2 id_class(rKv_1 rKv_12, rfH_2 rfH_22) {
        return rRR.super.id_class(rKv_12, rfH_22);
    }

    @Override
    default public boolean id_class(an_3 an_32, rjC_2 rjC_22) {
        return rRw_1.super.id_class(an_32, rjC_22);
    }

    @Override
    default public Stream<rjC_2> id_class(an_3 an_32, rfl_3 rfl_32, Predicate<an_3> predicate) {
        return rRw_1.super.id_class(an_32, rfl_32, predicate);
    }

    public rVm_1 id_new();

    default public Optional<rqM_2<rYG>> id_protected(rfH_2 rfH_22) {
        return this.id_new().id_break(rVL.n).id_byte(this.id_implements(rfH_22));
    }
}

