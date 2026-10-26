/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.iB_2;
import celestial.rEA;
import celestial.rGT;
import celestial.rGt_1;
import celestial.rOb_1;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rqA_2;
import celestial.rqn_3;
import celestial.rxL_2;
import java.util.List;

public class rEH
extends rGt_1 {
    private final ay_3 id_throws;
    public final /* synthetic */ rEA id_class;

    public rEH(rEA rEA2) {
        this.id_class = rEA2;
        super(rEA2);
        this.id_throws = new ay_3().id_class(16.0).id_class().id_class((iB_2 iB_22) -> ((rOb_1)iB_22).n() == rxL_2.BLUE);
    }

    @Override
    public boolean id_class() {
        if (this.id_class.I_() != null) {
            return false;
        }
        if (this.id_class.sn()) {
            return false;
        }
        if ((Integer)this.id_class.id_throws[41] < this.id_byte) {
            return false;
        }
        if (!((rYB)this.id_class.id_throws[7]).B().id_break(rRu_1.id_break)) {
            return false;
        }
        List<rOb_1> list = ((rYB)this.id_class.id_throws[7]).id_class(rOb_1.class, this.id_throws, this.id_class, this.id_class.rN().id_byte(16.0, 4.0, 16.0));
        if (list.isEmpty()) {
            return false;
        }
        this.id_class.id_class(list.get(rEA.id_throws(this.id_class).nextInt(list.size())));
        return true;
    }

    @Override
    public boolean id_break() {
        return this.id_class.sH() != null && this.id_break > 0;
    }

    @Override
    protected void id_finally() {
        rOb_1 rOb_12 = this.id_class.sH();
        if (rOb_12 != null && rOb_12.BM()) {
            rOb_12.id_break(rxL_2.RED);
        }
    }

    @Override
    protected int id_catch() {
        return 60;
    }

    @Override
    protected rqA_2 id_extends() {
        return rqn_3.Sr;
    }

    @Override
    public void id_protected() {
        super.id_protected();
        this.id_class.id_class((rOb_1)null);
    }

    @Override
    protected int id_private() {
        return 140;
    }

    @Override
    protected int id_volatile() {
        return 40;
    }

    @Override
    protected rGT id_native() {
        return rGT.WOLOLO;
    }
}

