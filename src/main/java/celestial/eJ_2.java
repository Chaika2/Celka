/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.Uy_1;

public abstract class eJ_2
extends Uy_1 {
    private boolean id_break = true;

    @Override
    protected void id_class(Uq_1 uq_1) {
        uq_1.id_catch().id_byte(this.id_break() ? 1000 : 1001, uq_1.id_protected(), 0);
    }

    public void id_class(boolean bl) {
        this.id_break = bl;
    }

    public boolean id_break() {
        return this.id_break;
    }
}

