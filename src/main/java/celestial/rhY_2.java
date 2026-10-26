/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rEO;
import celestial.rLQ;
import celestial.rLk_1;
import celestial.rLx_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfo_3;
import celestial.rhV_2;
import celestial.rjG_2;
import celestial.rye_3;

public class rhY_2
extends rhV_2 {
    public rhY_2(rYB rYB2, double d, double d2, double d3) {
        super((aI_2<? extends rhV_2>)aI_2.y, d, d2, d3, rYB2);
    }

    public rhY_2(rYB rYB2, iB_2 iB_22) {
        super((aI_2<? extends rhV_2>)aI_2.y, iB_22, rYB2);
    }

    public rhY_2(aI_2<? extends rhY_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhV_2>)aI_22, rYB2);
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        super.id_class(rfo_32);
        an_3 an_32 = rfo_32.id_class();
        int n = an_32 instanceof rEO ? 3 : 0;
        an_32.id_break(rye_3.id_break(this, this.id_else()), n);
    }

    @Override
    public void id_class(byte by) {
        if (by == 3) {
            rLx_1 rLx_12 = this.id_catch();
            for (int i = 0; i < 8; ++i) {
                ((rYB)this.id_throws[7]).id_class(rLx_12, this.rx(), this.re(), this.BO(), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        super.id_class(rjG_22);
        if (!((rYB)this.id_throws[7]).id_continue) {
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)3);
            this.PD();
        }
    }

    private rLx_1 id_catch() {
        rdn_3 rdn_32 = this.id_case();
        return rdn_32.id_class() ? rLQ.id_import : new rLk_1(rLQ.id_void, rdn_32);
    }

    @Override
    protected rdb_3 id_protected() {
        return rdy_3.hU;
    }
}

