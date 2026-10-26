/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Qs_1;
import celestial.an_3;
import celestial.dB_2;
import celestial.kE_2;
import celestial.kG_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rCq_1;
import celestial.rCu_1;
import celestial.rHW;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhf_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlB_2;
import celestial.rpB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class xX_2
extends dB_2 {
    public static final rCc_1 id_volatile = kE_2.p;
    public static final rCu_1<rCq_1> id_final = rCT.id_for;
    public static final rCN id_package = rCT.id_return;
    private static final rjC_2 id_int = xd_3.id_class(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
    private static final rjC_2 id_new = xd_3.id_class(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
    private static final rjC_2 id_continue = xd_3.id_class(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
    private static final rjC_2 id_super = xd_3.id_class(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
    private static final rjC_2 id_this = rjw_3.id_class(id_super, id_continue);
    private static final rjC_2 id_else = rjw_3.id_class(id_this, xd_3.id_class(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
    private static final rjC_2 id_synchronized = rjw_3.id_class(id_this, xd_3.id_class(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
    private static final rjC_2 id_return = rjw_3.id_class(id_this, xd_3.id_class(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
    private static final rjC_2 id_public = rjw_3.id_class(id_this, xd_3.id_class(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
    private static final rjC_2 id_goto = rjw_3.id_class(id_this, xd_3.id_class(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
    private static final rjC_2 id_while = rjw_3.id_class(id_this, xd_3.id_class(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
    private static final rjC_2 id_try = rjw_3.id_class(id_this, xd_3.id_class(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));

    public xX_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rpr_3.NORTH)).id_class(id_final, rCq_1.FLOOR)).id_class(id_package, false));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rpr_3 rpr_32 = xX_2.id_implements(xc_32).id_case();
        return rpr_32 == rpr_3.UP ? xd_3.id_class(rRR2, rfH_22.id_final(), rpr_3.DOWN) : kG_2.id_break(rRR2, rfH_22, rpr_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        rCq_1 rCq_12 = xc_32.id_byte(id_final);
        rpr_3 rpr_33 = xX_2.id_implements(xc_32).id_case();
        if (rpr_33 == rpr_32 && !xc_32.id_class(rRg_12, rfH_22) && rCq_12 != rCq_1.DOUBLE_WALL) {
            return xu_3.id_class.id_continue();
        }
        if (rpr_32.id_final() == xc_32.id_byte(id_volatile).id_final()) {
            if (rCq_12 == rCq_1.DOUBLE_WALL && !xc_33.id_protected(rRg_12, rfH_23, rpr_32)) {
                return (xc_3)((xc_3)xc_32.id_class(id_final, rCq_1.SINGLE_WALL)).id_class(id_volatile, rpr_32.id_case());
            }
            if (rCq_12 == rCq_1.SINGLE_WALL && rpr_33.id_case() == rpr_32 && xc_33.id_protected(rRg_12, rfH_23, xc_32.id_byte(id_volatile))) {
                return (xc_3)xc_32.id_class(id_final, rCq_1.DOUBLE_WALL);
            }
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3 rpr_32 = rxx_32.id_finally();
        rfH_2 rfH_22 = rxx_32.id_class();
        rYB rYB2 = rxx_32.id_int();
        rpB_2 rpB_22 = rpr_32.id_final();
        if (rpB_22 == rpB_2.Y) {
            xc_3 xc_32 = (xc_3)((xc_3)this.id_continue().id_class(id_final, rpr_32 == rpr_3.DOWN ? rCq_1.CEILING : rCq_1.FLOOR)).id_class(id_volatile, rxx_32.id_case());
            if (xc_32.id_class((rRR)rxx_32.id_int(), rfH_22)) {
                return xc_32;
            }
        } else {
            boolean bl = rpB_22 == rpB_2.X && rYB2.id_byte(rfH_22.id_byte()).id_protected(rYB2, rfH_22.id_byte(), rpr_3.EAST) && rYB2.id_byte(rfH_22.id_extends()).id_protected(rYB2, rfH_22.id_extends(), rpr_3.WEST) || rpB_22 == rpB_2.Z && rYB2.id_byte(rfH_22.id_private()).id_protected(rYB2, rfH_22.id_private(), rpr_3.SOUTH) && rYB2.id_byte(rfH_22.id_protected()).id_protected(rYB2, rfH_22.id_protected(), rpr_3.NORTH);
            xc_3 xc_33 = (xc_3)((xc_3)this.id_continue().id_class(id_volatile, rpr_32.id_case())).id_class(id_final, bl ? rCq_1.DOUBLE_WALL : rCq_1.SINGLE_WALL);
            if (xc_33.id_class((rRR)rxx_32.id_int(), rxx_32.id_class())) {
                return xc_33;
            }
            boolean bl2 = rYB2.id_byte(rfH_22.id_break()).id_protected(rYB2, rfH_22.id_break(), rpr_3.UP);
            if ((xc_33 = (xc_3)xc_33.id_class(id_final, bl2 ? rCq_1.FLOOR : rCq_1.CEILING)).id_class((rRR)rxx_32.id_int(), rxx_32.id_class())) {
                return xc_33;
            }
        }
        return null;
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        boolean bl2 = rYB2.id_public(rfH_22);
        if (bl2 != xc_32.id_byte(id_package)) {
            if (bl2) {
                this.id_class(rYB2, rfH_22, (rpr_3)null);
            }
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_package, bl2), 3);
        }
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.MODEL;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHW();
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final, id_package);
    }

    @Override
    public void id_class(rYB rYB2, xc_3 xc_32, rff_3 rff_32, rhf_3 rhf_32) {
        an_3 an_32 = rhf_32.id_else();
        rhd_3 rhd_32 = an_32 instanceof rhd_3 ? (rhd_3)an_32 : null;
        this.id_class(rYB2, xc_32, rff_32, rhd_32, true);
    }

    private boolean id_class(xc_3 xc_32, rpr_3 rpr_32, double d) {
        if (rpr_32.id_final() != rpB_2.Y && !(d > (double)0.8124f)) {
            rpr_3 rpr_33 = xc_32.id_byte(id_volatile);
            rCq_1 rCq_12 = xc_32.id_byte(id_final);
            switch (rCq_12) {
                case FLOOR: {
                    return rpr_33.id_final() == rpr_32.id_final();
                }
                case SINGLE_WALL: 
                case DOUBLE_WALL: {
                    return rpr_33.id_final() != rpr_32.id_final();
                }
                case CEILING: {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public boolean id_class(rYB rYB2, xc_3 xc_32, rff_3 rff_32, rhd_3 rhd_32, boolean bl) {
        boolean bl2;
        rpr_3 rpr_32 = rff_32.id_break();
        rfH_2 rfH_22 = rff_32.id_class();
        boolean bl3 = bl2 = !bl || this.id_class(xc_32, rpr_32, rff_32.id_case().id_byte - (double)rfH_22.c_());
        if (bl2) {
            boolean bl4 = this.id_class(rYB2, rfH_22, rpr_32);
            if (bl4 && rhd_32 != null) {
                rhd_32.id_break(rlB_2.l);
            }
            return true;
        }
        return false;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        return this.id_class(rYB2, xc_32, rff_32, rhd_32, true) ? ryZ_2.id_class(rYB2.id_continue) : ryZ_2.PASS;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_private(xc_32);
    }

    public boolean id_class(rYB rYB2, rfH_2 rfH_22, rpr_3 rpr_32) {
        ryO_2 ryO_22 = rYB2.id_class(rfH_22);
        if (!rYB2.id_continue && ryO_22 instanceof rHW) {
            if (rpr_32 == null) {
                rpr_32 = rYB2.id_byte(rfH_22).id_byte(id_volatile);
            }
            ((rHW)ryO_22).id_class(rpr_32);
            rYB2.id_class((rhd_3)null, rfH_22, rqn_3.V, rqL_2.BLOCKS, 2.0f, 1.0f);
            return true;
        }
        return false;
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return this.id_private(xc_32);
    }

    private static rpr_3 id_implements(xc_3 xc_32) {
        switch (xc_32.id_byte(id_final)) {
            case FLOOR: {
                return rpr_3.UP;
            }
            case CEILING: {
                return rpr_3.DOWN;
            }
        }
        return xc_32.id_byte(id_volatile).id_case();
    }

    @Override
    public Qs_1 id_protected(xc_3 xc_32) {
        return Qs_1.DESTROY;
    }

    private rjC_2 id_private(xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(id_volatile);
        rCq_1 rCq_12 = xc_32.id_byte(id_final);
        if (rCq_12 == rCq_1.FLOOR) {
            return rpr_32 != rpr_3.NORTH && rpr_32 != rpr_3.SOUTH ? id_new : id_int;
        }
        if (rCq_12 == rCq_1.CEILING) {
            return id_try;
        }
        if (rCq_12 == rCq_1.DOUBLE_WALL) {
            return rpr_32 != rpr_3.NORTH && rpr_32 != rpr_3.SOUTH ? id_synchronized : id_else;
        }
        if (rpr_32 == rpr_3.NORTH) {
            return id_goto;
        }
        if (rpr_32 == rpr_3.SOUTH) {
            return id_while;
        }
        return rpr_32 == rpr_3.EAST ? id_public : id_return;
    }
}

