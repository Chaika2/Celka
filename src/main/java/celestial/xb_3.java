/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
package celestial;

import celestial.Jq_1;
import celestial.Qs_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.kE_2;
import celestial.kx_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCp_1;
import celestial.rCu_1;
import celestial.rHJ;
import celestial.rLT;
import celestial.rRT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rRz_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfl_3;
import celestial.rfw_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rqI_2;
import celestial.rsq_3;
import celestial.rxL_2;
import celestial.rxx_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.ryk_3;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.List;
import java.util.Optional;
import org.apache.commons.lang3.ArrayUtils;

public class xb_3
extends kE_2
implements kx_3 {
    public static final rCu_1<rCp_1> id_volatile = rCT.t;
    public static final rCN id_final = rCT.id_this;
    protected static final rjC_2 id_package = xd_3.id_class(0.0, 3.0, 0.0, 16.0, 9.0, 16.0);
    protected static final rjC_2 id_int = xd_3.id_class(0.0, 0.0, 0.0, 3.0, 3.0, 3.0);
    protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 13.0, 3.0, 3.0, 16.0);
    protected static final rjC_2 id_continue = xd_3.id_class(13.0, 0.0, 0.0, 16.0, 3.0, 3.0);
    protected static final rjC_2 id_super = xd_3.id_class(13.0, 0.0, 13.0, 16.0, 3.0, 16.0);
    protected static final rjC_2 id_this = rjw_3.id_class(id_package, id_int, id_continue);
    protected static final rjC_2 id_else = rjw_3.id_class(id_package, id_new, id_super);
    protected static final rjC_2 id_synchronized = rjw_3.id_class(id_package, id_int, id_new);
    protected static final rjC_2 id_return = rjw_3.id_class(id_package, id_continue, id_super);
    private final rxL_2 id_public;

    public xb_3(rxL_2 rxL_22, Jq_1 jq_1) {
        super(jq_1);
        this.id_public = rxL_22;
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, rCp_1.FOOT)).id_class(id_final, false));
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.ENTITYBLOCK_ANIMATED;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(p, id_volatile, id_final);
    }

    @Override
    public ryO_2 id_class(rRq_1 rRq_12) {
        return new rHJ(this.id_public);
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, iB_2 iB_22, rdn_3 rdn_32) {
        super.id_class(rYB2, rfH_22, xc_32, iB_22, rdn_32);
        if (!rYB2.id_continue) {
            rfH_2 rfH_23 = rfH_22.id_break(xc_32.id_byte(p));
            rYB2.id_class(rfH_23, (xc_3)xc_32.id_class(id_volatile, rCp_1.HEAD), 3);
            rYB2.id_class(rfH_22, xu_3.id_class);
            xc_32.id_class((rRg_1)rYB2, rfH_22, 3);
        }
    }

    private static Optional<rjU_2> id_class(aI_2<?> aI_22, rRT rRT2, rfH_2 rfH_22, int[][] nArray, boolean bl) {
        rfw_3 rfw_32 = new rfw_3();
        for (int[] nArray2 : nArray) {
            rfw_32.id_class(rfH_22.b_() + nArray2[0], rfH_22.c_(), rfH_22.d_() + nArray2[1]);
            rjU_2 rjU_22 = rqI_2.id_class(aI_22, rRT2, rfw_32, bl);
            if (rjU_22 == null) continue;
            return Optional.of(rjU_22);
        }
        return Optional.empty();
    }

    private static Optional<rjU_2> id_class(aI_2<?> aI_22, rRT rRT2, rfH_2 rfH_22, rpr_3 rpr_32, rpr_3 rpr_33) {
        int[][] nArray = xb_3.id_break(rpr_32, rpr_33);
        Optional<rjU_2> optional = xb_3.id_class(aI_22, rRT2, rfH_22, nArray, true);
        if (optional.isPresent()) {
            return optional;
        }
        rfH_2 rfH_23 = rfH_22.id_break();
        Optional<rjU_2> optional2 = xb_3.id_class(aI_22, rRT2, rfH_23, nArray, true);
        if (optional2.isPresent()) {
            return optional2;
        }
        int[][] nArray2 = xb_3.id_class(rpr_32);
        Optional<rjU_2> optional3 = xb_3.id_class(aI_22, rRT2, rfH_22, nArray2, true);
        if (optional3.isPresent()) {
            return optional3;
        }
        Optional<rjU_2> optional4 = xb_3.id_class(aI_22, rRT2, rfH_22, nArray, false);
        if (optional4.isPresent()) {
            return optional4;
        }
        Optional<rjU_2> optional5 = xb_3.id_class(aI_22, rRT2, rfH_23, nArray, false);
        return optional5.isPresent() ? optional5 : xb_3.id_class(aI_22, rRT2, rfH_22, nArray2, false);
    }

    public static rpr_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        return xc_32.id_break() instanceof xb_3 ? xc_32.id_byte(p) : null;
    }

    public static Optional<rjU_2> id_class(aI_2<?> aI_22, rRT rRT2, rfH_2 rfH_22, float f) {
        rpr_3 rpr_32;
        rpr_3 rpr_33 = rRT2.id_byte(rfH_22).id_byte(p);
        rpr_3 rpr_34 = rpr_33.id_catch();
        rpr_3 rpr_35 = rpr_32 = rpr_34.id_class(f) ? rpr_34.id_case() : rpr_34;
        if (xb_3.id_break(rRT2, rfH_22)) {
            return xb_3.id_class(aI_22, rRT2, rfH_22, rpr_33, rpr_32);
        }
        int[][] nArray = xb_3.id_class(rpr_33, rpr_32);
        Optional<rjU_2> optional = xb_3.id_class(aI_22, rRT2, rfH_22, nArray, true);
        return optional.isPresent() ? optional : xb_3.id_class(aI_22, rRT2, rfH_22, nArray, false);
    }

    private static int[][] id_class(rpr_3 rpr_32) {
        return new int[][]{{0, 0}, {-rpr_32.id_implements(), -rpr_32.id_extends()}};
    }

    private static int[][] id_class(rpr_3 rpr_32, rpr_3 rpr_33) {
        return (int[][])ArrayUtils.addAll((Object[])xb_3.id_break(rpr_32, rpr_33), (Object[])xb_3.id_class(rpr_32));
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public long id_class(xc_3 xc_32, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_class(xc_32.id_byte(p), xc_32.id_byte(id_volatile) == rCp_1.HEAD ? 0 : 1);
        return rfU_2.id_byte(rfH_23.b_(), rfH_22.c_(), rfH_23.d_());
    }

    @Override
    public void id_class(rRq_1 rRq_12, an_3 an_32) {
        if (an_32.PR()) {
            super.id_class(rRq_12, an_32);
        } else {
            this.id_class(an_32);
        }
    }

    private void id_class(an_3 an_32) {
        rjU_2 rjU_22 = an_32.rv();
        if (rjU_22.id_byte < 0.0) {
            double d = an_32 instanceof iB_2 ? 1.0 : 0.8;
            an_32.id_catch(rjU_22.id_break, -rjU_22.id_byte * (double)0.66f * d, rjU_22.id_protected);
        }
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (rYB2.id_continue) {
            return ryZ_2.CONSUME;
        }
        if (xc_32.id_byte(id_volatile) != rCp_1.HEAD && !(xc_32 = rYB2.id_byte(rfH_22 = rfH_22.id_break(xc_32.id_byte(p)))).id_class(this)) {
            return ryZ_2.CONSUME;
        }
        if (!xb_3.id_class(rYB2)) {
            rYB2.id_class(rfH_22, false);
            rfH_2 rfH_23 = rfH_22.id_break(xc_32.id_byte(p).id_case());
            if (rYB2.id_byte(rfH_23).id_class(this)) {
                rYB2.id_class(rfH_23, false);
            }
            rYB2.id_class(null, rye_3.id_class(), null, (double)rfH_22.b_() + 0.5, (double)rfH_22.c_() + 0.5, (double)rfH_22.d_() + 0.5, 5.0f, true, rRz_1.DESTROY);
            return ryZ_2.SUCCESS;
        }
        if (xc_32.id_byte(id_final).booleanValue()) {
            if (!this.id_class(rYB2, rfH_22)) {
                rhd_32.id_class((rgP_2)new rgn_3("block.minecraft.bed.occupied"), true);
            }
            return ryZ_2.SUCCESS;
        }
        rhd_32.id_class(rfH_22).ifLeft(rhW_22 -> {
            if (rhW_22 != null) {
                rhd_32.id_class(rhW_22.id_class(), true);
            }
        });
        return ryZ_2.SUCCESS;
    }

    private static rpr_3 id_class(rCp_1 rCp_12, rpr_3 rpr_32) {
        return rCp_12 == rCp_1.FOOT ? rpr_32 : rpr_32.id_case();
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, an_3 an_32, float f) {
        super.id_class(rYB2, rfH_22, an_32, f * 0.5f);
    }

    private boolean id_class(rYB rYB2, rfH_2 rfH_22) {
        List<rsq_3> list = rYB2.id_class(rsq_3.class, new rfl_3(rfH_22), iB_2::Sc);
        if (list.isEmpty()) {
            return false;
        }
        list.get(0).SQ();
        return true;
    }

    public static boolean id_class(rYB rYB2) {
        return rYB2.id_default().id_private();
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rpr_3 rpr_32 = xb_3.id_private(xc_32).id_case();
        switch (rpr_32) {
            case NORTH: {
                return id_this;
            }
            case SOUTH: {
                return id_else;
            }
            case WEST: {
                return id_synchronized;
            }
        }
        return id_return;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (rpr_32 == xb_3.id_class(xc_32.id_byte(id_volatile), xc_32.id_byte(p))) {
            return xc_33.id_class(this) && xc_33.id_byte(id_volatile) != xc_32.id_byte(id_volatile) ? (xc_3)xc_32.id_class(id_final, xc_33.id_byte(id_final)) : xu_3.id_class.id_continue();
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rpr_3 rpr_32 = rxx_32.id_case();
        rfH_2 rfH_22 = rxx_32.id_class();
        rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
        return rxx_32.id_int().id_byte(rfH_23).id_class(rxx_32) ? (xc_3)this.id_continue().id_class(p, rpr_32) : null;
    }

    @Override
    public void id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32, rhd_3 rhd_32) {
        rfH_2 rfH_23;
        xc_3 xc_33;
        rCp_1 rCp_12;
        if (!rYB2.id_continue && rhd_32.id_implements() && (rCp_12 = xc_32.id_byte(id_volatile)) == rCp_1.FOOT && (xc_33 = rYB2.id_byte(rfH_23 = rfH_22.id_break(xb_3.id_class(rCp_12, xc_32.id_byte(p))))).id_break() == this && xc_33.id_byte(id_volatile) == rCp_1.HEAD) {
            rYB2.id_class(rfH_23, xu_3.id_class.id_continue(), 35);
            rYB2.id_class(rhd_32, 2001, rfH_23, xd_3.id_finally(xc_33));
        }
        super.id_class(rYB2, rfH_22, xc_32, rhd_32);
    }

    private static boolean id_break(rRq_1 rRq_12, rfH_2 rfH_22) {
        return rRq_12.id_byte(rfH_22.id_break()).id_break() instanceof xb_3;
    }

    private static int[][] id_break(rpr_3 rpr_32, rpr_3 rpr_33) {
        return new int[][]{{rpr_33.id_implements(), rpr_33.id_extends()}, {rpr_33.id_implements() - rpr_32.id_implements(), rpr_33.id_extends() - rpr_32.id_extends()}, {rpr_33.id_implements() - rpr_32.id_implements() * 2, rpr_33.id_extends() - rpr_32.id_extends() * 2}, {-rpr_32.id_implements() * 2, -rpr_32.id_extends() * 2}, {-rpr_33.id_implements() - rpr_32.id_implements() * 2, -rpr_33.id_extends() - rpr_32.id_extends() * 2}, {-rpr_33.id_implements() - rpr_32.id_implements(), -rpr_33.id_extends() - rpr_32.id_extends()}, {-rpr_33.id_implements(), -rpr_33.id_extends()}, {-rpr_33.id_implements() + rpr_32.id_implements(), -rpr_33.id_extends() + rpr_32.id_extends()}, {rpr_32.id_implements(), rpr_32.id_extends()}, {rpr_33.id_implements() + rpr_32.id_implements(), rpr_33.id_extends() + rpr_32.id_extends()}};
    }

    public rxL_2 id_break() {
        return this.id_public;
    }

    public static ryk_3 id_implements(xc_3 xc_32) {
        rCp_1 rCp_12 = xc_32.id_byte(id_volatile);
        return rCp_12 == rCp_1.HEAD ? ryk_3.FIRST : ryk_3.SECOND;
    }

    @Override
    public Qs_1 id_protected(xc_3 xc_32) {
        return Qs_1.DESTROY;
    }

    public static rpr_3 id_private(xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(p);
        return xc_32.id_byte(id_volatile) == rCp_1.HEAD ? rpr_32.id_case() : rpr_32;
    }
}

