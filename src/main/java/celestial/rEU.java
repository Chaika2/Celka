/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rED;
import celestial.rGT;
import celestial.rGt_1;
import celestial.rLD;
import celestial.rLY;
import celestial.rRO;
import celestial.rYB;
import celestial.rqA_2;
import celestial.rqn_3;

public class rEU
extends rGt_1 {
    private int id_throws;
    public final /* synthetic */ rED id_class;

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_throws = this.id_class.I_().V();
    }

    public rEU(rED rED2) {
        this.id_class = rED2;
        super(rED2);
    }

    @Override
    public boolean id_class() {
        if (!super.id_class()) {
            return false;
        }
        if (this.id_class.I_() == null) {
            return false;
        }
        if (this.id_class.I_().V() == this.id_throws) {
            return false;
        }
        return ((rYB)this.id_class.id_throws[7]).id_throws(this.id_class.Bs()).id_class(rRO.NORMAL.ordinal());
    }

    @Override
    protected void id_finally() {
        this.id_class.I_().id_break(new rLY(rLD.id_package, 400));
    }

    @Override
    protected int id_catch() {
        return 20;
    }

    @Override
    protected rqA_2 id_extends() {
        return rqn_3.EF;
    }

    @Override
    protected int id_private() {
        return 180;
    }

    @Override
    protected rGT id_native() {
        return rGT.BLINDNESS;
    }
}

