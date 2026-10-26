/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBl_1;
import celestial.rMl_1;

public class rMH
extends rBl_1 {
    private final rMl_1 id_break;

    public rMH(rMl_1 rMl_12, double d, boolean bl) {
        super(rMl_12, d, bl);
        this.id_break = rMl_12;
    }

    @Override
    public boolean id_class() {
        return this.id_break.sy() && super.id_class();
    }
}

