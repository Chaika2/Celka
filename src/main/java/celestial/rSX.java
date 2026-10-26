/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBW;
import celestial.rBk_1;
import celestial.rJr_1;
import celestial.rhd_3;
import celestial.rsy_3;
import java.util.EnumSet;

public class rSX
extends rBk_1 {
    private final rsy_3 id_class;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_final();
    }

    public rSX(rsy_3 rsy_32) {
        this.id_class = rsy_32;
        this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (!this.id_class.BM()) {
            return false;
        }
        if (this.id_class.rT()) {
            return false;
        }
        if (!this.id_class.BL()) {
            return false;
        }
        if (((Boolean)this.id_class.id_throws[25]).booleanValue()) {
            return false;
        }
        rhd_3 rhd_32 = this.id_class.id_class();
        if (rhd_32 == null) {
            return false;
        }
        if (this.id_class.id_int(rhd_32) > 16.0) {
            return false;
        }
        return (rJr_1)rhd_32.id_implements[4] != null;
    }

    @Override
    public void id_protected() {
        this.id_class.id_class((rhd_3)null);
    }
}

