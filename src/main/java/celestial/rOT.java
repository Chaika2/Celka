/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBD;
import celestial.rOp_1;

public class rOT
extends rBD {
    private final rOp_1 id_private;

    public rOT(rOp_1 rOp_12) {
        super(rOp_12, 1.0, 40);
        this.id_private = rOp_12;
    }

    @Override
    public boolean id_class() {
        return this.id_private.n() && super.id_class();
    }
}

