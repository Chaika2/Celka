/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Wu_1;
import celestial.iB_2;
import celestial.kE_2;
import celestial.rCN;
import celestial.rCT;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rYr_1;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public abstract class Wk_1
extends kE_2 {
    protected static final rjC_2 id_final = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
    public static final rCN id_package = rCT.id_return;

    protected void id_byte(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        boolean bl;
        boolean bl2;
        if (!this.id_class((rRR)rYB2, rfH_22, xc_32) && (bl2 = xc_32.id_byte(id_package).booleanValue()) != (bl = this.id_class(rYB2, rfH_22, xc_32)) && !rYB2.id_finally().id_break(rfH_22, this)) {
            rYr_1 rYr_12 = rYr_1.HIGH;
            if (this.id_byte((rRq_1)rYB2, rfH_22, xc_32)) {
                rYr_12 = rYr_1.EXTREMELY_HIGH;
            } else if (bl2) {
                rYr_12 = rYr_1.VERY_HIGH;
            }
            rYB2.id_finally().id_class(rfH_22, this, this.id_private(xc_32), rYr_12);
        }
    }

    public boolean id_byte(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(p).id_case();
        xc_3 xc_33 = rRq_12.id_byte(rfH_22.id_break(rpr_32));
        return Wk_1.id_volatile(xc_33) && xc_33.id_byte(p) != rpr_32;
    }

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    protected Wk_1(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return Wk_1.id_byte(rRR2, rfH_22.id_break());
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(p, rxx_32.id_case().id_case());
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        if (this.id_class(rYB2, rfH_22, xc_32)) {
            rYB2.id_finally().id_class(rfH_22, this, 1);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        this.id_protected(rYB2, rfH_22, xc_32);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }

    public boolean id_class(rRR rRR2, rfH_2 rfH_22, xc_3 xc_32) {
        return false;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (xc_32.id_class((rRR)rYB2, rfH_22)) {
            this.id_byte(rYB2, rfH_22, xc_32);
        } else {
            ryO_2 ryO_22 = this.id_protected() ? rYB2.id_class(rfH_22) : null;
            Wk_1.id_class(xc_32, rYB2, rfH_22, ryO_22);
            rYB2.id_class(rfH_22, false);
            for (rpr_3 rpr_32 : rpr_3.values()) {
                rYB2.id_break(rfH_22.id_break(rpr_32), this);
            }
        }
    }

    protected boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        return this.id_break(rYB2, rfH_22, xc_32) > 0;
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        if (!xc_32.id_byte(id_package).booleanValue()) {
            return 0;
        }
        return xc_32.id_byte(p) == rpr_32 ? this.id_break(rRq_12, rfH_22, xc_32) : 0;
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!bl && !xc_32.id_class(xc_33.id_break())) {
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
            this.id_protected(rYB2, rfH_22, xc_32);
        }
    }

    protected int id_break(rRR rRR2, rfH_2 rfH_22, rpr_3 rpr_32) {
        xc_3 xc_32 = rRR2.id_byte(rfH_22);
        if (this.id_implements(xc_32)) {
            if (xc_32.id_class(xu_3.sn)) {
                return 15;
            }
            return xc_32.id_class(xu_3.ra) ? xc_32.id_byte(Wu_1.id_new).intValue() : rRR2.id_class(rfH_22, rpr_32);
        }
        return 0;
    }

    protected int id_break(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return 15;
    }

    protected int id_break(rRR rRR2, rfH_2 rfH_22, xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(p);
        rpr_3 rpr_33 = rpr_32.id_catch();
        rpr_3 rpr_34 = rpr_32.id_private();
        return Math.max(this.id_break(rRR2, rfH_22.id_break(rpr_33), rpr_33), this.id_break(rRR2, rfH_22.id_break(rpr_34), rpr_34));
    }

    protected int id_break(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(p);
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        int n = rYB2.id_byte(rfH_23, rpr_32);
        if (n >= 15) {
            return n;
        }
        xc_3 xc_33 = rYB2.id_byte(rfH_23);
        return Math.max(n, xc_33.id_class(xu_3.ra) ? xc_33.id_byte(Wu_1.id_new) : 0);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!this.id_class((rRR)rrEm_12, rfH_22, xc_32)) {
            boolean bl = xc_32.id_byte(id_package);
            boolean bl2 = this.id_class((rYB)rrEm_12, rfH_22, xc_32);
            if (bl && !bl2) {
                rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_package, false), 2);
            } else if (!bl) {
                rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_package, true), 2);
                if (!bl2) {
                    rrEm_12.id_synchronized().id_class(rfH_22, this, this.id_private(xc_32), rYr_1.VERY_HIGH);
                }
            }
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_break(rRq_12, rfH_22, rpr_32);
    }

    protected boolean id_implements(xc_3 xc_32) {
        return xc_32.id_implements();
    }

    protected void id_protected(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(p);
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32.id_case());
        rYB2.id_class(rfH_23, (xd_3)this, rfH_22);
        rYB2.id_class(rfH_23, (xd_3)this, rpr_32);
    }

    protected abstract int id_private(xc_3 var1);

    public static boolean id_volatile(xc_3 xc_32) {
        return xc_32.id_break() instanceof Wk_1;
    }
}

