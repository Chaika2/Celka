/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cC_2;
import celestial.cH_2;
import celestial.ch_3;

public abstract class cu_3
extends ch_3
implements cH_2 {
    private cC_2 id_class;
    private boolean id_throws;

    @Override
    public void id_class(cC_2 cC_22) {
        this.id_class = cC_22;
    }

    @Override
    public final void id_class(boolean bl) {
        this.id_throws = bl;
    }

    @Override
    public cC_2 id_catch() {
        return this.id_class;
    }

    @Override
    public final boolean id_case() {
        return this.id_throws;
    }
}

