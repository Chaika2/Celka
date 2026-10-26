/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBA;
import celestial.rhd_3;
import celestial.rsy_3;

public class rBL
extends rBA {
    private final rsy_3 id_catch;

    public rBL(rsy_3 rsy_32) {
        super(rsy_32, rhd_3.class, 8.0f);
        this.id_catch = rsy_32;
    }

    @Override
    public boolean id_class() {
        if (this.id_catch.n()) {
            this.id_break = this.id_catch.id_class();
            return true;
        }
        return false;
    }
}

