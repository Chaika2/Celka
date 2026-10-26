/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.an_3;
import celestial.dB_2;
import celestial.iB_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rHI;
import celestial.rHt_1;
import celestial.rJr_1;
import celestial.rLT;
import celestial.rRq_1;
import celestial.rXn_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjN_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlB_2;
import celestial.rpB_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;

public class kS_2
extends dB_2 {
    public static final rCc_1 id_volatile = rCT.id_const;
    public static final rCN id_final = rCT.id_case;
    private static final rjC_2 id_package = xd_3.id_class(0.0, 10.0, 0.0, 16.0, 16.0, 16.0);
    private static final rjC_2 id_int = xd_3.id_class(4.0, 4.0, 4.0, 12.0, 10.0, 12.0);
    private static final rjC_2 id_new = rjw_3.id_class(id_int, id_package);
    private static final rjC_2 id_continue = rjw_3.id_class(id_new, rHI.id_class, rjN_2.id_throws);
    private static final rjC_2 id_super = rjw_3.id_class(id_continue, xd_3.id_class(6.0, 0.0, 6.0, 10.0, 4.0, 10.0));
    private static final rjC_2 id_this = rjw_3.id_class(id_continue, xd_3.id_class(12.0, 4.0, 6.0, 16.0, 8.0, 10.0));
    private static final rjC_2 id_else = rjw_3.id_class(id_continue, xd_3.id_class(6.0, 4.0, 0.0, 10.0, 8.0, 4.0));
    private static final rjC_2 id_synchronized = rjw_3.id_class(id_continue, xd_3.id_class(6.0, 4.0, 12.0, 10.0, 8.0, 16.0));
    private static final rjC_2 id_return = rjw_3.id_class(id_continue, xd_3.id_class(0.0, 4.0, 6.0, 4.0, 8.0, 10.0));
    private static final rjC_2 id_public = rHI.id_class;
    private static final rjC_2 id_goto = rjw_3.id_class(rHI.id_class, xd_3.id_class(12.0, 8.0, 6.0, 16.0, 10.0, 10.0));
    private static final rjC_2 id_while = rjw_3.id_class(rHI.id_class, xd_3.id_class(6.0, 8.0, 0.0, 10.0, 10.0, 4.0));
    private static final rjC_2 id_try = rjw_3.id_class(rHI.id_class, xd_3.id_class(6.0, 8.0, 12.0, 10.0, 10.0, 16.0));
    private static final rjC_2 id_instanceof = rjw_3.id_class(rHI.id_class, xd_3.id_class(0.0, 8.0, 6.0, 4.0, 10.0, 10.0));

    @Override
    public rjC_2 id_byte(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        switch (xc_32.id_byte(id_volatile)) {
            case DOWN: {
                return id_public;
            }
            case NORTH: {
                return id_while;
            }
            case SOUTH: {
                return id_try;
            }
            case WEST: {
                return id_instanceof;
            }
            case EAST: {
                return id_goto;
            }
        }
        return rHI.id_class;
    }

    public kS_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.DOWN)).id_class(id_final, true));
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
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        switch (xc_32.id_byte(id_volatile)) {
            case DOWN: {
                return id_super;
            }
            case NORTH: {
                return id_else;
            }
            case SOUTH: {
                return id_synchronized;
            }
            case WEST: {
                return id_return;
            }
            case EAST: {
                return id_this;
            }
        }
        return id_continue;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHt_1) {
            ((rHt_1)ryO_22).id_class(an_32);
        }
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
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (ryO_22 instanceof rHt_1) {
            rhd_32.id_class((rHt_1)ryO_22);
            rhd_32.id_break(rlB_2.M);
        }
        return ryZ_2.CONSUME;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_33.id_class(xc_32.id_break())) {
            this.id_class(rYB2, rfH_22, xc_32);
        }
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (rdn_32.id_this() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHt_1) {
            ((rHt_1)ryO_22).id_class(rdn_32.id_continue());
        }
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHt_1();
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3 rpr_32 = rxx_32.id_finally().id_case();
        return (xc_3)((xc_3)this.id_continue().id_class(id_volatile, rpr_32.id_final() == rpB_2.Y ? rpr_3.DOWN : rpr_32)).id_class(id_final, true);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        this.id_class(rYB2, rfH_22, xc_32);
    }

    private void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        boolean bl;
        boolean bl2 = bl = !rYB2.id_public(rfH_22);
        if (bl != xc_32.id_byte(id_final)) {
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_final, bl), 4);
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break())) {
            ryO_2 ryO_22 = rYB2.id_class(rfH_22);
            if (ryO_22 instanceof rHt_1) {
                rXn_1.id_class(rYB2, rfH_22, (rXu_1)((rHt_1)ryO_22));
                rYB2.id_byte(rfH_22, this);
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return rJr_1.id_class(rYB2.id_class(rfH_22));
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }
}

