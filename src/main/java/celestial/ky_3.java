/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.kD_2;
import celestial.ka_3;
import celestial.rCL;
import celestial.rCc_1;
import celestial.rCg_1;
import celestial.rCu_1;
import celestial.rHa_1;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.rzP_2;
import celestial.rzQ_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Collections;
import java.util.List;

public class ky_3
extends dB_2 {
    public static final rCc_1 id_volatile = ka_3.id_volatile;
    public static final rCu_1<rCg_1> id_final = ka_3.id_final;

    public ky_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, rCg_1.DEFAULT));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return rdn_3.id_break;
    }

    private rHa_1 id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        ryO_2 ryO_22 = rRq_12.id_class(rfH_22);
        return ryO_22 instanceof rHa_1 ? (rHa_1)ryO_22 : null;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return null;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    public static ryO_2 id_class(xc_3 xc_32, rpr_3 rpr_32, boolean bl, boolean bl2) {
        return new rHa_1(xc_32, rpr_32, bl, bl2);
    }

    @Override
    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32) {
        super.id_class(rRg_12, rfH_22, xc_32);
        rfH_2 rfH_23 = rfH_22.id_break(xc_32.id_byte(id_volatile).id_case());
        xc_3 xc_33 = rRg_12.id_byte(rfH_23);
        if (xc_33.id_break() instanceof kD_2 && xc_33.id_byte(kD_2.id_final).booleanValue()) {
            rRg_12.id_class(rfH_23, false);
        }
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (!rYB2.id_continue && rYB2.id_class(rfH_22) == null) {
            rYB2.id_class(rfH_22, false);
            return ryZ_2.CONSUME;
        }
        return ryZ_2.PASS;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return rjw_3.id_class();
    }

    @Override
    public List<rdn_3> id_class(xc_3 xc_32, rzP_2 rzP_22) {
        rHa_1 rHa_12 = this.id_class((rRq_1)rzP_22.id_class(), new rfH_2(rzP_22.id_class(rzQ_2.id_case)));
        return rHa_12 == null ? Collections.emptyList() : rHa_12.id_native().id_class(rzP_22);
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        ryO_2 ryO_22;
        if (!xc_32.id_class(xc_33.id_break()) && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHa_1) {
            ((rHa_1)ryO_22).id_volatile();
        }
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rHa_1 rHa_12 = this.id_class(rRq_12, rfH_22);
        return rHa_12 != null ? rHa_12.id_class(rRq_12, rfH_22) : rjw_3.id_class();
    }
}

