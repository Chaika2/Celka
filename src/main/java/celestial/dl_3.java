/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JI;
import celestial.Jq_1;
import celestial.kE_2;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rHq_1;
import celestial.rHu_1;
import celestial.rJR;
import celestial.rLQ;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXe_1;
import celestial.rXz_1;
import celestial.rYB;
import celestial.rbW_2;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlB_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.ryJ_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.ryX_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class dl_3
extends JI<rHq_1>
implements kd_3 {
    public static final rCc_1 id_final = kE_2.p;
    public static final rCN id_package = rCT.id_throw;
    protected static final rjC_2 id_int = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
    private static final rgP_2 id_new = new rgn_3("container.enderchest");

    protected dl_3(Jq_1 jq_1) {
        super(jq_1, () -> ryW_2.id_protected);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_final, rpr_3.NORTH)).id_class(id_package, false));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_package).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_final, id_package);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_final)));
    }

    @Override
    public ryJ_2<? extends rHu_1> id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, boolean bl) {
        return ryX_2::id_break;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_final, rqd_32.id_class(xc_32.id_byte(id_final)));
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_33, rpm_3 rpm_32, rff_3 rff_32) {
        rXz_1 rXz_12 = rhd_33.se();
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (rXz_12 != null && ryO_22 instanceof rHq_1) {
            rfH_2 rfH_23 = rfH_22.id_final();
            if (rYB2.id_byte(rfH_23).id_catch(rYB2, rfH_23)) {
                return ryZ_2.id_class(rYB2.id_continue);
            }
            if (rYB2.id_continue) {
                return ryZ_2.SUCCESS;
            }
            rHq_1 rHq_12 = (rHq_1)ryO_22;
            rXz_12.id_class(rHq_12);
            rhd_33.id_class(new rJR((n, rhz_32, rhd_32) -> rXe_1.id_class(n, rhz_32, rXz_12), id_new));
            rhd_33.id_break(rlB_2.d);
            rbW_2.id_class(rhd_33, true);
            return ryZ_2.CONSUME;
        }
        return ryZ_2.id_class(rYB2.id_continue);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        return (xc_3)((xc_3)this.id_continue().id_class(id_final, rxx_32.id_case().id_case())).id_class(id_package, rXE2.id_class() == rXG.id_byte);
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_int;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        for (int i = 0; i < 3; ++i) {
            int n = random.nextInt(2) * 2 - 1;
            int n2 = random.nextInt(2) * 2 - 1;
            double d = (double)rfH_22.b_() + 0.5 + 0.25 * (double)n;
            double d2 = (float)rfH_22.c_() + random.nextFloat();
            double d3 = (double)rfH_22.d_() + 0.5 + 0.25 * (double)n2;
            double d4 = random.nextFloat() * (float)n;
            double d5 = ((double)random.nextFloat() - 0.5) * 0.125;
            double d6 = random.nextFloat() * (float)n2;
            rYB2.id_class(rLQ.id_transient, d, d2, d3, d4, d5, d6);
        }
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHq_1();
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_package) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }
}

