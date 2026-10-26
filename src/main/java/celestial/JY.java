/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Qs_1;
import celestial.an_3;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfl_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public abstract class JY
extends xd_3 {
    protected static final rjC_2 id_volatile = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 0.5, 15.0);
    protected static final rjC_2 id_final = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 1.0, 15.0);
    protected static final rfl_3 id_package = new rfl_3(0.125, 0.0, 0.125, 0.875, 0.25, 0.875);

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    protected JY(Jq_1 jq_1) {
        super(jq_1);
    }

    protected void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, int n) {
        boolean bl;
        int n2 = this.id_break(rYB2, rfH_22);
        boolean bl2 = n > 0;
        boolean bl3 = bl = n2 > 0;
        if (n != n2) {
            xc_3 xc_33 = this.id_class(xc_32, n2);
            rYB2.id_class(rfH_22, xc_33, 2);
            this.id_class(rYB2, rfH_22);
            rYB2.id_class(rfH_22, xc_32, xc_33);
        }
        if (!bl && bl2) {
            this.id_break((rRg_1)rYB2, rfH_22);
        } else if (bl && !bl2) {
            this.id_class((rRg_1)rYB2, rfH_22);
        }
        if (bl) {
            rYB2.id_finally().id_class(new rfH_2(rfH_22), this, this.id_break());
        }
    }

    protected abstract void id_class(rRg_1 var1, rfH_2 var2);

    protected void id_class(rYB rYB2, rfH_2 rfH_22) {
        rYB2.id_break(rfH_22, this);
        rYB2.id_break(rfH_22.id_break(), this);
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return this.id_catch(xc_32);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_catch(xc_32) > 0 ? id_volatile : id_final;
    }

    protected abstract xc_3 id_class(xc_3 var1, int var2);

    @Override
    public boolean id_class() {
        return true;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return rpr_32 == rpr_3.DOWN && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        return JY.id_byte(rRR2, rfH_23) || JY.id_class(rRR2, rfH_23, rpr_3.UP);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        int n;
        if (!rYB2.id_continue && (n = this.id_catch(xc_32)) == 0) {
            this.id_class(rYB2, rfH_22, xc_32, n);
        }
    }

    protected int id_break() {
        return 20;
    }

    protected abstract void id_break(rRg_1 var1, rfH_2 var2);

    protected abstract int id_break(rYB var1, rfH_2 var2);

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return rpr_32 == rpr_3.UP ? this.id_catch(xc_32) : 0;
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!bl && !xc_32.id_class(xc_33.id_break())) {
            if (this.id_catch(xc_32) > 0) {
                this.id_class(rYB2, rfH_22);
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        int n = this.id_catch(xc_32);
        if (n > 0) {
            this.id_class((rYB)rrEm_12, rfH_22, xc_32, n);
        }
    }

    protected abstract int id_catch(xc_3 var1);

    @Override
    public Qs_1 id_protected(xc_3 xc_32) {
        return Qs_1.DESTROY;
    }
}

