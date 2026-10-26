/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTQ;
import celestial.rYB;
import celestial.rrEN;

public final class rrEc_1
extends rTQ<Runnable> {
    public final /* synthetic */ rrEN id_class;

    @Override
    protected boolean id_byte(Runnable runnable) {
        return true;
    }

    public rrEc_1(rrEN rrEN2, rYB rYB2) {
        this.id_class = rrEN2;
        super("Chunk source main thread executor for " + rYB2.E().id_class());
    }

    @Override
    protected boolean y() {
        return true;
    }

    @Override
    protected Runnable id_break(Runnable runnable) {
        return runnable;
    }

    @Override
    protected void id_throws(Runnable runnable) {
        super.id_throws(runnable);
    }

    @Override
    protected Thread P() {
        return this.id_class.id_case;
    }

    @Override
    protected boolean k_() {
        if (this.id_class.id_package()) {
            return true;
        }
        this.id_class.id_catch.id_break();
        return super.k_();
    }
}

