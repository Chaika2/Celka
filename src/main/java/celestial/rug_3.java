/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rfH_2;
import celestial.rmb_3;
import celestial.ruu_3;
import java.util.Optional;

public class rug_3
implements rmb_3<Optional<rfH_2>> {
    @Override
    public Optional<rfH_2> id_class(Optional<rfH_2> optional) {
        return optional;
    }

    @Override
    public Optional<rfH_2> id_class(ruu_3 ruu_32) {
        return !ruu_32.readBoolean() ? Optional.empty() : Optional.of(ruu_32.id_byte());
    }

    @Override
    public void id_class(ruu_3 ruu_32, Optional<rfH_2> optional) {
        ruu_32.writeBoolean(optional.isPresent());
        if (optional.isPresent()) {
            ruu_32.id_class(optional.get());
        }
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

