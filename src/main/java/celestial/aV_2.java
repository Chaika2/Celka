/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.iG_2;
import celestial.is_3;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.xc_3;

public abstract class aV_2
extends is_3 {
    protected aV_2(aI_2<? extends aV_2> aI_22, rYB rYB2) {
        super((aI_2<? extends is_3>)aI_22, rYB2);
    }

    @Override
    protected void id_class(double d, boolean bl, xc_3 xc_32, rfH_2 rfH_22) {
    }

    @Override
    public boolean id_class(float f, float f2) {
        return false;
    }

    @Override
    public void id_private(rjU_2 rjU_22) {
        if (this.rT()) {
            this.id_class(0.02f, rjU_22);
            this.id_class(iG_2.SELF, this.rv());
            this.id_byte(this.rv().id_class((double)0.8f));
        } else if (this.ry()) {
            this.id_class(0.02f, rjU_22);
            this.id_class(iG_2.SELF, this.rv());
            this.id_byte(this.rv().id_class(0.5));
        } else {
            float f = 0.91f;
            if (((Boolean)this.id_throws[20]).booleanValue()) {
                f = ((rYB)this.id_throws[7]).id_byte(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).id_break().id_final() * 0.91f;
            }
            float f2 = 0.16277137f / (f * f * f);
            f = 0.91f;
            if (((Boolean)this.id_throws[20]).booleanValue()) {
                f = ((rYB)this.id_throws[7]).id_byte(new rfH_2(this.rx(), this.re() - 1.0, this.BO())).id_break().id_final() * 0.91f;
            }
            this.id_class((Boolean)this.id_throws[20] != false ? 0.1f * f2 : 0.02f, rjU_22);
            this.id_class(iG_2.SELF, this.rv());
            this.id_byte(this.rv().id_class((double)f));
        }
        this.id_class((iB_2)this, false);
    }

    @Override
    public boolean o_() {
        return false;
    }
}

