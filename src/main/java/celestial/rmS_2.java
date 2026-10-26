/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmb_3;
import celestial.ruu_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Optional;

public class rmS_2
implements rmb_3<Optional<xc_3>> {
    @Override
    public Optional<xc_3> id_class(Optional<xc_3> optional) {
        return optional;
    }

    @Override
    public Optional<xc_3> id_class(ruu_3 ruu_32) {
        int n = ruu_32.id_case();
        return n == 0 ? Optional.empty() : Optional.of(xd_3.id_class(n));
    }

    @Override
    public void id_class(ruu_3 ruu_32, Optional<xc_3> optional) {
        if (optional.isPresent()) {
            ruu_32.id_protected(xd_3.id_finally(optional.get()));
        } else {
            ruu_32.id_protected(0);
        }
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

