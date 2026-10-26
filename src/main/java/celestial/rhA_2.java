/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aZ_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rLx_1;
import celestial.rYB;
import celestial.rfo_3;
import celestial.rhL_2;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rye_3;
import java.util.List;

public class rhA_2
extends rhL_2 {
    public rhA_2(rYB rYB2, iB_2 iB_22, double d, double d2, double d3) {
        super(aI_2.id_int, iB_22, d, d2, d3, rYB2);
    }

    public rhA_2(rYB rYB2, double d, double d2, double d3, double d4, double d5, double d6) {
        super(aI_2.id_int, d, d2, d3, d4, d5, d6, rYB2);
    }

    public rhA_2(aI_2<? extends rhA_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhL_2>)aI_22, rYB2);
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        super.id_class(rjG_22);
        an_3 an_32 = this.id_else();
        if (!(rjG_22.id_byte() == rjM_2.ENTITY && ((rfo_3)rjG_22).id_class().id_continue(an_32) || ((rYB)this.id_throws[7]).id_continue)) {
            List<iB_2> list = ((rYB)this.id_throws[7]).id_class(iB_2.class, this.rN().id_byte(4.0, 2.0, 4.0));
            aZ_2 aZ_22 = new aZ_2((rYB)this.id_throws[7], this.rx(), this.re(), this.BO());
            if (an_32 instanceof iB_2) {
                aZ_22.id_class((iB_2)an_32);
            }
            aZ_22.id_class(rLQ.id_implements);
            aZ_22.id_byte(3.0f);
            aZ_22.id_break(600);
            aZ_22.id_catch((7.0f - aZ_22.id_protected()) / (float)aZ_22.id_private());
            aZ_22.id_class(new rLY(rLD.id_catch, 1, 1));
            if (!list.isEmpty()) {
                for (iB_2 iB_22 : list) {
                    double d = this.id_int(iB_22);
                    if (!(d < 16.0)) continue;
                    aZ_22.id_new(iB_22.rx(), iB_22.re(), iB_22.BO());
                    break;
                }
            }
            ((rYB)this.id_throws[7]).id_byte(2006, this.Bs(), this.BF() ? -1 : 1);
            ((rYB)this.id_throws[7]).a_(aZ_22);
            this.PD();
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        return false;
    }

    @Override
    protected boolean id_throws() {
        return false;
    }

    @Override
    protected rLx_1 id_case() {
        return rLQ.id_implements;
    }

    @Override
    public boolean rY() {
        return false;
    }
}

