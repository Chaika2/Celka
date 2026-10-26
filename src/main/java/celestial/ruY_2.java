/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmb_3;
import celestial.ruu_3;
import java.util.Optional;
import java.util.UUID;

public class ruY_2
implements rmb_3<Optional<UUID>> {
    @Override
    public Optional<UUID> id_class(Optional<UUID> optional) {
        return optional;
    }

    @Override
    public Optional<UUID> id_class(ruu_3 ruu_32) {
        return !ruu_32.readBoolean() ? Optional.empty() : Optional.of(ruu_32.id_private());
    }

    @Override
    public void id_class(ruu_3 ruu_32, Optional<UUID> optional) {
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

