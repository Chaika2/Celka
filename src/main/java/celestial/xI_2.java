/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rHu_1;
import celestial.rJZ;
import celestial.rXW;
import celestial.ryX_2;
import celestial.xf_3;
import java.util.Optional;

public class xI_2
implements ryX_2<rHu_1, Optional<rJZ>> {
    public Optional<rJZ> id_class() {
        return Optional.empty();
    }

    @Override
    public Optional<rJZ> id_class(rHu_1 rHu_12) {
        return Optional.of(rHu_12);
    }

    @Override
    public Optional<rJZ> id_class(rHu_1 rHu_12, rHu_1 rHu_13) {
        rXW rXW2 = new rXW(rHu_12, rHu_13);
        return Optional.of(new xf_3(this, rHu_12, rHu_13, rXW2));
    }

    @Override
    public /* synthetic */ Object id_break() {
        return this.id_class();
    }
}

