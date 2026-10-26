/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LT;
import celestial.Lt_1;
import celestial.Lw_1;
import celestial.QY;

public abstract class LV<E extends Lt_1<E>>
extends LT<E> {
    private boolean id_class;

    public LV(QY qY, int n, int n2, int n3, int n4, int n5) {
        super(qY, n, n2, n3, n4, n5);
    }

    @Override
    public boolean id_break(boolean bl) {
        if (!this.id_class && this.id_volatile() == 0) {
            return false;
        }
        boolean bl2 = this.id_class = !this.id_class;
        if (this.id_class && this.id_finally() == null && this.id_volatile() > 0) {
            this.id_class(Lw_1.DOWN);
        } else if (this.id_class && this.id_finally() != null) {
            this.id_new();
        }
        return this.id_class;
    }
}

