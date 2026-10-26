/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.floats.Float2FloatFunction
 */
package celestial;

import celestial.JI;
import celestial.Jq_1;
import celestial.iB_2;
import celestial.kE_2;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCc_1;
import celestial.rCi_1;
import celestial.rCt_1;
import celestial.rCu_1;
import celestial.rHu_1;
import celestial.rHw_1;
import celestial.rJZ;
import celestial.rJr_1;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXn_1;
import celestial.rXu_1;
import celestial.rYB;
import celestial.rbW_2;
import celestial.rbf_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rlB_2;
import celestial.rpa_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqO_2;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.ryJ_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.ryX_2;
import celestial.ryZ_2;
import celestial.ryh_3;
import celestial.ryk_3;
import celestial.xI_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xj_3;
import celestial.xw_3;
import it.unimi.dsi.fastutil.floats.Float2FloatFunction;
import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;
import java.util.function.Supplier;

public class xt_3
extends JI<rHu_1>
implements kd_3 {
    public static final rCc_1 id_final = kE_2.p;
    public static final rCu_1<rCt_1> id_package = rCT.w;
    public static final rCN id_int = rCT.id_throw;
    protected static final rjC_2 id_new = xd_3.id_class(1.0, 0.0, 0.0, 15.0, 14.0, 15.0);
    protected static final rjC_2 id_continue = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 14.0, 16.0);
    protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 1.0, 15.0, 14.0, 15.0);
    protected static final rjC_2 id_this = xd_3.id_class(1.0, 0.0, 1.0, 16.0, 14.0, 15.0);
    protected static final rjC_2 id_else = xd_3.id_class(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
    private static final ryX_2<rHu_1, Optional<rXu_1>> id_synchronized = new xw_3();
    private static final ryX_2<rHu_1, Optional<rJZ>> id_return = new xI_2();

    protected xt_3(Jq_1 jq_1, Supplier<ryW_2<? extends rHu_1>> supplier) {
        super(jq_1, supplier);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_final, rpr_3.NORTH)).id_class(id_package, rCt_1.SINGLE)).id_class(id_int, false));
    }

    private static boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_final();
        return rRq_12.id_byte(rfH_23).id_catch(rRq_12, rfH_23);
    }

    public static boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        return xt_3.id_class((rRq_1)rRg_12, rfH_22) || xt_3.id_break(rRg_12, rfH_22);
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHu_1();
    }

    public static ryX_2<rHu_1, Float2FloatFunction> id_class(rHw_1 rHw_12) {
        return new xj_3(rHw_12);
    }

    @Override
    public rJZ id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return this.id_class(xc_32, rYB2, rfH_22, false).apply(id_return).orElse(null);
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.ENTITYBLOCK_ANIMATED;
    }

    @Override
    public ryJ_2<? extends rHu_1> id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_23, boolean bl) {
        BiPredicate<rRg_1, rfH_2> biPredicate = bl ? (rRg_12, rfH_22) -> false : xt_3::id_class;
        return ryh_3.id_class((ryW_2)this.id_volatile.get(), xt_3::id_private, xt_3::id_implements, id_final, xc_32, rYB2, rfH_23, biPredicate);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_final, id_package, id_int);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xc_32.id_class(rpa_32.id_class(xc_32.id_byte(id_final)));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return (xc_3)xc_32.id_class(id_final, rqd_32.id_class(xc_32.id_byte(id_final)));
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        ryO_2 ryO_22;
        if (rdn_32.id_this() && (ryO_22 = rYB2.id_class(rfH_22)) instanceof rHu_1) {
            ((rHu_1)ryO_22).id_class(rdn_32.id_continue());
        }
    }

    private rpr_3 id_class(rxx_3 rxx_32, rpr_3 rpr_32) {
        xc_3 xc_32 = rxx_32.id_int().id_byte(rxx_32.id_class().id_break(rpr_32));
        return xc_32.id_class(this) && xc_32.id_byte(id_package) == rCt_1.SINGLE ? xc_32.id_byte(id_final) : null;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_int).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        if (xc_33.id_class(this) && rpr_32.id_final().id_protected()) {
            rCt_1 rCt_12 = xc_33.id_byte(id_package);
            if (xc_32.id_byte(id_package) == rCt_1.SINGLE && rCt_12 != rCt_1.SINGLE && xc_32.id_byte(id_final) == xc_33.id_byte(id_final) && xt_3.id_implements(xc_33) == rpr_32.id_case()) {
                return (xc_3)xc_32.id_class(id_package, rCt_12.id_break());
            }
        } else if (xt_3.id_implements(xc_32) == rpr_32) {
            return (xc_3)xc_32.id_class(id_package, rCt_1.SINGLE);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3 rpr_32;
        rCt_1 rCt_12 = rCt_1.SINGLE;
        rpr_3 rpr_33 = rxx_32.id_case().id_case();
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        boolean bl = rxx_32.id_catch();
        rpr_3 rpr_34 = rxx_32.id_finally();
        if (rpr_34.id_final().id_protected() && bl && (rpr_32 = this.id_class(rxx_32, rpr_34.id_case())) != null && rpr_32.id_final() != rpr_34.id_final()) {
            rpr_33 = rpr_32;
            rCt_1 rCt_13 = rCt_12 = rpr_32.id_private() == rpr_34.id_case() ? rCt_1.RIGHT : rCt_1.LEFT;
        }
        if (rCt_12 == rCt_1.SINGLE && !bl) {
            if (rpr_33 == this.id_class(rxx_32, rpr_33.id_catch())) {
                rCt_12 = rCt_1.LEFT;
            } else if (rpr_33 == this.id_class(rxx_32, rpr_33.id_private())) {
                rCt_12 = rCt_1.RIGHT;
            }
        }
        return (xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_final, rpr_33)).id_class(id_package, rCt_12)).id_class(id_int, rXE2.id_class() == rXG.id_byte);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        if (xc_32.id_byte(id_package) == rCt_1.SINGLE) {
            return id_else;
        }
        switch (xt_3.id_implements(xc_32)) {
            default: {
                return id_new;
            }
            case SOUTH: {
                return id_continue;
            }
            case WEST: {
                return id_super;
            }
            case EAST: 
        }
        return id_this;
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.SUCCESS;
        }
        rJZ rJZ2 = this.id_class(xc_32, rYB2, rfH_22);
        if (rJZ2 != null) {
            rhd_32.id_class(rJZ2);
            rhd_32.id_class(this.id_break());
            rbW_2.id_class(rhd_32, true);
        }
        return ryZ_2.CONSUME;
    }

    public static rXu_1 id_class(xt_3 xt_32, xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, boolean bl) {
        return xt_32.id_class(xc_32, rYB2, rfH_22, bl).apply(id_synchronized).orElse(null);
    }

    protected rCi_1<rqO_2> id_break() {
        return rlB_2.id_implements.id_break(rlB_2.N);
    }

    @Override
    public int id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22) {
        return rJr_1.id_break(xt_3.id_class(this, xc_32, rYB2, rfH_22, false));
    }

    @Override
    public void id_break(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (!xc_32.id_class(xc_33.id_break())) {
            ryO_2 ryO_22 = rYB2.id_class(rfH_22);
            if (ryO_22 instanceof rXu_1) {
                rXn_1.id_class(rYB2, rfH_22, (rXu_1)((Object)ryO_22));
                rYB2.id_byte(rfH_22, this);
            }
            super.id_break(xc_32, rYB2, rfH_22, xc_33, bl);
        }
    }

    private static boolean id_break(rRg_1 rRg_12, rfH_2 rfH_22) {
        List<rbf_3> list = rRg_12.id_class(rbf_3.class, new rfl_3(rfH_22.b_(), rfH_22.c_() + 1, rfH_22.d_(), rfH_22.b_() + 1, rfH_22.c_() + 2, rfH_22.d_() + 1));
        if (!list.isEmpty()) {
            for (rbf_3 rbf_32 : list) {
                if (!rbf_32.Sc()) continue;
                return true;
            }
        }
        return false;
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_int) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }

    @Override
    public boolean id_case(xc_3 xc_32) {
        return true;
    }

    public static rpr_3 id_implements(xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(id_final);
        return xc_32.id_byte(id_package) == rCt_1.LEFT ? rpr_32.id_catch() : rpr_32.id_private();
    }

    public static ryk_3 id_private(xc_3 xc_32) {
        rCt_1 rCt_12 = xc_32.id_byte(id_package);
        if (rCt_12 == rCt_1.SINGLE) {
            return ryk_3.SINGLE;
        }
        return rCt_12 == rCt_1.RIGHT ? ryk_3.FIRST : ryk_3.SECOND;
    }
}

