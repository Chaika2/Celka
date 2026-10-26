/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.function.Supplier;

public class rrxJ_2<T> {
    private T[] id_class = new Object[HU.s.length];
    private Supplier<T> id_break;

    public rrxJ_2(Function<HU, T> function) {
        int n;
        HU[] hUArray = HU.s;
        this.id_class = new Object[hUArray.length];
        for (n = 0; n < hUArray.length; ++n) {
            HU hU = hUArray[n];
            T t = function.apply(hU);
            this.id_class[hU.id_protected()] = t;
        }
        for (n = 0; n < this.id_class.length; ++n) {
            if (this.id_class[n] != null) continue;
            throw new RuntimeException("Missing value at index: " + n);
        }
    }

    public T id_class(HU hU) {
        return this.id_class[hU.id_protected()];
    }

    public Collection<T> id_class() {
        return Arrays.asList(this.id_class);
    }
}

