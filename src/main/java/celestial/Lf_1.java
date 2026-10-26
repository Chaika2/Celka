/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LT;
import celestial.Lj_1;
import celestial.QY;

public abstract class Lf_1<E extends Lj_1<E>>
extends LT<E> {
    public Lf_1(QY qY, int n, int n2, int n3, int n4, int n5) {
        super(qY, n, n2, n3, n4, n5);
    }

    @Override
    public boolean id_break(boolean bl) {
        boolean bl2 = super.id_break(bl);
        if (bl2) {
            this.id_protected((Lj_1)this.id_extends());
        }
        return bl2;
    }

    @Override
    protected boolean id_protected(int n) {
        return false;
    }
}

