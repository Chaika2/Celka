/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBk_1;
import celestial.rOh_1;
import celestial.rhN_2;
import celestial.rhx_3;

public class rBZ
extends rBk_1 {
    private final rOh_1 id_class;
    private rhN_2 id_break;
    private boolean id_byte;

    @Override
    public void id_byte() {
        this.id_break = (rhN_2)this.id_class.sF();
        this.id_byte = false;
    }

    public rBZ(rOh_1 rOh_12) {
        this.id_class = rOh_12;
    }

    @Override
    public boolean id_class() {
        rhN_2 rhN_22 = (rhN_2)this.id_class.sF();
        boolean bl = rhN_22 != null && !rhN_22.id_native() && !((rhx_3)rhN_22.id_implements[18]).id_break && !rhN_22.rT();
        return !this.id_class.sL() && bl && this.id_class.sd();
    }

    @Override
    public void id_throws() {
        if (!this.id_byte && !this.id_class.Sc() && !this.id_class.z() && this.id_class.rN().id_byte(this.id_break.rN())) {
            this.id_byte = this.id_class.id_protected(this.id_break);
        }
    }

    @Override
    public boolean J_() {
        return !this.id_byte;
    }
}

