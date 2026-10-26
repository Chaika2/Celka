/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.iG_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rja_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.EnumSet;

public class rBr_1
extends rBk_1 {
    private final aA_2 id_class;

    @Override
    public void id_byte() {
        this.id_catch();
    }

    public rBr_1(aA_2 aA_22) {
        this.id_class = aA_22;
        this.id_class(EnumSet.of(rBW.MOVE, rBW.LOOK));
    }

    private boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_32 = rRR2.id_byte(rfH_22);
        return (rRR2.id_break(rfH_22).id_byte() || xc_32.id_class(xu_3.hM)) && xc_32.id_class((rRq_1)rRR2, rfH_22, rLT.LAND);
    }

    @Override
    public boolean id_class() {
        return this.id_class.PA() < 140;
    }

    @Override
    public boolean id_break() {
        return this.id_class();
    }

    @Override
    public void id_throws() {
        this.id_catch();
        this.id_class.id_class(0.02f, new rjU_2(((Float)this.id_class.id_private[42]).floatValue(), ((Float)this.id_class.id_private[43]).floatValue(), ((Float)this.id_class.id_private[44]).floatValue()));
        this.id_class.id_class(iG_2.SELF, this.id_class.rv());
    }

    private void id_catch() {
        Iterable<rfH_2> iterable = rfH_2.id_break(rfU_2.id_byte(this.id_class.rx() - 1.0), rfU_2.id_byte(this.id_class.re()), rfU_2.id_byte(this.id_class.BO() - 1.0), rfU_2.id_byte(this.id_class.rx() + 1.0), rfU_2.id_byte(this.id_class.re() + 8.0), rfU_2.id_byte(this.id_class.BO() + 1.0));
        rja_3 rja_32 = null;
        for (rfH_2 rfH_22 : iterable) {
            if (!this.id_class((rYB)this.id_class.id_throws[7], rfH_22)) continue;
            rja_32 = rfH_22;
            break;
        }
        if (rja_32 == null) {
            rja_32 = new rfH_2(this.id_class.rx(), this.id_class.re() + 8.0, this.id_class.BO());
        }
        this.id_class.id_public().id_class((double)rja_32.b_(), (double)(rja_32.c_() + 1), (double)rja_32.d_(), 1.0);
    }

    @Override
    public boolean J_() {
        return false;
    }
}

