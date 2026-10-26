/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kx_3;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCu_1;
import celestial.rHV;
import celestial.rHj_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rec_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rpB_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rrPp_1;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;

public class kW_2
extends xd_3
implements kx_3 {
    public static final rCu_1<rec_3> id_volatile = rCT.id_boolean;

    protected kW_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rec_3.NORTH_UP));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    public static boolean id_class(rrPp_1 rrPp_12, rrPp_1 rrPp_13) {
        rpr_3 rpr_32 = kW_2.id_private(rrPp_12.id_break);
        rpr_3 rpr_33 = kW_2.id_private(rrPp_13.id_break);
        rpr_3 rpr_34 = kW_2.id_implements(rrPp_12.id_break);
        rpr_3 rpr_35 = kW_2.id_implements(rrPp_13.id_break);
        rHV rHV2 = rHV.id_class(rrPp_12.id_byte.id_native("joint")).orElseGet(() -> rpr_32.id_final().id_protected() ? rHV.ALIGNED : rHV.ROLLABLE);
        boolean bl = rHV2 == rHV.ROLLABLE;
        return rpr_32 == rpr_33.id_case() && (bl || rpr_34 == rpr_35) && rrPp_12.id_byte.id_native("target").equals(rrPp_13.id_byte.id_native("name"));
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHj_1 && rhd_32.sU()) {
            rhd_32.id_class((rHj_1)ryO_22);
            return ryZ_2.id_class(rYB2.id_continue);
        }
        return ryZ_2.PASS;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return (xc_3)xc_32.id_class(id_volatile, rpa_32.id_class().id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class().id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHj_1();
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3 rpr_32 = rxx_32.id_finally();
        rpr_3 rpr_33 = rpr_32.id_final() == rpB_2.Y ? rxx_32.id_case().id_case() : rpr_3.UP;
        return (xc_3)this.id_continue().id_class(id_volatile, rec_3.id_class(rpr_32, rpr_33));
    }

    public static rpr_3 id_implements(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile).id_byte();
    }

    public static rpr_3 id_private(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile).id_break();
    }
}

