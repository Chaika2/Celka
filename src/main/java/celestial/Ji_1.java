/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dH_2;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCZ;
import celestial.rCc_1;
import celestial.rJR;
import celestial.rJZ;
import celestial.rJf_1;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlB_2;
import celestial.rpB_2;
import celestial.rpm_3;
import celestial.rpq_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rsB_2;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class Ji_1
extends dH_2 {
    public static final rCc_1 id_volatile = kE_2.p;
    private static final rjC_2 id_final = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
    private static final rjC_2 id_package = xd_3.id_class(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
    private static final rjC_2 id_int = xd_3.id_class(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
    private static final rjC_2 id_new = xd_3.id_class(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
    private static final rjC_2 id_continue = xd_3.id_class(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
    private static final rjC_2 id_super = xd_3.id_class(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
    private static final rjC_2 id_this = xd_3.id_class(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
    private static final rjC_2 id_else = rjw_3.id_class(id_final, id_package, id_int, id_new);
    private static final rjC_2 id_synchronized = rjw_3.id_class(id_final, id_continue, id_super, id_this);
    private static final rgP_2 id_return = new rgn_3("container.repair");

    public Ji_1(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH));
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_case().id_catch());
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, rsB_2 rsB_22) {
        if (!rsB_22.BF()) {
            rYB2.id_byte(1029, rfH_22, 0);
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        rhd_32.id_class(xc_32.id_break(rYB2, rfH_22));
        rhd_32.id_break(rlB_2.p);
        return ryZ_2.CONSUME;
    }

    @Override
    public rJZ id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return new rJR((n, rhz_32, rhd_32) -> new rJf_1(n, rhz_32, rpq_3.id_class(rYB2, rfH_22)), id_return);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        return rpr_32.id_final() == rpB_2.X ? id_else : id_synchronized;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, xc_3 xc_33, rsB_2 rsB_22) {
        if (!rsB_22.BF()) {
            rYB2.id_byte(1031, rfH_22, 0);
        }
    }

    @Override
    protected void id_class(rsB_2 rsB_22) {
        rsB_22.id_class(true);
    }

    @Override
    public int id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_protected((rRq_1)rRq_12, (rfH_2)rfH_22).d;
    }

    public static xc_3 id_private(xc_3 xc_32) {
        if (xc_32.id_class(xu_3.sc)) {
            return (xc_3)xu_3.su.id_continue().id_class(id_volatile, xc_32.id_byte(id_volatile));
        }
        return xc_32.id_class(xu_3.su) ? (xc_3)xu_3.sm.id_continue().id_class(id_volatile, xc_32.id_byte(id_volatile)) : null;
    }
}

