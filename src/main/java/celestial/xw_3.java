/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHu_1;
import celestial.rXW;
import celestial.rXu_1;
import celestial.ryX_2;
import java.util.Optional;

public class xw_3
implements ryX_2<rHu_1, Optional<rXu_1>> {
    public Optional<rXu_1> id_class() {
        return Optional.empty();
    }

    @Override
    public Optional<rXu_1> id_class(rHu_1 rHu_12) {
        return Optional.of(rHu_12);
    }

    @Override
    public Optional<rXu_1> id_class(rHu_1 rHu_12, rHu_1 rHu_13) {
        return Optional.of(new rXW(rHu_12, rHu_13));
    }

    @Override
    public /* synthetic */ Object id_break() {
        return this.id_class();
    }
}

