/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.rAB;
import celestial.rAS;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdy_3;
import celestial.rhV_2;
import celestial.rjG_2;
import celestial.rsP_2;

public class rsr_3
extends rhV_2 {
    public rsr_3(rYB rYB2, double d, double d2, double d3) {
        super((aI_2<? extends rhV_2>)aI_2.j, d, d2, d3, rYB2);
    }

    public rsr_3(rYB rYB2, iB_2 iB_22) {
        super((aI_2<? extends rhV_2>)aI_2.j, iB_22, rYB2);
    }

    public rsr_3(aI_2<? extends rsr_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rhV_2>)aI_22, rYB2);
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        super.id_class(rjG_22);
        if (!((rYB)this.id_throws[7]).id_continue) {
            int n;
            ((rYB)this.id_throws[7]).id_byte(2002, this.Bs(), rAB.id_class(rAS.id_break));
            for (int i = 3 + ((rYB)this.id_throws[7]).id_int.nextInt(5) + ((rYB)this.id_throws[7]).id_int.nextInt(5); i > 0; i -= n) {
                n = rsP_2.id_class(i);
                ((rYB)this.id_throws[7]).a_(new rsP_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO(), n));
            }
            this.PD();
        }
    }

    @Override
    public float id_throws() {
        return 0.07f;
    }

    @Override
    protected rdb_3 id_protected() {
        return rdy_3.xe;
    }
}

