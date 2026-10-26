/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rls_3;
import celestial.rpB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;

public class dq_3
extends kE_2 {
    public static final rCN id_volatile = rCT.id_else;
    public static final rCN id_final = rCT.id_return;
    public static final rCN id_package = rCT.id_new;
    protected static final rjC_2 id_int = xd_3.id_class(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
    protected static final rjC_2 id_new = xd_3.id_class(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
    protected static final rjC_2 id_continue = xd_3.id_class(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
    protected static final rjC_2 id_super = xd_3.id_class(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
    protected static final rjC_2 id_this = xd_3.id_class(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
    protected static final rjC_2 id_else = xd_3.id_class(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
    protected static final rjC_2 id_synchronized = rjw_3.id_class(xd_3.id_class(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), xd_3.id_class(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
    protected static final rjC_2 id_return = rjw_3.id_class(xd_3.id_class(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), xd_3.id_class(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
    protected static final rjC_2 id_public = rjw_3.id_class(xd_3.id_class(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), xd_3.id_class(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
    protected static final rjC_2 id_goto = rjw_3.id_class(xd_3.id_class(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), xd_3.id_class(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));

    public dq_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, false)).id_class(id_final, false)).id_class(id_package, false));
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rYB rYB2 = rxx_32.id_int();
        rfH_2 rfH_22 = rxx_32.id_class();
        boolean bl = rYB2.id_public(rfH_22);
        rpr_3 rpr_32 = rxx_32.id_case();
        rpB_2 rpB_22 = rpr_32.id_final();
        boolean bl2 = rpB_22 == rpB_2.Z && (this.id_private(rYB2.id_byte(rfH_22.id_byte())) || this.id_private(rYB2.id_byte(rfH_22.id_extends()))) || rpB_22 == rpB_2.X && (this.id_private(rYB2.id_byte(rfH_22.id_private())) || this.id_private(rYB2.id_byte(rfH_22.id_protected())));
        return (xc_3)((xc_3)((xc_3)((xc_3)this.id_continue().id_class(p, rpr_32)).id_class(id_volatile, bl)).id_class(id_final, bl)).id_class(id_package, bl2);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            xc_32 = (xc_3)xc_32.id_class(id_volatile, false);
            rYB2.id_class(rfH_22, xc_32, 10);
        } else {
            rpr_3 rpr_32 = rhd_32.Pg();
            if (xc_32.id_byte(p) == rpr_32.id_case()) {
                xc_32 = (xc_3)xc_32.id_class(p, rpr_32);
            }
            xc_32 = (xc_3)xc_32.id_class(id_volatile, true);
            rYB2.id_class(rfH_22, xc_32, 10);
        }
        rYB2.id_class(rhd_32, xc_32.id_byte(id_volatile) != false ? 1008 : 1014, rfH_22, 0);
        return ryZ_2.id_class(rYB2.id_continue);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (!rYB2.id_continue) {
            boolean bl2 = rYB2.id_public(rfH_22);
            if (xc_32.id_byte(id_final) != bl2) {
                rYB2.id_class(rfH_22, (xc_3)((xc_3)xc_32.id_class(id_final, bl2)).id_class(id_volatile, bl2), 2);
                if (xc_32.id_byte(id_volatile) != bl2) {
                    rYB2.id_class((rhd_3)null, bl2 ? 1008 : 1014, rfH_22, 0);
                }
            }
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(p, id_volatile, id_final, id_package);
    }

    public static boolean id_class(xc_3 xc_32, rpr_3 rpr_32) {
        return xc_32.id_byte(p).id_final() == rpr_32.id_catch().id_final();
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        rpB_2 rpB_22 = rpr_32.id_final();
        if (xc_32.id_byte(p).id_catch().id_final() != rpB_22) {
            return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
        }
        boolean bl = this.id_private(xc_33) || this.id_private(rRg_12.id_byte(rfH_22.id_break(rpr_32.id_case())));
        return (xc_3)xc_32.id_class(id_package, bl);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        if (xc_32.id_byte(id_package).booleanValue()) {
            return xc_32.id_byte(p).id_final() == rpB_2.X ? id_goto : id_public;
        }
        return xc_32.id_byte(p).id_final() == rpB_2.X ? id_return : id_synchronized;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        switch (rLT2) {
            case LAND: {
                return xc_32.id_byte(id_volatile);
            }
            case WATER: {
                return false;
            }
            case AIR: {
                return xc_32.id_byte(id_volatile);
            }
        }
        return false;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        if (xc_32.id_byte(id_package).booleanValue()) {
            return xc_32.id_byte(p).id_final() == rpB_2.X ? id_super : id_continue;
        }
        return xc_32.id_byte(p).id_final() == rpB_2.X ? id_new : id_int;
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        if (xc_32.id_byte(id_volatile).booleanValue()) {
            return rjw_3.id_class();
        }
        return xc_32.id_byte(p).id_final() == rpB_2.Z ? id_this : id_else;
    }

    private boolean id_private(xc_3 xc_32) {
        return xc_32.id_break().id_class(rls_3.id_abstract);
    }
}

