/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rBu_1;

public class rBV
extends rBu_1 {
    private final boolean id_class;
    private int id_break;

    @Override
    public void id_byte() {
        this.id_break = 20;
        this.id_class(true);
    }

    public rBV(is_3 is_32, boolean bl) {
        super(is_32);
        this.id_protected = is_32;
        this.id_class = bl;
    }

    @Override
    public boolean id_break() {
        return this.id_class && this.id_break > 0 && super.id_break();
    }

    @Override
    public void id_throws() {
        --this.id_break;
        super.id_throws();
    }

    @Override
    public void id_protected() {
        this.id_class(false);
    }
}

