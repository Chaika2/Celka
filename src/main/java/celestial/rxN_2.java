/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oo_1;
import celestial.QP;
import celestial.kJ_2;
import celestial.kh_3;
import celestial.rLQ;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXB;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjs_3;
import celestial.rlB_2;
import celestial.rlG_2;
import celestial.rpO_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rym_3;
import celestial.xc_3;
import celestial.xd_3;

public class rxN_2
extends rdb_3 {
    private final rXs_1 id_class;

    public rxN_2(rXs_1 rXs_12, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_class = rXs_12;
    }

    public void id_class(rYB rYB2, rdn_3 rdn_32, rfH_2 rfH_22) {
    }

    public boolean id_class(rhd_3 rhd_32, rYB rYB2, rfH_2 rfH_22, rff_3 rff_32) {
        boolean bl;
        if (!(this.id_class instanceof rXB)) {
            return false;
        }
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        QP qP = xc_32.id_byte();
        boolean bl2 = xc_32.id_class(this.id_class);
        boolean bl3 = bl = xc_32.id_catch() || bl2 || xd_32 instanceof kJ_2 && ((kJ_2)((Object)xd_32)).id_class((rRq_1)rYB2, rfH_22, xc_32, this.id_class);
        if (!bl) {
            return rff_32 != null && this.id_class(rhd_32, rYB2, rff_32.id_class().id_break(rff_32.id_break()), (rff_3)null);
        }
        if (rYB2.id_default().id_protected() && this.id_class.id_class(rlG_2.id_break)) {
            int n = rfH_22.b_();
            int n2 = rfH_22.c_();
            int n3 = rfH_22.d_();
            rYB2.id_class(rhd_32, rfH_22, rqn_3.Sk, rqL_2.BLOCKS, 0.5f, 2.6f + (rYB2.id_int.nextFloat() - rYB2.id_int.nextFloat()) * 0.8f);
            for (int i = 0; i < 8; ++i) {
                rYB2.id_class(rLQ.id_short, (double)n + Math.random(), (double)n2 + Math.random(), (double)n3 + Math.random(), 0.0, 0.0, 0.0);
            }
            return true;
        }
        if (xd_32 instanceof kJ_2 && this.id_class == rXG.id_byte) {
            ((kJ_2)((Object)xd_32)).id_class(rYB2, rfH_22, xc_32, ((rXB)this.id_class).id_class(false));
            this.id_class(rhd_32, (rRg_1)rYB2, rfH_22);
            return true;
        }
        if (!rYB2.id_continue && bl2 && !qP.id_class()) {
            rYB2.id_break(rfH_22, true);
        }
        if (!rYB2.id_class(rfH_22, this.id_class.id_private().id_catch(), 11) && !xc_32.id_volatile().id_break()) {
            return false;
        }
        this.id_class(rhd_32, (rRg_1)rYB2, rfH_22);
        return true;
    }

    protected void id_class(rhd_3 rhd_32, rRg_1 rRg_12, rfH_2 rfH_22) {
        rqA_2 rqA_22 = this.id_class.id_class(rlG_2.id_byte) ? rqn_3.rz : rqn_3.rk;
        rRg_12.id_class(rhd_32, rfH_22, rqA_22, rqL_2.BLOCKS, 1.0f, 1.0f);
    }

    protected rdn_3 id_class(rdn_3 rdn_32, rhd_3 rhd_32) {
        return !((rhx_3)rhd_32.id_implements[18]).id_protected ? new rdn_3(rdy_3.hg) : rdn_32;
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rff_3 rff_32 = rxN_2.id_class(rYB2, rhd_32, this.id_class == rXG.id_class ? rjs_3.SOURCE_ONLY : rjs_3.NONE);
        if (((rjG_2)rff_32).id_byte() == rjM_2.MISS) {
            return rym_3.id_byte(rdn_32);
        }
        if (((rjG_2)rff_32).id_byte() != rjM_2.BLOCK) {
            return rym_3.id_byte(rdn_32);
        }
        rff_3 rff_33 = rff_32;
        rfH_2 rfH_22 = rff_33.id_class();
        rpr_3 rpr_32 = rff_33.id_break();
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        if (rYB2.id_class(rhd_32, rfH_22) && rhd_32.id_class(rfH_23, rpr_32, rdn_32)) {
            rfH_2 rfH_24;
            if (this.id_class == rXG.id_class) {
                rXs_1 rXs_12;
                xc_3 xc_32 = rYB2.id_byte(rfH_22);
                if (xc_32.id_break() instanceof kh_3 && (rXs_12 = ((kh_3)((Object)xc_32.id_break())).id_break(rYB2, rfH_22, xc_32)) != rXG.id_class) {
                    rhd_32.id_class(rlB_2.id_byte.id_break(this));
                    rhd_32.id_class(rXs_12.id_class(rlG_2.id_byte) ? rqn_3.rc : rqn_3.rQ, 1.0f, 1.0f);
                    rdn_3 rdn_33 = rpO_2.id_class(rdn_32, rhd_32, new rdn_3(rXs_12.id_class()));
                    if (!rYB2.id_continue) {
                        Oo_1.id_finally.id_class((rhN_2)rhd_32, new rdn_3(rXs_12.id_class()));
                    }
                    return rym_3.id_class(rdn_33, rYB2.id_import());
                }
                return rym_3.id_protected(rdn_32);
            }
            xc_3 xc_33 = rYB2.id_byte(rfH_22);
            rfH_2 rfH_25 = rfH_24 = xc_33.id_break() instanceof kJ_2 && this.id_class == rXG.id_byte ? rfH_22 : rfH_23;
            if (this.id_class(rhd_32, rYB2, rfH_24, rff_33)) {
                this.id_class(rYB2, rdn_32, rfH_24);
                if (rhd_32 instanceof rhN_2) {
                    Oo_1.id_goto.id_class((rhN_2)rhd_32, rfH_24, rdn_32);
                }
                rhd_32.id_class(rlB_2.id_byte.id_break(this));
                return rym_3.id_class(this.id_class(rdn_32, rhd_32), rYB2.id_import());
            }
            return rym_3.id_protected(rdn_32);
        }
        return rym_3.id_protected(rdn_32);
    }
}

