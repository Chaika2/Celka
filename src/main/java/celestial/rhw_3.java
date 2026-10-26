/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JC;
import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.rFJ;
import celestial.rLQ;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rhP_2;
import celestial.rhf_3;
import celestial.rhj_3;
import celestial.rjG_2;
import celestial.rjU_2;
import celestial.ruS_2;
import celestial.rye_3;

public class rhw_3
extends rhf_3 {
    public rhw_3(rYB rYB2, double d, double d2, double d3, double d4, double d5, double d6) {
        this((aI_2<? extends rhw_3>)aI_2.id_for, rYB2);
        this.id_new(d, d2, d3);
        for (int i = 0; i < 7; ++i) {
            double d7 = 0.4 + 0.1 * (double)i;
            rYB2.id_class(rLQ.r, d, d2, d3, d4 * d7, d5, d6 * d7);
        }
        this.id_catch(d4, d5, d6);
    }

    public rhw_3(rYB rYB2, rhP_2 rhP_22) {
        this((aI_2<? extends rhw_3>)aI_2.id_for, rYB2);
        super.id_break(rhP_22);
        this.id_new(rhP_22.rx() - (double)(rhP_22.PN() + 1.0f) * 0.5 * (double)rfU_2.id_class(((Float)rhP_22.id_private[23]).floatValue() * ((float)Math.PI / 180)), rhP_22.rH() - (double)0.1f, rhP_22.BO() + (double)(rhP_22.PN() + 1.0f) * 0.5 * (double)rfU_2.id_break(((Float)rhP_22.id_private[23]).floatValue() * ((float)Math.PI / 180)));
    }

    public rhw_3(aI_2<? extends rhw_3> aI_22, rYB rYB2) {
        super((aI_2<? extends rhf_3>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        super.id_this();
        rjU_2 rjU_22 = this.rv();
        rjG_2 rjG_22 = rhj_3.id_class((an_3)this, this::id_class);
        if (rjG_22 != null) {
            this.id_class(rjG_22);
        }
        double d = this.rx() + rjU_22.id_break;
        double d2 = this.re() + rjU_22.id_byte;
        double d3 = this.BO() + rjU_22.id_protected;
        this.id_return();
        float f = 0.99f;
        float f2 = 0.06f;
        if (((rYB)this.id_throws[7]).id_class(this.rN()).noneMatch(JC::id_catch)) {
            this.PD();
        } else if (this.Pa()) {
            this.PD();
        } else {
            this.id_byte(rjU_22.id_class((double)0.99f));
            if (!this.rw()) {
                this.id_byte(this.rv().id_break(0.0, -0.06f, 0.0));
            }
            this.id_new(d, d2, d3);
        }
    }

    @Override
    protected void id_class(rff_3 rff_32) {
        super.id_class(rff_32);
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.PD();
        }
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        super.id_class(rfo_32);
        an_3 an_32 = this.id_else();
        if (an_32 instanceof iB_2) {
            rfo_32.id_class().id_break(rye_3.id_class((an_3)this, (iB_2)an_32).id_byte(), 1.0f);
        }
    }

    @Override
    protected void m_() {
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

