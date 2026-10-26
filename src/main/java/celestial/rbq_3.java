/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBk_1;
import celestial.rbF_2;

public abstract class rbq_3
extends rBk_1 {
    public final /* synthetic */ rbF_2 id_break;

    public rbq_3(rbF_2 rbF_22) {
        this.id_break = rbF_22;
    }

    @Override
    public boolean id_class() {
        return this.id_catch() && !this.id_break.T_();
    }

    @Override
    public boolean id_break() {
        return this.id_private() && !this.id_break.T_();
    }

    public abstract boolean id_catch();

    public abstract boolean id_private();
}

