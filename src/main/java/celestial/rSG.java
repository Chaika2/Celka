/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rOQ;
import java.util.EnumSet;

public class rSG
extends rBk_1 {
    private final rOQ id_class;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_final();
        this.id_class.id_public(true);
    }

    public rSG(rOQ rOQ2) {
        this.id_class = rOQ2;
        this.id_class(EnumSet.of(rBW.JUMP, rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        if (!this.id_class.sZ()) {
            return false;
        }
        if (this.id_class.Pa()) {
            return false;
        }
        if (!this.id_class.BL()) {
            return false;
        }
        iB_2 iB_22 = this.id_class.sF();
        if (iB_22 == null) {
            return true;
        }
        return this.id_class.id_int(iB_22) < 144.0 && iB_22.Sr() != null ? false : this.id_class.sL();
    }

    @Override
    public boolean id_break() {
        return this.id_class.sL();
    }

    @Override
    public void id_protected() {
        this.id_class.id_public(false);
    }
}

