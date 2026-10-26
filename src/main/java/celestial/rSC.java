/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rST;
import celestial.rSp_1;
import celestial.rSu_1;
import celestial.rjU_2;

public class rSC
extends rSp_1 {
    private rjU_2 id_break;

    @Override
    public void id_byte() {
        this.id_break = null;
    }

    public rSC(rSu_1 rSu_12) {
        super(rSu_12);
    }

    @Override
    public void id_break() {
        if (this.id_break == null) {
            this.id_break = this.id_class.Ps();
        }
    }

    @Override
    public float id_throws() {
        return 1.0f;
    }

    @Override
    public rjU_2 id_case() {
        return this.id_break;
    }

    public rST<rSC> id_protected() {
        return rST.id_extends;
    }

    @Override
    public boolean M_() {
        return true;
    }
}

