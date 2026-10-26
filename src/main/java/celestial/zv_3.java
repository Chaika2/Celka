/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QP;
import celestial.kE_2;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCj_1;
import celestial.rCu_1;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;

public class zv_3
extends kE_2
implements kd_3 {
    public static final rCN id_volatile = rCT.id_else;
    public static final rCu_1<rCj_1> id_final = rCT.b;
    public static final rCN id_package = rCT.id_return;
    public static final rCN id_int = rCT.id_throw;
    protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
    protected static final rjC_2 id_continue = xd_3.id_class(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_super = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
    protected static final rjC_2 id_this = xd_3.id_class(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);
    protected static final rjC_2 id_else = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 3.0, 16.0);
    protected static final rjC_2 id_synchronized = xd_3.id_class(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);

    protected zv_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(p, rpr_3.NORTH)).id_class(id_volatile, false)).id_class(id_final, rCj_1.BOTTOM)).id_class(id_package, false)).id_class(id_int, false));
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = this.id_continue();
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        rpr_3 rpr_32 = rxx_32.id_finally();
        xc_32 = !rxx_32.id_byte() && rpr_32.id_final().id_protected() ? (xc_3)((xc_3)xc_32.id_class(p, rpr_32)).id_class(id_final, rxx_32.id_extends().id_byte - (double)rxx_32.id_class().c_() > 0.5 ? rCj_1.TOP : rCj_1.BOTTOM) : (xc_3)((xc_3)xc_32.id_class(p, rxx_32.id_case().id_case())).id_class(id_final, rpr_32 == rpr_3.UP ? rCj_1.BOTTOM : rCj_1.TOP);
        if (rxx_32.id_int().id_public(rxx_32.id_class())) {
            xc_32 = (xc_3)((xc_3)xc_32.id_class(id_volatile, true)).id_class(id_package, true);
        }
        return (xc_3)xc_32.id_class(id_int, rXE2.id_class() == rXG.id_byte);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(p, id_volatile, id_final, id_package, id_int);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_byte(id_int).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        boolean bl2;
        if (!rYB2.id_continue && (bl2 = rYB2.id_public(rfH_22)) != xc_32.id_byte(id_package)) {
            if (xc_32.id_byte(id_volatile) != bl2) {
                xc_32 = (xc_3)xc_32.id_class(id_volatile, bl2);
                this.id_class((rhd_3)null, rYB2, rfH_22, bl2);
            }
            rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_package, bl2), 2);
            if (xc_32.id_byte(id_int).booleanValue()) {
                rYB2.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rYB2));
            }
        }
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (this.id_break == QP.id_static) {
            return ryZ_2.PASS;
        }
        xc_32 = (xc_3)xc_32.id_class(id_volatile);
        rYB2.id_class(rfH_22, xc_32, 2);
        if (xc_32.id_byte(id_int).booleanValue()) {
            rYB2.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rYB2));
        }
        this.id_class(rhd_32, rYB2, rfH_22, xc_32.id_byte(id_volatile));
        return ryZ_2.id_class(rYB2.id_continue);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        switch (rLT2) {
            case LAND: {
                return xc_32.id_byte(id_volatile);
            }
            case WATER: {
                return xc_32.id_byte(id_int);
            }
            case AIR: {
                return xc_32.id_byte(id_volatile);
            }
        }
        return false;
    }

    protected void id_class(rhd_3 rhd_32, rYB rYB2, rfH_2 rfH_22, boolean bl) {
        if (bl) {
            int n = this.id_break == QP.id_static ? 1037 : 1007;
            rYB2.id_class(rhd_32, n, rfH_22, 0);
        } else {
            int n = this.id_break == QP.id_static ? 1036 : 1013;
            rYB2.id_class(rhd_32, n, rfH_22, 0);
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        if (!xc_32.id_byte(id_volatile).booleanValue()) {
            return xc_32.id_byte(id_final) == rCj_1.TOP ? id_synchronized : id_else;
        }
        switch (xc_32.id_byte(p)) {
            default: {
                return id_this;
            }
            case SOUTH: {
                return id_super;
            }
            case WEST: {
                return id_continue;
            }
            case EAST: 
        }
        return id_new;
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_int) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }
}

