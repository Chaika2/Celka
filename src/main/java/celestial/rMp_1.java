/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBk_1;
import celestial.rMl_1;

public class rMp_1
extends rBk_1 {
    private final rMl_1 id_class;

    @Override
    public void id_byte() {
        this.id_class.id_return(true);
    }

    public rMp_1(rMl_1 rMl_12) {
        this.id_class = rMl_12;
    }

    @Override
    public boolean id_class() {
        if (this.id_class.n_() && this.id_class.sy()) {
            if (this.id_class.sC() && rMl_1.id_class(this.id_class).nextInt(500) == 1) {
                return true;
            }
            return rMl_1.id_break(this.id_class).nextInt(6000) == 1;
        }
        return false;
    }

    @Override
    public boolean id_break() {
        return false;
    }
}

