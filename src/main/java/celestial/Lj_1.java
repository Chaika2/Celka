/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Lt_1;
import celestial.cC_2;
import celestial.cH_2;

public abstract class Lj_1<E extends Lj_1<E>>
extends Lt_1<E>
implements cH_2 {
    private cC_2 id_class;
    private boolean id_break;

    @Override
    public void id_class(cC_2 cC_22) {
        this.id_class = cC_22;
    }

    @Override
    public void id_class(boolean bl) {
        this.id_break = bl;
    }

    @Override
    public cC_2 id_catch() {
        return this.id_class;
    }

    @Override
    public boolean id_case() {
        return this.id_break;
    }
}

