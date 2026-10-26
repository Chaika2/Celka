/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dB_2;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rHR;
import celestial.rJZ;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlB_2;
import celestial.rlc_3;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqd_3;
import celestial.rqn_3;
import celestial.rrEm_1;
import celestial.rsE_2;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class kv_3
extends dB_2 {
    public static final rCc_1 id_volatile = kE_2.p;
    public static final rCN id_final = rCT.id_return;
    public static final rCN id_package = rCT.id_package;
    public static final rjC_2 id_int = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
    public static final rjC_2 id_new = xd_3.id_class(4.0, 2.0, 4.0, 12.0, 14.0, 12.0);
    public static final rjC_2 id_continue = rjw_3.id_class(id_int, id_new);
    public static final rjC_2 id_super = xd_3.id_class(0.0, 15.0, 0.0, 16.0, 15.0, 16.0);
    public static final rjC_2 id_this = rjw_3.id_class(id_continue, id_super);
    public static final rjC_2 id_else = rjw_3.id_class(xd_3.id_class(1.0, 10.0, 0.0, 5.333333, 14.0, 16.0), xd_3.id_class(5.333333, 12.0, 0.0, 9.666667, 16.0, 16.0), xd_3.id_class(9.666667, 14.0, 0.0, 14.0, 18.0, 16.0), id_continue);
    public static final rjC_2 id_synchronized = rjw_3.id_class(xd_3.id_class(0.0, 10.0, 1.0, 16.0, 14.0, 5.333333), xd_3.id_class(0.0, 12.0, 5.333333, 16.0, 16.0, 9.666667), xd_3.id_class(0.0, 14.0, 9.666667, 16.0, 18.0, 14.0), id_continue);
    public static final rjC_2 id_return = rjw_3.id_class(xd_3.id_class(15.0, 10.0, 0.0, 10.666667, 14.0, 16.0), xd_3.id_class(10.666667, 12.0, 0.0, 6.333333, 16.0, 16.0), xd_3.id_class(6.333333, 14.0, 0.0, 2.0, 18.0, 16.0), id_continue);
    public static final rjC_2 id_public = rjw_3.id_class(xd_3.id_class(0.0, 10.0, 15.0, 16.0, 14.0, 10.666667), xd_3.id_class(0.0, 12.0, 10.666667, 16.0, 16.0, 6.333333), xd_3.id_class(0.0, 14.0, 6.333333, 16.0, 18.0, 2.0), id_continue);

    private void id_byte(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHR) {
            rHR rHR2 = (rHR)ryO_22;
            rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
            rdn_3 rdn_32 = rHR2.id_throws().id_implements();
            float f = 0.25f * (float)rpr_32.id_implements();
            float f2 = 0.25f * (float)rpr_32.id_extends();
            rsE_2 rsE_22 = new rsE_2(rYB2, (double)rfH_22.b_() + 0.5 + (double)f, rfH_22.c_() + 1, (double)rfH_22.d_() + 0.5 + (double)f2, rdn_32);
            rsE_22.id_private();
            rYB2.a_(rsE_22);
            rHR2.id_public();
        }
    }

    @Override
    public boolean id_byte(xc_3 xc_32) {
        return true;
    }

    protected kv_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, false)).id_class(id_package, false));
    }

    @Override
    public rJZ id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return xc_32.id_byte(id_package) == false ? null : super.id_class(xc_32, rYB2, rfH_22);
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHR) {
            rhd_32.id_class((rHR)ryO_22);
            rhd_32.id_break(rlB_2.F);
        }
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        kv_3.id_break(rYB2, rfH_22, xc_32, true);
        rYB2.id_finally().id_class(rfH_22, xc_32.id_break(), 2);
        rYB2.id_byte(1043, rfH_22, 0);
    }

    public static void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        rYB2.id_class(rfH_22, (xc_3)((xc_3)xc_32.id_class(id_final, false)).id_class(id_package, bl), 3);
        kv_3.id_break(rYB2, rfH_22, xc_32);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_final) != false ? 15 : 0;
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return id_continue;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (xc_32.id_byte(id_package).booleanValue()) {
            if (!rYB2.id_continue) {
                this.id_class(rYB2, rfH_22, rhd_32);
            }
            return ryZ_2.id_class(rYB2.id_continue);
        }
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        return !rdn_32.id_class() && !rdn_32.id_break().id_class(rlc_3.E) ? ryZ_2.CONSUME : ryZ_2.PASS;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_volatile, rqd_32.id_class(xc_32.id_byte(id_volatile)));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        switch (xc_32.id_byte(id_volatile)) {
            case NORTH: {
                return id_synchronized;
            }
            case SOUTH: {
                return id_public;
            }
            case EAST: {
                return id_return;
            }
            case WEST: {
                return id_else;
            }
        }
        return id_continue;
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rcd_3 rcd_32;
        rYB rYB2 = rxx_32.id_int();
        rdn_3 rdn_32 = rxx_32.id_volatile();
        rcd_3 rcd_33 = rdn_32.id_package();
        rhd_3 rhd_32 = rxx_32.id_final();
        boolean bl = false;
        if (!rYB2.id_continue && rhd_32 != null && rcd_33 != null && rhd_32.sU() && rcd_33.id_throws("BlockEntityTag") && (rcd_32 = rcd_33.id_int("BlockEntityTag")).id_throws("Book")) {
            bl = true;
        }
        return (xc_3)((xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_case().id_case())).id_class(id_package, bl);
    }

    public static boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rdn_3 rdn_32) {
        if (!xc_32.id_byte(id_package).booleanValue()) {
            if (!rYB2.id_continue) {
                kv_3.id_break(rYB2, rfH_22, xc_32, rdn_32);
            }
            return true;
        }
        return false;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHR();
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package);
    }

    @Override
    public int id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return rpr_32 == rpr_3.UP && xc_32.id_byte(id_final) != false ? 15 : 0;
    }

    private static void id_break(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, bl), 3);
        kv_3.id_break(rYB2, rfH_22, xc_32);
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        ryO_2 ryO_22;
        if (xc_32.id_byte(id_package).booleanValue() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHR) {
            return ((rHR)ryO_22).id_finally();
        }
        return 0;
    }

    private static void id_break(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rdn_3 rdn_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHR) {
            rHR rHR2 = (rHR)ryO_22;
            rHR2.id_class(rdn_32.id_class(1));
            kv_3.id_class(rYB2, rfH_22, xc_32, true);
            rYB2.id_class((rhd_3)null, rfH_22, rqn_3.rs, rqL_2.BLOCKS, 1.0f, 1.0f);
        }
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return true;
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_this;
    }

    private static void id_break(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        rYB2.id_break(rfH_22.id_break(), xc_32.id_break());
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break())) {
            if (xc_32.id_byte(id_package).booleanValue()) {
                this.id_byte(xc_32, rYB2, rfH_22);
            }
            if (xc_32.id_byte(id_final).booleanValue()) {
                rYB2.id_break(rfH_22.id_break(), this);
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        kv_3.id_break((rYB)rrEm_12, rfH_22, xc_32, false);
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }
}

