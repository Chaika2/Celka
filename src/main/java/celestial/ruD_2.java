/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmb_3;
import celestial.ruu_3;
import java.util.OptionalInt;

public class ruD_2
implements rmb_3<OptionalInt> {
    @Override
    public OptionalInt id_class(OptionalInt optionalInt) {
        return optionalInt;
    }

    @Override
    public OptionalInt id_class(ruu_3 ruu_32) {
        int n = ruu_32.id_case();
        return n == 0 ? OptionalInt.empty() : OptionalInt.of(n - 1);
    }

    @Override
    public void id_class(ruu_3 ruu_32, OptionalInt optionalInt) {
        ruu_32.id_protected(optionalInt.orElse(-1) + 1);
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

