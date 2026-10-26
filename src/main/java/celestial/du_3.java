/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jp_1;
import celestial.Jq_1;
import celestial.an_3;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCf_1;
import celestial.rCu_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rpB_2;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class du_3
extends xF_2 {
    public static final rCu_1<rCf_1> id_volatile = rCT.G;

    @Override
    public Jp_1 id_byte() {
        return Jp_1.XZ;
    }

    public du_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rCf_1.LOWER));
    }

    @Override
    public void id_class(rYB rYB2, rhd_3 rhd_32, rfH_2 rfH_22, xc_3 xc_32, ryO_2 ryO_22, rdn_3 rdn_32) {
        super.id_class(rYB2, rhd_32, rfH_22, xu_3.id_class.id_continue(), ryO_22, rdn_32);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        if (!rYB2.id_continue) {
            if (rhd_32.id_implements()) {
                du_3.id_break(rYB2, rfH_22, xc_32, rhd_32);
            } else {
                du_3.id_class(xc_32, rYB2, rfH_22, (ryO_2)null, (an_3)rhd_32, rhd_32.ss());
            }
        }
        super.id_class(rYB2, rfH_22, xc_32, rhd_32);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        rCf_1 rCf_12 = xc_32.id_byte(id_volatile);
        if (rpr_32.id_final() != rpB_2.Y || rCf_12 == rCf_1.LOWER != (rpr_32 == rpr_3.UP) || xc_33.id_class(this) && xc_33.id_byte(id_volatile) != rCf_12) {
            return rCf_12 == rCf_1.LOWER && rpr_32 == rpr_3.DOWN && !xc_32.id_class(rRg_12, rfH_22) ? xu_3.id_class.id_continue() : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
        }
        return xu_3.id_class.id_continue();
    }

    @Override
    public long id_class(xc_3 xc_32, rfH_2 rfH_22) {
        return rfU_2.id_byte(rfH_22.b_(), rfH_22.id_catch(xc_32.id_byte(id_volatile) == rCf_1.LOWER ? 0 : 1).c_(), rfH_22.d_());
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        rYB2.id_class(rfH_22.id_final(), (xc_3)this.id_continue().id_class(id_volatile, rCf_1.UPPER), 3);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        if (xc_32.id_byte(id_volatile) != rCf_1.UPPER) {
            return super.id_class(xc_32, rRR2, rfH_22);
        }
        xc_3 xc_33 = rRR2.id_byte(rfH_22.id_break());
        return xc_33.id_class(this) && xc_33.id_byte(id_volatile) == rCf_1.LOWER;
    }

    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22, int n) {
        rRg_12.id_class(rfH_22, (xc_3)this.id_continue().id_class(id_volatile, rCf_1.LOWER), n);
        rRg_12.id_class(rfH_22.id_final(), (xc_3)this.id_continue().id_class(id_volatile, rCf_1.UPPER), n);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rfH_2 rfH_22 = rxx_32.id_class();
        return rfH_22.c_() < 255 && rxx_32.id_int().id_byte(rfH_22.id_final()).id_class(rxx_32) ? super.id_class(rxx_32) : null;
    }

    protected static void id_break(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        rfH_2 rfH_23;
        xc_3 xc_33;
        rCf_1 rCf_12 = xc_32.id_byte(id_volatile);
        if (rCf_12 == rCf_1.UPPER && (xc_33 = rYB2.id_byte(rfH_23 = rfH_22.id_break())).id_break() == xc_32.id_break() && xc_33.id_byte(id_volatile) == rCf_1.LOWER) {
            rYB2.id_class(rfH_23, xu_3.id_class.id_continue(), 35);
            rYB2.id_class(rhd_32, 2001, rfH_23, xd_3.id_finally(xc_33));
        }
    }
}

