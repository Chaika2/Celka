/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rmb_3;
import celestial.ruu_3;
import java.util.Optional;

public class rmP_2
implements rmb_3<Optional<rgP_2>> {
    @Override
    public Optional<rgP_2> id_class(Optional<rgP_2> optional) {
        return optional;
    }

    @Override
    public Optional<rgP_2> id_class(ruu_3 ruu_32) {
        return ruu_32.readBoolean() ? Optional.of(ruu_32.id_throws()) : Optional.empty();
    }

    @Override
    public void id_class(ruu_3 ruu_32, Optional<rgP_2> optional) {
        if (optional.isPresent()) {
            ruu_32.writeBoolean(true);
            ruu_32.id_class(optional.get());
        } else {
            ruu_32.writeBoolean(false);
        }
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

