/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.eX_2;
import celestial.iB_2;
import celestial.is_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rGr_1;
import celestial.rKv_1;
import celestial.rLy_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;

public class rGP<T extends rGr_1>
extends rBk_1 {
    private final T id_class;
    private final double id_break;
    private final double id_byte;
    private long id_protected;

    @Override
    public void id_byte() {
    }

    public rGP(T t, double d, double d2) {
        this.id_class = t;
        this.id_break = d;
        this.id_byte = d2;
        this.id_protected = -1L;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    @Override
    public boolean id_class() {
        boolean bl = ((rYB)((rGr_1)this.id_class).id_throws[7]).r() < this.id_protected;
        return ((rGr_1)this.id_class).sA() && ((is_3)this.id_class).I_() == null && !((an_3)this.id_class).BP() && ((rGr_1)this.id_class).sv() && !bl;
    }

    @Override
    public void id_throws() {
        boolean bl = ((rGr_1)this.id_class).sF();
        rLy_1 rLy_12 = ((is_3)this.id_class).id_public();
        if (rLy_12.id_native()) {
            List<rGr_1> list = this.id_catch();
            if (((rGr_1)this.id_class).sA() && list.isEmpty()) {
                ((rGr_1)this.id_class).id_return(false);
            } else if (bl && ((rGr_1)this.id_class).sZ().id_class((eX_2)((an_3)this.id_class).Ps(), 10.0)) {
                ((rGr_1)this.id_class).sL();
            } else {
                rjU_2 rjU_22 = rjU_2.id_protected(((rGr_1)this.id_class).sZ());
                rjU_2 rjU_23 = ((an_3)this.id_class).Ps();
                rjU_2 rjU_24 = rjU_23.id_protected(rjU_22);
                rjU_22 = rjU_24.id_break(90.0f).id_class(0.4).id_throws(rjU_22);
                rjU_2 rjU_25 = rjU_22.id_protected(rjU_23).id_protected().id_class(10.0).id_throws(rjU_23);
                rfH_2 rfH_22 = new rfH_2(rjU_25);
                if (!rLy_12.id_class((double)(rfH_22 = ((rYB)((rGr_1)this.id_class).id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rfH_22)).b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), bl ? this.id_byte : this.id_break)) {
                    this.id_private();
                    this.id_protected = ((rYB)((rGr_1)this.id_class).id_throws[7]).r() + 200L;
                } else if (bl) {
                    for (rGr_1 rGr_12 : list) {
                        rGr_12.id_implements(rfH_22);
                    }
                }
            }
        }
    }

    private List<rGr_1> id_catch() {
        return ((rYB)((rGr_1)this.id_class).id_throws[7]).id_class(rGr_1.class, ((an_3)this.id_class).rN().id_class(16.0), rGr_12 -> rGr_12.sJ() && !rGr_12.id_continue((an_3)this.id_class));
    }

    @Override
    public void id_protected() {
    }

    private boolean id_private() {
        Random random = ((iB_2)this.id_class).Sa();
        rfH_2 rfH_22 = ((rYB)((rGr_1)this.id_class).id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, ((an_3)this.id_class).Bs().id_break(-8 + random.nextInt(16), 0, -8 + random.nextInt(16)));
        return ((is_3)this.id_class).id_public().id_class((double)rfH_22.b_(), (double)rfH_22.c_(), (double)rfH_22.d_(), this.id_break);
    }
}

