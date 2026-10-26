/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rRV;
import celestial.rYr_1;
import celestial.rfH_2;
import java.util.function.Function;

public class rYs_1<T>
implements rRV<T> {
    private final Function<rfH_2, rRV<T>> id_class;

    public rYs_1(Function<rfH_2, rRV<T>> function) {
        this.id_class = function;
    }

    @Override
    public void id_class(rfH_2 rfH_22, T t, int n, rYr_1 rYr_12) {
        this.id_class.apply(rfH_22).id_class(rfH_22, t, n, rYr_12);
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, T t) {
        return this.id_class.apply(rfH_22).id_class(rfH_22, t);
    }

    @Override
    public boolean id_break(rfH_2 rfH_22, T t) {
        return false;
    }
}

