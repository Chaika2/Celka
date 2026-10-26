/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dz_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class kR_2
extends dz_3 {
    public static final rCN id_final = rCT.id_return;

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    public kR_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.SOUTH)).id_class(id_final, false));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    protected void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32.id_case());
        rYB2.id_class(rfH_23, (xd_3)this, rfH_22);
        rYB2.id_class(rfH_23, (xd_3)this, rpr_32);
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_final) != false && xc_32.id_byte(id_volatile) == rpr_32 ? 15 : 0;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break()) && !rYB2.id_import() && xc_32.id_byte(id_final).booleanValue() && !rYB2.id_finally().id_class(rfH_22, this)) {
            xc_3 xc_34 = (xc_3)xc_32.id_class(id_final, false);
            rYB2.id_class(rfH_22, xc_34, 18);
            this.id_class(rYB2, rfH_22, xc_34);
        }
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_protected().id_case().id_case());
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_volatile) == rpr_32 && !xc_32.id_byte(id_final).booleanValue()) {
            this.id_class(rRg_12, rfH_22);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    private void id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        if (!rRg_12.id_import() && !rRg_12.id_finally().id_class(rfH_22, this)) {
            rRg_12.id_finally().id_class(rfH_22, this, 2);
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_break(rRq_12, rfH_22, rpr_32);
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break()) && !rYB2.id_continue && xc_32.id_byte(id_final).booleanValue() && rYB2.id_finally().id_class(rfH_22, this)) {
            this.id_class(rYB2, rfH_22, (xc_3)xc_32.id_class(id_final, false));
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_final).booleanValue()) {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, false), 2);
        } else {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, true), 2);
            rrEm_12.id_synchronized().id_class(rfH_22, this, 2);
        }
        this.id_class((rYB)rrEm_12, rfH_22, xc_32);
    }
}

