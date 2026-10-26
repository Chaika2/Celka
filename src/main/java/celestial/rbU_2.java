/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.eX_2;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rUv_1;
import celestial.rYB;
import celestial.rbo_3;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rlG_2;
import celestial.rrEm_1;
import celestial.rrrZ;
import java.util.EnumSet;

public class rbU_2
extends rBk_1 {
    private final rbo_3 id_class;
    private boolean id_break;

    @Override
    public void id_byte() {
        if ((rYB)this.id_class.id_throws[7] instanceof rrEm_1) {
            rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
            this.id_break = false;
            this.id_class.id_public().id_final();
            rfH_2 rfH_22 = this.id_class.Bs();
            rrrZ<rUv_1> rrrZ2 = (double)rrEm_12.id_int.nextFloat() >= 0.5 ? rrrZ.id_volatile : rrrZ.id_implements;
            rfH_2 rfH_23 = rrEm_12.id_class(rrrZ2, rfH_22, 50, false);
            if (rfH_23 == null) {
                rrrZ<rUv_1> rrrZ3 = rrrZ2.equals(rrrZ.id_volatile) ? rrrZ.id_implements : rrrZ.id_volatile;
                rfH_2 rfH_24 = rrEm_12.id_class(rrrZ3, rfH_22, 50, false);
                if (rfH_24 == null) {
                    this.id_break = true;
                    return;
                }
                this.id_class.id_implements(rfH_24);
            } else {
                this.id_class.id_implements(rfH_23);
            }
            rrEm_12.id_class((an_3)this.id_class, (byte)38);
        }
    }

    public rbU_2(rbo_3 rbo_32) {
        this.id_class = rbo_32;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    @Override
    public boolean id_class() {
        return this.id_class.L() && this.id_class.PA() >= 100;
    }

    @Override
    public boolean id_break() {
        rfH_2 rfH_22 = this.id_class.id_throws();
        return !new rfH_2((double)rfH_22.b_(), this.id_class.re(), (double)rfH_22.d_()).id_class((eX_2)this.id_class.Ps(), 4.0) && !this.id_break && this.id_class.PA() >= 100;
    }

    @Override
    public void id_throws() {
        rYB rYB2 = (rYB)this.id_class.id_throws[7];
        if (this.id_class.sx() || this.id_class.id_public().id_native()) {
            rfH_2 rfH_22;
            rjU_2 rjU_22 = rjU_2.id_class(this.id_class.id_throws());
            rjU_2 rjU_23 = iX_2.id_class(this.id_class, 16, 1, rjU_22, 0.3926991f);
            if (rjU_23 == null) {
                rjU_23 = iX_2.id_break(this.id_class, 8, 4, rjU_22);
            }
            if (!(rjU_23 == null || rYB2.id_break(rfH_22 = new rfH_2(rjU_23)).id_class(rlG_2.id_break) && rYB2.id_byte(rfH_22).id_class((rRq_1)rYB2, rfH_22, rLT.WATER))) {
                rjU_23 = iX_2.id_break(this.id_class, 8, 5, rjU_22);
            }
            if (rjU_23 == null) {
                this.id_break = true;
                return;
            }
            this.id_class.id_continue().id_class(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, this.id_class.S() + 20, this.id_class.r());
            this.id_class.id_public().id_class(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, 1.3);
            if (rYB2.id_int.nextInt(80) == 0) {
                rYB2.id_class((an_3)this.id_class, (byte)38);
            }
        }
    }

    @Override
    public void id_protected() {
        rfH_2 rfH_22 = this.id_class.id_throws();
        if (new rfH_2((double)rfH_22.b_(), this.id_class.re(), (double)rfH_22.d_()).id_class((eX_2)this.id_class.Ps(), 4.0) || this.id_break) {
            this.id_class.id_this(false);
        }
    }

    @Override
    public boolean J_() {
        return false;
    }
}

