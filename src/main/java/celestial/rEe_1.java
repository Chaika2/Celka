/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rED;
import celestial.rGT;
import celestial.rGt_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rqA_2;
import celestial.rqn_3;

public class rEe_1
extends rGt_1 {
    public final /* synthetic */ rED id_class;

    public rEe_1(rED rED2) {
        this.id_class = rED2;
        super(rED2);
    }

    @Override
    public boolean id_class() {
        if (!super.id_class()) {
            return false;
        }
        return !this.id_class.id_break(rLD.id_final);
    }

    @Override
    protected void id_finally() {
        this.id_class.id_break(new rLY(rLD.id_final, 1200));
    }

    @Override
    protected int id_catch() {
        return 20;
    }

    @Override
    protected rqA_2 id_extends() {
        return rqn_3.EL;
    }

    @Override
    protected int id_private() {
        return 340;
    }

    @Override
    protected rGT id_native() {
        return rGT.DISAPPEAR;
    }
}

