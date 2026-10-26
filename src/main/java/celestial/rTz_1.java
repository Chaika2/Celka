/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTQ;

public abstract class rTz_1<R extends Runnable>
extends rTQ<R> {
    private int id_class;

    public rTz_1(String string) {
        super(string);
    }

    @Override
    protected boolean y() {
        return this.rh() || super.y();
    }

    protected boolean rh() {
        return this.id_class != 0;
    }

    @Override
    protected void id_throws(R r) {
        ++this.id_class;
        try {
            super.id_throws(r);
        }
        finally {
            --this.id_class;
        }
    }
}

