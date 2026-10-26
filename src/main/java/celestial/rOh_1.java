/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rOQ;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rhN_2;

public abstract class rOh_1
extends rOQ {
    private int id_super;

    protected rOh_1(aI_2<? extends rOh_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rOQ>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        ++this.id_super;
        super.id_this();
    }

    public boolean sd() {
        return this.id_super > 100;
    }

    public boolean id_protected(rhN_2 rhN_22) {
        rcd_3 rcd_32 = new rcd_3();
        rcd_32.id_class("id", this.rW());
        this.id_case(rcd_32);
        if (rhN_22.id_private(rcd_32)) {
            this.PD();
            return true;
        }
        return false;
    }
}

