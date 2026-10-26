/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rPR;
import celestial.rbF_2;

public class rbC_2
extends rPR {
    public final /* synthetic */ rbF_2 id_private;

    public rbC_2(rbF_2 rbF_22, is_3 is_32) {
        this.id_private = rbF_22;
        super(is_32);
    }

    @Override
    public void id_class() {
        if (!this.id_private.T_()) {
            super.id_class();
        }
    }

    @Override
    protected boolean id_break() {
        return !this.id_private.id_long.id_extends();
    }
}

